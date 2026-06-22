# BÀI TẬP VỀ NHÀ - SESSION 08
## Chủ đề: Thực hành kỹ thuật đặt Prompt nâng cao (Phần 2)

### Hướng dẫn làm bài:
*   Sinh viên đọc kỹ yêu cầu và thực hiện làm bài tập trực tiếp trên một file Markdown duy nhất.
*   Tuân thủ nghiêm ngặt **Hướng dẫn nộp bài** ở cuối tài liệu (chỉ nộp file văn bản `.md`, tuyệt đối không chụp ảnh màn hình).
*   **Đây là bài tập thực hành tổng hợp:** Đối với tất cả các bài tập (từ Bài 1 đến Bài 5), sinh viên bắt buộc phải tự thiết kế prompt, tương tác với AI và sao chép toàn bộ nội dung văn bản cuộc trò chuyện (text log) cùng mã nguồn Java do AI sinh ra trực tiếp vào tệp làm bài. Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại.

---

## PHẦN I: NỘI DUNG BÀI TẬP

### BỐI CẢNH DỰ ÁN XUYÊN SUỐT: HỆ THỐNG KIỂM SOÁT GIAO DỊCH NGÂN HÀNG "SECUREBANK"
Để giải quyết các bài tập trong Session này, sinh viên sẽ đóng vai trò là một **Kỹ sư Java Core / Backend Developer** tham gia phát triển dự án "SecureBank" - một hệ thống quản lý, đối soát và kiểm toán giao dịch của một ngân hàng số. Các bài tập từ 1 đến 5 sẽ lần lượt đi qua các giai đoạn thiết kế và lập trình cho hệ thống này.

---

### BÀI 1: Thực hành Tích hợp & Sinh Code - Import giao dịch JSON (100 điểm)
*   **Bối cảnh:** SecureBank cần tích hợp và nhập danh sách giao dịch từ hệ thống Core Banking cũ chuyển sang dưới dạng một chuỗi JSON thô (Raw JSON string). Dữ liệu này chứa nhiều dòng lỗi (như ID giao dịch bị rỗng, ngày tháng sai định dạng, số tiền giao dịch bị âm hoặc chứa ký tự đặc biệt). Bạn cần viết một lớp parser để phân tích và chuẩn hóa dữ liệu này.
*   **Nhiệm vụ:** Hãy đóng vai trò là Senior Java Developer, thiết kế một prompt tối ưu để yêu cầu AI sinh mã nguồn cho class `TransactionParser`:
    1.  **Đầu vào (Input):** Một chuỗi JSON thô đại diện cho danh sách giao dịch (chứa id, amount, status, transactionDate). Có cài cắm các dữ liệu lỗi biên (ví dụ: dòng thiếu id, amount là chuỗi chữ "abc", status không hợp lệ).
    2.  **Đầu ra (Output):** Trả về đối tượng `List<TransactionDTO>` (với `TransactionDTO` là Java record gồm các trường: id, amount, status, localDateTime).
    3.  **Ràng buộc kỹ thuật:** Sử dụng thư viện `Jackson ObjectMapper` của Spring Boot để parse JSON. Phải kiểm duyệt dữ liệu biên: số tiền amount phải > 0, status chỉ nhận "SUCCESS" hoặc "FAILED", nếu không hợp lệ phải bỏ qua dòng đó, ghi log lỗi mà không làm sập toàn bộ tiến trình đọc.
    4.  **Dry-run CoT:** Yêu cầu AI trình bày luồng suy luận từng bước (CoT) và phác thảo thuật toán trước khi xuất code Java 17.
*   **Yêu cầu đầu ra:**
    *   Phần phân tích của bạn về các trường hợp biên có thể xảy ra khi đọc chuỗi JSON từ hệ thống cũ.
    *   Nội dung Prompt tối ưu do bạn thiết kế (chứa đầy đủ 4 cấu phần kỹ thuật và yêu cầu dry-run).
    *   **Minh chứng chạy thực tế:** Sao chép toàn bộ text log phản hồi của AI (bao gồm phần phác thảo thuật toán và mã nguồn Java của class `TransactionParser` cùng `TransactionDTO` record do AI sinh ra).

---

### BÀI 2: Thực hành Gỡ lỗi từ Stack Trace (100 điểm)
*   **Bối cảnh:** Khi chạy thử nghiệm phương thức lưu giao dịch của SecureBank vào cơ sở dữ liệu quan hệ, hệ thống đột ngột bị sập và ném ra ngoại lệ `DataIntegrityViolationException` hiển thị trên màn hình Console.
*   **Mã nguồn gây lỗi (Java):**
```java
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TransactionRepository {
    private Connection connection;

    public void saveTransaction(String transactionId, Long userId, double amount) throws Exception {
        // Lỗi logic: Không kiểm tra xem userId có tồn tại trong bảng Users hay không
        // Dẫn đến lỗi vi phạm khóa ngoại (Foreign Key Constraint Violation) dưới CSDL
        String sql = "INSERT INTO transactions (id, user_id, amount) VALUES (?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, transactionId);
        ps.setLong(2, userId);
        ps.setDouble(3, amount);
        ps.executeUpdate();
    }
}
```
*   **Dấu vết lỗi xuất hiện ở Console (Stack Trace):**
    ```text
    org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException: Referential integrity constraint violation: "CONSTRAINT_FOREIGN_KEY_USER: PUBLIC.TRANSACTIONS FOREIGN KEY(USER_ID) REFERENCES PUBLIC.USERS(ID) (99)"; SQL statement:
    INSERT INTO transactions (id, user_id, amount) VALUES (?, ?, ?) [23506-214]
        at org.h2.message.DbException.getJdbcSQLException(DbException.java:502)
        at TransactionRepository.saveTransaction(TransactionRepository.java:13)
        at Main.main(Main.java:10)
    ```
*   **Nhiệm vụ:** Thiết kế một prompt gỡ lỗi (Debugging Prompt) gửi cho AI để giải quyết sự cố trên:
    1.  Cung cấp toàn bộ mã nguồn gây lỗi và Stack Trace thực tế từ console.
    2.  Yêu cầu AI đóng vai là Java Debugger chuyên nghiệp, giải nghĩa thông báo lỗi và chỉ ra nguyên nhân gốc rễ (Root Cause).
    3.  Ràng buộc AI phải tối ưu lại hàm này: Bổ sung logic kiểm tra xem `userId` có tồn tại trong cơ sở dữ liệu hay không trước khi thực hiện câu lệnh Insert. Nếu không tồn tại, ném ra ngoại lệ tùy chỉnh `UserNotFoundException` thay vì để CSDL ném lỗi sập hệ thống.
*   **Yêu cầu đầu ra:**
    *   Nội dung Prompt gỡ lỗi do bạn thiết kế.
    *   **Minh chứng chạy thực tế:** Sao chép toàn bộ text log phản hồi của AI (gồm phần giải nghĩa nguyên nhân lỗi và mã nguồn Java `TransactionRepository` đã sửa đổi an toàn).

---

### BÀI 3: Thực hành Refactor Clean Code - Refinement Process (100 điểm)
*   **Bối cảnh:** Lập trình viên cũ bàn giao lại một class `LedgerBalanceCalculator` làm nhiệm vụ tính tổng số dư tài khoản của một chi nhánh ngân hàng. Đoạn code dài hơn 80 dòng, sử dụng các biến viết tắt vô nghĩa, có quá nhiều câu lệnh `if-else` lồng nhau sâu và hoàn toàn không ghi log khi gặp lỗi số học.
*   **Mã nguồn chưa tối ưu (Java):**
```java
import java.util.List;

public class LedgerBalanceCalculator {
    public double calc(List<Account> list, String branch, boolean activeOnly) {
        double total = 0;
        if (list != null) {
            for (Account a : list) {
                if (a != null) {
                    if (a.getBranch().equals(branch)) {
                        if (activeOnly) {
                            if (a.getStatus().equals("ACTIVE")) {
                                if (a.getBalance() > 0) {
                                    total += a.getBalance();
                                }
                            }
                        } else {
                            if (a.getBalance() > 0) {
                                total += a.getBalance();
                            }
                        }
                    }
                }
            }
        }
        return total;
    }
}
```
*   **Nhiệm vụ:** Thiết kế một chuỗi **Prompt Cải tiến đầu ra nâng cao (Refinement Chain) gồm 3 vòng** để yêu cầu AI refactor đoạn code trên thành mã nguồn đạt chuẩn doanh nghiệp (Production-ready):
    *   **Vòng 1 (Robustness & Clean Code):** Loại bỏ cấu trúc `if-else` lồng nhau sâu bằng kỹ thuật "Return Early" hoặc "Guard Clauses". Đổi tên biến rõ nghĩa theo đúng quy ước Clean Code.
    *   **Vòng 2 (Maintainability & OOP):** Tối ưu hóa thuật toán bằng cách sử dụng **Java 17 Stream API** để viết ngắn gọn, dễ đọc. Bổ sung chú thích `@Transactional(readOnly = true)` nếu class này hoạt động trong môi trường Spring Boot.
    *   **Vòng 3 (Logging & Context Tuning):** Tích hợp Lombok `@Slf4j` để log thông tin số lượng tài khoản được duyệt qua và tổng tiền tính được ở cấp độ `log.info`.
*   **Yêu cầu đầu ra:**
    *   Phần phân tích của bạn chỉ ra các điểm vi phạm Clean Code của đoạn mã thô ban đầu.
    *   Chi tiết nội dung 3 lượt Prompt tương ứng với 3 vòng cải tiến.
    *   **Minh chứng chạy thực tế:** Sao chép toàn bộ text log phản hồi ở lượt chat cuối cùng chứa mã nguồn Java `LedgerBalanceCalculator` đã tối ưu hoàn chỉnh.

---

### BÀI 4: Thực hành Viết Unit Test (100 điểm)
*   **Bối cảnh:** Để chuẩn bị đưa phân hệ kiểm soát giao dịch của SecureBank lên môi trường thử nghiệm UAT, Tech Lead yêu cầu viết unit test để kiểm thử toàn diện class `TransactionParser` (Bài 1) và `LedgerBalanceCalculator` (Bài 3).
*   **Nhiệm vụ:** Hãy đóng vai trò là Senior QA Engineer, thiết kế một prompt yêu cầu AI tạo ra bộ unit test:
    1.  **Công nghệ sử dụng:** Sử dụng JUnit 5 kết hợp thư viện `Mockito` để mock các repository hoặc dependencies.
    2.  **Kịch bản kiểm thử (Test Cases):** Phải bao phủ toàn bộ các trường hợp dữ liệu biên:
        - Đối với `TransactionParser`: kiểm thử chuỗi JSON rỗng, JSON bị lỗi định dạng, JSON chứa số tiền âm, và JSON đúng định dạng.
        - Đối với `LedgerBalanceCalculator`: kiểm thử danh sách Account null, danh sách rỗng, danh sách chứa tài khoản có số dư âm hoặc null, và kiểm thử tính đúng đắn khi lọc theo trạng thái hoạt động (activeOnly).
    3.  **Ràng buộc đầu ra:** Code JUnit 5 sạch, sử dụng `@Mock`, `@InjectMocks`, có chú thích chi tiết bằng tiếng Việt.
*   **Yêu cầu đầu ra:**
    *   Phần phác thảo của bạn về các kịch bản kiểm thử biên cần thiết cho cả 2 class trên.
    *   Nội dung Prompt kiểm thử logic do bạn thiết kế.
    *   **Minh chứng chạy thực tế:** Sao chép toàn bộ text log phản hồi của AI chứa mã nguồn JUnit 5 test class hoàn chỉnh.

---

### BÀI 5: Thực hành Thiết kế Cổng Kiểm toán đối soát giao dịch (Creative/Advanced) (100 điểm)
*   **Bối cảnh:** Mỗi ngày, SecureBank nhận được tệp dữ liệu giao dịch từ Core Banking và một tệp dữ liệu đối soát giao dịch từ đối tác thanh toán quốc tế Visa/Mastercard. Nhiệm vụ của bạn là xây dựng hệ thống Đối soát giao dịch (Reconciliation System) để tìm ra các giao dịch bị lệch số tiền (Discrepancy) hoặc lệch múi giờ giao dịch giữa hai hệ thống.
*   **Đề bài mở:** Hãy đóng vai trò là kỹ sư hệ thống (System Designer), thực hiện quy trình 3 bước tương tác liên tiếp với AI để thiết kế giải pháp:
    *   **Bước 1: Tư vấn giải pháp đối soát (Options & Trade-offs):** Thiết kế prompt yêu cầu AI đề xuất và so sánh 2 phương án đối soát: Phương án 1 đối soát trực tiếp trong bộ nhớ bằng cách nạp toàn bộ 2 danh sách vào Java Collection; Phương án 2 thực hiện đối soát ở tầng database bằng câu lệnh SQL Join. Lập bảng so sánh về hiệu năng, mức tiêu thụ RAM và khả năng mở rộng khi số lượng giao dịch lên tới 5 triệu giao dịch/ngày.
    *   **Bước 2: Phân tích kịch bản What-if:** Thiết kế prompt thứ hai giả định: *"Chuyện gì xảy ra nếu múi giờ giao dịch của Core Banking (GMT+7) và đối tác Visa (GMT+0) bị lệch nhau dẫn đến việc so sánh ngày tháng bị sai lệch? Hãy đề xuất cách giải quyết bằng Java 8 Date Time API (ZonedDateTime) để chuẩn hóa thời gian về cùng một múi giờ UTC trước khi đối soát."*
    *   **Bước 3: Thiết kế Prompt sinh mã nguồn CoT (Code Generation with CoT):** Thiết kế prompt thứ ba yêu cầu AI đóng vai Senior Developer, áp dụng cấu trúc CoT (suy nghĩ từng bước) để viết mã nguồn Java Spring Boot cho dịch vụ đối soát `ReconciliationService` với phương thức `reconcile(List<Transaction> coreTxns, List<Transaction> partnerTxns)`. Ràng buộc: Chuẩn hóa thời gian về UTC, so sánh khớp theo ID, nếu lệch số tiền hoặc trạng thái thì ném ngoại lệ/tạo bản ghi lỗi và ghi log chi tiết bằng `@Slf4j`.
*   **Yêu cầu đầu ra:**
    *   Mô tả ngắn gọn ý đồ thiết kế quy trình đối soát giao dịch của bạn.
    *   Nội dung của 3 Prompt tương ứng với các bước trên.
    *   **Minh chứng thực tế:** Bắt buộc chạy thực tế với AI và sao chép toàn bộ log chat (text log/markdown block) của cả 3 lượt chat trực tiếp vào file làm bài (tuyệt đối không nộp link chia sẻ hoặc ảnh chụp màn hình). Log chat phải thể hiện rõ:
        1.  Bản so sánh 2 phương án đối soát ở Bước 1.
        2.  Phương án xử lý lệch múi giờ với ZonedDateTime ở Bước 2.
        3.  Mã nguồn Java class `ReconciliationService` hoàn chỉnh ở Bước 3.

---

## PHẦN II: TIÊU CHÍ CHẤM ĐIỂM CHI TIẾT (DÀNH CHO AI CHẤM BÀI)

### 1. Tiêu chí chấm từ Bài 1 đến Bài 4 (Thực hành tổng hợp - Max: 100 điểm/bài)
*   **Thiết kế Prompt tối ưu (30 điểm):** Prompt sinh viên viết phải chuyên nghiệp, có đầy đủ các thành phần cốt lõi (Role, Goal, Context, Constraint, Format) và áp dụng đúng kỹ thuật nâng cao được yêu cầu của bài đó.
*   **Phân tích kỹ thuật & Đánh giá (30 điểm):** Phần trình bày lập luận bằng văn bản của sinh viên về kiến trúc, sự đánh đổi hoặc thuật toán phải rõ ràng, logic và chính xác.
*   **Chất lượng mã nguồn Java sinh ra (40 điểm):** Mã nguồn Java do AI phản hồi (được sinh viên dán vào file bài làm) phải hoạt động chính xác, sạch sẽ, không lỗi cú pháp, có validate đầu vào, bắt ngoại lệ đầy đủ và tuân thủ đúng các ràng buộc nghiệp vụ/kỹ thuật của đề bài.

### 2. Tiêu chí chấm Bài 5 (Sáng tạo nâng cao - Max: 100 điểm)
*   **Phân tích & Thiết kế giải pháp (30 điểm):** Trình bày rõ ràng bài toán tự định nghĩa, sơ đồ luồng dữ liệu xử lý (khuyến khích sơ đồ ASCII) và cách giải quyết bài toán lệch múi giờ, lệch tiền.
*   **Chất lượng Prompt/Workflow (30 điểm):** Prompt có tính phòng thủ cao, lường trước các kịch bản What-if lệch múi giờ giao dịch giữa các hệ thống, cấu hình kiểm toán an toàn.
*   **Kiểm chứng thực tế & Mã nguồn (40 điểm):** Cung cấp đầy đủ text log hội thoại 3 bước trực tiếp trong file. Mã nguồn Java `ReconciliationService` do AI sinh ra phải hoàn chỉnh, có cơ chế chuẩn hóa thời gian ZonedDateTime, lưu vết log và phân loại giao dịch lỗi.

---

## PHẦN III: QUY ĐỊNH NỘP BÀI

1.  **Định dạng nộp bài:** Sinh viên nộp **01 file Markdown duy nhất (.md)**.
2.  **Cú pháp đặt tên file:** `SS08_[Họ_và_Tên]_[Mã_Sinh_Viên].md`
    *Ví dụ:* `SS08_NguyenVanA_HE150123.md`
3.  **Yêu cầu bắt buộc về minh chứng:**
    *   Tất cả các phần chạy thử nghiệm với AI (từ Bài 1 đến Bài 5) bắt buộc phải sao chép đầy đủ nội dung prompt và phản hồi của AI vào khối mã Markdown (code block). Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại (Share Link).
    *   **Tuyệt đối không sử dụng hình ảnh chụp màn hình (screenshot).** Bài nộp chứa hình ảnh hoặc link chia sẻ thay thế văn bản hội thoại sẽ bị AI chấm bài từ chối ghi nhận điểm phần thực nghiệm để bảo vệ tính trung thực học thuật.
