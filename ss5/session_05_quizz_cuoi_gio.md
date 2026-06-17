# QUIZ CUỐI GIỜ - SESSION 05

## Q1

Khi áp dụng kỹ thuật "Chain-of-thought" (CoT) để nhờ AI thiết kế một thuật toán tính phí giao hàng phức tạp, câu lệnh nào sau đây được xem là vận dụng đúng chuẩn nhất?

[A]
Hãy viết cho tôi hàm tính phí giao hàng dựa trên các điều kiện tôi cung cấp.
[EXP]
Đây là câu lệnh Zero-shot, ép AI sinh mã ngay lập tức dẫn đến khả năng bỏ sót điều kiện.
[B]
Tính phí giao hàng. Đảm bảo mã nguồn ngắn gọn và không có lỗi biên dịch.
[EXP]
Mệnh lệnh vẫn là ra thẳng kết quả, thiếu sự điều hướng tư duy theo bước.
[C]
Hãy suy luận cách tính phí giao hàng. Đừng viết code vội. Hãy liệt kê 3 bước phân tích: Kiểm tra loại thành viên, Áp dụng mã giảm giá, sau đó mới tính tổng tiền. Khi phân tích xong, hãy sinh mã Java.
[EXP]
Việc chủ động tạo "cột mốc" tư duy (Decomposition) và ngăn AI viết code trước khi phân tích là cốt lõi của CoT chuyên nghiệp.
[D]
Hãy tính phí giao hàng bằng ngôn ngữ Java phiên bản 17.
[EXP]
Chỉ có yếu tố công nghệ (Java 17), không có yếu tố tư duy (Chain-of-thought).

@correct: C
@difficulty: 10
@category: 1

## Q2

Để lựa chọn giữa việc dùng `@Async` và `RabbitMQ` cho tính năng gửi email hàng loạt, Prompt nào dưới đây vận dụng đúng kỹ thuật "So sánh" (Comparison)?

[A]
Hãy viết mã cấu hình RabbitMQ để gửi email.
[EXP]
Đây là hành vi "đóng đinh giải pháp", không cho AI cơ hội tư vấn so sánh.
[B]
`@Async` và `RabbitMQ` khác nhau như thế nào?
[EXP]
Câu hỏi định nghĩa thuần túy, thiếu Ngữ cảnh dự án cụ thể.
[C]
Tôi cần gửi 1 triệu email mỗi ngày. Hãy lập bảng so sánh chi tiết giữa `@Async` và `RabbitMQ` về độ trễ, khả năng chịu tải và nguy cơ mất dữ liệu. Sau đó tư vấn giải pháp tốt nhất.
[EXP]
Prompt cung cấp Ngữ cảnh (1 triệu email), đưa ra yêu cầu lập bảng rõ ràng và giới hạn các tiêu chí kỹ thuật cần đánh giá.
[D]
Theo bạn thì công nghệ nào tốt hơn?
[EXP]
Câu hỏi quá mơ hồ, AI sẽ trả lời chung chung vì không có tiêu chí so sánh.

@correct: C
@difficulty: 10
@category: 1

## Q3

Kỹ sư B muốn kiểm tra rủi ro hệ thống bộ nhớ đệm (Cache) của mình bằng AI. Prompt nào sau đây thể hiện đúng tính chất của "Phân tích giả định" (What-if Scenario)?

[A]
Hệ thống Cache của tôi đang dùng Memcached.
[EXP]
Đây chỉ là câu khai báo thông tin, không chứa tình huống giả định rủi ro.
[B]
Làm sao để cài đặt Redis an toàn trên Linux?
[EXP]
Câu hỏi về hướng dẫn cài đặt, không mang tính đánh giá rủi ro kiến trúc.
[C]
Giả sử hệ thống bị mất điện thì dữ liệu có lưu lại không?
[EXP]
Đây là câu hỏi đúng hướng nhưng hơi phổ thông, thiếu bối cảnh cấu trúc phần mềm.
[D]
Dựa trên kiến trúc dùng Redis Cache này, chuyện gì sẽ xảy ra nếu cụm máy chủ Redis đột ngột chết (What if Redis goes down) khi lưu lượng đang ở mức 10,000 requests/s? Đề xuất cơ chế Fallback bằng Java.
[EXP]
Đưa ra tình huống khắc nghiệt cụ thể (Redis chết + Tải cao) để đòi hỏi AI đưa ra phương án dự phòng (Fallback) là đỉnh cao của quản trị rủi ro phần mềm.

@correct: D
@difficulty: 10
@category: 1

## Q4

Sau khi AI sinh ra một hàm `registerUser()` chạy thành công, bạn tiến hành Vòng 1 của chuỗi "Cải tiến đầu ra" (Robustness). Lệnh Prompt nào dưới đây phản ánh đúng mục tiêu của vòng này?

[A]
Tách hàm này thành hai lớp Interface và Implementation.
[EXP]
Đây là Vòng 2 (Clean Code/Maintainability), không phải Vòng 1.
[B]
Đoạn mã này rất tốt, cảm ơn bạn.
[EXP]
Không mang tính cải tiến hệ thống.
[C]
Hãy bổ sung thư viện `Hibernate Validator`. Đảm bảo độ dài mật khẩu phải lớn hơn 8 ký tự và email không được chứa khoảng trắng. Ném ra ngoại lệ nếu dữ liệu sai.
[EXP]
Mục tiêu Vòng 1 là gia cố độ bền vững bằng cách chặn dữ liệu rác (Validation) và xử lý ngoại lệ (Edge Cases).
[D]
Thay đổi định dạng trả về sang XML thay vì JSON.
[EXP]
Định dạng dữ liệu là Vòng 3 (Context-specific Tuning).

@correct: C
@difficulty: 10
@category: 1

## Q5

Trong Vòng 2 của "Cải tiến đầu ra", mục tiêu là áp dụng tiêu chuẩn mã hóa (Clean Code) và khả năng bảo trì. Hành động nào sau đây phù hợp với tiêu chí này?

[A]
Yêu cầu AI viết bằng thư viện của ngôn ngữ C# thay vì Java.
[EXP]
Đổi ngôn ngữ không liên quan đến Clean Code của đoạn mã hiện tại.
[B]
Yêu cầu AI tái cấu trúc (Refactor), bổ sung cơ chế lưu vết bằng thư viện `@Slf4j` và phân chia mức độ Log (INFO, ERROR) rõ ràng.
[EXP]
Việc thêm Logging và cấu trúc lại mã nguồn giúp đồng nghiệp dễ dàng đọc hiểu và bảo trì dự án sau này.
[C]
Yêu cầu AI làm cho thuật toán chạy nhanh hơn 10 lần.
[EXP]
Tối ưu hiệu năng thuật toán thuộc về thuật toán cốt lõi, không nhất thiết là Clean Code (đôi khi code nhanh hơn lại khó đọc hơn).
[D]
Yêu cầu AI tự động deploy mã nguồn lên máy chủ.
[EXP]
AI văn bản không có chức năng tự động Deploy mã nguồn lên Server.

@correct: B
@difficulty: 10
@category: 1

## Q6

Bạn nhận được một đoạn mã từ AI cấu hình kết nối đám mây AWS S3, trong đó có chứa cứng (hardcode) chuỗi mật khẩu `AccessKey`. Để thực hiện Vòng 3 (Tối ưu theo ngữ cảnh doanh nghiệp), bạn dùng lệnh nào?

[A]
Đoạn mã bị lỗi biên dịch, sửa lại dòng số 10.
[EXP]
Sửa lỗi biên dịch là kỹ năng của Session 03, không phải Vòng 3 cải tiến chất lượng.
[B]
Xóa hoàn toàn chức năng kết nối đi.
[EXP]
Việc xóa bỏ không tối ưu chất lượng mã nguồn.
[C]
Theo chuẩn bảo mật của công ty, cấm hardcode. Hãy sửa mã để `AccessKey` được đọc động từ biến môi trường thông qua `@Value` của Spring Boot.
[EXP]
Cải tiến mã nguồn tuân thủ các chuẩn mực bảo mật doanh nghiệp (ẩn Secret Key) là tiêu chuẩn bắt buộc trước khi đưa mã lên Production.
[D]
Hãy viết lại bằng thư viện cũ hơn.
[EXP]
Sử dụng thư viện cũ thường làm giảm chất lượng an toàn thay vì tăng lên.

@correct: C
@difficulty: 10
@category: 1

## Q7

Khi sử dụng kỹ thuật "Giải thích theo cấp độ hiểu" để học về khái niệm `Dependency Injection (DI)`, Prompt nào mang tính sáng tạo và phá vỡ rào cản thuật ngữ tốt nhất?

[A]
DI là gì? Viết một bài luận 10 trang.
[EXP]
Viết dài bằng thuật ngữ hàn lâm không giúp người học dễ hiểu hơn.
[B]
Bạn là chuyên gia. Hãy định nghĩa DI theo chuẩn sách giáo khoa.
[EXP]
Sách giáo khoa thường sử dụng thuật ngữ trừu tượng khó mường tượng.
[C]
Đóng vai giáo viên. Giải thích cơ chế `DI` cho một người không biết code bằng cách ví von nó với việc bạn vào nhà hàng gọi món thay vì tự đi chợ nấu ăn.
[EXP]
Áp dụng phép ẩn dụ đời thực (nhà hàng) giúp não bộ người học ngay lập tức bắt được bản chất cốt lõi của khái niệm kỹ thuật.
[D]
Lấy ví dụ về DI trong C++.
[EXP]
Ví dụ ngôn ngữ khác chỉ đổi bối cảnh, không giải quyết được việc người học đang không hiểu khái niệm.

@correct: C
@difficulty: 10
@category: 1

## Q8

Trong kỹ thuật học kiến thức nâng cao bằng Prompt, sau khi bạn đã hiểu được khái niệm thiết kế mẫu `Singleton`, bước BẮT BUỘC tiếp theo để chuyển hóa lý thuyết thành thực hành là gì?

[A]
Xin AI thêm một ví dụ nữa cũng bằng lời nói.
[EXP]
Lời nói suông không giúp kỹ sư hình dung được cách thiết lập trong dự án thật.
[B]
Bắt AI phải giải thích bằng ngôn ngữ lập trình khác.
[EXP]
Biết thêm ngôn ngữ khác không giúp bạn code được bằng ngôn ngữ đang học.
[C]
Tắt AI và mở sách giáo khoa ra đọc lại.
[EXP]
Bỏ qua khả năng kết xuất mã của AI.
[D]
Yêu cầu: *"Dựa vào khái niệm vừa giải thích, hãy viết một đoạn mã Java thực tế (Code Snippet) mô phỏng một `DatabaseConnection` dùng Singleton."*
[EXP]
"Ví dụ minh họa thực tiễn" (Practical Example) là bước chốt hạ giúp lập trình viên thẩm thấu sâu sắc cấu trúc code.

@correct: D
@difficulty: 10
@category: 1

## Q9

Bạn có đoạn mã chứa 4 khối `if-else` lồng nhau. Bạn viết Prompt: *"Hãy phân tích luồng của 4 khối if-else này ra văn bản. Xác định các trường hợp ngoại lệ. Cuối cùng viết lại hàm dùng Guard Clause (Return Early)."* Kỹ thuật nào đang được vận dụng ở đây?

[A]
So sánh công nghệ.
[EXP]
Không có công nghệ nào được đưa lên bàn cân ở đây.
[B]
Phân tích giả định (What-if).
[EXP]
Không có kịch bản rủi ro hệ thống sập được giả định.
[C]
Chain-of-thought (Suy luận theo bước).
[EXP]
Bạn ép AI "phân tích ra văn bản trước", "xác định ngoại lệ", rồi "cuối cùng mới viết mã". Đây là bản chất của CoT.
[D]
Giải thích đa cấp độ.
[EXP]
Bạn không yêu cầu AI giải thích cho đối tượng học sinh hiểu.

@correct: C
@difficulty: 10
@category: 1

## Q10

Khi bạn dùng AI để quyết định xem có nên sử dụng tính năng Streaming API của Jackson JSON parser hay không, Prompt nào ứng dụng phương pháp "Phân tích Trade-off"?

[A]
Viết mã parse JSON bằng Jackson.
[EXP]
Chỉ là lệnh thực thi đơn giản.
[B]
Làm sao để import thư viện Jackson?
[EXP]
Chỉ là lệnh tìm kiếm tài liệu cơ bản.
[C]
Trong Java, khi đọc file JSON 200MB, hãy so sánh sự đánh đổi (Trade-off) về Tốc độ và Bộ nhớ (RAM) giữa việc đọc toàn bộ file vào Object và việc dùng Streaming API.
[EXP]
Đòi hỏi AI phải đặt hai phương án lên bàn cân, phân tích cái được và cái mất (Trade-off) để bạn tự ra quyết định.
[D]
Thư viện nào phổ biến nhất hiện nay?
[EXP]
Sự phổ biến không giải quyết được bài toán kỹ thuật RAM/CPU của dự án.

@correct: C
@difficulty: 10
@category: 1

## Q11

Bạn yêu cầu AI viết API tính toán chiết khấu. Ở vòng cải tiến thứ nhất (Robustness), bạn muốn chống lại trường hợp người dùng nhập số tiền âm. Ràng buộc (Constraint) nào hiệu quả nhất?

[A]
Nhớ là số tiền không được âm nhé.
[EXP]
Ràng buộc bằng ngôn ngữ giao tiếp thiếu tính kỹ thuật.
[B]
Thêm CSS màu đỏ khi người dùng nhập số âm.
[EXP]
API xử lý dưới Backend, không tác động trực tiếp CSS ở Frontend.
[C]
Bổ sung đoạn Guard Clause ở đầu hàm: Nếu `amount < 0`, ném ra `IllegalArgumentException` kèm thông báo lỗi rõ ràng.
[EXP]
Đây là Ràng buộc chuẩn xác của kỹ sư chuyên nghiệp để bảo vệ hệ thống từ sâu bên trong lõi.
[D]
Hỏi người dùng lại một lần nữa trước khi tính toán.
[EXP]
Backend không thể "hỏi lại" theo kiểu hội thoại trực tiếp nếu không thiết kế luồng API phức tạp.

@correct: C
@difficulty: 10
@category: 1

## Q12

Làm sao để sử dụng AI thay thế cho cuốn sách dày 500 trang về kiến trúc `Event-Driven` khi bạn chỉ có 15 phút chuẩn bị bài thuyết trình cho nhân sự phi kỹ thuật?

[A]
Yêu cầu AI tóm tắt sách thành 5 trang.
[EXP]
Tóm tắt 5 trang vẫn chứa rất nhiều thuật ngữ học thuật không dành cho người phi kỹ thuật.
[B]
Bảo AI: *"Sử dụng kỹ thuật Giải thích cấp độ. Đóng vai người kể chuyện, ví von kiến trúc Event-Driven với hệ thống bưu điện vận chuyển thư từ. Trình bày dưới dạng gạch đầu dòng ngắn gọn."*
[EXP]
Sử dụng hình ảnh bưu điện để ẩn dụ cho Event-Driven giúp bất kỳ ai cũng có thể hiểu ngay lập tức bản chất công nghệ.
[C]
Bắt AI phải sinh ra đoạn mã Java để bạn trình chiếu.
[EXP]
Người phi kỹ thuật không hiểu mã nguồn, chiếu mã lên chỉ làm tình hình rối thêm.
[D]
Yêu cầu AI viết một bài báo cáo khoa học 2000 từ.
[EXP]
Báo cáo khoa học mất rất nhiều thời gian đọc và không phù hợp thuyết trình ngắn.

@correct: B
@difficulty: 10
@category: 1

## Q13

Một Fresher dùng Prompt: *"Viết thuật toán xử lý phân bổ ngân sách chiến dịch cho 10,000 khách hàng với các điều kiện độ tuổi, ưu tiên giờ vàng"*. AI trả về kết quả dùng thuật toán For-loop lồng nhau chạy siêu chậm. Phân tích nguyên nhân theo góc nhìn AI.

[A]
Mô hình AI bị lỗi kết nối mạng nội bộ.
[EXP]
Lỗi nằm ở phương pháp Zero-shot, không phải do mạng.
[B]
AI có thù hằn với Fresher nên cố tình viết code chạy chậm.
[EXP]
AI không có cảm xúc hay thiên vị người dùng.
[C]
Do lệnh Prompt "Zero-shot" ép AI phải đưa ra kết quả cuối cùng ngay lập tức. Bộ não (Attention) của AI không đủ dung lượng nạp hết ngần ấy điều kiện trong 1 lần tính, dẫn đến rớt dữ kiện và sinh mã chắp vá.
[EXP]
Sự phức tạp đa chiều bắt buộc phải được bẻ gãy (Decompose). Zero-shot ép AI "nhảy cóc" sẽ luôn sinh ra mã rác trong bài toán thuật toán nặng.
[D]
Vì thuật toán For-loop là thuật toán mạnh nhất thế giới.
[EXP]
For-loop lồng nhau tạo ra độ phức tạp O(n^2), cực kỳ chậm.

@correct: C
@difficulty: 11
@category: 1

## Q14

Vì sao cụm từ "Hãy suy nghĩ từng bước một" (Let's think step by step) lại tạo ra ma thuật làm tăng đáng kể chất lượng đáp án của LLM?

[A]
Vì nó kích hoạt chế độ tính phí VIP của hệ thống AI.
[EXP]
AI xử lý văn bản không phân biệt tài khoản VIP dựa trên cụm từ này.
[B]
Vì nó là một đoạn mã cheat code bí mật giấu trong nhân (kernel) của mô hình.
[EXP]
Không có cheat code nào trong Neural Network.
[C]
Vì nó buộc AI phải rải đều quá trình tính toán xác suất từ vựng ra nhiều dòng văn bản (không gian đệm). Nhờ đó, AI xử lý dứt điểm từng nhánh logic trước khi đưa ra kết luận cuối.
[EXP]
Việc in các bước suy luận ra màn hình giúp AI tạo ra ngữ cảnh trung gian chính xác, làm tiền đề vững chắc để sinh mã nguồn đúng ở dòng cuối cùng.
[D]
Vì AI được lập trình bằng ngôn ngữ Java.
[EXP]
Hầu hết các LLM lõi được huấn luyện bằng Python/C++, không liên quan đến vấn đề này.

@correct: C
@difficulty: 11
@category: 1

## Q15

Phân tích rủi ro hệ thống khi kỹ sư sử dụng câu lệnh "đóng đinh giải pháp" (Zero-shot solution locking) như: *"Hãy viết đoạn mã kết nối MongoDB cho tính năng Audit Log"*.

[A]
Kỹ sư sẽ bị lộ mã nguồn MongoDB lên mạng internet.
[EXP]
Việc hỏi AI không trực tiếp gây rò rỉ mã trừ khi gửi kèm thông tin tuyệt mật.
[B]
AI sẽ tự động cài đặt MongoDB vào máy khách hàng.
[EXP]
AI văn bản không có chức năng thực thi cài đặt phần mềm từ xa.
[C]
Bỏ qua bước "Nhờ AI tư vấn kiến trúc". Có thể MongoDB hoàn toàn sai lầm cho tính năng Audit Log (vốn cần ghi dữ liệu tuần tự tốc độ cao thay vì Query phức tạp). Kỹ sư đánh mất quyền lợi dùng AI như một đối tác chiến lược.
[EXP]
"Đóng đinh giải pháp" làm bạn mất cơ hội nhận được lời khuyên về công nghệ tốt hơn (ví dụ: dùng Elasticsearch cho Audit Log).
[D]
MongoDB không hỗ trợ ngôn ngữ Java.
[EXP]
MongoDB có Driver Java chính thức hỗ trợ rất tốt.

@correct: C
@difficulty: 11
@category: 1

## Q16

Đồng nghiệp của bạn áp dụng CoT bằng Prompt: *"Hãy tính tiền đơn hàng theo 3 bước: 1. Đọc số lượng. 2. Nhận mã giảm giá. 3. Viết code Java."* Tuy nhiên AI vẫn sinh ra mã lỗi luồng. Điểm yếu chết người của Prompt này là gì?

[A]
Đồng nghiệp không dùng từ "Làm ơn" (Please).
[EXP]
Tính lịch sự không tác động đến khả năng phân tích logic.
[B]
Đồng nghiệp quên yêu cầu AI "Đừng viết code ngay, hãy trình bày suy luận phân tích ra màn hình trước". AI hiểu ngầm là nó cứ đi thẳng tới bước 3 mà bỏ qua bước 1 và 2.
[EXP]
Nếu không Ràng buộc AI phải in bước 1, 2 ra màn hình dưới dạng văn bản (Text), AI sẽ thực thi ngay lệnh viết Code, biến CoT trở lại thành Zero-shot.
[C]
Mã giảm giá không áp dụng được ở bước 2.
[EXP]
Đây là lỗi kinh doanh, không liên quan đến thiết kế Prompt.
[D]
Số lượng bước quá ít, phải chia thành 10 bước AI mới hiểu.
[EXP]
Số lượng bước phụ thuộc vào độ khó, 3 bước cũng đủ nếu AI chịu suy nghĩ trung gian.

@correct: B
@difficulty: 11
@category: 1

## Q17

AI vừa trả về một hàm xử lý thanh toán rút tiền: `balance = balance - withdrawAmount;`. Dưới góc độ của quy trình "Cải tiến Vòng 1" (Robustness), hàm này thiếu hụt nghiêm trọng điều gì?

[A]
Thiếu chú thích màu sắc cho IDE.
[EXP]
Không tác động đến logic chạy của chương trình.
[B]
Thiếu việc lưu vào biến cục bộ.
[EXP]
Việc thực hiện toán học đã gán vào biến cục bộ rồi.
[C]
Thiếu Validate (Kiểm tra xem `withdrawAmount` có lớn hơn `balance` không, có âm không) và thiếu Lock (Khóa bản ghi ngăn Race Condition).
[EXP]
Hàm tính toán cơ bản không bao giờ an toàn nếu thiếu Guard Clause và kỹ thuật xử lý đồng thời (Concurrency) trong ngân hàng.
[D]
Thiếu font chữ in nghiêng.
[EXP]
Font chữ chỉ để hiển thị, không tác động kỹ thuật.

@correct: C
@difficulty: 11
@category: 1

## Q18

Nguyên lý "Garbage in, Garbage out" vẫn đúng với CoT nếu bạn mắc lỗi gì khi phân rã các bước?

[A]
Khi bạn chia các bước hoàn toàn sai quy trình nghiệp vụ (Ví dụ: Yêu cầu AI tính thuế trước khi lấy số tiền lương gốc).
[EXP]
Nếu bản chất quy trình (In) do bạn thiết kế bị sai logic, sự tập trung của AI (Out) sẽ bám theo cái sai đó và sinh ra mã nguồn vô giá trị.
[B]
Khi bạn chia các bước bằng tiếng Anh thay vì tiếng Việt.
[EXP]
AI đa ngữ, ngôn ngữ không làm hỏng quy trình.
[C]
Khi bạn yêu cầu AI in kết quả thành chữ đỏ.
[EXP]
Đây chỉ là lỗi hiển thị, không liên quan đến độ chuẩn xác của mã.
[D]
Khi bạn bắt AI dùng quá nhiều thư viện.
[EXP]
Sử dụng nhiều thư viện không đồng nghĩa với luồng logic bị rác.

@correct: A
@difficulty: 11
@category: 1

## Q19

Phân tích nguyên nhân tại sao một đoạn mã lấy 10,000 bản ghi dữ liệu (Records) từ cơ sở dữ liệu do AI sinh ra bằng lệnh `List<User> list = repository.findAll()` lại được coi là thảm họa nếu thiếu bước "Phân tích giả định" (What-if)?

[A]
Vì `findAll()` không được hỗ trợ trong Java.
[EXP]
Hàm `findAll()` là chuẩn của Spring Data JPA.
[B]
Vì AI có ý định lén lưu danh sách này về máy chủ của nó.
[EXP]
AI không có khả năng chèn mã gián điệp mạng nếu bạn không cung cấp API từ ngoài vào.
[C]
Vì nếu dữ liệu có 1 triệu bản ghi trong tương lai, câu lệnh này sẽ làm sập bộ nhớ (Out of Memory). Nếu có lệnh "What-if: Giả sử tương lai có 1 triệu bản ghi?", AI sẽ tự động thay bằng kỹ thuật Phân trang (Pagination) hoặc Streaming.
[EXP]
Thiếu tầm nhìn rủi ro về độ phình to dữ liệu là sai lầm chết người của lập trình viên khi chấp nhận đoạn mã dễ dãi từ AI.
[D]
Vì dữ liệu lấy ra không được xếp theo thứ tự bảng chữ cái.
[EXP]
Không sắp xếp chỉ là lỗi nghiệp vụ nhỏ, không phải thảm họa sập hệ thống (Crash).

@correct: C
@difficulty: 11
@category: 1

## Q20

Khi Review Code, Tech Lead đánh giá hàm `addUser` của bạn là "Cấp độ Fresher" dù code chạy không có lỗi. Đứng ở góc độ Cải tiến Vòng 2 & 3, đoạn code này thiếu vắng tiêu chuẩn nào của một Kỹ sư Senior?

[A]
Code thiếu việc sử dụng thuật toán AI mạng Nơ-ron bên trong.
[EXP]
Không phải tính năng nào cũng cần nhúng công nghệ AI lõi vào code.
[B]
Code không có màu mè giao diện.
[EXP]
Backend không quan tâm giao diện.
[C]
Code chứa tất cả logic trong một file duy nhất, thiếu phân tầng (Service/Controller), thiếu bảo mật (Mật khẩu gắn cứng hardcode), và thiếu cơ chế Ghi vết hệ thống (Logging).
[EXP]
Sự khác biệt giữa Fresher (Working Code) và Senior (Production-Ready) nằm ở kiến trúc sạch, an toàn cấu hình và khả năng truy vết lỗi (Maintainability).
[D]
Code chưa được viết bằng TypeScript.
[EXP]
Dự án Java thì không thể đòi hỏi viết TypeScript cho backend được.

@correct: C
@difficulty: 11
@category: 1

## Q21

Vì sao khi yêu cầu AI "Giải thích `@RestController`", kỹ thuật "Giải thích theo cấp độ" (Level-based) lại ưu việt hơn hẳn so với việc hỏi định nghĩa đơn thuần?

[A]
Vì định nghĩa đơn thuần luôn sai kiến thức chuẩn.
[EXP]
Định nghĩa AI lấy từ tài liệu chuẩn, không hề sai.
[B]
Vì hỏi định nghĩa sẽ khiến AI trả lời quá ngắn.
[EXP]
Định nghĩa của AI thường rất dài dòng.
[C]
Vì định nghĩa đơn thuần thường chứa đặc ngập thuật ngữ hàn lâm (Jargon). Phân tầng cấp độ (bằng phép ẩn dụ đời thực) giúp não bộ con người nhanh chóng nắm được cốt lõi trước khi đi vào từ vựng kỹ thuật.
[EXP]
Nghiên cứu sư phạm chứng minh con người học khái niệm vô hình tốt nhất thông qua các phép ẩn dụ hữu hình liên đới.
[D]
Vì kỹ thuật Level-based miễn phí phí dùng AI.
[EXP]
Chi phí sử dụng Token không liên quan đến kỹ thuật học.

@correct: C
@difficulty: 11
@category: 1

## Q22

Một sinh viên yêu cầu AI giải thích về thuật toán `Binary Search` cực kỳ chi tiết, nhưng vẫn không thể tự gõ code vào bài thi. Đánh giá nguyên nhân theo nguyên tắc học kỹ thuật bằng Prompt.

[A]
Vì AI đã cố tình cung cấp mã code sai lầm.
[EXP]
Sinh viên chưa hề nhận được mã nguồn nào.
[B]
Vì thuật toán tìm kiếm nhị phân không khả thi trong thực tế.
[EXP]
Đây là một thuật toán cực kỳ cơ bản và hiệu quả.
[C]
Do sinh viên quên bước thứ 4: "Yêu cầu tạo ví dụ minh họa thực tiễn (Code Snippet)". Lý thuyết luôn là số 0 nếu không được chuyển hóa thành các dòng mã cụ thể để thị phạm.
[EXP]
Lập trình là ngành kỹ thuật thực hành. Không yêu cầu AI viết thử đoạn code mô phỏng thì không bao giờ hiểu cách cài đặt thuật toán.
[D]
Vì sinh viên chưa trả tiền cho gói Premium.
[EXP]
Bản chất phương pháp học sai, không liên quan tài khoản Premium.

@correct: C
@difficulty: 11
@category: 1

## Q23

Bạn được giao tạo một "Mega-Prompt" thiết kế kiến trúc hệ thống tính Bill (Hóa đơn) viễn thông. Sự kết hợp Sáng tạo nào dưới đây là hoàn chỉnh nhất?

[A]
Vai trò: Kiến trúc sư. Task: Thiết kế hệ thống tính bill.
[EXP]
Prompt thiếu Context và các quy trình suy luận (CoT).
[B]
Role: Senior System Architect. Context: Hệ thống xử lý 100 triệu dòng cuộc gọi/ngày, công nghệ Spring Boot. Task: Thiết kế luồng tính Bill. Format & Flow: 1. Đề xuất 2 giải pháp công nghệ Queue để so sánh. 2. Phân tích What-if nếu Queue bị sập. 3. Sử dụng CoT liệt kê các module.
[EXP]
Mega-Prompt này hội tụ đỉnh cao mọi kỹ thuật: Vai trò, Ngữ cảnh hóc búa, Kỹ năng đưa lựa chọn, Phân tích rủi ro What-if và Suy luận theo bước.
[C]
Context: Tính hóa đơn mạng Viettel. Task: Tự động chạy code và báo cáo lỗi cho tôi.
[EXP]
AI không có quyền tự chạy code mạng viễn thông.
[D]
Role: QA. Task: Test hệ thống tính bill xem có đúng không.
[EXP]
Câu lệnh quá chung chung, thiếu thông tin hệ thống để AI có thể test.

@correct: B
@difficulty: 6
@category: 1

## Q24

Để AI đóng vai trò làm đối tác kỹ thuật (Sparring Partner) hoàn hảo khi bạn phân vân giữa 3 framework bảo mật: `Spring Security`, `Apache Shiro`, và `Keycloak`, thủ thuật SÁNG TẠO nhất nên áp dụng là gì?

[A]
Mở 3 cửa sổ chat khác nhau, mỗi cửa sổ hỏi về 1 framework.
[EXP]
Mất Ngữ cảnh so sánh chéo giữa các công nghệ với nhau.
[B]
Hỏi AI: "Công nghệ nào số 1 thế giới hiện nay?"
[EXP]
Không có công nghệ số 1, chỉ có công nghệ phù hợp với hoàn cảnh.
[C]
Đưa cho AI tài liệu nội bộ của công ty và yêu cầu nó quyết định thay bạn.
[EXP]
Trách nhiệm quyết định phải thuộc về Kỹ sư con người, AI chỉ tư vấn.
[D]
Cung cấp cho AI hiện trạng dự án (ví dụ: Team chỉ có 2 người, cần làm nhanh), yêu cầu AI đặt 3 công nghệ này lên một "Ma trận so sánh" đa chiều (Trade-off Matrix) về chi phí học tập và tính năng cốt lõi.
[EXP]
Áp dụng bối cảnh yếu điểm của team (ít người) vào bảng so sánh giúp AI đề xuất giải pháp có độ thực dụng (Pragmatism) cao nhất.

@correct: D
@difficulty: 6
@category: 1

## Q25

Xử lý file JSON siêu lớn 200MB trong Java bằng AI. Chiến thuật thiết kế Prompt an toàn nhất là gì?

[A]
Copy file JSON 200MB paste thẳng vào cửa sổ chat AI.
[EXP]
Cửa sổ chat sẽ bị sập (Crash) hoặc quá tải giới hạn token.
[B]
"Hãy viết mã dùng Jackson Streaming API (JsonParser) để đọc từng luồng của file JSON này. Không được tải toàn bộ file vào Object `JsonNode` để tránh OOM (Out Of Memory)."
[EXP]
Chiến thuật phủ định rủi ro rõ ràng (Không dùng JsonNode) và chỉ định thẳng cấu trúc an toàn (Streaming API) thể hiện trình độ Senior.
[C]
"Viết code đọc file JSON. Hãy nén nó lại trước khi đọc."
[EXP]
Nén file chỉ giảm dung lượng ổ cứng, khi nạp vào RAM bộ nhớ vẫn phình to 200MB.
[D]
"Hãy tăng dung lượng RAM của máy ảo Java lên 10GB rồi đọc file."
[EXP]
Cung cấp tài nguyên thô thiển là giải pháp kém nhất về tối ưu mã.

@correct: B
@difficulty: 6
@category: 1

## Q26

Đội dự án của bạn thường viết REST API thiếu cơ chế Log. Giải pháp "Tiến hóa Prompt" (Prompt Evolution) nào xử lý dứt điểm vấn đề này cho toàn bộ dự án về sau?

[A]
Mỗi lần code xong một hàm, nhắn tin nhắc từng lập trình viên tự thêm thư viện Log vào.
[EXP]
Quản trị thủ công bằng miệng sẽ bị bỏ sót và không hiệu quả.
[B]
Dựa trên các lệnh ép AI thêm `@Slf4j` thành công ở các vòng lặp trước, đúc kết lại thành một "API Generator Template" (Prompt mẫu). Yêu cầu toàn bộ team copy-paste Template này mỗi khi nhờ AI sinh mã mới.
[EXP]
Tạo lập hệ thống chuẩn mực (Systematization) bằng Template có chứa cứng Ràng buộc Clean Code/Logging là chìa khóa duy trì chất lượng đường dài.
[C]
Xóa hoàn toàn tính năng Log để API chạy nhanh hơn.
[EXP]
Xóa Log gây hệ lụy thảm khốc khi lỗi xảy ra trên Production.
[D]
Xin sếp mua phiên bản ChatGPT Doanh nghiệp.
[EXP]
Công cụ đắt tiền vẫn sinh code rác nếu không có quy chuẩn Template bắt buộc.

@correct: B
@difficulty: 6
@category: 1

## Q27

Bạn có một đoạn "Working Code" gọi hàm lấy dữ liệu thời tiết. Để nâng cấp nó thành "Senior Code" đáp ứng chuẩn Cloud Native (Kiến trúc đám mây), Prompt nào thể hiện tư duy SÁNG TẠO cao nhất?

[A]
Hãy thay đổi màu sắc của dữ liệu thời tiết.
[EXP]
Giao diện không phản ánh kiến trúc đám mây Backend.
[B]
Đoạn code này tốt rồi, chuyển sang tác vụ khác thôi.
[EXP]
Lười biếng bồi đắp sẽ để lại Technical Debt (Nợ kỹ thuật).
[C]
Đoạn mã hiện đang lưu hardcode URL của dịch vụ thời tiết. Hãy tái cấu trúc để đưa URL và API Key vào kho bảo mật `AWS Secrets Manager`. Đồng thời, bổ sung cơ chế `Circuit Breaker` (Ngắt mạch) nếu API thời tiết bị sập.
[EXP]
Khả năng tích hợp dịch vụ bên ngoài (AWS) và cơ chế chịu lỗi Microservices (Circuit Breaker) là "chữ ký" của một hệ thống Cloud Native thực thụ.
[D]
Hãy viết lại đoạn mã bằng ngôn ngữ C++ để chạy nhanh hơn trên Cloud.
[EXP]
Đổi ngôn ngữ không giải quyết bản chất kiến trúc quản lý cấu hình và rủi ro mạng.

@correct: C
@difficulty: 6
@category: 1

## Q28

Bạn là Tech Lead cần dạy cho Fresher về "Docker Containers". Chuỗi lệnh Prompt sáng tạo (Workflow) nào kết hợp đủ bộ 4 kỹ năng sư phạm của AI?

[A]
1. Viết code chạy Docker. 2. Xóa code Docker.
[EXP]
Không mang lại giá trị học thuật nào.
[B]
1. Đóng vai chuyên gia DevOps. 2. Giải thích Docker bằng hình ảnh "Các container trên tàu thủy". 3. So sánh Docker với "Máy ảo truyền thống" (VM). 4. Cung cấp một file `Dockerfile` mẫu bằng Java Spring Boot.
[EXP]
Workflow này sở hữu độ sát thương kiến thức cực mạnh: Có Role, Có phép ẩn dụ (Level-based), Có đối chiếu phân biệt (Comparison), và có Demo thực hành (Code Snippet).
[C]
1. Đọc Docker là gì? 2. Docker ra đời năm nào? 3. Công ty nào tạo ra Docker?
[EXP]
Chuỗi câu hỏi lịch sử thuần túy, không có khả năng nâng cao trình độ viết mã.
[D]
Hãy làm hộ tôi bài tập về Docker rồi nộp cho sếp.
[EXP]
Bản chất lười biếng, không ứng dụng AI để tự phát triển bản thân.

@correct: B
@difficulty: 6
@category: 1

## Q29

Công ty bạn thiết kế luồng xử lý đơn hàng bằng 1 database duy nhất. Bạn linh cảm luồng này có nguy cơ tắc nghẽn (Bottleneck). Bằng kỹ thuật Phân tích giả định (What-if), bạn dùng Prompt nào để "bắt" AI tìm ra giải pháp Sáng tạo?

[A]
Cơ sở dữ liệu Oracle hay MySQL tốt hơn?
[EXP]
Đây là so sánh công nghệ, không phải phân tích giả định.
[B]
Làm sao để xóa database nhanh nhất?
[EXP]
Lệnh hủy hoại hệ thống, không có giá trị xây dựng.
[C]
Sử dụng kiến trúc hiện tại (1 Database), giả định đêm Black Friday có 100,000 người cùng thanh toán 1 lúc, nút thắt cổ chai (Bottleneck) chắc chắn sẽ xảy ra ở bước nào? Đề xuất 2 giải pháp kiến trúc nâng cao (như Sharding hoặc Message Queue) để giải vây.
[EXP]
Ép AI tạo tải ảo (Black Friday) để chỉ ra điểm gãy (Bottleneck) chính xác và định hướng AI đề xuất hệ thống phân tán (Sharding/Queue) giải cứu điểm gãy đó.
[D]
Database của tôi có khả năng lưu được bao nhiêu gigabyte?
[EXP]
Đây là câu hỏi đọc tài liệu phần cứng cơ bản.

@correct: C
@difficulty: 6
@category: 1

## Q30

Bạn nhận được một thư viện mã nguồn đóng (Closed-source) từ khách hàng mà không có tài liệu Document. Cách Sáng tạo nhất để biến AI thành đối tác giúp bạn đọc hiểu thư viện này là gì?

[A]
Chat với AI: "Khách hàng gửi thư viện A, bạn biết nó không?"
[EXP]
AI không thể biết thư viện tư nhân chưa từng được public lên Internet.
[B]
Viết một email gửi khách hàng chửi mắng họ vì không có tài liệu.
[EXP]
Hành động thiếu chuyên nghiệp.
[C]
Dùng kỹ thuật Few-shot Context: Cắt một số đoạn mã lõi (Core Classes) chứa các Interface quan trọng của thư viện khách hàng, thả vào Prompt làm Ngữ cảnh. Yêu cầu AI "dịch ngược" logic kinh doanh (Reverse Engineering) và giải thích luồng gọi hàm từ đống code đó.
[EXP]
Cung cấp mẫu tĩnh (Few-shot/RAG mini) là cách duy nhất "tiêm" kiến thức nội bộ vào não AI, biến nó thành công cụ đọc code dịch ngược vô giá.
[D]
Chụp ảnh màn hình đống code rồi tự ngồi suy nghĩ trong vô vọng.
[EXP]
Lãng phí công cụ siêu việt trong việc đọc hiểu các luồng mã rắc rối.

@correct: C
@difficulty: 6
@category: 1
