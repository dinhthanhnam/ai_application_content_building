# QUIZ CUỐI GIỜ - SESSION 07

## Q1

Bạn muốn AI sinh một hàm Java 17 để chuyển đổi chuỗi CSV lịch sử giao dịch sang Transaction record. Prompt nào dưới đây thiết lập đúng cú pháp cấu phần đầu vào đầu ra?

[A]
Java 17. Viết hàm convert chuỗi. Đầu vào: Chuỗi CSV thô không định rõ số cột. Đầu ra: Transaction record. Logic: Tự định nghĩa bẫy ngoại lệ nếu kiểu số bị nhập sai hoàn toàn.
[EXP]
Prompt này thiếu chỉ định rõ ràng cấu trúc dữ liệu đầu vào (cột, định dạng phân tách) và kiểu trả về mong muốn.
[B]
Java 17. Viết hàm `parseCsv`. Đầu vào: `String csvLine` (định dạng "id,amount,status"). Đầu ra: `TransactionDTO` (record). Logic: Bẫy `NumberFormatException` khi parse amount.
[EXP]
Đúng vì định hình rõ ngôn ngữ, cấu trúc đầu vào kèm định dạng cụ thể, kiểu trả về record và logic bẫy ngoại lệ rõ ràng.
[C]
Java 17. Viết hàm đọc file CSV. Đầu vào: Từng dòng văn bản từ file. Đầu ra: Class TransactionDTO chứa các trường tương ứng. Logic: Tách các cột dữ liệu bằng dấu phẩy để ánh xạ.
[EXP]
Chưa chỉ rõ phiên bản Java 17, chưa quy định sử dụng kiểu record và thiếu logic bẫy lỗi khi chuyển đổi kiểu số.
[D]
Java 17. Viết hàm parse chuỗi. Đầu vào: Dòng dữ liệu thô từ đối tác. Đầu ra: Đối tượng tùy biến. Logic: Kiểm tra các điều kiện null và trống để tránh sập ứng dụng khi runtime.
[EXP]
Lệnh quá chung chung, không chỉ rõ định dạng CSV đầu vào, kiểu đối tượng trả về và cách xử lý lỗi cụ thể.

@correct: B
@difficulty: 10
@category: 1

## Q2

Để AI viết một hàm Java đọc file cấu hình an toàn sử dụng cơ chế giải phóng tài nguyên tự động, cách đặt prompt nào sau đây là chính xác nhất?

[A]
Viết hàm Java 17 đọc file. Đầu vào: `String path`. Logic: Dùng `BufferedReader` trong khối `try-with-resources`, bắt lỗi `IOException` và trả về `List<String>`.
[EXP]
Tối ưu vì chỉ định rõ phiên bản Java, cấu trúc đóng tài nguyên tự động, bắt ngoại lệ cụ thể và kiểu dữ liệu trả về.
[B]
Viết hàm Java 17 đọc file. Đầu vào: `String path`. Logic: Đọc thủ công và đóng tài nguyên trong khối `finally` của `try-catch` truyền thống, trả về `List<String>`.
[EXP]
Dùng finally để đóng tài nguyên là cách cũ, không tối ưu và ngắn gọn bằng cấu trúc try-with-resources của Java 7+.
[C]
Viết hàm Java 17 đọc file. Đầu vào: `String path`. Logic: Tự động tối ưu hiệu năng đọc ghi dữ liệu và xử lý tất cả ngoại lệ phát sinh chung chung, trả về chuỗi.
[EXP]
Thiếu cụ thể về cấu trúc giải phóng tài nguyên (BufferedReader/try-with-resources) và kiểu dữ liệu trả về của hàm.
[D]
Viết hàm Java 17 đọc file. Đầu vào: `String path`. Logic: Đọc file cấu hình hệ thống đồng bộ, nhớ bắt lỗi kiểm tra giá trị null nếu đường dẫn trống, trả về mảng.
[EXP]
Chưa chỉ rõ cấu trúc đọc file, cách thức quản lý đóng tài nguyên tự động và định dạng trả về của dữ liệu.

@correct: A
@difficulty: 10
@category: 1

## Q3

Khi muốn AI viết một đoạn code giả lập (stubbing) hành vi trả về dữ liệu của một đối tượng Mock trong Mockito, prompt nào sau đây cung cấp cú pháp chuẩn?

[A]
Sử dụng Mockito. Viết code stubbing hành vi: mock repository bằng annotation `@MockBean` của Spring Boot để lưu dữ liệu giả lập thay vì gọi database thật.
[EXP]
`@MockBean` dùng cho integration test trong Spring context, không phải cú pháp stubbing hành vi của đối tượng Mock thông thường.
[B]
Sử dụng Mockito. Viết code stubbing hành vi: khi hàm save của repo được gọi thì trả về đối tượng product vừa tạo (không chỉ định cú pháp dòng lệnh Mockito).
[EXP]
Prompt chỉ mô tả nghiệp vụ bằng tiếng Việt, chưa đưa ra các từ khóa cú pháp Mockito cụ thể để AI sinh mã chính xác.
[C]
Sử dụng Mockito. Viết code stubbing hành vi: stubbing hành động tìm kiếm sản phẩm theo ID bất kỳ và tự động trả về một đối tượng rỗng (thiếu cú pháp lệnh).
[EXP]
Thiếu chỉ định cú pháp stubbing cụ thể, AI có thể sinh mã theo nhiều kiểu khác nhau (như dùng BDDMockito thay vì Mockito).
[D]
Sử dụng Mockito. Viết code stubbing hành vi: khi `productRepository.findById(1L)` được gọi, trả về `Optional.of(product)` (sử dụng cú pháp `when().thenReturn()`).
[EXP]
Tối ưu vì quy định rõ đối tượng mock, phương thức gọi kèm tham số, cú pháp stubbing chuẩn và kiểu đối tượng trả về.

@correct: D
@difficulty: 10
@category: 1

## Q4

Bạn cần viết một prompt để AI sinh mã kiểm thử một API Controller có phụ thuộc vào tầng Service. Prompt nào thiết lập đúng ràng buộc đối tượng Mock?

[A]
Sử dụng JUnit 5 và Mockito. Viết test cho Controller, nhớ dùng Mockito để mock toàn bộ các class Repository liên quan để test chạy nhanh hơn.
[EXP]
Controller chỉ trực tiếp gọi Service, mock Repository ở đây là sai tầng và làm phình to cấu hình thiết lập test.
[B]
Sử dụng JUnit 5 và Mockito. Viết test cho Controller, hãy sử dụng Mockito để tự động sinh ra các dữ liệu giả lập cho thực thể đối tượng User.
[EXP]
Chỉ yêu cầu sinh dữ liệu giả cho User DTO, chưa thiết lập ràng buộc mock và tiêm mock đối tượng Service vào Controller.
[C]
Sử dụng JUnit 5 và Mockito. Mock đối tượng `UserService` bằng `@Mock`. Tiêm mock vào `UserController` bằng `@InjectMocks`. Viết test cho API get.
[EXP]
Đúng chuẩn vì xác định rõ đối tượng cần mock, đối tượng cần tiêm mock bằng các annotation tương ứng của Mockito.
[D]
Sử dụng JUnit 5 và Mockito. Viết test cho Controller, sử dụng SpringBootTest để tự động nạp database H2 ảo và chạy kiểm thử tích hợp API.
[EXP]
SpringBootTest nạp integration test context, không phải là unit test độc lập sử dụng Mockito mock trực tiếp.

@correct: C
@difficulty: 10
@category: 1

## Q5

Để AI viết một lớp tiện ích triển khai mẫu thiết kế Singleton an toàn trong môi trường đa luồng, cách đặt prompt nào sau đây là tối ưu?

[A]
Java 17. Viết class `DatabaseConnection` dạng Singleton. Ràng buộc: Đảm bảo tự động khởi tạo kết nối cơ sở dữ liệu dùng chung duy nhất cho toàn bộ hệ thống.
[EXP]
Thiếu ràng buộc an toàn đa luồng, AI mặc định sẽ sinh code dạng Lazy Initialization không an toàn đa luồng.
[B]
Java 17. Viết class `DatabaseConnection` dạng Singleton. Ràng buộc: Đảm bảo an toàn đa luồng bằng kỹ thuật Double-Checked Locking kết hợp từ khóa `volatile`.
[EXP]
Tối ưu vì chỉ định rõ kỹ thuật Double-Checked Locking và từ khóa volatile bắt buộc để đảm bảo an toàn đa luồng.
[C]
Java 17. Viết class `DatabaseConnection` dạng Singleton. Ràng buộc: Sử dụng khối synchronized bao bọc toàn bộ phương thức getInstance để đồng bộ đa luồng.
[EXP]
Synchronized toàn bộ hàm getInstance gây ảnh hưởng nghiêm trọng đến hiệu năng hệ thống khi có nhiều luồng đọc đồng thời.
[D]
Java 17. Viết class `DatabaseConnection` dạng Singleton. Ràng buộc: Hãy kiểm tra và bẫy ngoại lệ null khi thực hiện khởi tạo đối tượng duy nhất của lớp.
[EXP]
Chưa chỉ rõ kỹ thuật đảm bảo an toàn đa luồng (Double-Checked Locking, Bill Pugh, hoặc Enum) để định hướng AI.

@correct: B
@difficulty: 10
@category: 1

## Q6

Bạn muốn AI thêm các chú thích validate dữ liệu vào một lớp Java Record. Prompt nào dưới đây chỉ định đúng cú pháp Spring Validation?

[A]
Java 17 record `UserRequest`. Hãy thêm validation: `@NotBlank` trên field name, `@Email` trên field email, `@Min(18)` trên field age.
[EXP]
Chính xác vì chỉ định rõ kiểu Java record, tên class, các chú thích validate tương ứng trực tiếp trên từng thuộc tính.
[B]
Java 17 record `UserRequest`. Hãy thêm validation: Chỉ tự động kiểm tra xem tuổi có lớn hơn 18 không bằng annotation của Spring Boot.
[EXP]
Yêu cầu mơ hồ, chưa chỉ rõ định dạng class (record hay class thường) và các chú thích validate tiêu chuẩn cụ thể.
[C]
Java 17 record `UserRequest`. Hãy thêm validation: Bẫy lỗi và ném ra ngoại lệ MethodArgumentNotValidException khi chạy validate lớp.
[EXP]
Ngoại lệ MethodArgumentNotValidException do Spring tự ném ra, prompt cần tập trung vào khai báo annotation trên thuộc tính.
[D]
Java 17 record `UserRequest`. Hãy thêm validation: Tự kiểm tra định dạng email người dùng gửi lên và trả về lỗi 400 nếu nhập sai.
[EXP]
Chỉ mô tả hành vi nghiệp vụ và HTTP status, chưa chỉ định rõ cú pháp khai báo các chú thích validate ở tầng thuộc tính.

@correct: A
@difficulty: 10
@category: 1

## Q7

Để AI viết code tối ưu hóa cấu trúc rẽ nhánh switch-case kiểu cũ sang cú pháp hiện đại của Java 17, prompt nào sau đây là chính xác?

[A]
Java 17. Hãy tái cấu trúc hàm phân loại đối tượng (code dưới) sao cho code chạy nhanh hơn và trông ngắn gọn dễ bảo trì hơn so với kiểu switch cũ.
[EXP]
Chưa chỉ rõ phiên bản Java và cú pháp đích mong muốn (Switch Expression / Pattern Matching) để AI tối ưu.
[B]
Java 17. Hãy tái cấu trúc hàm phân loại đối tượng (code dưới) bằng cách chuyển đổi switch-case thành các câu lệnh if-else lồng nhau để dễ gỡ lỗi.
[EXP]
If-else lồng nhau làm code phức tạp và khó bảo trì hơn, đi ngược lại mục tiêu tối ưu hóa mã nguồn.
[C]
Java 17. Hãy tái cấu trúc hàm phân loại đối tượng (code dưới) sử dụng cú pháp switch kiểu mới và đảm bảo trả về kết quả trực tiếp từ khối lệnh.
[EXP]
Mô tả "switch-case kiểu mới" quá chung chung, không chỉ rõ các kỹ thuật Pattern Matching hay Switch Expression.
[D]
Java 17. Hãy tái cấu trúc hàm phân loại đối tượng (code dưới) sử dụng cú pháp Pattern Matching for Switch và trả về kết quả dạng Switch Expression.
[EXP]
Tối ưu vì chỉ định rõ phiên bản Java 17, kỹ thuật đích (Pattern Matching for Switch) và định dạng trả về (Switch Expression).

@correct: D
@difficulty: 10
@category: 1

## Q8

Khi muốn AI sinh mã nguồn Java Stream để lọc và biến đổi danh sách dữ liệu, cách viết prompt nào giúp AI viết code sạch và tối ưu nhất?

[A]
Java 17. Viết luồng Stream để lọc danh sách `User`. Logic: Sử dụng vòng lặp for truyền thống để kiểm tra thuộc tính active và lưu vào danh sách mới.
[EXP]
Yêu cầu sử dụng vòng lặp for truyền thống, không tận dụng được cú pháp khai báo tối giản của Java Stream API.
[B]
Java 17. Viết luồng Stream để lọc danh sách `User`. Logic: Lọc danh sách bất kỳ, nhớ viết thêm các chú thích tiếng Việt giải nghĩa cho từng dòng lệnh.
[EXP]
Chưa chỉ rõ các thao tác nghiệp vụ cụ thể cần thực hiện trong luồng Stream (như filter, map, collect).
[C]
Java 17. Viết luồng Stream để lọc danh sách `User`. Logic: `filter` theo `active == true`, `map` sang `UserDTO`, gom nhóm thành `List` bằng `collect`.
[EXP]
Đúng vì chỉ định rõ phiên bản ngôn ngữ, các toán tử Stream cần gọi (filter, map, collect) và kiểu dữ liệu đích.
[D]
Java 17. Viết luồng Stream để lọc danh sách `User`. Logic: Tìm kiếm các sản phẩm có giá trị lớn hơn 500 đô la và thực hiện in ra màn hình console.
[EXP]
Chỉ mô tả nghiệp vụ lọc và in, chưa quy định cấu trúc chuyển đổi sang DTO và gom nhóm kết quả trả về.

@correct: C
@difficulty: 10
@category: 1

## Q9

Bạn gặp lỗi `NullPointerException` khi chạy một hàm Java. Prompt nào dưới đây tuân thủ đúng bước 1 của quy trình debug 3 bước?

[A]
Hãy sửa lỗi `NullPointerException` cho lớp `UserManager` này càng nhanh càng tốt, tôi cần nộp bài tập này gấp để kịp hạn chót.
[EXP]
Thiếu hoàn toàn mã nguồn ngữ cảnh và Stack Trace lỗi thực tế, AI không thể debug chính xác.
[B]
Đây là code `UserManager.java` và Stack Trace lỗi `NullPointerException` tại dòng 15. Hãy tìm nguyên nhân và đề xuất code sửa.
[EXP]
Tối ưu vì cung cấp đầy đủ cả mã nguồn, Stack Trace lỗi và số dòng gây lỗi cụ thể để AI phân tích.
[C]
Tại sao chương trình Java của tôi lại bị lỗi `NullPointerException` khi tôi thực hiện gọi hàm thêm mới người dùng vào hệ thống?
[EXP]
Câu hỏi lý thuyết thuần túy, không có mã nguồn và Stack Trace lỗi đi kèm để AI cô lập nguyên nhân.
[D]
Hãy viết lại toàn bộ class `UserManager` này bằng Java 17 để đảm bảo nó không bao giờ gặp lỗi `NullPointerException` khi chạy.
[EXP]
Yêu cầu viết lại toàn bộ class mà không cung cấp mã cũ và trace lỗi là phản mẫu, gây mất cấu trúc dự án.

@correct: B
@difficulty: 10
@category: 1

## Q10

Để AI viết Unit Test bắt ngoại lệ bằng JUnit 5, prompt nào dưới đây chỉ định đúng cú pháp assertion?

[A]
JUnit 5. Viết test case `testInvalidAmount`. Ràng buộc: Sử dụng `assertThrows` để kiểm chứng hàm ném ra `IllegalArgumentException` khi truyền số tiền âm.
[EXP]
Tối ưu vì chỉ định rõ framework JUnit 5, phương thức assertThrows và loại ngoại lệ cần kiểm chứng cụ thể.
[B]
JUnit 5. Viết test case `testInvalidAmount`. Ràng buộc: Chỉ kiểm tra xem hàm có ném ra lỗi ngoại lệ chung chung khi người dùng nhập sai số tiền hay không.
[EXP]
Chưa chỉ rõ phiên bản JUnit 5 và cú pháp bắt ngoại lệ (JUnit 4 dùng expected, JUnit 5 dùng assertThrows).
[C]
JUnit 5. Viết test case `testInvalidAmount`. Ràng buộc: Sử dụng Mockito khi truyền số tiền âm thì tự động ném ra ngoại lệ để kiểm chứng luồng giao dịch.
[EXP]
Mockito dùng để mock hành vi của dependency, việc assert ngoại lệ của hàm cần test phải dùng assertion của JUnit.
[D]
JUnit 5. Viết test case `testInvalidAmount`. Ràng buộc: Dùng khối lệnh try-catch kết hợp với fail() để chủ động đánh dấu test case thất bại khi chạy test.
[EXP]
Sử dụng try-catch kết hợp fail() là cách viết cũ của JUnit 3/4, không đúng chuẩn tối giản của JUnit 5.

@correct: A
@difficulty: 10
@category: 1

## Q11

Bạn muốn AI viết một hàm copy file trong Java. Prompt nào thiết lập đúng ràng buộc bảo mật giải phóng tài nguyên tự động?

[A]
Java 17. Viết hàm `copyFile`. Ràng buộc: Copy file từ đường dẫn A sang đường dẫn B sử dụng luồng đọc ghi dữ liệu nhị phân tốc độ cao không cần đóng luồng.
[EXP]
Thiếu ràng buộc đóng tài nguyên và phiên bản ngôn ngữ, AI mặc định sẽ sinh code cũ không an toàn.
[B]
Java 17. Viết hàm `copyFile`. Ràng buộc: Sử dụng FileInputStream và FileOutputStream, đóng các luồng này trong khối finally của try-catch truyền thống.
[EXP]
Sử dụng finally để đóng luồng là cấu pháp cũ, dễ dẫn đến rò rỉ tài nguyên nếu có ngoại lệ phát sinh khi đóng.
[C]
Java 17. Viết hàm `copyFile`. Ràng buộc: Sử dụng thư viện NIO2 (Files.copy) để tối ưu hóa hiệu năng đọc ghi dữ liệu thô trên đĩa cứng hệ thống server.
[EXP]
NIO2 (Files.copy) là một giải pháp tốt nhưng prompt chưa chỉ rõ cấu trúc xử lý ngoại lệ và đóng tài nguyên tự động.
[D]
Java 17. Viết hàm `copyFile`. Ràng buộc: Sử dụng FileInputStream và FileOutputStream bên trong khối `try-with-resources` để tự động đóng luồng dữ liệu.
[EXP]
Tối ưu vì chỉ định rõ phiên bản Java, cấu trúc tự động giải phóng tài nguyên FileInputStream/FileOutputStream trong try-with-resources.

@correct: D
@difficulty: 10
@category: 1

## Q12

Hàm Java của bạn chứa nhiều khối `if-else` lồng nhau. Prompt nào dưới đây yêu cầu AI refactor code theo chuẩn guard clauses?

[A]
Hãy viết lại hàm này bằng cách gộp tất cả các điều kiện if-else vào chung một câu lệnh logic sử dụng toán tử AND.
[EXP]
Gộp điều kiện bằng toán tử AND làm câu lệnh cực kỳ dài và khó đọc, không giải quyết được vấn đề lồng nhau.
[B]
Hãy sử dụng cấu trúc switch-case để thay thế hoàn toàn các khối lệnh if-else lồng nhau này giúp mã nguồn chạy nhanh hơn.
[EXP]
Switch-case chỉ so sánh giá trị bằng, không phù hợp để thay thế các điều kiện so sánh khoảng hoặc logic phức tạp.
[C]
Tái cấu trúc hàm Java này. Ràng buộc: Áp dụng kỹ thuật guard clauses (return sớm) để loại bỏ các khối lệnh if-else lồng nhau.
[EXP]
Đúng hướng vì chỉ định rõ kỹ thuật guard clauses và mục tiêu loại bỏ các khối lệnh lồng nhau phức tạp.
[D]
Hãy viết lại hàm này bằng cách sử dụng Java Stream API để duyệt qua các điều kiện rẽ nhánh nghiệp vụ một cách tuần tự.
[EXP]
Java Stream API dùng để xử lý collection, không dùng để tái cấu trúc logic rẽ nhánh điều kiện của biến đơn lẻ.

@correct: C
@difficulty: 10
@category: 1

## Q13

Bạn muốn viết một prompt để AI tìm và sửa lỗi sập ứng dụng (crash) do dữ liệu đầu vào trống trong hàm parse CSV. Cách tiếp cận nào giúp AI đưa ra giải pháp bảo vệ an toàn nhất ngay lần đầu?

[A]
Cung cấp mã nguồn của hàm parse CSV kèm theo thông báo lỗi cụ thể và yêu cầu AI tự động viết lại hàm đó theo chuẩn Java mới.
[EXP]
Prompt này thiếu các ràng buộc và thông tin kiểm tra dữ liệu biên cụ thể, dẫn đến việc AI có thể sinh code chưa bảo mật.
[B]
Cung cấp mã nguồn của hàm parse CSV kèm theo dòng dữ liệu gây crash cụ thể và yêu cầu AI sửa lỗi mà không làm thay đổi các logic khác.
[EXP]
Cung cấp dữ liệu crash giúp AI sửa đúng lỗi đó nhưng không đảm bảo AI chủ động viết thêm các điều kiện phòng vệ biên khác.
[C]
Cung cấp mã nguồn của hàm parse CSV và chỉ định rõ ràng ràng buộc phải kiểm tra điều kiện biên và validate dữ liệu đầu vào trong prompt.
[EXP]
Tối ưu vì việc thiết lập ràng buộc validate dữ liệu đầu vào và kiểm tra điều kiện biên rõ ràng ép AI phải sinh code phòng vệ an toàn.
[D]
Cung cấp mã nguồn của hàm parse CSV và yêu cầu AI giải thích lý do tại sao hàm này lại có thể bị sập khi chạy trên môi trường thực tế.
[EXP]
Đây là prompt yêu cầu giải thích lý thuyết (thông hiểu), không trực tiếp ép AI sinh ra mã nguồn giải quyết triệt để lỗi crash.

@correct: C
@difficulty: 11
@category: 1

## Q14

Khi nhờ AI tối ưu một đoạn code bị lỗi hiệu năng N+1 query trong Spring Boot, cách viết prompt nào giúp bạn nhận được giải pháp tối ưu nhất ở tầng cơ sở dữ liệu?

[A]
Cung cấp thực thể JPA và yêu cầu AI viết lại truy vấn để nạp trước các thực thể liên kết bằng cách sử dụng cấu trúc câu lệnh JPQL `JOIN FETCH`.
[EXP]
Đúng vì chỉ định rõ giải pháp kĩ thuật JOIN FETCH ép AI sinh mã gộp các câu SELECT riêng rẽ thành một truy vấn duy nhất.
[B]
Cung cấp thực thể JPA và yêu cầu AI chuyển đổi FetchType sang EAGER toàn cục để hệ thống tự động nạp toàn bộ danh sách đối tượng liên kết.
[EXP]
EAGER toàn cục là thiết kế tồi làm phình to dữ liệu trả về ở các API khác không cần thiết, gây sụt giảm hiệu năng.
[C]
Cung cấp thực thể JPA và yêu cầu AI thiết lập thêm một lớp cache trung gian bằng Redis để lưu trữ toàn bộ dữ liệu của thực thể liên kết.
[EXP]
Cache Redis chỉ giải quyết phần ngọn bằng cách lưu tạm, không sửa được thiết kế truy vấn lỗi N+1 gốc dưới database.
[D]
Cung cấp thực thể JPA và yêu cầu AI sử dụng vòng lặp trong Service để truy xuất tuần tự các danh sách con của thực thể ngay khi cần.
[EXP]
Vòng lặp trong Service vẫn phát sinh N câu truy vấn SELECT con độc lập, không tối ưu được số lượng truy vấn xuống DB.

@correct: A
@difficulty: 11
@category: 1

## Q15

Bạn muốn AI sinh mã Unit Test sử dụng Mockito để kiểm thử một hàm Service. Để tránh tình trạng test case bị lỗi NullPointerException do thiếu mock data, prompt cần thiết lập ràng buộc gì?

[A]
Ràng buộc AI phải viết code giả lập (stubbing) hành vi cho tất cả các dependency được gọi trong hàm cần test bằng cú pháp `when().thenReturn()`.
[EXP]
Đúng vì Mockito mock mặc định trả về null cho object, bắt buộc phải stubbing đầy đủ hành vi để tránh NullPointerException khi gọi.
[B]
Ràng buộc AI phải khởi tạo database ảo H2 trong cấu hình test và thực hiện lưu dữ liệu giả lập vào bảng trước khi tiến hành chạy test.
[EXP]
Unit test độc lập chạy không cần nạp database ảo H2, việc nạp database H2 là đặc thù của kiểm thử tích hợp (integration test).
[C]
Ràng buộc AI phải sử dụng annotation `@SpringBootTest` để nạp toàn bộ Spring context và tự động tiêm các bean thật vào lớp kiểm thử.
[EXP]
`@SpringBootTest` nạp toàn bộ context làm chậm tốc độ chạy test và không đúng chuẩn thiết kế của kiểm thử đơn vị độc lập.
[D]
Ràng buộc AI phải tự viết thêm các hàm kiểm tra giá trị null cho toàn bộ các thuộc tính của đối tượng mock trước khi gọi test.
[EXP]
Viết code check null thủ công trong test class không giải quyết được hành vi trả về của mock object, gây loãng mã nguồn kiểm thử.

@correct: A
@difficulty: 11
@category: 1

## Q16

Trong quy trình 3 bước debug bằng AI, tại sao ở bước đầu tiên ta nên yêu cầu AI giải thích nguyên nhân gây lỗi (Root Cause) trước khi yêu cầu sinh code sửa lỗi?

[A]
Để đảm bảo AI hiểu đúng bản chất vấn đề và ngữ cảnh lỗi, từ đó tránh việc sinh ra các bản vá chắp vá hoặc gây thêm lỗi logic mới.
[EXP]
Đúng vì ép AI tìm hiểu Root Cause giúp ngăn chặn hành vi đoán mò giải pháp sửa lỗi, tạo ra mã nguồn tối ưu và an toàn hơn.
[B]
Để giúp học sinh tự học lại kiến thức lập trình cơ bản và không cần phụ thuộc vào mã nguồn do AI tự động tạo ra trong quá trình học.
[EXP]
Mục tiêu của quy trình là tối ưu hóa độ chính xác của AI khi sinh bản vá, việc tự học của học sinh chỉ là lợi ích đi kèm phụ.
[C]
Để AI tự động kiểm tra cú pháp của toàn bộ file code hiện tại nhằm phát hiện ra các lỗi gõ sai chính tả trước khi tiến hành sửa.
[EXP]
AI tự kiểm tra cú pháp khi sinh code, bước giải thích Root Cause nhằm phân tích logic lỗi runtime phức tạp chứ không chỉ cú pháp.
[D]
Để hệ thống kiểm thử CI/CD của dự án có thể dễ dàng ghi nhận các bước thực hiện và phân tích độ phức tạp của thuật toán sửa lỗi.
[EXP]
Hệ thống CI/CD chạy test case tự động trên mã nguồn, không đọc hiểu hay lưu trữ các đoạn chat giải thích lý thuyết của AI.

@correct: A
@difficulty: 11
@category: 1

## Q17

Bạn có một lớp Service ôm đồm quá nhiều việc (vi phạm nguyên tắc SRP). Prompt nào dưới đây giúp AI refactor lớp này một cách an toàn và giữ vững tính tương thích ngược?

[A]
Hãy viết lại lớp Service này bằng cách chia nhỏ thành các private helper method trong cùng một class và giữ nguyên chữ ký hàm ban đầu.
[EXP]
Đúng vì chia nhỏ hàm giúp code sạch hơn, đồng thời giữ nguyên chữ ký hàm (method signature) để tránh làm hỏng các lớp gọi ngoài.
[B]
Hãy chuyển đổi toàn bộ lớp Service này thành các Service con độc lập và xóa bỏ hoàn toàn các hàm cũ để tránh trùng lặp mã nguồn.
[EXP]
Xóa bỏ các hàm cũ đột ngột sẽ làm sập (gây lỗi biên dịch) toàn bộ các Controller hay lớp trung gian đang trực tiếp gọi Service này.
[C]
Hãy sử dụng các chú thích `@Async` của Spring Boot để tự động đẩy toàn bộ các logic chạy bất đồng bộ dưới nền nhằm tăng tốc độ.
[EXP]
Sử dụng `@Async` thay đổi cơ chế luồng chạy của chương trình, không giải quyết được lỗi kiến trúc vi phạm nguyên tắc đơn nhiệm.
[D]
Hãy gộp toàn bộ các file liên quan đến nghiệp vụ này vào chung một lớp lớn duy nhất để dễ dàng theo dõi luồng chạy của chương trình.
[EXP]
Gộp file đi ngược lại nguyên tắc đơn nhiệm (SRP) và Clean Code, làm tăng độ phức tạp nhận thức và khó viết unit test.

@correct: A
@difficulty: 11
@category: 1

## Q18

Để hướng dẫn AI kiểm tra và sửa lỗi rò rỉ tài nguyên (như connection leak, memory leak) trong một đoạn code cũ, cách tiếp cận prompt nào là hiệu quả nhất?

[A]
Yêu cầu AI kiểm tra toàn bộ các khối lệnh mở tài nguyên và cấu trúc lại chúng bằng cú pháp tự động giải phóng tài nguyên hiện đại.
[EXP]
Đúng vì sử dụng try-with-resources của Java 7+ đảm bảo tài nguyên (Connection, Stream) luôn được đóng tự động kể cả khi có lỗi.
[B]
Yêu cầu AI viết thêm một đoạn code chạy dưới nền để theo dõi và tự động kill các kết nối bị treo sau một khoảng thời gian nhất định.
[EXP]
Viết luồng theo dõi chạy ngầm là giải pháp phức tạp, tiêu tốn CPU/RAM và chỉ khắc phục phần ngọn chứ không giải quyết tận gốc rò rỉ.
[C]
Yêu cầu AI tăng dung lượng bộ nhớ RAM tối đa của server và tăng số lượng kết nối tối đa trong cấu hình cơ sở dữ liệu của dự án.
[EXP]
Tăng RAM hay cấu hình database pool chỉ kéo dài thời gian sống của app trước khi sập, không sửa được lỗi rò rỉ bộ nhớ thực tế.
[D]
Yêu cầu AI viết các chú thích giải nghĩa chi tiết cho từng dòng lệnh mở kết nối để lập trình viên dễ dàng đóng thủ công sau này.
[EXP]
Viết comment không thay đổi hành vi thực thi của chương trình Java, tài nguyên vẫn bị rò rỉ nếu code không được đóng đúng cách.

@correct: A
@difficulty: 11
@category: 1

## Q19

Khi viết prompt yêu cầu AI tạo một lớp đối tượng DTO có các chú thích validate dữ liệu, tại sao ta cần chỉ định rõ kiểu dữ liệu đi kèm với annotation validate?

[A]
Vì một số chú thích validate chỉ tương thích với kiểu dữ liệu nhất định, nếu dùng sai sẽ gây lỗi biên dịch hoặc lỗi runtime hệ thống.
[EXP]
Đúng vì ví dụ `@NotBlank` chỉ dùng cho String, nếu áp dụng nhầm lên Integer sẽ ném ra ngoại lệ UnexpectedTypeException tại runtime.
[B]
Vì Spring Boot bắt buộc tất cả các thuộc tính trong lớp DTO phải được viết hoa toàn bộ để hệ thống tự động nhận diện validate.
[EXP]
Quy chuẩn đặt tên thuộc tính Java tuân theo CamelCase, việc validate của Spring không bị ảnh hưởng bởi việc viết hoa toàn bộ.
[C]
Vì thư viện Hibernate Validator sẽ tự động ép toàn bộ các thuộc tính sang kiểu String trước khi tiến hành kiểm tra giá trị.
[EXP]
Hibernate Validator kiểm tra dựa trên kiểu gốc của thuộc tính, không tự động ép mọi kiểu dữ liệu về dạng String để validate.
[D]
Vì nếu không chỉ định rõ kiểu dữ liệu thì AI sẽ tự động tạo ra một class con độc lập để thực hiện kiểm tra tính hợp lệ của trường.
[EXP]
AI sẽ không tạo class con mà tự sinh mã tùy ý dựa trên phỏng đoán, dễ dẫn đến cấu trúc DTO không khớp với yêu cầu thiết kế.

@correct: A
@difficulty: 11
@category: 1

## Q20

Bạn muốn AI phân tích khả năng chịu tải của một hàm tiện ích khi chạy trong môi trường đa luồng. Prompt áp dụng kỹ thuật What-if nào sau đây là phù hợp nhất?

[A]
Điều gì xảy ra nếu hàm tiện ích này được gọi đồng thời bởi hàng triệu luồng, liệu có xảy ra lỗi sai lệch định dạng hay không?
[EXP]
Đúng vì prompt tạo tình huống giả định (What-if) đa luồng để bắt AI phân tích trạng thái chia sẻ tài nguyên như SimpleDateFormat.
[B]
Làm thế nào để tăng số lượng luồng xử lý của hệ thống lên gấp đôi mà không cần thay đổi bất kỳ dòng code nào trong hàm tiện ích?
[EXP]
Prompt này tập trung vào cấu hình hệ thống hoặc phần cứng, không yêu cầu AI phân tích tính an toàn đa luồng của mã nguồn hiện tại.
[C]
Nếu tôi cấu hình cho hàm này chạy bất đồng bộ hoàn toàn thì bộ nhớ heap của máy chủ JVM sẽ tiêu thụ bao nhiêu dung lượng RAM?
[EXP]
AI không thể tính toán chính xác dung lượng RAM runtime tiêu thụ chỉ qua phân tích tĩnh, câu hỏi này ngoài khả năng ước lượng của AI.
[D]
Tại sao việc khai báo hàm static lại giúp chương trình chạy nhanh hơn và tiết kiệm tài nguyên hơn trong môi trường kiểm thử?
[EXP]
Static chỉ định phương thức thuộc về Class, prompt này là câu hỏi lý thuyết chung chung, không chứa tình huống giả định thực tế.

@correct: A
@difficulty: 11
@category: 1

## Q21

Bạn dán Stack Trace lỗi StackOverflowError do quan hệ hai chiều lên AI. Cách prompt nào giúp AI đưa ra cách sửa triệt để nhất thay vì chỉ sửa phần ngọn?

[A]
Phân tích Stack Trace lỗi này, chỉ ra vị trí lặp vô hạn ở tầng tuần tự hóa đối tượng và đề xuất chú thích Spring để ngắt liên kết.
[EXP]
Đúng vì prompt định hướng AI phân tích cơ chế tuần tự hóa (Jackson) và ngắt vòng lặp bằng `@JsonManagedReference` hoặc `@JsonBackReference`.
[B]
Hãy sửa lỗi StackOverflowError này bằng cách tăng dung lượng bộ nhớ stack của JVM lên mức tối đa khi khởi chạy chương trình Java.
[EXP]
Tăng bộ nhớ stack của JVM chỉ trì hoãn lỗi sập hệ thống chứ không sửa được vòng lặp vô hạn tuần tuần tự hóa ở tầng ứng dụng.
[C]
Hãy viết lại toàn bộ cấu trúc các thực thể JPA để loại bỏ hoàn toàn các mối quan hệ liên kết dữ liệu giữa các bảng trong DB.
[EXP]
Xóa bỏ liên kết khóa ngoại làm mất đi tính toàn vẹn và chuẩn hóa của cơ sở dữ liệu quan hệ, đây là phương án sửa lỗi cực kỳ tệ.
[D]
Phân tích Stack Trace lỗi này và viết thêm code bẫy ngoại lệ try-catch ở tầng Controller để trả về chuỗi JSON rỗng cho client.
[EXP]
Bắt ngoại lệ chỉ che giấu lỗi chứ không giúp dữ liệu được parse thành công sang JSON, làm API mất đi chức năng nghiệp vụ ban đầu.

@correct: A
@difficulty: 11
@category: 1

## Q22

Khi viết prompt yêu cầu AI tạo mã unit test sử dụng JUnit 5 và Mockito, tại sao cần thiết lập ràng buộc về gói thư viện (import package) cụ thể?

[A]
Để tránh việc AI import nhầm các annotation của JUnit 4 cũ, dẫn đến việc engine chạy test của JUnit 5 bỏ qua các kịch bản kiểm thử.
[EXP]
Đúng vì nếu AI import nhầm `@Test` của JUnit 4, trình chạy JUnit 5 sẽ không nhận diện được test case đó và tự động bỏ qua khi build.
[B]
Để đảm bảo chương trình kiểm thử có thể tự động tải và cài đặt các thư viện liên quan ngoài môi trường mà không cần dùng maven.
[EXP]
Khai báo import trong file Java chỉ liên kết thư viện đã có trong classpath, không có khả năng tự tải hay cài đặt dependency mới.
[C]
Để Spring Boot có thể tự động cấu hình kết nối tới cơ sở dữ liệu database ảo H2 mỗi khi chạy các kịch bản unit test độc lập.
[EXP]
Việc kết nối database ảo H2 được cấu hình qua application properties hoặc annotation tích hợp, không phụ thuộc vào dòng import của test.
[D]
Để tránh việc trình biên dịch của Java báo lỗi cú pháp do không tìm thấy các class mock được khởi tạo bởi thư viện Mockito.
[EXP]
Trình biên dịch báo lỗi nếu thiếu thư viện trong file build (pom.xml/build.gradle), không phụ thuộc vào phiên bản JUnit 4 hay 5 được dùng.

@correct: A
@difficulty: 11
@category: 1

## Q23

Để tối ưu hóa hiệu năng hệ thống khi cần lấy thông tin chi tiết một thực thể kèm theo danh sách con liên kết trong API RESTful, Solution Architect nên ưu tiên thiết kế câu hỏi prompt như thế nào cho AI?

[A]
Làm thế nào để sử dụng JPQL `JOIN FETCH` nhằm lấy thực thể cha và con trong 1 câu truy vấn duy nhất để tránh lỗi N+1 query?
[EXP]
Tối ưu nhất vì chỉ ra đúng kỹ thuật JPQL JOIN FETCH giải quyết trực tiếp lỗi N+1 query ở tầng database.
[B]
Hãy viết prompt hướng dẫn đổi cấu hình thực thể sang FetchType.EAGER toàn cục để tự động nạp toàn bộ danh sách liên kết con.
[EXP]
FetchType.EAGER toàn cục là thiết kế tồi gây chậm hệ thống do nạp thừa dữ liệu ở các API không cần thiết.
[C]
Làm thế nào để cấu hình cơ chế cache Redis lưu trữ toàn bộ dữ liệu thực thể con nhằm giảm số lần đọc từ database quan hệ?
[EXP]
Cache Redis là giải pháp tầng trên, không giải quyết được lỗi thiết kế truy vấn không tối ưu ở tầng JPA.
[D]
Hãy viết hàm Java dùng vòng lặp để tự động gọi phương thức get danh sách con cho từng thực thể cha trong một Transaction.
[EXP]
Sử dụng vòng lặp trong Transaction vẫn phát sinh N câu truy vấn SELECT con, không tối ưu hiệu năng.

@correct: A
@difficulty: 6
@category: 1

## Q24

Khi hệ thống Java gặp lỗi khóa chết cơ sở dữ liệu (Database Deadlock) dưới tải cao, prompt debug nào dưới đây thể hiện tư duy thiết kế xuất sắc nhất?

[A]
Đây là Stack Trace lỗi deadlock của database. Hãy hướng dẫn tôi viết code Java tự động thử lại (retry) câu lệnh SQL khi giao dịch bị xung đột khóa.
[EXP]
Prompt thiếu Stack Trace và thông tin luồng giao dịch gây deadlock để AI phân tích.
[B]
Đây là Stack Trace lỗi deadlock của database. Hãy sửa lỗi deadlock này cho dự án Spring Boot chạy dưới tải cao để chương trình không bị dừng đột ngột.
[EXP]
Chỉ xử lý phần ngọn (retry), không tìm và giải quyết tận gốc nguyên nhân gây deadlock trong thiết kế luồng.
[C]
Đây là Stack Trace lỗi deadlock và mã nguồn của 2 Service chạy song song. Hãy phân tích thứ tự khóa tài nguyên và đề xuất cách sắp xếp lại luồng giao dịch.
[EXP]
Tối ưu nhất vì yêu cầu phân tích thứ tự khóa tài nguyên của các giao dịch song song để giải quyết tận gốc deadlock.
[D]
Đây là Stack Trace lỗi deadlock của database. Hãy cấu hình tăng thời gian timeout kết nối database trong file properties để tạm thời né lỗi hệ thống.
[EXP]
Tăng timeout chỉ làm hệ thống treo lâu hơn khi xảy ra deadlock, không phòng ngừa được deadlock xảy ra.

@correct: C
@difficulty: 6
@category: 1

## Q25

Bạn có một lớp Java xử lý phân tích cú pháp (Parser) chứa cấu trúc switch-case khổng lồ vi phạm Open-Closed Principle. Prompt refactor nào thể hiện tư duy thiết kế tốt nhất?

[A]
Hãy tái cấu trúc switch-case này bằng chuỗi câu lệnh if-else lồng nhau phức tạp để chương trình Java chạy nhanh hơn và dễ dàng đọc hiểu hơn đối với toàn bộ các lập trình viên.
[EXP]
If-else lồng nhau làm tăng độ phức tạp nhận thức của code, không giải quyết được lỗi vi phạm nguyên tắc OCP.
[B]
Hãy tái cấu trúc switch-case này sử dụng Strategy Pattern. Tách mỗi nhánh case thành một class thực thi interface `ParserStrategy`. Đăng ký các strategy vào một Map để gọi động.
[EXP]
Tối ưu vì áp dụng mẫu thiết kế Strategy giúp dễ dàng thêm parser mới mà không cần sửa đổi code hiện tại (OCP).
[C]
Hãy tái cấu trúc switch-case này bằng cách giữ nguyên code cũ và viết thêm các chú thích tiếng Việt rõ ràng cho từng nhánh case để lập trình viên dễ dàng bảo trì sau này.
[EXP]
Viết chú thích chỉ giải quyết phần tài liệu, không cải tiến được cấu trúc thiết kế lỗi thời vi phạm OCP của lớp.
[D]
Hãy tái cấu trúc switch-case này sử dụng các phương thức static helper dùng nội bộ trong cùng một Class nhằm gom nhóm các nhánh case xử lý logic tương đồng lại với nhau hơn.
[EXP]
Gom nhóm helper nội bộ vẫn giữ cấu trúc switch-case lớn trong class, chưa tách biệt được trách nhiệm thiết kế.

@correct: B
@difficulty: 6
@category: 1

## Q26

Để kiểm thử khả năng chịu lỗi của hệ thống khi gọi API bên thứ ba bị chậm (Timeout), prompt viết unit test nào thể hiện tư duy phòng vệ xuất sắc?

[A]
Sử dụng JUnit 5 và Mockito. Giả lập `gateway.call()` trả về kết quả thành công nhanh. Kiểm chứng `PaymentService` nhận kết quả xử lý bình thường trong thời gian phản hồi dưới 100ms.
[EXP]
Chỉ test luồng thành công, không kiểm thử được cơ chế chịu lỗi của hệ thống khi API xảy ra sự cố.
[B]
Sử dụng JUnit 5 và Mockito. Viết code test thực hiện gọi trực tiếp API thật ngoài môi trường thực tế và dùng `Thread.sleep` để tạo độ trễ kết nối mạng ảo khi chạy kiểm thử.
[EXP]
Unit test không được gọi API thật và việc dùng Thread.sleep làm chậm tốc độ build của hệ thống CI/CD.
[C]
Sử dụng JUnit 5 và Mockito. Viết test class Java cấu hình tự động bỏ qua toàn bộ lỗi ngoại lệ kết nối mạng để đảm bảo các test case luôn báo màu xanh khi chạy trên hệ thống.
[EXP]
Bỏ qua ngoại lệ làm mất đi tính xác thực của việc kiểm thử khả năng chịu lỗi của ứng dụng.
[D]
Sử dụng JUnit 5 và Mockito. Giả lập `gateway.call()` ném ra `SocketTimeoutException`. Kiểm chứng `PaymentService` tự động chuyển trạng thái giao dịch sang `PENDING` và ghi log cảnh báo.
[EXP]
Tối ưu vì giả lập lỗi kết nối mạng (Timeout) để xác minh xem logic phòng vệ của Service có hoạt động đúng thiết kế hay không.

@correct: D
@difficulty: 6
@category: 1

## Q27

Khi nhận dữ liệu JSON đầu vào từ một đối tác không đáng tin cậy, prompt sinh mã nguồn Java nào thể hiện tư duy lập trình phòng vệ an toàn nhất?

[A]
Java 17. Viết hàm parse JSON. Ràng buộc: Kiểm tra cấu trúc JSON có đầy đủ thuộc tính bắt buộc, validate kiểu dữ liệu của từng trường trước khi ánh xạ vào thực thể.
[EXP]
Tối ưu vì thiết lập quy trình kiểm tra cấu trúc dữ liệu nghiêm ngặt trước khi ánh xạ, đảm bảo an toàn hệ thống.
[B]
Java 17. Viết hàm parse JSON. Ràng buộc: Sử dụng thư viện Jackson để chuyển đổi chuỗi JSON của đối tác thành đối tượng Java DTO một cách nhanh nhất có thể chạy.
[EXP]
Chuyển đổi trực tiếp không qua kiểm duyệt dễ gây lỗi sập hệ thống khi đối tác thay đổi cấu trúc file JSON đột ngột.
[C]
Java 17. Viết hàm parse JSON. Ràng buộc: Đọc file JSON đầu vào, nếu có bất kỳ lỗi nào xảy ra thì trả về một đối tượng rỗng và bỏ qua mọi thông báo lỗi hệ thống.
[EXP]
Bỏ qua thông báo lỗi làm mất dấu vết hệ thống, gây khó khăn cho việc giám sát và gỡ lỗi khi có sự cố.
[D]
Java 17. Viết hàm parse JSON. Ràng buộc: Thiết lập cấu hình tự động bỏ qua toàn bộ các trường dữ liệu lạ không được khai báo trong lớp đối tượng DTO của dự án.
[EXP]
Bỏ qua trường lạ giúp tránh lỗi Jackson, nhưng chưa validate được dữ liệu của các trường hiện tại có bị rỗng hoặc sai kiểu hay không.

@correct: A
@difficulty: 6
@category: 1

## Q28

Để tối ưu hóa dung lượng bộ nhớ RAM khi đọc một file log khổng lồ có kích thước 10GB trong Java, prompt thiết kế nào sau đây là phù hợp nhất?

[A]
Java 17. Viết hàm đọc file. Ràng buộc: Thực hiện đọc toàn bộ nội dung file log khổng lồ 10GB vào một danh sách `List<String>` để dễ dàng tìm kiếm thông tin mong muốn bằng Stream API.
[EXP]
Đọc toàn bộ file 10GB vào List sẽ làm tràn bộ nhớ Heap của JVM (OutOfMemoryError) ngay lập tức.
[B]
Java 17. Viết hàm đọc file. Ràng buộc: Sử dụng lớp tiện ích `Files.readAllLines` để nạp toàn bộ các dòng của file cấu hình khổng lồ và thực hiện in kết quả ra màn hình console chạy.
[EXP]
readAllLines nạp toàn bộ file vào RAM, không thể xử lý được các file có kích thước vượt quá dung lượng RAM khả dụng của JVM.
[C]
Java 17. Viết hàm đọc file. Ràng buộc: Sử dụng `BufferedReader` kết hợp luồng đọc tuần tự `lines().forEach()` để xử lý từng dòng dữ liệu (Line-by-Line), tránh nạp toàn bộ file vào RAM.
[EXP]
Tối ưu nhất vì chỉ định rõ luồng xử lý tuần tự từng dòng, giúp giữ lượng RAM tiêu thụ ở mức tối thiểu và cố định.
[D]
Java 17. Viết hàm đọc file. Ràng buộc: Cấu hình tăng bộ nhớ đệm JVM (Xmx) lên 16GB để nạp toàn bộ file log khổng lồ 10GB vào bộ nhớ của chương trình Java khi bắt đầu chạy thực tế đó.
[EXP]
Tăng Xmx chỉ là giải pháp phần cứng tạm thời, không tối ưu được mã nguồn ứng dụng và tốn kém tài nguyên hạ tầng.

@correct: C
@difficulty: 6
@category: 1

## Q29

Bạn có một lớp Java cũ sử dụng các lớp nặc danh (Anonymous Inner Classes) để thực thi đa luồng. Prompt refactor nào thể hiện tư duy Clean Code tối giản nhất?

[A]
Java 17. Tái cấu trúc lớp Java (code dưới) bằng cách sử dụng các luồng Thread truyền thống độc lập để chạy song song toàn bộ các tác vụ.
[EXP]
Tạo Thread thủ công không giải quyết được việc làm sạch mã nguồn và tối ưu hóa cú pháp của Anonymous Inner Class.
[B]
Java 17. Tái cấu trúc lớp Java (code dưới) bằng cách chuyển đổi toàn bộ các Anonymous Inner Class của Runnable sang cú pháp Lambda Expression.
[EXP]
Đúng chuẩn vì chỉ định rõ việc chuyển đổi Anonymous Inner Class sang Lambda Expression giúp mã nguồn cực kỳ ngắn gọn, dễ đọc.
[C]
Java 17. Tái cấu trúc lớp Java (code dưới) bằng cách viết các Class con độc lập kế thừa interface tương ứng thay cho lớp nặc danh kiểu cũ.
[EXP]
Viết thêm nhiều Class con độc lập làm phình to số lượng file trong dự án, khiến cấu trúc mã nguồn trở nên cồng kềnh hơn.
[D]
Java 17. Tái cấu trúc lớp Java (code dưới) bằng cách sử dụng các chú thích `@Async` của Spring Boot để đẩy luồng xử lý chạy bất đồng bộ.
[EXP]
Sử dụng `@Async` yêu cầu Spring context và cấu hình luồng phức tạp, không phù hợp cho việc tối ưu cú pháp thuần của Class tiện ích.

@correct: B
@difficulty: 6
@category: 1

## Q30

Để đảm bảo AI sinh mã nguồn tuân thủ đúng kiến trúc phân lớp sạch (Clean Architecture) của dự án, prompt hệ thống nào thiết lập ràng buộc tốt nhất?

[A]
Ràng buộc: Viết code dự án Java theo chuẩn Clean Architecture để các lớp không bị phụ thuộc lỏng lẻo vào nhau khi chạy thực tế ngoài môi trường.
[EXP]
Mô tả "phụ thuộc lỏng lẻo" là sai thuật ngữ kiến trúc (Clean Architecture hướng tới khớp nối lỏng - loose coupling, phụ thuộc một chiều).
[B]
Ràng buộc: Đảm bảo tất cả các lớp Controller, Service và Repository của tôi được viết chung trong một file Java duy nhất để dễ quản lý code.
[EXP]
Viết chung một file vi phạm nghiêm trọng nguyên tắc phân lớp sạch và đóng gói của kiến trúc phần mềm.
[C]
Ràng buộc: Hãy đóng vai là một Developer chuyên nghiệp và viết code sao cho sạch sẽ, dễ bảo trì nhất theo đánh giá của các chuyên gia phần mềm.
[EXP]
Thiếu các ràng buộc kiến trúc cụ thể, AI sẽ tự viết code theo cấu trúc mặc định của nó mà không phân lớp rõ ràng.
[D]
Ràng buộc: Tầng Controller chỉ được gọi Service, Service chỉ gọi Repository. Tuyệt đối không cho Controller gọi trực tiếp Repository hoặc ngược lại.
[EXP]
Tối ưu vì thiết lập quy tắc phụ thuộc một chiều nghiêm ngặt giữa các tầng, bảo vệ tính toàn vẹn của kiến trúc phân lớp.

@correct: D
@difficulty: 6
@category: 1
