# HƯỚNG DẪN TỰ THỰC HÀNH - SESSION 07
## Chủ đề: Kỹ thuật đặt Prompt nâng cao (Phần 2)

Tài liệu này hướng dẫn bạn thực hành từng bước để làm chủ các kỹ năng lập trình nâng cao cùng AI (Sinh mã nguồn theo đặc tả, Gỡ lỗi bằng Stack Trace, Tái cấu trúc Clean Code, và Viết Unit Test) bằng cách trực tiếp tương tác với trợ lý AI. Bạn sẽ thấy rõ cách AI hoạt động chính xác hơn khi được cung cấp đầy đủ thông số kỹ thuật và bối cảnh lỗi.

> [!NOTE]
> *   **Hình thức:** Bài tập tự thực hành (Self-guided Practice), sinh viên tự hoàn thành tại nhà hoặc trên lớp.
> > *   **Yêu cầu nộp bài:** **KHÔNG CẦN NỘP BÀI**. Không chấm điểm và không kiểm tra.
> > *   **Thời gian ước tính:** 30 phút.

---

### BƯỚC 1: Sinh code theo đặc tả & Dry-run CoT (10 phút)

Chúng ta sẽ yêu cầu AI viết một hàm chuyển đổi dữ liệu thô (JSON) sang DTO record trong Java.

1.  Mở trợ lý AI (ChatGPT, Claude hoặc Gemini).
2.  Gửi prompt thô sơ dưới đây cho AI:
    > `"Viết hàm Java 17 chuyển đổi chuỗi JSON giao dịch thành List TransactionDTO."`
3.  **Đọc kết quả phản hồi:** AI sẽ sinh ra đoạn code cơ bản. Tuy nhiên, code này thường không an toàn: không kiểm tra chuỗi rỗng, không bắt lỗi parse JSON, và không validate dữ liệu nghiệp vụ (ví dụ: số tiền âm).
4.  Bây giờ, hãy nâng cấp prompt áp dụng **4 cấu phần đặc tả (Input, Processing, Output, Language)** và **Dry-run CoT**:
    > `"Hãy đóng vai trò là một Java Tech Lead. Nhiệm vụ của bạn là viết một class Java 17 để chuyển đổi chuỗi JSON giao dịch thành danh sách đối tượng TransactionDTO.*
    > *[Đầu vào (Input)]*
    > *- Một chuỗi JSON thô đại diện cho danh sách giao dịch. Cấu trúc mỗi giao dịch: 'id' (String), 'amount' (double), 'status' (String).*
    > *[Đầu ra (Output)]*
    > *- Trả về đối tượng List<TransactionDTO>.*
    > *- Định nghĩa TransactionDTO là một Java record gồm các trường: String id, double amount, String status.*
    > *[Logic xử lý & Ràng buộc]*
    > *- Sử dụng thư viện Jackson ObjectMapper.*
    > *- Kiểm duyệt dữ liệu biên: số tiền amount phải > 0, status chỉ nhận 'SUCCESS' hoặc 'FAILED'. Nếu vi phạm hoặc JSON bị lỗi định dạng, hãy ghi log lỗi và bỏ qua dòng đó, tuyệt đối không làm sập tiến trình.*
    > *[Quy trình Dry-run CoT]*
    > *Đừng viết code ngay lập tức. Hãy thực hiện theo các bước sau ra màn hình:*
    > *1. Phác thảo thuật toán xử lý bằng văn bản mô tả từng bước.*
    > *2. Chạy thử bằng tay (Dry-run) bằng văn bản với ca dữ liệu mẫu: Chuỗi JSON bị thiếu dấu ngoặc đóng. Giải thích cách code sẽ bắt lỗi đó.*
    > *3. Cuối cùng, sinh ra mã nguồn Java hoàn chỉnh."`
5.  **So sánh kết quả:** Đoạn code mới do AI sinh ra sẽ an toàn hơn rất nhiều, sử dụng `try-catch` trong vòng lặp để bỏ qua các dòng lỗi, ghi log bằng SLF4J và kiểm soát tốt các điều kiện biên.

---

### BƯỚC 2: Gỡ lỗi bằng Stack Trace (10 phút)

Chúng ta sẽ thực hành cách cung cấp bối cảnh lỗi để AI chỉ ra nguyên nhân gốc rễ và sửa lỗi chính xác.

1.  Gửi prompt thô sơ dưới đây kèm thông báo lỗi cho AI:
    > `"Tôi bị lỗi này, sửa giúp tôi: Referential integrity constraint violation: CONSTRAINT_FOREIGN_KEY_USER: PUBLIC.TRANSACTIONS FOREIGN KEY(USER_ID) REFERENCES PUBLIC.USERS(ID)"`
2.  **Đọc kết quả phản hồi:** AI sẽ đưa ra một số phán đoán chung chung về database nhưng không thể chỉ cho bạn biết phải sửa file Java nào hay sửa logic code như thế nào, vì bạn chưa cung cấp mã nguồn Java của mình.
3.  Bây giờ, hãy dán cả code lỗi và Stack Trace, gửi kèm prompt gỡ lỗi dưới đây:
    > `"Bạn là một chuyên gia gỡ lỗi Java (Java Debugger). Hãy phân tích lỗi sập hệ thống dưới đây:*
    > *[Mã nguồn hiện tại]*
    > *```java*
    > *public class TransactionRepository {*
    > *    private Connection connection;*
    > *    public void saveTransaction(String id, Long userId, double amount) throws Exception {*
    > *        String sql = 'INSERT INTO transactions (id, user_id, amount) VALUES (?, ?, ?)';*
    > *        PreparedStatement ps = connection.prepareStatement(sql);*
    > *        ps.setString(1, id);*
    > *        ps.setLong(2, userId);*
    > *        ps.setDouble(3, amount);*
    > *        ps.executeUpdate();*
    > *    }*
    > *}*
    > *```*
    > *[Stack Trace thực tế]*
    > *```text*
    > *org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException: Referential integrity constraint violation: 'CONSTRAINT_FOREIGN_KEY_USER: PUBLIC.TRANSACTIONS FOREIGN KEY(USER_ID) REFERENCES PUBLIC.USERS(ID) (99)'; SQL statement:*
    > *INSERT INTO transactions (id, user_id, amount) VALUES (?, ?, ?) [23506-214]*
    > *    at TransactionRepository.saveTransaction(TransactionRepository.java:13)*
    > *```*
    > *Hãy thực hiện:*
    > *1. Giải thích nguyên nhân gốc rễ (Root Cause) của lỗi này bằng tiếng Việt dễ hiểu.*
    > *2. Viết lại hàm saveTransaction: Bổ sung logic truy vấn bảng USERS trước để kiểm tra xem userId có tồn tại hay không. Nếu không tồn tại, ném ra ngoại lệ UserNotFoundException tùy chỉnh."`
4.  **Quan sát kết quả:** AI giải thích ngay lỗi do bạn đang cố chèn một giao dịch cho `userId = 99` nhưng trong bảng `USERS` chưa hề có tài khoản nào có ID là 99. AI sẽ sinh ra đoạn code có câu lệnh SELECT kiểm tra sự tồn tại của User trước khi INSERT, giải quyết dứt điểm lỗi Integrity Constraint.

---

### BƯỚC 3: Thực hành Refactor Clean Code & Viết Unit Test (10 phút)

Chúng ta sẽ dọn dẹp mã nguồn spaghetti và viết unit test để kiểm chứng chất lượng code.

1.  Sao chép đoạn code spaghetti kiểm duyệt giỏ hàng dưới đây:
    ```java
    public class OrderValidator {
        public boolean check(Order o) {
            if (o != null) {
                if (o.getItems() != null && o.getItems().size() > 0) {
                    if (o.getCustomerId() != null) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
    ```
2.  **Yêu cầu Refactor:** Gửi đoạn code trên cho AI kèm prompt:
    > `"Hãy refactor class OrderValidator trên theo chuẩn Clean Code. Loại bỏ cấu trúc if lồng nhau bằng kỹ thuật Guard Clauses (thoát sớm). Đổi tên phương thức thành isValid và viết ngắn gọn."`
3.  **Quan sát kết quả:** AI sẽ trả về một phiên bản code cực kỳ tinh gọn và dễ đọc:
    ```java
    public class OrderValidator {
        public boolean isValid(Order order) {
            if (order == null) return false;
            if (order.getItems() == null || order.getItems().isEmpty()) return false;
            return order.getCustomerId() != null;
        }
    }
    ```
4.  **Yêu cầu viết Unit Test:** Tiếp tục chat trong cùng phiên để viết test case:
    > `"Tuyệt vời. Bây giờ hãy viết một class unit test sử dụng JUnit 5 để kiểm thử toàn diện phương thức isValid trên. Sử dụng Parameterized Test để kiểm thử các trường hợp order null, items empty, customerId null (đầu ra mong muốn là false) và trường hợp đơn hàng hợp lệ (đầu ra mong muốn là true)."`
5.  **Quan sát kết quả:** AI sẽ sinh ra mã nguồn JUnit 5 Parameterized Test hoàn chỉnh. Bạn có thể sao chép cả hai class vào IDE của mình và chạy thử để thấy kết quả thành công lá cờ xanh (green flag).

---

*Chúc mừng bạn đã hoàn thành bài tự thực hành Session 07! Bạn đã nắm vững các kỹ thuật tương tác nâng cao với AI để sinh code, sửa lỗi, dọn dẹp code và viết unit test chuyên nghiệp.*
