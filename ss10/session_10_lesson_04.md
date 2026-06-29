# Session 10: Kỹ năng Prompt để phân tích, xây dựng SRS dự án

## Lesson 04: Thực hành viết Prompt trong Antigravity

## 1. Mục tiêu học tập
Sau khi hoàn thành bài học này, bạn sẽ có khả năng:
* Áp dụng cấu trúc Prompt chuẩn kỹ sư (Context - Objective - Constraints) vào thực tế sinh mã nguồn.
* Sử dụng thành thạo các kỹ thuật Prompting nâng cao như Zero-shot, Few-shot và Chain of Thought (CoT).
* Thiết kế quy trình Prompting tuần tự để chia nhỏ bài toán phức tạp thành các module code đồng bộ (DTO, Service, Controller).

---

## 2. Đặt vấn đề thực tế
Trong một buổi sáng đầu tuần, đội ngũ phát triển sản phẩm của công ty đối mặt với một thách thức gấp rút. Một khách hàng quan trọng yêu cầu bổ sung nhanh chóng một tính năng mới vào ứng dụng quản lý kho của họ: tạo báo cáo tồn kho tự động. 

Trưởng nhóm muốn sử dụng AI để tăng tốc quá trình này, nhưng sau vài lần thử, kết quả nhận được từ AI lại không như mong đợi. Code AI sinh ra không khớp với kiến trúc hiện có của dự án Spring Boot, định dạng báo cáo bị lỗi hoặc thiếu các logic nghiệp vụ quan trọng. Cả nhóm loay hoay không biết làm thế nào để giao tiếp với AI hiệu quả.

---

## 3. Kiến thức cốt lõi

### Cấu trúc Prompt chuẩn kỹ sư
Để AI sinh code chính xác và khớp với dự án, Prompt cần có 3 thành phần cốt lõi:
* **Ngữ cảnh (Context):** Định nghĩa vai trò của AI (ví dụ: Spring Boot Senior Developer), mô tả tổng quan hệ thống và chỉ định các file tham chiếu liên quan.
* **Mục tiêu (Objective):** Mô tả rõ ràng sản phẩm đầu ra mong muốn (ví dụ: Tạo một JPA Repository, một hàm kiểm thử, v.v.).
* **Ràng buộc & Định dạng (Constraints & Format):** Đưa ra các quy tắc cụ thể như package name, quy tắc đặt tên biến, thư viện sử dụng (như Lombok), xử lý ngoại lệ và yêu cầu Clean Code.

### Các kỹ thuật Prompting nâng cao
* **Zero-shot Prompting:** Yêu cầu AI thực hiện tác vụ trực tiếp mà không cung cấp ví dụ mẫu. Phù hợp cho các tác vụ tiêu chuẩn.
* **Few-shot Prompting:** Cung cấp cho AI một vài ví dụ mẫu (code mẫu có sẵn trong dự án) để AI bắt chước đúng phong cách viết code.
* **Chain of Thought (CoT):** Hướng dẫn AI tư duy và giải quyết bài toán theo từng bước logic tuần tự thay vì sinh toàn bộ hệ thống cùng một lúc.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Doanh nghiệp cần xây dựng API xuất báo cáo các sản phẩm có lượng tồn kho dưới một ngưỡng (threshold) cho trước.

### Thách thức
Nếu viết prompt chung chung: *"Hãy viết code báo cáo tồn kho cho tôi"*, AI sẽ sinh code mơ hồ, thiếu các lớp DTO, không inject Repository đúng cách, hoặc sử dụng các cấu trúc dữ liệu không tương thích với dự án Spring Boot hiện tại.

### Giải pháp
Áp dụng Chain of Thought để chia nhỏ quy trình phát triển thành 3 bước Prompting tuần tự:
1. **Bước 1:** Viết Prompt sinh lớp DTO đại diện cho một dòng báo cáo.
2. **Bước 2:** Viết Prompt sinh lớp Service xử lý nghiệp vụ lọc sản phẩm và ánh xạ sang DTO.
3. **Bước 3:** Viết Prompt sinh lớp Controller expose REST API cho client gọi.

---

## 5. Demo minh họa

### Mục tiêu demo
Thực hành viết Prompt có cấu trúc và áp dụng Chain of Thought để sinh mã nguồn Spring Boot cho tính năng báo cáo tồn kho.

### Các tệp tham chiếu hiện có trong dự án

**1. Thực thể `Product.java`:**
```java
package com.antigravity.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
}
```

**2. Giao diện `ProductRepository.java`:**
```java
package com.antigravity.ecommerce.repository;

import com.antigravity.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByStockQuantityLessThan(Integer stockQuantity);
}
```

---

### Quy trình Prompting tuần tự (Chain of Thought)

#### Bước 1: Prompt sinh lớp DTO (Zero-shot)
Lập trình viên gửi prompt sau vào Chat Panel:
```text
Context: Bạn là một lập trình viên Spring Boot cấp cao. Tôi đang phát triển một ứng dụng eCommerce có thực thể Product như sau:
[Dán code file Product.java]

Objective: Tạo một Data Transfer Object (DTO) có tên InventoryReportItem để đại diện cho một mục trong báo cáo tồn kho. DTO này sẽ chứa tên sản phẩm, giá, và số lượng tồn kho.

Constraints:
- Tên class: InventoryReportItem.
- Package: com.antigravity.ecommerce.dto.
- Sử dụng Lombok cho getter/setter/constructor.
- Đảm bảo Clean Code và sẵn sàng cho việc JSON serialization.
```

#### Bước 2: Prompt sinh lớp Service (Context & Objective)
Sau khi có DTO, gửi prompt tiếp theo để sinh Service:
```text
Context: Dưới đây là entity Product và ProductRepository của tôi:
[Dán code Product.java và ProductRepository.java]

Và đây là DTO báo cáo tồn kho chúng ta vừa tạo:
[Dán code InventoryReportItem.java]

Objective: Viết một Service class tên là InventoryService để thực hiện logic tạo báo cáo tồn kho các sản phẩm có số lượng dưới ngưỡng cho trước.

Constraints:
- Tên class: InventoryService.
- Package: com.antigravity.ecommerce.service.
- Sử dụng @Service annotation của Spring.
- Inject ProductRepository thông qua constructor injection.
- Viết phương thức public List<InventoryReportItem> getLowStockProductsReport(int threshold).
- Sử dụng findByStockQuantityLessThan từ ProductRepository.
- Sử dụng Java Stream API để ánh xạ (map) từ Product sang InventoryReportItem.
```

**Mã nguồn do AI sinh ra (InventoryService.java):**
```java
package com.antigravity.ecommerce.service;

import com.antigravity.ecommerce.dto.InventoryReportItem;
import com.antigravity.ecommerce.model.Product;
import com.antigravity.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryService {

    private final ProductRepository productRepository;

    public InventoryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Lấy danh sách các sản phẩm có số lượng tồn kho dưới ngưỡng cho trước.
     *
     * @param threshold Ngưỡng số lượng tồn kho tối đa.
     * @return Danh sách các đối tượng báo cáo InventoryReportItem.
     */
    public List<InventoryReportItem> getLowStockProductsReport(int threshold) {
        List<Product> lowStockProducts = productRepository.findByStockQuantityLessThan(threshold);

        return lowStockProducts.stream()
                .map(product -> new InventoryReportItem(
                        product.getName(),
                        product.getPrice(),
                        product.getStockQuantity()
                ))
                .collect(Collectors.toList());
    }
}
```

#### Bước 3: Prompt sinh lớp Controller (REST API Endpoint)
Gửi prompt cuối cùng để kết nối dịch vụ ra ngoài API:
```text
Context: Dưới đây là InventoryService mà chúng ta vừa tạo:
[Dán code InventoryService.java]

Objective: Viết một REST Controller có tên InventoryController để expose API báo cáo tồn kho.

Constraints:
- Tên class: InventoryController.
- Package: com.antigravity.ecommerce.controller.
- Sử dụng @RestController của Spring.
- Base request path: /api/inventory.
- Endpoint: GET /low-stock. Nhận tham số threshold từ query parameter (ví dụ: /api/inventory/low-stock?threshold=10).
- Endpoint này sẽ gọi InventoryService.getLowStockProductsReport và trả về ResponseEntity<List<InventoryReportItem>>.
- Đảm bảo xử lý lỗi cơ bản.
```

---

## 6. Tổng kết

### Những kiến thức quan trọng nhất
* Viết prompt có cấu trúc rõ ràng (Context, Objective, Constraints) giúp tăng tỷ lệ sinh code đúng ngay từ lần đầu tiên lên trên 90%.
* Không nên yêu cầu AI giải quyết một bài toán lớn bằng một câu lệnh duy nhất; hãy chia nhỏ luồng đi theo mô hình Chain of Thought để kiểm soát chất lượng từng file code được sinh ra.

### Những sai lầm thường gặp
* **Prompt chung chung:** Khiến AI tự đoán cú pháp và thư viện, dẫn đến sinh code không tương thích với dự án.
* **Bỏ qua file tham chiếu:** AI sẽ không hiểu phong cách thiết kế hiện tại của dự án (ví dụ: dùng Lombok hay constructor injection truyền thống).

---

## 7. Câu hỏi đánh giá

### Câu 1
Tại sao kỹ thuật Chain of Thought Prompting lại hiệu quả hơn khi yêu cầu AI xây dựng một tính năng phần mềm lớn so với việc chỉ dùng một Prompt duy nhất?

**Gợi ý đáp án:**
Việc yêu cầu sinh toàn bộ tính năng lớn một lúc dễ khiến AI bị quá tải ngữ cảnh, dẫn đến việc sinh thiếu file, code không đồng bộ về mặt kiểu dữ liệu hoặc bỏ sót các ràng buộc nghiệp vụ. Chain of Thought chia nhỏ bài toán thành các lớp (DTO -> Service -> Controller), giúp lập trình viên kiểm soát tính chính xác của từng phần trước khi chuyển sang phần tiếp theo, đảm bảo tính nhất quán của hệ thống.

### Câu 2
Nêu ý nghĩa của phần Constraints (Ràng buộc) trong một Prompt viết code và cho ví dụ cụ thể.

**Gợi ý đáp án:**
Phần Constraints giúp giới hạn cách AI triển khai code để đảm bảo code tuân thủ đúng chuẩn của dự án. Ví dụ: Ràng buộc "Sử dụng Lombok `@Data` thay vì viết thủ công Getter/Setter", "Sử dụng Java Stream API thay vì vòng lặp `for`", hoặc "Package của class phải đặt tại `com.example.dto`".

### Câu 3
Khi muốn AI sinh code tương thích với một class hiện có trong dự án, bạn cần cung cấp những thông tin gì trong prompt?

**Gợi ý đáp án:**
Cần cung cấp mã nguồn hiện có của class đó dưới dạng "Reference File" (File tham chiếu) kèm theo ngữ cảnh giải thích cấu trúc và mối quan hệ của nó. Điều này giúp AI hiểu được các trường dữ liệu, kiểu dữ liệu, annotation và phong cách viết code hiện tại để sinh ra các đoạn code mới khớp hoàn toàn mà không làm phá vỡ logic cũ.
