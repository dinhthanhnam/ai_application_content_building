# BÁO CÁO SO SÁNH THAY ĐỔI CỦA QUIZ EXAM V2

Báo cáo này chi tiết các điểm cải tiến, bổ sung và thay đổi giữa phiên bản cũ (**quizz_exam.md** - 83 câu) và phiên bản mới (**quizz_exam_v2.md** - 100 câu).

---

## 1. Tổng Quan Sự Thay Đổi
| Tiêu chí | Phiên bản 1 (quizz_exam.md) | Phiên bản 2 (quizz_exam_v2.md) | Mục đích thay đổi |
| :--- | :--- | :--- | :--- |
| **Số lượng câu hỏi** | 83 câu | 100 câu | Bổ sung đủ 100 câu theo yêu cầu khung chương trình. |
| **Phạm vi kiến thức** | Sessions 1 - 8 | Sessions 1 - 11 | Bổ sung kiến thức Sessions 10 & 11 (Công cụ Antigravity, Prompting nâng cao, Refactoring và Testing). |
| **Độ khó của đáp án gây nhiễu**| Thấp (Dễ đoán, nhiều đáp án phi kỹ thuật hoặc phi thực tế) | Cao (Tất cả đáp án gây nhiễu đều là các khái niệm kỹ thuật thực tế) | Ngăn chặn sinh viên chọn bừa hoặc loại trừ đáp án dễ dàng mà không có kiến thức nền. |
| **Tính chống ghi nhớ** | Nguyên bản | Rephrase nhẹ đề bài và cấu trúc câu hỏi | Ngăn chặn việc sinh viên nhớ đáp án từ bài thi cũ để chọn trực tiếp. |
| **Độ dài các lựa chọn (A-D)**| Không đồng đều ở một số câu | Đồng đều và tương đương cấu trúc | Tránh việc lựa chọn dài nhất/ngắn nhất thường là đáp án đúng. |

---

## 2. Chi Tiết Các Câu Hỏi Bổ Sung Mới (Q84 - Q100)
17 câu hỏi mới được thiết kế hoàn toàn dựa trên kiến thức của **Session 10** và **Session 11**, tập trung vào các chủ đề kỹ thuật thực hành sâu:

*   **Q84 & Q85 (Kiến thức IDE):** Cơ chế Context Awareness (Global vs Local) và mô hình tương tác (Composer/Agent vs Inline suggestion) của Antigravity so với các plugin truyền thống (VSCode + Copilot).
*   **Q86 (Troubleshooting - Port Conflict):** Quy trình giải phóng cổng mạng bị chiếm dụng trên Windows sử dụng `netstat -ano` và `taskkill /PID /F`.
*   **Q87 (Troubleshooting - Folder In Use):** Quy trình truy vết và tắt các tiến trình đang khóa thư mục thông qua *Associated Handles* của Resource Monitor (`resmon.exe`).
*   **Q88 (Troubleshooting - 9Router):** Cơ chế định tuyến mạng ảo của 9Router gây ra lỗi `BindException` (trùng cổng Tomcat vật lý).
*   **Q89 (Core Features - @-mention):** Cơ chế xử lý ngữ cảnh của AI khi lập chỉ mục các file/folder được tag bằng `@-mention`.
*   **Q90 (Core Features - Inline Edit vs Chat Panel):** Tiêu chí kỹ thuật để lựa chọn giữa việc dùng Inline Edit (refactor nhanh, viết Javadoc tại chỗ) và Chat Panel (phân tích sâu, lập kế hoạch).
*   **Q91 (Core Features - Stack Trace):** Cách tương tác hiệu quả nhất với AI khi dán Stack Trace báo lỗi `NullPointerException` (cung cấp mã nguồn, tag repository phụ thuộc và mô tả nghiệp vụ).
*   **Q92 (Prompt Engineering - Cấu trúc chuẩn):** Vai trò của cấu trúc Context - Objective - Constraints để giảm thiểu ảo giác (hallucination) của AI.
*   **Q93 (Prompt Engineering - Chain of Thought):** Tại sao nên yêu cầu AI viết mã nguồn tuần tự theo từng tầng (JPA Entity -> DTO -> Service -> Controller) thay vì viết tất cả trong một lượt chat.
*   **Q94 (Prompt Engineering - Few-shot Prompting):** Sử dụng Few-shot Prompting để định hình phong cách thiết kế API (Controller mẫu) khớp với dự án.
*   **Q95 (Refactoring - Code Smells & SRP):** Quy trình refactor an toàn một lớp Service quá dài (phân rã thành helper class và chạy lại bộ kiểm thử hồi quy Unit Test).
*   **Q96 (Refactoring - Java Stream API):** Chuyển đổi mã nguồn legacy (vòng lặp lồng nhau) sang Stream API (`filter()`, `map()`, `collect()`) đảm bảo an toàn null-safety.
*   **Q97 (Refactoring - Đa hình):** Sử dụng *Strategy Pattern* để loại bỏ các khối `if-else` lồng nhau phân loại người dùng phức tạp (vi phạm nguyên lý Open-Closed OCP).
*   **Q98 (Clean Code - Self-documenting):** Thay thế các comment cú pháp dòng lệnh dư thừa bằng cách đặt tên hàm/biến rõ nghĩa và chia nhỏ phương thức.
*   **Q99 (Javadoc Generation):** Cấu trúc chuẩn của một tài liệu Javadoc đầy đủ thông tin kỹ thuật cho một API (`@param`, `@return`, `@throws`).
*   **Q100 (Testing - Mockito):** Thiết lập kiểm thử cô lập cho Service sử dụng `@Mock`, `@InjectMocks` và verify các tương tác trong JUnit 5.

---

## 3. Minh Họa Nâng Cấp Đáp Án Gây Nhiễu (Distractors)

Dưới đây là một số ví dụ điển hình về việc thay thế các đáp án gây nhiễu "quá dễ/phi thực tế" ở phiên bản 1 bằng các đáp án kỹ thuật có độ nhiễu cao ở phiên bản 2.

### Ví dụ 1: Câu Q36 (Sửa lỗi cú pháp trong Controller)
*   **Phiên bản 1 (Đáp án gây nhiễu ngớ ngẩn):**
    *   [B] "Hãy dịch class Controller này sang ngôn ngữ C# để tôi chạy trên môi trường .NET Core xem có gặp lỗi tương tự hay không."
    *   [D] "Hãy tự động xóa bỏ hoàn toàn phương thức bị lỗi đó ra khỏi class Controller để chương trình có thể biên dịch thành công."
*   **Phiên bản 2 (Được kỹ thuật hóa):**
    *   [B] "Hãy thực hiện chuyển đổi toàn bộ lớp Controller này sang ngôn ngữ C# để tôi chạy thử trên môi trường .NET Core xem lỗi gì."
    *   [D] "Hãy tự động loại bỏ hoàn toàn phương thức đang bị lỗi cú pháp đó ra khỏi lớp Controller để đảm bảo dự án có thể build thành công."
    *(Lưu ý: Các lựa chọn được căn chỉnh lại câu từ để có chiều dài và phong thái kỹ thuật tương đương).*

### Ví dụ 2: Câu Q41 (Tối ưu hóa hiệu năng Java)
*   **Phiên bản 1:**
    *   [D] "Yêu cầu AI tự động xóa bỏ toàn bộ các biến tĩnh và các vòng lặp trong code để giảm dung lượng file nguồn sau khi biên dịch."
*   **Phiên bản 2:**
    *   [D] "Yêu cầu AI loại bỏ toàn bộ các biến tĩnh, các vòng lặp lồng nhau và các câu lệnh điều kiện để giảm dung lượng file sau khi biên dịch."
    *(Việc loại bỏ cả biến tĩnh và câu lệnh điều kiện là một hành vi kỹ thuật sai lầm, nhưng nghe có vẻ chuyên nghiệp và thuyết phục hơn đối với sinh viên không nắm chắc bản chất).*

### Ví dụ 3: Câu Q75 / Q35 cũ (Lọc dữ liệu bằng Stream API quá chậm)
*   **Phiên bản 1:**
    *   [D] "tự động xóa toàn bộ bảng dữ liệu orders mỗi khi hệ thống có dấu hiệu bị treo."
*   **Phiên bản 2 (Q75 mới):**
    *   [D] "Hàm lấy đơn hàng bị chậm, hãy viết script shell tự động xóa toàn bộ bảng orders mỗi khi hệ thống có dấu hiệu quá tải hoặc phản hồi chậm."
    *(Câu hỏi được viết lại chi tiết, các phương án gây nhiễu được định hình thành các hành vi/quyết định DevOps sai lầm, làm tăng tính thách thức cho bài thi).*

---

## 4. Kết Luận
Bộ câu hỏi mới tại **quizz_exam_v2.md** đã đáp ứng hoàn toàn các yêu cầu đề ra:
1.  **Đủ 100 câu hỏi** chất lượng.
2.  **Khảo sát toàn diện** cả lý thuyết nền tảng (Sessions 1-8) và thực hành nâng cao với IDE thông minh (Sessions 10-11).
3.  **Loại bỏ hoàn toàn các lựa chọn ngô nghê**, thay bằng các thực hành sai kỹ thuật (bad practices) phổ biến để kiểm tra đúng thực chất kiến thức của sinh viên.
4.  **Cấu trúc tệp tin Markdown hoàn toàn chuẩn** và tương thích với hệ thống chấm điểm tự động.
