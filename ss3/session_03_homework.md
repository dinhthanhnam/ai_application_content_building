# BÀI TẬP VỀ NHÀ - SESSION 03
## Chủ đề: Kỹ thuật đặt Prompt căn bản

### Hướng dẫn làm bài:
*   Sinh viên đọc kỹ yêu cầu và thực hiện làm bài tập trực tiếp trên một file Markdown duy nhất.
*   Tuân thủ nghiêm ngặt **Hướng dẫn nộp bài** ở cuối tài liệu (chỉ nộp file văn bản `.md`, tuyệt đối không chụp ảnh màn hình).
*   Các bài tập chạy thử với AI bắt buộc phải sao chép đầy đủ nội dung cuộc trò chuyện dạng text block trực tiếp vào file làm bài. Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại.

---

## PHẦN I: NỘI DUNG BÀI TẬP

### BÀI 1: Phân tích & Lựa chọn (Áp dụng 5 thành phần Prompt để giải quyết nghiệp vụ) (100 điểm)
*   **Bối cảnh:** Bạn muốn nhờ AI sinh một lớp Dịch vụ trong ứng dụng Java Spring Boot để xử lý nghiệp vụ đăng ký tài khoản mới cho người dùng. Yêu cầu chi tiết của nghiệp vụ bao gồm:
    1.  Dự án phát triển trên nền tảng **Java 17** và **Spring Boot 3.x**.
    2.  Hàm phải kiểm tra trùng lặp email bằng cách gọi `userRepository.existsByEmail(email)`.
    3.  Mật khẩu phải được mã hóa bằng `PasswordEncoder` trước khi lưu vào cơ sở dữ liệu.
    4.  Nếu email đã tồn tại, ném ra một Custom Exception tên là `DuplicateEmailException`.
    5.  Định dạng đầu ra mong muốn: Mã nguồn Java sạch, chuẩn cấu trúc OOP và có chú thích giải thích chi tiết bằng tiếng Việt ở mỗi bước logic.
*   **Đề bài:** Trong các prompt dưới đây, hãy chọn prompt áp dụng tốt nhất cấu trúc **5 thành phần cốt lõi (Role - Goal - Context - Constraint - Format)** để AI sinh mã nguồn chuẩn xác nhất ngay từ lần đầu tiên, tránh việc phải chỉnh sửa thủ công. Giải thích chi tiết tại sao các phương án khác chưa tốt:
    *   **Phương án A:** `"Hãy viết code Java Spring Boot xử lý đăng ký tài khoản người dùng, nhớ mã hóa mật khẩu và kiểm tra xem email đã tồn tại chưa."`
    *   **Phương án B:** `"Hãy đóng vai trò là một Java Developer chuyên nghiệp. Nhiệm vụ của bạn là viết class UserService xử lý đăng ký tài khoản (registerUser). Dự án sử dụng Spring Boot 3.x và Java 17. Ràng buộc nghiệp vụ: Phải kiểm tra trùng email qua userRepository.existsByEmail(), nếu trùng ném ra DuplicateEmailException; mật khẩu phải được mã hóa bằng PasswordEncoder. Hãy trình bày kết quả dưới dạng khối mã nguồn Java kèm chú thích tiếng Việt rõ ràng ở từng bước."`
    *   **Phương án C:** `"Tôi có một dự án Spring Boot. Hãy tạo hàm đăng ký tài khoản. Ràng buộc là phải check trùng email và ném lỗi DuplicateEmailException. Định dạng là code Java."`
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (A, B hoặc C).
    *   Phân tích chi tiết tại sao phương án đó tối ưu nhất (chỉ rõ sự hiện diện và vai trò của từng thành phần trong 5 thành phần cốt lõi: Role, Goal, Context, Constraint, Format).
    *   Phân tích tại sao các phương án còn lại chưa đạt chuẩn (chỉ ra các thành phần bị thiếu và hệ quả tương ứng đối với chất lượng phản hồi của AI).

---

### BÀI 2: Tối ưu Prompt (Thiết kế Prompt Tóm tắt & Hệ thống hóa Tài liệu học tập) (100 điểm)
*   **Bối cảnh:** Bạn là lập trình viên Java thực tập và được giao đọc tài liệu về cơ chế hoạt động của `Garbage Collection (GC)` trong Java. Tài liệu quá dài và có nhiều thuật ngữ kỹ thuật khó nhớ. Bạn muốn sử dụng AI để giúp mình tóm tắt và hệ thống hóa kiến thức phục vụ việc tự học.
*   **Tài liệu đầu vào (Văn bản mẫu):**
    ```text
    Java Garbage Collection (GC) là quá trình tự động giải phóng bộ nhớ bằng cách tìm và xóa các đối tượng không còn được sử dụng trong bộ nhớ Heap. Bộ nhớ Heap được chia thành hai vùng chính: Young Generation và Old Generation. Vùng Young Generation lại được chia thành Eden Space và hai không gian Survivor (S0, S1).
    Khi một đối tượng mới được tạo ra bằng từ khóa new, nó sẽ được cấp phát tại Eden Space. Khi Eden Space đầy, một đợt dọn rác Minor GC sẽ được kích hoạt. Các đối tượng còn sống sót sau Minor GC sẽ được chuyển sang vùng Survivor. Sau nhiều lần sống sót qua các đợt Minor GC (đạt ngưỡng tuổi nhất định), đối tượng sẽ được thăng cấp (promoted) sang Old Generation.
    Vùng Old Generation lưu trữ các đối tượng có thời gian sống dài. Khi vùng này đầy, Major GC (hoặc Full GC) sẽ được kích hoạt để dọn dẹp. Quá trình Full GC thường tốn thời gian hơn rất nhiều so với Minor GC vì nó phải duyệt qua toàn bộ bộ nhớ Heap và có thể làm dừng toàn bộ ứng dụng (Stop-the-world).
    ```
*   **Prompt thô hiện tại:** `"Tóm tắt cơ chế Garbage Collection trong Java từ đoạn văn trên"`
*   **Đề bài:** Prompt thô trên quá đơn giản, dễ khiến AI trả về một đoạn tóm tắt chung chung bằng văn bản thông thường, khó ghi nhớ và không thể trực quan hóa đường đi của dữ liệu. Hãy áp dụng kỹ thuật đặt prompt cho học tập (Lesson 3) để tối ưu lại prompt này nhằm đạt được các yêu cầu sau:
    1.  Yêu cầu AI đóng vai là một Giảng viên Java giàu kinh nghiệm giảng dạy trực quan.
    2.  Tóm tắt đoạn văn bản trên thành một **Bảng so sánh** phân biệt rõ 2 vùng bộ nhớ: `Young Generation` và `Old Generation` theo các tiêu chí: Các vùng con bên trong, Loại đối tượng lưu trữ, Điều kiện kích hoạt GC, Tốc độ thực thi của GC.
    3.  Yêu cầu AI cung cấp thêm một sơ đồ ASCII đơn giản để trực quan hóa đường đi của một đối tượng từ khi được khởi tạo bằng `new` cho tới khi được thăng cấp lên vùng `Old Generation`.
*   **Yêu cầu đầu ra:**
    *   Nội dung Prompt sau khi tối ưu.
    *   Phản hồi từ AI sau khi chạy thử prompt tối ưu (bao gồm bảng so sánh và sơ đồ ASCII, nằm trong khối code markdown).

---

### BÀI 3: Đọc hiểu & Dò lỗi qua Prompt (Code Tracing & AI Verification) (100 điểm)
*   **Bối cảnh:** Bạn được giao kiểm tra một hàm Java thực hiện tính toán giá trị trung bình của một danh sách số nguyên. Hàm này bị lỗi logic nghiêm trọng khi danh sách đầu vào trống (`numbers.isEmpty()`) hoặc `numbers == null`. Lập trình viên tập sự sử dụng prompt: `"Code này có chạy được không?"` để hỏi AI.
*   **Mã nguồn lỗi (Java):**
    ```java
    import java.util.List;
    
    public class AverageCalculator {
        public static double calculateAverage(List<Integer> numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return (double) sum / numbers.size();
        }
    }
    ```
*   **Vấn đề:** Do prompt hỏi quá chung chung và không đưa ra bối cảnh ràng buộc, AI chỉ trả lời là mã nguồn viết đúng cú pháp, chạy bình thường và bỏ qua lỗi logic chia cho 0 (`ArithmeticException`) khi danh sách trống hoặc lỗi `NullPointerException` khi danh sách bị null.
*   **Đề bài:**
    1.  Hãy phân tích tại sao prompt mẫu `"Code này có chạy được không?"` lại thất bại trong việc bắt AI tìm lỗi logic biên.
    2.  Thiết kế một prompt mới gửi kèm đoạn code lỗi trên. Trong prompt, hãy áp dụng cấu trúc 5 thành phần để yêu cầu AI đóng vai trò là một Chuyên gia Kiểm thử (QA/Tester) sắc bén, chỉ ra các trường hợp biên có thể làm sập chương trình, sau đó sinh mã nguồn Java đã sửa lỗi hoàn chỉnh kèm theo JUnit test case để kiểm thử các trường hợp biên đó.
*   **Yêu cầu đầu ra:**
    *   Đoạn phân tích lý do thất bại của prompt thô.
    *   Nội dung Prompt tối ưu mới do bạn thiết kế.
    *   Đoạn code Java đã sửa lỗi và mã nguồn JUnit test case do AI sinh ra (nằm trong khối code markdown).

---

### BÀI 4: Phân tích & Lựa chọn (Kỹ thuật Prompt lặp và tối ưu - Iterative Prompting) (100 điểm)
*   **Bối cảnh:** Bạn muốn nhờ AI tối ưu hiệu năng của một hàm Java kiểm tra số nguyên tố. AI trả về đoạn code sử dụng thuật toán duyệt từ 2 đến n-1, rất chậm. Bạn muốn AI chuyển sang thuật toán duyệt từ 2 đến căn bậc hai của n (`Math.sqrt(n)`) để tối ưu.
*   **Đề bài:** Để đạt được mục tiêu này thông qua quy trình **Iterative Prompting (Prompt lặp và tối ưu)** học ở Lesson 4, phương án phản hồi nào dưới đây thể hiện đúng quy trình này nhất khi AI trả về kết quả chưa đạt yêu cầu ở lượt chat đầu tiên?
    *   **Phương án A:** Bỏ cuộc và tự mình viết lại code tối ưu bằng tay vì AI không thông minh như quảng cáo.
    *   **Phương án B:** Tiếp tục mở một phiên chat mới từ đầu và dán lại prompt ban đầu nhưng đổi từ viết hoa, hy vọng AI sẽ tự hiểu và trả về kết quả khác tốt hơn.
    *   **Phương án C:** Giữ nguyên phiên chat cũ, phản hồi trực tiếp cho AI bằng cách chỉ rõ điểm chưa tối ưu (vòng lặp chạy đến n-1 quá chậm đối với số lớn) và đưa ra chỉ dẫn bổ sung (yêu cầu sửa vòng lặp chỉ chạy đến căn bậc hai của n để giảm độ phức tạp thuật toán từ O(n) xuống O(sqrt(n))).
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (A, B hoặc C).
    *   Phân tích chi tiết tại sao phương án được chọn thể hiện đúng tư duy *Iterative Prompting* (Quy trình: Đánh giá -> Nhận diện lỗi -> Tinh chỉnh) và giải thích tại sao hai phương án kia không mang lại hiệu quả thực tế.

---

### BÀI 5: Sáng tạo (Thiết kế Prompt Hệ thống & Quy trình Iterative Prompting cho Trợ lý Clean Code) (100 điểm)
*   **Bối cảnh:** Để nâng cao chất lượng code Java của bản thân trong suốt môn học, bạn muốn thiết kế một Prompt Hệ thống (System Prompt) biến AI thành một "Trợ lý Kiểm duyệt Clean Code Java (Java Clean Code Reviewer)".
*   **Yêu cầu đối với Trợ lý Clean Code:**
    1.  **Vai trò:** Một kỹ sư Java kỳ cựu cực kỳ khắt khe về Clean Code (theo các tiêu chí trong cuốn sách Clean Code của Robert C. Martin).
    2.  **Nhiệm vụ:** Nhận mã nguồn Java từ người dùng, rà soát và đưa ra nhận xét theo 3 tiêu chí: (1) Cách đặt tên biến/hành vi (Naming Conventions), (2) Độ phức tạp và tính đơn nhiệm của hàm (Single Responsibility Principle), (3) Các đoạn code thừa hoặc cấu trúc lặp dư thừa (Code Smells).
    3.  **Ràng buộc nghiêm ngặt:** Tuyệt đối không tự ý viết lại mã nguồn mới ở lượt phản hồi đầu tiên. AI chỉ được phép đưa ra nhận xét đánh giá và các bước gợi ý sửa đổi. Chỉ khi người dùng yêu cầu trực tiếp bằng câu lệnh: *"Hãy refactor đoạn code này giúp tôi"*, AI mới được sinh mã nguồn đã tối ưu.
    4.  **Định dạng:** Trình bày nhận xét dưới dạng danh sách gạch đầu dòng rõ ràng.
*   **Đề bài mở:** 
    1.  Hãy viết **Prompt Hệ thống** hoàn chỉnh áp dụng cấu trúc 5 thành phần để định hình Trợ lý Clean Code theo các yêu cầu trên.
    2.  Thực hiện chạy thử nghiệm và áp dụng quy trình **Iterative Prompting** (ít nhất 2 lượt chat liên tiếp) trên ChatGPT/Claude bằng cách:
        *   *Lượt chat 1:* Gửi Prompt Hệ thống + Đoạn code Java chưa tối ưu dưới đây để AI đánh giá (kiểm tra xem AI có tuân thủ ràng buộc "không tự ý viết lại code" hay không).
            ```java
            public class OrderProcessor {
                public void p(double a, int t) {
                    if (t == 1) {
                        double d = a * 0.1;
                        double total = a - d;
                        System.out.println("Total: " + total);
                    } else {
                        System.out.println("Total: " + a);
                    }
                }
            }
            ```
        *   *Lượt chat 2:* Gửi phản hồi tiếp tục: *"Hãy refactor đoạn code này giúp tôi theo các nhận xét trên"* để AI sinh mã nguồn tối ưu cuối cùng.
*   **Yêu cầu đầu ra:**
    *   Nội dung **Prompt Hệ thống** thiết kế ở Bước 1.
    *   **Minh chứng thực tế:** Bắt buộc sao chép đầy đủ nội dung log chat dạng text/markdown cho cả 2 lượt chat trực tiếp vào file bài làm để chứng minh bạn đã hoàn thành quy trình Iterative Prompting và AI tuân thủ đúng vai trò, ràng buộc thiết lập (tuyệt đối không nộp link chia sẻ).

---

## PHẦN II: TIÊU CHÍ CHẤM ĐIỂM CHI TIẾT (DÀNH CHO AI CHẤM BÀI)

### 1. Tiêu chí chấm Bài 1 (Phân tích & Lựa chọn - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (30 điểm):** Chọn chính xác **Phương án B**.
*   **Phân tích lý do chọn (40 điểm):**
    *   Chỉ ra được sự hiện diện đầy đủ của 5 thành phần trong Prompt B: Vai trò (Java Developer chuyên nghiệp), Mục tiêu (Viết class UserService xử lý đăng ký tài khoản), Ngữ cảnh (Spring Boot 3.x, Java 17), Ràng buộc (Kiểm tra userRepository.existsByEmail(), DuplicateEmailException, mã hóa PasswordEncoder), Định dạng (Khối mã nguồn Java kèm chú thích tiếng Việt) (20 điểm).
    *   Giải thích được việc đầy đủ thành phần giúp AI hoạt động chính xác nhất ngay lần đầu, giảm thiểu sai sót kỹ thuật và logic nghiệp vụ (20 điểm).
*   **Phân tích lý do loại trừ (30 điểm):**
    *   Chỉ rõ nhược điểm của Phương án A: Thiếu Vai trò, Ngữ cảnh phiên bản công nghệ, Ràng buộc cụ thể về Exception và định dạng mong muốn. Dễ khiến AI sinh code sai phiên bản Spring Boot hoặc dùng Exception chung chung (15 điểm).
    *   Chỉ rõ nhược điểm của Phương án C: Thiếu Vai trò chuyên gia, thiếu ngữ cảnh cụ thể (phiên bản Java/Spring Boot) và định dạng chỉ định quá chung chung (15 điểm).

### 2. Tiêu chí chấm Bài 2 (Tối ưu Prompt - Max: 100 điểm)
*   **Thiết kế Prompt tối ưu (40 điểm):** Prompt sinh viên viết phải chứa đủ vai trò Giảng viên (10 điểm), mục tiêu tóm tắt kết hợp hệ thống hóa dưới dạng bảng so sánh theo đúng các tiêu chí yêu cầu (20 điểm) và ràng buộc/định dạng sơ đồ ASCII minh họa (10 điểm).
*   **Kết quả đầu ra từ AI (60 điểm):** 
    *   Cung cấp bảng so sánh phân biệt rõ ràng hai vùng Young và Old Generation theo đúng 4 tiêu chí của đề bài (30 điểm).
    *   Cung cấp sơ đồ ASCII trực quan hóa luồng đi của đối tượng từ Eden -> Survivor -> Old Generation một cách dễ hiểu (30 điểm).

### 3. Tiêu chí chấm Bài 3 (Dò lỗi qua Prompt - Max: 100 điểm)
*   **Phân tích lý do thất bại của prompt thô (30 điểm):** Giải thích được rằng câu hỏi chung chung khiến AI chỉ kiểm tra lỗi biên dịch (cú pháp) mà bỏ qua ngữ cảnh chạy thực tế với các dữ liệu biên dị biệt (null hoặc trống) do không bị giới hạn bởi các ràng buộc kiểm thử.
*   **Thiết kế Prompt tối ưu (30 điểm):** Prompt mới phải đặt vai trò QA/Tester (10 điểm), yêu cầu dò lỗi biên (null, trống) (10 điểm) và yêu cầu sinh code sửa đổi kèm test case JUnit (10 điểm).
*   **Kết quả đầu ra từ AI (40 điểm):** Đoạn mã Java do AI sinh ra phải xử lý được trường hợp `numbers == null` và `numbers.isEmpty()` (trả về 0 hoặc ném ngoại lệ thích hợp) (20 điểm); cung cấp mã nguồn JUnit test case kiểm thử đúng các kịch bản này (20 điểm).

### 4. Tiêu chí chấm Bài 4 (Phân tích & Lựa chọn - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (30 điểm):** Chọn chính xác **Phương án C**.
*   **Phân tích lý do chọn (40 điểm):**
    *   Giải thích được Phương án C thể hiện đúng bản chất của Iterative Prompting: Duy trì ngữ cảnh phiên trò chuyện để AI hiểu lịch sử đối thoại (20 điểm).
    *   Chỉ rõ việc điều hướng trực tiếp bằng cách mô tả lỗi và đưa ra chỉ dẫn cải tiến kỹ thuật giúp AI sửa đúng hướng mà không cần khai báo lại toàn bộ yêu cầu từ đầu (20 điểm).
*   **Phân tích lý do loại trừ (30 điểm):**
    *   Chỉ rõ lỗi ở Phương án A: Từ bỏ quá sớm, không biết tận dụng năng lực học máy để sửa đổi liên tục (15 điểm).
    *   Chỉ rõ lỗi ở Phương án B: Làm mất lịch sử trò chuyện (context history), tốn thời gian khai báo lại và việc đổi chữ hoa không cung cấp thêm bất kỳ logic kỹ thuật mới nào cho AI (15 điểm).

### 5. Tiêu chí chấm Bài 5 (Sáng tạo - Max: 100 điểm)
*   **Chất lượng thiết kế Prompt Hệ thống (30 điểm):** Thiết kế đủ 5 thành phần, đặc biệt là ràng buộc nghiêm ngặt "tuyệt đối không tự ý viết lại mã nguồn ở lượt chat đầu tiên".
*   **Minh chứng thực tế Lượt chat 1 (35 điểm):** Phản hồi của AI chỉ đưa ra các nhận xét Clean Code dạng gạch đầu dòng (tên hàm `p` chưa rõ nghĩa, tham số `a` và `t` viết tắt, cấu trúc `if-else` lồng nhau, thiếu tính đơn nhiệm), tuyệt đối không sinh code mới.
*   **Minh chứng thực tế Lượt chat 2 (35 điểm):** Sau khi nhận lệnh refactor, AI sinh ra mã nguồn Java sạch: đổi tên hàm thành `processOrder` hoặc tương đương, đổi tên biến rõ nghĩa (`amount`, `transactionType`), khử cấu trúc lồng nhau (sử dụng return sớm hoặc tách hàm) và áp dụng đúng tiêu chuẩn OOP.

---

## PHẦN III: QUY ĐỊNH NỘP BÀI

1.  **Định dạng nộp bài:** Sinh viên nộp **01 file Markdown duy nhất (.md)**.
2.  **Cú pháp đặt tên file:** `SS03_[Họ_và_Tên]_[Mã_Sinh_Viên].md`
    *Ví dụ:* `SS03_NguyenVanA_HE150123.md`
3.  **Yêu cầu bắt buộc về minh chứng:**
    *   Tất cả các phần chạy thử nghiệm với AI (Bài 2, Bài 3, Bài 5) bắt buộc phải sao chép đầy đủ nội dung prompt và phản hồi của AI vào khối mã Markdown (code block). Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại (Share Link).
    *   **Tuyệt đối không sử dụng hình ảnh chụp màn hình (screenshot).** Bài nộp chứa hình ảnh hoặc link chia sẻ thay thế văn bản hội thoại sẽ bị AI chấm bài từ chối ghi nhận điểm phần thực nghiệm để bảo vệ tính trung thực học thuật.
