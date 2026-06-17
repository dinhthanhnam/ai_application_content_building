# Session 05 - Lesson 02: Kỹ thuật Prompt so sánh, đưa lựa chọn, phân tích giả định

## 1. Mục tiêu học tập
Sau khi hoàn thành Lesson này, người học có thể:
- Hiểu được cách biến AI từ một công cụ sinh mã nguồn đơn thuần thành một "Đối tác kỹ thuật" (Sparring Partner) thông qua các kỹ thuật Prompt phân tích đa chiều.
- Thực hiện thiết kế Prompt yêu cầu AI đưa ra nhiều lựa chọn kiến trúc hoặc công nghệ, kèm theo bảng so sánh ưu/nhược điểm rõ ràng.
- Vận dụng kỹ thuật "Phân tích giả định" (What-if Analysis) để đánh giá rủi ro hệ thống trước khi quyết định viết dòng mã đầu tiên.
- Áp dụng các kỹ năng này vào quá trình thiết kế hệ thống (System Design) và lựa chọn thư viện trong các dự án Java/Spring Boot thực tế.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric illustration of a professional tech war room. A software architect is analyzing three glowing, floating holographic pathways labeled A, B, and C. An AI assistant is projecting a comparison table detailing the pros, cons, and risks of each path. High tech corporate aesthetic, sharp vector style, deep blue and emerald green lighting.

---

## 2. Đặt vấn đề thực tế

Đội ngũ kỹ sư tại công ty đang bắt đầu xây dựng tính năng "Lưu trữ lịch sử thao tác người dùng" (Audit Log) cho một dự án ngân hàng. 

Một lập trình viên trẻ ngay lập tức mở AI lên và gõ: *"Hãy viết đoạn mã Java lưu Audit Log vào bảng SQL"*. AI nhanh chóng đáp ứng bằng một luồng mã kết nối JDBC thẳng vào cơ sở dữ liệu quan hệ. 
Sáu tháng sau, khi hệ thống đạt mức 10 triệu giao dịch một ngày, bảng SQL chứa Audit Log phình to khổng lồ, gây nghẽn và làm chậm toàn bộ hệ thống giao dịch cốt lõi, buộc công ty phải đập đi xây lại bằng cơ sở dữ liệu phi quan hệ (NoSQL).

Vấn đề ở đây là gì? Lập trình viên đã mặc định "đóng đinh" giải pháp (lưu vào SQL) thay vì nhờ AI tư vấn. Trong kỹ thuật phần mềm, quyết định thiết kế (Design Decisions) quan trọng hơn việc viết mã rất nhiều. 

Làm thế nào để tận dụng trí tuệ khổng lồ của AI nhằm tìm ra giải pháp tối ưu nhất trước khi hành động? Đó là lúc bạn cần áp dụng **Kỹ thuật Prompt so sánh, đưa lựa chọn và phân tích giả định**.

---

## 3. Kiến thức cốt lõi

Thay vì sử dụng AI như một thợ gõ code (Coder) cấp thấp, hãy nâng cấp nó thành Kiến trúc sư hệ thống (System Architect) của riêng bạn bằng 3 kỹ thuật Prompt sau:

### 3.1. Kỹ thuật đưa lựa chọn (Multiple Options Prompting)
- **Định nghĩa:** Thay vì yêu cầu AI sinh ra một giải pháp duy nhất, hãy ép nó phải đề xuất từ 2 đến 3 phương án giải quyết khác nhau cho cùng một bài toán.
- **Vai trò:** Tránh tư duy lối mòn (Confirmation Bias), giúp kỹ sư nhìn thấy những giải pháp công nghệ hiện đại hơn mà bản thân chưa từng nghĩ tới.
- **Ví dụ nghiệp vụ:** *"Tôi cần xử lý hàng triệu file báo cáo Excel mỗi ngày bằng Java. Hãy đưa ra 3 phương án kiến trúc khác nhau để giải quyết bài toán này, đi từ cấu trúc Monolithic truyền thống đến Microservices."*

### 3.2. Kỹ thuật So sánh (Comparison/Trade-off Analysis)
- **Định nghĩa:** Yêu cầu AI đặt các công nghệ hoặc giải pháp lên bàn cân để phân tích ưu điểm, nhược điểm, và sự đánh đổi (Trade-off).
- **Vai trò:** Cung cấp góc nhìn định lượng và định tính rõ ràng, giúp kỹ sư dễ dàng thuyết trình, bảo vệ giải pháp với Giám đốc kỹ thuật (CTO) hoặc khách hàng.
- **Ví dụ nghiệp vụ:** *"Lập bảng so sánh chi tiết giữa việc dùng `RabbitMQ` và `Apache Kafka` cho tính năng gửi thông báo của dự án. So sánh dựa trên 4 tiêu chí: Độ trễ, Khả năng mở rộng, Mức độ dễ cài đặt trên Java, và Tỉ lệ mất mát dữ liệu."*

### 3.3. Kỹ thuật Phân tích giả định (What-if Scenario)
- **Định nghĩa:** Đưa ra các tình huống giả định khắc nghiệt (Stress test) vào Prompt để xem AI đánh giá giải pháp hiện hành có chống chịu được hay không.
- **Vai trò:** Dự báo rủi ro (Risk Management) và xây dựng hệ thống chịu lỗi (Fault-tolerance).
- **Ví dụ nghiệp vụ:** *"Nếu hệ thống áp dụng giải pháp lưu Cache bằng Redis theo thiết kế trên, chuyện gì sẽ xảy ra nếu cụm máy chủ Redis đột ngột chết (What if Redis goes down)? Hãy đề xuất cơ chế dự phòng (Fallback) bằng Java."*

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A split conceptual diagram. On one side, a "What-If" scenario showing a server crashing with red warning signs. On the other side, a glowing "Fallback" mechanism activating smoothly, routing data through a safe secondary path. AI nodes oversee the entire process. Corporate UI aesthetic, highly detailed schematic style.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Một công ty phần mềm y tế cần xây dựng chức năng "Tạo báo cáo sức khỏe" định kỳ hàng tháng cho bệnh nhân. Quá trình lấy dữ liệu và vẽ biểu đồ tạo báo cáo rất nặng, kéo dài khoảng 10 giây cho mỗi người.

### Thách thức
Nếu xử lý đồng bộ (Synchronous), người dùng bấm nút xong sẽ phải chờ 10 giây nhìn màn hình xoay vòng (loading), gây trải nghiệm cực kỳ tệ. Lập trình viên biết cần phải chuyển sang xử lý bất đồng bộ (Asynchronous) nhưng phân vân giữa 3 công nghệ trong hệ sinh thái Spring Boot: Dùng luồng `@Async`, Dùng Message Queue (`RabbitMQ`), hay Dùng Job chạy ngầm (`Spring Batch`).

### Cách tiếp cận và Kết quả
Lập trình viên sử dụng một lệnh Prompt kết hợp toàn bộ kỹ thuật So sánh và Phân tích giả định:
*"Dự án Spring Boot cần xử lý xuất báo cáo tốn 10 giây/lần. Hãy đề xuất và so sánh 3 phương án: Dùng `@Async`, Dùng `RabbitMQ`, Dùng `Spring Batch`. Lập bảng so sánh về độ khó triển khai và khả năng chịu tải. Tiếp theo, hãy phân tích giả định: Chuyện gì sẽ xảy ra với từng phương án nếu có 10,000 người cùng bấm nút xuất báo cáo trong vòng 1 giây?"*

AI xuất ra một bảng so sánh tuyệt đẹp. Ở phần giả định, AI cảnh báo rõ ràng: Nếu dùng `@Async` cơ bản, 10,000 yêu cầu cùng lúc sẽ làm sập máy chủ ngay lập tức do cạn kiệt tài nguyên Thread Pool. AI khuyên dự án nên sử dụng `RabbitMQ` để đưa các yêu cầu vào hàng đợi và cấu hình công nhân (Worker) xử lý dần. 

Nhờ cuộc hội thoại trên, kỹ sư đã ra quyết định chuẩn xác và tránh được một thảm họa sập hệ thống (System Crash) trong môi trường thực tế.

---

## 5. Demo minh họa

**Mục tiêu demo:** Sử dụng công cụ AI để lựa chọn thư viện xử lý JSON tối ưu nhất trong hệ sinh thái Java, bao gồm việc so sánh và phân tích rủi ro.

**Điều kiện chuẩn bị:** Một trình duyệt mở AI Chat (ChatGPT, Claude) hoặc sử dụng tính năng Chat trong IDE (Antigravity).

**Luồng Prompt thực tế (Demo Script):**

1. **Khởi tạo Prompt tích hợp Phân tích đa chiều:**
```text
[Vai trò] Hãy đóng vai trò là một System Architect chuyên về hệ sinh thái Java.
[Mục tiêu] Tư vấn cho tôi một thư viện xử lý dữ liệu JSON phù hợp nhất.
[Ngữ cảnh] Dự án đang dùng Java 17. Hệ thống viễn thông của chúng tôi cần xử lý khoảng 500,000 gói tin JSON dung lượng siêu lớn (mỗi file tầm 200MB) được đẩy về Server mỗi ngày.
[Định dạng & Quy trình thực hiện]
1. (Lựa chọn): Đề xuất 3 thư viện Java phổ biến nhất để xử lý JSON.
2. (So sánh): Lập một bảng so sánh 3 thư viện này dựa trên các tiêu chí: Tốc độ parse, Mức tiêu thụ RAM, Mức độ dễ sử dụng.
3. (Phân tích giả định): Chuyện gì sẽ xảy ra (What-if) nếu tôi dùng thư viện phổ biến nhất (ví dụ Jackson) để parse toàn bộ nội dung file 200MB vào bộ nhớ trong một lần? Nêu rõ lỗi gặp phải và viết một đoạn mã Java cấu hình luồng (Streaming API) để khắc phục.
```

2. **Kết quả mong đợi:**
AI sẽ đề xuất `Jackson`, `Gson` và `JSON.simple` (hoặc `Moshi`). Nó đưa ra bảng so sánh chỉ rõ `Jackson` có tốc độ cao nhưng ngốn RAM khủng khiếp nếu đọc nguyên tệp. Ở phần phân tích giả định, AI cảnh báo ngay rủi ro vỡ bộ nhớ `java.lang.OutOfMemoryError: Java heap space`. Kèm theo đó, AI cung cấp đoạn mã Java sử dụng đối tượng `JsonParser` (Jackson Streaming API) để đọc tệp khổng lồ theo từng dòng lẻ, giải quyết hoàn toàn bài toán quá tải RAM.

---

## 6. Tổng kết

- **Thay đổi tư duy:** Trong kỷ nguyên AI, viết dòng mã rất rẻ, nhưng sai lầm về thiết kế kiến trúc thì vô cùng đắt giá. Hãy dùng AI để tư duy trước khi dùng AI để gõ phím.
- **Quyền năng của sự lựa chọn:** Kỹ thuật yêu cầu đa phương án (Multiple Options) và So sánh giúp bạn có cái nhìn bao quát từ trên cao (Bird's-eye view), không bị đóng khung bởi số lượng thư viện ít ỏi mà bản thân đang biết.
- **Quản trị rủi ro bằng What-if:** Phân tích giả định là "vũ khí tối thượng" của các kỹ sư cấp cao. Bằng cách ném các kịch bản tồi tệ nhất cho AI giải quyết trước, bạn đang rèn luyện dự án của mình đạt mức độ ổn định cao nhất trước khi nó thực sự được phát hành ra thị trường (Production).

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A conceptual image of a developer sitting back in a chair, contemplating a glowing digital chessboard. The AI acts as an advisor, projecting multiple potential moves (A, B, C) and showing the future consequences of each move in small holographic windows. Professional, strategic, corporate tech tone.

---

## 7. Câu hỏi đánh giá

**Câu 1:** Nêu khái niệm và tác dụng cốt lõi của kỹ thuật "Phân tích giả định" (What-if Scenario) khi giao tiếp với AI trong thiết kế và phát triển phần mềm.

*Gợi ý đáp án:* 
- **Khái niệm:** Là kỹ thuật đưa vào Prompt các tình huống hoạt động khắc nghiệt, lỗi hệ thống, hoặc rủi ro tiềm ẩn (ví dụ: máy chủ trung gian mất kết nối, lưu lượng người dùng tăng đột biến 1000 lần) để yêu cầu AI đánh giá khả năng chống chịu của giải pháp hiện hành.
- **Tác dụng:** Giúp dự báo rủi ro (Risk Management), vạch trần các lỗ hổng thiết kế từ trong trứng nước, từ đó cho phép kỹ sư xây dựng các cơ chế dự phòng (Fallback) hoặc hệ thống chịu lỗi (Fault-tolerance) an toàn hơn trước khi viết mã.

**Câu 2:** Một đồng nghiệp có yêu cầu thiết kế hệ thống Caching. Anh ta gõ Prompt: *"Hãy cung cấp đoạn mã cấu hình Redis Cache cho dự án Spring Boot."* Dựa trên tư duy phân tích nhiều lựa chọn, Prompt này có điểm yếu chí mạng gì? Hãy viết lại Prompt đó tốt hơn.

*Gợi ý đáp án:*
- **Điểm yếu:** Prompt mang tính "đóng đinh giải pháp" (Zero-shot solution). Người dùng đã tự ý quyết định dùng công nghệ Redis mà bỏ qua việc tham khảo AI xem Redis có thực sự phù hợp với đặc thù dự án không. Điều này dễ dẫn đến tư duy lối mòn và tốn kém tài nguyên không đáng có (Over-engineering) nếu dự án chỉ ở quy mô rất nhỏ.
- **Cách viết lại:** *"Dự án Spring Boot của tôi cần hệ thống Caching để tăng tốc độ truy vấn danh sách sản phẩm. Hãy đề xuất ít nhất 3 giải pháp Caching (Ví dụ: In-memory Cache mặc định, Redis, Memcached). Lập bảng so sánh ưu/nhược điểm và tư vấn giải pháp nào là phù hợp nhất nếu dự án của tôi chỉ chạy trên một máy chủ duy nhất (Single node)."*

**Câu 3 (Thực chiến):** Bạn đang đảm nhận vai trò Tech Lead để thiết kế tính năng "Đăng nhập". Đội ngũ đang phân vân giữa việc sử dụng chuẩn `JWT (JSON Web Token)` hay `Session-based Authentication` truyền thống. Hãy sử dụng cấu trúc 5 thành phần kết hợp kỹ thuật So sánh và Phân tích giả định để thiết kế một đoạn Prompt hoàn chỉnh nhờ AI tư vấn phân tích quyết định kiến trúc này.

*Gợi ý đáp án (Tham khảo đoạn Prompt mẫu sau):*
- **Vai trò:** Hãy đóng vai là Chuyên gia bảo mật hệ thống cấp cao (Security Architect).
- **Mục tiêu:** Tư vấn và so sánh giữa hai cơ chế xác thực: `JWT` và `Session-based Authentication` cho dự án mới.
- **Ngữ cảnh:** Dự án hiện viết bằng Java Spring Boot. Trong tương lai sẽ mở rộng ra hệ thống Microservices với nhiều máy chủ con, và có cả ứng dụng di động (Mobile App) kết nối vào.
- **Ràng buộc:** Trình bày số liệu phân tích khách quan. Cần đặc biệt tập trung vào khả năng mở rộng hệ thống (Scalability) và các rủi ro bảo mật (Security Risks).
- **Định dạng (So sánh & Giả định What-if):**
  1. (So sánh): Lập bảng phân tích ưu và nhược điểm cốt lõi của 2 công nghệ trên dựa theo bối cảnh dự án hiện tại. Đề xuất công nghệ nên chọn.
  2. (Giả định What-if): Giả sử dự án quyết định chọn `JWT`. Chuyện gì sẽ xảy ra nếu một tài khoản bị lộ chuỗi Token khi Token đó chưa hết hạn? Hãy đề xuất chiến lược xử lý (Ví dụ: Cơ chế Blacklist) để giảm thiểu thiệt hại, kèm mã giả (Pseudo-code) minh họa luồng xử lý bằng Java.
