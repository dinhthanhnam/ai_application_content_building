# Session 10: Kỹ năng Prompt để phân tích, xây dựng SRS dự án

## Lesson 01: Antigravity là gì? So sánh với VSCode + Copilot truyền thống

## 1. Mục tiêu học tập
Sau khi hoàn thành bài học này, bạn sẽ có khả năng:
* Hiểu được sự khác biệt cốt lõi giữa AI-first IDE (như Antigravity) và mô hình IDE truyền thống kết hợp AI plugin (như VSCode + Copilot).
* Nắm vững cơ chế hoạt động của Antigravity dựa trên khả năng phân tích ngữ cảnh toàn cục (global context awareness).
* Chuyển dịch tư duy từ việc viết code cú pháp chi tiết sang vai trò "đạo diễn/hướng dẫn code" thông qua các đặc tả nghiệp vụ cấp cao.

---

## 2. Đặt vấn đề thực tế
Trong một dự án phát triển phần mềm Agile thông thường, nhóm của bạn đang đối mặt với một thách thức lớn. Khách hàng yêu cầu một tính năng mới phức tạp cho ứng dụng quản lý kho hàng hiện có. Tính năng này đòi hỏi việc tích hợp sâu với nhiều module cũ, sử dụng các thư viện ít được biết đến và có một số quy tắc nghiệp vụ rắc rối. 

Thời gian gấp rút, và codebase hiện tại đã khá lớn, nhiều chỗ khá lộn xộn. Các lập trình viên thường mất hàng giờ để đọc hiểu một phần codebase trước khi có thể bắt đầu viết code mới, chưa kể đến việc tìm ra chỗ nào phù hợp để thêm tính năng mà không phá vỡ các phần khác.

---

## 3. Kiến thức cốt lõi

### Khái niệm AI-first IDE (Antigravity)
Antigravity đại diện cho một môi trường phát triển tích hợp (IDE) thế hệ mới được thiết kế xoay quanh AI ngay từ đầu (AI-first). Thay vì chỉ là trình chỉnh sửa văn bản đính kèm AI plugin, Antigravity nhúng sâu AI vào mọi thành phần của IDE, cho phép nó tự động hóa các luồng làm việc phức tạp và phân tích toàn bộ dự án.

### So sánh Antigravity với VSCode + Copilot truyền thống

| Tiêu chí | VSCode + Copilot truyền thống | Antigravity (AI-first IDE) |
| :--- | :--- | :--- |
| **Mô hình tương tác** | Gợi ý từng dòng (line-by-line) hoặc đoạn code ngắn. | Tương tác toàn cục thông qua Chat Panel, Composer và Agent. |
| **Nhận thức ngữ cảnh** | Giới hạn trong file hiện tại hoặc các file đang mở (local context). | Toàn diện dự án, hiểu cấu trúc thư mục, file cấu hình và các mối quan hệ (global context). |
| **Khả năng tự động hóa** | Hỗ trợ hoàn thành code nhanh tại vị trí con trỏ chuột. | Tự động tạo nhiều file mới, cập nhật file cũ, cấu hình dependency và refactor toàn bộ module. |
| **Vai trò lập trình viên** | Thực thi thủ công là chính, AI chỉ đóng vai trò "trợ lý gõ phím". | Đạo diễn/kiến trúc sư hệ thống, giao tiếp bằng đặc tả cấp cao và kiểm chứng kết quả. |

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Doanh nghiệp yêu cầu tích hợp tính năng "Chiết khấu sản phẩm theo gói" (Bundled Product Discount) vào hệ thống bán hàng hiện tại. Khi khách hàng mua các sản phẩm được chỉ định đi kèm nhau, hệ thống tự động giảm 15% tổng giá trị gói sản phẩm đó.

### Thách thức
Hệ thống hiện tại có codebase rất lớn. Việc tự tìm kiếm vị trí tính toán giá giỏ hàng, viết logic chiết khấu mới và cập nhật API quản trị thủ công sẽ mất nhiều ngày, đồng thời dễ gây lỗi xung đột hoặc ảnh hưởng đến các phương thức thanh toán hiện tại.

### Cách tiếp cận với Antigravity
Thay vì dò từng dòng code cũ để tìm điểm chèn logic, lập trình viên mô tả tính năng bằng một tệp đặc tả cấp cao (`FeatureRequest.instruction`) và gửi cho Antigravity.

### Sơ đồ so sánh luồng làm việc

```text
Quy trình truyền thống (VSCode + Copilot):
[Đọc hiểu Codebase] ──> [Định vị file cần sửa] ──> [Viết code thủ công & duyệt gợi ý từng dòng] ──> [Gỡ lỗi tích hợp] ──> [Hoàn thành]

Quy trình hiện đại (Antigravity):
[Đặc tả bằng ngôn ngữ tự nhiên] ──> [AI phân tích toàn cục Codebase] ──> [Tự động tạo & cập nhật nhiều file] ──> [Verify/Test] ──> [Hoàn thành]
```

* **Mô tả hình ảnh:** Sơ đồ so sánh hai luồng làm việc. Phía trên là luồng truyền thống thủ công và tuyến tính. Phía dưới là luồng làm việc hiện đại với Antigravity, nơi AI đảm nhận các tác vụ phân tích và sinh mã nguồn tự động dựa trên đặc tả.
* **Prompt gợi ý (English):** A clean comparison flowchart. The top pathway in blue outlines the traditional manual coding steps. The bottom pathway in green outlines the AI-first IDE workflow with automated code generation. Corporate flat design, high contrast, isolated on a white background.

---

## 5. Demo minh họa

### Mục tiêu demo
Minh họa sự khác biệt trong tư duy triển khai endpoint API mới cho quản lý sản phẩm giữa hai công cụ.

### Triển khai truyền thống (VSCode + Copilot)
Lập trình viên phải tự tạo file `ProductController.java` và viết cấu trúc class, chờ đợi Copilot gợi ý từng đoạn code nhỏ:

```java
// ProductController.java
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Endpoint lấy tất cả sản phẩm
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.findAll();
        return ResponseEntity.ok(products);
    }

    // Endpoint tạo sản phẩm mới
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = productService.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }
}
```

### Triển khai hiện đại (Antigravity)
Lập trình viên viết một đặc tả bằng ngôn ngữ tự nhiên cấp cao, sau đó Antigravity tự động phân tích và sinh ra toàn bộ các file cần thiết (`Product.java`, `ProductRepository.java`, `ProductService.java`, `ProductController.java`):

```text
Create a new REST API module for managing 'products'.
It should include standard CRUD operations:
- GET /api/products: retrieves all products.
- GET /api/products/{id}: retrieves a product by its ID.
- POST /api/products: creates a new product.
- PUT /api/products/{id}: updates an existing product.
- DELETE /api/products/{id}: deletes a product by its ID.

The 'Product' entity should have fields: id (Long), name (String, required), description (String), price (BigDecimal, required).
Use Spring Boot with JPA for persistence.
Implement appropriate service (ProductService) and repository (ProductRepository) layers.
Ensure proper exception handling for 'Product Not Found'.
```

---

## 6. Tổng kết

### Những kiến thức quan trọng nhất
* Antigravity là IDE thế hệ mới tích hợp sâu AI giúp lập trình viên chuyển vai trò từ "thợ gõ code" sang "kiến trúc sư" hệ thống.
* Sức mạnh lớn nhất của Antigravity là nhận thức ngữ cảnh toàn cục (Global Context), giúp làm việc trên toàn bộ codebase thay vì chỉ một file riêng lẻ.

### Những sai lầm thường gặp
* **Kỳ vọng AI tự làm tất cả:** Đưa ra yêu cầu mơ hồ sẽ khiến AI sinh code lệch hướng. Luôn cần một prompt rõ ràng và chi tiết.
* **Không kiểm chứng lại kết quả:** AI có thể tạo ra code không tối ưu hoặc gặp lỗi logic (hallucination). Cần kiểm thử và rà soát kỹ lưỡng.
* **Bỏ qua kiến thức nền tảng:** Không hiểu cấu trúc hệ thống, design patterns sẽ khiến bạn không thể đánh giá được chất lượng code do AI sinh ra.

---

## 7. Câu hỏi đánh giá

### Câu 1
Sự khác biệt cốt lõi về mặt nhận thức ngữ cảnh (context awareness) giữa Antigravity và VSCode kết hợp Copilot truyền thống là gì?

**Gợi ý đáp án:**
VSCode + Copilot truyền thống bị giới hạn trong phạm vi cục bộ (chỉ hiểu file hiện tại hoặc các tab đang mở), trong khi Antigravity có khả năng quét và lập chỉ mục toàn bộ thư mục dự án (Global Context), hiểu được mối quan hệ giữa các thành phần khác nhau như controller, service, repository và file cấu hình hệ thống.

### Câu 2
Tại sao nói sự xuất hiện của các công cụ như Antigravity làm dịch chuyển vai trò của lập trình viên?

**Gợi ý đáp án:**
Lập trình viên không còn phải mất nhiều thời gian gõ cú pháp lặp lại hoặc tự mò mẫm đọc hiểu codebase cũ. Vai trò dịch chuyển sang việc làm rõ yêu cầu nghiệp vụ, viết đặc tả cấp cao dưới dạng prompt chuẩn kỹ sư, thiết kế kiến trúc hệ thống và kiểm chứng (verify) chất lượng mã nguồn do AI sinh ra.

### Câu 3
Khi sử dụng Antigravity để thêm một tính năng lớn vào dự án, bạn nên chuẩn bị những thông tin gì trong tệp đặc tả (prompt)?

**Gợi ý đáp án:**
Cần cung cấp đầy đủ 3 thành phần chính:
1. **Ngữ cảnh (Context):** Cấu trúc dự án hiện tại, các module liên quan cần tương tác.
2. **Mục tiêu (Objective):** Yêu cầu cụ thể của tính năng mới (ví dụ: các API endpoints, cấu trúc dữ liệu).
3. **Ràng buộc (Constraints/Rules):** Các quy tắc nghiệp vụ, chuẩn viết code, quy ước đặt tên và cách xử lý lỗi.