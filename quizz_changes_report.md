# BÁO CÁO TỔNG HỢP NÂNG CẤP VÀ REFACTOR TOÀN DIỆN QUIZ EXAM V2 (ĐÃ HOÀN THÀNH)

Báo cáo này tổng hợp kết quả của đợt refactor toàn diện trên tệp **`quizz_exam_v2.md`** nhằm nâng cao chất lượng học thuật, đa dạng hóa các kịch bản hỏi đáp, và tăng độ nhiễu của các phương án sai để đánh giá thực chất năng lực ứng dụng AI của sinh viên.

---

## 1. Kết Quả Tổng Quan

1.  **Quy mô**: Hoàn thành đủ **100 câu hỏi** (Q1 - Q100) được đánh số tuần tự, cấu trúc định dạng chuẩn mực, kèm theo giải thích (`[EXP]`) chi tiết cho tất cả các phương án.
2.  **Khắc phục tình trạng "Prompt thô quá dễ đoán" (53 câu)**:
    *   Tất cả 53 câu hỏi trắc nghiệm dạng chọn Prompt đã được rà soát và nâng cấp.
    *   **Thay thế phương án sai**: Loại bỏ các phương án nhiễu lệch đề (như viết script xóa file, cấu hình CI/CD, so sánh với C++). Thay thế bằng **các mẫu prompt lỗi thực tế** (prompt quá mơ hồ, thiếu ràng buộc cụ thể, lạm dụng token, sai lệch phạm vi phân tích).
    *   Sinh viên buộc phải phân tích cấu trúc prompt và áp dụng các nguyên lý **Prompt Engineering** (Specificity, Constraints, Context, Few-shot) để chọn ra prompt tối ưu nhất.
3.  **Khắc phục tình trạng "Đáp án nhiễu vô lý" (10 câu)**:
    *   Đã cập nhật các câu trắc nghiệm lý thuyết gỡ lỗi có phương án nhiễu quá dễ đoán (như khuyên tắt máy, cài lại hệ điều hành, vô hiệu hóa tường lửa).
    *   **Thay thế bằng lỗi tương tác thực tế**: Thay bằng các sai lầm phổ biến của nhà phát triển khi làm việc với AI (như dán log lỗi thô không kèm code, không kiểm tra cú pháp, để context window bị quá tải, lạm dụng chat panel thay vì inline edit).

---

## 2. Minh Họa Các Thay Đổi Điển Hình

### Q11: Thiết kế Prompt so sánh khái niệm (`map` vs `flatMap`)
*   **Trước refactor**: Các đáp án nhiễu là các câu lệnh hoàn toàn lạc đề (như viết script kết nối MySQL, so sánh Stream với vòng lặp). Sinh viên chỉ cần thấy từ khóa `map` và `flatMap` ở đáp án đúng là chọn được ngay.
*   **Sau refactor**: Tất cả 4 lựa chọn đều là các prompt yêu cầu giải thích hoặc so sánh `map` và `flatMap`, nhưng các phương án nhiễu mắc các lỗi thiết kế prompt:
    *   *Phương án đúng (A)*: Yêu cầu so sánh trực diện hai phương thức dựa trên các tiêu chí cụ thể (cơ chế hoạt động, kiểu dữ liệu trả về) kèm ví dụ minh họa và giải thích từng bước.
    *   *Gây nhiễu (B)*: Prompt quá chung chung, thiếu tiêu chí so sánh cụ thể khiến AI dễ phản hồi lan man.
    *   *Gây nhiễu (C)*: Prompt yêu cầu viết một dự án lớn không cần thiết, làm loãng câu trả lời giải thích khái niệm.
    *   *Gây nhiễu (D)*: Prompt đưa vào ngữ cảnh sai lệch (so sánh hiệu năng trên các hệ điều hành khác nhau).

### Q26: Xử lý khi AI bị dừng do tràn token đầu ra
*   **Trước refactor**: Phương án nhiễu khuyên restart lại IDE hoặc gửi mail báo cáo hệ thống.
*   **Sau refactor**: Các đáp án nhiễu đổi thành các lỗi quản lý phiên tương tác thực tế với AI:
    *   *Phương án đúng (B)*: Tiếp tục yêu cầu AI hoàn thiện từ dòng bị dừng ngay trong chat thread hiện tại.
    *   *Gây nhiễu (A)*: Tạo chat thread hoàn toàn mới và sao chép lại từ đầu (làm mất ngữ cảnh và lãng phí token).
    *   *Gây nhiễu (C)*: Tiếp tục chat nhưng không cung cấp thông tin dòng bị dừng (khiến AI sinh mã nguồn lặp lại hoặc sai cấu trúc).
    *   *Gây nhiễu (D)*: Ép AI sinh lại toàn bộ file từ đầu (dễ gây lỗi tràn token tiếp theo).

### Q43: Xử lý khi AI đề xuất code bị deprecated
*   **Trước refactor**: Phương án nhiễu khuyên cài lại hệ điều hành, cài lại IDE hoặc gửi thư khiếu nại cho Spring Boot team.
*   **Sau refactor**: Các đáp án nhiễu đổi thành hành động lập trình thiếu an toàn:
    *   *Phương án đúng (A)*: Chỉ rõ phần code bị lỗi thời và yêu cầu AI thay thế bằng phương án mới tương đương.
    *   *Gây nhiễu (B)*: Tiếp tục sử dụng code deprecated bằng cách tắt cảnh báo biên dịch (gây rủi ro bảo mật và mất khả năng tương thích khi cập nhật).
    *   *Gây nhiễu (C)*: Tự động sửa thủ công mà không hiểu rõ sự thay đổi cơ chế bảo mật của phiên bản mới.
    *   *Gây nhiễu (D)*: Yêu cầu AI viết script tự động hạ cấp phiên bản framework của dự án xuống phiên bản cũ (đi lùi công nghệ).

---

## 3. Trạng Thái Hoàn Thành
*   Tệp đề thi **`quizz_exam_v2.md`** đã được hợp nhất và kiểm tra lỗi định dạng tự động.
*   Tất cả 100 câu hỏi đều tuân thủ nguyên tắc: **Hỏi về Ứng dụng AI / Prompting / Developer-AI Interaction**, không bị chuyển thành câu hỏi Java thuần túy, và có đáp án gây nhiễu tinh tế, phân loại học sinh tốt.
*   Bảng đáp án `@correct` hoàn toàn khớp với phiên bản trước.
