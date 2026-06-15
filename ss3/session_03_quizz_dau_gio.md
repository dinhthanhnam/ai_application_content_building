# QUIZ ĐẦU GIỜ - SESSION 03

## Q1

Giả sử bạn đang làm việc trên một tính năng mới yêu cầu tham khảo kiến trúc tổng thể của hệ thống hiện tại. Công cụ AI nào sau đây là lựa chọn phù hợp nhất để giảm thiểu việc chuyển đổi ngữ cảnh (context switching)?

[A]
Mở ChatGPT trên trình duyệt và dán thủ công từng tệp tin cần tham khảo.
[EXP]
Việc này gây mất thời gian chuyển đổi ngữ cảnh và dễ bỏ sót file liên kết, làm giảm hiệu suất.
[B]
Sử dụng trợ lý lập trình tích hợp (IDE Assistant) có khả năng đọc toàn bộ thư mục dự án.
[EXP]
Trợ lý tích hợp (như Agentic Assistant) có khả năng đọc cấu trúc dự án trực tiếp, giúp bạn không cần sao chép thủ công.
[C]
Dùng một công cụ vẽ sơ đồ tư duy để tự phác thảo kiến trúc trước khi code.
[EXP]
Đúng là cần thiết nhưng không giải quyết vấn đề tự động hóa bằng AI để giảm chuyển đổi ngữ cảnh.
[D]
Tìm kiếm các dự án tương tự trên GitHub và sao chép cấu trúc của họ.
[EXP]
Cách này không giải quyết vấn đề hệ thống hiện tại của bạn và không ứng dụng AI hiệu quả.

@correct: B
@difficulty: 4
@category: 0

## Q2

Một lập trình viên sử dụng trợ lý tích hợp (IDE Assistant) để tạo các lớp đối tượng (Entity) từ kịch bản cơ sở dữ liệu. Hành động nào sau đây thể hiện ĐÚNG vai trò "kiểm duyệt" của lập trình viên?

[A]
Gộp (merge) trực tiếp mã do AI sinh ra vào nhánh chính (main branch) để tiết kiệm thời gian.
[EXP]
Đây là hành động nguy hiểm, bỏ qua bước kiểm tra và có thể gây lỗi hệ thống nghiêm trọng.
[B]
Tin tưởng hoàn toàn vào các quy ước đặt tên (naming convention) mà AI đề xuất.
[EXP]
AI có thể không nắm được chuẩn đặt tên riêng của đội ngũ, cần phải được kiểm tra lại.
[C]
Kiểm tra chéo các kiểu dữ liệu AI tạo ra với tài liệu thiết kế cơ sở dữ liệu nội bộ.
[EXP]
Việc rà soát và đối chiếu với tài liệu gốc thể hiện đúng vai trò người gác cổng của lập trình viên.
[D]
Xóa bỏ hoàn toàn mã AI sinh ra nếu phát hiện một lỗi cú pháp nhỏ.
[EXP]
Lãng phí công sức, lập trình viên nên trực tiếp tinh chỉnh lỗi nhỏ thay vì bắt đầu lại từ đầu.

@correct: C
@difficulty: 4
@category: 0

## Q3

Trong lúc vội gỡ lỗi, bạn vô tình dán một đoạn mã cấu hình có chứa chuỗi `API_KEY="sk-12345abcde"` lên một Web Chat AI công cộng. Nguy cơ lớn nhất của hành động này là gì?

[A]
AI sẽ từ chối trả lời vì đoạn mã chứa ký tự đặc biệt không hợp lệ.
[EXP]
AI vẫn sẽ xử lý chuỗi văn bản bình thường, không từ chối vì ký tự đặc biệt.
[B]
Dữ liệu nhạy cảm của hệ thống bị lộ và có thể bị sử dụng để huấn luyện mô hình.
[EXP]
Web Chat công cộng thường thu thập dữ liệu người dùng nhập vào để học, gây rò rỉ bảo mật nghiêm trọng.
[C]
Đoạn mã của bạn sẽ chạy chậm hơn vì AI phải mã hóa API Key.
[EXP]
AI trên Web Chat không thực thi (chạy) đoạn mã cấu hình của bạn, nên không ảnh hưởng tốc độ.
[D]
Giao diện chat sẽ bị lỗi hiển thị do không hỗ trợ định dạng chuỗi bí mật.
[EXP]
Giao diện chat hiển thị văn bản thuần túy, không bị lỗi hiển thị vì một chuỗi biến.

@correct: B
@difficulty: 4
@category: 0

## Q4

Bạn yêu cầu AI viết Unit Test cho một hàm tính thuế. AI trả về 10 kịch bản kiểm thử, tất cả đều báo xanh (Pass). Bước tiếp theo hợp lý nhất để đảm bảo chất lượng là gì?

[A]
Chấp nhận kết quả và chuyển sang công việc khác vì 10 kịch bản là quá đủ.
[EXP]
Số lượng không đảm bảo chất lượng, có thể AI đã bỏ sót các giá trị biên (edge cases).
[B]
Tự kiểm tra xem AI đã bao phủ các trường hợp ngoại lệ (như số âm, giá trị null) chưa.
[EXP]
Trách nhiệm của lập trình viên là thiết kế các trường hợp đặc biệt mà AI có xu hướng bỏ qua.
[C]
Yêu cầu AI viết thêm 20 kịch bản nữa để tăng tỷ lệ bao phủ mã (code coverage).
[EXP]
Thêm số lượng kịch bản trùng lặp không có ý nghĩa nếu không nhắm vào các nhánh điều kiện khác biệt.
[D]
Chạy lại Unit Test 5 lần nữa để chắc chắn rằng nó không bị lỗi ngẫu nhiên.
[EXP]
Hàm tính thuế mang tính chất tiền định (deterministic), chạy lại nhiều lần sẽ cùng một kết quả.

@correct: B
@difficulty: 4
@category: 0

## Q5

Khi được yêu cầu viết mã kết nối đến một dịch vụ đám mây, AI đề xuất sử dụng hàm `CloudAuth.connect()`. Tuy nhiên, trình biên dịch báo lỗi hàm này không tồn tại. Tình huống này gọi là gì?

[A]
Lỗi tràn bộ nhớ (Memory Overflow) của hệ thống AI.
[EXP]
Lỗi tràn bộ nhớ liên quan đến phần cứng, không liên quan đến việc sinh mã sai hàm.
[B]
Hiện tượng chuyển đổi ngữ cảnh (Context Switching).
[EXP]
Chuyển đổi ngữ cảnh là việc người dùng thao tác qua lại giữa nhiều ứng dụng khác nhau.
[C]
Hiện tượng ảo giác (Hallucination) của mô hình AI.
[EXP]
Ảo giác là khi AI bịa ra các thông tin, thư viện hoặc hàm trông rất có lý nhưng thực chất không tồn tại.
[D]
Lỗi bảo mật (Security Breach) do thư viện bị đánh cắp.
[EXP]
Đây là lỗi thiếu thư viện hoặc sai tên hàm, không phải là một cuộc tấn công bảo mật.

@correct: C
@difficulty: 4
@category: 0

## Q6

Bạn nhận được một đoạn mã thuật toán cũ khá rườm rà từ đồng nghiệp và muốn tối ưu nó. Cách ứng dụng AI nào sau đây mang lại hiệu suất làm việc cao nhất?

[A]
Dùng IDE Assistant, bôi đen đoạn mã, chọn lệnh "Refactor" để tối ưu trực tiếp.
[EXP]
IDE Assistant thực hiện trực tiếp trên mã nguồn hiện tại, cho phép xem đối chiếu (diff) nhanh chóng.
[B]
Mở trình duyệt, tìm kiếm "Cách tối ưu thuật toán" trên Google rồi tự sửa từng dòng.
[EXP]
Cách này hoàn toàn làm thủ công, không tận dụng được sức mạnh tổng hợp của AI.
[C]
Sao chép từng hàm nhỏ sang Web Chat, hỏi AI, rồi chép lại vào IDE theo từng mảnh.
[EXP]
Cách này gây rủi ro lắp ghép sai vị trí và mất thời gian thao tác chuyển đổi qua lại.
[D]
Yêu cầu AI viết lại toàn bộ file bằng một ngôn ngữ lập trình khác có hiệu năng cao hơn.
[EXP]
Thay đổi ngôn ngữ lập trình của cả dự án là một quyết định tốn kém, không phù hợp để tối ưu nội bộ.

@correct: A
@difficulty: 4
@category: 0

## Q7

Theo quy trình kiểm chứng an toàn mã nguồn do AI sinh ra, bước nào sau đây là quan trọng NHẤT trước khi đưa mã vào dự án thực tế?

[A]
Đảm bảo đoạn mã phải thật dài và sử dụng nhiều hàm toán học phức tạp.
[EXP]
Độ dài và sự phức tạp không đồng nghĩa với mã an toàn; đôi khi mã ngắn gọn lại tốt hơn.
[B]
In mã nguồn ra giấy và đọc kỹ từng dòng để tìm lỗi cú pháp.
[EXP]
Trình biên dịch và IDE đã tự động tìm lỗi cú pháp, việc in ra giấy là không cần thiết.
[C]
Chạy từng dòng lệnh (Debug) và kiểm tra chéo với tài liệu kỹ thuật chính thức.
[EXP]
Kiểm chứng thực tế luồng dữ liệu và tham chiếu tài liệu gốc giúp phát hiện lỗi logic hoặc ảo giác AI.
[D]
Kiểm tra xem AI mất bao nhiêu giây để sinh ra đoạn mã này.
[EXP]
Thời gian phản hồi của AI không liên quan đến tính đúng đắn và bảo mật của đoạn mã.

@correct: C
@difficulty: 4
@category: 0

## Q8

Khi yêu cầu AI viết mã xử lý ngày tháng (Date/Time) trong Java, AI trả về mã sử dụng thư viện `java.util.Date` thay vì thư viện `java.time` hiện đại. Hành động đúng đắn của người học viên là gì?

[A]
Chấp nhận sử dụng vì mã vẫn chạy được, miễn là hoàn thành yêu cầu chức năng.
[EXP]
Làm như vậy học viên sẽ bỏ qua cơ hội học chuẩn kỹ thuật mới, dễ sinh lỗi khó lường trong tương lai.
[B]
Yêu cầu AI viết lại bằng thư viện mới và tự tìm hiểu lý do tại sao thư viện cũ bị hạn chế.
[EXP]
Đây là thái độ học tập chủ động, vừa tận dụng AI sửa mã vừa củng cố kiến thức nền tảng.
[C]
Xóa hoàn toàn AI khỏi máy tính vì nó cung cấp thông tin lỗi thời.
[EXP]
AI dựa vào dữ liệu học trước đây, việc nó đề xuất mã cũ là bình thường và có thể điều chỉnh bằng câu lệnh.
[D]
Dùng Web Chat phàn nàn với bộ phận hỗ trợ khách hàng của công cụ AI.
[EXP]
Việc phàn nàn không giúp giải quyết vấn đề kỹ thuật ngay lập tức, cần dùng Prompt điều chỉnh công cụ.

@correct: B
@difficulty: 4
@category: 0

## Q9

Vì sao các mô hình Web Chat (như ChatGPT bản trình duyệt) gặp khó khăn khi yêu cầu sửa một lỗi "Class Not Found" liên quan đến cấu trúc toàn dự án?

[A]
Vì Web Chat không hỗ trợ ngôn ngữ lập trình Java.
[EXP]
Web Chat hỗ trợ hầu hết các ngôn ngữ lập trình phổ biến, bao gồm cả Java.
[B]
Vì Web Chat bị giới hạn số lượng ký tự đầu vào của mỗi câu lệnh.
[EXP]
Dù giới hạn ký tự, nguyên nhân cốt lõi là Web Chat không nhìn thấy cấu trúc file.
[C]
Vì Web Chat không thể tự động đọc và liên kết các file khác nhau trong môi trường máy bộ.
[EXP]
Web Chat chạy độc lập trên trình duyệt, không có quyền truy cập và phân tích thư mục mã nguồn dự án của bạn.
[D]
Vì Web Chat chỉ có khả năng xử lý hình ảnh và văn bản thuần túy.
[EXP]
Web Chat hoàn toàn có khả năng xử lý mã nguồn (code) cực kỳ tốt.

@correct: C
@difficulty: 5
@category: 0

## Q10

Hậu quả nghiêm trọng nhất của việc sinh viên có thói quen sao chép mã AI mà không hiểu logic bên trong là gì?

[A]
Sinh viên sẽ hoàn thành bài tập nhanh hơn thời gian quy định.
[EXP]
Đây không phải hậu quả nghiêm trọng, mà là một lợi ích ngắn hạn che mờ tác hại dài hạn.
[B]
Đoạn mã sẽ chiếm nhiều dung lượng ổ cứng hơn bình thường.
[EXP]
Mã nguồn là văn bản thô, dung lượng chiếm không đáng kể so với ổ cứng.
[C]
Mất đi năng lực phản biện kỹ thuật và khả năng gỡ lỗi hệ thống trong môi trường thực tế.
[EXP]
Việc phụ thuộc mù quáng làm thui chột tư duy logic, kỹ năng không thể thiếu của kỹ sư phần mềm.
[D]
Mô hình AI sẽ tự động tính phí sử dụng do sao chép quá nhiều.
[EXP]
Việc tính phí dựa trên giới hạn gói tài khoản, không liên quan trực tiếp đến việc có hiểu code hay không.

@correct: C
@difficulty: 5
@category: 0

## Q11

"Chuyển đổi ngữ cảnh" (Context Switching) khi làm việc song song giữa IDE và Web Chat làm giảm năng suất vì nguyên nhân chủ yếu nào?

[A]
Lập trình viên phải thao tác chuột liên tục, gây hao mòn thiết bị phần cứng.
[EXP]
Hao mòn thiết bị là yếu tố không đáng kể và không phải cốt lõi làm giảm năng suất não bộ.
[B]
Mất thời gian điều chỉnh lại sự tập trung và dòng suy nghĩ mỗi khi chuyển đổi màn hình.
[EXP]
Bộ não con người tiêu tốn năng lượng lớn để thiết lập lại sự tập trung khi bối cảnh thay đổi liên tục.
[C]
Môi trường IDE thường bị đứng máy mỗi khi người dùng mở trình duyệt web.
[EXP]
IDE hiện đại rất nhẹ và máy tính đủ sức chạy song song nhiều ứng dụng mà không đứng máy.
[D]
Trình duyệt web luôn ưu tiên hiển thị quảng cáo trước khi hiển thị kết quả AI.
[EXP]
Các công cụ AI phổ biến dành cho lập trình thường không chèn quảng cáo trước kết quả.

@correct: B
@difficulty: 5
@category: 0

## Q12

Khác biệt cơ bản nhất giữa Trợ lý tích hợp tiêu chuẩn (Inline Code Assistant) và Trợ lý cấp cao (Agentic Assistant) là gì?

[A]
Trợ lý tiêu chuẩn chỉ có thể sinh mã cho một dòng, Agentic Assistant sinh được cho nhiều dòng.
[EXP]
Trợ lý tiêu chuẩn hiện đại cũng có thể sinh được khối mã nhiều dòng.
[B]
Trợ lý tiêu chuẩn chỉ dùng để viết ghi chú, Agentic Assistant dùng để viết mã.
[EXP]
Cả hai đều có chức năng chính là viết mã lập trình, không chỉ ghi chú.
[C]
Trợ lý tiêu chuẩn chỉ đọc ngữ cảnh file hiện tại, Agentic Assistant có thể lập chỉ mục và điều hướng toàn bộ dự án.
[EXP]
Agentic Assistant mạnh mẽ ở khả năng tự đọc các file liên kết trong dự án để đưa ra giải pháp toàn cục.
[D]
Trợ lý tiêu chuẩn là miễn phí, còn Agentic Assistant luôn yêu cầu trả phí doanh nghiệp.
[EXP]
Vấn đề chi phí không phải là sự khác biệt cơ bản về tính năng và luồng vận hành công nghệ.

@correct: C
@difficulty: 5
@category: 0

## Q13

Nguyên nhân cốt lõi dẫn đến hiện tượng "ảo giác" (hallucination) trong các mô hình AI ngôn ngữ là do đâu?

[A]
Do AI lưu trữ toàn bộ dữ liệu internet trong máy chủ nhưng tốc độ truy xuất quá chậm.
[EXP]
AI không lưu trữ trực tiếp text của internet mà lưu các tham số trọng số mô hình.
[B]
Do AI bị tin tặc (hacker) tấn công và thay đổi dữ liệu cấu hình.
[EXP]
Ảo giác là bản chất của thuật toán xác suất, không phải do tấn công phần mềm.
[C]
Do AI hoạt động dựa trên việc dự đoán từ tiếp theo theo xác suất, không hiểu thực chất ý nghĩa kiến thức.
[EXP]
LLM dự đoán từ có khả năng xuất hiện cao nhất tiếp theo, đôi khi tạo ra chuỗi văn bản trôi chảy nhưng sai sự thật.
[D]
Do mạng internet kết nối đến máy chủ AI không ổn định, làm rơi rớt dữ liệu đầu vào.
[EXP]
Lỗi mạng sẽ gây ra thông báo lỗi kết nối (timeout), chứ không sinh ra nội dung ảo giác.

@correct: C
@difficulty: 5
@category: 0

## Q14

Vai trò "Người gác cổng" (Gatekeeper) của lập trình viên trong kỷ nguyên AI đòi hỏi kỹ năng nào là quan trọng nhất?

[A]
Khả năng gõ mã nhanh bằng 10 ngón tay để bắt kịp tốc độ sinh mã của AI.
[EXP]
Tốc độ gõ phím không còn là lợi thế khi AI đã lo phần sinh mã.
[B]
Khả năng ghi nhớ toàn bộ tài liệu kỹ thuật của mọi ngôn ngữ lập trình.
[EXP]
Con người không thể nhớ mọi thứ, kỹ năng tra cứu quan trọng hơn ghi nhớ học vẹt.
[C]
Khả năng đọc hiểu mã phức tạp, kiểm định logic bảo mật và kiến trúc hệ thống.
[EXP]
Người gác cổng phải nhận diện được rủi ro, đánh giá chất lượng mã trước khi cho phép tích hợp.
[D]
Khả năng thiết kế giao diện người dùng (UI/UX) thật đẹp mắt.
[EXP]
Đây là kỹ năng của Designer/Frontend, không phản ánh vai trò kiểm duyệt hệ thống của Gatekeeper.

@correct: C
@difficulty: 5
@category: 0

## Q15

Để bảo vệ mã nguồn độc quyền của công ty khi tận dụng sức mạnh AI, giải pháp cấu trúc nào là an toàn và khả thi nhất cho doanh nghiệp?

[A]
Yêu cầu mọi nhân viên chỉ dùng ChatGPT bằng tài khoản cá nhân, công ty không chịu trách nhiệm.
[EXP]
Cách này nguy hiểm nhất vì tài khoản cá nhân đưa thẳng mã nội bộ lên máy chủ công cộng.
[B]
Xây dựng một mô hình ngôn ngữ lớn từ con số 0, ngang ngửa ChatGPT, để dùng riêng.
[EXP]
Không khả thi về mặt chi phí và tài nguyên điện toán đối với hầu hết các doanh nghiệp vừa và nhỏ.
[C]
Sử dụng AI nội bộ (Local LLM) chạy offline hoặc các dịch vụ AI doanh nghiệp cam kết không lưu dữ liệu.
[EXP]
Dịch vụ Enterprise (chẳng hạn Copilot Enterprise, Azure OpenAI) hoặc Local AI giải quyết triệt để rủi ro rò rỉ dữ liệu.
[D]
Chỉ cho phép AI xử lý các mã nguồn giao diện (Frontend), cấm tuyệt đối dùng AI cho mã Backend.
[EXP]
Mã giao diện cũng có thể chứa logic quan trọng, sự phân biệt này không giải quyết tận gốc vấn đề bảo mật.

@correct: C
@difficulty: 6
@category: 0

## Q16

Trong quá trình phát triển một tính năng phức tạp yêu cầu tích hợp API hoàn toàn mới, luồng làm việc (Workflow) nào sau đây phối hợp hiệu quả nhất các loại công cụ AI?

[A]
Dùng IDE Assistant sinh ngay toàn bộ file, sau đó dùng Web Chat để tìm hiểu xem API đó làm gì.
[EXP]
Sinh mã mù quáng trước khi hiểu nghiệp vụ dễ tạo ra rác hệ thống, cần làm ngược lại.
[B]
Dùng Web Chat thảo luận hướng đi và tài liệu API, sau đó dùng IDE Assistant để viết mã từng hàm theo hướng dẫn.
[EXP]
Web Chat làm tốt nhiệm vụ thiết kế cấp cao, IDE Assistant làm tốt tác vụ thao tác tại chỗ, kết hợp chuẩn xác.
[C]
Dùng duy nhất Agentic Assistant để nó tự động thiết kế, tự gõ mã và tự đưa lên nhánh chính mà không cần can thiệp.
[EXP]
Giao toàn quyền cho Agentic Assistant mà không kiểm duyệt rủi ro logic là vi phạm trách nhiệm người gác cổng.
[D]
Tắt tất cả AI để tập trung đọc hiểu API, sau khi code xong mới mở IDE Assistant để nó tìm lỗi chính tả.
[EXP]
Cách này quá thủ công và lãng phí thời gian khảo sát, không tận dụng tối đa năng suất của AI.

@correct: B
@difficulty: 6
@category: 0

## Q17

Bạn gặp một lỗi `NullPointerException` phức tạp nằm sâu trong hệ thống mà AI gợi ý nhiều lần vẫn sai. Hành động sáng suốt nhất lúc này là gì?

[A]
Chia nhỏ hàm bị lỗi, sử dụng công cụ Debug ghim các biến để xác định dòng gây lỗi trước khi hỏi AI tập trung vào dòng đó.
[EXP]
Việc thu hẹp phạm vi lỗi bằng Debug kết hợp với AI sẽ tạo ngữ cảnh hẹp, tăng xác suất chính xác lên tối đa.
[B]
Tức giận với AI, xóa ngay lập tức tài khoản dịch vụ AI và quyết định từ nay chỉ viết code thủ công.
[EXP]
Phủ nhận công cụ do không biết cách sử dụng sẽ làm chậm tiến trình phát triển bản thân.
[C]
Chụp ảnh màn hình toàn bộ 10 file dự án và dán lên Web Chat để AI tự tìm lỗi.
[EXP]
Web Chat dễ bị "quá tải ngữ cảnh" (Context Overflow) và tiếp tục trả về kết quả ảo giác.
[D]
Thêm lệnh `try/catch` bọc quanh toàn bộ hàm bị lỗi, bỏ qua ngoại lệ và in ra dòng chữ "Đã bắt được lỗi".
[EXP]
Cách xử lý lỗi này là "nuốt ngoại lệ", làm cho hệ thống tiềm ẩn nguy cơ sai lệch dữ liệu nặng nề hơn.

@correct: A
@difficulty: 6
@category: 0

## Q18

Để đảm bảo sinh viên không bị "rỗng" kiến thức khi lạm dụng AI làm bài tập lập trình, nguyên tắc học tập nào sau đây nên được thiết lập?

[A]
Sinh viên bắt buộc phải chép tay lại từng đoạn mã do AI sinh ra ra giấy trắng trước khi nộp.
[EXP]
Chép tay là hình thức cơ học, không giúp sinh viên hiểu bản chất luồng dữ liệu của mã.
[B]
Cấm tuyệt đối mọi hình thức sử dụng AI trong môi trường thực hành của nhà trường.
[EXP]
Lệnh cấm không khả thi và đi ngược lại với thực tế của doanh nghiệp phần mềm hiện đại.
[C]
Sinh viên được phép dùng AI sinh mã, nhưng bắt buộc phải thuyết trình hoặc tự viết Unit Test để chứng minh sự hiểu biết.
[EXP]
Việc chứng minh thông qua bảo vệ code (Code Review) hoặc viết Test khẳng định tư duy sở hữu mã nguồn của học viên.
[D]
Yêu cầu AI viết thêm một đoạn văn bản dài 5 trang giải thích cho đoạn code và sinh viên phải đọc nó.
[EXP]
Đọc văn bản của AI giải thích chưa chắc sinh viên đã hiểu và có thể sinh viên chỉ đọc lướt qua.

@correct: C
@difficulty: 6
@category: 0

## Q19

Bạn muốn nhờ Web Chat giải thích một đoạn logic tính lương có chứa công thức tuyệt mật và danh sách tên nhân viên. Kỹ thuật tiền xử lý (pre-processing) nào nên được áp dụng?

[A]
Mã hóa đoạn code bằng chuẩn Base64 rồi dán lên chat, yêu cầu AI giải mã và giải thích.
[EXP]
Base64 dễ dàng giải mã ngược, thông tin nhạy cảm vẫn bị gửi đi bình thường.
[B]
Tạo một biến ẩn (Hidden Variable) trong hệ thống trước khi gửi đoạn code đó.
[EXP]
Tính năng biến ẩn không có ý nghĩa khi nội dung thực sự vẫn nằm trong đoạn văn bản bạn gửi đi.
[C]
Dùng một ảnh chụp mờ thay vì chữ, để AI tự nhận diện ký tự (OCR) và bỏ qua tên nhân viên.
[EXP]
AI OCR vẫn có thể đọc được ký tự và rủi ro rò rỉ vẫn hiện hữu.
[D]
Thay thế danh sách tên bằng "Nhân viên A", "Nhân viên B", đồng thời mô phỏng công thức bằng các phép toán giả định (dummy).
[EXP]
Việc ẩn danh dữ liệu (Data Anonymization) giữ lại khung logic nhưng bảo vệ được thông tin thực tế tuyệt đối.

@correct: D
@difficulty: 6
@category: 0

## Q20

Trước khi đưa đoạn mã tự động sinh bởi Agentic Assistant vào Production (Môi trường thực tế), tiêu chí đánh giá SÁNG TẠO nào sau đây là quan trọng nhất để ngăn chặn nợ kỹ thuật (Technical Debt)?

[A]
Đoạn mã phải sử dụng nhiều thư viện bên ngoài (Third-party packages) nhất có thể để giảm dung lượng file nội bộ.
[EXP]
Dùng nhiều thư viện ngoài làm tăng sự phụ thuộc, dễ dính lỗ hổng bảo mật và khó nâng cấp hệ thống.
[B]
Đoạn mã không chỉ chạy đúng chức năng mà cấu trúc của nó phải tương thích với các quy ước và kiến trúc hiện tại của dự án.
[EXP]
Mã đúng chức năng nhưng lạc lõng với kiến trúc sẽ làm cho việc bảo trì cực kỳ khó khăn sau này.
[C]
Đoạn mã phải được nén lại (Minified) thành 1 dòng duy nhất để tăng tốc độ biên dịch.
[EXP]
Nén mã chỉ quan trọng đối với Frontend phục vụ tải trang web, không phải tiêu chí đánh giá kiến trúc Backend.
[D]
Đoạn mã phải tự động ghi log mọi biến nội bộ ở mức độ chi tiết nhất (Debug level).
[EXP]
Ghi log quá nhiều ở môi trường thực tế (Production) sẽ làm tốn bộ nhớ và rác file hệ thống.

@correct: B
@difficulty: 6
@category: 0

## Q21

Trong bối cảnh tương tác với Trí tuệ Nhân tạo (AI), "Prompt" được hiểu chính xác là gì?

[A]
Là một loại ngôn ngữ lập trình cấp thấp dùng để giao tiếp trực tiếp với phần cứng máy tính.
[EXP]
Prompt không phải là ngôn ngữ lập trình cấp thấp (như Assembly hay Machine Code).
[B]
Là toàn bộ dữ liệu đầu vào (văn bản, ngữ cảnh, chỉ thị) mà người dùng cung cấp cho AI để thực hiện tác vụ.
[EXP]
Đây là định nghĩa đầy đủ, Prompt đóng vai trò là "bản mô tả yêu cầu" để AI phân tích và đưa ra phản hồi.
[C]
Là thông báo lỗi (Error Message) do AI trả về khi người dùng nhập sai cấu trúc lệnh.
[EXP]
Thông báo lỗi là kết quả do phần mềm phát ra, không phải là chỉ thị của người dùng.
[D]
Là tính năng tự động hoàn thành từ khóa (Auto-complete) trong các trình duyệt web.
[EXP]
Tự động hoàn thành là một tính năng của phần mềm, trong khi Prompt là nội dung đầu vào do bạn chủ động thiết kế.

@correct: B
@difficulty: 7
@category: 1

## Q22

Nguyên lý "Garbage In, Garbage Out" (Đầu vào rác, đầu ra rác) trong Prompt Engineering nhắc nhở lập trình viên điều gì?

[A]
Cần thường xuyên dọn dẹp bộ nhớ đệm (cache) của hệ thống trước khi sử dụng AI.
[EXP]
Việc dọn bộ nhớ không ảnh hưởng đến khả năng hiểu ngữ cảnh hay chất lượng trả lời của mô hình ngôn ngữ.
[B]
Nếu gửi quá nhiều ký tự, AI sẽ tự động trả về một đống ký tự vô nghĩa (rác).
[EXP]
AI có giới hạn độ dài ký tự nhưng không cố tình sinh mã rác chỉ vì câu hỏi dài.
[C]
Nếu câu lệnh thiếu ngữ cảnh và sơ sài, kết quả AI trả về sẽ chung chung và không dùng được.
[EXP]
Chất lượng của mã nguồn do AI sinh ra hoàn toàn phụ thuộc vào mức độ chi tiết của chỉ thị (Prompt) đầu vào.
[D]
Không được sử dụng các thuật ngữ lóng (slang) hoặc từ viết tắt khi trò chuyện với mô hình AI.
[EXP]
AI hiểu tốt hầu hết từ viết tắt và tiếng lóng, nguyên lý này ám chỉ sự hời hợt của thông tin yêu cầu.

@correct: C
@difficulty: 7
@category: 1

## Q23

Thuật ngữ "Steerability" (Tính điều hướng) của một mô hình ngôn ngữ lớn thể hiện qua khả năng nào sau đây?

[A]
AI có thể tự động điều khiển con trỏ chuột của bạn để gõ mã trực tiếp.
[EXP]
AI không chiếm quyền điều khiển thiết bị phần cứng của bạn.
[B]
Khả năng người dùng có thể ép AI tuân thủ một vai trò, định dạng, và ràng buộc nhất định thông qua Prompt.
[EXP]
Bằng cách thêm các giới hạn trong Prompt, bạn đang "bẻ lái" luồng tư duy của AI theo đúng định dạng mình muốn.
[C]
Tốc độ phản hồi của AI nhanh hơn khi có kết nối mạng cáp quang ổn định.
[EXP]
Steerability không liên quan đến tốc độ mạng hay hạ tầng internet.
[D]
Khả năng điều hướng người dùng tự động chuyển sang trang web chứa tài liệu liên quan.
[EXP]
Đây là chức năng gắn liên kết (hyperlink) của trình duyệt, không phải đặc tính của mô hình AI lõi.

@correct: B
@difficulty: 7
@category: 1

## Q24

Tại sao kỹ năng "Prompt Engineering" lại trở nên bắt buộc đối với Lập trình viên hiện đại (AI-Assisted Developer)?

[A]
Bởi vì đây là môn học có tính điểm cộng lớn trong các trường đại học quốc tế.
[EXP]
Điểm đại học không phản ánh nhu cầu sống còn của kỹ năng thực chiến trong môi trường doanh nghiệp.
[B]
Bởi vì nếu không có Prompt Engineering, bạn không thể cài đặt được môi trường IDE.
[EXP]
Môi trường IDE được cài đặt bằng file thực thi bình thường, không liên quan đến cách nhắn tin với AI.
[C]
Bởi vì đầu tư thời gian tinh chỉnh câu lệnh giúp tránh lãng phí hàng giờ để gỡ lỗi mã rác do AI phỏng đoán sai.
[EXP]
Làm rõ yêu cầu ngay từ đầu sẽ ngăn chặn AI sinh mã đồ chơi, sai kiến trúc, tối ưu hóa năng suất gấp nhiều lần.
[D]
Bởi vì viết Prompt tốt sẽ giúp máy tính tiết kiệm điện năng tiêu thụ khi biên dịch mã.
[EXP]
Điện năng biên dịch phần mềm không có mối liên kết trực tiếp đáng kể với việc đặt câu lệnh bằng ngôn ngữ tự nhiên.

@correct: C
@difficulty: 7
@category: 1

## Q25

Nếu bạn muốn AI giải thích cơ chế hoạt động của thuật toán `Merge Sort`, Prompt nào sau đây là TỐT NHẤT theo chuẩn cấu trúc 5 thành phần?

[A]
Giải thích thuật toán Merge Sort cho tôi hiểu.
[EXP]
Quá sơ sài, thiếu thành phần Ràng buộc, Vai trò, và Ngữ cảnh đối tượng người đọc.
[B]
Bạn là chuyên gia Thuật toán. Hãy giải thích cơ chế của Merge Sort dành cho sinh viên năm nhất chưa biết lập trình, sử dụng phép ẩn dụ về việc chia bộ bài, độ dài dưới 300 chữ.
[EXP]
Prompt này có đầy đủ Role (Chuyên gia), Task (Giải thích), Context (Sinh viên năm 1), Format (Phép ẩn dụ), Constraint (Dưới 300 chữ).
[C]
Viết code thuật toán Merge Sort bằng ngôn ngữ C++ và thêm bình luận ở mỗi dòng.
[EXP]
Prompt này không phải là "giải thích thuật toán" mà là yêu cầu "viết code", sai mục tiêu.
[D]
Merge Sort là gì? So sánh nó với Quick Sort và liệt kê ưu nhược điểm.
[EXP]
Câu này thiếu ngữ cảnh và yêu cầu định dạng, AI sẽ trả lời rất chung chung theo sách giáo khoa.

@correct: B
@difficulty: 8
@category: 1

## Q26

Trong câu lệnh: *"Đóng vai một chuyên viên bảo mật cơ sở dữ liệu. Hãy phân tích đoạn mã SQL sau để tìm ra lỗ hổng SQL Injection"*, thành phần "Vai trò" (Role) được định nghĩa là gì?

[A]
Hãy phân tích đoạn mã SQL sau.
[EXP]
Đây là thành phần Nhiệm vụ (Task), không phải Vai trò.
[B]
Lỗ hổng SQL Injection.
[EXP]
Đây là Ràng buộc hoặc tiêu điểm cần tìm kiếm.
[C]
Chuyên viên bảo mật cơ sở dữ liệu.
[EXP]
Việc ép AI vào một Role chuyên biệt giúp nó lấy từ vựng và tư duy phân tích sâu sắc hơn so với người dùng phổ thông.
[D]
Đoạn mã SQL.
[EXP]
Đây là thành phần Ngữ cảnh dữ liệu (Context/Data).

@correct: C
@difficulty: 8
@category: 1

## Q27

Bạn đang yêu cầu AI viết một hàm bằng Javascript. Để AI tuyệt đối **KHÔNG** sử dụng thư viện `Lodash` hay `jQuery`, bạn cần tập trung vào thành phần nào của Prompt?

[A]
Định dạng đầu ra (Format).
[EXP]
Định dạng (ví dụ: in đậm, tạo bảng, in ra JSON) không quyết định thư viện nào được dùng.
[B]
Ràng buộc (Constraint).
[EXP]
Bằng cách thiết lập Constraint "Chỉ dùng Vanilla JS, không import thư viện ngoài", AI sẽ bị khóa đường dẫn tới các thư viện.
[C]
Mục tiêu tác vụ (Task).
[EXP]
Mục tiêu là "Viết một hàm", điều đó không đủ sức ngăn cản AI dùng thư viện cho nhanh.
[D]
Vai trò (Role).
[EXP]
Vai trò "Lập trình viên JS" không có nghĩa là họ không được dùng thư viện hỗ trợ.

@correct: B
@difficulty: 8
@category: 1

## Q28

Khi bạn đã cung cấp một Prompt khá đầy đủ nhưng AI trả lời ra một đoạn văn bản thô thay vì một cấu trúc JSON như mong muốn. Hành động khắc phục hiệu quả nhất là gì?

[A]
Tạo một khung chat mới hoàn toàn, khởi động lại máy tính và thử lại.
[EXP]
Làm việc này gây lãng phí, lỗi là do cấu trúc lệnh chưa mạnh, không phải do phần cứng.
[B]
Bổ sung thành phần "Định dạng" (Format) bằng câu: "Chỉ trả về định dạng JSON thuần túy, không kèm văn bản giải thích".
[EXP]
Việc bổ sung rõ ràng cấu trúc đầu ra ép mô hình tuân thủ tuyệt đối định dạng giao tiếp của hệ thống.
[C]
Yêu cầu AI viết lại bằng ngôn ngữ lập trình Python thay vì cấu trúc JSON.
[EXP]
Python là ngôn ngữ xử lý, JSON là cấu trúc biểu diễn dữ liệu, đổi sang Python là sai yêu cầu ban đầu.
[D]
Bỏ qua kết quả của AI và tự gõ lại chuỗi JSON bằng tay.
[EXP]
Cách này mất thời gian và không cải thiện kỹ năng Prompt lặp lại (Iterative Prompting) của bạn.

@correct: B
@difficulty: 8
@category: 1

## Q29

Xem xét hai câu lệnh sau để viết mã Java:
- (A): *"Tạo class User có id và tên"*
- (B): *"Tạo class User. Yêu cầu: áp dụng tính đóng gói (private), có getter/setter và constructor đầy đủ tham số."*

Vì sao câu lệnh (B) sẽ tạo ra mã nguồn phù hợp cho dự án hơn câu lệnh (A)?

[A]
Vì câu (B) có nhiều chữ hơn, nên AI cảm thấy người dùng lịch sự hơn và trả lời tốt hơn.
[EXP]
Độ dài văn bản hay phép lịch sự không tác động đến AI bằng ngữ nghĩa kỹ thuật của văn bản.
[B]
Vì câu (A) bị thiếu mất từ khóa "trong ngôn ngữ Java", làm AI nhầm lẫn sang ngôn ngữ khác.
[EXP]
AI có thể đoán đúng ngôn ngữ dựa trên từ "class", nhưng vấn đề cốt lõi là cấu trúc bên trong nó.
[C]
Vì câu (B) đưa ra các ràng buộc hướng đối tượng cụ thể, giúp AI giới hạn không gian sinh mã đồ chơi.
[EXP]
Các ràng buộc kỹ thuật (đóng gói, constructor) là "chiếc vô lăng" hướng AI sinh ra đoạn code mang chuẩn công nghiệp.
[D]
Vì câu (B) có chứa ký hiệu ngoặc đơn `()` làm kích hoạt chế độ gỡ lỗi hệ thống của mô hình.
[EXP]
Dấu ngoặc đơn chỉ là ký tự thông thường, không đóng vai trò kích hoạt tính năng ẩn nào.

@correct: C
@difficulty: 9
@category: 1

## Q30

Một thực tập sinh than phiền: *"Em bảo ChatGPT viết hàm kết nối Database mà nó trả về đoạn code để lộ hết password public."* Phân tích theo góc độ Prompt Engineering, lỗi cốt lõi ở đây là gì?

[A]
Sinh viên đã quên gắn vai trò (Role) "Chuyên gia cơ sở dữ liệu" cho máy.
[EXP]
Vai trò rất tốt, nhưng thiếu ràng buộc bảo mật mới là nguyên nhân trực tiếp dẫn tới code lộ cấu hình.
[B]
Mô hình ChatGPT phiên bản miễn phí bị lỗi, cần phải mua bản trả phí mới có tính bảo mật.
[EXP]
Mô hình trả phí cũng sẽ sinh ra code rác nếu như Prompt đầu vào không được cấu trúc tốt.
[C]
Sinh viên đã vi phạm nguyên lý "Garbage in, Garbage out" khi đưa ra một mục tiêu quá chung chung, thiếu ngữ cảnh và ràng buộc nghiệp vụ.
[EXP]
AI tối ưu sự đơn giản, nếu không yêu cầu tính đóng gói hay biến môi trường, nó mặc định dùng cách dễ nhất (gán tĩnh).
[D]
Cơ sở dữ liệu của công ty đang sử dụng công nghệ quá cũ nên AI không nhận diện được định dạng kết nối an toàn.
[EXP]
AI hoàn toàn nắm vững công nghệ cũ lẫn mới, do lệnh thiếu chỉ thị dẫn tới kết quả không an toàn.

@correct: C
@difficulty: 9
@category: 1
