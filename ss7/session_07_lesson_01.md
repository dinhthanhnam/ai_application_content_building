# Session 07 - Lesson 01: Prompt viết hàm/code snippet theo mô tả

## 1. Mục tiêu học tập
Sau khi hoàn thành Lesson này, người học có thể:
- Nắm vững cấu trúc 4 thành phần bắt buộc của một Prompt sinh mã nguồn chuyên nghiệp.
- Phân tích và áp dụng kỹ thuật Chain-of-Thought (CoT) nâng cao thành cơ chế "Tư duy luồng chạy nháp" (Dry-run CoT) trực tiếp trong prompt sinh code.
- Thực hiện thiết kế câu lệnh sinh code có ràng buộc rõ ràng để giải quyết các tác vụ xử lý dữ liệu phức tạp trong Java.
- Áp dụng kỹ thuật sinh code tự động để tăng tốc độ phát triển dự án, giảm thiểu thời gian gõ cú pháp Boilerplate mà vẫn kiểm soát được chất lượng logic.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric illustration of a modern software development environment. A glowing keyboard projects clean lines of Java code into a floating translucent blueprint of a data pipeline. A robotic arm carefully installs custom-tailored filter components labeled "Constraint Checkers" into the pipeline. Colorful cybernetic tech aesthetic, neon blue and orange lighting, clean vector style, 8k.

---

## 2. Đặt vấn đề thực tế
Trong quá trình phát triển phân hệ lịch sử giao dịch cho ứng dụng thanh toán QuickPay, lập trình viên nhận được một tệp tin dữ liệu thô dạng CSV từ đối tác thứ ba. Dữ liệu bao gồm các cột: `id` (mã giao dịch), `amount` (số tiền), và `status` (trạng thái: SUCCESS hoặc FAILED). Nhiệm vụ của lập trình viên là viết một hàm Java để đọc từng dòng CSV, kiểm duyệt dữ liệu thô này và ánh xạ (map) sang danh sách các đối tượng DTO (`TransactionDTO`).

Do áp lực thời gian, lập trình viên viết một Prompt nhanh gửi cho AI: *"Viết hộ tôi một hàm Java đọc và chuyển đổi một chuỗi CSV thành List TransactionDTO."*

Kết quả, AI nhanh chóng trả về một đoạn code Java. Tuy nhiên, khi đưa vào chạy thử nghiệm với dữ liệu thực tế, chương trình liên tục bị sập (Crash) do gặp phải:
1. Các dòng dữ liệu CSV trống hoặc bị thiếu cột.
2. Cột `amount` chứa các ký tự đặc biệt hoặc chuỗi chữ cái không thể chuyển đổi thành số (`NumberFormatException`).
3. Trạng thái giao dịch bị viết thường hoặc không đúng chuẩn nghiệp vụ.

Nguyên nhân do đâu? Prompt thô của lập trình viên hoàn toàn thiếu đi các thông số kỹ thuật (Inputs/Outputs) và không chỉ định rõ ràng các điều kiện biên. Làm thế nào để viết Prompt sinh mã nguồn mà AI có thể tự động bao phủ toàn bộ các lỗi biên và hoạt động chính xác ngay từ lần đầu tiên?

---

## 3. Kiến thức cốt lõi

### 3.1. Khung cấu trúc Prompt sinh mã nguồn tiêu chuẩn
Để sinh ra một đoạn mã nguồn chất lượng cao, sẵn sàng chạy thực tế, Prompt của bạn bắt buộc phải định hình rõ 4 cấu phần kỹ thuật sau:
- **Input (Dữ liệu đầu vào):** Xác định rõ kiểu dữ liệu, cấu trúc (ví dụ: chuỗi CSV phân tách bằng dấu phẩy) và các giá trị biên (nhập null, chuỗi rỗng).
- **Processing Logic (Logic xử lý):** Các quy tắc toán học, thứ tự thực thi và cách thức xử lý lỗi (Exception Handling) khi gặp dữ liệu dị biệt.
- **Output (Dữ liệu đầu ra):** Định nghĩa rõ kiểu dữ liệu trả về (ví dụ: `List<TransactionDTO>`), các lớp DTO cần thiết.
- **Explicit Language/Technology (Chỉ định công nghệ):** Nêu rõ phiên bản ngôn ngữ (ví dụ: Java 17) và thư viện được phép hoặc không được phép sử dụng.

### 3.2. Kỹ thuật "Tư duy luồng chạy nháp" (Dry-run CoT) nâng cao
Kỹ thuật Chain-of-Thought (CoT) giúp AI suy luận từng bước. Trong lập trình, chúng ta có thể nâng cấp kỹ thuật này bằng cách yêu cầu AI thực hiện một bước **"Chạy nháp logic" (Dry-run)** trước khi sinh code. 
Cụ thể, chúng ta ràng buộc AI phải:
1. Phác thảo thuật toán bằng mã giả (Pseudocode) hoặc văn bản mô tả từng dòng.
2. Mô phỏng luồng chạy nháp bằng một ca dữ liệu mẫu cụ thể có lỗi biên (ví dụ: một dòng CSV lỗi) để giải thích cách code sẽ bắt lỗi đó.
3. Cuối cùng mới xuất ra mã nguồn Java hoàn chỉnh.

Quy trình này ép AI phân tích logic nghiệp vụ sâu trước khi cam kết viết các dòng lệnh Java, tránh tối đa hiện tượng ảo giác cú pháp.

```
+-----------------------------------------------------------+
|                    QUY TRÌNH DRY-RUN COT                  |
+-----------------------------------------------------------+
|  1. Nhận bối cảnh  -->  2. Phân tích  -->  3. Chạy nháp   |
|   & Ràng buộc code        thuật toán        dữ liệu biên  |
+-----------------------------------------------------------+
                               |
                               v
                    4. Sinh mã nguồn Java 17
```

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Dự án ví điện tử cần tích hợp dữ liệu giao dịch hàng ngày từ đối tác để đối soát. Dữ liệu truyền sang là chuỗi văn bản dài, mỗi dòng là một giao dịch dạng: `ID,Amount,Status` (ví dụ: `TXN001,150000,SUCCESS`).

### Thách thức
Dữ liệu thô truyền sang thường xuyên bị lỗi định dạng (dòng trống, số tiền âm, trạng thái không hợp lệ). Nếu viết code thủ công thì mất thời gian bẫy lỗi; nếu dùng AI sinh code thô thì code thiếu an toàn và dễ sập ứng dụng.

### Cách tiếp cận bằng Dry-run CoT
Kỹ sư thiết kế một Prompt chi tiết, tích hợp đầy đủ 4 thành phần sinh mã nguồn kết hợp với yêu cầu AI chạy nháp logic với dữ liệu lỗi trước khi sinh code.

### Kết quả
AI hiểu rõ nghiệp vụ, tự giải thích cách nó sẽ dùng hàm `split(",")` kết hợp khối lệnh `try-catch` để bẫy lỗi `NumberFormatException`. Khối mã Java 17 Stream trả về hoạt động vô cùng mượt mà, tự động bỏ qua các dòng lỗi và chỉ trả về danh sách DTO hợp lệ.

---

## 5. Demo minh họa

### Mục tiêu demo
Thực hành viết Prompt nâng cấp (CoT + Code Gen) để AI sinh ra lớp Java 17 xử lý chuỗi CSV an toàn, bẫy toàn bộ lỗi biên.

### Các bước thực hiện
1. Soạn thảo Prompt với đầy đủ 4 thành phần kỹ thuật kèm yêu cầu chạy nháp.
2. Chạy thử trên AI Assistant và thu về kết quả mã nguồn Java.

#### Prompt thực hành tối ưu:
```text
Hãy đóng vai trò là một Java Tech Lead.
Nhiệm vụ của bạn là viết một hàm Java 17 để chuyển đổi chuỗi dữ liệu CSV (lịch sử giao dịch) thành danh sách đối tượng TransactionDTO.

[Đầu vào (Input)]
- Một chuỗi văn bản multi-line đại diện cho file CSV. Mỗi dòng có cấu trúc: "id,amount,status".
- Ví dụ đầu vào:
  TXN001,150000,SUCCESS
  TXN002,,FAILED
  TXN003,abc,SUCCESS
  
[Đầu ra (Output)]
- Trả về đối tượng List<TransactionDTO>.
- Định nghĩa TransactionDTO là một Java record gồm các trường: String id, double amount, String status.

[Logic xử lý và Ràng buộc]
- Phải bỏ qua dòng tiêu đề nếu có hoặc dòng trống.
- Nếu dòng CSV thiếu cột hoặc số tiền không thể parse thành kiểu double (ví dụ chuỗi "abc"), hãy in ra log cảnh báo (System.err.println) và bỏ qua dòng đó (không làm sập chương trình).
- Số tiền (amount) phải là số dương (> 0), nếu <= 0 hãy bỏ qua dòng đó.

[Quy trình Dry-run CoT]
Trước khi viết mã nguồn Java, bạn bắt buộc phải thực hiện các bước sau:
1. Giải thích ngắn gọn cách bạn xử lý bẫy dữ liệu lỗi "TXN003,abc,SUCCESS".
2. Mô phỏng luồng duyệt dữ liệu này bằng mã giả.
3. Cuối cùng, sinh mã nguồn Java hoàn chỉnh, sạch và tối ưu.
```

#### Kết quả mã nguồn Java 17 mong đợi sinh từ AI:
```java
import java.util.ArrayList;
import java.util.List;

public class TransactionParser {

    public record TransactionDTO(String id, double amount, String status) {}

    public static List<TransactionDTO> parseTransactions(String csvData) {
        List<TransactionDTO> result = new ArrayList<>();
        if (csvData == null || csvData.isBlank()) {
            return result;
        }

        String[] lines = csvData.split("\n");
        for (String line : lines) {
            String trimmedLine = line.trim();
            if (trimmedLine.isEmpty() || trimmedLine.startsWith("id")) {
                continue; // Bỏ qua dòng trống hoặc tiêu đề
            }

            String[] tokens = trimmedLine.split(",");
            if (tokens.length < 3) {
                System.err.println("Cảnh báo: Dòng thiếu cột -> " + trimmedLine);
                continue;
            }

            String id = tokens[0].trim();
            String amountStr = tokens[1].trim();
            String status = tokens[2].trim();

            try {
                double amount = Double.parseDouble(amountStr);
                if (amount <= 0) {
                    System.err.println("Cảnh báo: Số tiền phải là số dương -> " + trimmedLine);
                    continue;
                }
                result.add(new TransactionDTO(id, amount, status));
            } catch (NumberFormatException e) {
                System.err.println("Cảnh báo: Định dạng số tiền không hợp lệ -> " + trimmedLine);
            }
        }
        return result;
    }
}
```

---

## 6. Tổng kết
- Một Prompt sinh code an toàn phải chứa đầy đủ 4 thành phần kỹ thuật (Input, Output, Logic, Technology).
- Việc nhúng thêm yêu cầu Dry-run CoT ép AI phân tích các ca dữ liệu lỗi (Edge cases) trước khi viết code, triệt tiêu lỗi ảo giác logic.
- Luôn kiểm soát chặt chẽ kiểu trả về bằng cách định nghĩa trước cấu trúc đối tượng (như sử dụng Java Record) trong prompt.

---

## 7. Câu hỏi đánh giá

**Câu 1:** Trình bày 4 thành phần bắt buộc của một Prompt sinh mã nguồn chuyên nghiệp và giải thích tại sao việc thiếu "Ràng buộc dữ liệu đầu vào" lại dễ khiến code của AI sinh ra bị lỗi sập (crash) trong môi trường thực tế.

*Gợi ý đáp án:*
- **4 thành phần:** Input, Processing Logic, Output, và Explicit Language/Technology.
- **Giải thích:** Nếu thiếu ràng buộc dữ liệu đầu vào (nhập null, chuỗi rỗng, dữ liệu sai định dạng), AI mặc định sẽ giả định dữ liệu luôn đúng (Happy Path). Do đó, AI sẽ không viết các khối lệnh bẫy lỗi `try-catch`, kiểm tra null, dẫn đến việc khi chương trình chạy thực tế gặp dữ liệu lỗi sẽ lập tức bị crash bởi các ngoại lệ runtime như `NullPointerException` hay `NumberFormatException`.

**Câu 2:** Hãy phân tích ưu điểm của kỹ thuật "Tư duy luồng chạy nháp" (Dry-run CoT) so với kỹ thuật Chain-of-Thought thông thường khi viết code.

*Gợi ý đáp án:*
- Kỹ thuật CoT thông thường chỉ đơn thuần là yêu cầu AI liệt kê các bước giải quyết vấn đề bằng suy luận logic chung trước khi đưa ra đáp án.
- Kỹ thuật Dry-run CoT nâng cao bằng cách buộc AI thực hiện giả lập luồng chạy thực tế (mã giả hoặc kiểm thử dòng dữ liệu biên cụ thể) đối với đoạn mã nguồn chuẩn bị sinh. Việc này giúp AI đóng vai trò như một trình biên dịch nháp, phát hiện ra các ngoại lệ logic cụ thể của ngôn ngữ (ví dụ lỗi định dạng số trong Java) để tự động thêm các đoạn code phòng vệ (defensive programming) vào mã nguồn cuối cùng.

**Câu 3 (Thực chiến):** Bạn cần sinh một hàm Java để tính toán số tiền lãi gửi tiết kiệm cuối kỳ. Đầu vào gồm: số tiền gửi gốc (`principal`), lãi suất năm (`annualRate`), và số tháng gửi (`months`). Lãi suất được tính theo công thức lũy tiến hàng tháng: $A = P \times (1 + r/12)^n$. Hãy thiết kế một prompt tối ưu kết hợp 4 thành phần sinh code và kỹ thuật Dry-run CoT để AI sinh mã nguồn Java chính xác, an toàn, sử dụng `BigDecimal` để tính toán tiền tệ.

*Gợi ý đáp án (Tham khảo Prompt sau):*
```text
Hãy đóng vai trò là một Senior Java Developer.
Nhiệm vụ của bạn là viết một hàm Java tính toán số tiền tích lũy cả gốc lẫn lãi cuối kỳ.

[Đầu vào (Input)]
- principal (BigDecimal): Số tiền gửi gốc. Ràng buộc: phải lớn hơn 0.
- annualRate (double): Lãi suất năm (ví dụ 0.06 tương đương 6%/năm). Ràng buộc: từ 0 đến 1.
- months (int): Số tháng gửi tiết kiệm. Ràng buộc: phải lớn hơn 0.

[Đầu ra (Output)]
- Trả về một đối tượng BigDecimal biểu diễn số tiền cuối kỳ sau khi tính lãi, làm tròn đến 2 chữ số thập phân (sử dụng RoundingMode.HALF_UP).

[Logic xử lý]
- Áp dụng công thức tính lãi kép hàng tháng: A = principal * (1 + annualRate / 12) ^ months.
- Nếu các tham số đầu vào vi phạm ràng buộc dữ liệu, ném ra ngoại lệ IllegalArgumentException kèm thông báo chi tiết.

[Quy trình Dry-run CoT]
Trước khi viết mã nguồn Java, hãy thực hiện:
1. Giải thích cách bạn sử dụng lớp BigDecimal để tính lũy thừa (MathContext hoặc hàm loop nhân lũy tiến) nhằm tránh sai số dấu phẩy động.
2. Trình bày mã giả mô tả thuật toán.
3. Sinh mã nguồn Java 17 hoàn chỉnh, sạch và có ghi chú rõ ràng.
```
