# Session 03 - Lesson 03: Viết Prompt cho các nhu cầu học tập

## 1. Mục tiêu học tập

Sau khi hoàn thành Lesson này, người học có thể:

- Nắm vững 3 nhóm kỹ năng Prompt cơ bản phục vụ nhu cầu tiếp thu kiến thức mới: Tóm tắt, Giải thích và Liệt kê.
- Phân tích được điểm mạnh của AI trong việc chuyển hóa các tài liệu chuyên ngành phức tạp thành kiến thức dễ tiêu hóa.
- Thực hiện thiết kế các lệnh Prompt kết hợp với cấu trúc 5 thành phần (Role - Goal - Context - Constraint - Format) để học các công nghệ lập trình mới một cách chủ động.
- Áp dụng các kỹ thuật này để nhanh chóng nắm bắt tài liệu dự án, mã nguồn legacy (mã cũ) và cấu trúc kiến trúc phần mềm trong doanh nghiệp.

_Gợi ý hình ảnh minh họa:_

> [prompt hình ảnh] An isometric illustration of a programmer's desk. Floating above the desk are three glowing holographic icons: a "Summary" icon (a condensed document), an "Explain" icon (a lightbulb over a complex code block), and a "List" icon (a neat checklist). The programmer is interacting with these holograms via an AI chat interface. Bright, clean corporate tech style, highly detailed.

---

## 2. Đặt vấn đề thực tế

Bạn vừa được tuyển vào vị trí Fresher Java tại một công ty công nghệ lớn. Ngay trong tuần đầu tiên, Technical Lead giao cho bạn một bộ tài liệu nội bộ dài 50 trang tiếng Anh về chuẩn giao tiếp Microservices và yêu cầu bạn phải cấu hình thành công một API tích hợp bằng Spring Boot trong vòng 3 ngày.

Mở tài liệu ra, bạn choáng ngợp trước hàng loạt khái niệm mới mẻ: "Service Discovery", "API Gateway", "Circuit Breaker", "Kafka Event-driven"... Thời gian thì có hạn, việc đọc từ dòng đầu tiên đến dòng cuối cùng sẽ làm bạn trễ mất deadline (hạn chót). Nếu mang lên hỏi trực tiếp các kỹ sư cấp cao liên tục, bạn e ngại sẽ làm phiền công việc của họ.

Làm thế nào để bạn có thể tiếp thu một lượng kiến thức khổng lồ, hiểu được các khái niệm trừu tượng, và trích xuất ra được những bước cấu hình thực tế nhất trong một thời gian ngắn? Đây chính là lúc kỹ thuật viết Prompt cho 3 nhu cầu học tập: **Tóm tắt, Giải thích và Liệt kê** phát huy sức mạnh.

---

## 3. Kiến thức cốt lõi

Việc sử dụng AI để học tập không phải là bảo AI làm hộ, mà là biến AI thành một "gia sư cá nhân" (Personal Tutor). Ba kỹ thuật dưới đây là xương sống của việc học tập chủ động và tăng tốc trong ngành phần mềm.

### 3.1. Kỹ thuật Tóm tắt (Summarization)

- **Định nghĩa:** Yêu cầu AI nén một tài liệu dài (văn bản, mã nguồn, log lỗi) thành một bản tóm lược giữ nguyên ý chính.
- **Vai trò:** Tiết kiệm thời gian đọc tài liệu, nắm bắt nhanh bức tranh tổng quan (Big Picture) của dự án.
- **Khi nào sử dụng:** Khi cần tiếp cận công nghệ mới, đọc hiểu các tài liệu API (Swagger/OpenAPI), hoặc xem qua cấu trúc của một kho lưu trữ mã nguồn lạ.
- **Ví dụ Prompt:** _"Hãy đóng vai trò Kỹ sư trưởng, tóm tắt cho tôi 3 nguyên tắc cốt lõi nhất của tài liệu bảo mật nội bộ này trong 150 chữ."_

### 3.2. Kỹ thuật Giải thích (Explanation)

- **Định nghĩa:** Yêu cầu AI làm rõ một khái niệm trừu tượng, một khối mã phức tạp hoặc một cơ chế hoạt động.
- **Vai trò:** Phá vỡ rào cản thuật ngữ kỹ thuật, giúp người học hiểu sâu bản chất (Root cause) thay vì chỉ biết bề mặt.
- **Khi nào sử dụng:** Khi gặp các khái niệm học thuật khó (như Đa hình, Garbage Collection trong Java), hoặc khi đọc một khối mã nguyên khối (Monolithic) không có chú thích.
- **Ví dụ Prompt:** _"Giải thích cơ chế hoạt động của `HashMap` trong Java bằng một phép ẩn dụ liên quan đến việc xếp sách trong thư viện để một học sinh cấp 3 cũng hiểu được."_

### 3.3. Kỹ thuật Liệt kê (Listing/Actionable Steps)

- **Định nghĩa:** Yêu cầu AI trích xuất thông tin và chuyển hóa chúng thành một danh sách các đầu mục hoặc các bước hành động cụ thể.
- **Vai trò:** Biến kiến thức lý thuyết thành kế hoạch thực thi (Checklist).
- **Khi nào sử dụng:** Khi chuẩn bị cấu hình dự án, lên danh sách các công việc cần làm (To-do list) hoặc so sánh các tính năng công nghệ.
- **Ví dụ Prompt:** _"Dựa vào khái niệm Spring Security vừa giải thích, hãy liệt kê cho tôi 5 bước kỹ thuật chính xác để cấu hình xác thực JWT trong dự án hiện tại."_

_Gợi ý hình ảnh minh họa:_

> [prompt hình ảnh] A visual metaphor showing a large, chaotic pile of documents entering an AI glowing core. Inside the core, three beams separate the data into: a tiny condensed glowing cube (Summarize), a magnifying glass showing clear internal mechanics (Explain), and a structured checklist projected on a glass board (List). Modern software engineering environment, cyan and orange neon lighting.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh

Tại công ty phần mềm, bạn được giao nhiệm vụ bảo trì một dịch vụ cũ (Legacy Service). Trong đó, có một hàm `processTransaction` viết bằng Java 8 dài 300 dòng, hoàn toàn không có ghi chú (Comment). Hàm này chịu trách nhiệm thanh toán tiền điện nhưng lại thường xuyên bị báo cáo chạy chậm.

### Thách thức

Hàm quá dài và sử dụng rất nhiều vòng lặp `for` lồng nhau. Bạn không hiểu mục đích của từng cụm lệnh là gì, cũng không biết phải bắt đầu tối ưu từ đâu trong hàng ngàn dòng mã.

### Cách tiếp cận

Áp dụng bộ ba kỹ năng Prompt Học tập để từng bước "chinh phục" khối mã nguồn này:

1. **Dùng "Tóm tắt":** Bạn chép toàn bộ mã nguồn vào khung chat và dùng lệnh: _"Đóng vai trò người đánh giá mã (Code Reviewer), hãy tóm tắt cho tôi biết luồng thực thi chính của hàm này chia thành mấy giai đoạn lớn?"_ -> AI giúp bạn chia 300 dòng code thành 4 bước logic rõ ràng.
2. **Dùng "Giải thích":** Ở bước thứ 3 của hàm, có một lệnh truy vấn dữ liệu rất kỳ lạ. Bạn trích đoạn đó ra và yêu cầu: _"Giải thích ý nghĩa nghiệp vụ của đoạn logic này. Tại sao người viết mã cũ lại phải gom nhóm (group by) dữ liệu theo mã khách hàng trước khi tính tổng?"_ -> AI giải mã logic kế toán ẩn bên trong.
3. **Dùng "Liệt kê":** Sau khi hiểu trọn vẹn vấn đề, bạn dùng lệnh: _"Hãy liệt kê 3 điểm thắt nút cổ chai (bottleneck) về hiệu năng trong hàm này và đề xuất các lớp, thư viện Java phù hợp để thay thế chúng."_

### Kết quả

Chỉ trong 30 phút, thay vì phải đọc dò từng dòng mã một cách mù mờ, bạn đã có một cái nhìn tổng thể (Tóm tắt), hiểu rõ logic nghiệp vụ (Giải thích) và có ngay kế hoạch tái cấu trúc hệ thống (Liệt kê) để trình bày với Technical Lead.

---

## 5. Demo minh họa

**Mục tiêu demo:** Minh họa cách viết Prompt sử dụng kỹ thuật Giải thích kết hợp với Liệt kê để làm chủ một công nghệ lập trình Java mới (ví dụ: Tính năng Java Records).

**Điều kiện chuẩn bị:** Một trình duyệt mở ChatGPT, Claude hoặc công cụ Trợ lý nội tuyến trong IDE (như Antigravity).

**Các bước thực hiện:**

1. Mở cửa sổ giao tiếp với hệ thống AI.
2. Xây dựng Prompt áp dụng khung 5 thành phần kết hợp với từ khóa "Giải thích" và "Liệt kê".
3. Gửi lệnh cho AI và phân tích cấu trúc của câu trả lời nhận được.

**Prompt sử dụng:**

```text
[Vai trò] Đóng vai là một Giảng viên Java cấp cao chuyên đào tạo doanh nghiệp.
[Mục tiêu] Hãy giải thích khái niệm "Java Record" (được ra mắt ở Java 14) là gì, và liệt kê các trường hợp sử dụng tốt nhất của nó trong thực tế.
[Ngữ cảnh] Tôi là một lập trình viên mới chuyển từ C# sang học Java. Tôi cần hiểu bản chất công cụ thay vì chỉ đọc tài liệu khô khan.
[Ràng buộc] Tuyệt đối không sử dụng các từ ngữ quá học thuật. Khi giải thích, hãy lấy một ví dụ thực tế về việc tạo đối tượng "Khách hàng" (Customer).
[Định dạng] Trình bày bài học thành 2 phần rõ ràng.
- Phần 1: Giải thích khái niệm bằng phép ẩn dụ trong đời sống.
- Phần 2: Liệt kê 3 gạch đầu dòng về "Khi nào nên sử dụng", kèm một khối mã (Code block) minh họa.
```

**Kết quả mong đợi:**
AI sẽ cung cấp một bài giảng sinh động, ví dụ so sánh `Record` như một "chiếc hộp kính" (chỉ nhìn được dữ liệu lưu trữ chứ không thể sửa đổi - tính bất biến). Sau đó, AI xuất ra danh sách liệt kê chính xác các tình huống áp dụng `Record` để thay thế cho mô hình DTO (Data Transfer Object) truyền thống rườm rà, kèm mã Java minh họa rõ ràng. Người học hiểu ngay bản chất và biết cách code ngay lập tức.

---

## 6. Tổng kết

- **Bản chất của việc học cùng AI:** AI là người gia sư kiên nhẫn nhất thế giới. Việc tiếp cận kiến thức nên đi theo trình tự logic: Nhìn bức tranh lớn (**Tóm tắt**) -> Đào sâu bản chất (**Giải thích**) -> Hành động thực tế (**Liệt kê**).
- **Rủi ro và Cảnh báo:** Khi sử dụng kỹ thuật Tóm tắt, AI có xu hướng cắt gọt thông tin và có thể bỏ sót các trường hợp ngoại lệ quan trọng (Edge Cases). Khi học mã nguồn dự án thật, luôn sử dụng AI kết hợp với việc đối chiếu tài liệu kỹ thuật chính thức (Official Documentation) của công ty để thẩm định.
- **Tư duy cốt lõi:** Đừng yêu cầu AI "Làm bài tập thay tôi". Hãy yêu cầu AI "Giải thích cho tôi cách làm bài tập này".

_Gợi ý hình ảnh minh họa:_

> [prompt hình ảnh] A conceptual image of a futuristic classroom where a diverse software engineering student is interacting with a friendly, glowing AI mentor. The AI is projecting a flowchart showing a progression: a "Summary" node pointing to an "Explanation" node, pointing to an "Actionable List" node. Professional lighting, inspiring and educational tone.

---

## 7. Câu hỏi đánh giá

**Câu 1:** Hãy nêu đặc điểm và mục đích chính của ba kỹ năng Prompt học tập cốt lõi: Tóm tắt, Giải thích và Liệt kê khi áp dụng vào việc học lập trình.

_Gợi ý đáp án:_

- **Tóm tắt (Summarize):** Rút gọn mã nguồn dài hoặc tài liệu hệ thống thành ý chính. Mục đích: Nắm bắt nhanh bức tranh tổng quát (Big Picture), tiết kiệm thời gian đọc hiểu ban đầu.
- **Giải thích (Explain):** Phân tích chi tiết một khái niệm khó hoặc một đoạn logic nghiệp vụ phức tạp. Mục đích: Giúp người học hiểu sâu bản chất, nguyên lý hoạt động thay vì học vẹt câu lệnh.
- **Liệt kê (List):** Trích xuất kiến thức thành các danh sách hoặc các bước thực hiện tuần tự. Mục đích: Chuyển hóa lý thuyết thành hành động thực tiễn (Ví dụ: Checklist các bước cấu hình bảo mật, các bước gỡ lỗi).

**Câu 2:** Một sinh viên đưa một khối mã thuật toán tính toán thuế cực kỳ phức tạp lên AI và gõ: _"Code này chạy ra kết quả gì?"_. Dưới góc độ một kỹ sư sử dụng AI làm gia sư, hãy phân tích tại sao đây là một Prompt học tập kém hiệu quả và đề xuất cách sử dụng kỹ thuật "Giải thích" để khắc phục tình trạng này.

_Gợi ý đáp án:_

- **Phân tích sai lầm:** Prompt _"Code này chạy ra kết quả gì?"_ thể hiện tư duy ỷ lại, phụ thuộc vào công cụ (nhờ máy giải bài tập thay vì tự học). Người học chỉ nhận được kết quả tính toán cuối cùng mà không hiểu được luồng dữ liệu bên trong di chuyển như thế nào, làm triệt tiêu khả năng tư duy xây dựng thuật toán.
- **Đề xuất khắc phục:** Cần chuyển đổi thành một Prompt yêu cầu Giải thích. Ví dụ: _"Hãy đóng vai là một chuyên gia thuật toán. Đừng đưa ra kết quả cuối cùng vội, hãy giải thích từng bước (step-by-step) luồng chạy của vòng lặp xử lý thuế trong khối mã này và cách biến tổng đang thay đổi. Hãy giải thích theo ngôn ngữ dễ hiểu nhất."_

**Câu 3 (Thực chiến):** Bạn chuẩn bị bắt tay vào học nền tảng `Spring Boot` để làm một dự án quản lý nhân sự. Thay vì lên mạng tìm kiếm các bài hướng dẫn hỗn tạp, hãy thiết kế một đoạn Prompt duy nhất (áp dụng cấu trúc 5 thành phần) kết hợp cả 3 kỹ năng (Tóm tắt, Giải thích, Liệt kê) để nhờ AI tạo ra một lộ trình tự học Spring Boot trong 7 ngày dành cho bạn.

_Gợi ý đáp án (Tham khảo đoạn Prompt mẫu sau):_

- **Vai trò:** Hãy đóng vai là một Tech Lead Java tận tâm, chuyên đào tạo thực tập sinh trong doanh nghiệp.
- **Mục tiêu:** Xây dựng cho tôi một lộ trình tự học framework `Spring Boot` cấp tốc trong vòng 7 ngày.
- **Ngữ cảnh:** Tôi đã nắm vững Java Core và lý thuyết Hướng đối tượng (OOP), nhưng chưa từng làm Web Backend. Mục tiêu cuối cùng của tôi là phải tự viết được một API Quản lý Nhân sự cơ bản.
- **Ràng buộc:** Cần thực tế, bỏ qua các lý thuyết hàn lâm cũ kỹ ít dùng. Lộ trình phải đi thẳng vào mô hình RESTful API và cách kết nối Cơ sở dữ liệu (sử dụng Spring Data JPA).
- **Định dạng:**
  - Bước 1: **Tóm tắt** ngắn gọn kiến trúc cơ bản của một dự án Spring Boot (Mô hình Controller - Service - Repository).
  - Bước 2: **Giải thích** khái niệm "Dependency Injection" (Tiêm phụ thuộc) bằng một phép ẩn dụ dễ hiểu ngoài đời thực.
  - Bước 3: Trình bày lộ trình 7 ngày dưới dạng danh sách **Liệt kê**, trong đó mỗi ngày có 2 gạch đầu dòng về hành động cụ thể cần code và thực hành.
