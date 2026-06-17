# QUIZ ĐẦU GIỜ - SESSION 05

## Q1

Để AI giúp bạn viết một hàm tính lương nhân viên bằng ngôn ngữ Java, câu lệnh (Prompt) nào sau đây được cấu trúc theo chuẩn "Vận dụng chuyên sâu" với đầy đủ Vai trò, Mục tiêu và Ràng buộc?

[A]
Hãy viết một hàm tính lương bằng Java.
[EXP]
Đây là câu lệnh cơ bản, thiếu Role, Context và Constraint.
[B]
Đóng vai kế toán trưởng. Viết hàm Java tính lương. Cố gắng viết code cho dễ hiểu.
[EXP]
Constraint "dễ hiểu" quá chung chung, không có khả năng điều hướng AI về mặt kỹ thuật.
[C]
Tôi cần một đoạn mã Java xử lý nghiệp vụ tính lương hàng tháng.
[EXP]
Thiếu Role và Constraint để định hình chất lượng đoạn mã.
[D]
Vai trò: Kỹ sư Java. Mục tiêu: Viết hàm tính lương `calculateSalary`. Ràng buộc: Trả về đối tượng `BigDecimal`, không dùng `Double`, biến đầu vào phải có `@NotNull`.
[EXP]
Cấu trúc chặt chẽ này cung cấp đầy đủ Role, Task, và Constraint kỹ thuật, bắt buộc AI sinh ra mã an toàn.

@correct: D
@difficulty: 4
@category: 0

## Q2

Một kỹ sư muốn AI sinh ra lớp thực thể (Entity) `Product` trong Java. Thành phần "Định dạng" (Format) nào sau đây hữu ích nhất để người kỹ sư không mất công tinh chỉnh thủ công?

[A]
Bạn là một chuyên gia về Hibernate và Spring Data JPA.
[EXP]
Đây là Vai trò (Role).
[B]
Lớp `Product` này dùng để lưu dữ liệu sản phẩm của một sàn thương mại điện tử lớn.
[EXP]
Đây là Ngữ cảnh (Context).
[C]
Trả về duy nhất mã nguồn Java đặt trong một block code, không kèm theo bất kỳ văn bản chào hỏi hay giải thích nào.
[EXP]
Định dạng này loại bỏ các "văn bản thừa" (chit-chat), giúp bạn sao chép thẳng vào IDE một cách nhanh nhất.
[D]
Hãy viết mã nguồn và đảm bảo không có lỗi biên dịch.
[EXP]
Đây là Ràng buộc (Constraint) chung chung, không phải Format.

@correct: C
@difficulty: 4
@category: 0

## Q3

Khi yêu cầu AI giải thích về kiến trúc Microservices cho một nhân viên kinh doanh (Sales), thành phần Ngữ cảnh (Context) nào là quan trọng nhất để đạt hiệu quả truyền đạt?

[A]
Hãy dùng ngôn ngữ chuyên sâu về Docker, Kubernetes và CI/CD.
[EXP]
Ngôn ngữ chuyên sâu không phù hợp với nhân viên kinh doanh.
[B]
Đối tượng người nghe là nhân viên Sales, không có nền tảng IT, hãy giải thích bằng ví dụ về một siêu thị có nhiều quầy hàng độc lập.
[EXP]
Việc nêu rõ đối tượng nghe và đề xuất phép ẩn dụ (siêu thị) tạo ra Ngữ cảnh hoàn hảo để AI tự động hạ thấp độ phức tạp của câu chữ.
[C]
Trả về một bản báo cáo dài 5 trang với font chữ Times New Roman.
[EXP]
Đây là Format hiển thị, không giải quyết được vấn đề rào cản thuật ngữ.
[D]
Bạn là Kiến trúc sư phần mềm 10 năm kinh nghiệm.
[EXP]
Role này nếu đứng một mình mà không có Context sẽ khiến AI trả lời quá hàn lâm.

@correct: B
@difficulty: 4
@category: 0

## Q4

Quá trình "Iterative Prompting" (Prompt lặp) tốt nhất để gỡ lỗi một đoạn mã bị `NullPointerException` là gì?

[A]
Copy lỗi `NullPointerException` quăng cho AI mà không cung cấp đoạn mã đang chạy.
[EXP]
Thiếu ngữ cảnh đoạn mã, AI sẽ chỉ đoán mò hoặc trả về định nghĩa lỗi.
[B]
Nhập lệnh: "AI sửa lỗi đi, code bị hỏng rồi."
[EXP]
Lệnh quá ngắn, không có thông tin lỗi cụ thể để AI nhận diện.
[C]
Cung cấp dòng báo lỗi (Stack Trace) cùng với hàm xảy ra lỗi, kèm theo Ràng buộc: "Không được xóa logic cũ, chỉ bổ sung thêm Guard Clause để chống Null."
[EXP]
Cung cấp đủ Ngữ cảnh (Stack trace + Code) và đưa Ràng buộc sửa lỗi chính là cốt lõi của việc gỡ lỗi bằng Prompt lặp.
[D]
Nhấn nút Regenerate (Tạo lại) 10 lần liên tiếp hy vọng AI tự đổi code.
[EXP]
Nếu không đưa thêm manh mối (Stack trace), AI sẽ lặp lại cùng một lối tư duy sai ban đầu.

@correct: C
@difficulty: 4
@category: 0

## Q5

Bạn muốn AI dịch một thông báo lỗi từ database ra tiếng Việt chuẩn kỹ thuật. Đâu là Prompt vận dụng tốt nhất?

[A]
Dịch dòng này ra tiếng Việt giúp tôi.
[EXP]
Prompt hời hợt, không có điều hướng thuật ngữ.
[B]
Đóng vai phiên dịch viên. Dịch dòng lỗi Database sang tiếng Việt. Giữ nguyên các từ khóa như `Primary Key`, `Foreign Key`, không dịch "chế" ra tiếng Việt.
[EXP]
Có Role, có Task và có Constraint cụ thể về việc bảo toàn thuật ngữ gốc (không dịch chế) rất phù hợp trong lập trình.
[C]
Database bị lỗi, dịch nó bằng văn phong hài hước.
[EXP]
Văn phong hài hước không phù hợp cho thông báo lỗi hệ thống.
[D]
Hãy viết lại CSDL này bằng tiếng Việt.
[EXP]
Sai mục tiêu tác vụ, bạn đang muốn AI dịch thông báo lỗi chứ không phải dịch toàn bộ CSDL.

@correct: B
@difficulty: 4
@category: 0

## Q6

Bạn cần tóm tắt một bài blog dài 3000 từ về công nghệ React. Để tóm tắt này chỉ hiển thị đúng 5 gạch đầu dòng, bạn dùng kỹ thuật nào?

[A]
Thay đổi Ngữ cảnh thành "Bài blog này nói về Java".
[EXP]
Đổi ngữ cảnh làm sai lệch dữ kiện bài viết.
[B]
Cung cấp Constraint: "Tóm tắt không vượt quá 5 ý chính, định dạng Bullet Points."
[EXP]
Ràng buộc cứng về số lượng ý và định dạng giúp đầu ra bị khóa chặt trong giới hạn yêu cầu.
[C]
Sử dụng Role: "Hãy đóng vai một chuyên gia React".
[EXP]
Role chỉ thay đổi sắc thái từ vựng, không giới hạn được độ dài của văn bản tóm tắt.
[D]
Yêu cầu AI dịch bài viết sang tiếng Anh.
[EXP]
Đổi ngôn ngữ không có tác dụng rút gọn bài viết xuống 5 gạch đầu dòng.

@correct: B
@difficulty: 4
@category: 0

## Q7

Khi yêu cầu AI viết mã SQL, bạn đưa Prompt: *"Viết truy vấn lấy dữ liệu khách hàng."* Sự mơ hồ (Garbage in) này dẫn đến hệ quả (Garbage out) điển hình nào?

[A]
AI sẽ xóa toàn bộ dữ liệu bảng khách hàng.
[EXP]
Truy vấn SELECT không xóa dữ liệu, và AI văn bản không thể trực tiếp thực thi lệnh vào máy chủ của bạn.
[B]
AI sẽ yêu cầu bạn nộp phí để lấy truy vấn.
[EXP]
AI hoạt động dựa trên thuật toán ngôn ngữ, không tự động thu phí vì truy vấn ngắn.
[C]
AI tự giả định tên bảng (như `customers`) và chọn toàn bộ cột (`SELECT *`), gây lãng phí bộ nhớ và khó tích hợp vào dự án thật.
[EXP]
Sự mơ hồ khiến AI tự lấp đầy khoảng trống (ảo giác ra tên bảng) và trả về lệnh kém tối ưu nhất (`SELECT *`).
[D]
AI từ chối trả lời vì đây là câu hỏi vi phạm chính sách bảo mật.
[EXP]
Viết truy vấn SQL chung chung không vi phạm bất kỳ chính sách an toàn nào.

@correct: C
@difficulty: 4
@category: 0

## Q8

Trong quá trình sử dụng AI để Review Code, thành phần nào sau đây bắt buộc phải có để tránh AI chấm điểm theo cảm tính?

[A]
Context về luật Coding Convention (ví dụ: Google Java Style) hoặc các quy ước đặt tên riêng của dự án.
[EXP]
Nếu không có chuẩn mực (Convention) làm hệ quy chiếu, AI sẽ đánh giá theo sở thích của nó (cảm tính).
[B]
Role là Giám đốc điều hành (CEO) của công ty.
[EXP]
CEO thường thiên về kinh doanh, không có tác dụng tăng độ khắt khe cho bài Code Review kỹ thuật.
[C]
Tên đầy đủ và năm sinh của người đã viết đoạn code đó.
[EXP]
Thông tin cá nhân không liên quan đến chất lượng logic của đoạn mã.
[D]
Định dạng trả về là file PDF.
[EXP]
PDF chỉ là format hiển thị, không giải quyết vấn đề luật lệ để chấm điểm code.

@correct: A
@difficulty: 4
@category: 0

## Q9

Một đoạn Prompt có nội dung: *"Tôi đang dùng Java 8. Hãy dùng Switch Expression (tính năng của Java 14) để viết code."* Phân tích hệ quả khi AI xử lý Prompt chứa mâu thuẫn này.

[A]
AI sẽ làm hỏng trình dịch Java 8 trên máy của bạn.
[EXP]
AI không tương tác trực tiếp được với máy tính của bạn.
[B]
AI có xu hướng chỉ ra sự mâu thuẫn (Java 8 không hỗ trợ tính năng này) và đề xuất phương án dùng Switch truyền thống hoặc yêu cầu bạn nâng cấp JDK.
[EXP]
Các mô hình lớn có khả năng nhận diện mâu thuẫn trong Constraint và sẽ giải thích lý do nó không thể tuân theo 1 trong 2 yêu cầu.
[C]
AI sẽ tự động phát minh ra một thư viện giả lập Java 14 trên Java 8.
[EXP]
Cú pháp ngôn ngữ được Compiler quyết định, AI không thể tự chế ra Compiler ảo trong code.
[D]
AI bị kẹt trong vòng lặp vô hạn và văng lỗi Time-out.
[EXP]
AI không bị lỗi vòng lặp chỉ vì một đoạn text chứa logic mâu thuẫn.

@correct: B
@difficulty: 5
@category: 0

## Q10

Tại sao khi yêu cầu AI *"Thiết kế một cấu trúc mạng Neural từ số 0"*, nhưng lại không đưa Constraint (Ràng buộc), AI thường sinh ra hàng ngàn dòng code dư thừa và không chạy được?

[A]
Vì AI bị hạn chế về dữ liệu huấn luyện mảng Trí tuệ nhân tạo.
[EXP]
Dữ liệu về Neural Network trên mạng rất lớn. Lỗi nằm ở việc thiếu giới hạn phạm vi bài toán (Scope).
[B]
Vì bài toán quá vĩ mô. Khi không có Constraint (như chỉ dùng 2 lớp ẩn, giải bài toán XOR), Steerability bị mất, AI sẽ kết hợp ngẫu nhiên vô số tính năng phức tạp để cố làm hài lòng yêu cầu rộng.
[EXP]
Khi thiếu Ràng buộc, AI sẽ có xu hướng "chắp vá" toàn bộ khái niệm lớn lao mà nó biết thành một mớ hỗn độn (Frankenstein Code).
[C]
Vì bạn dùng tiếng Việt nên AI không hiểu từ "Neural".
[EXP]
Các mô hình AI tiên tiến xử lý từ vựng đa ngôn ngữ rất tốt.
[D]
Vì máy chủ của công cụ AI đang bị lỗi.
[EXP]
Lỗi nằm ở Prompt (người dùng), không phải lỗi đường truyền vật lý của máy chủ.

@correct: B
@difficulty: 5
@category: 0

## Q11

Bạn sử dụng AI để tóm tắt tài liệu API. Dù đã ra lệnh "Chỉ tóm tắt thành 5 dòng", AI vẫn luôn bắt đầu bằng câu "Chào bạn, đây là tóm tắt...". Phân tích lỗi theo tư duy Prompt Engineering.

[A]
Thiếu thành phần Role chuyên nghiệp.
[EXP]
Role chuyên nghiệp vẫn có thể chào hỏi bình thường.
[B]
Công cụ AI đang cố tình trêu tức người dùng.
[EXP]
AI không có cảm xúc hay ý đồ xấu.
[C]
Bạn đã thiếu một "Negative Constraint" (Ràng buộc phủ định) mạnh mẽ như: "TUYỆT ĐỐI không kèm theo câu chào hỏi hay diễn giải thừa."
[EXP]
Vì AI được huấn luyện theo thiên hướng trợ lý giao tiếp (Conversational), bạn phải dùng Negative Prompt để "tắt" lớp giao tiếp đó.
[D]
Định dạng 5 dòng không hỗ trợ cho văn bản kỹ thuật.
[EXP]
Độ dài 5 dòng hoàn toàn đáp ứng được bất cứ loại văn bản nào.

@correct: C
@difficulty: 5
@category: 0

## Q12

Khi gặp thông báo lỗi: `Cannot convert string to int`, lập trình viên gửi cho AI đúng một câu lệnh: *"Sửa lỗi này"*. Vì sao AI lại trả về một đoạn code dùng khối `try-catch` thay vì dùng logic kiểm tra chuỗi (Regex)?

[A]
Vì ngôn ngữ lập trình không hỗ trợ Regex.
[EXP]
Mọi ngôn ngữ phổ biến đều hỗ trợ Regex.
[B]
Vì bạn thiếu Context (Ngữ cảnh). Không biết chuỗi đến từ đâu và mục đích là gì, AI sẽ cung cấp giải pháp an toàn (phòng thủ bề mặt) và bao quát nhất là `try-catch`.
[EXP]
Thiếu ngữ cảnh khiến AI không thể đánh giá độ sâu của luồng dữ liệu, nó sẽ chọn giải pháp bao đồng nhất để bắt mọi lỗi (chữa ngọn thay vì chữa gốc).
[C]
Vì AI bị lập trình cứng là luôn phải trả về `try-catch` khi gặp lỗi ép kiểu.
[EXP]
AI không bị lập trình cứng cấu trúc câu trả lời.
[D]
Vì dùng `try-catch` chạy nhanh hơn Regex gấp 10 lần.
[EXP]
Về mặt hiệu năng, Regex đôi khi tối ưu hơn việc bắt ngoại lệ (vốn rất đắt đỏ về tài nguyên).

@correct: B
@difficulty: 5
@category: 0

## Q13

Tính năng "Steerability" (Khả năng điều hướng) của một đoạn Prompt sẽ giảm sút nghiêm trọng nếu bạn làm gì?

[A]
Chia nhỏ Prompt thành các gạch đầu dòng rõ ràng.
[EXP]
Việc này làm TĂNG tính điều hướng.
[B]
Kèm theo quá nhiều cảm xúc cá nhân (ví dụ: tôi đang rất buồn, sếp tôi ép quá) khiến AI bị loãng từ khóa nghiệp vụ.
[EXP]
Sự chú ý (Attention) của mô hình bị phân mảnh vào các từ vựng phi kỹ thuật, dẫn đến việc bỏ sót hoặc làm giảm trọng số của các Ràng buộc chuyên môn.
[C]
Định nghĩa rõ Format đầu ra là JSON.
[EXP]
Định dạng JSON tăng độ chính xác của đầu ra.
[D]
Cung cấp thông báo lỗi chi tiết từ Console.
[EXP]
Cung cấp lỗi chi tiết giúp tăng khả năng định hướng sửa lỗi.

@correct: B
@difficulty: 5
@category: 0

## Q14

Hiện tượng "Sycophancy" (Bợ đỡ người dùng) của LLM gây ra hậu quả gì nếu bạn cố tình đưa Context sai (Ví dụ: "Hãy viết code Java nhưng nhớ là Java không có class")?

[A]
AI sẽ chửi mắng bạn vì đưa thông tin sai.
[EXP]
AI có xu hướng lịch sự, không chửi mắng.
[B]
AI sẽ từ chối trả lời mọi câu hỏi về sau của bạn.
[EXP]
AI xử lý từng phiên hội thoại một cách độc lập.
[C]
AI sẽ cố gắng hùa theo Context sai đó, cố "ảo giác" (hallucinate) ra một loại ngôn ngữ Java giả mạo không dùng class để làm hài lòng nhận định của bạn.
[EXP]
AI có bản năng làm hài lòng (Sycophancy). Nếu bạn truyền bá dữ kiện sai, nó sẽ cố gắng giải thích và lập luận theo cái sai đó thay vì cãi lại.
[D]
AI tự động sửa Context của bạn mà không báo trước.
[EXP]
Dù nó biết sai, đôi khi nó vẫn hùa theo vì bạn đóng vai người điều khiển.

@correct: C
@difficulty: 5
@category: 0

## Q15

Chiến thuật "Sáng tạo" nào là tối ưu nhất để dùng AI học hiểu một thư viện mã nguồn đóng (Closed-source) nội bộ của công ty bạn?

[A]
Cài một tool cào dữ liệu (Crawler) tự động nạp mã nguồn công ty lên Github công cộng.
[EXP]
Làm như vậy là vi phạm bảo mật và làm lộ tài sản công ty.
[B]
Dùng kỹ thuật Few-shot Prompting: Cắt một vài đoạn mã hoặc tài liệu đặc tả API lõi của thư viện nội bộ đó, nhúng trực tiếp vào Context để AI có dữ liệu tham chiếu tĩnh.
[EXP]
Đưa "bối cảnh cục bộ" vào Prompt là cách an toàn và sáng tạo nhất để AI học nhanh các thư viện riêng tư mà không cần huấn luyện lại mô hình.
[C]
Dừng dùng thư viện nội bộ và chuyển sang thư viện Open-source.
[EXP]
Đây là giải pháp trốn tránh vấn đề, không phù hợp thực tế doanh nghiệp.
[D]
Hỏi đi hỏi lại AI 10 lần cho đến khi máy chủ tự đoán được.
[EXP]
Máy chủ không thể tự đoán ra code đóng của công ty bạn dù có hỏi 100 lần.

@correct: B
@difficulty: 6
@category: 0

## Q16

Bạn là Tech Lead và muốn mọi thành viên trong team đều dùng AI để tạo báo cáo lỗi (Bug Report) giống hệt nhau. Giải pháp thiết kế Prompt chuyên nghiệp nhất là gì?

[A]
Mỗi người tự viết một Prompt tùy ý.
[EXP]
Dẫn đến kết quả lộn xộn, không thống nhất form báo cáo.
[B]
Tạo một "Prompt Template" có sẵn Role (QA), Format (Bảng 3 cột) và Constraint cứng. Mọi người chỉ việc điền Context (thông tin lỗi) vào dấu ngoặc vuông rồi chạy.
[EXP]
Việc chuẩn hóa bằng Template (khung mẫu) giúp cố định tính điều hướng (Steerability), triệt tiêu sự sai lệch cá nhân giữa các thành viên.
[C]
Tạo một tài khoản AI chung cho cả công ty dùng để AI tự học form.
[EXP]
Dùng chung tài khoản gây nhiễu loạn lịch sử hội thoại (Context mixing).
[D]
Cấm dùng AI viết báo cáo lỗi, bắt mọi người tự gõ bằng tay.
[EXP]
Bỏ qua năng suất của AI là một quyết định đi lùi về công nghệ.

@correct: B
@difficulty: 6
@category: 0

## Q17

Bạn muốn tạo một "Mega-Prompt" (Prompt khổng lồ) để AI tự động đánh giá và chấm điểm bài tập sinh viên. Sự kết hợp nào thể hiện độ kiểm soát cao nhất?

[A]
Role: Giáo viên. Task: Chấm điểm bài này. Context: File mã nguồn.
[EXP]
Quá đơn giản, AI sẽ chấm theo cảm tính và kết quả không đồng nhất.
[B]
Role: Senior Code Reviewer. Task: Chấm lỗi và cho điểm từ 1-100. Constraint: Chỉ trừ điểm nếu vi phạm chuẩn SOLID, mỗi lỗi trừ 5 điểm. Format: JSON theo chuẩn `{"score": X, "reason": "Y"}`.
[EXP]
Kết hợp Role chuyên sâu, Constraint rạch ròi về điểm số và Format JSON nghiêm ngặt giúp bạn dễ dàng đưa đầu ra của AI vào hệ thống chấm điểm tự động.
[C]
Context: Bài của sinh viên A. Task: Chạy thử và nếu lỗi thì báo rớt.
[EXP]
AI văn bản không tự chạy thử mã được nếu không được liên kết với một Compiler.
[D]
Role: Máy chấm tự động. Task: Báo cáo xem sinh viên có gian lận copy bài không.
[EXP]
AI không thể biết sinh viên copy ở đâu nếu không được cung cấp cơ sở dữ liệu đối chiếu.

@correct: B
@difficulty: 6
@category: 0

## Q18

Để điều khiển AI không bao giờ được phép sử dụng thư viện `java.util.Date` (đã cũ kỹ) khi sinh mã ngày tháng, Ràng buộc (Constraint) nào sau đây an toàn tuyệt đối nhất?

[A]
Tốt nhất là đừng dùng `Date` nhé.
[EXP]
Ngôn từ quá mềm mỏng, tính điều hướng thấp.
[B]
Hãy code phần thời gian bằng các hàm hiện đại.
[EXP]
Khái niệm "hiện đại" mơ hồ, AI vẫn có thể lôi thư viện cũ ra dùng.
[C]
BẮT BUỘC SỬ DỤNG `java.time.LocalDate` hoặc `LocalDateTime`. TUYỆT ĐỐI KHÔNG sử dụng `java.util.Date`.
[EXP]
Sử dụng Ràng buộc phủ định cực đoan (Negative Prompt) kèm theo lối thoát định hướng rõ ràng (đề xuất thư viện thay thế) là cách kiểm soát AI cấp độ cao.
[D]
Viết mã không dùng thư viện của Java.
[EXP]
Điều này vô lý và vi phạm nghiệp vụ, vì xử lý ngày tháng rất cần thư viện chuẩn.

@correct: C
@difficulty: 6
@category: 0

## Q19

Bạn đang xây dựng một tính năng mới. Thay vì viết luôn 1 lệnh Prompt dài yêu cầu AI code từ A đến Z, bạn chia thành: (1) Prompt yêu cầu phân tích DB, (2) Prompt sinh ra interface, (3) Prompt implement code. Chiến thuật này có lợi ích cốt lõi gì?

[A]
Giúp tiết kiệm chi phí mua tài khoản AI.
[EXP]
Chi phí tính theo token, chia nhỏ hay gộp lại tổng token vẫn tiêu hao tương đương.
[B]
Ngăn chặn ảo giác (Hallucination) do AI bị "quá tải ngữ cảnh" và giúp kỹ sư dễ dàng can thiệp, chỉnh sửa hướng đi ở từng bước nhỏ.
[EXP]
Việc phân rã bài toán (Decomposition) thông qua Iterative Prompting giúp duy trì tính chính xác của kiến trúc và giữ AI không bị lạc lối.
[C]
Giúp máy chủ của công ty vận hành nhanh hơn.
[EXP]
Máy chủ công ty không liên quan đến cách bạn chia nhỏ Prompt trên Chat AI.
[D]
Giúp giao diện chat trông đẹp mắt hơn.
[EXP]
Sự thẩm mỹ của khung chat không phải mục đích của tư duy Prompt kỹ thuật.

@correct: B
@difficulty: 6
@category: 0

## Q20

Giải pháp tối ưu nhất khi đối mặt với một tài liệu đặc tả (SRS) dài 500 trang vượt quá Cửa sổ Ngữ cảnh (Context Window) của LLM là gì?

[A]
Đổi sang một AI khác có trí thông minh kém hơn nhưng miễn phí.
[EXP]
Dùng AI kém hơn không giải quyết được rào cản độ dài tài liệu.
[B]
Chia nhỏ file 500 trang thành 50 phần, gửi liên tục vào một luồng chat và bắt AI phải nhớ.
[EXP]
AI có bộ nhớ ngắn hạn, nạp phần 50 nó sẽ "quên" mất thông tin của phần 1.
[C]
Dùng kỹ thuật "Lọc ngữ cảnh": Kỹ sư tự đọc mục lục, khoanh vùng chính xác 10 trang liên quan trực tiếp đến hàm cần viết và chỉ truyền 10 trang đó vào Prompt làm Context.
[EXP]
Cung cấp đúng và đủ Context mới là tư duy sắc bén. Việc ném toàn bộ 500 trang vào AI là hành vi lười biếng và gây nhiễu thông tin (Noise).
[D]
Bỏ cuộc và tự ngồi code không cần AI nữa.
[EXP]
Không ứng biến được với giới hạn công cụ sẽ làm giảm năng suất cá nhân.

@correct: C
@difficulty: 6
@category: 0

## Q21

Kỹ thuật "Chain-of-thought" (CoT) Prompting yêu cầu mô hình AI phải làm gì trước khi xuất ra kết quả cuối cùng?

[A]
Trình bày rõ các bước suy luận trung gian ra văn bản.
[EXP]
Bản chất của CoT là ép AI bóc tách bài toán, tư duy tuần tự bằng cách viết lời giải chi tiết ra màn hình trước khi ra đáp số.
[B]
Tự động tìm kiếm mã nguồn trên Github.
[EXP]
Đây là tính năng duyệt web, không phải CoT.
[C]
Hỏi ngược lại người dùng 3 câu hỏi.
[EXP]
Hỏi ngược lại là kỹ thuật "Reverse Prompting", không phải CoT.
[D]
Kết nối trực tiếp vào cơ sở dữ liệu nội bộ.
[EXP]
AI text-based không có chức năng tự động kết nối cơ sở dữ liệu.

@correct: A
@difficulty: 7
@category: 1

## Q22

Vai trò của "Phân tích giả định" (What-if Scenario) trong kỹ thuật Prompt phục vụ thiết kế hệ thống là gì?

[A]
Yêu cầu AI dịch mã nguồn sang một ngôn ngữ khác giả định.
[EXP]
Dịch ngôn ngữ không giúp quản trị rủi ro kiến trúc.
[B]
Đưa ra các tình huống khắc nghiệt (như sập server, tăng tải đột biến) để yêu cầu AI đánh giá khả năng chịu lỗi (Fault-tolerance) của hệ thống trước khi code.
[EXP]
Phân tích What-if là công cụ dự báo rủi ro (Risk Management) và đánh giá độ bền bỉ của giải pháp ở trạng thái cực đoan (Stress test).
[C]
Hỏi AI xem có nên xin nghỉ việc nếu dự án thất bại không.
[EXP]
Đây là câu hỏi giao tiếp cá nhân, không mang tính thiết kế kiến trúc.
[D]
Giả định công ty đang sử dụng một thư viện đã bị xóa bỏ từ lâu.
[EXP]
Giả định dùng công nghệ chết không mang lại lợi ích cho hệ thống tương lai.

@correct: B
@difficulty: 7
@category: 1

## Q23

Trong vòng 2 của quy trình "Cải tiến đầu ra", mục tiêu "Maintainability & Clean Code" yêu cầu bạn thiết kế Prompt tập trung vào khía cạnh nào của đoạn mã?

[A]
Kiểm tra tính hợp lệ của dữ liệu đầu vào (Validation).
[EXP]
Đây là tính Robustness (bền vững) thuộc Vòng 1.
[B]
Bổ sung các thư viện đồ họa để làm đẹp giao diện người dùng.
[EXP]
Giao diện không liên quan trực tiếp đến Clean Code của hệ thống xử lý Backend.
[C]
Cấu trúc lại mã nguồn, tách hàm, bổ sung cơ chế Log (Ghi vết) để đồng nghiệp dễ đọc, dễ bảo trì.
[EXP]
Sự tập trung vào Clean Code và Logging đảm bảo mã nguồn tuân thủ tiêu chuẩn làm việc nhóm và dễ dàng vận hành về sau.
[D]
Ép AI thay đổi kiểu trả về sang ngôn ngữ tiếng Pháp.
[EXP]
Đổi ngôn ngữ không làm tăng chất lượng Clean Code của kiến trúc mã nguồn.

@correct: C
@difficulty: 7
@category: 1

## Q24

Kỹ thuật "Giải thích theo cấp độ hiểu" (Level-based Explanation) đặc biệt phát huy tác dụng cao nhất khi nào?

[A]
Khi bạn muốn AI sửa một lỗi Syntax Error dấu chấm phẩy.
[EXP]
Sửa lỗi cú pháp không cần giải thích đa cấp độ, chỉ cần chỉ ra dòng lỗi.
[B]
Khi bạn bắt gặp một khái niệm thuật ngữ (Jargon) quá hàn lâm và muốn AI "hạ nấc" ngôn ngữ, dùng phép ẩn dụ thực tế để giải nghĩa.
[EXP]
Đây là kỹ thuật bẻ khóa rào cản từ vựng, giúp người học nhanh chóng tiếp thu công nghệ mới thông qua các ví dụ đời thường.
[C]
Khi bạn cần copy đoạn mã đó đưa thẳng vào dự án.
[EXP]
Copy code không đòi hỏi bạn phải yêu cầu AI giải thích lại lý thuyết.
[D]
Khi bạn cần tính toán một bài toán cộng trừ nhân chia cơ bản.
[EXP]
Toán học cơ bản không chứa thuật ngữ hàn lâm để phải phân tầng cấp độ giải thích.

@correct: B
@difficulty: 7
@category: 1

## Q25

Một kỹ sư đang cần thiết kế hệ thống Queue. Prompt nào dưới đây áp dụng đúng kỹ thuật "So sánh và đưa lựa chọn" (Multiple Options & Comparison)?

[A]
Viết cấu hình RabbitMQ cho Spring Boot bằng Java.
[EXP]
Đây là lệnh "Zero-shot", đã tự ý chốt công nghệ RabbitMQ.
[B]
RabbitMQ là gì? Giải thích ngắn gọn trong 3 câu.
[EXP]
Đây chỉ là câu hỏi định nghĩa đơn thuần.
[C]
Hệ thống của tôi cần xử lý tin nhắn bất đồng bộ. Hãy đề xuất 3 công nghệ Message Broker phổ biến (như Kafka, RabbitMQ) và lập bảng so sánh chi tiết về độ trễ, lưu lượng.
[EXP]
Mở ra sự lựa chọn đa dạng và yêu cầu lập bảng so sánh tiêu chí kỹ thuật là đặc trưng cốt lõi của kỹ thuật này.
[D]
Sửa lỗi kết nối RabbitMQ bị Timeout.
[EXP]
Đây là lệnh yêu cầu gỡ lỗi, không phải thiết kế kiến trúc.

@correct: C
@difficulty: 8
@category: 1

## Q26

Đoạn Prompt nào sau đây thể hiện rõ ràng nhất kỹ thuật "Chain-of-thought" (CoT) để giải quyết bài toán thuế thu nhập?

[A]
Tính thuế cho 20 triệu. Kết quả bằng bao nhiêu?
[EXP]
Prompt này quá vắn tắt, buộc AI phải "nhảy cóc" ra kết quả (Zero-shot).
[B]
Đừng tính kết quả vội. Hãy liệt kê 3 bước sau: 1- Tính khoản giảm trừ gia cảnh. 2- Tách thu nhập theo từng bậc lũy tiến. 3- In ra cách tính của từng bậc rồi mới cộng tổng cuối cùng.
[EXP]
Việc buộc AI "Đừng tính vội", cung cấp rạch ròi quy trình bóc tách bài toán và in ra từng bước chính là linh hồn của CoT.
[C]
Viết hàm Java tính thuế TNCN.
[EXP]
Hỏi trực tiếp vào luồng code mà không có phân tích sẽ dễ sinh ra lỗi logic ẩn.
[D]
Thuế TNCN là gì? Có mấy bậc thuế?
[EXP]
Chỉ là câu hỏi kiến thức, không hướng dẫn AI cách suy luận giải quyết vấn đề.

@correct: B
@difficulty: 8
@category: 1

## Q27

Bạn đang yêu cầu AI viết API thêm mới người dùng (Vòng 1). Nhận thấy đoạn code AI sinh ra có thể dính lỗi nếu truyền vào tên là chuỗi rỗng. Đâu là Prompt nâng cấp (Robustness) hợp lý nhất?

[A]
Thêm CSS để làm nút Thêm người dùng đẹp hơn.
[EXP]
API Backend không quan tâm đến CSS của Frontend.
[B]
Tách hàm này ra thành Interface và Implementation riêng biệt.
[EXP]
Động thái này thuộc về Vòng 2 (Clean Code), không giải quyết việc lỗi chuỗi rỗng đầu vào.
[C]
Bổ sung thư viện Hibernate Validator. Thêm annotation `@NotBlank` vào trường tên và ném ngoại lệ lỗi 400 Bad Request nếu vi phạm.
[EXP]
Bổ sung Validation chặt chẽ tại đầu vào chính là cải tiến tính Bền vững (Robustness) bảo vệ hệ thống khỏi rác dữ liệu.
[D]
Gửi email chào mừng sau khi thêm thành công.
[EXP]
Đây là yêu cầu thêm tính năng nghiệp vụ, không bảo vệ hàm khỏi lỗi đầu vào.

@correct: C
@difficulty: 8
@category: 1

## Q28

Sau khi yêu cầu AI giải thích công nghệ `Redis Cache`, bước Prompt tiếp theo (theo nguyên tắc 4 kỹ năng học kỹ thuật) nên là gì để củng cố kiến thức tốt nhất?

[A]
Cảm ơn bạn, tôi đã hiểu.
[EXP]
Kết thúc phiên học quá sớm mà chưa có hành động kiểm chứng thực tiễn.
[B]
Tắt trình duyệt và tự tưởng tượng ra cách code.
[EXP]
Tự tưởng tượng dễ bị sai sót nếu thiếu kiểm chứng.
[C]
Bây giờ, hãy viết một đoạn mã Java ngắn (Spring Boot) minh họa việc lưu trữ và lấy dữ liệu bằng `@Cacheable` để tôi thấy Redis hoạt động thực tế thế nào.
[EXP]
Lý thuyết phải đi kèm với "Ví dụ thực tiễn" (Practical Examples - Code Snippet) thì kỹ sư mới hiểu sâu cách công nghệ được cài cắm.
[D]
Hãy viết lịch sử ra đời của công ty phát triển Redis.
[EXP]
Lịch sử công ty không giúp bạn biết cách lập trình Redis.

@correct: C
@difficulty: 8
@category: 1

## Q29

Sự khác biệt căn bản về "Sự tập trung" (Attention) của mô hình AI khi sử dụng Zero-shot so với Chain-of-thought (CoT) trong một bài toán kiến trúc nhiều điều kiện là gì?

[A]
Zero-shot tập trung vào bảo mật, CoT tập trung vào giao diện.
[EXP]
Cả hai kỹ thuật đều không mặc định tập trung vào giao diện hay bảo mật nếu không được yêu cầu.
[B]
Zero-shot bắt buộc AI phải nhìn nhận mọi điều kiện cùng một lúc để đưa ra đáp số tức thời (dễ quá tải). CoT ép AI dồn toàn bộ trọng số Attention vào từng nhánh logic rẽ nhánh, giải quyết xong bước 1 mới sang bước 2.
[EXP]
Vì LLM tính toán xác suất từ vựng, CoT tạo ra "khoảng đệm" văn bản trên màn hình giúp LLM chia nhỏ sự phức tạp, giảm thiểu cực độ việc bỏ sót điều kiện biên.
[C]
Zero-shot chạy miễn phí, CoT luôn tính phí gấp 10 lần.
[EXP]
CoT tốn nhiều token hơn do sinh nhiều chữ, nhưng không liên quan đến cơ chế Attention của mô hình.
[D]
Zero-shot yêu cầu cung cấp nhiều Context hơn CoT.
[EXP]
Ngược lại, CoT thường là cấu trúc dài hơn và yêu cầu ngữ cảnh/các bước chia nhỏ cụ thể hơn.

@correct: B
@difficulty: 9
@category: 1

## Q30

Một lập trình viên áp dụng kỹ thuật What-if: *"Giả sử hệ thống này bị hack thì làm sao? Viết code chống hack."* Tại sao Prompt phân tích giả định này không mang lại giá trị kiến trúc thực tế?

[A]
Vì ngôn ngữ Java đã tự động chống hack 100%.
[EXP]
Không có hệ thống hay ngôn ngữ nào chống hack 100% tự động cả.
[B]
Vì từ khóa "bị hack" là một từ cấm của công cụ AI.
[EXP]
"Bị hack" không phải từ cấm, AI vẫn trả lời bình thường về chủ đề an toàn thông tin.
[C]
Vì tình huống giả định quá rộng và mơ hồ (Hack qua SQL Injection, XSS, hay DDoS?). Phân tích What-if chuyên nghiệp phải khoanh vùng chính xác vào một "Điểm chết" (Single Point of Failure) kỹ thuật cụ thể.
[EXP]
What-if Scenario chỉ mạnh khi nó dí sát vào một biến cố cụ thể (Ví dụ: "Nếu máy chủ Redis lưu Cache sập thì sao?") để AI tư vấn cơ chế Fallback chính xác.
[D]
Vì kỹ thuật What-if chỉ dùng trong ngành kinh tế, không dùng trong phần mềm.
[EXP]
What-if (Stress testing, Risk Management) là kỹ năng cốt lõi của System Architect.

@correct: C
@difficulty: 9
@category: 1
