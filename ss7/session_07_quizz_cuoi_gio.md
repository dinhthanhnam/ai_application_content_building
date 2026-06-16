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

Xét đoạn mã nguồn Java record chuyển đổi CSV sau:
```java
public record Transaction(String id, double amount) {
    public static Transaction fromCsv(String csv) {
        String[] parts = csv.split(",");
        return new Transaction(parts[0], Double.parseDouble(parts[1]));
    }
}
```
Tại sao đoạn mã này bị sập (Crash) khi dòng dữ liệu đầu vào `csv` bị trống hoặc chỉ chứa dấu phẩy?

[A]
Vì mảng `parts` tự động khởi tạo tất cả các giá trị phần tử bên trong bằng null, dẫn đến việc chương trình bị sập.
[EXP]
Mảng parts chứa các phần tử cắt ra từ chuỗi, không tự động khởi tạo bằng giá trị null.
[B]
Vì gọi `parts[0]` và `parts[1]` trên mảng có kích thước nhỏ hơn 2 sẽ ném ra lỗi `ArrayIndexOutOfBoundsException`.
[EXP]
Chính xác, nếu chuỗi trống hoặc không có dấu phẩy, mảng parts sẽ có kích thước < 2, gây lỗi truy cập ngoài biên.
[C]
Vì kiểu dữ liệu double trong Java record không hỗ trợ lưu trữ các số có giá trị bằng 0 khi thực hiện parse dữ liệu.
[EXP]
Kiểu dữ liệu double lưu trữ số 0 hoàn toàn bình thường, không liên quan đến lỗi crash này.
[D]
Vì cấu trúc Java record bắt buộc tất cả các trường thuộc tính dữ liệu đầu vào phải tuân theo định dạng viết hoa.
[EXP]
Java record không có bất kỳ ràng buộc nào về việc viết hoa các trường thuộc tính dữ liệu.

@correct: B
@difficulty: 11
@category: 1

## Q14

Trong Spring Boot JPA, lỗi hiệu năng N+1 query xảy ra khi nào trong các trường hợp sau đây?

[A]
Khi bạn sử dụng JPQL `JOIN FETCH` để tự động nạp trước toàn bộ danh sách thực thể liên kết trong một câu truy vấn.
[EXP]
JOIN FETCH gộp dữ liệu trong 1 câu SQL JOIN duy nhất, đây là giải pháp khắc phục lỗi N+1 query.
[B]
Khi bạn nạp một thực thể duy nhất bằng cách gọi phương thức `findById` mặc định được cung cấp bởi JpaRepository.
[EXP]
Phương thức findById chỉ thực hiện đúng 1 truy vấn SQL tìm kiếm theo khóa chính, không gây N+1 query.
[C]
Khi cơ sở dữ liệu quan hệ của bạn thực hiện việc thiết lập các khóa ngoại để liên kết chặt chẽ giữa hai bảng.
[EXP]
Thiết lập khóa ngoại là chuẩn thiết kế DB quan hệ, không quyết định việc xảy ra lỗi N+1 query ở tầng ứng dụng.
[D]
Khi thực thể liên kết được cấu hình `LAZY` và bạn dùng vòng lặp duyệt qua danh sách cha để gọi thuộc tính con.
[EXP]
Chính xác, mỗi lần gọi thuộc tính con của 1 thực thể cha trong vòng lặp, Hibernate sẽ phát sinh thêm 1 câu SELECT.

@correct: D
@difficulty: 11
@category: 1

## Q15

Một kỹ sư viết Unit Test sử dụng Mockito cho lớp `PaymentService`. Test case bị lỗi `NullPointerException` tại dòng gọi repository:
```java
public boolean check(Long id) {
    User user = repository.findById(id);
    return user.isActive(); // Lỗi NullPointerException tại đây
}
```
Phân tích nguyên nhân lỗi dựa trên thiết lập Mockito:

[A]
Do kỹ sư chưa cấu hình stubbing `when(repository.findById(id)).thenReturn(user)` cho đối tượng Mock, làm hàm mặc định trả về null.
[EXP]
Đúng, đối tượng Mock trong Mockito nếu không được cấu hình stubbing hành vi sẽ mặc định trả về null đối với các kiểu object.
[B]
Do kiểu dữ liệu trả về của phương thức check là primitive boolean nên không thể nhận giá trị mock null từ đối tượng giả lập Mockito.
[EXP]
Hàm check trả về boolean, lỗi xảy ra ở việc gọi user.isActive() khi đối tượng user bị null.
[C]
Do cơ sở dữ liệu database kiểm thử đang chạy thực tế không chứa bất kỳ bản ghi thông tin nào khớp với đối tượng User cần tìm kiếm.
[EXP]
Unit Test độc lập sử dụng đối tượng Mock không kết nối vào database thật ngoài môi trường.
[D]
Do annotation `@Mock` của Mockito không thể tự động khởi tạo hoặc đăng ký được đối tượng giả lập cho interface Repository tương ứng.
[EXP]
Mockito khởi tạo mock cho interface Repository hoàn toàn bình thường thông qua MockitoExtension.

@correct: A
@difficulty: 11
@category: 1

## Q16

Hàm Java sau thực hiện lọc và xóa các phần tử chẵn khỏi danh sách:
```java
public void removeEven(List<Integer> list) {
    for (Integer num : list) {
        if (num % 2 == 0) {
            list.remove(num); // Dòng gây lỗi logic runtime
        }
    }
}
```
Tại sao chương trình ném ra ngoại lệ `ConcurrentModificationException` khi thực thi hàm trên?

[A]
Do kiểu dữ liệu Integer trong Java không hỗ trợ thực hiện phép toán chia lấy dư `%` trực tiếp khi chạy.
[EXP]
Phép toán chia lấy dư % hoạt động bình thường trên kiểu Integer nhờ cơ chế auto-unboxing của Java.
[B]
Do danh sách list đầu vào chứa các phần tử có giá trị âm làm sập thuật toán kiểm tra trong vòng lặp.
[EXP]
Giá trị âm chia lấy dư vẫn hoạt động bình thường, không gây ra lỗi ConcurrentModificationException.
[C]
Do bạn thay đổi cấu trúc danh sách trực tiếp trong vòng lặp for-each của Java mà không thông qua Iterator.
[EXP]
Chính xác, for-each sử dụng Iterator ngầm, việc sửa đổi list trực tiếp làm mất đồng bộ chỉ mục gây lỗi.
[D]
Do phương thức `list.remove` yêu cầu quyền truy cập đa luồng (thread-safe) của cấu trúc dữ liệu khi duyệt.
[EXP]
ConcurrentModificationException ở đây xảy ra trong đơn luồng do vi phạm quy tắc sửa đổi cấu trúc khi đang duyệt.

@correct: C
@difficulty: 11
@category: 1

## Q17

Cho lớp xử lý nghiệp vụ Java sau:
```java
public class UserService {
    public void register(User user) {
        validate(user);
        saveToDb(user);
        sendWelcomeSms(user); // Vi phạm Single Responsibility Principle (SRP)
    }
}
```
Tại sao thiết kế này vi phạm nguyên tắc SRP và gây khó khăn khi viết Unit Test độc lập?

[A]
Vì phương thức register của UserService sử dụng kiểu dữ liệu đối tượng User làm tham số đầu vào cho hàm.
[EXP]
Sử dụng đối tượng làm tham số đầu vào là hoàn toàn đúng chuẩn thiết kế hướng đối tượng.
[B]
Vì class UserService vừa quản lý nghiệp vụ người dùng vừa đảm nhận việc kết nối hạ tầng gửi tin nhắn SMS.
[EXP]
Chính xác, việc trộn lẫn nghiệp vụ và gửi SMS làm Service bị phụ thuộc cứng vào cổng SMS, khó mock độc lập.
[C]
Vì phương thức validate và saveToDb được khai báo là các phương thức private helper dùng nội bộ trong class.
[EXP]
Sử dụng private helper methods trong cùng một class là bình thường, không vi phạm nguyên tắc SRP.
[D]
Vì Spring Boot không hỗ trợ quét và khởi tạo các chú thích dịch vụ cho lớp có tên chứa hậu tố UserService.
[EXP]
Spring Boot quản lý Bean UserService hoàn toàn bình thường thông qua chú thích `@Service`.

@correct: B
@difficulty: 11
@category: 1

## Q18

Đoạn code Java sau thực hiện đọc dữ liệu từ Database sử dụng JDBC truyền thống:
```java
public void loadData() throws SQLException {
    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM users");
    // Đọc dữ liệu...
}
```
Tại sao đoạn code trên bị lỗi rò rỉ kết nối (Connection Leak) làm sập hệ thống sau một thời gian chạy?

[A]
Do câu lệnh SQL SELECT * FROM users chiếm dụng quá nhiều bộ nhớ đệm của database.
[EXP]
Câu lệnh SELECT không gây rò rỉ kết nối, lỗi nằm ở việc quản lý đóng mở tài nguyên kết nối Java.
[B]
Do DriverManager của Java không hỗ trợ tự động giải phóng bộ nhớ RAM khi kết thúc hàm.
[EXP]
DriverManager quản lý tạo kết nối, việc đóng kết nối là trách nhiệm của lập trình viên trong code.
[C]
Do kiểu dữ liệu ResultSet yêu cầu phải cấu hình cache toàn cục trước khi thực thi truy vấn.
[EXP]
ResultSet là con trỏ duyệt kết quả, không yêu cầu cấu hình cache toàn cục.
[D]
Do các đối tượng Connection, Statement và ResultSet không được đóng sau khi sử dụng xong.
[EXP]
Chính xác, các tài nguyên kết nối JDBC không được đóng sẽ bị treo dưới database, làm cạn kiệt pool kết nối.

@correct: D
@difficulty: 11
@category: 1

## Q19

Xét đoạn mã nguồn khai báo DTO Spring Boot sau:
```java
public class UserDTO {
    @NotBlank
    private Integer age; // Lỗi biên dịch hoặc lỗi runtime khi validate
    private String name;
}
```
Tại sao việc sử dụng chú thích `@NotBlank` trên thuộc tính `age` lại gây ra lỗi hệ thống?

[A]
Vì chú thích `@NotBlank` chỉ áp dụng cho kiểu dữ liệu String, không áp dụng cho kiểu Integer.
[EXP]
Chính xác, `@NotBlank` kiểm tra chuỗi không trống, áp dụng cho Integer sẽ ném ra ngoại lệ UnexpectedTypeException.
[B]
Vì thuộc tính age kiểu Integer bắt buộc phải sử dụng chú thích `@NotEmpty` để validate.
[EXP]
`@NotEmpty` cũng chỉ dùng cho chuỗi hoặc collection, không áp dụng cho kiểu số Integer.
[C]
Vì Spring Boot tự động chuyển đổi tất cả các kiểu số thành String trước khi thực hiện validate.
[EXP]
Spring Boot validate dựa trên kiểu dữ liệu gốc của thuộc tính, không tự động ép kiểu sang String.
[D]
Vì tên thuộc tính age bắt buộc phải viết hoa toàn bộ để thư viện Hibernate Validator nhận diện.
[EXP]
Quy ước đặt tên thuộc tính trong Java sử dụng CamelCase viết thường chữ cái đầu, không viết hoa toàn bộ.

@correct: A
@difficulty: 11
@category: 1

## Q20

Cho đoạn mã nguồn Java tiện ích xử lý ngày tháng sau:
```java
public class DateUtils {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public static String format(Date date) {
        return sdf.format(date); // Gây lỗi trong môi trường đa luồng
    }
}
```
Tại sao hàm tiện ích này hoạt động chính xác ở môi trường kiểm thử đơn luồng nhưng gây sai lệch dữ liệu ở môi trường đa luồng?

[A]
Vì kiểu dữ liệu Date của Java không hỗ trợ cơ chế ghi nhận múi giờ địa phương khi chạy trong môi trường đa luồng.
[EXP]
Date lưu số mili-giây UTC, không liên quan đến lỗi sai lệch định dạng của SimpleDateFormat.
[B]
Vì phương thức format tự động tạo ra các kết nối cơ sở dữ liệu ảo gây nghẽn luồng xử lý đồng thời của chương trình.
[EXP]
SimpleDateFormat chỉ xử lý chuỗi trên bộ nhớ, không thực hiện bất kỳ kết nối database nào.
[C]
Vì `SimpleDateFormat` trong Java không an toàn đa luồng (not thread-safe) khi dùng chung instance static.
[EXP]
Chính xác, SimpleDateFormat chia sẻ trạng thái nội bộ, nhiều luồng gọi format đồng thời sẽ ghi đè dữ liệu gây sai số.
[D]
Vì từ khóa static bắt buộc tất cả các phương thức gọi phải được đồng bộ hóa thủ công bằng cơ chế khóa đồng bộ.
[EXP]
Static chỉ định thuộc tính lớp, không bắt buộc đồng bộ hóa trừ khi thuộc tính đó không an toàn đa luồng.

@correct: C
@difficulty: 11
@category: 1

## Q21

Khi tuần tự hóa (serialization) thực thể JPA sang JSON trong Spring Boot, tại sao chương trình gặp lỗi `StackOverflowError`?

[A]
Do kích thước của tệp tin JSON sinh ra vượt quá giới hạn bộ nhớ đệm cấu hình trong file properties.
[EXP]
JSON sinh ra ghi trực tiếp vào luồng xuất, kích thước file không gây ra lỗi StackOverflowError (tràn ngăn xếp).
[B]
Do thực thể cha và con có mối quan hệ hai chiều và thư viện Jackson bị lặp vô hạn khi parse.
[EXP]
Đúng, quan hệ 2 chiều (ví dụ cha gọi con, con gọi cha) khiến thư viện tuần tự hóa lặp vô hạn gây tràn bộ nhớ stack.
[C]
Do database của bạn chứa quá nhiều bản ghi dữ liệu dẫn đến việc tràn bộ nhớ ngăn xếp của JVM.
[EXP]
Số lượng bản ghi database lớn chỉ gây chậm hoặc OutOfMemoryError ở bộ nhớ Heap, không gây StackOverflowError.
[D]
Do bạn chưa cài đặt annotation `@Repository` ở tầng kết nối cơ sở dữ liệu của dự án Spring Boot.
[EXP]
`@Repository` quản lý tạo bean, không liên quan đến cơ chế parse đối tượng sang chuỗi JSON của Jackson.

@correct: B
@difficulty: 11
@category: 1

## Q22

Một kỹ sư viết Unit Test cho Spring Boot sử dụng JUnit 5. Tuy nhiên, khi chạy test, các annotation `@BeforeEach` và `@Test` bị bỏ qua:
```java
import org.junit.Test; // JUnit 4 import
import org.junit.jupiter.api.BeforeEach; // JUnit 5 import
```
Phân tích nguyên nhân lỗi khiến trình chạy test không nhận diện đúng kịch bản:

[A]
Do Spring Boot 3.x hoàn toàn không hỗ trợ chạy các kịch bản unit test của JUnit 5.
[EXP]
Spring Boot 3.x mặc định sử dụng JUnit 5 làm engine chạy test chính.
[B]
Do bạn đặt tên file test không kết thúc bằng từ khóa Test làm engine quét bỏ qua file.
[EXP]
Nếu import lỗi phiên bản thư viện, file vẫn được quét nhưng hành vi chạy các annotation bị sai lệch.
[C]
Do bạn chưa cấu hình khởi chạy cơ sở dữ liệu database ảo H2 trong file pom.xml của dự án.
[EXP]
Database H2 dùng cho integration test, không liên quan đến việc nhận diện annotation kiểm thử của JUnit.
[D]
Do kỹ sư import lẫn lộn thư viện: annotation `@Test` từ JUnit 4 và `@BeforeEach` từ JUnit 5.
[EXP]
Chính xác, import sai gói thư viện làm trình chạy JUnit 5 không nhận diện đúng các annotation của JUnit 4.

@correct: D
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
