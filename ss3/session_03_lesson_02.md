# Session 03 - Lesson 02: 5 thành phần tạo nên Prompt chuẩn và hiệu quả

## 1. Mục tiêu học tập

Sau khi hoàn thành Lesson này, người học có thể:

- Hiểu được cấu trúc 5 thành phần cốt lõi của một Prompt chuẩn mực: Vai trò, Mục tiêu, Ngữ cảnh, Ràng buộc và Định dạng.
- Phân tích được lý do tại sao thiếu vắng một trong các thành phần này lại dẫn đến hiện tượng AI trả về kết quả sai lệch (Garbage In, Garbage Out).
- Thực hiện thiết kế và viết được các Prompt chuyên nghiệp dựa trên bộ khung 5 thành phần.
- Áp dụng cấu trúc Prompt này vào các công việc thực tế trong dự án lập trình Java hoặc các nghiệp vụ phân tích tài liệu kỹ thuật tại doanh nghiệp.

---

## 2. Đặt vấn đề thực tế

Trong môi trường phát triển phần mềm, một lập trình viên thực tập khi nhận yêu cầu "Tạo chức năng gửi email" đã vội vàng sử dụng AI với câu lệnh:
*"Viết cho tôi code gửi email."*

Kết quả, AI trả về một đoạn mã Python sử dụng thư viện `smtplib` với mật khẩu được gắn cứng (hardcode) trong mã nguồn. Tuy nhiên, dự án của công ty lại đang viết bằng hệ sinh thái **Java (Spring Boot)** và yêu cầu bảo mật cao với việc đọc cấu hình từ biến môi trường. Người thực tập sinh mất thêm 2 giờ đồng hồ liên tục phản hồi qua lại với AI để "nắn" đoạn mã về đúng ngôn ngữ, đúng chuẩn bảo mật và đúng luồng nghiệp vụ.

Sự cố trên xảy ra không phải vì AI kém thông minh, mà vì kỹ sư đã giao tiếp với AI bằng một câu lệnh "mù mờ", thiếu định hướng và vô căn cứ. Trong kỹ thuật làm việc với trí tuệ nhân tạo, một câu lệnh (Prompt) không có cấu trúc giống như việc bạn lên xe taxi nhưng chỉ nói "Hãy chở tôi đi" mà không cung cấp điểm đến, thời gian hay cung đường mong muốn.

Để làm chủ AI, bạn cần làm chủ cách giao tiếp với nó thông qua cấu trúc **5 thành phần tạo nên một Prompt chuẩn và hiệu quả**.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A split-screen illustration. On the left, a frustrated junior developer receiving irrelevant Python code from an AI because of a vague prompt. On the right, a confident developer receiving perfect, secure Java Spring Boot code after providing a structured, 5-element prompt. Clean corporate tech aesthetic, highly detailed, 8k resolution.

---

## 3. Kiến thức cốt lõi

Một Prompt chuyên nghiệp và hiệu quả cao (High-Quality Prompt) thường được cấu thành từ 5 yếu tố cốt lõi (Formula: Role - Goal - Context - Constraint - Format).

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric infographic showing a glowing pentagon or puzzle with 5 interlocking pieces labeled "Role", "Goal", "Context", "Constraint", and "Format". The pieces fit together to form a glowing, powerful core representing a "High-Quality Prompt". Futuristic, professional corporate IT style, dark mode with neon blue and green accents.

### 3.1. Vai trò (Role)
- **Định nghĩa:** Xác định nhân dạng hoặc vị trí chuyên môn mà AI cần đóng vai để phản hồi.
- **Vai trò:** Giúp AI kích hoạt đúng vùng kiến thức chuyên ngành, sử dụng đúng văn phong và góc nhìn nghiệp vụ.
- **Khi nào sử dụng:** Khi bài toán cần sự tư vấn chuyên sâu, thiết kế kiến trúc hoặc cần phản biện kỹ thuật.
- **Ví dụ nghiệp vụ:** *"Hãy đóng vai trò là một Java Senior Developer với 10 năm kinh nghiệm về bảo mật hệ thống."*

### 3.2. Mục tiêu (Goal / Task)
- **Định nghĩa:** Hành động cụ thể và kết quả cuối cùng bạn muốn AI thực hiện.
- **Vai trò:** Là kim chỉ nam để AI không bị lạc đề và đi thẳng vào vấn đề chính.
- **Khi nào sử dụng:** Bắt buộc trong mọi Prompt.
- **Ví dụ nghiệp vụ:** *"Viết một lớp dịch vụ (Service class) xử lý chức năng đăng nhập."*

### 3.3. Ngữ cảnh (Context)
- **Định nghĩa:** Thông tin nền tảng, hoàn cảnh hệ thống hoặc dữ liệu đầu vào có liên quan đến bài toán.
- **Vai trò:** Giúp AI hiểu hệ thống của bạn đang hoạt động như thế nào để đưa ra giải pháp tương thích, tránh hiện tượng Ảo giác (Hallucination).
- **Khi nào sử dụng:** Khi hệ thống có các luồng dữ liệu phức tạp, công nghệ đặc thù hoặc có hệ sinh thái phiên bản cũ.
- **Ví dụ nghiệp vụ:** *"Dự án đang sử dụng Java 17, Spring Boot 3.x, và bảo mật bằng JWT. Khách hàng yêu cầu tốc độ phản hồi API dưới 200ms."*

### 3.4. Ràng buộc (Constraint)
- **Định nghĩa:** Các ranh giới, luật lệ hoặc giới hạn mà AI không được phép vi phạm khi sinh ra kết quả.
- **Vai trò:** Ngăn chặn AI tự do sáng tạo sai hướng (Garbage Out) hoặc sử dụng các thư viện lỗi thời, thiếu an toàn.
- **Khi nào sử dụng:** Bắt buộc khi có yêu cầu khắt khe về bảo mật, hiệu năng hoặc quy chuẩn mã nguồn (Clean Code).
- **Ví dụ nghiệp vụ:** *"Chỉ sử dụng các thư viện nội tại của Java, tuyệt đối không dùng vòng lặp while(true), phải có khối try-catch để bắt ngoại lệ."*

### 3.5. Định dạng (Format)
- **Định nghĩa:** Cách thức cấu trúc và trình bày kết quả đầu ra (bảng, danh sách, khối mã, định dạng file).
- **Vai trò:** Giúp bạn có thể sử dụng ngay lập tức kết quả của AI mà không phải mất công tinh chỉnh, định dạng lại bằng tay.
- **Khi nào sử dụng:** Khi cần xuất dữ liệu để báo cáo, nộp tài liệu hoặc sao chép thẳng vào mã nguồn.
- **Ví dụ nghiệp vụ:** *"Trình bày kết quả dưới dạng Markdown, sử dụng khối mã (code block) cho Java và thêm comment giải thích bằng tiếng Việt phía trên mỗi hàm."*

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Công ty tài chính đang phát triển một hệ thống quản lý giao dịch. Nhóm phát triển cần tối ưu hóa một hàm tính toán thuế phức tạp đang chạy rất chậm do dùng nhiều vòng lặp lồng nhau.

### Thách thức
Một lập trình viên Junior ném nguyên hàm mã nguồn lên AI với câu lệnh: *"Hãy làm cho đoạn code này chạy nhanh hơn"*. Kết quả, AI trả về một hàm hoàn toàn mới, tối ưu hiệu năng rất tốt nhưng lại làm thay đổi logic làm tròn số thập phân (từ đối tượng `BigDecimal` thành kiểu nguyên thủy `double`), gây ra sai số nghiêm trọng trong hệ thống kế toán.

### Cách tiếp cận
Áp dụng cấu trúc 5 thành phần để thiết kế lại Prompt một cách chuyên nghiệp:
- **(Vai trò):** Hãy đóng vai là một Kỹ sư phần mềm Java tối ưu hiệu năng cấp cao (Performance Engineer).
- **(Mục tiêu):** Phân tích và tái cấu trúc (refactor) đoạn mã tính thuế sau để giảm thời gian thực thi (Đính kèm mã nguồn).
- **(Ngữ cảnh):** Đoạn mã này được chạy hằng ngày vào cuối tháng với hàng triệu giao dịch, sử dụng Java 17.
- **(Ràng buộc):** Bắt buộc phải duy trì việc tính toán bằng đối tượng `BigDecimal` để không bị sai số tiền tệ. Cấm sử dụng kiểu `double` hay `float`. Giữ nguyên tên hàm và tên tham số đầu vào.
- **(Định dạng):** Đưa ra một bảng tóm tắt thời gian chạy ước tính (Big O) của thuật toán cũ và mới. Sau đó cung cấp đoạn mã đã tối ưu trong khối mã Java có comment.

### Kết quả
AI hiểu rõ ràng giới hạn rủi ro tài chính, từ đó sử dụng `BigDecimal` kết hợp với `Stream API` của Java 17 để tính toán song song, giúp tăng tốc độ xử lý lên 40% mà vẫn giữ độ chuẩn xác tuyệt đối từng đơn vị tiền tệ. Lập trình viên có ngay bảng phân tích thuật toán để đưa vào báo cáo cải tiến công nghệ cuối tháng.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A conceptual illustration showing a slow, tangled web of red code (representing nested loops) transforming into a sleek, streamlined, and fast-moving beam of green code (representing optimized Stream API and BigDecimal in Java). A structured AI prompt acts as the catalyst in the middle. Professional software engineering context, modern flat vector art.

---

## 5. Demo minh họa

**Mục tiêu demo:** Minh họa cách chuyển hóa một câu lệnh (Prompt) tồi thành một Prompt hiệu quả với đầy đủ 5 thành phần để thiết kế cơ sở dữ liệu.

**Điều kiện chuẩn bị:** Sử dụng ChatGPT, Claude hoặc Copilot Chat.

**Các bước thực hiện:**
1. Mở cửa sổ giao tiếp với hệ thống AI.
2. Phác thảo từng thành phần theo khung 5 bước.
3. Ghép nối thành một đoạn Prompt hoàn chỉnh.
4. Gửi cho AI và kiểm chứng kết quả kiến trúc chuẩn mực.

**Prompt sử dụng (Mẫu hoàn chỉnh):**
```text
[Vai trò] Hãy đóng vai trò là một System Architect chuyên về thiết kế cơ sở dữ liệu quan hệ (RDBMS).
[Mục tiêu] Hãy thiết kế cho tôi một lược đồ cơ sở dữ liệu (Database Schema) cho tính năng "Quản lý thư viện mượn trả sách".
[Ngữ cảnh] Hệ thống này phục vụ cho sinh viên đại học, một cuốn sách có thể có nhiều bản sao, một sinh viên có thể mượn tối đa 3 cuốn cùng lúc, thời gian mượn tối đa 14 ngày. 
[Ràng buộc] Cơ sở dữ liệu sử dụng là MySQL. Các bảng phải đạt chuẩn hệ chuẩn hóa 3NF. Phải có khóa ngoại (Foreign Key) rõ ràng và có trường lưu vết thời gian (created_at, updated_at).
[Định dạng] Xuất kết quả dưới dạng sơ đồ Mermaid Entity Relationship (ER Diagram) để tôi có thể vẽ ngay lập tức, kèm theo danh sách các bảng giải thích ngắn gọn bằng tiếng Việt.
```

**Kết quả mong đợi:**
AI sẽ trả về đúng một khối mã Mermaid mô tả cấu trúc các bảng (User, Book, BookCopy, BorrowRecord), các liên kết khóa ngoại 1-N chuẩn xác, kèm theo phần giải thích rõ ràng mà không bị lạc sang các công nghệ dữ liệu NoSQL không mong muốn.

**Lưu ý thực tế:**
Bạn không cần lúc nào cũng viết cứng các chữ "[Vai trò]", "[Mục tiêu]" trong Prompt. Chỉ cần các khối thông tin đó xuất hiện theo một trình tự logic tự nhiên (như các đoạn văn hoặc gạch đầu dòng) là AI đã đủ khả năng đọc hiểu và điều hướng (Steerability).

---

## 6. Tổng kết

- **Tầm quan trọng:** Viết Prompt là quá trình tư duy giao việc chứ không phải gõ văn bản cơ bản. Sự thiếu hụt ngữ cảnh và ràng buộc là nguyên nhân chính dẫn đến sự cố phần mềm khi dùng AI.
- **Bộ khung 5 thành phần:** Hãy luôn nhớ cấu trúc **Vai trò - Mục tiêu - Ngữ cảnh - Ràng buộc - Định dạng** (Role, Goal, Context, Constraint, Format) trước khi yêu cầu AI làm bất cứ điều gì phức tạp.
- **Sai lầm thường gặp:** Bỏ qua yếu tố **Ràng buộc (Constraint)** khiến AI tự ý sinh mã có chứa các thư viện lỗi thời, thiếu bảo mật hoặc vi phạm quy tắc hệ thống hiện tại của công ty.
- **Lưu ý áp dụng:** Tùy vào độ khó của bài toán, bạn có thể linh hoạt rút gọn thành phần. Tuy nhiên, đối với bài toán thao tác trực tiếp vào mã nguồn, "Ràng buộc" và "Ngữ cảnh" là hai yếu tố bắt buộc phải có để giữ an toàn cho dự án.

---

## 7. Câu hỏi đánh giá

**Câu 1:** Hãy liệt kê và nêu định nghĩa ngắn gọn của 5 thành phần cấu tạo nên một Prompt chuẩn trong môi trường phát triển phần mềm có sự hỗ trợ của AI.

*Gợi ý đáp án:* 5 thành phần bao gồm: 
1. **Vai trò (Role):** Xác định vị trí/chuyên môn của AI. 
2. **Mục tiêu (Goal):** Hành động chính và kết quả mong đợi AI cần làm. 
3. **Ngữ cảnh (Context):** Hoàn cảnh, công nghệ hiện tại và thông tin nền của hệ thống. 
4. **Ràng buộc (Constraint):** Các giới hạn, luật lệ mà AI tuyệt đối không được vi phạm. 
5. **Định dạng (Format):** Cách tổ chức và trình bày kết quả đầu ra.

**Câu 2:** Một lập trình viên sử dụng AI với Prompt sau: *"Cung cấp đoạn mã đăng nhập hệ thống"*. Dưới góc độ chất lượng, hãy phân tích và chỉ ra ít nhất 3 thành phần đang bị thiếu hụt nghiêm trọng trong Prompt này, giải thích hậu quả của sự thiếu hụt đó đối với một dự án doanh nghiệp lớn.

*Gợi ý đáp án:*
- **Thiếu Vai trò:** AI sẽ trả lời với tư cách máy móc chung chung, thiếu đi cái nhìn khắt khe của một chuyên gia bảo mật.
- **Thiếu Ngữ cảnh:** Không rõ hệ thống dùng ngôn ngữ lập trình nào (Java, Python?), cơ sở dữ liệu gì, khiến AI phỏng đoán ngẫu nhiên và sinh ra mã không khớp dự án.
- **Thiếu Ràng buộc:** Đây là phần nguy hiểm nhất. Do thiếu các ràng buộc về an toàn thông tin (như bắt buộc mã hóa mật khẩu, chống lỗi SQL Injection), AI dễ dàng sinh ra mã đăng nhập sơ sài, tạo ra lỗ hổng bảo mật chí mạng cho toàn bộ dữ liệu của doanh nghiệp lớn.

**Câu 3 (Thực chiến):** Đội ngũ dự án yêu cầu bạn viết một tài liệu hướng dẫn tích hợp API (API Documentation) cho chức năng "Thanh toán giỏ hàng". Bạn có sẵn một file mã nguồn Java của Controller đang xử lý thanh toán. Hãy vận dụng kỹ thuật 5 thành phần để thiết kế một đoạn Prompt hoàn chỉnh nhờ AI viết tài liệu này thay bạn.

*Gợi ý đáp án (Tham khảo Prompt sau):*
- **Vai trò:** Hãy đóng vai là một Technical Writer (Kỹ sư viết tài liệu kỹ thuật) có chuyên môn sâu về phân tích hệ thống tài chính.
- **Mục tiêu:** Hãy đọc đoạn mã nguồn Java Controller (đính kèm bên dưới) và viết tài liệu API Documentation cho tính năng "Thanh toán giỏ hàng".
- **Ngữ cảnh:** API này cung cấp cho các đối tác thương mại điện tử bên thứ ba sử dụng để kết nối hệ thống. Dự án đang yêu cầu tính minh bạch dữ liệu cực kỳ cao.
- **Ràng buộc:** Tài liệu bắt buộc phải giải thích chi tiết các mã lỗi HTTP Status (200, 400, 500) và các kịch bản thanh toán thất bại do thiếu số dư. Không dùng từ ngữ đa nghĩa.
- **Định dạng:** Trình bày tài liệu bằng ngôn ngữ Markdown chuyên nghiệp. Cung cấp một bảng cấu trúc tham số Request/Response và kèm theo một khối mã JSON minh họa (Mock Data) chuẩn xác.
