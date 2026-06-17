# Session 05 - Lesson 01: Kỹ thuật Prompt suy luận theo các bước (Chain-of-thought Prompting)

## 1. Mục tiêu học tập
Sau khi hoàn thành Lesson này, người học có thể:
- Nắm vững khái niệm "Chain-of-thought Prompting" (CoT) - một trong những kỹ thuật Prompt nâng cao mạnh mẽ nhất của trí tuệ nhân tạo.
- Phân tích được sự khác biệt về chất lượng đầu ra giữa cách ra lệnh "ăn liền" (Zero-shot) và cách ra lệnh "suy luận từng bước" (CoT).
- Thực hiện thiết kế các câu lệnh CoT để giải quyết các bài toán logic phức tạp, tối ưu hóa thuật toán hoặc thiết kế kiến trúc hệ thống trong dự án Java.
- Áp dụng tư duy bẻ gãy vấn đề (Decomposition) khi làm việc với AI để giảm thiểu tối đa hiện tượng Ảo giác (Hallucination) ở các bài toán hóc búa.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric infographic showing a comparison between two paths. Path A is a single, steep, foggy jump labeled "Zero-shot" leading to a messy result. Path B is a clear, glowing, step-by-step staircase labeled "Chain-of-Thought", where each step lights up sequentially, leading to a perfectly constructed geometric block. Corporate tech style, clean vectors, neon blue and orange.

---

## 2. Đặt vấn đề thực tế

Trong một dự án thương mại điện tử, nhóm phát triển Java nhận được yêu cầu viết một thuật toán tính phí giao hàng mới. Phí giao hàng không cố định mà phụ thuộc vào rất nhiều biến số nghiệp vụ: Khối lượng đơn hàng, Khoảng cách địa lý, Hạng thành viên (Gold, Silver, Bronze), và Mã giảm giá đang áp dụng.

Một lập trình viên thiếu kinh nghiệm lập tức viết một Prompt gửi cho AI: *"Dưới đây là công thức tính phí giao hàng. Hãy viết cho tôi một hàm Java hoàn chỉnh để trả ra số tiền cuối cùng khách phải trả."*

Kết quả, AI trả về một hàm `calculateShippingFee` cực kỳ phức tạp. Nhìn bề ngoài có vẻ đúng, nhưng khi chạy kiểm thử tự động (Unit Test), số tiền tính ra cho nhóm khách hàng hạng Gold luôn bị sai lệch vài nghìn đồng. Do AI bị ép phải "nhảy vọt" thẳng đến dòng kết quả cuối cùng từ một mớ dữ kiện khổng lồ (Zero-shot), nó đã âm thầm bỏ sót bước kiểm tra thứ tự ưu tiên của mã giảm giá (áp dụng mã giảm giá trước hay sau khi trừ chiết khấu hạng thành viên). 

Làm thế nào để buộc AI không được "đoán mò" và phải tư duy chậm lại, giải quyết từng phần của bài toán một cách minh bạch? Đó là lúc bạn cần đến sức mạnh của **Chain-of-thought Prompting (Kỹ thuật suy luận theo các bước)**.

---

## 3. Kiến thức cốt lõi

### 3.1. Chain-of-thought (CoT) là gì?
- **Định nghĩa:** CoT là kỹ thuật ép buộc mô hình ngôn ngữ lớn (LLM) phải trình bày rõ quá trình suy luận nội bộ (các bước phân tích logic trung gian) ra văn bản trước khi đưa ra câu trả lời hay sinh ra mã nguồn cuối cùng.
- **Vai trò:** Bằng cách chia bài toán lớn thành các bước nhỏ, AI có thể phân bổ "sự tập trung" (attention mechanism) vào từng phần tử dữ liệu, giảm thiểu đáng kể lỗi tính toán, lỗi logic hoặc việc bỏ sót các điều kiện biên.
- **Khi nào sử dụng:** Khi bài toán yêu cầu thuật toán phức tạp, phân tích cấu trúc dữ liệu nhiều chiều, xử lý chuỗi logic kế toán, hoặc thiết kế kiến trúc hệ thống (System Design).

### 3.2. So sánh Zero-shot và Chain-of-thought
- **Zero-shot (Hỏi đáp nhanh liền mạch):** *"Viết hàm tính lương cho nhân viên có thâm niên 3 năm theo công thức X."* -> AI nhả ra code ngay lập tức (dễ sai logic ẩn).
- **Chain-of-thought (Suy luận từng bước):** *"Viết hàm tính lương. Đừng code vội, hãy suy luận theo các bước sau: (1) Tính lương cơ bản, (2) Tính hệ số thâm niên, (3) Tính thưởng, (4) Trừ thuế thu nhập cá nhân. Sau khi phân tích xong, cuối cùng mới xuất ra đoạn mã Java hoàn chỉnh."* -> AI giải quyết dứt điểm từng mảnh ghép nhỏ trên màn hình, đảm bảo tính chính xác tuyệt đối.

### 3.3. Câu "Thần chú" (Magic Phrase) trong CoT
Nếu bạn không có thời gian tự mình liệt kê các bước, bạn có thể kích hoạt tính năng CoT của AI bằng một cụm từ kinh điển (đã được chứng minh qua nhiều tài liệu nghiên cứu học thuật của Stanford, Google):
> *"Hãy suy nghĩ từng bước một" (Let's think step by step)*

Tuy nhiên, trong môi trường phát triển phần mềm chuyên nghiệp, để đạt hiệu quả cao nhất và quản trị rủi ro tốt nhất, bạn nên chủ động thiết kế (Decompose) các bước suy luận cho AI thay vì phó mặc lộ trình hoàn toàn cho nó.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A visual metaphor showing a complex tangled knot representing a business problem. An AI glowing robotic hand uses tweezers to carefully untangle one colored thread at a time, organizing them into straight, logical lines labeled Step 1, Step 2, and Step 3. Modern software lab environment, deep blue and cyan lighting.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Một hệ thống phân phối quảng cáo cần xây dựng thuật toán phân bổ chiến dịch (Campaign Allocation). Mỗi chiến dịch có ngân sách tối đa, độ tuổi khách hàng mục tiêu, và khung giờ ưu tiên. 

### Thách thức
Thuật toán bằng Java cần phải lọc ra danh sách các chiến dịch hợp lệ cho một người dùng vừa truy cập vào website, sau đó sắp xếp theo thứ tự doanh thu kỳ vọng giảm dần. Nếu dùng lệnh Prompt thông thường (Zero-shot), AI thường sinh ra đoạn mã vòng lặp (For-loop) xử lý dữ liệu rất chậm, đôi khi lọc sót điều kiện độ tuổi do bị quá tải dữ kiện.

### Cách tiếp cận bằng Chain-of-thought
Kỹ sư hệ thống thiết kế một Prompt CoT buộc AI phải tư duy tuần tự trước khi chạm tay vào việc viết mã nguồn:
*"Hãy xây dựng luồng thuật toán phân bổ chiến dịch quảng cáo. Đừng viết code ngay. Hãy suy luận và phân tích logic nghiệp vụ theo 3 bước sau:*
*Bước 1: Liệt kê các điều kiện lọc (Filter) cần thiết để loại bỏ chiến dịch không hợp lệ.*
*Bước 2: Phân tích cơ chế sắp xếp (Sort) để đưa chiến dịch có doanh thu cao nhất lên ưu tiên đầu.*
*Bước 3: Dựa trên phân tích ở Bước 1 và 2, viết một hàm Java 17 sử dụng Stream API để thực thi luồng này chuẩn xác nhất."*

### Kết quả
AI phản hồi bằng văn bản phân tích rất rõ ràng trước mặt lập trình viên. Nó nhận ra rằng bắt buộc phải lọc `budget > 0` và `ageMatch == true` trước khi thực hiện hàm `sorted()` để giảm thiểu bộ nhớ. Sau khi ghi ra màn hình quá trình suy luận xong, AI mới sinh ra khối mã Java Stream API hoàn hảo, không có một hàm dư thừa, và quan trọng nhất là logic toán học khớp 100% với yêu cầu kinh doanh khắt khe.

---

## 5. Demo minh họa

**Mục tiêu demo:** Sử dụng Chain-of-thought kết hợp bộ khung 5 thành phần để phân tích và tái cấu trúc (Refactor) một khối lệnh điều kiện phức tạp (Nested If-Else) trong môi trường dự án thực tế.

**Điều kiện chuẩn bị:** Một trình duyệt mở ChatGPT, Claude hoặc sử dụng trực tiếp Code Assistant (như Antigravity) trong IDE.

**Luồng Prompt thực tế (Demo Script):**

1. **Chuẩn bị đoạn mã xấu (Spaghetti Code):**
   Bạn có một hàm Java cũ chứa 4 lớp điều kiện `if-else` lồng nhau sâu hoắm. Hàm này kiểm tra điều kiện cấp thẻ tín dụng cho khách hàng (Kiểm tra dư nợ -> Lịch sử nợ xấu -> Điểm tín dụng -> Lương hàng tháng).

2. **Áp dụng Prompt CoT kết hợp 5 thành phần (Role - Goal - Context - Constraint - Format):**
```text
[Vai trò] Hãy đóng vai trò Kỹ sư phần mềm cao cấp (Senior Java Developer).
[Mục tiêu] Tái cấu trúc (Refactor) đoạn mã cấp tín dụng (bên dưới) để loại bỏ hoàn toàn cấu trúc if-else lồng nhau phức tạp (Nested If-Else).
[Ngữ cảnh] Hệ thống Core Banking này yêu cầu mã nguồn phải cực kỳ dễ đọc (Clean Code) để phục vụ quá trình bảo trì của các kỹ sư thế hệ sau. 
[Ràng buộc] Bắt buộc sử dụng kỹ thuật "Return Early" (Thoát sớm) hoặc "Guard Clauses" (Mệnh đề bảo vệ).
[Định dạng và Quy trình CoT] 
Hãy làm việc tư duy theo từng bước sau trước khi xuất ra mã nguồn:
1. Phân tích các luồng logic hiện tại của đoạn mã.
2. Liệt kê các điều kiện vi phạm có thể làm khách hàng bị từ chối tín dụng ngay lập tức (Các điều kiện Guard).
3. Đề xuất luồng mới theo chuẩn Clean Code.
4. Cuối cùng, sinh ra hàm Java hoàn chỉnh đã tối ưu.
```

**Kết quả mong đợi:**
Thay vì cắm đầu viết code và trả về một mớ hỗn độn mới, AI sẽ thực hiện đúng mệnh lệnh. Nó in ra mục 1, 2, 3 bằng văn bản phân tích luồng. Qua quá trình này, AI tự làm "sáng tỏ" các điều kiện logic đang bị giấu kín trong các lớp `if-else`. Nhờ đó, đoạn mã xuất ra ở bước số 4 sẽ chính xác một cách đáng kinh ngạc, thẳng tắp, an toàn và loại bỏ hoàn toàn hiện tượng Ảo giác (Hallucination) mà các lệnh Prompt Zero-shot thường mắc phải.

---

## 6. Tổng kết

- **Bản chất của CoT:** Chain-of-thought chính là cách chúng ta buộc hệ thống AI phải đi chậm lại, bóc tách dữ kiện ra màn hình trước khi ra quyết định cuối cùng. Giống hệt như cách giáo viên dạy toán yêu cầu học sinh phải viết lời giải chi tiết trước khi ghi đáp số.
- **Sức mạnh giảm thiểu ảo giác:** Khi bài toán quá phức tạp, việc ép AI xuất mã nguồn ngay lập tức (Zero-shot) sẽ đẩy AI vào trạng thái đoán mò, làm tăng tỷ lệ sinh mã rác (Garbage). Suy luận từng bước giúp AI phân phối năng lực tính toán lên từng chặng logic nhỏ.
- **Thực tiễn áp dụng:** Trong công việc hàng ngày của kỹ sư phần mềm, một Prompt xuất sắc không bao giờ là một mệnh lệnh một dòng trống rỗng. Hãy rèn luyện thói quen chia nhỏ vấn đề (Decompose) và tạo ra các "cột mốc" suy luận để dẫn dắt trí thông minh của AI.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An abstract visualization of an AI neural network prioritizing tasks. On the left side, a disorganized burst of energy creating chaotic, buggy code. On the right side, a calm, sequential flow of glowing nodes connecting one by one, culminating in a pristine snippet of secure Java code. The concept perfectly captures the phrase "Let's think step by step". High quality, professional software industry focus.

---

## 7. Câu hỏi đánh giá

**Câu 1:** Hãy định nghĩa khái niệm kỹ thuật Chain-of-thought (CoT) Prompting và so sánh sự khác biệt cơ bản về chất lượng đầu ra giữa phương pháp CoT và phương pháp Zero-shot khi giải quyết một bài toán lập trình phức tạp.

*Gợi ý đáp án:* 
- **Định nghĩa:** CoT là kỹ thuật yêu cầu mô hình AI phải trình bày rõ ràng toàn bộ quá trình bóc tách, suy luận logic theo từng bước trung gian (bằng văn bản/lời giải) trước khi đưa ra câu trả lời hay đoạn mã cuối cùng.
- **So sánh:** Ở kỹ thuật Zero-shot (ra lệnh ăn liền), AI bị buộc phải tính toán nhảy vọt từ đầu vào đến kết quả cuối, rất dễ dẫn đến ảo giác (Hallucination) hoặc mất mát dữ kiện đối với bài toán logic nhiều lớp. Trái lại, phương pháp CoT chia nhỏ độ phức tạp, giúp AI duy trì tính mạch lạc, xử lý dứt điểm từng nhánh logic và cho ra kết quả cuối cùng với độ chuẩn xác gần như tuyệt đối.

**Câu 2:** Một đồng nghiệp nhờ AI viết một hàm Java xác thực giỏ hàng trực tuyến (Kiểm tra tồn kho -> Kiểm tra mã giảm giá -> Tính tiền). Người này viết lệnh: *"Viết hàm Java xác thực giỏ hàng theo 3 bước trên"*. Mặc dù đã chia bước, đoạn mã AI sinh ra vẫn bị lỗi logic thứ tự thực thi. Dựa trên tư duy thiết kế CoT chuyên nghiệp, hãy phân tích đoạn Prompt này đang thiếu yếu tố cốt lõi nào và đề xuất cách viết lại.

*Gợi ý đáp án:*
- **Phân tích sai lầm:** Đoạn Prompt trên dù có sử dụng từ khóa "3 bước" nhưng bản chất nó vẫn là ra lệnh sinh mã ngay lập tức (Zero-shot) vì nó không yêu cầu AI *phải phân tích và viết suy luận bằng văn bản* ra màn hình trước. Khi đi thẳng vào việc viết code, AI rất dễ bị nhầm lẫn luồng dữ liệu (State) giữa các dòng lệnh phức tạp.
- **Đề xuất khắc phục:** Cần ép AI tư duy ra văn bản trước theo đúng bản chất của kỹ thuật CoT. 
*Ví dụ Prompt khắc phục:* "Hãy giải quyết việc xác thực giỏ hàng theo các bước sau. **Đừng viết code ngay.** (Bước 1): Phân tích logic kiểm tra hàng tồn kho từ Cơ sở dữ liệu. (Bước 2): Phân tích logic áp dụng mã giảm giá làm thay đổi tổng tiền. (Bước 3): Đánh giá các ngoại lệ khi trừ tiền. (Bước 4): Dựa trên các phân tích trên, cuối cùng hãy xuất ra một hàm Java an toàn và tối ưu nhất."

**Câu 3 (Thực chiến):** Bạn đang được Tech Lead giao nhiệm vụ viết chức năng "Tính thuế thu nhập cá nhân (TNCN) theo biểu thuế lũy tiến từng phần". Hàm kế toán này rất nhạy cảm và cực kỳ dễ bị lỗi nếu ranh giới các bậc thuế sai lệch. Hãy vận dụng cấu trúc 5 thành phần kết hợp với tư duy "Chain-of-thought" (CoT) để thiết kế một đoạn Prompt hoàn chỉnh nhờ AI viết hàm này bằng ngôn ngữ Java một cách chính xác nhất.

*Gợi ý đáp án (Tham khảo đoạn Prompt mẫu sau):*
- **Vai trò:** Hãy đóng vai là một Kỹ sư phần mềm Java có chuyên môn sâu về nghiệp vụ Kế toán/Tài chính.
- **Mục tiêu:** Viết hàm Java tính thuế thu nhập cá nhân (TNCN) lũy tiến dựa trên mức lương cơ bản đầu vào.
- **Ngữ cảnh:** Hệ thống quản lý nhân sự Core HR đang chạy trên Java 17. Các bậc thuế lũy tiến giả định bao gồm: 5% cho 5 triệu đầu tiên, 10% cho 5 triệu tiếp theo, và 15% cho phần thu nhập còn lại. 
- **Ràng buộc:** Bắt buộc sử dụng đối tượng `BigDecimal` thay vì `Double` để đảm bảo độ chính xác tuyệt đối của tiền tệ. Code phải có comment giải thích rõ ràng.
- **Định dạng (Sử dụng cấu trúc CoT):** 
Đừng viết code ngay lập tức. Hãy suy luận và giải quyết theo các bước sau, trình bày rõ suy luận của từng bước ra màn hình:
1. Xác định mức giảm trừ gia cảnh (Giả định mặc định là 11 triệu đồng).
2. Phân tích công thức tách phần thu nhập tính thuế rải đều theo từng bậc lũy tiến (5%, 10%, 15%).
3. Viết một ví dụ nháp tính tay (Dry-run) bằng văn bản với mức lương đầu vào là 25 triệu để kiểm chứng thuật toán.
4. Cuối cùng, dựa trên các bước trên, sinh ra hàm Java hoàn chỉnh thực thi thuật toán.
