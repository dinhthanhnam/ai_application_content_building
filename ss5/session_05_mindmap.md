# Kỹ thuật đặt Prompt nâng cao (Phần 1)

## Kỹ thuật Prompt suy luận theo các bước

### Mục tiêu học tập
- Nắm vững khái niệm Chain-of-thought Prompting
- Phân tích sự khác biệt về chất lượng đầu ra giữa Zero-shot và Chain-of-thought
- Thực hiện thiết kế câu lệnh Chain-of-thought giải quyết bài toán phức tạp
- Áp dụng tư duy bẻ gãy vấn đề giảm thiểu ảo giác của AI

### Đặt vấn đề thực tế
- Thuật toán tính phí giao hàng phức tạp phụ thuộc nhiều biến số
- Prompt ăn liền khiến AI sinh code bỏ sót bước kiểm tra điều kiện ưu tiên
- Nhu cầu buộc AI suy luận chậm lại để đảm bảo chính xác

### Kiến thức cốt lõi
- Khái niệm Chain-of-thought là ép AI trình bày quá trình suy luận nội bộ
- Tác dụng chia nhỏ bài toán giảm thiểu lỗi logic và điều kiện biên
- So sánh Zero-shot nhả code ngay lập tức với Chain-of-thought phân tích từng bước
- Câu thần chú kích hoạt CoT tự động như Hãy suy nghĩ từng bước một

### Phân tích tình huống thực tế
- Bối cảnh hệ thống phân phối quảng cáo cần lọc và sắp xếp chiến dịch
- Thách thức thuật toán phức tạp dễ bị bỏ sót điều kiện tuổi hoặc chậm hiệu năng
- Cách tiếp cận thiết kế Prompt phân chia rõ bước lọc và bước sắp xếp
- Kết quả AI tự nhận diện tối ưu hóa bộ lọc trước khi sắp xếp và viết code chuẩn

### Demo minh họa
- Mục tiêu tái cấu trúc khối lệnh điều kiện Nested If-Else trong Java
- Chuẩn bị mã nguồn spaghetti cấp tín dụng ngân hàng
- Áp dụng Prompt CoT 5 thành phần chi tiết hóa các bước phân tích logic
- Kết quả mong đợi mã nguồn sạch sử dụng mệnh đề bảo vệ không chứa lỗi ảo giác

### Tổng kết
- CoT giúp AI đạt độ chính xác cao trong các nhiệm vụ phức tạp
- Nên chủ động phân rã bước suy luận thay vì phó mặc cho AI
- Tránh lạm dụng CoT cho các câu hỏi quá đơn giản gây tốn tài nguyên và thời gian

## Kỹ thuật Prompt so sánh, đưa lựa chọn, phân tích giả định

### Mục tiêu học tập
- Biến AI thành đối tác kỹ thuật phân tích đa chiều
- Thiết kế Prompt yêu cầu AI đưa ra nhiều phương án kiến trúc kèm bảng so sánh
- Vận dụng kỹ thuật phân tích giả định đánh giá rủi ro hệ thống
- Áp dụng thiết kế hệ thống và lựa chọn thư viện trong dự án thực tế

### Đặt vấn đề thực tế
- Xây dựng tính năng lưu Audit Log cho dự án ngân hàng
- Lập trình viên yêu cầu AI sinh mã lưu vào SQL dẫn đến nghẽn hệ thống sau sáu tháng
- Bài học về tầm quan trọng của quyết định thiết kế trước khi viết dòng mã đầu tiên

### Kiến thức cốt lõi
- Kỹ thuật yêu cầu đưa ra nhiều phương án so sánh
- Khung phân tích điểm mạnh điểm yếu và chi phí tài nguyên của từng công nghệ
- Kỹ thuật phân tích giả định What-if đặt ra các kịch bản cực đoan để kiểm thử
- Vai trò đối tác kỹ thuật giúp lập trình viên mở rộng góc nhìn kiến trúc

### Phân tích tình huống thực tế
- Bối cảnh dự án lưu trữ tệp tin người dùng lớn
- Thách thức lựa chọn giữa lưu trực tiếp Database và lưu Cloud Storage
- Cách tiếp cận Prompt yêu cầu so sánh hai phương án theo tiêu chí chi phí bảo trì và tốc độ
- Kết quả đội ngũ chọn AWS S3 kết hợp lưu metadata ở Database giúp tối ưu hiệu năng

### Demo minh họa
- Mục tiêu so sánh hai thư viện Java JSON là Jackson và Gson
- Prompt thiết kế yêu cầu AI đóng vai Solution Architect so sánh và đưa khuyến nghị
- Kết quả mong đợi bảng so sánh chi tiết về hiệu năng độ linh hoạt và thư viện đề xuất cho Spring Boot

### Tổng kết
- Đưa ra quyết định thiết kế đúng quan trọng hơn việc gõ mã nguồn nhanh
- Sử dụng AI làm người phản biện để phát hiện các lỗ hổng kiến trúc sớm
- Luôn đặt câu hỏi giả định What-if để dự phòng các kịch bản quá tải hệ thống

## Cải tiến đầu ra qua các vòng chỉnh sửa Prompt

### Mục tiêu học tập
- Phân biệt sửa lỗi lặp cơ bản và cải tiến đầu ra nâng cao đạt chuẩn Production-ready
- Nhận diện các lỗi tiềm ẩn của code AI sinh ra như thiếu validate, log, exception
- Thực hiện thêm ràng buộc chuyên sâu vào Prompt để gọt giũa kết quả qua từng vòng
- Áp dụng quy trình nâng cấp thiết kế code Java an toàn tuân thủ Clean Code

### Đặt vấn đề thực tế
- Viết API RESTful thêm mới nhân viên vào cơ sở dữ liệu bằng Spring Boot
- Code AI sinh ra chạy tốt trên local nhưng bị Tech Lead từ chối
- Lý do thiếu validate dữ liệu, thiếu ghi log, thiếu xử lý ngoại lệ an toàn

### Kiến thức cốt lõi
- Sự khác biệt giữa code chạy được và code sẵn sàng vận hành thực tế
- Ba trụ cột cốt lõi của code Production-ready gồm Validate đầu vào, Exception Handling, Logging
- Quy trình cải tiến Prompt gồm đánh giá mã nguồn, xác định phần thiếu, bổ sung ràng buộc cụ thể
- Kỹ thuật ép AI tuân thủ Coding Convention của dự án

### Phân tích tình huống thực tế
- Bối cảnh xây dựng API thanh toán cho ứng dụng thương mại điện tử
- Thách thức API sinh ra thiếu bảo mật và xử lý lỗi dễ gây mất tiền của khách hàng
- Cách tiếp cận chỉnh sửa Prompt qua 3 vòng từ API thô đến API có bắt lỗi và có logging đầy đủ
- Kết quả mã nguồn API thanh toán đạt chuẩn bảo mật và được Tech Lead phê duyệt

### Demo minh họa
- Mục tiêu gọt giũa API đăng ký người dùng Spring Boot qua các vòng chỉnh sửa
- Vòng 1 viết Prompt sinh mã nguồn cơ bản chạy được
- Vòng 2 chỉnh sửa Prompt yêu cầu thêm validate và bắt lỗi tập trung bằng ControllerAdvice
- Vòng 3 chỉnh sửa Prompt yêu cầu thêm logging dùng SLF4J logback
- Kết quả mong đợi mã nguồn Spring Boot đạt chuẩn doanh nghiệp qua từng phiên bản

### Tổng kết
- Không bao giờ sử dụng trực tiếp code AI sinh ra ở lượt chat đầu tiên cho Production
- Ràng buộc càng chi tiết thì mã nguồn trả về càng ít lỗi bảo mật và hiệu năng
- Quy trình code review chéo mã nguồn AI là bắt buộc đối với kỹ sư chuyên nghiệp

## Viết Prompt để học kiến thức kỹ thuật

### Mục tiêu học tập
- Nắm vững bộ 4 kỹ năng viết Prompt giải mã tài liệu kiến thức phức tạp
- Phân tích và so sánh các khái niệm công nghệ tương đồng trong hệ sinh thái Java
- Vận dụng kỹ thuật giải thích theo cấp độ để phá vỡ rào cản thuật ngữ trừu tượng
- Yêu cầu AI tạo ví dụ minh họa bằng code cụ thể để chuyển lý thuyết thành thực tế

### Đặt vấn đề thực tế
- Tech Lead yêu cầu tìm hiểu Inversion of Control và Dependency Injection trong Spring Boot
- Tìm kiếm Google trả về các định nghĩa trừu tượng hàn lâm khó hình dung
- Nhu cầu biến AI thành gia sư cá nhân kiên nhẫn để giải nghĩa trực quan bằng ví dụ thực tế

### Kiến thức cốt lõi
- Kỹ thuật yêu cầu giải thích khái niệm kèm theo bối cảnh thực tế để tránh lý thuyết suông
- Kỹ thuật so sánh cặp khái niệm dễ gây nhầm lẫn bằng bảng ánh xạ thuộc tính
- Kỹ thuật yêu cầu minh họa bằng mã nguồn tối giản mô tả hoạt động
- Kỹ thuật phân tầng cấp độ hiểu từ trẻ 5 tuổi đến lập trình viên Junior và Senior

### Phân tích tình huống thực tế
- Bối cảnh sinh viên mới học về bất đồng bộ trong Java
- Thách thức khó phân biệt Thread, Runnable, và CompletableFuture
- Cách tiếp cận Prompt yêu cầu giải thích theo cấp độ sinh viên năm nhất và so sánh 3 khái niệm
- Kết quả sinh viên hiểu rõ cơ chế hoạt động và cách áp dụng CompletableFuture trong dự án web

### Demo minh họa
- Mục tiêu học và làm chủ khái niệm Spring Bean Scope qua AI
- Prompt yêu cầu giải thích Singleton và Prototype scope theo kiểu ẩn dụ đời thực
- Prompt yêu cầu sinh code Java minh họa sự khác biệt khi gọi hai scope này
- Kết quả mong đợi hiểu sâu sắc cơ chế quản lý vòng đời đối tượng của Spring IoC container

### Tổng kết
- AI là gia sư công nghệ tốt nhất nếu biết cách khai thác
- Luôn kết hợp giữa định nghĩa ẩn dụ, bảng so sánh và code demo chạy thử
- Việc chuyển đổi linh hoạt các cấp độ giải thích giúp làm chủ kiến thức nhanh gấp nhiều lần
