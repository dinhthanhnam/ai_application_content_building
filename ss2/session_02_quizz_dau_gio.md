# QUIZ ĐẦU GIỜ - SESSION 02

## Q1

Trong quy trình phát triển phần mềm truyền thống, việc viết tài liệu kỹ thuật (documentation) thường tốn nhiều thời gian. Theo bạn, đâu là cách ứng dụng AI hợp lý nhất để tăng tốc độ quá trình này mà vẫn đảm bảo độ chính xác cho một dự án sử dụng Java?

[A]
Sao chép toàn bộ mã nguồn của dự án dán lên một công cụ AI trên Web và yêu cầu sinh tệp README tổng hợp.
[EXP]
Cách này cực kỳ rủi ro về mặt bảo mật và dễ thất bại do công cụ Web bị giới hạn ngữ cảnh (Token limit) đối với mã nguồn dài.
[B]
Sử dụng công cụ Code Assistant được tích hợp sẵn trong IDE để tự động sinh docstring cho từng hàm dựa trên ngữ cảnh file đang mở.
[EXP]
Chính xác. Các công cụ Inline Assistant có khả năng đọc hiểu ngữ cảnh (Context-aware), bảo mật cao và tối ưu trực tiếp cho quy trình lập trình hằng ngày.
[C]
Bỏ qua bước dùng AI và phân công một lập trình viên nội bộ tự đọc code để viết tài liệu thủ công.
[EXP]
Cách này không phải là việc vận dụng sức mạnh của AI để tối ưu hóa năng suất dự án.
[D]
Yêu cầu AI tự động đoán cấu trúc của cơ sở dữ liệu để viết tài liệu mà không cần cung cấp mô hình bảng.
[EXP]
Việc yêu cầu AI "đoán mò" mà thiếu dữ liệu đầu vào sẽ dẫn đến hiện tượng Ảo giác (Hallucination), sinh ra tài liệu sai lệch hoàn toàn.

@correct: B
@difficulty: 4
@category: 0

## Q2

Một kỹ sư đang gặp lỗi biên dịch `NullPointerException` trong quá trình khởi chạy dự án Java. Đâu là cách vận dụng công cụ AI một cách an toàn và tối ưu nhất để sửa lỗi này?

[A]
Sao chép toàn bộ 1000 dòng mã của lớp đối tượng đó đưa lên khung chat web để AI tự tìm nguyên nhân.
[EXP]
Việc cung cấp mã nguồn dư thừa dễ làm AI bị loãng thông tin và có nguy cơ làm lộ mã nguồn độc quyền của doanh nghiệp.
[B]
Chỉ gửi cho AI duy nhất dòng thông báo "Tôi bị lỗi NullPointerException" và hy vọng AI đưa ra giải pháp.
[EXP]
Thông báo lỗi đơn thuần mà không có Stack Trace hay mã nguồn sẽ khiến AI đưa ra các phỏng đoán chung chung, vô giá trị.
[C]
Xóa hoàn toàn tệp tin đó đi và yêu cầu AI viết lại một tệp mới từ đầu để tránh lỗi cấu trúc cũ.
[EXP]
Viết lại từ đầu khi chỉ có một lỗi con trỏ là sự lãng phí nghiêm trọng và rủi ro sinh thêm lỗi mới rất cao.
[D]
Cung cấp phân đoạn mã nghi ngờ bị lỗi kèm theo nhật ký lỗi chi tiết (Stack Trace) để AI tập trung phân tích.
[EXP]
Chính xác. Việc khoanh vùng chính xác phân đoạn mã và cung cấp nhật ký Stack Trace giúp AI định vị dòng gây lỗi nhanh và chính xác nhất.

@correct: D
@difficulty: 4
@category: 0

## Q3

Khi bắt đầu học một công nghệ mới như nền tảng Spring Boot, một sinh viên muốn sử dụng AI để đẩy nhanh tiến độ làm chủ công nghệ. Lựa chọn nào sau đây thể hiện tư duy vận dụng AI hiệu quả và sâu sắc nhất?

[A]
Yêu cầu AI giải thích nguyên lý luồng hoạt động MVC trong Spring Boot và xin một ví dụ nhỏ về cấu hình Controller để chạy thử nghiệm.
[EXP]
Chính xác. Cách này kết hợp giữa việc học lý thuyết bản chất và thực hành ngay lập tức, đúng tinh thần làm chủ công cụ.
[B]
Yêu cầu AI sinh mã một dự án thương mại điện tử hoàn chỉnh bằng Spring Boot và mang đi nộp làm đồ án môn học.
[EXP]
Đây là sự phụ thuộc mù quáng vào AI, không hề giúp người học tích lũy được tư duy kỹ thuật nền tảng.
[C]
Bỏ qua AI và cố gắng tìm kiếm cách khắc phục từng lỗi cài đặt môi trường rải rác trên các diễn đàn trực tuyến.
[EXP]
Từ chối sử dụng AI trong các bước thiết lập môi trường vốn mất nhiều thời gian là lãng phí lợi thế của công nghệ.
[D]
Nhờ AI dịch toàn bộ tài liệu chính thức (Documentation) tiếng Anh của Spring Boot sang tiếng Việt để in ra đọc dần.
[EXP]
Cách này chỉ giải quyết được vấn đề rào cản ngôn ngữ, không khai thác được năng lực tổng hợp và giải nghĩa mã nguồn của AI.

@correct: A
@difficulty: 4
@category: 0

## Q4

Lập trình viên đang đau đầu vì một đoạn mã chứa vòng lặp lồng nhau xử lý mảng trong Java chạy quá chậm. Bước đầu tiên mang tính hệ thống khi nhờ AI hỗ trợ tối ưu đoạn mã này là gì?

[A]
Mặc định cho rằng bất kỳ đoạn mã nào do AI sinh ra cũng sẽ chạy nhanh hơn, nên sao chép trực tiếp và thay thế luôn vào máy chủ thật.
[EXP]
Thiếu quy trình kiểm duyệt (Zero Trust) với AI dễ gây sập hệ thống nếu mã mới chứa logic nghiệp vụ bị sai lệch.
[B]
Yêu cầu AI tự động xóa bớt các trường dữ liệu ở đầu vào nhằm ép vòng lặp phải kết thúc trong thời gian ngắn hơn.
[EXP]
Việc xóa bớt dữ liệu làm sai lệch kết quả nghiệp vụ, đây không phải là phương pháp tối ưu mã nguồn (Optimization) đúng đắn.
[C]
Cung cấp đoạn mã cũ cho AI và yêu cầu gợi ý tối ưu thuật toán hoặc thay thế bằng thư viện `Stream API` mạnh mẽ hơn.
[EXP]
Chính xác. Cung cấp rõ ràng mã nguồn hiện tại và định hướng nâng cấp công nghệ giúp AI đưa ra giải pháp đúng với mục tiêu tối ưu hiệu năng.
[D]
Hỏi AI xem có ngôn ngữ lập trình nào xử lý vòng lặp nhanh nhất thế giới và đề xuất công ty đổi dự án sang ngôn ngữ đó.
[EXP]
Đổi cả một nền tảng ngôn ngữ của dự án chỉ vì một vòng lặp là quyết định hoàn toàn sai lầm về mặt kiến trúc phần mềm.

@correct: C
@difficulty: 4
@category: 0

## Q5

Bạn đưa một đoạn mã nguồn tính toán thuế thu nhập cá nhân vào AI và nhận về một kết quả tính toán luôn sai số so với yêu cầu thực tế. Trong quy trình tương tác với AI, nguyên nhân sâu xa và phổ biến nhất của sự cố này là gì?

[A]
Do lập trình viên không cung cấp rõ ràng ngữ cảnh về các ngưỡng thuế suất và quy tắc giảm trừ đặc thù trong lệnh Prompt đầu vào.
[EXP]
Chính xác. Đây là minh chứng rõ nhất của nguyên lý "Garbage In, Garbage Out" khi AI bị thiếu dữ kiện nghiệp vụ chuyên biệt.
[B]
Do nền tảng AI bạn đang dùng chưa được nhà phát hành cập nhật phiên bản hệ điều hành mới nhất trong tuần qua.
[EXP]
Phiên bản hệ điều hành của máy chủ AI không liên quan đến khả năng xử lý logic tính thuế và các phép toán cơ bản.
[C]
Do bạn sử dụng các ngôn ngữ lập trình phổ thông như Java hay C# vốn không được AI hỗ trợ tính toán số thập phân.
[EXP]
Các ngôn ngữ này hỗ trợ tính toán rất tốt (như lớp BigDecimal trong Java) và AI hoàn toàn hiểu rõ cú pháp của chúng.
[D]
Do công cụ chat AI bị giới hạn số lượng từ ngữ đầu ra nên nó tự động làm tròn sai kết quả tính toán.
[EXP]
Giới hạn ký tự chỉ làm cho đoạn mã bị ngắt quãng chứ không thể làm thay đổi thuật toán bên trong mã nguồn.

@correct: A
@difficulty: 5
@category: 0

## Q6

Bạn sử dụng AI để tự động tạo một câu truy vấn SQL tìm kiếm khách hàng. Dù câu truy vấn chạy ra đúng kết quả, nhưng hệ thống bị sụt giảm hiệu năng nghiêm trọng (chậm). Nguyên nhân mang tính kỹ thuật khả dĩ nhất xuất phát từ hành vi sinh mã của AI là gì?

[A]
AI đã tự động lấy cắp và thay đổi thông tin đăng nhập của cơ sở dữ liệu làm cho kết nối mạng bị chậm lại.
[EXP]
Trừ khi bạn yêu cầu thông qua API phức tạp, AI dạng chat không có khả năng tự thay đổi thông tin xác thực hệ thống.
[B]
AI có xu hướng cố tình chèn thêm các đoạn mã rác (malware) vào SQL để làm tiêu hao tài nguyên máy chủ của người dùng.
[EXP]
AI không có chủ ý phá hoại bằng mã độc, mọi đầu ra đều là kết quả của việc phỏng đoán xác suất từ kho dữ liệu học.
[C]
AI sử dụng cấu trúc ngôn ngữ SQL của một hệ quản trị khác hoàn toàn không tương thích với dự án hiện tại.
[EXP]
Nếu SQL hoàn toàn không tương thích, cơ sở dữ liệu sẽ báo lỗi cú pháp lập tức thay vì chạy ra kết quả nhưng bị chậm.
[D]
AI sinh ra câu lệnh buộc cơ sở dữ liệu quét toàn bộ bảng (Full Scan) thay vì sử dụng khóa phụ (Index) do nó không biết bảng đang được tối ưu thế nào.
[EXP]
Chính xác. Do AI không có quyền truy cập trực tiếp vào siêu dữ liệu (Schema Metadata) nên thường trả về SQL thô sơ nhất.

@correct: D
@difficulty: 5
@category: 0

## Q7

Khi được yêu cầu viết mã nguồn "tạo số ngẫu nhiên" bằng Java, AI cung cấp hàm `Math.random()`. Tuy nhiên, đội bảo mật từ chối mã này vì nó quá yếu để tạo chuỗi mật khẩu mã hóa. Vấn đề cốt lõi khi phân tích khả năng của AI trong tình huống này là gì?

[A]
Câu lệnh (Prompt) của kỹ sư đã thiếu đi các ràng buộc cụ thể về chuẩn an toàn bảo mật mật mã học.
[EXP]
Chính xác. Nếu không nhấn mạnh từ khóa "Secure Random", AI sẽ tự động chọn hàm giải quyết vấn đề bằng con đường ngắn nhất và đơn giản nhất.
[B]
AI hiện đại được thiết kế để cung cấp những đoạn mã dễ đoán nhằm tạo ra các lỗ hổng bảo mật ẩn cho hệ thống người dùng.
[EXP]
AI không được lập trình để tạo lỗ hổng có chủ đích; nó chỉ sinh mã dựa trên sự phổ biến trong tập dữ liệu huấn luyện.
[C]
Hàm `Math.random()` đã bị nhà phát hành Java xóa bỏ hoàn toàn trong các phiên bản hệ sinh thái mới đây.
[EXP]
Hàm này vẫn là một phần cốt lõi của Java API và được dùng rất nhiều cho các bài toán không yêu cầu bảo mật cao (như game nhỏ).
[D]
Các mô hình AI trên nền web hoàn toàn không có khả năng sinh ra các đoạn mã liên quan đến bảo mật (Security) dưới mọi hình thức.
[EXP]
AI hoàn toàn có khả năng viết mã bảo mật cấp cao (sử dụng lớp `SecureRandom`) nếu được yêu cầu chính xác trong Prompt.

@correct: A
@difficulty: 5
@category: 0

## Q8

Trong vai trò là một kiến trúc sư phần mềm, bạn muốn dùng AI để thiết kế kiến trúc cho một hệ thống phát hiện giao dịch gian lận (Fraud Detection). Cách đặt câu hỏi (Prompt) nào dưới đây phản ánh tư duy sáng tạo kiến trúc tốt nhất?

[A]
"Xin hãy viết cho tôi toàn bộ đoạn mã Java để ứng dụng có thể kiểm tra xem giao dịch này có gian lận hay không."
[EXP]
Prompt này chỉ hướng đến việc sinh mã cục bộ cho tính năng, không đòi hỏi tư duy thiết kế cấu trúc hệ thống ở tầm nhìn cao.
[B]
"Tại sao hệ thống ngân hàng thường xuyên gặp lỗi khi xử lý một lượng lớn giao dịch tài chính gian lận vào ban đêm?"
[EXP]
Prompt này chỉ có giá trị truy vấn thông tin chung chung, không tạo ra một giải pháp kiến trúc để áp dụng cho dự án.
[C]
"Cho tôi xin một tệp tin cấu hình YAML của Docker Compose để chạy công cụ phân tích dữ liệu Kafka trên máy chủ nội bộ."
[EXP]
Prompt này chỉ yêu cầu một tệp cấu hình triển khai cụ thể, thiếu hoàn toàn các tư duy giải quyết vấn đề liên quan đến thiết kế kiến trúc luồng dữ liệu.
[D]
"Hãy đóng vai trò Software Architect. Đề xuất 3 thiết kế kiến trúc xử lý luồng (streaming) cho hệ thống gian lận, so sánh ưu nhược điểm của từng kiến trúc."
[EXP]
Chính xác. Đặt AI vào một vai trò chuyên gia, yêu cầu cung cấp nhiều phương án (Alternatives) và đánh giá ưu/nhược điểm là cách tư duy kiến trúc xuất sắc nhất.

@correct: D
@difficulty: 6
@category: 0

## Q9

Dự án lõi của doanh nghiệp đang sử dụng công nghệ Java cũ với cấu trúc mã nguyên khối (Monolithic) chằng chịt, khiến việc bảo trì rất khó khăn. Bạn dự định dùng AI để thiết kế lại. Phương án tiếp cận nào là sự vận dụng thông minh và đột phá nhất?

[A]
Nhờ AI phân tích biểu đồ sự phụ thuộc (Dependency) giữa các khối, từ đó đề xuất lộ trình an toàn để tách các hàm liên quan thành những module nhỏ hơn bằng chuẩn Java mới.
[EXP]
Chính xác. Sử dụng sức mạnh phân tích cấu trúc của AI để vẽ ra kế hoạch tái cấu trúc (Refactoring Plan) dần dần là giải pháp khôn ngoan nhất ở cấp độ hệ thống.
[B]
Sao chép tất cả các tệp tin hiện tại dán vào AI và yêu cầu: "Chuyển dự án này thành kiến trúc Microservices có tính tương thích cao trong 5 giây".
[EXP]
Yêu cầu quá phi thực tế. Khung chat sẽ bị quá tải ngữ cảnh (Context length limit) và sự chuyển đổi kiến trúc luôn cần có sự giám sát của con người.
[C]
Nhờ AI viết một kịch bản dòng lệnh xóa sạch toàn bộ mã nguồn cũ để đội ngũ không bị phân tâm và bắt đầu lập trình lại từ đầu.
[EXP]
Xóa bỏ dự án đã vận hành ổn định để viết lại từ đầu bằng AI là một quyết định mạo hiểm và hiếm khi được chấp nhận trong doanh nghiệp.
[D]
Yêu cầu AI tự động nâng cấp phiên bản thư viện trong tệp cấu hình `pom.xml` nhưng không cần quan tâm đến mã nguồn bên trong.
[EXP]
Nâng cấp thư viện lõi mà không chỉnh sửa mã nguồn cho tương thích chắc chắn sẽ làm dự án gặp lỗi biên dịch hàng loạt.

@correct: A
@difficulty: 6
@category: 0

## Q10

Bạn đang bị bế tắc khi giải bài toán đồng bộ hóa dữ liệu thời gian thực giữa máy chủ trung tâm và các máy khách. Thay vì xin trực tiếp giải pháp bằng mã, bạn muốn dùng AI để rèn luyện kỹ năng phân tích và tư duy. Lựa chọn tương tác nào là sáng tạo nhất?

[A]
"Xin hãy cung cấp định nghĩa chi tiết nhất về đồng bộ hóa dữ liệu thời gian thực trong mạng máy tính phân tán."
[EXP]
Câu hỏi này chỉ thu về một định nghĩa hàn lâm dùng để đọc hiểu, không trực tiếp rèn luyện kỹ năng giải bài toán thực tiễn.
[B]
"Hãy đóng vai trò là một kỹ sư trưởng. Hãy hỏi tôi lần lượt từng câu hỏi gợi mở về bài toán đồng bộ dữ liệu này để tôi tự suy luận ra cách giải quyết."
[EXP]
Chính xác. Việc áp dụng phương pháp vấn đáp Socrate thông qua AI giúp người học phải tư duy chủ động và nâng cao năng lực giải quyết vấn đề từ gốc rễ.
[C]
"Viết cho tôi đoạn mã Java áp dụng công nghệ WebSockets để đồng bộ hóa dữ liệu một cách tối ưu nhất."
[EXP]
Đây là cách làm tắt (Shortcut). Việc nhờ AI viết thẳng mã nguồn sẽ phá hỏng mục tiêu rèn luyện khả năng tư duy cá nhân của bạn.
[D]
"Sử dụng nền tảng thư viện mã nguồn mở nào để có tốc độ đồng bộ hóa dữ liệu nhanh nhất hiện nay?"
[EXP]
Hỏi trực tiếp về công cụ cụ thể sẽ giới hạn tầm nhìn của bạn ở việc "dùng thư viện", thay vì hiểu sâu về "cơ chế đồng bộ".

@correct: B
@difficulty: 6
@category: 0

## Q11

Trong lĩnh vực lập trình có sự hỗ trợ của trí tuệ nhân tạo, khái niệm "Hallucination" (Ảo giác AI) được hiểu chính xác nhất là hiện tượng gì?

[A]
Việc các công cụ AI có khả năng tự động hoàn thiện mã nguồn (Autocompletion) với tốc độ nhanh gấp nhiều lần so với lập trình viên thông thường.
[EXP]
Tốc độ sinh mã nhanh là tính năng cốt lõi được thiết kế của AI (Code Generation), hoàn toàn không phải là một hiện tượng bất thường hay lỗi ảo giác.
[B]
Việc các mô hình ngôn ngữ lớn (LLM) từ chối trả lời các câu hỏi về chuyên môn sâu của dự án nội bộ để bảo vệ bản quyền phần mềm.
[EXP]
Từ chối trả lời là cơ chế thiết lập hàng rào an toàn (Safety Guardrails) cố ý của nhà phát hành, không phải hiện tượng ảo giác.
[C]
Việc AI đưa ra các đoạn mã nguồn, tên hàm hoặc tên thư viện cực kỳ tự tin, chuẩn cú pháp nhưng thực chất hoàn toàn bịa đặt và không hề tồn tại.
[EXP]
Chính xác. Đây là đặc điểm nguy hiểm nhất của Hallucination: cung cấp thông tin sai lệch nhưng bọc trong lớp vỏ ngoài hoàn hảo, đánh lừa sự tin tưởng của lập trình viên.
[D]
Việc công cụ AI yêu cầu người dùng phải nâng cấp lên phiên bản trả phí thì mới được hiển thị những đoạn mã có tính ứng dụng cao nhất.
[EXP]
Đây là chiến lược kinh doanh của các nhà cung cấp dịch vụ AI, không liên quan đến vấn đề về mặt kỹ thuật thuật toán.

@correct: C
@difficulty: 7
@category: 1

## Q12

Phát biểu nào sau đây chỉ ra điểm khác biệt cốt lõi nhất về cách thức hoạt động giữa công cụ AI Chat trên nền Web (như ChatGPT) và trợ lý lập trình nội tuyến (Inline Code Assistant như Antigravity / Copilot)?

[A]
Trợ lý nội tuyến được nhúng trực tiếp vào IDE, có khả năng phân tích ngữ cảnh dự án và gợi ý mã theo thời gian thực; trong khi công cụ Web thiên về hỏi đáp độc lập.
[EXP]
Chính xác. Sự khác biệt lớn nhất là khả năng nắm bắt Context của IDE: Inline Assistant "nhìn" được file bạn đang mở, còn Web Chat thì không (trừ khi bạn dán code vào).
[B]
Công cụ Web Chat chủ yếu được sử dụng để viết mã dự án nhanh hơn, còn Trợ lý nội tuyến chỉ hỗ trợ cho việc biên dịch ngôn ngữ phần mềm sang tiếng Anh.
[EXP]
Phát biểu này sai hoàn toàn. Cả hai công cụ đều có khả năng sinh mã mạnh mẽ và hỗ trợ lập trình viên ở nhiều khía cạnh khác nhau.
[C]
Trợ lý nội tuyến được giới hạn độc quyền cho ngôn ngữ Python, trong khi công cụ Web Chat hỗ trợ lập trình cho tất cả các loại ngôn ngữ.
[EXP]
Các trợ lý Inline Code Assistant hiện tại hỗ trợ rất đa dạng ngôn ngữ phổ biến như Java, JavaScript, C#, Python...
[D]
Trợ lý nội tuyến hoàn toàn không có khả năng sinh mã nguồn (Code Generation), nó chỉ đóng vai trò kiểm tra lỗi chính tả trong mã nguồn.
[EXP]
Trợ lý nội tuyến nổi tiếng nhất chính là nhờ tính năng dự đoán và sinh ra toàn bộ khối mã (Block code) chỉ dựa vào tên hàm.

@correct: A
@difficulty: 7
@category: 1

## Q13

Một sinh viên để tiết kiệm thời gian đã sao chép toàn bộ tệp cấu hình của hệ thống (chứa mật khẩu cơ sở dữ liệu thật) lên khung chat của ChatGPT bản miễn phí để nhờ dò tìm lỗi kết nối. Hành động này vi phạm nghiêm trọng nhất nguyên tắc rủi ro nào khi ứng dụng AI?

[A]
Nguyên tắc không lạm dụng trí tuệ nhân tạo để sinh ra những phân đoạn mã có dung lượng quá lớn và cấu trúc quá phức tạp.
[EXP]
Việc sinh mã quá dài dễ gây ra lỗi về mặt thiết kế (Logic/Performance), nhưng chưa phải là hành vi vi phạm rủi ro lớn nhất trong tình huống này.
[B]
Nguyên tắc bảo vệ dữ liệu bí mật (Data Security), vì mô hình AI công cộng có thể sử dụng nội dung khung chat để làm dữ liệu huấn luyện (Training Data).
[EXP]
Chính xác. Thông tin nhạy cảm có thể bị lưu vào bộ nhớ của AI và vô tình gợi ý cho người dùng khác sau này, gây ra sự cố rò rỉ bảo mật cấp doanh nghiệp.
[C]
Nguyên tắc về ngôn ngữ, do việc sử dụng tiếng Việt thay vì tiếng Anh sẽ làm cho mô hình AI dịch sai các thông số kết nối cơ sở dữ liệu.
[EXP]
Khả năng xử lý đa ngôn ngữ (Multilingual) của AI hiện nay rất tốt; việc dùng tiếng Việt không phải là nguyên nhân gây lỗi hay vi phạm rủi ro.
[D]
Nguyên tắc tôn trọng quyền sở hữu trí tuệ, do người dùng đã cung cấp mã nguồn mở trái phép cho tổ chức phát triển AI.
[EXP]
Trong ngữ cảnh hệ thống nội bộ chứa mật khẩu thực tế, vấn đề cấp thiết là An toàn thông tin (Security) chứ không chỉ là Sở hữu trí tuệ (Intellectual Property).

@correct: B
@difficulty: 8
@category: 1

## Q14

Sau khi nhờ AI xử lý thuật toán phân bổ nhân sự phức tạp, bạn nhận được một phương thức Java rất dài. Theo phương pháp luận "AI-Assisted Developer" (Người phát triển được AI hỗ trợ), hành động có trách nhiệm nhất trước khi đưa mã này vào dự án chính là gì?

[A]
Thực hiện đổi tên các biến và hàm cho phù hợp với phong cách cá nhân rồi lập tức tải thẳng đoạn mã lên máy chủ Production.
[EXP]
Chỉ tối ưu vẻ bề ngoài (Naming convention) mà không xác minh tính đúng đắn bên trong logic thuật toán là hành vi cực kỳ vô trách nhiệm.
[B]
Gộp thẳng (Merge) phân đoạn mã lên nhánh phát triển chính (Main) vì các mô hình AI hiện nay rất thông minh và hầu như không mắc lỗi thuật toán cơ bản.
[EXP]
Các mô hình AI luôn tồn tại rủi ro bị ảo giác (Hallucination), việc tin tưởng tuyệt đối (Blind Trust) vi phạm quy tắc phòng vệ trong kỹ thuật phần mềm.
[C]
Gửi đoạn mã đó cho một nền tảng AI khác để nhờ dịch ngược từ Java sang Python nhằm mục đích so sánh xem phiên bản nào chạy ngắn hơn.
[EXP]
Việc so sánh ngôn ngữ lập trình không mang lại giá trị thực tiễn trong việc xác minh tính chính xác của thuật toán phân bổ nhân sự hiện tại.
[D]
Áp dụng tư duy phản biện: tự kiểm chứng chéo sự tồn tại của các hàm, sử dụng Debug chạy từng dòng (Step-by-step) và chủ động bổ sung Unit Test.
[EXP]
Chính xác. Đây là chuỗi hành động chuẩn mực của vai trò "Người gác cổng" (Gatekeeper) nhằm đảm bảo không có lỗ hổng bảo mật hay lỗi suy luận bị lọt qua.

@correct: D
@difficulty: 8
@category: 1

## Q15

Sự bùng nổ của tính năng AI sinh mã tự động (Auto Code Generation) đã làm dịch chuyển mạnh mẽ định hướng nghề nghiệp của kỹ sư phần mềm. Tại sao vai trò của con người lại chuyển dịch từ "Thợ gõ mã" sang "Người gác cổng" (Gatekeeper) thay vì bị thay thế hoàn toàn?

[A]
Vì AI có khả năng lập trình cực nhanh nhưng lại thiếu sự thấu hiểu về ngữ cảnh nghiệp vụ phức tạp của doanh nghiệp và không có tư cách để chịu trách nhiệm pháp lý.
[EXP]
Chính xác. Tốc độ và khối lượng công việc tay chân do AI đảm nhận, nhưng trách nhiệm giải trình cuối cùng (Accountability) và thẩm định rủi ro kinh doanh là của con người.
[B]
Vì các mô hình AI ngôn ngữ lớn hiện tại hoàn toàn chưa có khả năng sinh ra các đoạn mã Java thực tế có thể biên dịch được trên máy chủ.
[EXP]
Thực tế, AI hiện nay viết mã chuẩn xác và biên dịch thành công rất nhiều ngôn ngữ mạnh mẽ như Java, C#, Go.
[C]
Vì AI chỉ hỗ trợ sinh mã nguồn cho các ngôn ngữ bậc thấp, chưa thể áp dụng rộng rãi cho lĩnh vực thiết kế ứng dụng di động hoặc thương mại điện tử hiện đại.
[EXP]
AI đang hỗ trợ xuất sắc hàng loạt các framework hiện đại nhất cho cả nền tảng Web, Mobile (React, Flutter) và Backend (Spring Boot).
[D]
Vì chi phí duy trì hàng tháng cho các công cụ AI trả phí đắt đỏ hơn gấp nhiều lần so với chi phí chi trả lương cho một kỹ sư lập trình thâm niên.
[EXP]
Nhìn chung, chi phí đăng ký sử dụng công cụ AI rất nhỏ giọt so với việc đầu tư vận hành một chuyên gia cấp cao (Senior Engineer).

@correct: A
@difficulty: 9
@category: 1

## Q16

Khi học lập trình Java, bạn gặp một thuật ngữ lạ lẫm là "Polymorphism" (Đa hình). Lựa chọn nào dưới đây thể hiện cách vận dụng AI một cách chuyên sâu nhất để học thuật ngữ này?

[A]
Yêu cầu AI dịch trực tiếp thuật ngữ này sang tiếng Việt để dễ hiểu.
[EXP]
Việc dịch thuật chỉ giải quyết được mặt ngôn ngữ, không giúp bạn hiểu bản chất kỹ thuật của lập trình hướng đối tượng.
[B]
Bỏ qua việc dùng AI vì các công cụ này thường giải thích sai các lý thuyết chuyên ngành khoa học máy tính.
[EXP]
AI giải thích lý thuyết lập trình cực kỳ tốt nếu được hỏi đúng cách.
[C]
Yêu cầu AI giải thích bản chất, cung cấp 3 ví dụ mã Java thực tế về Đa hình và phân tích ưu nhược điểm của chúng.
[EXP]
Chính xác. Cách này tận dụng năng lực sư phạm của AI: vừa giải thích lý thuyết, vừa minh họa bằng mã nguồn thực tế để dễ nắm bắt.
[D]
Yêu cầu AI làm thay một bài tập về Đa hình để nộp chấm điểm cho qua môn học.
[EXP]
Hành vi này vi phạm tính liêm chính học thuật và triệt tiêu khả năng tự tư duy của sinh viên.

@correct: C
@difficulty: 4
@category: 0

## Q17

Đang phát triển một ứng dụng Spring Boot, bạn gặp lỗi `BeanCreationException` khiến hệ thống không khởi động được. Cách vận dụng AI tối ưu nhất để khắc phục sự cố này là gì?

[A]
Xóa hoàn toàn lớp (class) bị lỗi và yêu cầu AI viết lại một lớp mới từ đầu.
[EXP]
Cách làm này vô tình tạo ra sự lãng phí tài nguyên và có rủi ro sinh ra lỗi cấu trúc hệ thống lớn hơn.
[B]
Đưa cho AI mỗi tên của ngoại lệ (Exception) và hy vọng AI có thể tự đoán được thành phần nào (bean) đang bị lỗi.
[EXP]
Ngoại lệ này rất phổ biến, nếu không có ngữ cảnh, AI chỉ có thể đưa ra câu trả lời lý thuyết chung chung.
[C]
Bỏ qua việc sử dụng AI, sao chép lỗi và lên mạng tự tìm kiếm trên các diễn đàn lập trình.
[EXP]
Từ chối sử dụng AI là lãng phí một trợ lý lập trình đắc lực giúp phân tích lỗi cực nhanh.
[D]
Cung cấp các Annotation liên quan (như @Service, @Component) và nhật ký Stack Trace chi tiết để AI phân tích thiếu sót tiêm phụ thuộc.
[EXP]
Chính xác. Việc khoanh vùng mã nguồn cộng với cung cấp Stack Trace giúp AI chẩn đoán chính xác lớp nào đang thiếu cấu hình.

@correct: D
@difficulty: 4
@category: 0

## Q18

AI vừa sinh ra một vòng lặp `while(true)` bị lỗi logic, gây treo máy chủ (Infinite Loop). Cách ứng xử đúng chuẩn của một "AI-Assisted Developer" là gì?

[A]
Thiết lập điểm dừng (Breakpoint) trong IDE để xem trạng thái biến đếm và yêu cầu AI sửa lại dựa trên điều kiện thoát vòng lặp thực tế.
[EXP]
Chính xác. Sự kết hợp giữa kỹ năng Debug truyền thống và năng lực sinh mã của AI là phương pháp làm việc chuyên nghiệp nhất.
[B]
Tiến hành gỡ bỏ IDE phần mềm và cài đặt lại vì cho rằng IDE bị nhiễm virus mã độc.
[EXP]
Lỗi vòng lặp vô hạn là lỗi logic mã nguồn, không liên quan đến hệ thống phần mềm IDE.
[C]
Đăng tải bài viết phàn nàn trên diễn đàn mạng rằng AI sinh mã hỏng và khuyên mọi người không nên dùng.
[EXP]
AI luôn có xác suất sai số, việc phàn nàn thay vì kiểm chứng cho thấy tư duy phụ thuộc vào công cụ.
[D]
Để nguyên mã nguồn chạy như vậy và hy vọng hệ điều hành máy chủ sẽ tự động sửa lỗi khi hết bị treo.
[EXP]
Hệ điều hành không thể tự sửa logic nghiệp vụ của mã nguồn Java.

@correct: A
@difficulty: 4
@category: 0

## Q19

Bạn muốn sử dụng AI để tạo một bộ dữ liệu giả (Mock Data) gồm 1000 bản ghi cho bảng User nhằm mục đích kiểm thử phần mềm. Câu lệnh (Prompt) nào dưới đây là hoàn hảo nhất?

[A]
"Xin hãy cho tôi danh sách toàn bộ người dùng (User)."
[EXP]
Prompt quá mơ hồ, AI không thể biết bạn muốn dữ liệu giả định dạng nào và cần bao nhiêu bản ghi.
[B]
"Hãy tự động viết script kết nối thẳng vào database thật của tôi để sinh thêm dữ liệu."
[EXP]
Prompt này quá nguy hiểm, không ai cho phép đoạn mã chưa kiểm chứng kết nối vào CSDL thật (Production).
[C]
"Tạo cho tôi một file SQL chứa câu lệnh INSERT 1000 bản ghi vào bảng User với các trường id, name, email (định dạng email hợp lệ)."
[EXP]
Chính xác. Lệnh Prompt này chỉ định rõ ràng định dạng tệp (SQL), cấu trúc bảng (id, name, email) và yêu cầu dữ liệu chuẩn xác.
[D]
"Cho tôi một mã nguồn Java bất kỳ có thể tự random thông tin User."
[EXP]
Mã nguồn chung chung sẽ khiến bạn mất thời gian để tự biên dịch và trích xuất dữ liệu.

@correct: C
@difficulty: 4
@category: 0

## Q20

Tại sao đoạn mã do AI sinh ra thường xuyên sử dụng phép cộng chuỗi `String + String` trong các vòng lặp Java lớn lại bị đánh giá là kém chất lượng và làm chậm hệ thống?

[A]
Vì `String` trong Java là kiểu dữ liệu bất biến (immutable), mỗi lần cộng sẽ sinh đối tượng mới gây rác bộ nhớ; giải pháp là đổi sang `StringBuilder`.
[EXP]
Chính xác. Kỹ sư phải có kiến thức nền tảng để tối ưu lại những đoạn mã thô sơ (Garbage) mà AI vô tình trả về.
[B]
Vì công cụ AI đang sử dụng là phiên bản miễn phí, thuật toán luôn bị nhà phát hành làm giảm tốc độ thực thi.
[EXP]
Phiên bản miễn phí không làm thay đổi luồng thuật toán chạy trên máy của bạn.
[C]
Vì ngôn ngữ lập trình Java phiên bản mới hoàn toàn nghiêm cấm việc sử dụng dấu cộng để nối chuỗi.
[EXP]
Java vẫn cho phép nối chuỗi bằng dấu cộng, nhưng nó không tối ưu trong vòng lặp lớn.
[D]
Do cấu hình RAM trên máy chủ của bạn quá thấp nên không thể xử lý đoạn mã do AI cung cấp.
[EXP]
Vấn đề nằm ở thuật toán (Software), không nằm ở cấu hình phần cứng máy chủ (Hardware).

@correct: A
@difficulty: 5
@category: 0

## Q21

Một kỹ sư gửi đoạn mã lên khung chat AI để tối ưu hóa hiệu năng, nhưng kết quả AI trả về lại tính toán sai nghiệp vụ gốc so với ban đầu. Lỗi phổ biến nhất thường xảy ra ở đây là gì?

[A]
Do nền tảng AI đột nhiên tự động thay đổi ngôn ngữ lập trình của đoạn mã.
[EXP]
AI thường tuân thủ chặt chẽ ngôn ngữ đầu vào và rất hiếm khi tự động chuyển đổi ngôn ngữ trừ khi được yêu cầu.
[B]
Do nền tảng AI quá tải lượng người dùng truy cập nên nó đã cố tình trả về sai lệch kết quả.
[EXP]
Tình trạng quá tải chỉ gây ra độ trễ phản hồi, không làm thay đổi logic lập trình.
[C]
Do khung chat của ứng dụng AI bị giới hạn số lượng ký tự tối đa dẫn đến mất mát hàm tính toán.
[EXP]
Giới hạn ký tự làm đoạn mã bị ngắt nửa chừng chứ không tự động thay đổi thuật toán.
[D]
AI tập trung tối ưu hóa hiệu năng nhưng vô tình xóa bỏ mất các điều kiện kiểm tra biên (Edge Cases) chưa được người kỹ sư mô tả rõ trong Prompt.
[EXP]
Chính xác. Nếu bạn không dặn dò AI bảo tồn logic, nó sẽ tự ý cắt gọt các dòng lệnh mà nó cho là "dư thừa" để đạt tốc độ chạy cao nhất.

@correct: D
@difficulty: 5
@category: 0

## Q22

AI khuyên bạn nên dùng `ArrayList` thay vì `LinkedList` cho một thao tác tìm kiếm truy xuất liên tục trong Java. Lý do cốt lõi nhất về mặt khoa học máy tính mà AI đưa ra giải pháp này là gì?

[A]
Kiểu dữ liệu `LinkedList` đã bị đánh dấu xóa bỏ hoàn toàn trong các phiên bản Java gần đây.
[EXP]
`LinkedList` vẫn được hỗ trợ đầy đủ trong nền tảng Java hiện tại.
[B]
Mô hình AI chỉ được huấn luyện học duy nhất thư viện `ArrayList` do nó quá phổ biến.
[EXP]
AI được huấn luyện cả hai cấu trúc dữ liệu và biết rõ sự khác biệt của chúng.
[C]
`ArrayList` sử dụng mảng bộ nhớ liên tục (contiguous memory), tối ưu bộ nhớ đệm Cache và truy xuất với thời gian O(1) theo chỉ số (Index).
[EXP]
Chính xác. Kỹ sư phải hiểu cơ sở khoa học máy tính đằng sau gợi ý của AI để đưa ra quyết định đúng đắn.
[D]
`ArrayList` có cấu trúc tiết kiệm dung lượng RAM hơn nhiều lần so với các loại danh sách khác.
[EXP]
Vấn đề ở đây là tốc độ truy xuất (Performance), không chỉ là bài toán lưu trữ (Storage).

@correct: C
@difficulty: 5
@category: 0

## Q23

Bạn muốn dùng AI để lên ý tưởng thiết kế một hệ thống bộ nhớ đệm (Caching) cho dự án thương mại điện tử. Câu lệnh (Prompt) nào sau đây là giải pháp sáng tạo tuyệt vời nhất?

[A]
"Cho tôi xin một đoạn mã nguồn cài đặt Redis cache bằng Java nhanh nhất."
[EXP]
Đây là câu lệnh nghiêng về sinh mã cục bộ, không thể hiện tầm nhìn kiến trúc tổng quát của ứng dụng.
[B]
"Hãy đóng vai System Architect, đề xuất giải pháp Caching cho danh mục dữ liệu Sản phẩm, đồng thời phân tích các chiến lược xóa cache (Eviction)."
[EXP]
Chính xác. Lệnh Prompt đóng vai trò chuyên gia, chỉ định rõ vùng dữ liệu cần áp dụng và yêu cầu phân tích rủi ro sẽ đem lại góc nhìn cực sâu sắc.
[C]
"Hãy giải thích tại sao hệ thống thương mại điện tử lại hay bị chạy chậm vào dịp khuyến mãi?"
[EXP]
Câu lệnh này mang tính truy vấn thông tin lý thuyết chung, không giúp thiết kế ra giải pháp thực tiễn.
[D]
"Tự động thiết lập và cấu hình chức năng cache cho dự án Spring Boot của tôi ngay bây giờ."
[EXP]
Câu lệnh ra lệnh tự động này thiếu chiều sâu và không cho phép kỹ sư đánh giá ưu nhược điểm kiến trúc.

@correct: B
@difficulty: 6
@category: 0

## Q24

Bạn đang tiếp quản một dự án Java 8 cũ kỹ cần được nâng cấp công nghệ. Đâu là một Prompt khởi đầu tốt nhất khi nhờ AI tư vấn lộ trình?

[A]
"Phân tích tệp tin pom.xml này và đề xuất lộ trình nâng cấp an toàn từ Java 8 lên 17, đồng thời chỉ ra các thư viện có khả năng bị gãy tương thích."
[EXP]
Chính xác. Cung cấp file cấu hình, đặt ra điểm đến cụ thể (Java 17) và yêu cầu nhận diện rủi ro là cách tiếp cận của một chuyên gia sáng tạo.
[B]
"Hãy tự động chuyển đổi toàn bộ mã nguồn của dự án này sang nền tảng Java phiên bản 21."
[EXP]
Việc ép hệ thống nhảy vọt phiên bản mà không có lộ trình phân tích sẽ khiến hàng loạt hệ thống đổ vỡ do không tương thích thư viện lõi.
[C]
"Xóa hết bộ mã nguồn hệ thống cũ đi và viết lại một bản mới tối ưu hơn."
[EXP]
Quyết định xóa bỏ một hệ thống đang vận hành (legacy code) để viết mới là quyết định nguy hiểm và tốn kém nhất.
[D]
"Chỉ cho tôi cách nào nâng cấp dự án này với tốc độ nhanh nhất thế giới."
[EXP]
Yêu cầu tốc độ nhưng bỏ qua tính an toàn không bao giờ là tư duy tốt trong bảo trì hệ thống phần mềm.

@correct: A
@difficulty: 6
@category: 0

## Q25

Trong quá trình gỡ lỗi (Debug) một sự cố Deadlock (Khóa cứng tài nguyên) liên quan đến lập trình đa luồng (Threading), cách dùng AI sao cho thông minh nhất là gì?

[A]
Yêu cầu AI viết cho một phiên bản mã nguồn hoàn toàn không cần dùng đến tính năng khóa (Lock-free) để thay thế.
[EXP]
Thuật toán Lock-free cực kỳ phức tạp và không thể tùy tiện áp dụng thay thế cho mọi tình huống Deadlock.
[B]
Nhờ AI tự động tăng cường số lượng luồng (Threads) lên gấp đôi để hy vọng hệ thống vượt qua điểm thắt nút.
[EXP]
Tăng số luồng trong lúc bị Deadlock chỉ làm tình trạng giam giữ tài nguyên trở nên tồi tệ hơn rất nhiều.
[C]
Chủ động loại bỏ hoàn toàn tính năng xử lý đa luồng (Threading) để ứng dụng chạy đồng bộ và an toàn.
[EXP]
Loại bỏ đa luồng làm hệ thống chậm đi rất nhiều, đi ngược lại với yêu cầu hiệu năng của phần mềm hiện đại.
[D]
Cung cấp tệp tin kết xuất (Dump file) của Thread để AI phân tích trạng thái các khóa (locks) và đề xuất thiết kế thứ tự chiếm khóa an toàn.
[EXP]
Chính xác. Dùng khả năng đọc log khổng lồ của AI để vẽ lại sơ đồ vòng lặp khóa, từ đó tìm ra điểm tắc nghẽn logic.

@correct: D
@difficulty: 6
@category: 0

## Q26

Trong lĩnh vực AI, tại sao hiện tượng trả lời sai lại được gán cho một thuật ngữ riêng biệt là "Ảo giác" (Hallucination) thay vì chỉ gọi là Lỗi (Bug)?

[A]
Vì AI chạy quá nhanh làm hệ thống máy tính của người sử dụng bị giật lag và sinh ra các hiệu ứng hình ảnh mờ ảo.
[EXP]
Hiện tượng Ảo giác không liên quan đến hiệu suất phần cứng hay hiện tượng giật lag của màn hình đồ họa.
[B]
Vì AI thi thoảng tự động ngừng phản hồi và đóng băng hệ thống không có nguyên nhân rõ ràng.
[EXP]
Sự cố đứng máy gọi là treo hệ thống (Freeze/Crash), không phải là hiện tượng Hallucination.
[C]
Vì AI đưa ra câu trả lời sai rành rành nhưng lại bọc trong một lớp ngôn từ vô cùng tự tin, cấu trúc logic hoàn hảo và thuyết phục giả tạo.
[EXP]
Chính xác. Điểm nguy hiểm nhất của Hallucination là khả năng đánh lừa người dùng bằng vẻ ngoài tự tin và các thư viện giả mạo như thật.
[D]
Vì AI thường tự động sinh ra các bức ảnh kỳ lạ thay vì xuất ra các đoạn văn bản giải thích mã nguồn.
[EXP]
Mô hình ngôn ngữ lập trình không tự ý xuất hình ảnh nếu không được trang bị hệ thống AI Generative Art tương ứng.

@correct: C
@difficulty: 7
@category: 1

## Q27

Công cụ trợ lý mã hóa nội tuyến (Inline Code Assistant như Copilot) vượt trội hơn hẳn so với việc dán mã lên Web Chat (như ChatGPT) ở năng lực cốt lõi nào?

[A]
Khả năng nhúng trực tiếp vào môi trường IDE, tự động đọc và phân tích ngữ cảnh của các tệp tin dự án liên quan (Context-aware) theo thời gian thực.
[EXP]
Chính xác. Khả năng "nhìn thấy" toàn bộ dự án hiện tại là sức mạnh vô địch của Inline Assistant giúp nó đưa ra gợi ý liền mạch.
[B]
Khả năng tạo ra các thuật toán sinh mã chạy nhanh hơn và tiêu thụ ít băng thông mạng Internet hơn.
[EXP]
Tốc độ mạng Internet không phản ánh sự vượt trội về thuật toán phân tích của hai loại hình công cụ này.
[C]
Công cụ Inline Code Assistant hoàn toàn miễn phí và không yêu cầu đăng nhập tài khoản trực tuyến.
[EXP]
Hầu hết các trợ lý lập trình nội tuyến chất lượng cao đều là công cụ tính phí và yêu cầu bản quyền doanh nghiệp.
[D]
Công cụ Web Chat có năng lực tự động can thiệp và sửa đổi mã nguồn mà không cần bạn bấm phím xác nhận.
[EXP]
Cả hai công cụ đều cần kỹ sư xác nhận (Accept) trước khi áp dụng vào tệp tin.

@correct: A
@difficulty: 7
@category: 1

## Q28

Khi bắt buộc phải đưa một tệp tin cấu hình cơ sở dữ liệu lên một công cụ AI bản Web để nhờ cấu trúc lại, bước thao tác phòng vệ tối thiểu bạn cần làm là gì?

[A]
Tiến hành dịch toàn bộ bình luận trong tệp tin sang tiếng Anh để AI hiểu rõ hơn.
[EXP]
Ngôn ngữ không phải là vấn đề bảo mật.
[B]
Tiến hành chuyển đổi định dạng tệp tin từ chuẩn YAML sang chuẩn JSON.
[EXP]
Định dạng tệp tin không làm thay đổi nội dung dữ liệu bên trong.
[C]
Nén toàn bộ tệp tin lại thành một thư mục định dạng ZIP có cài mật khẩu.
[EXP]
Việc nén tệp tin sẽ khiến AI dạng Chat không thể mở ra đọc mã nguồn để xử lý yêu cầu của bạn.
[D]
Thực hiện che giấu (Masking) toàn bộ mật khẩu, khóa API và địa chỉ IP hệ thống thực tế để tránh nguy cơ rò rỉ bảo mật.
[EXP]
Chính xác. Loại bỏ dữ liệu nhạy cảm (Sanitize Data) là thao tác bắt buộc của mọi tổ chức phần mềm khi dùng AI công cộng.

@correct: D
@difficulty: 8
@category: 1

## Q29

Bạn nhận được một hàm xử lý chuỗi ký tự vô cùng phức tạp do AI sinh ra. Để đảm bảo đoạn mã này an toàn theo mô hình phát triển phần mềm, bước đầu tiên là gì?

[A]
Chủ động thiết lập một bộ Unit Test và kiểm tra kỹ lưỡng các trường hợp biên (chuỗi null, chuỗi rỗng) để thẩm định độ tin cậy của thuật toán.
[EXP]
Chính xác. Đây là bước kiểm chứng tuyệt vời của một "Người gác cổng" (Gatekeeper), giúp ngăn chặn ảo giác AI làm hệ thống lỗi trong tương lai.
[B]
Tiến hành đưa trực tiếp lên máy chủ Production ngay lập tức để tiết kiệm tối đa thời gian triển khai sản phẩm.
[EXP]
Chưa kiểm thử mà đưa lên máy chủ thật là hành vi tắc trách gây ra các rủi ro downtime hệ thống rất lớn.
[C]
Tiến hành đổi tên các biến trong đoạn mã cho giống với phong cách viết mã quen thuộc của bản thân.
[EXP]
Chỉ đổi tên biến để cho đẹp mắt nhưng không kiểm chứng logic là cách làm hời hợt, không giải quyết vấn đề cốt lõi.
[D]
Gửi hàm đó cho một công cụ AI khác để dịch sang ngôn ngữ lập trình hoàn toàn khác.
[EXP]
Dịch ngôn ngữ chéo không giúp đánh giá được sự chính xác về mặt kết quả đầu ra (Output) của hàm xử lý chuỗi.

@correct: A
@difficulty: 8
@category: 1

## Q30

Đâu là lý do giải thích tại sao năng suất thực tế của một "Người gác cổng" (Gatekeeper) lại cao hơn rất nhiều so với một "Thợ gõ mã" (Coder) trong thời đại AI?

[A]
Vì họ chỉ cần ngồi thực hiện thao tác sao chép (copy) và dán (paste) liên tục từ màn hình này sang màn hình khác.
[EXP]
Nếu chỉ copy/paste mà không có tư duy, năng suất sẽ bị sụt giảm nghiêm trọng bởi việc phải dọn dẹp các lỗi do AI để lại.
[B]
Vì họ đã chuyển hướng trọng tâm từ việc gõ từng dòng lệnh vất vả sang việc thiết kế kiến trúc, điều hướng AI sinh mã và thẩm định rủi ro kinh doanh.
[EXP]
Chính xác. Khả năng tận dụng AI để sinh mã (Generate) và tập trung tư duy vào chiến lược (Strategy/Review) là bí quyết x10 năng suất lập trình.
[C]
Vì công cụ AI hiện nay đã tự động hoàn thành 100% tất cả mọi công việc dự án phần mềm cho họ.
[EXP]
AI không thể làm 100% công việc do thiếu sự thấu hiểu nghiệp vụ khách hàng cốt lõi và tư duy bảo mật hệ thống.
[D]
Vì chức danh này thường được các công ty công nghệ trả mức lương cao hơn rất nhiều so với lập trình viên thường.
[EXP]
Lương bổng cao không phải là nguyên nhân kỹ thuật trực tiếp tạo ra năng suất, mà năng suất mới là thứ mang lại lương cao.

@correct: B
@difficulty: 9
@category: 1
