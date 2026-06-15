# Session 03 - Lesson 04: Kỹ thuật Prompt lặp và tối ưu (Iterative Prompting)

## 1. Mục tiêu học tập
Sau khi hoàn thành Lesson này, người học có thể:
- Hiểu được bản chất của kỹ thuật Prompt lặp (Iterative Prompting) và tại sao hiếm khi một Prompt tạo ra kết quả hoàn hảo ngay từ lần đầu tiên.
- Phân tích được các vòng lặp phản hồi (Feedback Loops) để tinh chỉnh và định hướng lại câu trả lời của AI một cách liên tục.
- Thực hiện chu trình "Thử nghiệm - Đánh giá - Điều chỉnh" để tạo ra mã nguồn hoặc tài liệu kỹ thuật có độ chính xác cao.
- Áp dụng kỹ năng tinh chỉnh Prompt để giải quyết các lỗi mã nguồn (bugs) đan chéo phức tạp trong dự án thực tế.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric 3D illustration showing a cyclical process. A glowing data core is at the center, surrounded by three circular floating stages: "Input Prompt" (a keyboard icon), "Analyze Output" (a magnifying glass over code), and "Refine & Iterate" (a wrench and refresh arrow). A developer is interacting with the loop, watching the code quality improve with each cycle. Corporate tech aesthetic, neon blue and orange.

---

## 2. Đặt vấn đề thực tế

Bạn đang xây dựng một tính năng "Xuất báo cáo doanh thu dưới dạng Excel" cho phần mềm kế toán. Bạn viết một Prompt rất chuẩn chỉnh với đủ 5 thành phần để nhờ AI viết đoạn mã này bằng ngôn ngữ Java.

AI trả về cho bạn một đoạn mã Java hoàn chỉnh, cấu trúc rất đẹp và có chú thích rõ ràng. Tuy nhiên, khi bạn đưa vào chạy thử, đoạn mã lại sử dụng thư viện `Apache POI` phiên bản cũ (vốn đã bị ngừng hỗ trợ từ lâu) và không thể xử lý các file Excel có dung lượng trên 50MB (gây ra lỗi tràn bộ nhớ `OutOfMemoryError`). 

Nhiều lập trình viên khi đối mặt với tình huống này thường có xu hướng bỏ cuộc, xóa toàn bộ câu trả lời của AI và tự lên mạng tìm kiếm cách giải quyết từ đầu, hoặc tệ hơn là mở một khung chat mới để thử hỏi lại y hệt câu cũ với hi vọng mong manh "lần này máy sẽ trả lời đúng". 

Sự thật là, làm việc với AI giống như việc điêu khắc một bức tượng. Nhát cắt đầu tiên chỉ tạo ra hình dáng thô, bạn cần liên tục tinh chỉnh, gọt giũa thông qua việc giao tiếp lặp lại (Iterative Prompting) để đạt được tác phẩm hoàn mỹ.

---

## 3. Kiến thức cốt lõi

### 3.1. Iterative Prompting là gì?
- **Định nghĩa:** Iterative Prompting (Kỹ thuật Prompt lặp) là quá trình tương tác nhiều vòng với AI. Sau mỗi câu trả lời của AI, bạn phân tích kết quả, tìm ra điểm chưa tốt và cung cấp thêm thông tin phản hồi (Feedback) để AI sửa chữa ở lần trả lời tiếp theo.
- **Vai trò:** Giúp định hướng lại luồng tư duy của AI khi nó đi chệch hướng, bổ sung các ràng buộc mà bạn đã quên ở lần hỏi đầu tiên, và làm sâu sắc thêm chi tiết của vấn đề.
- **Khi nào sử dụng:** 
  - Khi AI sinh ra mã nguồn gây ra lỗi biên dịch (Compile Error) hoặc lỗi logic nghiệp vụ (Runtime Error).
  - Khi câu trả lời của AI quá dài, quá ngắn, dùng sai thư viện công nghệ hoặc áp dụng sai phiên bản.

### 3.2. Quy trình 3 bước của Prompt lặp
Chu trình tinh chỉnh liên tục bao gồm 3 bước:
1. **Khởi tạo (Initial Prompt):** Bắt đầu bằng một Prompt cơ bản nhất (tốt nhất là có đủ cấu trúc 5 thành phần: Vai trò - Mục tiêu - Ngữ cảnh - Ràng buộc - Định dạng).
2. **Đánh giá (Analyze Output):** Đọc kết quả của AI. Đặt câu hỏi phản biện: "Mã nguồn này có chạy được không?", "Nó có vi phạm nguyên tắc bảo mật nào của công ty không?", "Nó có dùng đúng framework đang yêu cầu không?".
3. **Điều chỉnh (Refine & Prompt Again):** Phản hồi lại cho AI một cách cụ thể về lỗi sai hoặc yêu cầu thay đổi trực tiếp ngay trong cùng một đoạn hội thoại.

### 3.3. Các phương pháp phản hồi (Feedback) phổ biến
- **Cung cấp mã lỗi (Error Tracing):** *"Đoạn mã của bạn ném ra ngoại lệ `NullPointerException` ở dòng số 45. Hãy kiểm tra lại và sửa khối if-else này."*
- **Thắt chặt ràng buộc (Tighten Constraints):** *"Cách này tốt, nhưng nó chạy quá chậm trên mảng dữ liệu lớn. Hãy viết lại hàm này mà tuyệt đối không dùng vòng lặp lồng nhau."*
- **Yêu cầu giải pháp thay thế (Alternative Generation):** *"Tôi không được quyền cài đặt thư viện ngoài (Third-party library) vào dự án này. Hãy giải quyết vấn đề bằng các API mặc định của Java."*

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A visual metaphor of sculpting a statue. First stage shows a rough block of marble with an AI interface emitting a raw output. Second stage shows the engineer chipping away flaws. Third stage shows a perfectly sculpted, glowing code-block statue. High tech professional environment, cyan and purple lighting.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Tại dự án hệ thống Thương mại điện tử (E-Commerce), một kỹ sư cần viết một hàm rút trích thông tin ngày tháng từ một chuỗi văn bản tự do (ví dụ: "Khách hàng muốn đơn hàng giao vào ngày 25/12/2023").

### Thách thức
AI liên tục sử dụng các thư viện thao tác cắt chuỗi rườm rà dễ dẫn đến sai số. Lập trình viên quyết định dùng kỹ thuật Prompt lặp để ép AI tạo ra giải pháp tối ưu nhất dùng Biểu thức chính quy (Regex).

### Cách tiếp cận và Kết quả qua từng vòng lặp
- **Vòng 1 (Khởi tạo):** 
  - *Lập trình viên:* "Hãy viết cho tôi một hàm Java để lấy ngày tháng từ chuỗi văn bản."
  - *AI:* Trả về một hàm sử dụng cơ chế `String.split()` và `substring()`. Cách này cực kỳ dễ bị lỗi (Crash) nếu chuỗi văn bản nhập vào không theo đúng khoảng trắng khuôn mẫu.
- **Vòng 2 (Điều chỉnh & Thắt chặt ràng buộc):**
  - *Lập trình viên:* "Cách chia chuỗi này không an toàn. Hãy sử dụng Biểu thức chính quy (Regex) của Java để tìm kiếm định dạng ngày tháng."
  - *AI:* Trả về đoạn mã dùng đối tượng `Pattern` và `Matcher`, trích xuất đúng mô hình chuẩn DD/MM/YYYY. Tuy nhiên, nó vẫn dùng đối tượng `Date` cũ kỹ của Java để ép kiểu.
- **Vòng 3 (Tối ưu hóa công nghệ):**
  - *Lập trình viên:* "Dự án của tôi đang chạy Java 17. Hãy thay thế đối tượng `java.util.Date` cổ điển bằng đối tượng API `LocalDate` mới và in ra màn hình chuỗi ngày chuẩn ISO."
  - *AI:* Cập nhật toàn bộ khối mã một cách thông minh. Sử dụng đúng Regex và API `java.time.LocalDate`. Đây chính là kết quả hoàn hảo, an toàn tuyệt đối để đưa vào dự án thật.

---

## 5. Demo minh họa

**Mục tiêu demo:** Minh họa một luồng thao tác "Sửa lỗi bằng Prompt lặp" (Iterative Debugging) ngay trên dòng lệnh của môi trường lập trình IDE.

**Điều kiện chuẩn bị:** Một dự án Java đang gặp lỗi ngoại lệ ở Terminal và sử dụng công cụ AI Code Assistant tích hợp (như Antigravity).

**Các bước thực hiện:**
1. Mở IDE và chạy dự án. Nhận thấy hệ thống bắn ra lỗi báo động đỏ `Stack Trace` trên cửa sổ Console.
2. Sao chép dòng lỗi gốc đó. Mở khung chat của Code Assistant.
3. Bắt đầu vòng lặp 1: Phản ánh lỗi gốc cho AI.
4. Bắt đầu vòng lặp 2: Điều chỉnh giải pháp theo đúng tư duy nghiệp vụ (Business Logic).

**Luồng Prompt thực tế (Demo Script):**

- **Lần Prompt 1 (Khởi tạo lỗi gốc):**
  > *"Hàm `getUserProfile` của tôi vừa bị lỗi phân tích cú pháp. Đây là mã lỗi báo trên Console: `java.time.format.DateTimeParseException: Text '2023-02-29' could not be parsed`. Hãy chỉ ra nguyên nhân và sửa nó."*
  > **AI Phản hồi:** AI phân tích và phát hiện ra rằng năm 2023 không phải là năm nhuận, nên ngày 29 tháng 02 không tồn tại. Nó đề xuất thêm khối lệnh `try-catch` vào hàm để bắt lỗi này và ném ra một thông báo lỗi "Ngày không hợp lệ" làm dừng chương trình.

- **Lần Prompt 2 (Điều chỉnh giải pháp nghiệp vụ):**
  > *"Tôi không muốn hệ thống báo lỗi rồi dừng lại đột ngột như vậy. Nếu định dạng ngày sinh của người dùng không hợp lệ, hãy thiết kế để hệ thống chủ động trả về một giá trị mặc định là ngày `01-01-1900` để quy trình tính toán vẫn được tiếp tục chạy."*
  > **AI Phản hồi:** Lần này, AI cập nhật lại khối lệnh `catch`, loại bỏ dòng mã ném lỗi (Throw Exception). Thay vào đó, AI gán đối tượng ngày sinh bằng `LocalDate.of(1900, 1, 1)` và ghi log cảnh báo (Warning). Giải pháp này tinh tế và đúng nghiệp vụ hoàn toàn.

**Lưu ý thực tế:**
Quá trình Prompt lặp yêu cầu bạn phải giữ được "Ngữ cảnh" (Context) của cuộc trò chuyện. Hãy liên tục trao đổi trong **cùng một hộp thoại chat** thay vì tạo cuộc hội thoại mới, vì AI cần "nhớ" lịch sử các vòng lặp sửa lỗi trước đó để không giẫm lại vết xe đổ.

---

## 6. Tổng kết

- **Tư duy cốt lõi:** Prompt lặp là sự thừa nhận rằng sự hoàn hảo ngay lần đầu tiên là một điều rất hiếm trong kỹ thuật lập trình phần mềm.
- **Giá trị của phản hồi:** AI không có cảm xúc, đừng ngại chê trách mã của nó. Hãy chỉ rõ nó sai ở đâu một cách trực diện: *"Hàm này chạy chậm", "Biến này đặt tên sai chuẩn công ty", "Thư viện này bị cảnh báo bảo mật"*.
- **Giữ ngữ cảnh:** Luôn duy trì luồng chỉnh sửa trong cùng một phiên trò chuyện (Session) để tận dụng bộ nhớ ngắn hạn của công cụ AI.
- **Kỹ năng vòng lặp:** Quy trình chuẩn của một Kỹ sư làm chủ AI luôn là: Thử nghiệm (Test) -> Phân tích lỗi (Analyze) -> Ra lệnh điều chỉnh (Refine).

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A conceptual infographic detailing the 3 steps of Iterative Prompting. Step 1 "Initial Prompt" showing a basic text bubble. Step 2 "Analyze Output" showing a radar scanning a code snippet. Step 3 "Refine & Iterative Feedback" showing a targeted laser beam modifying the code. Professional corporate aesthetic, clean UI vectors.

---

## 7. Câu hỏi đánh giá

**Câu 1:** Trình bày định nghĩa của Iterative Prompting (Kỹ thuật Prompt lặp) và nêu rõ 3 bước của quy trình này.

*Gợi ý đáp án:* 
- **Định nghĩa:** Là quá trình giao tiếp nhiều vòng liên tục với AI, trong đó người dùng phân tích kết quả hiện tại do AI sinh ra, cung cấp thông tin phản hồi và tinh chỉnh yêu cầu để AI tạo ra phiên bản giải pháp hoàn hảo hơn.
- **3 bước:** (1) **Khởi tạo** (Đưa ra Prompt lần đầu tiên); (2) **Đánh giá** (Chạy thử đoạn mã, kiểm tra lỗi hoặc đọc thẩm định kết quả); (3) **Điều chỉnh** (Phản hồi lại cho AI biết điểm chưa đạt và cung cấp các ràng buộc mới để buộc AI sửa lỗi).

**Câu 2:** Lập trình viên A yêu cầu AI viết một đoạn mã sinh mật khẩu ngẫu nhiên. AI trả về đoạn mã rất dài và khó đọc. Thay vì yêu cầu AI chỉnh sửa lại trong cùng hộp thoại, lập trình viên A bực mình, xóa đoạn hội thoại đó, mở một cửa sổ chat mới và gõ lại y hệt lệnh ban đầu với hy vọng AI sẽ "làm tốt hơn". Phân tích sai lầm của lập trình viên A dựa trên kiến thức về quy trình Prompt lặp.

*Gợi ý đáp án:*
- **Sai lầm 1 (Bỏ qua cơ hội phản hồi):** AI không tự nhiên sinh ra kết quả mới nếu dữ liệu đầu vào (Prompt) không có sự thay đổi. Việc tạo hội thoại mới và gõ lại lệnh cũ (không có bất kỳ hướng dẫn hay ràng buộc bổ sung nào) sẽ khiến AI tiếp tục sinh ra cấu trúc phức tạp tương tự.
- **Sai lầm 2 (Làm mất ngữ cảnh hệ thống):** Bằng cách xóa hộp thoại, lập trình viên đã làm mất đi nền tảng giao tiếp. Đáng lẽ ra, A nên ở lại hộp thoại cũ và thực hiện vòng lặp phản hồi trực tiếp: *"Mã của bạn hoạt động được nhưng quá dài và phức tạp. Hãy rút gọn nó xuống dưới 5 dòng và dùng thư viện `Apache Commons Lang` có sẵn của dự án."* Điều này giúp AI tự học từ sai lầm trước đó của chính nó để cải tiến kết quả ngay lập tức.

**Câu 3 (Thực chiến):** Bạn đang dùng AI để tạo một đoạn truy vấn SQL thống kê số lượng đơn hàng trong cơ sở dữ liệu. 
Ở vòng lặp đầu tiên, câu lệnh SQL mà AI tạo ra chỉ đếm tổng số lượng đơn hàng, nhưng dự án của bạn lại yêu cầu bỏ qua những đơn hàng đã bị hủy (Trường `Status` = 'CANCELED'). 
Ở vòng lặp thứ hai, bạn nhắc AI thêm điều kiện, AI đã tự động loại bỏ đơn hàng bị hủy, nhưng khi đưa lên Server chạy thì câu lệnh cực kỳ chậm vì AI quên sử dụng kỹ thuật Index. 
Hãy viết nội dung Prompt phản hồi ở "Vòng lặp thứ 3" để yêu cầu AI tinh chỉnh lại câu lệnh tối ưu nhất.

*Gợi ý đáp án (Tham khảo mẫu Prompt sau):*
- *Yêu cầu ở vòng lặp 3:* "Câu lệnh SQL vừa rồi của bạn đã lọc đúng được những đơn hàng không bị hủy, nhưng hiệu năng thực thi (Query Execution Time) trên cơ sở dữ liệu hàng triệu dòng lại quá chậm do cơ chế quét toàn bảng (Full Table Scan). Hãy tối ưu lại câu truy vấn này. Tôi gợi ý hãy phân tích việc sử dụng kỹ thuật đánh chỉ mục (Index) trên cột `Status` hoặc thiết kế lại cấu trúc mệnh đề `WHERE` để giảm thiểu chi phí truy vấn. Trả về câu lệnh SQL mới kèm lời giải thích ngắn về nguyên lý tối ưu."
