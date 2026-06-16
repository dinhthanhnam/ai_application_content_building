# Kỹ thuật đặt Prompt nâng cao (Phần 2)

## Prompt viết hàm hoặc code snippet theo mô tả

### Mục tiêu học tập
- Nắm vững cấu trúc bốn thành phần của Prompt sinh mã nguồn chuyên nghiệp
- Phân tích và nâng cấp Chain-of-Thought thành cơ chế tư duy luồng chạy nháp
- Thực hiện thiết kế câu lệnh sinh code có ràng buộc rõ ràng xử lý dữ liệu phức tạp
- Áp dụng kỹ thuật sinh code tự động tăng tốc độ phát triển dự án Java

### Đặt vấn đề thực tế
- Lập trình viên viết prompt thô chuyển đổi CSV thành DTO
- Mã nguồn sinh ra bị sập khi gặp lỗi dữ liệu trống hoặc sai định dạng số
- Cần thiết kế prompt có ràng buộc rõ ràng để bẫy toàn bộ lỗi biên dữ liệu

### Kiến thức cốt lõi
- Khung cấu trúc bốn thành phần gồm dữ liệu đầu vào dữ liệu đầu ra logic xử lý và công nghệ
- Kỹ thuật nâng cấp Chain-of-thought sang cơ chế chạy nháp Dry-run logic
- Ràng buộc AI phác thảo thuật toán và mô phỏng ca lỗi biên trước khi viết code
- Vai trò kiểm soát kiểu trả về bằng cách định nghĩa trước cấu trúc đối tượng

### Phân tích tình huống thực tế
- Bối cảnh tích hợp dữ liệu giao dịch hàng ngày từ đối tác dạng CSV
- Thách thức dữ liệu thô chứa dòng lỗi dễ làm sập luồng xử lý
- Cách tiếp cận thiết kế prompt tích hợp Dry-run CoT bắt bẫy lỗi định dạng số
- Kết quả mã nguồn sinh ra tự động lọc bỏ dòng lỗi hoạt động ổn định

### Demo minh họa
- Mục tiêu viết prompt tối ưu sinh lớp Java parse CSV an toàn
- Prompt thực hành chi tiết hóa cấu trúc dữ liệu đầu vào đầu ra và các bước chạy nháp
- Mã nguồn Java record kết hợp khối try-catch an toàn dưới bốn mươi lăm dòng

### Tổng kết
- Prompt sinh code phải chỉ định rõ dữ liệu đầu vào đầu ra logic và công nghệ
- Nhúng Dry-run CoT giúp triệt tiêu hiện tượng ảo giác logic
- Luôn kiểm soát chặt chẽ cấu trúc đối tượng trả về trong prompt

## Prompt yêu cầu phân tích sửa lỗi từ code và stack-trace

### Mục tiêu học tập
- Nhận diện các thành phần cốt lõi của một Stack Trace trong Java
- Phân tích và nâng cấp Chain-of-thought thành quy trình ba bước debug chuẩn hóa
- Thực hiện thiết kế prompt kết hợp mã nguồn và stack-trace gỡ lỗi liên kết framework
- Áp dụng kỹ thuật debug bằng AI cô lập nguyên nhân gốc rễ và đề xuất bản vá tối thiểu

### Đặt vấn đề thực tế
- Lập trình viên gặp lỗi LazyInitializationException của Hibernate
- Dán lỗi chung chung lên AI nhận về giải pháp cấu hình sai làm nghẽn hệ thống N+1 query
- Bài học về việc cung cấp mã nguồn ngữ cảnh và yêu cầu tìm nguyên nhân gốc rễ trước khi sửa

### Kiến thức cốt lõi
- Cấu trúc vết ngăn xếp gồm loại ngoại lệ thông điệp chi tiết và dòng code gây lỗi
- Quy trình ba bước debug gồm cung cấp lỗi và mã nguồn bắt AI phân tích tìm nguyên nhân và đề xuất bản vá
- Ràng buộc AI đưa ra bản vá tối thiểu ít xâm lấn và giải thích tác động phụ
- Kỹ thuật What-if so sánh các phương án sửa lỗi hiệu năng

### Phân tích tình huống thực tế
- Bối cảnh API lấy thông tin khách hàng gặp lỗi Hibernate session bị đóng
- Thách thức chọn phương án sửa chữa tránh phát sinh lỗi hiệu năng N+1 truy vấn
- Cách tiếp cận dán code kèm stack-trace yêu cầu so sánh dùng Transactional và JPQL JOIN FETCH
- Kết quả chọn phương án JOIN FETCH tối ưu tốc độ và giải quyết triệt để lỗi

### Demo minh họa
- Mục tiêu gỡ lỗi LazyInitializationException bằng prompt ba bước nâng cao
- Prompt thực hành cung cấp mã nguồn lỗi và stack-trace kèm yêu cầu so sánh
- Kết quả mã nguồn sửa đổi custom JPQL query tối ưu hiệu năng dưới bốn mươi dòng

### Tổng kết
- Không gửi lỗi suông mà phải gửi kèm mã nguồn xung quanh dòng gây lỗi
- Ép AI phân tích nguyên nhân gốc rễ trước khi sinh bản vá
- Sử dụng so sánh phương án để chọn giải pháp an toàn dài hạn cho dự án

## Prompt yêu cầu tái cấu trúc hoặc tối ưu mã nguồn cũ

### Mục tiêu học tập
- Hiểu các nguyên lý tối ưu hóa và tái cấu trúc mã nguồn theo chuẩn Clean Code
- Phân tích và nâng cấp kỹ thuật What-if thành quy trình refactor có kiểm soát
- Thực hiện thiết kế prompt yêu cầu AI tách hàm vi phạm nguyên lý đơn nhiệm
- Áp dụng ràng buộc giữ nguyên chữ ký hàm đảm bảo an toàn hệ thống

### Đặt vấn đề thực tế
- Hàm xử lý đơn hàng dài hơn một trăm dòng vi phạm nguyên lý đơn nhiệm
- Lập trình viên yêu cầu AI tối ưu hóa không ràng buộc làm thay đổi chữ ký hàm gây lỗi hệ thống
- Nhu cầu refactor giữ nguyên giao diện tương tác công khai của lớp

### Kiến thức cốt lõi
- Quy tắc giữ nguyên chữ ký hàm tên hàm kiểu trả về và tham số để tương thích ngược
- Ràng buộc các tiêu chuẩn Clean Code cụ thể như đơn nhiệm và không trùng lặp code
- Giảm độ phức tạp nhận thức loại bỏ cấu trúc lồng nhau và biến tạm
- Quy trình refactor gồm nhập code cũ phân tích CoT và so sánh What-if trước khi sinh code

### Phân tích tình huống thực tế
- Bối cảnh lớp xử lý đơn hàng monolithic gây khó khăn cho việc viết unit test
- Thách thức tái cấu trúc dễ đọc nhưng không làm hỏng các liên kết tích hợp cũ
- Cách tiếp cận prompt refactor ràng buộc chữ ký hàm so sánh helper methods và delegate pattern
- Kết quả mã nguồn được tách thành các hàm private nhỏ gọn dễ viết test

### Demo minh họa
- Mục tiêu viết prompt refactor hàm monolithic thành các hàm private helper
- Chuẩn bị code thô vi phạm nguyên lý đơn nhiệm
- Mã nguồn Java sau refactor cực kỳ gọn gàng giữ nguyên chữ ký API công khai

### Tổng kết
- Luôn đặt ràng buộc tương thích ngược bằng cách khóa chặt chữ ký hàm
- Ứng dụng phân tích What-if trước khi viết code giúp tìm ra cấu trúc tối ưu nhất
- Tách hàm đơn nhiệm là bước đi đầu tiên để làm sạch mã nguồn spaghetti

## Prompt yêu cầu thêm test case kiểm thử logic

### Mục tiêu học tập
- Hiểu cấu trúc và vai trò của unit test trong quy trình phát triển chuyên nghiệp
- Phân tích và nâng cấp kỹ thuật quản trị ngữ cảnh thành kỹ thuật thiết lập ràng buộc mocking
- Thực hiện thiết kế prompt sinh các kịch bản kiểm thử bao phủ luồng đúng và lỗi biên
- Áp dụng mô hình Arrange Act Assert kết hợp JUnit 5 và Mockito viết test độc lập

### Đặt vấn đề thực tế
- Yêu cầu viết unit test cho lớp xử lý thanh toán đạt độ phủ tám mươi phần trăm
- AI sinh code test bị lỗi do cố gắng kết nối database thật và dùng framework cũ
- Nhu cầu viết test case giả lập an toàn sử dụng JUnit 5 và Mockito của dự án

### Kiến thức cốt lõi
- Mô hình Arrange Act Assert giúp phân tách rõ ràng ba giai đoạn của test case
- Kỹ thuật thiết lập ràng buộc Mocking chi tiết tránh gọi dữ liệu thật ngoài môi trường
- Khai báo Mockito annotations và định cấu hình hành vi giả lập cho repository
- Ràng buộc bao phủ ba luồng gồm thành công lỗi biên và ném ngoại lệ

### Phân tích tình huống thực tế
- Bối cảnh lớp dịch vụ thanh toán gọi API bên ngoài
- Thách thức giả lập hành vi API ngân hàng lỗi để kiểm tra luồng bẫy ngoại lệ
- Cách tiếp cận prompt yêu cầu sinh test case dùng JUnit 5 Assertions và Mockito stubbing
- Kết quả test case chạy độc lập dưới một giây bẫy lỗi biên an toàn

### Demo minh họa
- Mục tiêu viết prompt sinh unit test cho lớp thanh toán
- Prompt thực hành quy định rõ các mock objects và mô hình AAA
- Mã nguồn test hoàn chỉnh phủ đầy đủ trường hợp dưới năm mươi dòng

### Tổng kết
- Unit test chuyên nghiệp bắt buộc dùng Mocking để đảm bảo tốc độ chạy test nhanh
- Tuân thủ mô hình AAA giúp code test mạch lạc dễ bảo trì
- Luôn bẫy thử nghiệm các giá trị biên bằng assertThrows đảm bảo hệ thống tự vệ tốt
