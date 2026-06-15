# BÀI TẬP VỀ NHÀ - SESSION 04
## Chủ đề: Thực hành kỹ thuật đặt Prompt căn bản

### Hướng dẫn làm bài:
*   Sinh viên đọc kỹ yêu cầu và thực hiện làm bài tập trực tiếp trên một file Markdown duy nhất.
*   Tuân thủ nghiêm ngặt **Hướng dẫn nộp bài** ở cuối tài liệu (chỉ nộp file văn bản `.md`, tuyệt đối không chụp ảnh màn hình).
*   Các bài tập chạy thử với AI bắt buộc phải sao chép đầy đủ nội dung cuộc trò chuyện dạng text block trực tiếp vào file làm bài. Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại.

---

## PHẦN I: NỘI DUNG BÀI TẬP

### BÀI 1: Phân tích & Lựa chọn (Thực hành thiết kế prompt tối ưu hóa mã nguồn) (100 điểm)
*   **Bối cảnh:** Bạn nhận bàn giao một lớp Java xử lý tính toán chiết khấu hóa đơn (`DiscountService`) từ dự án cũ. Đoạn mã này có quá nhiều vòng `if-else` lồng nhau sâu (nested conditions), gây khó đọc và bảo trì. Bạn muốn dùng AI để tái cấu trúc lại đoạn mã này cho sạch đẹp theo chuẩn Clean Code.
*   **Mã nguồn chưa tối ưu (Java):**
    ```java
    public class DiscountService {
        public double calculateDiscount(String type, double amount, boolean isHoliday) {
            if (type.equals("VIP")) {
                if (amount > 1000) {
                    if (isHoliday) {
                        return amount * 0.25;
                    } else {
                        return amount * 0.20;
                    }
                } else {
                    return amount * 0.15;
                }
            } else {
                if (amount > 500) {
                    if (isHoliday) {
                        return amount * 0.10;
                    } else {
                        return amount * 0.05;
                    }
                }
            }
            return 0;
        }
    }
    ```
*   **Đề bài:** Hãy lựa chọn prompt tối ưu nhất dưới đây để hướng dẫn AI tái cấu trúc mã nguồn trên sang dạng sử dụng các câu lệnh điều kiện bảo vệ (guard clauses - return sớm) mà vẫn bảo toàn nghiệp vụ cũ. Giải thích lý do lựa chọn và chỉ ra nhược điểm của các phương án còn lại:
    *   **Phương án A:** `"Tái cấu trúc code Java trên để nó đẹp hơn."`
    *   **Phương án B:** `"Hãy đóng vai trò là một Java Senior Developer. Nhiệm vụ của bạn là tái cấu trúc (refactor) logic rẽ nhánh lồng nhau phức tạp của class DiscountService trên thành các câu lệnh điều kiện bảo vệ (guard clauses / return sớm). Ràng buộc: Giữ nguyên logic nghiệp vụ tính chiết khấu ban đầu, không thay đổi kiểu dữ liệu đầu vào/đầu ra, sử dụng Java 11. Trình bày kết quả dưới dạng khối mã nguồn Java hoàn chỉnh kèm giải thích ngắn bằng tiếng Việt."`
    *   **Phương án C:** `"Hãy sửa code Java này, bỏ bớt if-else lồng nhau đi và sử dụng cấu trúc Java Stream API để viết ngắn gọn nhất có thể."`
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (A, B hoặc C).
    *   Phân tích chi tiết tại sao phương án đó tối ưu nhất dựa trên sự hiện diện của 5 thành phần Prompt (Vai trò, Mục tiêu, Ngữ cảnh, Ràng buộc, Định dạng).
    *   Phân tích lý do loại trừ các phương án còn lại (chỉ rõ nhược điểm hoặc nguy cơ lỗi logic khi thực hiện).

---

### BÀI 2: Tối ưu Prompt (Thực hành viết Prompt giải nghĩa Stack Trace và gỡ lỗi) (100 điểm)
*   **Bối cảnh:** Bạn đang chạy thử nghiệm một lớp Java quản lý người dùng (`UserManager`) và gặp lỗi sập chương trình kèm theo dấu vết lỗi (Stack Trace) hiển thị trên màn hình console.
*   **Mã nguồn gây lỗi (Java):**
    ```java
    import java.util.List;
    
    public class UserManager {
        private List<String> users; // Lỗi: Danh sách chưa được khởi tạo (null)
        
        public void addUser(String user) {
            users.add(user); // Dòng gây lỗi NullPointerException
        }
    }
    ```
*   **Dấu vết lỗi xuất hiện ở Console (Stack Trace):**
    ```text
    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.List.add(Object)" because "this.users" is null
        at UserManager.addUser(UserManager.java:7)
        at Main.main(Main.java:6)
    ```
*   **Prompt thô hiện tại:** `"Tôi bị lỗi NullPointerException ở UserManager, sửa hộ tôi."`
*   **Đề bài:** Prompt thô trên quá ngắn, thiếu mã nguồn đầy đủ và Stack Trace, dễ khiến AI suy đoán lung tung. Hãy tối ưu lại prompt này áp dụng cấu trúc 5 thành phần để:
    1.  Yêu cầu AI đóng vai trò là chuyên gia gỡ lỗi Java (Java Debugger).
    2.  Cung cấp ngữ cảnh là mã nguồn gây lỗi và Stack Trace thực tế.
    3.  Ràng buộc AI phải giải thích nguyên nhân gốc rễ (Root Cause) của lỗi và đề xuất cách sửa chữa an toàn nhất (khởi tạo danh sách bằng ArrayList) mà không phá vỡ tính bao đóng (Encapsulation) của OOP.
*   **Yêu cầu đầu ra:**
    *   Nội dung Prompt sau khi tối ưu.
    *   Đoạn mã nguồn Java hoàn chỉnh và an toàn do AI sinh ra (nằm trong khối code markdown).

---

### BÀI 3: Đọc hiểu & Dò lỗi qua Prompt (Phát hiện lỗi logic lặp) (100 điểm)
*   **Bối cảnh:** Một lập trình viên viết hàm tìm phần tử trùng lặp đầu tiên trong một mảng số nguyên. Tuy nhiên, do viết sai vòng lặp bên trong, hàm luôn luôn trả về phần tử đầu tiên của mảng (`arr[0]`) bất kể mảng đó có phần tử trùng lặp thực sự hay không.
*   **Mã nguồn lỗi (Java):**
    ```java
    public class DuplicateFinder {
        // Lỗi logic: j bắt đầu từ i dẫn đến việc phần tử tự so sánh với chính nó (arr[i] == arr[i] luôn đúng)
        public static Integer findDuplicate(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) { 
                    if (arr[i] == arr[j]) {
                        return arr[i];
                    }
                }
            }
            return null;
        }
    }
    ```
*   **Đề bài:**
    1.  Phân tích tại sao prompt chung chung như `"Mã này bị lỗi gì?"` lại dễ khiến AI bỏ sót lỗi logic biên (do code hoàn toàn đúng cú pháp và không bị cảnh báo compile).
    2.  Thiết kế một prompt mới gửi kèm đoạn code lỗi trên. Trong prompt, bạn hãy đặt vai trò AI làm Code Auditor, đưa ra một ca kiểm thử cụ thể (ví dụ: mảng `{1, 2, 3, 4}` - không có phần tử trùng nhưng code chạy vẫn trả về `1`), và yêu cầu AI sửa lại mã nguồn bằng cách sử dụng cấu trúc dữ liệu `HashSet` để nâng cao hiệu năng từ độ phức tạp $O(N^2)$ xuống $O(N)$.
*   **Yêu cầu đầu ra:**
    *   Đoạn phân tích lý do prompt thô dễ bỏ sót lỗi.
    *   Nội dung Prompt tối ưu mới thiết kế.
    *   Mã nguồn Java đã sửa hoàn chỉnh sử dụng `HashSet` do AI sinh ra (nằm trong khối code markdown).

---

### BÀI 4: Phân tích & Lựa chọn (Kỹ thuật Prompt lặp tối ưu hóa thuật toán) (100 điểm)
*   **Bối cảnh:** Bạn muốn AI sinh mã nguồn Java tính toán số Fibonacci thứ N. Ở lượt chat đầu tiên, AI đề xuất thuật toán đệ quy cổ điển (với độ phức tạp thời gian cực lớn $O(2^N)$), khiến ứng dụng bị treo (hang) khi tính toán số Fibonacci thứ 50.
*   **Mã nguồn AI sinh ra ban đầu:**
    ```java
    public class Fibonacci {
        public static long fib(int n) {
            if (n <= 1) return n;
            return fib(n - 1) + fib(n - 2);
        }
    }
    ```
*   **Đề bài:** Bạn muốn phản hồi lại AI để tinh chỉnh mã nguồn bằng kỹ thuật **Iterative Prompting (Prompt lặp)** nhằm yêu cầu AI chuyển sang sử dụng thuật toán Quy hoạch động (Dynamic Programming - Tabulation hoặc Memoization) để giảm độ phức tạp thời gian xuống $O(N)$. Hãy chọn phương án phản hồi tối ưu nhất dưới đây và giải thích tại sao các phương án khác chưa đạt yêu cầu:
    *   **Phương án A:** `"Code chạy chậm quá, viết lại bằng thuật toán khác tối ưu hơn giúp tôi."`
    *   **Phương án B:** `"Hàm fib đệ quy trên có độ phức tạp O(2^N), gây treo hệ thống khi n = 50. Hãy tối ưu lại hàm này sử dụng kỹ thuật Quy hoạch động (Dynamic Programming - Tabulation hoặc Memoization) để đưa độ phức tạp thời gian về O(N) và độ phức tạp không gian O(1) hoặc O(N). Giữ nguyên kiểu trả về long."`
    *   **Phương án C:** `"Hãy viết lại code tính Fibonacci bằng cách sử dụng Java Stream API để code chạy song song (parallel) cho nhanh hơn."`
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (A, B hoặc C).
    *   Giải thích lý do lựa chọn dựa trên tính cụ thể về mặt thông số thuật toán và ràng buộc kỹ thuật.
    *   Phân tích nhược điểm của 2 phương án còn lại.

---

### BÀI 5: Sáng tạo (Thiết kế Quy trình & Prompt Kiểm tra Giao dịch đáng ngờ - Fraud Detector) (100 điểm)
*   **Bối cảnh:** Bạn đang xây dựng chức năng cảnh báo bảo mật cho ứng dụng FinTech có tên "SmartCheck". Nhiệm vụ của bạn là xây dựng logic phát hiện giao dịch đáng ngờ (Fraud Transaction Detector) từ danh sách lịch sử giao dịch của khách hàng.
*   **Quy tắc nghiệp vụ phát hiện giao dịch đáng ngờ:**
    1.  Một giao dịch có giá trị đơn lẻ vượt quá 100,000,000 VND sẽ lập tức bị gắn cờ đáng ngờ.
    2.  Nếu xuất hiện hai giao dịch liên tiếp trên cùng một thẻ (`cardId`) được thực hiện tại hai vị trí địa lý khác nhau (ví dụ: "Hanoi" và "Saigon") trong khoảng thời gian dưới 10 phút, cả hai giao dịch này đều bị gắn cờ đáng ngờ (do không thể di chuyển vật lý nhanh như vậy).
*   **Đề bài mở:** Hãy đóng vai trò kỹ sư hệ thống, thiết kế quy trình 2 bước để AI sinh mã nguồn Java và thực hiện kiểm toán chéo hiệu năng:
    *   **Bước 1: Thiết kế Prompt sinh mã nguồn (Code Generation Prompt):** Viết prompt yêu cầu AI tạo ra lớp `FraudDetector` với phương thức `detectFraud(List<Transaction> transactions)`. Thiết lập các ràng buộc về đầu vào/đầu ra, sử dụng Java 8 Date Time API (`LocalDateTime`) để tính toán chênh lệch thời gian, và xử lý các trường hợp dữ liệu lỗi biên (danh sách null, trống, hoặc thiếu dữ liệu địa điểm).
    *   **Bước 2: Thiết kế Prompt kiểm chứng chéo hiệu năng (Performance Audit Prompt):** Khi danh sách giao dịch lên tới 10,000 phần tử, việc duyệt so sánh lồng nhau hai vòng lặp $O(N^2)$ sẽ làm chậm hệ thống. Thiết kế prompt thứ hai yêu cầu AI đóng vai trò là chuyên gia tối ưu thuật toán, phân tích điểm nghẽn hiệu năng của code ở Bước 1 và tối ưu thuật toán (ví dụ: gom nhóm theo `cardId` và sắp xếp theo thời gian để so sánh lân cận, đưa độ phức tạp về $O(N \log N)$).
*   **Yêu cầu đầu ra:**
    *   Mô tả ngắn gọn ý đồ thiết kế quy trình 2 bước của bạn.
    *   Nội dung **Prompt sinh mã nguồn** (Bước 1).
    *   Nội dung **Prompt kiểm chứng chéo hiệu năng** (Bước 2).
    *   **Minh chứng thực tế:** Bắt buộc sao chép đầy đủ nội dung log chat dạng text/markdown cho cả 2 lượt chat trực tiếp vào file bài làm để minh họa kết quả chạy thực tế (tuyệt đối không nộp link chia sẻ). Log chat phải thể hiện rõ:
        1.  Mã nguồn Java sinh ra lần đầu ở Bước 1 (thường chứa thuật toán duyệt lặp $O(N^2)$).
        2.  Phần phân tích lỗi và đề xuất tối ưu thuật toán ở Bước 2.
        3.  Mã nguồn Java tối ưu cuối cùng đạt độ phức tạp thời gian tối ưu hơn ($O(N \log N)$).

---

## PHẦN II: TIÊU CHÍ CHẤM ĐIỂM CHI TIẾT (DÀNH CHO AI CHẤM BÀI)

### 1. Tiêu chí chấm Bài 1 (Phân tích & Lựa chọn - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (30 điểm):** Chọn chính xác **Phương án B**.
*   **Phân tích lý do chọn (40 điểm):**
    *   Chỉ ra được sự đầy đủ 5 thành phần trong Prompt B: Vai trò (Java Senior Developer), Mục tiêu (Tái cấu trúc rẽ nhánh lồng nhau thành guard clauses), Ngữ cảnh (Mã nguồn của class DiscountService), Ràng buộc (Bảo toàn nghiệp vụ, không đổi kiểu dữ liệu, Java 11), Định dạng (Khối mã nguồn Java kèm giải thích tiếng Việt) (20 điểm).
    *   Giải thích được cấu trúc này giúp AI hiểu rõ mục tiêu kỹ thuật, tránh hiện tượng sinh mã thừa hoặc thay đổi logic nghiệp vụ (20 điểm).
*   **Phân tích lý do loại trừ (30 điểm):**
    *   Chỉ rõ lỗi ở Phương án A: Quá mơ hồ, AI dễ sinh mã không đúng cấu trúc guard clauses mong muốn (15 điểm).
    *   Chỉ rõ lỗi ở Phương án C: Sử dụng Java Stream API cho trường hợp so sánh điều kiện phức tạp lồng nhau là không phù hợp, làm code khó đọc hơn và không giải quyết được bài toán logic rẽ nhánh nghiệp vụ (15 điểm).

### 2. Tiêu chí chấm Bài 2 (Tối ưu Prompt - Max: 100 điểm)
*   **Cấu trúc Prompt tối ưu (30 điểm):** Prompt sinh viên viết phải có đủ vai trò chuyên gia gỡ lỗi (10 điểm), cung cấp cả mã nguồn và Stack Trace lỗi (10 điểm), yêu cầu giải thích nguyên nhân và cách sửa (10 điểm).
*   **Xử lý ngoại lệ/Bẫy dữ liệu (30 điểm):** Prompt yêu cầu AI chỉ ra nguyên nhân do biến `users` chưa được khởi tạo (15 điểm) và ràng buộc AI sửa lỗi bằng cách khởi tạo `new ArrayList<>()` mà không phá vỡ tính bao đóng (không khai báo public list trực tiếp) (15 điểm).
*   **Kết quả đầu ra từ AI (40 điểm):** Đoạn mã Java do AI sinh ra phải khởi tạo danh sách một cách an toàn (Ví dụ: khởi tạo trực tiếp tại thuộc tính `private List<String> users = new ArrayList<>();` hoặc khởi tạo trong Constructor của class `UserManager`).

### 3. Tiêu chí chấm Bài 3 (Dò lỗi qua Prompt - Max: 100 điểm)
*   **Phân tích lý do thất bại của prompt thô (30 điểm):** Chỉ ra được do lỗi logic ẩn không vi phạm cú pháp biên dịch, AI nếu không có ngữ cảnh đầu vào cụ thể sẽ chạy suy luận lướt qua và giả định hàm hoạt động đúng. Việc thiếu test case biên khiến AI không thực sự chạy thử nghiệm logic.
*   **Thiết kế Prompt tối ưu (30 điểm):** Prompt mới phải đưa ra ca kiểm thử biên cụ thể (Mảng `{1, 2, 3, 4}`), vai trò Code Auditor và ràng buộc thuật toán tối ưu sử dụng `HashSet` để nâng cao hiệu năng.
*   **Kết quả đầu ra từ AI (40 điểm):** Mã nguồn Java do AI sinh ra phải sử dụng `HashSet` để lưu trữ các phần tử đã duyệt qua và kiểm tra trùng lặp với độ phức tạp $O(N)$ (ví dụ: nếu `!set.add(num)` thì trả về `num`), xử lý chính xác mảng không trùng lặp (trả về null).

### 4. Tiêu chí chấm Bài 4 (Phân tích & Lựa chọn - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (30 điểm):** Chọn chính xác **Phương án B**.
*   **Phân tích lý do chọn (40 điểm):**
    *   Chỉ ra được Phương án B cung cấp thông số thuật toán cực kỳ chi tiết: độ phức tạp thời gian đích ($O(N)$), độ phức tạp không gian, chỉ định rõ thuật toán Quy hoạch động (Tabulation/Memoization) và giữ nguyên kiểu dữ liệu trả về `long` (20 điểm).
    *   Giải thích được việc hướng dẫn trực tiếp như vậy giúp AI đi thẳng vào việc cài đặt thuật toán DP mà không phải thử sai nhiều lần (20 điểm).
*   **Phân tích lý do loại trừ (30 điểm):**
    *   Chỉ rõ lỗi ở Phương án A: Quá chung chung, AI có thể sinh thuật toán khác không tối ưu bằng DP (như dùng vòng lặp thường lặp tính toán dư thừa) (15 điểm).
    *   Chỉ rõ lỗi ở Phương án C: Java Stream API không làm giảm độ phức tạp lũy thừa của đệ quy Fibonacci và việc chạy song song (parallel stream) thậm chí còn gây tốn tài nguyên hệ thống hơn đối với hàm đệ quy sâu (15 điểm).

### 5. Tiêu chí chấm Bài 5 (Sáng tạo - Max: 100 điểm)
*   **Thiết kế quy trình và ý đồ (30 điểm):** Mô tả rõ ràng mục tiêu 2 bước: Bước 1 tập trung viết đúng nghiệp vụ, Bước 2 tập trung nâng cao hiệu năng khi danh sách dữ liệu phình to.
*   **Chất lượng Prompt/Workflow (40 điểm):**
    *   Prompt Bước 1 thiết kế đầy đủ nghiệp vụ phát hiện fraud giao dịch > 100M VND và giao dịch 10 phút khác địa điểm, có xử lý ngoại lệ dữ liệu lỗi (20 điểm).
    *   Prompt Bước 2 định hình vai trò chuyên gia hiệu năng, chỉ rõ điểm nghẽn của thuật toán hai vòng lặp lồng nhau $O(N^2)$ và yêu cầu tối ưu (20 điểm).
*   **Kiểm chứng thực tế (30 điểm):** Sao chép đầy đủ log chat 2 lượt. Kết quả cho thấy mã nguồn Java cuối cùng đã được tối ưu hiệu năng (Ví dụ: Gom nhóm theo Card ID bằng HashMap và sắp xếp lịch sử giao dịch theo thời gian, sau đó chỉ so sánh các giao dịch kề nhau để giảm độ phức tạp xuống $O(N \log N)$).

---

## PHẦN III: QUY ĐỊNH NỘP BÀI

1.  **Định dạng nộp bài:** Sinh viên nộp **01 file Markdown duy nhất (.md)**.
2.  **Cú pháp đặt tên file:** `SS04_[Họ_và_Tên]_[Mã_Sinh_Viên].md`
    *Ví dụ:* `SS04_NguyenVanA_HE150123.md`
3.  **Yêu cầu bắt buộc về minh chứng:**
    *   Tất cả các phần chạy thử nghiệm với AI (Bài 2, Bài 3, Bài 5) bắt buộc phải sao chép đầy đủ nội dung prompt và phản hồi của AI vào khối mã Markdown (code block). Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại (Share Link).
    *   **Tuyệt đối không sử dụng hình ảnh chụp màn hình (screenshot).** Bài nộp chứa hình ảnh hoặc link chia sẻ thay thế văn bản hội thoại sẽ bị AI chấm bài từ chối ghi nhận điểm phần thực nghiệm để bảo vệ tính trung thực học thuật.
