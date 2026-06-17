# Session 07 - Lesson 03: Prompt yêu cầu tái cấu trúc/tối ưu mã nguồn cũ

## 1. Mục tiêu học tập
Sau khi hoàn thành Lesson này, người học có thể:
- Hiểu được các nguyên lý tối ưu hóa và tái cấu trúc (Refactoring) mã nguồn cũ theo tiêu chuẩn Clean Code.
- Phân tích và áp dụng kỹ thuật so sánh giải pháp (What-if) và cải tiến nhiều vòng (Iterative Refinement) thành **Quy trình Refactoring có kiểm soát**.
- Thực hiện thiết kế Prompt yêu cầu AI tái cấu trúc một hàm lớn (monolithic method) vi phạm nguyên lý đơn nhiệm (SRP) thành các hàm nhỏ gọn, dễ bảo trì.
- Áp dụng các ràng buộc giữ nguyên chữ ký hàm (Method Signature) trong prompt để đảm bảo mã nguồn sau khi refactor không làm phá vỡ các phần tích hợp khác của hệ thống.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An abstract illustration of a technical upgrade. On the left side, a chaotic structure of tangled wires representing spaghetti code. On the right side, the wires are straightened, color-coded, and organized into neat parallel bus routes, each connecting to modular components labeled "Validation", "Database", and "Email". High contrast neon green and slate gray tech aesthetic, clean vectors, 8k.

---

## 2. Đặt vấn đề thực tế
Trong dự án nâng cấp hệ thống bán hàng, bạn được giao tối ưu hóa lớp `OrderProcessor` chuyên xử lý đơn đặt hàng của khách. Hàm `process` trong lớp này chạy rất tốt và không hề có lỗi cú pháp. Tuy nhiên, khi mở file ra, bạn thấy nó dài tới hơn 150 dòng và thực hiện đồng thời hàng loạt nhiệm vụ:
1. Xác thực thông tin đơn hàng (Validation).
2. Tính toán tiền thuế và chiết khấu (Calculation).
3. Ghi dữ liệu vào Database (Database Save).
4. Gửi email xác nhận cho khách hàng (Notification).

Tất cả các nghiệp vụ trên được viết chung trong một hàm duy nhất với hàng chục biến tạm chồng chéo. Lớp này vi phạm nghiêm trọng Nguyên lý đơn nhiệm (SRP - Single Responsibility Principle). Khi có bất kỳ thay đổi nào về cách tính thuế hoặc mẫu email gửi đi, lập trình viên đều phải sửa đổi tệp này, dẫn đến nguy cơ cao làm hỏng phần lưu Database.

Bạn dán đoạn code này lên AI và gõ: *"Hãy làm sạch và tối ưu đoạn code Java này."*

AI ngay lập tức viết lại toàn bộ code, đổi luôn tên hàm từ `process` thành `executeOrderProcessing`, đồng thời tách thành các class mới hoàn toàn độc lập và sử dụng thư viện Spring Mail thay vì Java Mail cũ. Khi dán ngược lại dự án, chương trình báo lỗi đỏ lòm vì hàng chục class khác đang gọi hàm `process` cũ bị mất liên kết.

Làm thế nào để hướng dẫn AI tái cấu trúc code một cách an toàn, giữ nguyên giao diện tương tác (API/Method Signature) nhưng cải tiến được chất lượng cấu trúc bên trong?

---

## 3. Kiến thức cốt lõi

### 3.1. Nguyên lý Refactoring an toàn với AI
Tái cấu trúc mã nguồn (Refactoring) là quá trình cải tiến cấu trúc bên trong của mã nguồn mà không làm thay đổi hành vi bên ngoài của nó. Khi sử dụng AI để refactor, bạn cần thiết lập 3 quy tắc sau:
- **Giữ nguyên chữ ký hàm (Keep Method Signature):** Ràng buộc AI không được thay đổi tên hàm, kiểu dữ liệu trả về và danh sách tham số đầu vào để tránh làm lỗi các phần code đang liên kết.
- **Ràng buộc tiêu chuẩn Clean Code:** Chỉ định rõ nguyên lý muốn áp dụng (ví dụ: SRP - Tách hàm con, DRY - Khử trùng lặp code).
- **Giảm độ phức tạp nhận thức (Cognitive Complexity):** Yêu cầu AI giảm thiểu các khối lồng nhau và số lượng biến tạm không cần thiết.

### 3.2. Quy trình phân tích What-if áp dụng vào việc Refactor
Thông thường, ta sử dụng What-if để so sánh kiến trúc công nghệ ở mức vĩ mô. Khi refactor, ta có thể nâng cấp kỹ thuật này bằng cách yêu cầu AI:
1. Đánh giá điểm yếu và độ phức tạp (Complexity) của mã nguồn cũ.
2. Đề xuất và **so sánh 2 hướng refactor** khác nhau (ví dụ: Cách 1 là tách thành các hàm helper nội bộ (private helper methods) trong cùng một Class; Cách 2 là tách ra các class Service phụ trợ độc lập).
3. Phân tích tác động và lựa chọn giải pháp tối ưu nhất trước khi xuất ra mã nguồn cuối cùng.

```
+-------------------------------------------------------------+
|              QUY TRÌNH REFACTOR CÓ KIỂM SOÁT                |
+-------------------------------------------------------------+
|  1. Nhập code cũ  -->  2. Phân tích CoT  -->  3. Thiết lập  |
|                         & So sánh What-if      ràng buộc    |
+-------------------------------------------------------------+
                                      |
                                      v
                           4. Sinh mã nguồn Java
                              đã được module hóa
```

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Lớp `OrderProcessor` chứa logic xử lý đơn hàng phức tạp vi phạm SRP, gây khó khăn cho việc viết Unit Test cho từng phần nghiệp vụ độc lập.

### Thách thức
Tái cấu trúc code để dễ bảo trì và kiểm thử nhưng không được làm vỡ các kết nối hiện tại của dự án (không được đổi chữ ký hàm công khai).

### Cách tiếp cận bằng Prompt Refactoring nâng cấp
Dán mã nguồn `OrderProcessor` và sử dụng prompt có ràng buộc chữ ký hàm. Yêu cầu AI đóng vai là Code Architect, thực hiện phân tích What-if so sánh phương án tách hàm helper nội bộ và phương án sử dụng Delegate Pattern. Chọn phương án Helper Methods vì đơn giản và giữ nguyên cấu trúc tệp tin đơn lẻ.

### Kết quả
AI tách hàm `process` lớn thành 4 hàm private nhỏ: `validateOrder()`, `calculateTotal()`, `saveToDatabase()`, `sendEmail()`. Hàm `process` gốc chỉ đóng vai trò điều hướng (Orchestration). Code trở nên sáng sủa, dễ đọc, dễ viết test và giữ nguyên chữ ký hàm ban đầu 100%.

---

## 5. Demo minh họa

### Mục tiêu demo
Thực hành thiết kế Prompt yêu cầu AI tái cấu trúc lớp Java monolithic vi phạm SRP thành các hàm con đơn nhiệm, giữ nguyên chữ ký hàm.

### Các bước thực hiện
1. Chuẩn bị đoạn mã thô monolithic.
2. Gửi Prompt Refactor tối ưu và thu về kết quả code sạch.

#### Đoạn mã thô vi phạm SRP (Java):
```java
public class OrderProcessor {
    public void process(Order order) {
        // 1. Validate
        if (order == null || order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Đơn hàng trống");
        }
        // 2. Tính tiền
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        order.setTotal(total * 1.1); // Cộng 10% thuế
        // 3. Save DB
        System.out.println("Lưu DB đơn hàng: " + order.getId() + " với tổng tiền: " + order.getTotal());
        // 4. Send Email
        System.out.println("Gửi mail thông báo cho khách: " + order.getCustomerEmail());
    }
}
```

#### Prompt thực hành refactor tối ưu:
```text
Hãy đóng vai trò là một Java Code Architect.
Nhiệm vụ của bạn là tái cấu trúc (refactor) lớp OrderProcessor dưới đây để tuân thủ Nguyên lý đơn nhiệm (SRP) và tiêu chuẩn Clean Code.

[Mã nguồn cũ]
(Dán đoạn mã OrderProcessor phía trên)

[Ràng buộc Refactoring]
- Bắt buộc giữ nguyên chữ ký hàm public: "public void process(Order order)". Tuyệt đối không được thay đổi tên hàm, kiểu trả về hoặc tham số đầu vào của hàm này để đảm bảo tính tương thích ngược.
- Phải tách các khối xử lý logic (Validate, Tính tiền, Lưu DB, Gửi Mail) thành các phương thức private helper riêng biệt trong cùng một lớp.
- Các phương thức mới phải được đặt tên rõ nghĩa theo quy ước CamelCase của Java.

[Quy trình Phân tích CoT & What-if]
Trước khi sinh code, hãy:
1. Đánh giá độ phức tạp nhận thức của code cũ.
2. Phân tích What-if: Nếu sau này công thức tính tiền thay đổi (ví dụ thêm chiết khấu), việc code đã được refactor thành các hàm private sẽ giúp việc chỉnh sửa dễ dàng hơn như thế nào so với code cũ?
3. Xuất mã nguồn Java 17 đã được refactor hoàn chỉnh dưới 50 dòng.
```

#### Kết quả mã nguồn Java đã Refactor mong đợi sinh từ AI:
```java
import java.util.Objects;

public class OrderProcessor {

    // Giữ nguyên chữ ký hàm để tương thích ngược
    public void process(Order order) {
        validateOrder(order);
        calculateTotal(order);
        saveToDatabase(order);
        sendEmail(order);
    }

    private void validateOrder(Order order) {
        if (order == null || order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Đơn hàng trống");
        }
    }

    private void calculateTotal(Order order) {
        double total = order.getItems().stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
        order.setTotal(total * 1.1); // Cộng 10% thuế
    }

    private void saveToDatabase(Order order) {
        System.out.println("Lưu DB đơn hàng: " + order.getId() + " với tổng tiền: " + order.getTotal());
    }

    private void sendEmail(Order order) {
        System.out.println("Gửi mail thông báo cho khách: " + order.getCustomerEmail());
    }
}
```

---

## 6. Tổng kết
- Khi refactor bằng AI, luôn đặt ràng buộc "Tương thích ngược" (Backward Compatibility) bằng cách khóa chặt chữ ký hàm (Method Signature).
- Ứng dụng phân tích What-if trước khi viết code giúp lập trình viên đánh giá được kiến trúc tối ưu nhất của code sau khi refactor.
- Tách một hàm lớn thành các hàm nhỏ (SRP) là bước đầu tiên và quan trọng nhất để làm sạch mã nguồn cũ (Spaghetti code).

---

## 7. Câu hỏi đánh giá

**Câu 1:** Tại sao quy tắc "Giữ nguyên chữ ký hàm" lại là ràng buộc quan trọng nhất khi yêu cầu AI tái cấu trúc mã nguồn trong các dự án thực tế của doanh nghiệp? Điều gì xảy ra nếu bỏ qua ràng buộc này?

*Gợi ý đáp án:*
- **Tầm quan trọng:** Chữ ký hàm (tên hàm, tham số, kiểu trả về) là giao diện kết nối (Interface/Contract) giữa các lớp trong hệ thống. Khóa chặt chữ ký hàm đảm bảo tính tương thích ngược, giúp mã nguồn sau khi refactor có thể thay thế mã nguồn cũ ngay lập tức mà không ảnh hưởng đến các lớp khác.
- **Hệ quả nếu bỏ qua:** AI sẽ tự động tối ưu bằng cách đổi tên hàm, gộp hoặc tách tham số theo ý nó. Khi đưa vào dự án, toàn bộ các lớp đang gọi hàm cũ sẽ bị lỗi biên dịch (Compile Error), buộc lập trình viên phải sửa đổi dây chuyền trên diện rộng, làm tăng nguy cơ phát sinh bug mới và tốn thời gian cấu hình lại hệ thống.

**Câu 2:** Phân tích cách ứng dụng kỹ thuật "What-if Analysis" (Phân tích giả định) hỗ trợ lập trình viên đưa ra quyết định kiến trúc tốt hơn khi tối ưu hóa mã nguồn.

*Gợi ý đáp án:*
- Kỹ thuật What-if thông thường có thể chỉ dùng để so sánh các công nghệ/thư viện khác nhau ở mức khái niệm tổng quan.
- Khi refactor, What-if có thể nâng cao thành công cụ mô phỏng sự thay đổi yêu cầu nghiệp vụ tương lai trực tiếp trên cấu trúc code (ví dụ: hỏi "Nếu sau này thêm logic tính thuế thì sửa ở đâu?"). Điều này giúp lập trình viên kiểm chứng xem thiết kế modular mới của AI có thực sự dễ mở rộng và cô lập lỗi tốt hơn cấu trúc code cũ hay không trước khi quyết định chọn phương án viết code.

**Câu 3 (Thực chiến):** Một lập trình viên viết một lớp validate thông tin đăng ký của người dùng. Đoạn code dưới đây bị trùng lặp logic kiểm tra định dạng email và số điện thoại ở nhiều nơi (vi phạm nguyên tắc DRY - Don't Repeat Yourself). Hãy thiết kế một prompt áp dụng quy trình refactor có kiểm soát để AI tối ưu hóa lớp này bằng cách gom nhóm logic trùng lặp thành các hàm tiện ích (Utility/Helper methods), giữ nguyên các phương thức public hiện tại.

```java
public class RegistrationValidator {
    public boolean validateUser(String email, String phone) {
        // Kiểm tra email
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return false;
        }
        // Kiểm tra phone
        if (phone == null || !phone.matches("^\\d{10}$")) {
            return false;
        }
        return true;
    }

    public boolean validateUpdate(String email, String phone) {
        // Trùng lặp logic kiểm tra email
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return false;
        }
        // Trùng lặp logic kiểm tra phone
        if (phone == null || !phone.matches("^\\d{10}$")) {
            return false;
        }
        return true;
    }
}
```

*Gợi ý đáp án (Tham khảo Prompt sau):*
```text
Hãy đóng vai trò là một Senior Java Developer.
Nhiệm vụ của bạn là tái cấu trúc lớp RegistrationValidator để loại bỏ sự trùng lặp code, tuân thủ nguyên tắc DRY.

[Mã nguồn cũ]
(Dán đoạn mã RegistrationValidator phía trên)

[Ràng buộc Refactoring]
- Bắt buộc giữ nguyên hai phương thức public: "validateUser" và "validateUpdate" với chữ ký hàm và kiểu trả về boolean không đổi.
- Trích xuất logic kiểm tra định dạng email (Regex) và số điện thoại (Regex) thành 2 phương thức private helper độc lập: "isValidEmail(String email)" và "isValidPhone(String phone)".
- Gọi lại các phương thức helper này trong hai phương thức public.

[Quy trình phân tích CoT]
1. Chỉ ra dòng code bị trùng lặp và phân tích tác hại nếu Regex định dạng email cần thay đổi trong tương lai.
2. Sinh mã nguồn Java 17 đã tối ưu hóa, đảm bảo ngắn gọn (dưới 45 dòng) và sạch sẽ.
```
