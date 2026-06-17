# BÀI TẬP VỀ NHÀ - SESSION 07
## Chủ đề: Kỹ thuật đặt Prompt nâng cao (Phần 2)

### Hướng dẫn làm bài:
*   Sinh viên đọc kỹ yêu cầu và thực hiện làm bài tập trực tiếp trên một file Markdown duy nhất.
*   Tuân thủ nghiêm ngặt **Hướng dẫn nộp bài** ở cuối tài liệu (chỉ nộp file văn bản `.md`, tuyệt đối không chụp ảnh màn hình).
*   Tất cả các bài chạy thử nghiệm với AI (từ Bài 1 đến Bài 5) bắt buộc phải sao chép đầy đủ nội dung prompt và phản hồi của AI vào khối mã Markdown (code block). Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại.

---

## PHẦN I: NỘI DUNG BÀI TẬP

### BÀI 1: Phân tích & Lựa chọn (Prompt viết hàm/code snippet theo mô tả) (100 điểm)
*   **Bối cảnh:** Bạn đang viết một phân hệ đồng bộ giao dịch cho hệ thống QuickPay. Định dạng dữ liệu thô nhận từ đối tác là chuỗi XML chứa thông tin giao dịch. Bạn cần viết một hàm Java 17 để đọc chuỗi XML này, kiểm duyệt điều kiện biên (số tiền `amount` phải lớn hơn 0, mã giao dịch `id` không được rỗng) và ánh xạ (map) chúng thành danh sách đối tượng `TransactionDTO`. Nếu giao dịch không hợp lệ, hệ thống phải ném ra ngoại lệ `InvalidTransactionException`.
*   **Đề bài:** Hãy lựa chọn prompt tối ưu nhất dưới đây để hướng dẫn AI viết hàm Java này một cách chính xác, xử lý triệt để lỗi phân tích cú pháp (XML Parsing) và dữ liệu biên. Giải thích lý do lựa chọn và chỉ ra nhược điểm của các phương án còn lại:
    *   **Phương án A:** `"Viết hộ tôi một hàm Java đọc chuỗi XML giao dịch và trả về danh sách TransactionDTO. Hãy bắt các lỗi dữ liệu."`
    *   **Phương án B:** `"Hãy đóng vai trò là một Java Tech Lead. Nhiệm vụ của bạn là viết một hàm Java 17 để chuyển đổi chuỗi XML giao dịch thành danh sách đối tượng TransactionDTO.
        [Đầu vào (Input)]
        - Một chuỗi XML đại diện cho danh sách giao dịch. Mỗi nút giao dịch gồm: <id>, <amount>, <status>.
        [Đầu ra (Output)]
        - Trả về đối tượng List<TransactionDTO>.
        - Định nghĩa TransactionDTO là một Java record gồm các trường: String id, double amount, String status.
        [Logic xử lý & Ràng buộc]
        - Sử dụng thư viện XML tích hợp sẵn của Java (như DOM hoặc SAX Parser).
        - Kiểm duyệt dữ liệu biên: số tiền amount phải lớn hơn 0, id không được null hoặc rỗng. Nếu vi phạm, ném ra ngoại lệ InvalidTransactionException.
        - Bắt và xử lý ngoại lệ an toàn nếu XML bị lỗi định dạng (XMLStreamException hoặc ParserConfigurationException).
        [Quy trình Dry-run CoT]
        Đừng viết code ngay lập tức. Hãy thực hiện theo các bước sau ra màn hình:
        1. Phác thảo thuật toán phân tích cú pháp XML bằng mã giả (Pseudocode).
        2. Chạy thử bằng tay (Dry-run) bằng văn bản với ca dữ liệu mẫu chứa một dòng XML bị thiếu thẻ đóng </id>. Giải thích cách code sẽ bắt lỗi đó.
        3. Cuối cùng, sinh ra mã nguồn Java hoàn chỉnh."`
    *   **Phương án C:** `"Hãy viết một class Java sử dụng Java Stream API song song và Spring XML Reader để đọc chuỗi XML giao dịch với hiệu năng cực cao, bỏ qua các dòng lỗi và lưu thẳng vào database."`
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (A, B hoặc C).
    *   Phân tích chi tiết tại sao phương án đó tối ưu nhất dựa trên cấu trúc 4 cấu phần kỹ thuật (Input, Processing, Output, Language) và kỹ thuật Dry-run CoT.
    *   Phân tích lý do loại trừ các phương án còn lại (chỉ rõ nhược điểm hoặc nguy cơ lỗi logic khi AI thực thi).
    *   Mã nguồn Java hoàn chỉnh do AI sinh ra dựa trên prompt tối ưu đã chọn (nằm trong khối code markdown).

---

### BÀI 2: Tối ưu Prompt (Thực hành viết Prompt giải nghĩa Stack Trace và gỡ lỗi) (100 điểm)
*   **Bối cảnh:** Bạn đang chạy thử nghiệm lớp `PaymentProcessor` trong dự án Spring Boot và gặp lỗi sập chương trình kèm theo dấu vết lỗi (Stack Trace) hiển thị trên màn hình console.
*   **Mã nguồn gây lỗi (Java):**
```java
import java.util.Map;

public class PaymentProcessor {
    private Map<String, Double> exchangeRates; // Chưa được khởi tạo (null)

    public double processPayment(String currency, double amount) {
        double rate = exchangeRates.get(currency); // Dòng gây lỗi NullPointerException
        return amount * rate;
    }
}
```
*   **Dấu vết lỗi xuất hiện ở Console (Stack Trace):**
    ```text
    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.Map.get(Object)" because "this.exchangeRates" is null
        at PaymentProcessor.processPayment(PaymentProcessor.java:7)
        at Main.main(Main.java:8)
    ```
*   **Prompt thô hiện tại:** `"Tôi bị lỗi NullPointerException ở PaymentProcessor, sửa hộ tôi."`
*   **Đề bài:** Prompt thô trên quá ngắn, thiếu mã nguồn đầy đủ và Stack Trace, dễ khiến AI suy đoán lung tung và đề xuất cách sửa thiếu an toàn. Hãy tối ưu lại prompt này áp dụng cấu trúc 5 thành phần để:
    1.  Yêu cầu AI đóng vai trò là chuyên gia gỡ lỗi Java (Java Debugger).
    2.  Cung cấp ngữ cảnh là mã nguồn gây lỗi và Stack Trace thực tế.
    3.  Ràng buộc AI phải giải thích nguyên nhân gốc rễ (Root Cause) của lỗi và đề xuất cách sửa chữa an toàn nhất (khởi tạo map bằng ConcurrentHashMap) mà không phá vỡ tính bao đóng (Encapsulation) của OOP.
*   **Yêu cầu đầu ra:**
    *   Nội dung Prompt sau khi tối ưu.
    *   Mã nguồn Java đã sửa hoàn chỉnh và giải thích lỗi do AI sinh ra (nằm trong khối code markdown).

---

### BÀI 3: Đọc hiểu & Dò lỗi qua Prompt (Tái cấu trúc/Tối ưu mã nguồn cũ - Clean Code) (100 điểm)
*   **Bối cảnh:** Bạn nhận bàn giao một lớp Java xuất báo cáo đơn hàng (`ReportGenerator`) từ một dự án cũ. Đoạn mã này vi phạm nghiêm trọng các tiêu chuẩn Clean Code: các vòng `if-else` và `for` lồng nhau sâu hoắm, hardcode đường dẫn, đặt tên biến kiểu viết tắt (`x`, `y`, `temp`), vi phạm SRP (Single Responsibility Principle) khi vừa đọc file, vừa tính toán tiền, vừa ghi file, và không có logging ghi vết.
*   **Mã nguồn chưa tối ưu (Java):**
    ```java
    import java.io.*;
    import java.util.*;

    public class ReportGenerator {
        public void gen(String f, String out) throws Exception {
            BufferedReader r = new BufferedReader(new FileReader(f));
            String l;
            double t = 0;
            List<String> list = new ArrayList<>();
            while ((l = r.readLine()) != null) {
                String[] p = l.split(",");
                if (p[2].equals("COMPLETED")) {
                    double amt = Double.parseDouble(p[1]);
                    if (amt > 100) {
                        t += amt;
                        list.add(p[0]);
                    }
                }
            }
            r.close();
            PrintWriter w = new PrintWriter(new FileWriter(out));
            w.println("Total: " + t);
            for (String id : list) {
                w.println("Order ID: " + id);
            }
            w.close();
            System.out.println("Done processing " + f);
        }
    }
    ```
*   **Đề bài:** Hãy thiết kế một chuỗi **Prompt Cải tiến đầu ra nâng cao (Refinement Chain) gồm 3 vòng** để yêu cầu AI refactor đoạn code trên thành mã nguồn chuẩn doanh nghiệp:
    *   **Vòng 1 (Robustness):** Bổ sung kiểm tra null, rỗng, xử lý ngoại lệ an toàn `IOException` và `NumberFormatException` (bỏ qua dòng lỗi mà không làm sập luồng).
    *   **Vòng 2 (Clean Code & SRP):** Tách lớp `ReportGenerator` thành các phương thức hoặc lớp riêng biệt đảm nhận các nhiệm vụ đơn nhất (Đọc file, Xử lý tính toán, Ghi file). Đổi tên biến rõ nghĩa theo quy ước CamelCase.
    *   **Vòng 3 (Logging & Context Tuning):** Tích hợp thư viện `Lombok` và `@Slf4j` để thay thế dòng lệnh `System.out.println()`. Trích xuất các tham số hardcode ra ngoài cấu hình hoặc truyền động qua tham số.
*   **Yêu cầu đầu ra:**
    *   Phần phân tích các lỗi vi phạm Clean Code của mã nguồn ban đầu.
    *   Chi tiết nội dung 3 lượt Prompt tương ứng với 3 vòng cải tiến.
    *   Mã nguồn Java hoàn chỉnh sau tối ưu do AI sinh ra (nằm trong khối code markdown).

---

### BÀI 4: Phân tích & Lựa chọn (Prompt yêu cầu thêm test case, kiểm thử logic) (100 điểm)
*   **Bối cảnh:** Bạn được giao viết unit test cho lớp `PasswordValidator` để kiểm thử độ mạnh của mật khẩu. Quy tắc mật khẩu hợp lệ bao gồm: độ dài từ 8 đến 20 ký tự, chứa ít nhất một chữ hoa, một chữ thường, một chữ số và một ký tự đặc biệt (như `@`, `#`, `$`, `%`). Việc viết test case phải bao phủ toàn bộ các trường hợp biên.
*   **Đề bài:** Hãy lựa chọn prompt tốt nhất giúp AI sinh ra bộ JUnit 5 test case đầy đủ và chuẩn xác nhất sử dụng Parameterized Test. Giải thích lý do lựa chọn và chỉ ra nhược điểm của các phương án còn lại:
    *   **Phương án A:** `"Hãy viết unit test cho class PasswordValidator của tôi, test các trường hợp mật khẩu hợp lệ và không hợp lệ."`
    *   **Phương án B:** `"Hãy đóng vai trò là một chuyên gia kiểm thử phần mềm (Senior QA Engineer). Nhiệm vụ của bạn là viết một class unit test sử dụng JUnit 5 và Assertions để kiểm thử toàn diện class PasswordValidator (bên dưới).
        Ràng buộc:
        - Sử dụng Parameterized Test (@ParameterizedTest, @ValueSource) để kiểm thử đồng thời nhiều mật khẩu.
        - Phải bao phủ toàn bộ các trường hợp biên (Edge Cases): mật khẩu null, chuỗi rỗng, mật khẩu chứa khoảng trắng, mật khẩu quá ngắn (7 ký tự), mật khẩu quá dài (21 ký tự), mật khẩu thiếu từng thành phần bắt buộc (thiếu chữ hoa, thiếu số, thiếu ký tự đặc biệt).
        - Trình bày dưới dạng mã nguồn Java JUnit 5 hoàn chỉnh kèm giải thích tiếng Việt."`
    *   **Phương án C:** `"Hãy viết lại hàm PasswordValidator sử dụng regex ngắn hơn để tôi không phải viết unit test."`
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (A, B hoặc C).
    *   Phân tích chi tiết tại sao phương án đó tối ưu nhất dựa trên các kỹ năng đặt prompt kiểm thử logic.
    *   Phân tích lý do loại trừ các phương án còn lại.
    *   Mã nguồn JUnit 5 test class do AI sinh ra dựa trên prompt tối ưu đã chọn (nằm trong khối code markdown).

---

### BÀI 5: Sáng tạo (Thiết kế Cổng Giải mã Cấu hình Bảo mật) (100 điểm)
*   **Bối cảnh:** Bạn đang xây dựng một module bảo mật (`SecurityDecryptor`) cho ứng dụng tài chính để giải mã chuỗi mật khẩu cơ sở dữ liệu (Database Password) đã được mã hóa bằng thuật toán AES. Mật khẩu mã hóa này được truyền vào dưới dạng một chuỗi cấu hình (Config string) hoặc lấy từ biến môi trường của hệ thống.
*   **Đề bài mở:** Hãy đóng vai trò là kỹ sư hệ thống, thiết kế quy trình tương tác với AI để giải quyết bài toán:
    1.  **Thiết kế Prompt sinh code giải mã:** Viết prompt yêu cầu AI tạo ra lớp `SecurityDecryptor` với phương thức `decrypt(String encryptedPassword, String secretKey)` sử dụng thuật toán AES trong Java. Thiết lập các ràng buộc về phiên bản Java 17, sử dụng thư viện bảo mật mặc định `javax.crypto`.
    2.  **Thiết kế kịch bản bẫy lỗi What-if:** Đưa kịch bản ngoại lệ vào prompt: *"Chuyện gì xảy ra nếu chuỗi mật khẩu bị rỗng, sai khóa giải mã (secretKey), hoặc key bị null? Làm thế nào để code bẫy các lỗi này (BadPaddingException, InvalidKeyException), ném ngoại lệ bảo mật tùy chỉnh `DecryptionException` và ghi log an toàn mà không làm rò rỉ thông tin nhạy cảm của mật khẩu gốc?"*
    3.  **Sinh mã nguồn:** Chạy thực tế prompt trên với AI để sinh ra mã nguồn Java hoàn chỉnh và bộ JUnit 5 test case đi kèm.
*   **Yêu cầu đầu ra:**
    *   Mô tả ngắn gọn ý đồ thiết kế quy trình giải mã và kiểm thử lỗi của bạn.
    *   Nội dung Prompt gửi AI (chứa cả kịch bản What-if).
    *   **Minh chứng thực tế:** Bắt buộc sao chép đầy đủ nội dung log chat dạng text/markdown trực tiếp vào file bài làm để minh họa kết quả chạy thực tế (tuyệt đối không nộp link chia sẻ hoặc ảnh chụp màn hình).

---

## PHẦN II: TIÊU CHÍ CHẤM ĐIỂM CHI TIẾT (DÀNH CHO AI CHẤM BÀI)

### 1. Tiêu chí chấm Bài 1 (Phân tích & Lựa chọn - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (20 điểm):** Chọn chính xác **Phương án B**.
*   **Phân tích lý do chọn (30 điểm):**
    *   Chỉ ra được sự đầy đủ 4 thành phần kỹ thuật trong prompt B: Input (chuỗi XML), Output (List DTO, Record DTO), Processing (DOM/SAX, validate biên, catch error), Language (Java 17) (15 điểm).
    *   Giải thích được quy trình Dry-run CoT giúp AI tư duy sâu, phác thảo thuật toán và chạy thử dữ liệu lỗi trước khi sinh code thực tế (15 điểm).
*   **Phân tích lý do loại trừ (20 điểm):**
    *   Chỉ rõ lỗi ở Phương án A: Quá thô sơ, thiếu các đặc tả định dạng đầu vào/đầu ra, khiến AI dễ chọn sai parser hoặc bỏ sót bẫy lỗi biên (10 điểm).
    *   Chỉ rõ lỗi ở Phương án C: Sử dụng thư viện ngoài không cần thiết (Spring XML Reader) và parallel stream cho tác vụ đọc XML đơn lẻ là lãng phí tài nguyên, đồng thời bỏ qua việc kiểm duyệt dữ liệu biên (10 điểm).
*   **Kết quả mã nguồn Java từ AI (30 điểm):** Mã nguồn record DTO và helper class Java 17 do AI sinh ra phải chính xác, bẫy lỗi XML parser và validate dữ liệu biên đúng yêu cầu nghiệp vụ.

### 2. Tiêu chí chấm Bài 2 (Tối ưu Prompt - Max: 100 điểm)
*   **Cấu trúc Prompt tối ưu (30 điểm):** Prompt sinh viên viết phải có đủ vai trò chuyên gia gỡ lỗi (10 điểm), cung cấp cả mã nguồn và Stack Trace lỗi (10 điểm), yêu cầu giải thích nguyên nhân và cách sửa (10 điểm).
*   **Xử lý ngoại lệ/Bẫy dữ liệu (30 điểm):** Prompt yêu cầu AI chỉ ra nguyên nhân do biến `exchangeRates` chưa được khởi tạo (15 điểm) và ràng buộc AI sửa lỗi bằng cách khởi tạo `new ConcurrentHashMap<>()` để an toàn đa luồng mà không phá vỡ tính bao đóng (15 điểm).
*   **Kết quả đầu ra từ AI (40 điểm):** Đoạn mã Java do AI sinh ra phải khởi tạo Map an toàn, tránh lỗi sập NullPointerException, code sạch chuẩn OOP.

### 3. Tiêu chí chấm Bài 3 (Refactor Clean Code - Max: 100 điểm)
*   **Phân tích các lỗi vi phạm (30 điểm):** Chỉ ra được các lỗi: (1) Nested loops/conditions quá sâu; (2) Hardcode file path; (3) Tên biến x, y, temp vô nghĩa; (4) Hàm `gen` vi phạm SRP (làm quá nhiều việc); (5) System.out.println() không chuẩn.
*   **Chuỗi Prompt 3 vòng cải tiến (30 điểm):**
    *   Vòng 1 tập trung vào Robustness (IOException, NumberFormatException) (10 điểm).
    *   Vòng 2 tập trung vào Clean Code & SRP (tách method/class, rename) (10 điểm).
    *   Vòng 3 tập trung vào Logging (Lombok, SLF4J) & Config trích xuất (10 điểm).
*   **Kết quả đầu ra từ AI (40 điểm):** Mã nguồn Java do AI sinh ra phải tách bạch các module đơn nhiệm, sử dụng đúng SLF4J, bắt lỗi số học và I/O an toàn.

### 4. Tiêu chí chấm Bài 4 (Phân tích & Lựa chọn - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (20 điểm):** Chọn chính xác **Phương án B**.
*   **Phân tích lý do chọn (30 điểm):**
    *   Chỉ ra được Phương án B định hình rõ vai trò QA, yêu cầu sử dụng JUnit 5 Parameterized Test và liệt kê chi tiết các case biên cụ thể cần kiểm thử (15 điểm).
    *   Giải thích được việc hướng dẫn này giúp bộ unit test sinh ra bao phủ toàn bộ các lỗ hổng bảo mật của mật khẩu (15 điểm).
*   **Phân tích lý do loại trừ (20 điểm):**
    *   Chỉ rõ lỗi ở Phương án A: AI sẽ sinh ra các test case sơ sài, thiếu các case biên quan trọng (như null, khoảng trắng) (10 điểm).
    *   Chỉ rõ lỗi ở Phương án C: Trốn tránh viết unit test là không thể chấp nhận được, Regex phức tạp không thay thế được việc kiểm thử và dễ sinh lỗi ngầm (10 điểm).
*   **Kết quả mã nguồn Java từ AI (30 điểm):** Mã nguồn JUnit 5 test class do AI sinh ra phải sử dụng `@ParameterizedTest`, `@ValueSource` (hoặc `@MethodSource`) và có đầy đủ test case cho cả mật khẩu hợp lệ và không hợp lệ.

### 5. Tiêu chí chấm Bài 5 (Sáng tạo - Max: 100 điểm)
*   **Thiết kế quy trình và ý đồ (30 điểm):** Mô tả rõ ràng mục tiêu thiết kế giải mã an toàn, các bước xử lý ngoại lệ và logging.
*   **Chất lượng Prompt/Workflow (30 điểm):** Prompt đầy đủ thông số thuật toán (AES), chỉ rõ kịch bản What-if khi secretKey null hoặc sai, yêu cầu ném `DecryptionException` tùy chỉnh để bảo mật thông tin (30 điểm).
*   **Kiểm chứng thực tế & Mã nguồn (40 điểm):** Sao chép đầy đủ log chat. Kết quả cho thấy mã nguồn Java cuối cùng giải mã chính xác, bẫy lỗi crypto tốt, ghi log SLF4J đầy đủ và đi kèm JUnit test class kiểm thử logic.

---

## PHẦN III: QUY ĐỊNH NỘP BÀI

1.  **Định dạng nộp bài:** Sinh viên nộp **01 file Markdown duy nhất (.md)**.
2.  **Cú pháp đặt tên file:** `SS07_[Họ_và_Tên]_[Mã_Sinh_Viên].md`
    *Ví dụ:* `SS07_NguyenVanA_HE150123.md`
3.  **Yêu cầu bắt buộc về minh chứng:**
    *   Tất cả các phần chạy thử nghiệm với AI (từ Bài 1 đến Bài 5) bắt buộc phải sao chép đầy đủ nội dung prompt và phản hồi của AI vào khối mã Markdown (code block). Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại (Share Link).
    *   **Tuyệt đối không sử dụng hình ảnh chụp màn hình (screenshot).** Bài nộp chứa hình ảnh hoặc link chia sẻ thay thế văn bản hội thoại sẽ bị AI chấm bài từ chối ghi nhận điểm phần thực nghiệm để bảo vệ tính trung thực học thuật.
