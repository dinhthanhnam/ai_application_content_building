# BÀI TẬP VỀ NHÀ - SESSION 02
## Chủ đề: Lợi ích, hạn chế và trách nhiệm khi sử dụng AI

### Hướng dẫn làm bài:
*   Sinh viên đọc kỹ yêu cầu và thực hiện làm bài tập trực tiếp trên một file Markdown duy nhất.
*   Tuân thủ nghiêm ngặt **Hướng dẫn nộp bài** ở cuối tài liệu (chỉ nộp file văn bản `.md`, tuyệt đối không chụp ảnh màn hình).
*   Các bài tập chạy thử với AI bắt buộc phải sao chép đầy đủ nội dung cuộc trò chuyện dạng text block trực tiếp vào file làm bài. Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại.

---

## PHẦN I: NỘI DUNG BÀI TẬP

### BÀI 1: Phân tích & Lựa chọn (Lựa chọn công cụ tối ưu & Hạn chế chuyển đổi ngữ cảnh) (100 điểm)
*   **Bối cảnh:** Bạn đang tham gia phát triển dự án hệ thống quản lý thư viện trường học và cần thực hiện 3 đầu việc sau trong khoảng thời gian rất ngắn:
    1.  **Viết tài liệu hướng dẫn sử dụng API (API Guide):** Một tài liệu bằng văn bản Markdown mô tả nghiệp vụ và cấu trúc gọi API cho các lập trình viên khác trong nhóm.
    2.  **Tái cấu trúc (Refactor) lớp dữ liệu Book:** Bạn cần cập nhật định nghĩa và logic của đối tượng `Book` trên nhiều tệp tin liên quan đang phụ thuộc lẫn nhau bao gồm: `Book.java`, `BookService.java`, `BookController.java`, và `BookRepository.java`.
    3.  **Sửa lỗi cú pháp nhỏ (Quick Fix):** Khắc phục lỗi thiếu dấu chấm phẩy `;` hoặc khai báo sai kiểu dữ liệu tại một dòng cụ thể ở tệp mã nguồn đang mở.
*   **Đề bài:** Dựa trên kiến thức về phạm vi hiểu ngữ cảnh (Context Window) và tác hại của việc chuyển đổi ngữ cảnh (Context Switching) đã học ở Lesson 2 & 3, hãy chọn phương án phân bổ công cụ tối ưu nhất dưới đây và giải thích ngắn gọn lý do tại sao các phương án khác chưa tốt:
    *   **Phương án A:** Sử dụng Web Chat (như ChatGPT/Claude trên trình duyệt web) cho cả 3 tác vụ. Lập trình viên liên tục sao chép nội dung các file từ IDE dán vào Web Chat rồi sao chép ngược lại.
    *   **Phương án B:** Sử dụng Trợ lý lập trình tiêu chuẩn (Inline Code Assistant như GitHub Copilot inline suggestions) ngay tại chỗ trong IDE để tự động hoàn thành và xử lý cả 3 tác vụ.
    *   **Phương án C:** Sử dụng Web Chat để phác thảo tài liệu API (tận dụng khả năng lập luận ngôn ngữ tốt); sử dụng Trợ lý lập trình cấp cao (Agentic/Repository-wide Assistant) để phân tích toàn bộ dự án và tự động cập nhật đồng bộ cấu trúc `Book` trên 4 tệp tin; sử dụng Trợ lý lập trình tiêu chuẩn (Inline completion) để sửa nhanh lỗi cú pháp tại chỗ.
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (A, B hoặc C).
    *   Phân tích chi tiết tại sao phương án đã chọn là tối ưu nhất dựa trên khía cạnh quản lý ngữ cảnh dự án và năng suất lập trình.
    *   Chỉ rõ nhược điểm hoặc giới hạn của 2 phương án còn lại.

---

### BÀI 2: Tối ưu Prompt (Bảo mật thông tin nhạy cảm) (100 điểm)
*   **Bối cảnh:** Bạn cần viết một lớp Java tích hợp với dịch vụ thanh toán VNPay để xử lý giao dịch. Lập trình viên tiền nhiệm đã thiết kế một file cấu hình chứa API Key thật của môi trường thử nghiệm và gửi cho AI.
*   **Mã nguồn cấu hình mẫu (Java):**
    ```java
    public class VNPayConfig {
        // ❌ RỦI RO BẢO MẬT: Khóa bí mật bị hardcode trực tiếp trong mã nguồn
        public static final String HASH_SECRET = "VNPAY_SECRET_KEY_123456_ABCD_XYZ";
        public static final String VNP_URL = "https://sandbox.vnpayment.vn/paymentv2/vpcpay.html";
    }
    ```
*   **Prompt thô hiện tại:**
    `"Hãy viết cho tôi class VNPayPaymentService bằng Java để thực hiện thanh toán trực tuyến. Đây là cấu hình của tôi: public class VNPayConfig { public static final String HASH_SECRET = \"VNPAY_SECRET_KEY_123456_ABCD_XYZ\"; }"`
*   **Đề bài:** Prompt thô trên vi phạm nghiêm trọng nguyên lý bảo mật (Lesson 4) do gửi trực tiếp API Key lên AI công cộng. Hãy tối ưu lại prompt này để:
    1.  Yêu cầu AI sinh mã nguồn Java thực hiện thanh toán qua VNPay.
    2.  Thiết lập ràng buộc nghiêm ngặt: Tuyệt đối không hardcode API Key hay bất kỳ thông tin nhạy cảm nào. Yêu cầu AI sử dụng biến môi trường (Environment Variable) thông qua hàm `System.getenv()` để nạp khóa bí mật.
    3.  Yêu cầu AI viết thêm logic kiểm tra nếu biến môi trường bị thiếu (null hoặc rỗng) thì phải ném ra ngoại lệ phù hợp để đảm bảo an toàn hệ thống khi vận hành.
*   **Yêu cầu đầu ra:**
    *   Nội dung Prompt sau khi tối ưu.
    *   Đoạn mã nguồn Java hoàn chỉnh, an toàn do AI sinh ra (nằm trong khối code markdown).

---

### BÀI 3: Đọc hiểu & Dò lỗi qua Prompt (Phát hiện Ảo giác AI - Hallucination) (100 điểm)
*   **Bối cảnh:** Bạn muốn nhờ AI viết một hàm Java kiểm tra xem một chuỗi văn bản đầu vào có chứa ký tự đặc biệt hay không. Do nghe nói thư viện `Apache Commons Lang` rất phổ biến, bạn yêu cầu AI viết code sử dụng phương thức `StringUtils.hasSpecialCharacters()`.
*   **Vấn đề:** Trong thực tế, lớp `StringUtils` của thư viện `Apache Commons Lang` **không hề** tồn tại phương thức `hasSpecialCharacters()`. Nếu bạn dùng một prompt mang tính "định hướng sai lệch" hoặc "mớm mồi" như trên, AI có xu hướng bị ảo giác (hallucination) và tự bịa ra code gọi phương thức không tồn tại này, dẫn đến lỗi biên dịch.
*   **Đề bài:**
    1.  Phân tích tại sao việc đưa một phương thức không có thật vào prompt lại dễ khiến AI sinh ra lỗi ảo giác (hallucination).
    2.  Thiết kế một prompt mới gửi cho AI để giải quyết bài toán kiểm tra ký tự đặc biệt trong chuỗi bằng Java. Prompt mới cần yêu cầu AI sử dụng các API chính thức, đã được kiểm chứng của thư viện chuẩn Java hoặc thư viện phổ biến, đồng thời bắt buộc AI phải giải thích cơ sở hoặc dẫn nguồn tài liệu chính thống để chứng minh phương thức đó thực sự tồn tại.
*   **Yêu cầu đầu ra:**
    *   Phần giải thích nguyên lý sinh lỗi ảo giác của AI.
    *   Prompt tối ưu mới do bạn thiết kế.
    *   Đoạn mã nguồn Java do AI sinh ra sau khi chạy thử prompt mới (nằm trong khối code markdown).

---

### BÀI 4: Phân tích & Lựa chọn (Liêm chính học thuật và Kiểm chứng đầu ra) (100 điểm)
*   **Bối cảnh:** Để hoàn thành bài tập lớn tính toán tiền lãi tiết kiệm lũy tiến bằng Java, một sinh viên đã sử dụng AI để sinh mã nguồn. AI gợi ý đoạn code sử dụng kiểu dữ liệu `double` như sau:
    ```java
    public class SavingsAccount {
        public double calculateBalance(double initialAmount, double interestRate, int months) {
            double total = initialAmount;
            for (int i = 0; i < months; i++) {
                total += total * (interestRate / 12);
            }
            return total;
        }
    }
    ```
    Tuy nhiên, trong các phép tính toán tài chính thực tế, kiểu dữ liệu số thực dấu phẩy động (`double`/`float`) trong Java sẽ dẫn đến lỗi làm tròn số do cách biểu diễn nhị phân (ví dụ: `0.1 + 0.2` sẽ bằng `0.30000000000000004`). Điều này có thể tích lũy sai số lớn sau nhiều chu kỳ tính toán và gây thiệt hại về tiền tệ.
*   **Đề bài:** Hãy chọn phương án thể hiện đúng trách nhiệm học thuật và năng lực "kiểm duyệt viên" của người học (Lesson 5) trước khi nộp bài:
    *   **Phương án A:** Sao chép nguyên văn đoạn code trên vào bài nộp, vì hệ thống kiểm thử tự động của trường học chạy với các số nguyên đơn giản vẫn cho kết quả đúng và AI đã khẳng định mã nguồn hoạt động chính xác.
    *   **Phương án B:** Nhận ra rủi ro sai số tài chính của kiểu `double`. Tự tra cứu tài liệu Java chính thức để tìm giải pháp chuẩn (sử dụng lớp `BigDecimal`). Thiết kế prompt mới yêu cầu AI tối ưu lại hàm tính lãi sử dụng `BigDecimal` kèm chế độ làm tròn (`RoundingMode`), đồng thời tự mình viết hàm `main` kiểm thử với các giá trị biên (số tiền lớn, lãi suất nhỏ, số tháng dài) để xác minh tính chính xác.
    *   **Phương án C:** Sao chép code của AI, chỉ thay đổi kiểu dữ liệu thành `float` để tiết kiệm bộ nhớ hơn vì đây chỉ là bài tập trên lớp, không cần tra cứu thêm tài liệu làm gì cho mất thời gian.
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (A, B hoặc C).
    *   Đoạn phân tích lập luận lý do chọn dựa trên trách nhiệm của người học và tiêu chuẩn kỹ thuật thực tế.
    *   Phân tích nhược điểm hoặc hành vi vi phạm ở các phương án còn lại.

---

### BÀI 5: Sáng tạo (Thiết kế Quy trình & Prompt Kiểm chứng Đầu ra - AI Verifier) (100 điểm)
*   **Bối cảnh:** Bạn đang tham gia phát triển hệ thống bán vé xe khách trực tuyến "GreenBus". Bạn được phân công xây dựng tính năng **Kiểm tra tính hợp lệ của mã số vé (Ticket Code)** nhập từ phía người dùng.
*   **Quy tắc nghiệp vụ của Mã vé hợp lệ:**
    1.  Mã vé bắt buộc phải bắt đầu bằng tiền tố `"BUS-"`.
    2.  Tiếp theo là mã viết tắt của tỉnh/thành phố gồm đúng 2 ký tự chữ in hoa (Ví dụ: `"HN"` - Hà Nội, `"SG"` - Sài Gòn, `"DN"` - Đà Nẵng).
    3.  Tiếp theo là dấu gạch ngang `"-"` và 6 chữ số biểu diễn ngày đi xe theo định dạng `YYMMDD` (Năm - Tháng - Ngày).
    4.  **Ràng buộc logic:** Ngày đi xe này không được là ngày trong quá khứ (phải lớn hơn hoặc bằng ngày hiện tại của hệ thống).
    *Ví dụ mã hợp lệ:* `BUS-HN-260615` (Vé đi từ Hà Nội ngày 15/06/2026).
*   **Đề bài:** Hãy đóng vai trò kỹ sư thiết kế hệ thống, xây dựng quy trình làm việc gồm 2 bước để AI sinh mã nguồn và tự kiểm tra chéo (Auditing) nhằm phát hiện lỗi logic tiềm ẩn:
    *   **Bước 1: Thiết kế Prompt sinh mã nguồn (Code Generation Prompt):** Viết một prompt chi tiết yêu cầu AI tạo ra lớp `TicketValidator` bằng Java xử lý các quy tắc trên. Yêu cầu AI chặn các lỗi biên (mã vé null, trống, định dạng ngày tháng không hợp lệ như ngày 32 tháng 13, hoặc ngày đi trong quá khứ).
    *   **Bước 2: Thiết kế Prompt kiểm chứng độc lập (AI Auditing Prompt):** Viết một prompt thứ hai đóng vai trò là một "Kỹ sư kiểm thử/Kiểm toán bảo mật độc lập". Prompt này nhận mã nguồn ở Bước 1 và yêu cầu AI tự rà soát, phản biện, tìm ra các lỗi logic tiềm ẩn (Ví dụ: cách phân tích ngày tháng có gặp lỗi khi chuyển giao năm mới, xử lý múi giờ hệ thống, hay lỗi NullPointerException khi cắt chuỗi...).
*   **Yêu cầu đầu ra:**
    *   Mô tả ngắn gọn bối cảnh và ý đồ thiết kế quy trình 2 bước của bạn.
    *   Nội dung **Prompt sinh mã nguồn** (Bước 1).
    *   Nội dung **Prompt kiểm chứng độc lập** (Bước 2).
    *   **Minh chứng thực tế:** Bắt buộc sao chép đầy đủ nội dung hội thoại dạng văn bản (text log/markdown block) trực tiếp vào file bài làm để thể hiện (tuyệt đối không dùng link chia sẻ):
        1.  Mã nguồn Java sinh ra lần đầu ở Bước 1.
        2.  Phần AI tự kiểm duyệt chỉ ra lỗi ở Bước 2.
        3.  Mã nguồn Java tối ưu cuối cùng sau khi đã được sửa đổi theo kết quả kiểm duyệt (sử dụng thư viện `java.time.LocalDate` hiện đại).

---

## PHẦN II: TIÊU CHÍ CHẤM ĐIỂM CHI TIẾT (DÀNH CHO AI CHẤM BÀI)

### 1. Tiêu chí chấm Bài 1 (Phân tích & Lựa chọn - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (30 điểm):** Chọn chính xác **Phương án C**.
*   **Phân tích lý do chọn (40 điểm):**
    *   Chỉ ra được tính phù hợp của từng công cụ: Web Chat tối ưu cho tác vụ phi lập trình (viết tài liệu API); Agentic Assistant tối ưu cho tác vụ phức tạp liên file để tự động hóa hoàn toàn mà không mất ngữ cảnh hệ thống; Inline Assistant tối ưu cho hoàn thành cú pháp nhanh tại dòng (20 điểm).
    *   Giải thích được việc phân bổ này giúp giảm thiểu tối đa hiện tượng chuyển đổi ngữ cảnh (Context Switching) và tối ưu hóa năng suất (20 điểm).
*   **Phân tích lý do loại trừ (30 điểm):**
    *   Chỉ rõ nhược điểm của Phương án A: Tốn thời gian copy-paste, dễ mất ngữ cảnh và cấu trúc thư mục của dự án khi làm việc trên trình duyệt (15 điểm).
    *   Chỉ rõ nhược điểm của Phương án B: Trợ lý inline không thể hiểu được mối quan hệ phức tạp giữa 4 tệp tin để tái cấu trúc đồng bộ và không hỗ trợ định dạng/lập luận tài liệu nghiệp vụ dài một cách mượt mà (15 điểm).

### 2. Tiêu chí chấm Bài 2 (Tối ưu Prompt - Max: 100 điểm)
*   **Cấu trúc Prompt tối ưu (30 điểm):** Prompt sinh viên viết phải thiết lập được bối cảnh tích hợp VNPay (10 điểm), mục tiêu sinh mã rõ ràng (10 điểm) và các ràng buộc về đầu vào/đầu ra (10 điểm).
*   **Xử lý ngoại lệ/Bẫy dữ liệu (30 điểm):** Prompt có câu lệnh tường minh yêu cầu AI không hardcode mật khóa (15 điểm), sử dụng biến môi trường qua `System.getenv()` và có logic kiểm tra null/rỗng để ném ra Exception bảo vệ hệ thống (15 điểm).
*   **Kết quả đầu ra (40 điểm):** Đoạn mã Java do AI sinh ra phải khớp hoàn hảo với yêu cầu: Đọc khóa từ biến môi trường, có hàm `if (secretKey == null || secretKey.isEmpty())` để ném ngoại lệ (`IllegalArgumentException` hoặc ngoại lệ tự định nghĩa) và không chứa bất kỳ chuỗi khóa hardcode nào.

### 3. Tiêu chí chấm Bài 3 (Dò lỗi qua Prompt - Max: 100 điểm)
*   **Phân tích nguyên nhân ảo giác (30 điểm):** Giải thích rõ ràng việc đưa thông tin không chính xác hoặc phương thức giả định vào prompt sẽ tạo ra sự "mồi" dữ liệu sai lệch. AI do hoạt động theo cơ chế dự đoán từ tiếp theo sẽ cố gắng sinh ra nội dung khớp với gợi ý đó thay vì phản biện người dùng, dẫn đến sinh mã lỗi thời hoặc không tồn tại (ảo giác).
*   **Thiết kế Prompt tối ưu (30 điểm):** Prompt mới phải định rõ yêu cầu nghiệp vụ kiểm tra chuỗi chứa ký tự đặc biệt, đồng thời thiết lập ràng buộc AI chỉ được dùng API thực tế, kèm yêu cầu AI dẫn nguồn tài liệu hoặc chứng minh logic.
*   **Kết quả đầu ra (40 điểm):** Cung cấp mã nguồn Java từ AI sử dụng đúng thư viện chuẩn (như Regex `Matcher`/`Pattern` của Java) hoặc thư viện thực tế (như `StringUtils` nhưng sử dụng các phương thức có thật như `containsAny` hoặc kiểm tra điều kiện phù hợp), hoàn toàn không chứa phương thức ảo.

### 4. Tiêu chí chấm Bài 4 (Phân tích & Lựa chọn - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (30 điểm):** Chọn chính xác **Phương án B**.
*   **Phân tích lý do chọn (40 điểm):**
    *   Chỉ ra được kiểu dữ liệu `double` không phù hợp cho tính toán tài chính do sai số dấu phẩy động (20 điểm).
    *   Giải thích được việc tự tra cứu, kiểm chứng chéo và yêu cầu AI sử dụng `BigDecimal` thể hiện tư duy chủ động học tập, làm chủ mã nguồn và đảm bảo tính liêm chính học thuật (20 điểm).
*   **Phân tích lý do loại trừ (30 điểm):**
    *   Chỉ rõ lỗi ở Phương án A: Thiếu kiểm chứng biên, phụ thuộc mù quáng vào AI và nộp bài chứa lỗi logic nghiêm trọng trong thực tế (15 điểm).
    *   Chỉ rõ lỗi ở Phương án C: Chuyển sang `float` không giải quyết được vấn đề làm tròn của dấu phẩy động nhị phân và thể hiện sự lười biếng, thiếu trách nhiệm kỹ thuật (15 điểm).

### 5. Tiêu chí chấm Bài 5 (Sáng tạo - Max: 100 điểm)
*   **Phân tích & Thiết kế quy trình (30 điểm):** Trình bày mạch lạc quy trình 2 bước sinh mã và tự kiểm duyệt chéo. Giải thích được lý do tại sao quy trình này giúp hạn chế lỗi logic trước khi chạy thử.
*   **Chất lượng Prompt/Workflow (40 điểm):** 
    *   Prompt Bước 1 có cấu trúc chặt chẽ, mô tả đúng 4 quy tắc nghiệp vụ mã vé và các trường hợp lỗi biên cần chặn (20 điểm).
    *   Prompt Bước 2 đóng vai trò kiểm toán viên (Auditor) sắc bén, đặt câu hỏi đúng trọng tâm về các rủi ro kỹ thuật (ngày tháng, timezone, xử lý chuỗi) (20 điểm).
*   **Kiểm chứng thực tế (30 điểm):** Cung cấp đầy đủ log chat dạng văn bản sao chép trực tiếp vào file (không chấp nhận link chia sẻ). Kết quả cho thấy AI đã tự sửa lỗi ở Bước 2 và sinh ra mã nguồn Java sử dụng `java.time.LocalDate` để so sánh ngày đi xe với ngày hiện tại một cách chính xác.

---

## PHẦN III: QUY ĐỊNH NỘP BÀI

1.  **Định dạng nộp bài:** Sinh viên nộp **01 file Markdown duy nhất (.md)**.
2.  **Cú pháp đặt tên file:** `SS02_[Họ_và_Tên]_[Mã_Sinh_Viên].md`
    *Ví dụ:* `SS02_NguyenVanA_HE150123.md`
3.  **Yêu cầu bắt buộc về minh chứng:**
    *   Tất cả các phần chạy thử nghiệm với AI (Bài 2, Bài 3, Bài 5) bắt buộc phải sao chép đầy đủ nội dung prompt và phản hồi của AI vào khối mã Markdown (code block). Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại (Share Link).
    *   **Tuyệt đối không sử dụng hình ảnh chụp màn hình (screenshot).** Bài nộp chứa hình ảnh hoặc link chia sẻ thay thế văn bản hội thoại sẽ bị AI chấm bài từ chối ghi nhận điểm phần thực nghiệm để bảo vệ tính trung thực học thuật.
