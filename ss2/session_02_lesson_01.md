# Session 02: Lợi ích, hạn chế và trách nhiệm khi sử dụng AI

## Lesson 01: Xu hướng ứng dụng AI trong phát triển phần mềm

### 1. Mục tiêu học tập

Sau bài học này, bạn có thể:

* Hiểu được các xu hướng chính trong việc ứng dụng AI vào quy trình phát triển phần mềm hiện nay.
* Phân tích được sự dịch chuyển vai trò của lập trình viên truyền thống sang kỹ sư phát triển có sự hỗ trợ của AI.
* Thực hiện việc nhận diện các công đoạn phát triển phần mềm có thể tối ưu bằng công cụ AI.
* Áp dụng được tư duy cơ bản vào việc lên kế hoạch xử lý một bài toán công nghệ thông qua sự hỗ trợ của AI.

---

### 2. Đặt vấn đề thực tế

Bạn là thành viên trong một nhóm dự án phát triển phần mềm khởi nghiệp. Dự án đang đối mặt với nguy cơ chậm tiến độ 3 tuần do đội ngũ kỹ sư phải xử lý quá nhiều công việc thủ công lặp đi lặp lại: viết tài liệu API, tìm lỗi cú pháp trong mã nguồn, cấu hình môi trường triển khai, và cập nhật tài liệu kỹ thuật.

Giám đốc dự án nhận thấy nếu tiếp tục duy trì cách làm việc truyền thống, chi phí sẽ vượt ngân sách và sản phẩm không thể ra mắt đúng hạn. Yêu cầu cấp bách được đặt ra là phải tìm cách áp dụng các công cụ công nghệ mới để tự động hóa những công việc tốn thời gian, giải phóng nguồn lực để kỹ sư có thể tập trung vào thiết kế kiến trúc hệ thống và giải quyết logic nghiệp vụ cốt lõi.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A split screen illustration. On the left side, stressed and exhausted software developers surrounded by stacks of paper and messy code on their monitors. On the right side, a futuristic, calm, and organized workspace with glowing AI assistants streamlining the coding process. Modern corporate aesthetic, vibrant colors, 8k resolution.

---

### 3. Kiến thức cốt lõi

Sự phát triển của AI đang định hình lại toàn bộ Vòng đời phát triển phần mềm (SDLC - Software Development Life Cycle). Có ba xu hướng ứng dụng chính:

#### A. Tự động hóa sinh mã và hỗ trợ lập trình (Code Generation & Assistance)
* **Định nghĩa:** Sử dụng các trợ lý AI để tạo ra đoạn mã nguồn dựa trên mô tả bằng ngôn ngữ tự nhiên hoặc ngữ cảnh dự án.
* **Vai trò:** Giảm đáng kể thời gian viết mã cơ bản (boilerplate), hỗ trợ hoàn thiện cú pháp nhanh chóng.
* **Khi nào sử dụng:** Khi cần tạo nhanh cấu trúc dự án mới, viết các hàm phổ biến, tạo dữ liệu mẫu, hoặc chuyển đổi mã từ ngôn ngữ này sang ngôn ngữ khác.
* **Ví dụ nghiệp vụ:** Yêu cầu AI sinh ra một hàm kiểm tra tính hợp lệ của địa chỉ email và số điện thoại người dùng bằng biểu thức chính quy (Regex).

#### B. Kiểm thử và gỡ lỗi thông minh (Intelligent Testing & Debugging)
* **Định nghĩa:** AI tự động quét mã nguồn để phát hiện lỗi, đề xuất cách sửa chữa và tự động sinh các kịch bản kiểm thử.
* **Vai trò:** Nâng cao chất lượng phần mềm, giảm thiểu sai sót do con người, phát hiện rủi ro bảo mật từ sớm.
* **Khi nào sử dụng:** Khi đánh giá mã nguồn (Code Review), tìm nguyên nhân gốc rễ gây sập hệ thống, hoặc bổ sung bao phủ kiểm thử (Test Coverage).
* **Ví dụ nghiệp vụ:** AI phân tích một tệp tin nhật ký lỗi (log) trên máy chủ, nhận diện chính xác dòng mã gây ra sự cố kẹt bộ nhớ (Memory Leak) và đề xuất mã sửa lỗi.

#### C. Sự dịch chuyển vai trò của lập trình viên
* **Định nghĩa:** Thay đổi trọng tâm công việc từ người chỉ "viết mã" sang người "thiết kế giải pháp và kiểm duyệt".
* **Vai trò:** Nâng tầm giá trị của kỹ sư phần mềm, tập trung vào tư duy logic thay vì cú pháp lập trình.
* **Khi nào sử dụng:** Xuyên suốt mọi giai đoạn của dự án.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A conceptual illustration showing the evolution of a software engineer. A traditional programmer intensely typing on a keyboard transforming into a modern AI-assisted software architect who is orchestrating glowing digital nodes and AI interfaces with a confident posture. Cyberpunk mixed with corporate clean tech style, highly detailed.

* **Bảng so sánh vai trò:**

| Tiêu chí | Lập trình viên truyền thống | Lập trình viên hỗ trợ bởi AI (AI-Assisted Developer) |
| --- | --- | --- |
| **Công việc chính** | Gõ từng dòng lệnh, tìm kiếm trên mạng cách giải quyết cú pháp. | Chỉ đạo AI sinh mã, đọc hiểu và kiểm duyệt mã nguồn do AI tạo ra. |
| **Kỹ năng cốt lõi** | Nhớ cú pháp ngôn ngữ lập trình, tập trung vào chi tiết triển khai. | Tư duy hệ thống, phân tích nghiệp vụ, kỹ năng đặt câu lệnh (Prompt Engineering). |
| **Tốc độ xử lý** | Mất nhiều thời gian cho các đoạn mã cấu hình và lặp lại. | Hoàn thành nhanh chóng các phần mã lặp lại, có nhiều thời gian cho tính năng khó. |

---

### 4. Phân tích tình huống thực tế

#### Bối cảnh
TechSolutions là một công ty gia công phần mềm quy mô vừa. Đội ngũ gồm 20 lập trình viên đang đảm nhận dự án xây dựng hệ thống quản lý nhân sự cho đối tác.

#### Thách thức
Trong giai đoạn kiểm thử nội bộ trước khi bàn giao, đội ngũ bị quá tải hoàn toàn. Việc viết Unit Test (Kiểm thử đơn vị) cho hàng ngàn hàm đang tiêu tốn tới 30% tổng thời lượng dự án, nhưng vẫn dễ bị bỏ sót các trường hợp kiểm thử đặc biệt (edge cases), dẫn đến phát sinh lỗi khi tích hợp.

#### Cách tiếp cận
Giám đốc kỹ thuật quyết định đưa các Trợ lý Lập trình (Code Assistant) vào quy trình. Thay vì viết tay, kỹ sư chỉ cần chọn hàm logic nghiệp vụ cần kiểm thử và sử dụng công cụ AI kèm câu lệnh: "Generate unit tests for this function covering all edge cases". AI lập tức sinh ra bộ kịch bản kiểm thử đa dạng, bao gồm cả các đầu vào không hợp lệ.

#### Kết quả
Thời gian dành cho việc viết Unit Test của dự án giảm 70%. Tỷ lệ bao phủ kiểm thử tăng lên, số lượng lỗi nội bộ được phát hiện sớm tăng cao, giúp chất lượng phiên bản phần mềm bàn giao được khách hàng đánh giá xuất sắc.

---

### 5. Demo minh họa

**Mục tiêu demo:** Phân tích sự dịch chuyển quy trình làm việc từ truyền thống sang quy trình có AI hỗ trợ.

**Minh họa quy trình:**

```text
Sơ đồ minh họa: Quy trình phát triển phần mềm

1. Quy trình truyền thống (Tốn thời gian, tuần tự):
[Nhận yêu cầu] ---> [Tự tìm kiếm tài liệu] ---> [Gõ mã thủ công] ---> [Tự chạy và dò lỗi] ---> [Viết tài liệu hệ thống]

2. Quy trình hỗ trợ bởi AI (Tốc độ cao, tương tác):
[Nhận yêu cầu] ---> [Prompt giao việc cho AI] ---> [Kiểm duyệt & Tinh chỉnh mã] ---> [AI tự quét lỗi & Đề xuất sửa] ---> [AI tự động tổng hợp tài liệu]
```

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A modern corporate software development workflow diagram. On the left side, a human software engineer sitting at a desk with dual monitors, analyzing a problem. On the right side, a glowing holographic AI assistant processing data. Luminous blue arrows flow continuously back and forth between the engineer and the AI, representing rapid collaboration, code generation, and automated testing. The aesthetic should be clean, isometric, highly detailed, neon blue and white tones, corporate tech environment.

**Mô phỏng luồng làm việc:**
1. **Phân tích yêu cầu:** Kỹ sư nhận nhiệm vụ tạo tính năng "Đăng nhập bằng tài khoản Google".
2. **Giao việc cho AI:** Thay vì mất hàng giờ đọc tài liệu API gốc của Google, kỹ sư soạn Prompt: "Viết khung chức năng xử lý quy trình đăng nhập Google OAuth 2.0 cho dự án Java Spring Boot, yêu cầu có xử lý bắt lỗi mất mạng và token hết hạn".
3. **Kiểm duyệt và tinh chỉnh:** Trợ lý AI trả về cấu trúc mã nguồn cơ bản trong vài giây. Kỹ sư tiến hành đọc hiểu, đánh giá mức độ bảo mật và thay đổi tên biến để đồng bộ với cấu trúc cơ sở dữ liệu hiện tại của công ty.
4. **Tự động hóa tài liệu:** Sau khi mã hoạt động tốt, kỹ sư yêu cầu AI: "Hãy thêm chú thích chi tiết bằng tiếng Việt cho đoạn mã trên và viết hướng dẫn cấu hình môi trường vào tệp README.md".

---

### 6. Tổng kết

* AI trong phát triển phần mềm đang chuyển từ một "thử nghiệm công nghệ" sang "tiêu chuẩn bắt buộc" trong quy trình nghiệp vụ.
* Ba xu hướng cốt lõi: Sinh mã tự động, Kiểm thử thông minh, và Dịch chuyển vai trò kỹ sư.
* Kỹ năng quan trọng nhất của lập trình viên hiện đại không chỉ là việc thuộc cú pháp, mà là khả năng "chỉ đạo" AI giải quyết vấn đề và năng lực kiểm duyệt chất lượng kết quả.
* **Sai lầm thường gặp:** Quá tin tưởng và sao chép trực tiếp mã do AI sinh ra mà không kiểm duyệt kỹ lưỡng, dễ dẫn đến các lỗ hổng bảo mật ẩn hoặc phá vỡ cấu trúc toàn hệ thống.

---

### 7. Câu hỏi đánh giá

## Câu 1 (Đánh giá khả năng ghi nhớ)
**Câu hỏi:** Hãy nêu 3 xu hướng chính trong việc ứng dụng AI vào quy trình phát triển phần mềm hiện nay. Với mỗi xu hướng, hãy đưa ra một ví dụ minh họa tương ứng.

**Câu trả lời tham khảo:**
Ba xu hướng ứng dụng chính của AI trong phát triển phần mềm hiện nay bao gồm:
1. **Tự động hóa sinh mã và hỗ trợ lập trình (Code Generation & Assistance):** Lập trình viên sử dụng AI để tự động tạo ra các đoạn mã dựa trên mô tả bằng ngôn ngữ tự nhiên. 
   - *Ví dụ minh họa:* Thay vì tự tra cứu cú pháp, lập trình viên có thể yêu cầu AI viết nhanh một hàm kiểm tra tính hợp lệ của định dạng email bằng Regex.
2. **Kiểm thử và gỡ lỗi thông minh (Intelligent Testing & Debugging):** AI được sử dụng để tự động quét mã nguồn, phát hiện các lỗi logic, lỗ hổng bảo mật và tự động sinh ra các kịch bản kiểm thử (Test cases). 
   - *Ví dụ minh họa:* AI tự động phân tích file log hệ thống và chỉ ra chính xác dòng mã đang gây ra sự cố tràn bộ nhớ (Memory Leak), đồng thời đề xuất cách sửa lỗi.
3. **Sự dịch chuyển vai trò của lập trình viên:** AI giúp tự động hóa khâu viết mã cơ bản, đẩy trọng tâm công việc của lập trình viên sang việc thiết kế giải pháp tổng thể và kiểm duyệt mã do AI tạo ra. 
   - *Ví dụ minh họa:* Thay vì tự tay gõ từng dòng lệnh cho tính năng xác thực người dùng, lập trình viên yêu cầu AI sinh mã, sau đó tập trung thời gian vào việc rà soát các lỗ hổng bảo mật của đoạn mã đó.

## Câu 2 (Đánh giá khả năng đọc hiểu & phân tích)
**Câu hỏi:** Theo bạn, sự xuất hiện của các trợ lý AI có làm lập trình viên mất việc hay không? Tại sao vai trò của kỹ năng "kiểm duyệt" (Review) lại trở nên quan trọng hơn kỹ năng "viết mã" (Coding) trong thời đại công nghệ AI?

**Câu trả lời tham khảo:**
Sự xuất hiện của trợ lý AI **không** làm lập trình viên mất việc, mà thực chất nó sẽ thay thế những lập trình viên không biết tận dụng công cụ AI. Vai trò của con người không bị loại bỏ mà được dịch chuyển lên một mức độ cao hơn (từ thợ gõ code sang người thiết kế hệ thống).

Kỹ năng "kiểm duyệt" (Review) trở nên quan trọng hơn kỹ năng "viết mã" vì:
* AI có khả năng sinh mã với tốc độ cực nhanh, nhưng nó không hoàn toàn thấu hiểu ngữ cảnh nghiệp vụ đặc thù của doanh nghiệp. Nó có thể sinh ra các đoạn mã trông có vẻ chạy được nhưng lại chứa lỗi logic ngầm hoặc vi phạm các chuẩn mực bảo mật.
* Do đó, con người cần lùi lại một bước, đóng vai trò là "kiến trúc sư" và "người gác cổng". Việc gõ code lặp đi lặp lại đã có AI thực hiện, giá trị cốt lõi của lập trình viên giờ đây nằm ở tư duy phản biện, khả năng thẩm định, đánh giá rủi ro và đảm bảo rằng sản phẩm cuối cùng do AI hỗ trợ tạo ra là an toàn, đúng logic và có thể bảo trì lâu dài.

## Câu 3 (Tình huống thực chiến)
**Câu hỏi:** Bạn được giao nhiệm vụ xây dựng một module kết nối với cổng thanh toán điện tử mới cho dự án. Bạn chưa từng làm việc với API của cổng thanh toán này trước đây. Hãy trình bày các bước bạn sẽ thực hiện để hoàn thành nhiệm vụ này theo tư duy "AI-first", đồng thời chỉ ra rủi ro lớn nhất bạn bắt buộc phải tránh trong quá trình này.

**Câu trả lời tham khảo:**
Theo tư duy "AI-first", tôi sẽ thực hiện nhiệm vụ xây dựng module thanh toán qua các bước sau:
1. **Nghiên cứu với AI:** Tôi sẽ cung cấp tài liệu API của cổng thanh toán cho công cụ AI, yêu cầu nó tóm tắt lại các luồng gọi API cơ bản và phân tích phương thức xác thực (Authentication).
2. **Sinh mã nền tảng (Boilerplate):** Đưa ra Prompt yêu cầu AI sinh bộ khung mã nguồn cho các tác vụ chính như tạo yêu cầu thanh toán (Create Order) và xử lý kết quả trả về (Webhook).
3. **Kiểm duyệt & Tinh chỉnh (Quan trọng nhất):** Đọc hiểu kỹ đoạn mã do AI tạo ra. Tôi sẽ tự điều chỉnh tên biến, cập nhật cấu trúc cho đồng bộ với dự án hiện tại, và tự tay thiết lập các biến môi trường cấu hình mật khẩu/API Key để đảm bảo tính an toàn.
4. **Tự động kiểm thử:** Yêu cầu AI sinh các kịch bản Unit Test để tự động kiểm tra độ tin cậy của luồng tiền trong các trường hợp thành công, lỗi mạng, hoặc sai chữ ký.

**Rủi ro lớn nhất bắt buộc phải tránh:**
Rủi ro lớn nhất là việc quá tin tưởng và sao chép nguyên si đoạn mã giao dịch do AI sinh ra mà không kiểm tra kỹ lưỡng. Điều này có thể dẫn đến việc vô tình làm lộ API Key (nếu AI hardcode vào mã), tạo ra lỗ hổng rò rỉ dữ liệu thẻ của khách hàng, hoặc gây ra sai lệch về tiền bạc do mã chưa xử lý đúng các trường hợp đặc thù của hệ thống doanh nghiệp.
