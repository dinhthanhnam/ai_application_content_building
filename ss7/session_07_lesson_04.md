# Session 07 - Lesson 04: Prompt yêu cầu thêm test case, kiểm thử logic

## 1. Mục tiêu học tập
Sau khi hoàn thành Lesson này, người học có thể:
- Hiểu được cấu trúc và vai trò của kiểm thử đơn vị (Unit Test) trong quy trình phát triển phần mềm chuyên nghiệp.
- Phân tích và áp dụng kỹ thuật quản trị ngữ cảnh (Context Window) thành **Kỹ thuật thiết lập ràng buộc Mocking** khi viết test bằng AI.
- Thực hiện thiết kế Prompt yêu cầu AI tự động sinh các kịch bản kiểm thử (Test Cases) bao phủ đầy đủ các luồng chạy đúng (Happy Path) và lỗi biên (Exception Path).
- Áp dụng mô hình AAA (Arrange - Act - Assert) kết hợp framework JUnit 5 và Mockito để sinh ra mã nguồn kiểm thử chuẩn doanh nghiệp, dễ đọc và độc lập với môi trường.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric visualization of a software testing workbench. A block of Java code is suspended in the center, surrounded by glowing scanning laser grids representing "Test Assertions". Holographic mock objects labeled "Mocks" are plugged into the code block's dependency sockets. Corporate tech style, clean line art, neon blue, white and violet accents, 8k.

---

## 2. Đặt vấn đề thực tế
Bạn vừa hoàn thành lớp `PaymentService` xử lý nghiệp vụ thanh toán hóa đơn khách hàng. Để chuẩn bị đưa tính năng lên môi trường Production, Tech Lead yêu cầu: *"Em phải viết Unit Test cho PaymentService đạt tỷ lệ bao phủ dòng code (Test Coverage) tối thiểu 80% thì mới được tạo Pull Request nhé."*

Lớp `PaymentService` này phụ thuộc vào 2 thành phần: `PaymentRepository` (để lưu thông tin giao dịch vào DB) và `PaymentGateway` (API gọi sang ngân hàng bên thứ ba để trừ tiền).

Để làm nhanh, bạn sao chép class `PaymentService` gửi cho AI kèm câu lệnh: *"Hãy viết Unit Test cho class Java này."*

AI sinh ra một file test rất dài. Tuy nhiên, khi bạn chạy thử trên IDE, toàn bộ các test case đều bị lỗi sập (Failed) do:
1. AI cố gắng kết nối vào cơ sở dữ liệu thật và gọi API ngân hàng thật trong quá trình test (thiếu cơ chế Mocking).
2. AI viết bằng thư viện JUnit 4 cũ kỹ trong khi dự án của bạn đang cấu hình chạy JUnit 5.
3. Code test viết lộn xộn, không phân biệt rõ ràng các bước chuẩn bị dữ liệu giả lập và bước kiểm tra kết quả.

Làm thế nào để viết Prompt hướng dẫn AI sinh mã nguồn kiểm thử chất lượng cao, giả lập chuẩn xác các thành phần liên quan (Dependencies) và tuân thủ đúng chuẩn JUnit 5/Mockito của dự án?

---

## 3. Kiến thức cốt lõi

### 3.1. Mô hình AAA (Arrange - Act - Assert) trong Unit Test
Một đoạn code Unit Test chuẩn doanh nghiệp bắt buộc phải phân tách rõ ràng thành 3 phân khu:
- **Arrange (Chuẩn bị):** Thiết lập dữ liệu đầu vào, khởi tạo các đối tượng và định cấu hình hành vi giả lập cho các dependency (Stubbing).
- **Act (Thực thi):** Gọi phương thức thực tế cần kiểm thử với dữ liệu đã chuẩn bị.
- **Assert (Kiểm chứng):** Sử dụng các câu lệnh khẳng định (Assertions) để so sánh kết quả trả về thực tế với kết quả mong đợi, hoặc xác minh xem các dependency có được gọi đúng số lần quy định hay không (`verify`).

### 3.2. Kỹ thuật thiết lập ràng buộc Mocking nâng cao
Khi viết test, để AI không tự ý bịa ra hành vi của DB hay API ngoại vi và để kiểm soát giới hạn ngữ cảnh (Context Window), ta cần thiết lập **Ràng buộc Mocking** chi tiết trong Prompt:
- Chỉ định rõ framework: Sử dụng **JUnit 5** và **Mockito**.
- Khai báo các Annotation Mocking: Sử dụng `@Mock` cho các dependency và `@InjectMocks` cho class cần test.
- Ràng buộc kịch bản phủ: Phải kiểm thử ít nhất 3 luồng: (1) Luồng thành công (Happy Path), (2) Luồng dữ liệu biên (nhập số tiền âm), (3) Luồng bắt ngoại lệ (khi API Gateway báo lỗi).

```
+-------------------------------------------------------------+
|                CẤU TRÚC PROMPT UNIT TEST                    |
+-------------------------------------------------------------+
| 1. Dán Class cần test  -->  2. Ràng buộc  -->  3. Ràng buộc |
|                              JUnit5/Mockito     3 luồng test|
+-------------------------------------------------------------+
                                       |
                                       v
                            4. Mã test Java chuẩn AAA
```

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Lớp `PaymentService` gọi API bên ngoài để thực hiện thanh toán hóa đơn. Nếu không mock API, test case sẽ chạy rất chậm và phụ thuộc vào mạng internet.

### Thách thức
Viết test case giả lập hành vi của API ngân hàng (trả về thành công hoặc trả về lỗi kết nối) để kiểm chứng khả năng bắt lỗi ngoại lệ của `PaymentService`.

### Cách tiếp cận bằng Prompt Test Generation tối ưu
Dán mã nguồn `PaymentService`. Trong prompt, yêu cầu AI sử dụng JUnit 5 Assertions, cấu hình Mockito stubbing `when(...).thenReturn(...)` để giả lập dữ liệu trả về từ Database và API Gateway mà không gọi thực tế.

### Kết quả
AI sinh ra tệp tin kiểm thử cực kỳ chuyên nghiệp. Các phương thức test được chia rõ ràng thành 3 phần Arrange - Act - Assert bằng comment. Test case chạy độc lập dưới 1 giây, giả lập hoàn hảo trường hợp ngân hàng bị lỗi kết nối để kiểm tra xem hệ thống có tự động hủy giao dịch trong DB hay không.

---

## 5. Demo minh họa

### Mục tiêu demo
Thực hành viết Prompt sinh mã Unit Test cho lớp Java 17 Service sử dụng JUnit 5 và Mockito, đảm bảo phủ đầy đủ các luồng nghiệp vụ.

### Các bước thực hiện
1. Chuẩn bị mã nguồn Java cần test.
2. Gửi Prompt sinh test case chi tiết và thu về kết quả file test hoàn chỉnh.

#### Lớp Java cần kiểm thử (`PaymentService`):
```java
public class PaymentService {
    private final PaymentRepository repository;
    private final PaymentGateway gateway;

    public PaymentService(PaymentRepository repository, PaymentGateway gateway) {
        this.repository = repository;
        this.gateway = gateway;
    }

    public boolean processPayment(Long orderId, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Số tiền không hợp lệ");
        }
        boolean isSuccess = gateway.charge(orderId, amount);
        if (isSuccess) {
            repository.saveStatus(orderId, "PAID");
            return true;
        }
        repository.saveStatus(orderId, "FAILED");
        return false;
    }
}
```

#### Prompt thực hành sinh unit test tối ưu:
```text
Hãy đóng vai trò là một chuyên gia kiểm thử phần mềm Java (QA Engineer).
Nhiệm vụ của bạn là viết một lớp kiểm thử đơn vị (Unit Test) cho class PaymentService dưới đây.

[Mã nguồn cần test]
(Dán đoạn mã PaymentService phía trên)

[Ràng buộc thiết lập Test]
- Sử dụng framework JUnit 5 (org.junit.jupiter.api) và Mockito (org.mockito).
- Sử dụng chú thích @ExtendWith(MockitoExtension.class) để cấu hình Mockito tự động.
- Sử dụng @Mock cho PaymentRepository và PaymentGateway. Sử dụng @InjectMocks cho PaymentService.
- Cấu trúc từng phương thức test bắt buộc phải tuân thủ mô hình AAA (Arrange, Act, Assert) và có ghi chú rõ ràng 3 phần này bằng comment.

[Các kịch bản cần phủ (Test Cases)]
1. testProcessPayment_Success: Giả lập gateway trả về true, kiểm chứng hàm trả về true và repository gọi saveStatus với tham số "PAID".
2. testProcessPayment_GatewayFailed: Giả lập gateway trả về false, kiểm chứng hàm trả về false và repository gọi saveStatus với tham số "FAILED".
3. testProcessPayment_InvalidAmount: Truyền số tiền <= 0, kiểm chứng hàm ném ra IllegalArgumentException bằng cách dùng assertThrows của JUnit 5.

[Định dạng]
Sinh mã nguồn Java hoàn chỉnh, sạch, dưới 50 dòng.
```

#### Kết quả mã nguồn Unit Test Java mong đợi sinh từ AI:
```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PaymentServiceTest {

    @Mock
    private PaymentRepository repository;
    @Mock
    private PaymentGateway gateway;
    @InjectMocks
    private PaymentService service;

    @Test
    public void testProcessPayment_Success() {
        // Arrange
        Long orderId = 1L;
        double amount = 100.0;
        when(gateway.charge(orderId, amount)).thenReturn(true);

        // Act
        boolean result = service.processPayment(orderId, amount);

        // Assert
        assertTrue(result);
        verify(repository).saveStatus(orderId, "PAID");
    }

    @Test
    public void testProcessPayment_GatewayFailed() {
        // Arrange
        Long orderId = 1L;
        double amount = 100.0;
        when(gateway.charge(orderId, amount)).thenReturn(false);

        // Act
        boolean result = service.processPayment(orderId, amount);

        // Assert
        assertFalse(result);
        verify(repository).saveStatus(orderId, "FAILED");
    }

    @Test
    public void testProcessPayment_InvalidAmount() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            service.processPayment(1L, -50.0);
        });
        verifyNoInteractions(gateway, repository);
    }
}
```

---

## 6. Tổng kết
- Unit Test chuyên nghiệp bắt buộc phải sử dụng Mocking (giả lập) các dependencies để đảm bảo tính độc lập và tốc độ chạy test nhanh.
- Tuân thủ nghiêm ngặt mô hình AAA (Arrange - Act - Assert) giúp file test có cấu trúc mạch lạc, dễ đọc và dễ bảo trì.
- Luôn bẫy thử nghiệm các giá trị biên bằng `assertThrows` để đảm bảo hệ thống tự vệ tốt khi gặp dữ liệu dị biệt.

---

## 7. Câu hỏi đánh giá

**Câu 1:** Trình bày ý nghĩa của mô hình AAA (Arrange - Act - Assert) trong kiểm thử đơn vị. Việc viết test lộn xộn không chia vùng AAA sẽ gây ra những khó khăn gì cho các nhà phát triển khác trong dự án?

*Gợi ý đáp án:*
- **Ý nghĩa:** AAA giúp phân định rõ ràng 3 giai đoạn của một test case: Arrange (thiết lập ngữ cảnh giả lập), Act (thực thi hành vi cần kiểm tra), và Assert (đối chiếu kết quả).
- **Khó khăn khi không dùng AAA:** Code test sẽ trở nên rối rắm, các câu lệnh định cấu hình mock và các câu lệnh khẳng định kết quả bị trộn lẫn vào nhau. Các nhà phát triển khác khi đọc file test sẽ cực kỳ khó hiểu kịch bản test đang nhắm vào mục tiêu gì, đâu là dữ liệu giả và đâu là kết quả thực tế cần verify, gây cản trở quá trình bảo trì và cập nhật test case khi nghiệp vụ thay đổi.

**Câu 2:** Tại sao kỹ thuật Mocking lại là bắt buộc khi viết Unit Test cho tầng Service (nghiệp vụ) trong Spring Boot? Phân biệt sự khác nhau giữa việc nạp cơ sở dữ liệu thật (Integration Test) và việc mock Repository (Unit Test).

*Gợi ý đáp án:*
- **Tính bắt buộc:** Tầng Service thường phụ thuộc vào Database (Repository) và API bên ngoài. Nếu không mock, test case sẽ phải thực hiện kết nối DB và mạng thật, làm test case chạy rất chậm và không thể chạy được nếu mất mạng hoặc DB bị khóa.
- **Phân biệt:**
  - *Integration Test (Nạp DB thật):* Khởi tạo toàn bộ ứng dụng, tạo kết nối đến DB thật hoặc DB bộ nhớ (H2), thực hiện truy vấn SQL thật. Tốc độ chạy chậm, tốn tài nguyên nhưng kiểm thử được toàn bộ luồng tích hợp.
  - *Unit Test (Mock Repository):* Chỉ test độc lập Class Service. Các Repository được thay thế bằng đối tượng giả lập (Mock). Ta tự quy định dữ liệu giả trả về bằng lệnh `when(...)`. Tốc độ chạy siêu nhanh (vài mili-giây), độc lập hoàn toàn với môi trường bên ngoài.

**Câu 3 (Thực chiến):** Bạn có một lớp `UserValidator` chuyên kiểm tra tính hợp lệ của mật khẩu. Quy tắc: mật khẩu phải dài từ 8 ký tự trở lên. Hãy thiết kế một prompt yêu cầu AI viết lớp JUnit 5 Unit Test cho hàm này, phủ đầy đủ 2 trường hợp: mật khẩu hợp lệ (ví dụ "12345678") và mật khẩu quá ngắn (ví dụ "12345").

```java
public class UserValidator {
    public boolean isValidPassword(String password) {
        return password != null && password.trim().length() >= 8;
    }
}
```

*Gợi ý đáp án (Tham khảo Prompt sau):*
```text
Hãy đóng vai trò là một QA Engineer.
Nhiệm vụ của bạn là viết một lớp kiểm thử JUnit 5 cho phương thức isValidPassword của lớp UserValidator dưới đây.

[Mã nguồn cần test]
public class UserValidator {
    public boolean isValidPassword(String password) {
        return password != null && password.trim().length() >= 8;
    }
}

[Ràng buộc thiết lập Test]
- Sử dụng JUnit 5 assertions.
- Áp dụng mô hình AAA và viết ghi chú rõ bằng comment.
- Phủ kín 3 kịch bản: (1) Mật khẩu hợp lệ trả về true, (2) Mật khẩu ngắn trả về false, (3) Mật khẩu null trả về false.
- Sinh mã nguồn Java dưới 40 dòng, sạch và dễ đọc.
```
