# BÀI TẬP VỀ NHÀ - SESSION 01
## Chủ đề: Định hướng môn học & Tính cấp thiết của AI trong lập trình

### Hướng dẫn làm bài:
*   Sinh viên đọc kỹ yêu cầu và thực hiện làm bài tập trực tiếp trên một file Markdown duy nhất.
*   Tuân thủ nghiêm ngặt **Hướng dẫn nộp bài** ở cuối tài liệu (chỉ nộp file văn bản `.md`, tuyệt đối không chụp ảnh màn hình).
*   Các bài tập chạy thử với AI bắt buộc phải sao chép đầy đủ nội dung cuộc trò chuyện dạng text block trực tiếp vào file làm bài. Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại.

---

## PHẦN I: NỘI DUNG BÀI TẬP

### BÀI 1: Phân tích & Lựa chọn (Dịch chuyển vai trò của lập trình viên) (100 điểm)
*   **Bối cảnh:** Một lập trình viên mới bắt đầu học môn AI Application và muốn ứng dụng AI để giải quyết bài toán nghiệp vụ trong dự án thực tế. Lập trình viên này đang cân nhắc các phương án làm việc chung với AI.
*   **Đề bài:** Trong các phương án dưới đây, hãy chọn phương án thể hiện đúng nhất tư duy của một **Augmented Developer** (Lập trình viên tích hợp AI) hiện đại và giải thích ngắn gọn (2-3 câu) lý do tại sao các phương án khác chưa tối ưu:
    *   **Phương án A:** Giao 100% công việc viết code cho AI từ đầu đến cuối. Bản thân không cần đọc hiểu hay kiểm tra lại logic vì AI đã rất thông minh và không bao giờ viết sai.
    *   **Phương án B:** Dành thời gian tự phân tích yêu cầu nghiệp vụ, thiết kế luồng xử lý và viết prompt chi tiết để AI sinh mã nguồn mẫu. Sau đó, tự mình đọc hiểu, chạy thử và kiểm chứng (Verify) lại kết quả của AI.
    *   **Phương án C:** Tiếp tục viết code thủ công hoàn toàn như trước đây. Chỉ khi nào code bị lỗi cú pháp hoặc lỗi logic không thể tự sửa, mới sao chép đoạn code lỗi gửi cho AI nhờ sửa hộ.
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (A, B hoặc C).
    *   Đoạn phân tích ngắn gọn giải thích lý do lựa chọn phương án đó dựa trên sự dịch chuyển vai trò (Lesson 1).

---

### BÀI 2: Tối ưu Prompt (Giải nghĩa logic code Java) (100 điểm)
*   **Bối cảnh:** Bạn nhận bàn giao một hàm Java kiểm tra hạng thành viên của khách hàng dựa trên điểm số tích lũy từ dự án cũ. Bạn chưa hiểu rõ các rẽ nhánh logic hoạt động như thế nào và muốn dùng AI giải thích.
*   **Mã nguồn mẫu (Java):**
    ```java
    public class MemberCheck {
        public static String checkLevel(int points) {
            if (points >= 1000) {
                return "VIP";
            }
            return "Standard";
        }
    }
    ```
*   **Prompt thô hiện tại:** `"giải thích code này cho tôi"`
*   **Đề bài:** Prompt thô trên quá ngắn gọn và có thể khiến AI phản hồi lan man, không tập trung vào logic nghiệp vụ. Hãy tối ưu lại prompt này (khoảng 1-2 câu) để yêu cầu AI giải thích ngắn gọn, rõ ràng các điều kiện rẽ nhánh và ý nghĩa đầu ra của hàm trên.
*   **Yêu cầu đầu ra:**
    *   Nội dung Prompt sau khi tối ưu.
    *   Đoạn phản hồi (văn bản) nhận được từ AI sau khi chạy thử prompt đã tối ưu.

---

### BÀI 3: Đọc hiểu & Dò lỗi qua Prompt (AI Verification) (100 điểm)
*   **Bối cảnh:** Một sinh viên viết hàm tính thuế VAT (10%) cho hóa đơn sản phẩm. Tuy nhiên, hàm này bị lỗi logic nghiêm trọng khi giá trị hóa đơn đầu vào là số âm (amount <= 0). Sinh viên đó dùng prompt: `"Code này có lỗi không?"` để hỏi AI.
*   **Mã nguồn lỗi (Java):**
    ```java
    public class TaxCalculator {
        public static double calculateVAT(double amount) {
            return amount * 0.1;
        }
    }
    ```
*   **Vấn đề:** Do prompt quá chung chung, AI chỉ trả lời là code không có lỗi cú pháp và chạy bình thường, bỏ qua lỗi logic nghiệp vụ biên.
*   **Đề bài:** Hãy thiết kế một prompt mới gửi kèm đoạn code lỗi trên. Trong prompt, bạn cần chỉ rõ bối cảnh rủi ro (khi `amount` là số âm hoặc bằng 0) và yêu cầu AI chỉnh sửa lại code Java để chặn lỗi này.
*   **Yêu cầu đầu ra:**
    *   Prompt mới do bạn thiết kế.
    *   Đoạn code Java đã được AI sửa đổi (nằm trong khối code markdown).

---

### BÀI 4: Phân tích & Lựa chọn (Tối ưu hóa hiệu năng) (100 điểm)
*   **Bối cảnh:** Bạn có một hàm Java duyệt qua danh sách số để tìm xem có số nào lớn hơn 100 hay không. Bạn muốn tối ưu hóa mã nguồn này để code ngắn gọn và dễ bảo trì hơn.
*   **Mã nguồn chưa tối ưu (Java):**
    ```java
    import java.util.List;
    
    public class NumberFinder {
        public static boolean hasLargeNumber(List<Integer> numbers) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) > 100) {
                    return true;
                }
            }
            return false;
        }
    }
    ```
*   **Đề bài:** Giảng viên đưa ra 2 cách đặt prompt để nhờ AI tối ưu hóa hàm trên:
    *   **Prompt 1:** `"Tối ưu hóa code Java này giúp tôi chạy nhanh hơn."`
    *   **Prompt 2:** `"Hãy chuyển đổi hàm Java duyệt mảng bằng vòng lặp for dưới đây sang sử dụng Java Stream API để code ngắn gọn và dễ bảo trì hơn. Giải thích lý do tối ưu."`
    Hãy chọn prompt nào sẽ mang lại kết quả tối ưu và chính xác nhất theo kiến thức đã học ở Lesson 2. Giải thích ngắn gọn lý do tại sao prompt còn lại chưa tốt.
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (Prompt 1 hoặc Prompt 2).
    *   Lý do chọn dựa trên tiêu chuẩn thiết kế prompt có mục tiêu và ràng buộc rõ ràng.

---

### BÀI 5: Sáng tạo (Thiết kế Prompt Trợ lý Học tập) (100 điểm)
*   **Bối cảnh:** Để chuẩn bị học tập tốt cho cả môn học, bạn muốn thiết lập một Prompt hệ thống (System Prompt) biến AI thành một "Trợ lý giảng dạy Java" dành riêng cho mình.
*   **Đề bài mở:** Hãy viết một prompt (khoảng 3-5 câu) để định hình vai trò của AI làm trợ lý học tập cho bạn. Prompt cần đảm bảo các điều kiện sau:
    1.  Luôn đóng vai là một Giảng viên dạy lập trình Java tận tâm.
    2.  Khi nhận được một đoạn code Java từ người dùng, AI phải giải thích theo 2 phần: (1) Ý nghĩa thực tế của hàm, (2) Cách hoạt động của từng dòng code.
    3.  Không được tự ý viết code sửa đổi hoặc tối ưu hóa trừ khi người dùng yêu cầu trực tiếp.
*   **Yêu cầu đầu ra:**
    *   Nội dung Prompt hệ thống bạn đã thiết kế.
    *   Copy đoạn text hội thoại thực tế (Prompt chạy thử của bạn chứa một đoạn code Java đơn giản bất kỳ + Câu trả lời phản hồi của AI) để chứng minh AI đã tuân thủ đúng vai trò trợ lý được thiết lập.

---

## PHẦN II: TIÊU CHÍ CHẤM ĐIỂM CHI TIẾT (DÀNH CHO AI CHẤM BÀI)

### 1. Tiêu chí chấm Bài 1 (Phân tích & Lựa chọn - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (50 điểm):** Chọn chính xác **Phương án B**.
*   **Giải thích lý do chọn và loại trừ (50 điểm):**
    *   Giải thích được Phương án B phản ánh đúng vai trò của lập trình viên hiện đại: dịch chuyển từ việc gõ code thủ công sang đặt prompt định hướng và đặc biệt là phải tự kiểm chứng (Verify) lại kết quả của AI (25 điểm).
    *   Chỉ ra được nhược điểm của phương án A (lạm dụng AI, thiếu kiểm soát dễ gây lỗi hệ thống) hoặc phương án C (thụ động, không tận dụng tối đa năng lực của AI để tối ưu hóa năng suất trước khi code lỗi) (25 điểm).

### 2. Tiêu chí chấm Bài 2 (Tối ưu Prompt giải nghĩa - Max: 100 điểm)
*   **Thiết kế Prompt tối ưu (50 điểm):** Prompt phải rõ ràng, có cấu trúc yêu cầu AI giải thích trực tiếp logic nghiệp vụ hoặc các rẽ nhánh điều kiện của code (25 điểm) và giới hạn độ dài giải thích (ngắn gọn/dễ hiểu) (25 điểm).
*   **Minh chứng kết quả chạy thử (50 điểm):** Cung cấp đầy đủ phản hồi của AI dạng văn bản chứng minh đã chạy prompt. Nội dung giải thích của AI phải khớp với logic của hàm `checkLevel` (Hạng VIP nếu >= 1000 điểm, ngược lại là Standard).

### 3. Tiêu chí chấm Bài 3 (Dò lỗi qua Prompt - Max: 100 điểm)
*   **Thiết kế Prompt dò lỗi (50 điểm):** Prompt phải chứa đoạn code lỗi và chỉ rõ trường hợp biên cụ thể (amount <= 0 hoặc số âm) làm điều kiện ràng buộc đầu vào (25 điểm) và yêu cầu AI viết lại code để xử lý ngoại lệ này (25 điểm).
*   **Kết quả code đã sửa (50 điểm):** Code Java do AI sinh ra phải chặn được trường hợp `amount <= 0` (ví dụ: ném ra ngoại lệ `IllegalArgumentException` hoặc trả về 0 kèm thông báo lỗi).

### 4. Tiêu chí chấm Bài 4 (Phân tích prompt tối ưu hiệu năng - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (50 điểm):** Chọn chính xác **Prompt 2**.
*   **Giải thích lý do chọn và loại trừ (50 điểm):**
    *   Giải thích được Prompt 2 tối ưu vì có mục tiêu rõ ràng (chuyển sang Java Stream API) và có ràng buộc định dạng rõ ràng (yêu cầu code ngắn gọn, giải thích lý do tối ưu) (25 điểm).
    *   Chỉ ra được Prompt 1 quá chung chung, dễ khiến AI sinh ra các cách tối ưu không mong muốn hoặc chỉ giải thích suông mà không viết lại code hiệu quả (25 điểm).

### 5. Tiêu chí chấm Bài 5 (Sáng tạo - Trợ lý học tập - Max: 100 điểm)
*   **Chất lượng thiết kế Prompt hệ thống (50 điểm):** Prompt hệ thống thiết lập thành công vai trò Giảng viên (15 điểm), yêu cầu giải thích theo đúng 2 phần: nghiệp vụ thực tế & luồng chạy chi tiết (20 điểm), và có ràng buộc không tự ý sửa code (15 điểm).
*   **Kiểm chứng hội thoại thực tế (50 điểm):** Cung cấp cuộc trò chuyện thực tế dạng văn bản. AI phản hồi đúng vai trò giảng viên, giải thích đúng cấu trúc 2 phần yêu cầu và tuyệt đối không tự ý viết lại code tối ưu của đoạn code kiểm thử.

---

## PHẦN III: QUY ĐỊNH NỘP BÀI

1.  **Định dạng nộp bài:** Sinh viên nộp **01 file Markdown duy nhất (.md)**.
2.  **Cú pháp đặt tên file:** `SS01_[Họ_và_Tên]_[Mã_Sinh_Viên].md`
    *Ví dụ:* `SS01_NguyenVanA_HE150123.md`
3.  **Yêu cầu bắt buộc về minh chứng:**
    *   Tất cả các phần chạy thử nghiệm với AI (Bài 2, Bài 3, Bài 5) bắt buộc phải sao chép đầy đủ nội dung prompt và phản hồi của AI vào khối mã Markdown (code block). Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại (Share Link).
    *   **Tuyệt đối không sử dụng hình ảnh chụp màn hình (screenshot).** Bài nộp chứa hình ảnh hoặc link chia sẻ thay thế văn bản hội thoại sẽ bị AI chấm bài từ chối ghi nhận điểm phần thực nghiệm để đảm bảo tính trung thực học thuật.
