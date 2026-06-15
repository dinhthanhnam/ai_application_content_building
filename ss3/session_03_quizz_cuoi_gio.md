# QUIZ CUỐI GIỜ - SESSION 03

## Q1

Bạn đang cần AI viết một hàm Java kiểm tra tính hợp lệ của mật khẩu. Bạn dùng câu lệnh: *"Viết hàm Java kiểm tra mật khẩu hợp lệ"*. Để nâng cấp lên Prompt "Vận dụng tốt", thành phần Ràng buộc (Constraint) nào sau đây nên được thêm vào?

[A]
Hãy đóng vai trò là một Lập trình viên Java Senior.
[EXP]
Đây là thành phần Vai trò (Role), không phải Ràng buộc.
[B]
Đảm bảo mật khẩu phải dài ít nhất 8 ký tự và chỉ sử dụng thư viện chuẩn của Java (java.lang).
[EXP]
Đây chính xác là Ràng buộc, nó khoanh vùng các quy tắc kỹ thuật mà AI bắt buộc phải tuân theo.
[C]
Hàm này sẽ được sử dụng trong một ứng dụng thương mại điện tử lớn.
[EXP]
Đây là thành phần Ngữ cảnh (Context), cung cấp thông tin nền tảng.
[D]
Trả về mã nguồn trong một khối markdown (code block) duy nhất.
[EXP]
Đây là thành phần Định dạng đầu ra (Format).

@correct: B
@difficulty: 10
@category: 1

## Q2

Một sinh viên muốn AI tạo danh sách các lỗi bảo mật web phổ biến. Bạn ấy đã có Vai trò, Mục tiêu và Ngữ cảnh. Thành phần "Định dạng" (Format) nào sau đây phù hợp nhất để xuất báo cáo nhanh?

[A]
Giải thích tường tận lý do của từng lỗi bảo mật một cách dễ hiểu.
[EXP]
Đây là bổ sung cho Mục tiêu (Task), không phải Định dạng.
[B]
Tôi là một sinh viên năm 3 chuyên ngành An toàn thông tin.
[EXP]
Đây là Ngữ cảnh (Context) về người sử dụng.
[C]
Trình bày kết quả dưới dạng bảng, gồm 3 cột: Tên lỗi, Mức độ nghiêm trọng, và Cách phòng chống.
[EXP]
Định dạng bảng giúp dữ liệu được cấu trúc hóa rõ ràng, dễ đọc và so sánh nhất.
[D]
Hãy đóng vai một chuyên gia phân tích hệ thống mã nguồn mở.
[EXP]
Đây là Vai trò (Role).

@correct: C
@difficulty: 10
@category: 1

## Q3

Khi yêu cầu AI giải thích thuật toán thuật toán `Dijkstra`, Prompt nào dưới đây ứng dụng tốt nhất thành phần "Ngữ cảnh" (Context) dành cho người mới học?

[A]
Đóng vai giáo sư Khoa học máy tính, hãy giải thích thuật toán Dijkstra.
[EXP]
Prompt này có Role và Task, nhưng thiếu Context (không rõ đối tượng nghe là ai).
[B]
Hãy giải thích thuật toán Dijkstra sao cho một học sinh cấp 2, chưa từng học qua cấu trúc dữ liệu đồ thị, cũng có thể hiểu được thông qua ví dụ thực tế về bản đồ đường đi.
[EXP]
Việc nêu rõ đối tượng người nhận (học sinh cấp 2, chưa học đồ thị) là Context xuất sắc giúp AI hạ thấp mức độ hàn lâm.
[C]
Hãy giải thích thuật toán Dijkstra bằng một đoạn mã giả (pseudo code) không quá 20 dòng.
[EXP]
Có Format và Constraint, nhưng không có Context về nền tảng người nghe.
[D]
Thuật toán Dijkstra là gì? Liệt kê 5 ứng dụng thực tế của nó trong công nghệ định tuyến.
[EXP]
Prompt này chỉ có Task, thiếu Context hoàn toàn.

@correct: B
@difficulty: 10
@category: 1

## Q4

Bạn yêu cầu AI viết Unit Test cho một hàm tính điểm. AI trả về code nhưng lại dùng phiên bản JUnit 4 cũ. Bước Iterative Prompting (Prompt lặp) nào sau đây là TỐT NHẤT để chỉnh sửa?

[A]
Xóa hoàn toàn đoạn chat, mở một khung chat mới và tự gõ lại toàn bộ lệnh từ đầu.
[EXP]
Khởi tạo lại từ đầu sẽ làm mất bối cảnh (context) đã có, không phản ánh tư duy lặp (Iterative).
[B]
Nhập lệnh: "Code bạn viết sai rồi, hãy viết lại cho đúng".
[EXP]
Lệnh này quá chung chung, AI sẽ không biết nó sai ở đâu để sửa.
[C]
Nhập lệnh: "Cảm ơn, nhưng tôi đang sử dụng JUnit 5. Hãy viết lại các test case trên bằng cú pháp và annotation của JUnit 5."
[EXP]
Xác định chính xác lỗi (JUnit 4) và đưa ra chỉ thị cập nhật (JUnit 5) dựa trên kết quả cũ là cốt lõi của Iterative Prompting.
[D]
Tự chép đoạn code ra IDE và tự sửa các annotation từ JUnit 4 sang JUnit 5 bằng tay.
[EXP]
Tuy sửa được nhưng bạn đã bỏ qua sức mạnh tự động hóa sửa lỗi của AI ở bước này.

@correct: C
@difficulty: 10
@category: 1

## Q5

Để dịch một đoạn tài liệu API kỹ thuật khó hiểu bằng tiếng Anh sang tiếng Việt sao cho dễ đọc nhất, Prompt nào sau đây thể hiện ĐÚNG nguyên lý 5 thành phần?

[A]
Dịch đoạn này sang tiếng Việt: [Nội dung API].
[EXP]
Quá đơn giản, thiếu Role, Context, Format và Constraint.
[B]
Đóng vai Technical Writer, dịch đoạn [Nội dung API] sang tiếng Việt. Trích xuất các tham số ra thành bảng, giữ nguyên tên biến bằng tiếng Anh, văn phong chuyên nghiệp.
[EXP]
Prompt này chứa Role (Technical Writer), Task (Dịch), Format (Bảng), Constraint (Giữ nguyên tên biến, văn phong chuyên nghiệp).
[C]
[Nội dung API] là gì? Dịch giúp tôi và giải thích kỹ.
[EXP]
Chỉ có Task, thiếu các thành phần điều hướng chất lượng bản dịch.
[D]
Bạn là chuyên gia ngôn ngữ. Dịch đoạn [Nội dung API] sang tiếng Việt bằng ngôn ngữ tuổi teen cho vui nhộn.
[EXP]
Văn phong tuổi teen không phù hợp cho tài liệu API kỹ thuật.

@correct: B
@difficulty: 10
@category: 1

## Q6

Bạn cần AI tóm tắt một bài báo dài 20 trang về kiến trúc Microservices thành một dàn ý. Thành phần Ràng buộc (Constraint) nào giúp quá trình đọc của bạn diễn ra nhanh nhất?

[A]
Hãy dùng định dạng danh sách có đánh dấu gạch đầu dòng (bullet points).
[EXP]
Đây là Format, không phải Constraint giới hạn số lượng nội dung.
[B]
Hãy đóng vai trò là một kiến trúc sư hệ thống phần mềm (Software Architect).
[EXP]
Đây là Role, ảnh hưởng đến từ vựng sử dụng, không giới hạn dung lượng tóm tắt.
[C]
Bản tóm tắt không được vượt quá 500 từ và chỉ tập trung vào 3 luận điểm chính.
[EXP]
Ràng buộc chặt chẽ về số từ và số luận điểm ép AI phải chắt lọc thông tin cốt lõi nhất.
[D]
Bài báo này được lấy từ một tạp chí khoa học uy tín xuất bản năm 2024.
[EXP]
Đây là Context, bổ sung thông tin nguồn gốc.

@correct: C
@difficulty: 10
@category: 1

## Q7

Theo nguyên lý "Garbage in, Garbage out", nếu bạn đưa vào Prompt: *"Fix bug trong code này: `int a = b / 0;`"*, AI sẽ trả lời theo xu hướng nào?

[A]
AI sẽ yêu cầu bạn cung cấp quyền truy cập vào toàn bộ thư mục dự án để phân tích kỹ hơn.
[EXP]
AI text-based thông thường không thể tự tiện yêu cầu quyền truy cập thư mục máy tính.
[B]
AI sẽ tự động phát hiện ra các lỗi bảo mật mạng (Network Security) nằm trong dự án của bạn.
[EXP]
Đầu vào chỉ có toán học cơ bản, không có dấu hiệu liên quan đến bảo mật mạng.
[C]
AI sẽ chỉ ra lỗi chia cho 0 (Divide by Zero) và cung cấp khối `try-catch` đơn giản nhất.
[EXP]
Bởi vì đầu vào quá hời hợt và ngắn gọn (Garbage), AI chỉ sửa lỗi trên bề mặt mà không đưa ra giải pháp kiến trúc sâu xa.
[D]
AI sẽ tự động sinh ra một file tài liệu hướng dẫn sử dụng phần mềm dài 10 trang.
[EXP]
AI không tự động làm những nhiệm vụ phức tạp nếu không có chỉ thị (Task).

@correct: C
@difficulty: 10
@category: 1

## Q8

Khi yêu cầu AI sinh mã nguồn cho một đối tượng (Entity) trong Java, thành phần Format (Định dạng) nào sau đây hữu ích nhất nếu bạn không muốn phải copy-paste nhiều lần?

[A]
Chỉ trả về duy nhất đoạn mã Java, không được bao gồm bất kỳ câu chào hỏi hay văn bản giải thích nào.
[EXP]
Định dạng này loại bỏ các "lời văn thừa", giúp bạn click nút Copy một lần là lấy được toàn bộ code sạch.
[B]
Định dạng mã Java dưới dạng một file âm thanh để tôi có thể nghe thuật toán.
[EXP]
Đây là định dạng không thực tế và không khả thi đối với text-to-text AI hiện hành.
[C]
Giải thích từng phương thức sau mỗi dòng code để dễ dàng đối chiếu.
[EXP]
Giải thích xen kẽ làm hỏng cấu trúc file code, gây khó khăn khi copy-paste trực tiếp.
[D]
Sử dụng in đậm (bold) và in nghiêng (italic) cho các từ khóa như public, private.
[EXP]
Text định dạng in đậm không hợp lệ khi dán vào trình soạn thảo mã nguồn IDE.

@correct: A
@difficulty: 10
@category: 1

## Q9

Bạn muốn AI viết một đoạn script Python chuyển đổi ảnh. Khi kết quả đầu tiên của AI thiếu thư viện cần thiết, kỹ thuật Iterative Prompting yêu cầu bạn phải làm gì tiếp theo?

[A]
Cung cấp lại toàn bộ nội dung file hình ảnh gốc để AI phân tích.
[EXP]
Gửi nội dung hình ảnh không khắc phục được lỗi thiếu tên thư viện trong mã.
[B]
Gửi lại mã thông báo lỗi từ Terminal vào khung chat: *"Khi chạy, hệ thống báo lỗi ModuleNotFoundError: No module named 'Pillow'. Hãy cập nhật lại mã."*
[EXP]
Cung cấp thông báo lỗi chính xác giúp AI hiểu nó bị thiếu thư viện gì và tự động sửa mã `import`.
[C]
Click nút "Regenerate" (Tạo lại) 5 lần cho đến khi AI tự động nhận ra lỗi của nó.
[EXP]
Nút Regenerate tạo lại cùng một ngữ cảnh, xác suất AI sửa đúng lỗi thiếu thư viện là rất thấp nếu không có input mới.
[D]
Tìm kiếm thủ công trên StackOverflow rồi tự thêm hàm thư viện vào.
[EXP]
Bạn đang từ bỏ việc tận dụng khả năng tự sửa lỗi của mô hình ngôn ngữ thông qua vòng lặp giao tiếp.

@correct: B
@difficulty: 10
@category: 1

## Q10

Để tối ưu hóa việc học lập trình thông qua giải thích thuật ngữ, Prompt nào kết hợp Vai trò (Role) và Ràng buộc (Constraint) hiệu quả nhất?

[A]
Bạn là một kỹ sư phần mềm. Hãy giải thích API là gì và không được dùng quá 2 từ chuyên ngành chưa giải thích.
[EXP]
Kết hợp Role "Kỹ sư" và Constraint "Giới hạn từ chuyên ngành", ép AI tạo ra câu trả lời vừa chuyên môn vừa cực kỳ thân thiện với người mới.
[B]
Giải thích API là gì? Viết một đoạn văn thật dài và sinh động.
[EXP]
Prompt này có Task và Format (dài, sinh động), nhưng thiếu Vai trò và Ràng buộc cụ thể.
[C]
Đóng vai giáo viên, hãy giải thích API là gì.
[EXP]
Có Role và Task, nhưng không có Constraint giới hạn mức độ phức tạp.
[D]
Tôi không hiểu API là gì, hãy đưa ra một ví dụ bằng ngôn ngữ lập trình C#.
[EXP]
Có Context (tôi không hiểu) và Constraint/Format (bằng C#), nhưng thiếu Vai trò định hướng.

@correct: A
@difficulty: 10
@category: 1

## Q11

Bạn cần AI chuyển một tệp mã nguồn từ Javascript sang Java. Để đảm bảo tính Steerability (Khả năng điều hướng), thành phần nào là sống còn?

[A]
Khen ngợi AI trước khi đưa ra câu lệnh chuyển đổi.
[EXP]
Sự lịch sự không tác động đến Steerability bằng các chỉ thị logic và kỹ thuật.
[B]
Yêu cầu AI mô tả lại lịch sử hình thành của ngôn ngữ Java trước khi làm bài.
[EXP]
Thông tin lịch sử là thừa thãi, làm loãng ngữ cảnh của công việc chuyển đổi mã nguồn.
[C]
Ràng buộc cứng: *"Bắt buộc giữ nguyên tên biến, cấu trúc hàm và không thêm bất kỳ logic nào mới."*
[EXP]
Lệnh điều hướng mạnh mẽ này giúp ngăn AI bị "ảo giác" tự ý thêm thắt các tính năng không có trong mã Javascript gốc.
[D]
Yêu cầu AI viết bằng font chữ Times New Roman.
[EXP]
Font chữ chỉ là định dạng hiển thị, không tác động đến kết quả phân tích cấu trúc mã nguồn.

@correct: C
@difficulty: 10
@category: 1

## Q12

Khi sử dụng AI để Code Review (đánh giá mã nguồn), thành phần Context (Ngữ cảnh) nào sau đây đóng vai trò quyết định độ chính xác của phản hồi?

[A]
Tên đầy đủ của tác giả đoạn mã và số năm kinh nghiệm của người đó.
[EXP]
AI đánh giá logic của mã, không quan tâm đến tiểu sử cá nhân của lập trình viên.
[B]
Chi tiết về chuẩn Coding Convention của dự án và phiên bản ngôn ngữ đang sử dụng (ví dụ: Java 17).
[EXP]
Ngữ cảnh về chuẩn mực và phiên bản giúp AI đối chiếu chính xác đoạn mã với luật lệ của dự án.
[C]
Ngày giờ cụ thể mà đoạn mã này được viết ra.
[EXP]
Thời gian viết mã không tác động đến việc đoạn mã đó có chạy đúng logic hay không.
[D]
Màu sắc giao diện (Theme) của IDE mà lập trình viên đang sử dụng.
[EXP]
Màu sắc IDE không ảnh hưởng gì đến luồng thực thi của đoạn mã bên trong đó.

@correct: B
@difficulty: 10
@category: 1

## Q13

Một sinh viên sử dụng Prompt: *"Viết phần mềm quản lý thư viện"*. AI trả về một cấu trúc khổng lồ với 20 file Class khác nhau dù sinh viên chỉ cần 2 Class cơ bản. Theo khái niệm "Prompt Engineering", nguyên nhân do đâu?

[A]
Do mô hình AI bị lỗi cấu trúc dữ liệu bên trong.
[EXP]
AI hoạt động hoàn toàn bình thường khi nó cố gắng bao quát mọi khía cạnh của từ khóa "phần mềm".
[B]
Do sinh viên không giới hạn "Phạm vi tác vụ" (Scope) và thiếu Ràng buộc (Constraint).
[EXP]
Khi thiếu Constraint "Chỉ viết 2 Class: Book và Member", AI sẽ sử dụng không gian mở tối đa, tự vẽ ra toàn bộ hệ thống.
[C]
Do sinh viên không mua gói tài khoản cao cấp (Premium) của công cụ AI.
[EXP]
Gói cao cấp có mô hình thông minh hơn, nhưng vẫn sinh ra 20 file nếu Prompt không đưa ra sự giới hạn.
[D]
Do sinh viên dùng sai ngôn ngữ Tiếng Việt thay vì Tiếng Anh.
[EXP]
AI hiện nay xử lý tốt tiếng Việt, ngôn ngữ không phải nguyên nhân tạo ra sự dư thừa cấu trúc.

@correct: B
@difficulty: 11
@category: 1

## Q14

Bạn viết Prompt: *"Liệt kê 5 từ khóa về AI. Định dạng: Danh sách JSON"*. Nhưng AI lại trả về: *"Chào bạn, đây là 5 từ khóa: [Danh sách JSON]. Hy vọng nó hữu ích"*. Tại sao AI vẫn sinh ra văn bản thừa (greeting text)?

[A]
Vì AI được lập trình cứng (hard-coded) là luôn phải chào hỏi người dùng.
[EXP]
Không có lập trình cứng nào bắt buộc AI phải chào hỏi nếu bạn ép nó bằng Ràng buộc mạnh.
[B]
Vì bạn đã thiếu một Ràng buộc (Constraint) phủ định cực đoan (Negative Prompt).
[EXP]
Để tắt văn bản thừa, bạn cần thêm Ràng buộc phủ định: "Chỉ trả về JSON thuần, KHÔNG kèm giải thích, KHÔNG chào hỏi."
[C]
Vì định dạng JSON không hỗ trợ chứa 5 từ khóa.
[EXP]
JSON chứa được mảng dữ liệu với số lượng từ khóa không giới hạn.
[D]
Vì từ "AI" trong Prompt của bạn viết hoa chưa chuẩn xác.
[EXP]
Việc viết hoa không ảnh hưởng đến quyết định sinh thêm văn bản giao tiếp của AI.

@correct: B
@difficulty: 11
@category: 1

## Q15

Sự khác biệt rõ rệt nhất về đầu ra khi cung cấp Role (Vai trò) *"Bạn là một chuyên gia về bảo mật mạng"* so với việc không cung cấp Role là gì?

[A]
AI sẽ tự động quét virus trên máy tính cá nhân của người dùng.
[EXP]
AI trên Web Chat không có quyền thực thi hệ thống quét virus trên máy khách.
[B]
AI sẽ yêu cầu người dùng nhập mật khẩu quản trị mạng để xác thực.
[EXP]
AI không thực hiện các thủ tục xác thực danh tính như phần mềm cục bộ.
[C]
AI sẽ điều hướng việc lựa chọn từ vựng, thuật ngữ (jargon) và góc nhìn đánh giá chuyên sâu hơn vào khía cạnh lỗ hổng bảo mật.
[EXP]
Role thiết lập "màng lọc tư duy", khiến AI loại bỏ các kiến thức lập trình cơ bản và chỉ tập trung vào phân tích rủi ro bảo mật hệ thống.
[D]
AI sẽ trả lời bằng giọng điệu thô lỗ và ra lệnh cho người dùng.
[EXP]
Chuyên gia bảo mật mang tính chuyên môn, không đồng nghĩa với thái độ thô lỗ.

@correct: C
@difficulty: 11
@category: 1

## Q16

Khi thực hiện "Iterative Prompting" (Prompt lặp), dấu hiệu nào cho thấy bạn đang rơi vào vòng lặp vô ích (vòng luẩn quẩn) với AI?

[A]
AI đề xuất một đoạn mã hoàn toàn mới nhưng tối ưu hơn cách cũ.
[EXP]
Đây là kết quả tốt của việc lặp lại, không phải vòng lặp vô ích.
[B]
Bạn và AI liên tục lặp lại các lệnh và lỗi giống hệt nhau ở mỗi lượt phản hồi mà mã vẫn không chạy được.
[EXP]
Khi AI lặp lại lỗi cũ, có nghĩa là ngữ cảnh (Context) hiện tại đã bị sai hoặc bạn không đưa ra Ràng buộc mới để phá vỡ bế tắc.
[C]
AI xin lỗi bạn vì đã sinh mã sai ở lần trả lời trước.
[EXP]
Đây là hành vi giao tiếp bình thường của LLM khi bạn chỉ ra lỗi sai.
[D]
Bạn phải cung cấp thêm tài liệu hướng dẫn mới cho AI đọc.
[EXP]
Cung cấp thông tin mới là hành động phá vỡ vòng lặp luẩn quẩn, rất cần thiết.

@correct: B
@difficulty: 11
@category: 1

## Q17

Một đồng nghiệp viết Prompt để gỡ lỗi: *"Đoạn code này bị lỗi Null Pointer: `System.out.println(user.getName());`. Sửa đi."* Đứng ở góc độ cấu trúc, tại sao Prompt này không hiệu quả?

[A]
Vì ngôn ngữ Java không hỗ trợ in ra màn hình bằng lệnh `System.out.println`.
[EXP]
Lệnh in ra màn hình của Java hoàn toàn chính xác.
[B]
Vì thiếu thành phần Ngữ cảnh (Context) về nơi khởi tạo biến `user` và cách dữ liệu được truyền vào.
[EXP]
Nếu không có Context biết `user` đến từ Database hay API, AI chỉ có thể thêm lệnh check `if (user != null)`, chữa ngọn chứ không chữa gốc rễ.
[C]
Vì thiếu thành phần Định dạng (Format) buộc AI trả về JSON.
[EXP]
Việc sửa lỗi code thường không bắt buộc phải trả về JSON trừ khi gọi qua API.
[D]
Vì đồng nghiệp đã quên nói từ "Làm ơn" (Please) với AI.
[EXP]
Tính lịch sự không tác động đến độ chính xác của logic sửa lỗi.

@correct: B
@difficulty: 11
@category: 1

## Q18

Khi yêu cầu AI "Tóm tắt tài liệu này", kết quả trả về thường bị mất các điểm kiến thức kỹ thuật quan trọng. Nguyên nhân phân tích theo Steerability là gì?

[A]
Do AI luôn mặc định coi thông tin kỹ thuật là thông tin rác.
[EXP]
AI đánh giá cao thông tin kỹ thuật, nhưng bị giới hạn bởi từ khóa "tóm tắt".
[B]
Từ khóa "Tóm tắt" (Summarize) thiếu sự điều hướng tập trung, khiến AI dùng thuật toán cắt gọt thông tin phân bổ đều đặn.
[EXP]
Bản chất tóm tắt là lược bỏ chi tiết, nếu thiếu Ràng buộc (ví dụ: "Giữ lại toàn bộ thuật ngữ chuyên ngành"), Steerability sẽ điều hướng AI xóa bỏ các định nghĩa khó.
[C]
Do tài liệu kỹ thuật sử dụng hệ mã hóa mà AI chưa từng được học qua.
[EXP]
Nếu AI đọc được chữ thì nó hiểu được, vấn đề nằm ở lệnh điều khiển đầu ra.
[D]
Do giới hạn bộ nhớ RAM của máy tính lập trình viên quá yếu.
[EXP]
Việc tóm tắt xử lý trên máy chủ AI, không phụ thuộc vào RAM máy trạm.

@correct: B
@difficulty: 11
@category: 1

## Q19

Bạn cấu hình một Prompt có chứa hai Ràng buộc: "Viết bằng Python 3" và "Sử dụng hàm console.log() để in ra kết quả". Dự đoán hành vi của AI trong trường hợp này?

[A]
AI sẽ tự động xóa máy tính của bạn do phát hiện mâu thuẫn.
[EXP]
AI không có quyền và không bao giờ phá hoại máy tính người dùng vì một lỗi logic văn bản.
[B]
AI sẽ bị kẹt trong vòng lặp vô tận và không bao giờ phản hồi.
[EXP]
Mô hình sẽ cố gắng tìm ra một giải pháp thỏa hiệp hoặc tự ý sửa lỗi mâu thuẫn để sinh ra phản hồi.
[C]
AI sẽ chỉ ra sự mâu thuẫn giữa ngôn ngữ (Python dùng print) và cú pháp (JS dùng console.log) trước khi lựa chọn một giải pháp.
[EXP]
Các mô hình AI tiên tiến có khả năng nhận diện mâu thuẫn trong Constraint và sẽ giải thích lý do nó tự thay đổi một trong hai yêu cầu.
[D]
AI sẽ tạo ra một ngôn ngữ lập trình hoàn toàn mới kết hợp giữa Python và Javascript.
[EXP]
AI tập trung giải quyết bài toán thực tế dựa trên ngôn ngữ đã biết chứ không sáng tạo ra Compiler mới.

@correct: C
@difficulty: 11
@category: 1

## Q20

Xem xét Prompt: *"Bạn là Senior Dev. Tôi có mảng A=[1,2,3]. Viết hàm đảo ngược mảng. Trả về dưới dạng Code Block."* Prompt này thiếu thành phần cốt lõi nào khiến kết quả có thể không tối ưu?

[A]
Thiếu Vai trò (Role).
[EXP]
Đã có Vai trò: "Senior Dev".
[B]
Thiếu Định dạng (Format).
[EXP]
Đã có Định dạng: "Code Block".
[C]
Thiếu Mục tiêu tác vụ (Task).
[EXP]
Đã có Mục tiêu: "Viết hàm đảo ngược mảng".
[D]
Thiếu Ràng buộc (Constraint) về hiệu năng hoặc phương pháp thuật toán.
[EXP]
Vì thiếu Ràng buộc về chi phí thời gian (Time Complexity) hay bộ nhớ (Space Complexity), AI có thể sử dụng hàm có sẵn thay vì tự viết thuật toán tối ưu con trỏ (Two Pointers).

@correct: D
@difficulty: 11
@category: 1

## Q21

Vì sao khi bạn viết một Prompt quá dài dòng, nhồi nhét quá nhiều câu chuyện phụ lề (như việc bạn đang mệt mỏi, sếp đang hối thúc), tính Steerability (Khả năng điều hướng) lại bị giảm sút mạnh?

[A]
Vì AI có bộ đếm cảm xúc, nó sẽ trả lời bạn bằng các câu khuyên giải thay vì viết mã nguồn.
[EXP]
AI không có cảm xúc, nhưng nó bị phân tán sự chú ý (Attention Mechanism) vào các từ khóa không liên quan đến logic, dẫn đến sinh code sai mục tiêu kỹ thuật.
[B]
Vì câu dài sẽ vượt quá giới hạn băng thông internet cục bộ của bạn.
[EXP]
Băng thông mạng thừa sức tải các văn bản dài hàng triệu ký tự.
[C]
Vì AI sẽ bị tính phí phạt ký tự thừa do các nhà cung cấp nền tảng áp đặt.
[EXP]
Chi phí (token) là việc của tài khoản, không liên quan đến việc khả năng điều hướng bị giảm.
[D]
Vì máy chủ AI sẽ tự động từ chối đọc những câu chứa từ "sếp" hoặc "mệt mỏi".
[EXP]
Các từ này không vi phạm chính sách nội dung (Safety Policy) nên AI vẫn sẽ đọc bình thường.

@correct: A
@difficulty: 11
@category: 1

## Q22

Trong một Prompt phân tích, bạn đưa Context (Ngữ cảnh) sai sự thật: *"Biết rằng ngôn ngữ Java không hỗ trợ hướng đối tượng"*. Phân tích nguyên nhân AI có thể bắt đầu sinh ra kết quả "Ảo giác" hùa theo nhận định này.

[A]
Mô hình AI bị thiết lập cứng là luôn phải chống lại nhận định của người dùng.
[EXP]
Thực tế AI thường có xu hướng phục tùng nhận định của người dùng (Sycophancy).
[B]
Bản chất của AI là học xác suất, khi bạn cài cắm một ngữ cảnh sai làm tiền đề, thuật toán sẽ bị bẻ lái để tối ưu hóa sự đồng thuận với tiền đề đó.
[EXP]
Đây là hiện tượng "Bợ đỡ người dùng" (Sycophancy) trong LLM. Bạn tiêm nhiễm giả định sai, LLM sẽ cố gắng giải thích hợp lý hóa cái sai đó.
[C]
Do AI tự tìm kiếm tài liệu trên Google và thấy một bài báo mạo danh Java.
[EXP]
AI ưu tiên Ngữ cảnh cục bộ bạn truyền vào trong Prompt hơn là dữ liệu huấn luyện hoặc kết quả tìm kiếm web chung chung.
[D]
Vì ngôn ngữ Java thực sự không phải là ngôn ngữ hướng đối tượng.
[EXP]
Java là một trong những ngôn ngữ hướng đối tượng phổ biến nhất thế giới.

@correct: B
@difficulty: 11
@category: 1

## Q23

Để xây dựng cấu trúc thư mục tối ưu cho một dự án web Backend hoàn toàn mới, chiến lược Iterative Prompting "Best Practice" (Thực hành tốt nhất) nào nên được áp dụng?

[A]
Lệnh 1: "Cho tôi xin cấu trúc thư mục chuẩn". Lệnh 2: "Viết toàn bộ file code cho tôi".
[EXP]
Cách này quá vội vã, thiếu các bước thảo luận kiến trúc, công nghệ và phân tích nghiệp vụ.
[B]
Lệnh 1: Đóng vai Tech Lead, phân tích yêu cầu hệ thống. Lệnh 2: Đề xuất cấu trúc thư mục dựa trên phân tích đó. Lệnh 3: Viết từng file dựa trên cấu trúc đã chốt.
[EXP]
Phân rã bài toán lớn thành các bước từ vĩ mô (phân tích) đến cấu trúc (thư mục) rồi mới đến vi mô (code từng file) là đỉnh cao của Prompt định hướng kiến trúc.
[C]
Mở 3 khung chat khác nhau, mỗi khung hỏi một file rồi tự ghép lại.
[EXP]
Mở nhiều khung chat làm vỡ Ngữ cảnh liên kết (Context), các file sẽ không gọi được nhau.
[D]
Nhập 1 câu lệnh duy nhất dài 5000 chữ yêu cầu AI tự làm hết mọi thứ từ A-Z mà không cần hỏi lại.
[EXP]
Đây không phải là Iterative (Lặp), rủi ro ảo giác (Hallucination) là cực cao đối với bài toán hệ thống.

@correct: B
@difficulty: 6
@category: 1

## Q24

Bạn muốn tạo ra một "Mega-Prompt" (Prompt khổng lồ) để tự động hóa việc chấm điểm code của sinh viên. Sự kết hợp thành phần nào sau đây thể hiện tư duy SÁNG TẠO và KIỂM SOÁT hệ thống tốt nhất?

[A]
Role: Giảng viên. Task: Chấm điểm. Context: Bài của sinh viên.
[EXP]
Chỉ có 3 thành phần này không đủ để tạo ra một hệ thống tự động hóa ổn định đầu ra.
[B]
Role: Senior Reviewer. Task: Chấm lỗi và cho điểm từ 1-10. Constraint: Chỉ trừ điểm nếu sai nguyên lý SOLID. Format: Trả về JSON chứa {"score": x, "reason": y}.
[EXP]
Việc đóng gói Role, Task kết hợp Constraint rạch ròi và Format JSON nghiêm ngặt giúp đầu ra dễ dàng tích hợp vào một phần mềm chấm điểm tự động.
[C]
Role: Máy chấm điểm. Task: Chạy thử đoạn code này xem có lỗi không. Format: Báo Pass/Fail.
[EXP]
Prompt này quá đơn giản, bỏ qua yếu tố chấm điểm kiến trúc và lý do trừ điểm.
[D]
Task: Tự động tải file từ máy tính của sinh viên và báo lỗi cú pháp.
[EXP]
LLM text-based không có tính năng chủ động tải file qua mạng trực tiếp bằng Prompt như vậy.

@correct: B
@difficulty: 6
@category: 1

## Q25

Trong công ty bạn có một thư viện nội bộ mã nguồn đóng (Closed-source) tên là `AcmeLib`. AI liên tục báo lỗi *"Không biết AcmeLib là gì"* hoặc tự bịa ra các hàm giả. Chiến thuật SÁNG TẠO nào khắc phục triệt để vấn đề này?

[A]
Chụp ảnh màn hình thư viện và đăng công khai lên mạng xã hội để AI tự học.
[EXP]
Hành vi này vi phạm bảo mật và làm lộ tài sản độc quyền của công ty.
[B]
Truyền toàn bộ tài liệu đặc tả API và mã nguồn cốt lõi của `AcmeLib` vào Context của Prompt làm tài liệu tham chiếu tĩnh (Few-shot prompting).
[EXP]
Việc nhúng trực tiếp kiến thức nội bộ vào Context (hay gọi là kỹ thuật RAG thu nhỏ) giúp AI tạm thời "học" được thư viện đóng mà không cần huấn luyện lại.
[C]
Dừng dùng AI và yêu cầu công ty chuyển sang thư viện mã nguồn mở.
[EXP]
Bỏ qua công cụ AI nội bộ chỉ vì không biết cách truyền Context là một giải pháp thụt lùi về công nghệ.
[D]
Cài đặt một bộ đếm giờ, hỏi AI liên tục mỗi 5 phút cho đến khi máy chủ tự đồng bộ dữ liệu.
[EXP]
Máy chủ AI không tự động cập nhật thư viện riêng tư của bạn dù bạn có hỏi hàng nghìn lần.

@correct: B
@difficulty: 6
@category: 1

## Q26

Đội nhóm của bạn thường xuyên phải viết tài liệu Release Note (Ghi chú phát hành phiên bản mới). Để mọi thành viên đều có kết quả giống nhau khi dùng AI, bạn nên thiết kế giải pháp nào?

[A]
Yêu cầu mọi người dùng chung 1 tài khoản ChatGPT duy nhất.
[EXP]
Dùng chung tài khoản gây rối loạn lịch sử đoạn chat và không bảo mật.
[B]
Xây dựng một "Prompt Template" có chứa sẵn Role, Format, Constraint cứng; chỉ để trống phần Context cho mọi người tự điền tính năng mới.
[EXP]
Tạo Template (khung mẫu) là phương pháp chuẩn hóa hệ thống (Systematization), đảm bảo đầu ra AI luôn nhất quán bất kể ai là người điền nội dung.
[C]
Không dùng AI nữa, cử ra 1 người duy nhất chuyên viết bằng tay để đảm bảo tính đồng nhất.
[EXP]
Đây là hành vi đi lùi về năng suất công việc, không giải quyết bài toán bằng công nghệ.
[D]
Tạo một kịch bản macro tự động gõ bàn phím trên máy tính của mọi người.
[EXP]
Macro gõ phím quá thủ công, dễ gãy khi giao diện trình duyệt web bị thay đổi.

@correct: B
@difficulty: 6
@category: 1

## Q27

Bạn được giao nhiệm vụ viết Prompt tạo mã cho hệ thống tài chính, yêu cầu 100% không sử dụng hàm `Date()` cũ kỹ của Javascript. Lựa chọn thiết kế Prompt nào mang tính RÀNG BUỘC mạnh mẽ và an toàn nhất?

[A]
Hãy viết mã xử lý thời gian nhưng tốt nhất là đừng dùng hàm Date nhé.
[EXP]
Từ ngữ "tốt nhất là đừng" thể hiện sự yếu ớt trong tính điều hướng (Steerability), AI vẫn có thể dùng.
[B]
Tôi cần mã xử lý thời gian. (Không đề cập gì đến thư viện để AI tự do suy nghĩ).
[EXP]
Nếu không cấm, AI có xu hướng mặc định dùng hàm cơ bản nhất là Date() vì nó phổ biến trong tập huấn luyện.
[C]
Constraint cực đoan (Negative Prompt): TUYỆT ĐỐI KHÔNG sử dụng đối tượng `Date()`. Nếu xử lý thời gian, BẮT BUỘC sử dụng thư viện `date-fns` hoặc API `Intl`.
[EXP]
Việc kết hợp cấm đoán tuyệt đối (Negative Prompt) và định hướng rõ lối thoát (đề xuất thư viện thay thế) là kỹ năng kiểm soát AI bậc thầy.
[D]
Hãy dùng hàm Date() nhưng thêm comment giải thích tại sao nó cũ kỹ.
[EXP]
Prompt này vi phạm trực tiếp yêu cầu nghiệp vụ là không được sử dụng thư viện cũ.

@correct: C
@difficulty: 6
@category: 1

## Q28

Để AI vừa tự động phát hiện lỗi logic trong mã nguồn, vừa sinh ra Unit Test chứng minh lỗi đó, thiết kế Prompt nào dưới đây là thông minh và tối ưu nhất?

[A]
Role: QA Engineer. Task: Hãy làm hai việc. Một là tìm lỗi, hai là viết Unit Test.
[EXP]
Lệnh này quá tóm tắt, thiếu định dạng liên kết giữa lỗi và test case.
[B]
Role: Software Architect. Task 1: Rà soát mã nguồn. Nếu tìm thấy lỗi logic, hãy viết một Unit Test (chuẩn xUnit) cố ý truyền dữ liệu làm hàm thất bại (Fail) để chứng minh lỗi đó có tồn tại.
[EXP]
Việc yêu cầu viết Test Case để chứng minh lỗi (Fail-first Test) là tư duy Test-Driven Development (TDD) xuất sắc khi điều khiển AI.
[C]
Task: Tự động chạy Unit Test trên máy chủ đám mây và gửi báo cáo lỗi về email của tôi.
[EXP]
LLM đơn thuần không có khả năng thực thi lệnh điều khiển mạng và gửi email nội bộ như vậy.
[D]
Hãy báo cáo xem đoạn mã có lỗi không, nếu có lỗi thì sửa luôn đi, không cần viết test làm gì cho tốn thời gian.
[EXP]
Sửa mã không có Unit Test đi kèm sẽ sinh ra nợ kỹ thuật và không có căn cứ chứng minh độ an toàn.

@correct: B
@difficulty: 6
@category: 1

## Q29

Khi bạn phải đối mặt với một tài liệu API dài 200 trang vượt quá "Cửa sổ Ngữ cảnh" (Context Window) của công cụ AI hiện tại, chiến lược SÁNG TẠO nào giúp giải quyết vấn đề?

[A]
Ép văn bản thành một file nén (.zip) rồi tải lên để lừa AI vượt giới hạn.
[EXP]
AI đọc chữ bên trong file, khi giải nén ra vẫn vượt giới hạn token và bị cắt cụt.
[B]
Sao chép liên tục từng đoạn ngắn gửi vào chat, buộc AI phải nhớ toàn bộ 200 trang.
[EXP]
Mô hình AI chỉ có bộ nhớ ngữ cảnh ngắn hạn, gửi đoạn mới sẽ làm nó "quên" đoạn cũ ở đầu trang.
[C]
Áp dụng kỹ thuật "Divide and Conquer" (Chia để trị): Tự tóm tắt cấu trúc mục lục trước, xác định chính xác phần tính năng cần làm, và chỉ cung cấp duy nhất 5 trang tài liệu liên quan đến tính năng đó vào Prompt.
[EXP]
Đây là nghệ thuật chắt lọc Ngữ cảnh (Context Filtering). Chỉ đưa cho AI thứ nó thực sự cần để giải bài toán, loại bỏ rác thông tin.
[D]
Từ bỏ việc dùng AI và tự ngồi đọc tài liệu 200 trang trong 3 tuần.
[EXP]
Phủ nhận sức mạnh công cụ do không biết cách thao tác chia nhỏ vấn đề là một sự lãng phí tài nguyên.

@correct: C
@difficulty: 6
@category: 1

## Q30

Để dùng AI học nhanh ngôn ngữ lập trình Rust từ một người chỉ biết Java, luồng (Workflow) giao tiếp nào chứng tỏ người kỹ sư nắm vững bản chất của Prompt Engineering?

[A]
"Xin chào, hãy dạy tôi lập trình Rust từ cơ bản đến nâng cao. Hãy xuất ra mọi bài học."
[EXP]
Bài toán quá lớn, AI sẽ sinh ra một dàn ý khổng lồ nhưng chung chung và khó tiêu hóa.
[B]
"Cho tôi mượn bộ code Rust hoàn chỉnh của một dự án giống Shopee."
[EXP]
Sao chép một bộ code đồ sộ bằng ngôn ngữ lạ sẽ làm người học bị ngợp và không hiểu cấu trúc.
[C]
Role: Rust Expert. Context: Tôi là Senior Java Developer. Task: Hãy lập bảng so sánh ánh xạ 1-1 các khái niệm (như OOP, Class trong Java tương đương với gì trong Rust). Sau đó cung cấp bài tập ngắn rèn luyện trí nhớ cơ bắp.
[EXP]
Tận dụng Context (nền tảng Java sẵn có) để AI tạo ra lộ trình "Chuyển giao kiến thức" (Knowledge Transfer) thay vì học lại khái niệm lập trình cơ bản từ con số 0.
[D]
"Tạo một khóa học video hướng dẫn Rust chất lượng 4K."
[EXP]
Công cụ AI văn bản (Text-based LLM) không thể tự quay hay kết xuất ra video clip bài giảng 4K.

@correct: C
@difficulty: 6
@category: 1
