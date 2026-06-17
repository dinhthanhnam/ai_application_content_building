# QUIZ ĐẦU GIỜ - SESSION 07

## Q1

Để AI viết hàm Java tính phí giao hàng dựa trên 4 biến số (khoảng cách, khối lượng, hạng thành viên, mã giảm giá) bằng kỹ thuật Chain-of-Thought (CoT), cách đặt prompt nào sau đây tối ưu nhất?

[A]
Hãy viết hàm `calculateSalary` bằng Java nhận vào các tham số khoảng cách, khối lượng, hạng thành viên và mã giảm giá để tính số tiền.
[EXP]
Đây là prompt dạng Zero-shot, dễ khiến AI bỏ qua thứ tự ưu tiên áp dụng mã giảm giá và chiết khấu hạng thành viên.
[B]
Đóng vai chuyên gia. Viết hàm Java 17 tính phí. Hãy suy nghĩ từng bước: tính phí ship trước, sau đó giảm giá thành viên và voucher.
[EXP]
Phù hợp nhất vì áp dụng CoT chỉ ra rõ ràng thứ tự suy luận logic của các bước tính toán trước khi xuất mã nguồn.
[C]
Viết code tính phí ship theo công thức lũy tiến bằng Java. Hãy viết thật tối ưu hiệu năng và đảm bảo code không dùng vòng lặp lồng.
[EXP]
Thiếu cấu trúc CoT và các bước phân rã nghiệp vụ cụ thể để AI thực hiện lập luận từng chặng.
[D]
Hãy viết chương trình Java tính phí ship hàng. Hãy suy nghĩ từng bước một xem viết thế nào để ra kết quả chính xác và nhanh nhất.
[EXP]
Cụm từ "suy nghĩ từng bước một" ở đây quá chung chung, không chỉ rõ các bước nghiệp vụ cần phân rã.

@correct: B
@difficulty: 4
@category: 0

## Q2

Khi sử dụng kỹ thuật "Phân tích giả định" (What-if Analysis) để chọn công nghệ lưu trữ dữ liệu nhật ký thao tác (Audit Log) cho dự án Java ngân hàng, câu hỏi prompt nào sau đây giúp AI phản biện tốt nhất?

[A]
Tôi nên dùng database nào để lưu trữ dữ liệu Audit Log của dự án Java Spring Boot đang hoạt động trong doanh nghiệp tài chính?
[EXP]
Câu hỏi quá chung chung, không đặt ra các kịch bản cụ thể để AI so sánh.
[B]
So sánh tính năng lưu trữ Audit Log giữa hệ cơ sở dữ liệu MySQL và MongoDB cho tôi xem cái nào chạy nhanh và tốn ít bộ nhớ.
[EXP]
Câu hỏi này chỉ yêu cầu so sánh lý thuyết thông thường, chưa mang tính chất phân tích giả định What-if.
[C]
Hãy viết cho tôi code Java kết nối JDBC để lưu dữ liệu Audit Log vào bảng SQL Server và giải thích chi tiết các tham số cấu hình.
[EXP]
Đây là câu hỏi yêu cầu sinh code trực tiếp, bỏ qua giai đoạn phân tích thiết kế hệ thống.
[D]
Nếu hệ thống ghi 10 triệu log một ngày, cơ sở dữ liệu quan hệ bị nghẽn thế nào và giải pháp NoSQL nào tối ưu hơn trong kịch bản này?
[EXP]
Đúng vì đặt ra kịch bản giả định cực đoan (10 triệu log/ngày) để AI phản biện rủi ro của RDBMS và tư vấn giải pháp NoSQL.

@correct: D
@difficulty: 4
@category: 0

## Q3

Bạn muốn AI tối ưu hóa một API Spring Boot từ trạng thái "chạy được" sang chuẩn "sẵn sàng vận hành" (Production-ready). Prompt nào sau đây thiết lập ràng buộc tốt nhất về xác thực dữ liệu?

[A]
Thêm chú thích validation `@NotNull`, `@Min` vào DTO đầu vào, viết hàm bắt lỗi tập trung bằng `@ControllerAdvice` trả về JSON.
[EXP]
Đầy đủ và tối ưu nhất vì quy định rõ ràng cả annotation validation và cách thức bắt ngoại lệ tập trung trả về JSON.
[B]
Hãy tối ưu code API này và thêm validate dữ liệu đầu vào tại Controller để người dùng không nhập bậy các ký tự không hợp lệ.
[EXP]
Yêu cầu quá mơ hồ, AI sẽ tự định nghĩa validate theo ý nó và không thiết lập cơ chế xử lý lỗi.
[C]
Viết code Spring Boot thêm mới nhân viên, nhớ kiểm tra xem tên có trống không bằng lệnh if-else và ném ra RuntimeException.
[EXP]
Sử dụng if-else thủ công ở Controller là giải pháp tồi, không tận dụng framework validation tiêu chuẩn.
[D]
Sửa lại hàm Controller này để tự động ném ra lỗi ngoại lệ khi người dùng nhập sai email và ghi đè toàn bộ các mã lỗi HTTP.
[EXP]
Chỉ yêu cầu ném lỗi mà không chỉ rõ cách validate đầu vào bằng annotation chuẩn của Spring Boot.

@correct: A
@difficulty: 4
@category: 0

## Q4

Để tinh chỉnh (Iterative Refinement) một hàm Java nghiệp vụ chuyển tiền bằng cách thêm cơ chế ghi vết hệ thống (Logging), prompt phản hồi nào sau đây đúng chuẩn?

[A]
Hãy thêm lệnh in ra màn hình ở các dòng quan trọng để tôi biết chương trình đang chạy đến đâu và giá trị biến ra sao.
[EXP]
Sử dụng System.out.print là phản mẫu (anti-pattern) trong môi trường doanh nghiệp.
[B]
Thêm log logback vào code của tôi để ghi lại vết chuyển tiền và đảm bảo ghi đè các cấu hình cũ trong file properties.
[EXP]
Chưa chỉ rõ cấp độ log (Level) và các tham số nghiệp vụ cần ghi vết cụ thể.
[C]
Bổ sung logger SLF4J bằng `@Slf4j`. Ghi log INFO khi bắt đầu kèm account và amount, ghi log ERROR kèm trace khi có ngoại lệ.
[EXP]
Tối ưu vì quy định rõ framework (SLF4J/Lombok), cấp độ log (INFO/ERROR) và dữ liệu cần ghi vết.
[D]
Hãy viết lại hàm chuyển tiền và nhớ thêm dòng ghi log giao dịch thành công để lưu lại trên máy chủ phục vụ kiểm toán.
[EXP]
Lệnh quá chung chung, không chỉ rõ ràng cấu hình log và các trường hợp lỗi cần ghi Stack Trace.

@correct: C
@difficulty: 4
@category: 0

## Q5

Bạn muốn học khái niệm lập trình bất đồng bộ (`CompletableFuture`) trong Java. Prompt nào áp dụng kỹ thuật "Giải thích theo cấp độ" (Level-based Explanation) để giúp bạn dễ tiếp thu nhất?

[A]
Hãy định nghĩa CompletableFuture trong Java và cho tôi biết các phương thức static dùng để chạy đa luồng đồng thời.
[EXP]
Yêu cầu định nghĩa thuần túy dễ dẫn đến câu trả lời khô khan chứa nhiều thuật ngữ học thuật khó hiểu.
[B]
Giải thích CompletableFuture cho Junior bằng một ẩn dụ thực tế (như gọi món ăn ở nhà hàng), sau đó viết code Java demo.
[EXP]
Phù hợp nhất vì sử dụng ẩn dụ đời sống giúp chuyển hóa khái niệm kỹ thuật trừu tượng thành hình ảnh trực quan, dễ nhớ.
[C]
Hãy so sánh CompletableFuture với Thread truyền thống về mặt hiệu năng và giải thích tại sao nó chạy nhanh và ít lỗi.
[EXP]
Đây là kỹ thuật so sánh khái niệm, chưa tối ưu cho việc tiếp cận ban đầu bằng ẩn dụ trực quan.
[D]
Viết code demo sử dụng CompletableFuture để chạy song song 3 tác vụ tải dữ liệu từ internet và in kết quả ra console.
[EXP]
Chỉ yêu cầu viết code trực tiếp, thiếu phần giải thích lý thuyết trực quan bằng ẩn dụ.

@correct: B
@difficulty: 4
@category: 0

## Q6

Khi muốn so sánh hiệu năng và bộ nhớ của hai thư viện Java JSON là Jackson và Gson, cách đặt prompt nào giúp bạn có bảng đối chiếu sắc bén nhất?

[A]
Đóng vai Solution Architect. So sánh Jackson và Gson theo: tốc độ parse, lượng RAM tiêu thụ và khả năng tích hợp Spring Boot.
[EXP]
Tối ưu vì quy định vai trò chuyên gia, chỉ rõ các tiêu chí đo đạc thực tế và định dạng đầu ra dạng bảng dễ đọc.
[B]
Jackson hay Gson tốt hơn cho dự án Java của tôi? Hãy đưa ra khuyên dùng cho trường hợp chạy trên môi trường có tải cao.
[EXP]
Câu hỏi mang tính chủ quan, AI sẽ trả lời chung chung mà không đưa ra các số liệu đối so sánh cụ thể.
[C]
Hãy so sánh Jackson và Gson và viết code mẫu parse JSON cho mỗi thư viện để tôi chạy thử nghiệm trực tiếp trên local.
[EXP]
Thiếu các tiêu chí so sánh cụ thể về hiệu năng và bộ nhớ hệ thống.
[D]
Viết bảng so sánh hai thư viện Java dùng để đọc ghi file JSON thông dụng hiện nay dựa trên đánh giá của cộng đồng mạng.
[EXP]
Chưa chỉ đích danh Jackson và Gson, khiến AI có thể liệt kê thêm các thư viện không liên quan.

@correct: A
@difficulty: 4
@category: 0

## Q7

Khi yêu cầu AI tối ưu hóa đoạn code chứa nhiều vòng `if-else` lồng nhau sâu bằng kỹ thuật CoT, prompt nào sau đây hướng dẫn AI đi đúng luồng logic?

[A]
Hãy sửa code Java này để loại bỏ toàn bộ if-else lồng nhau càng nhanh càng tốt mà không làm thay đổi logic đầu vào đầu ra.
[EXP]
Thiếu chỉ dẫn các bước suy luận trung gian, AI dễ viết code sai logic nghiệp vụ.
[B]
Sử dụng cấu trúc switch-case hoặc polymorphism để viết lại đoạn code này giúp tôi để nâng cao khả năng mở rộng hệ thống.
[EXP]
Định hướng thẳng giải pháp switch-case/polymorphism có thể không phải là cách tối ưu nhất cho logic hiện tại.
[C]
Viết lại hàm này sử dụng guard clauses. Hãy suy nghĩ từng bước và kiểm tra xem code chạy có đúng nghiệp vụ ban đầu không.
[EXP]
Cụm từ "kiểm tra xem code chạy có đúng nghiệp vụ ban đầu không" quá chung chung, không ép AI trình bày rõ các bước nháp logic.
[D]
Đóng vai Senior. Phân tích code. Đừng viết code ngay. Bước 1: Liệt kê điều kiện lỗi. Bước 2: Phác thảo. Bước 3: Xuất code Java.
[EXP]
Hoàn hảo vì thiết lập quy trình CoT 3 bước ép AI phân tích điều kiện biên trước khi sinh mã nguồn.

@correct: D
@difficulty: 4
@category: 0

## Q8

Để nâng cấp một phương thức Java xử lý file bằng cách thêm logic xử lý lỗi (Exception Handling) an toàn thông qua Iterative Refinement, prompt nào sau đây là phù hợp nhất?

[A]
Thêm try-catch vào code đọc file này để nó không bị lỗi khi chạy nữa và đảm bảo giải phóng toàn bộ các luồng dữ liệu mở.
[EXP]
Yêu cầu quá chung chung, không chỉ rõ loại ngoại lệ cụ thể cần bắt và xử lý.
[B]
Hãy sửa code này để ném ra IOException nếu file không tồn tại và thông báo cho người dùng biết lỗi cụ thể trên màn hình.
[EXP]
Chỉ yêu cầu ném lỗi mà chưa xử lý ghi log ngoại lệ hoặc đóng tài nguyên an toàn.
[C]
Bổ sung try-with-resources để tự động đóng file, bắt cụ thể IOException, ghi log error kèm trace và ném ra CustomException.
[EXP]
Tối ưu vì chỉ định rõ cấu trúc giải phóng tài nguyên, phân tách cụ thể các loại ngoại lệ và bọc lỗi tùy biến.
[D]
Sửa code đọc file Java này sao cho an toàn và không bị crash hệ thống kể cả khi gặp các dữ liệu nhạy cảm hoặc bị lỗi.
[EXP]
Mục tiêu "an toàn" và "không bị crash" quá mơ hồ, không định hướng được kỹ thuật cụ thể cho AI.

@correct: C
@difficulty: 4
@category: 0

## Q9

Xét đoạn mã nguồn Java tính toán chiết khấu sau:
```java
public double getDiscount(String type, double total) {
    if (type.equals("VIP")) {
        if (total > 500) {
            return total * 0.2;
        }
    }
    return total * 0.05;
}
```
Nếu bạn gửi prompt: `"Viết code tính chiết khấu dựa trên hàm trên"` mà không sử dụng CoT, tại sao AI có thể bỏ sót trường hợp `type` là `null`?

[A]
Vì AI không biết ngôn ngữ Java có hỗ trợ giá trị null cho đối tượng String khi thực hiện các phép so sánh chuỗi thông thường.
[EXP]
AI hoàn toàn biết cú pháp Java, vấn đề nằm ở cấu trúc câu lệnh của người dùng.
[B]
Vì prompt không yêu cầu AI phân tích các trường hợp biên của biến đầu vào, dẫn đến AI chỉ viết code cho luồng chạy bình thường.
[EXP]
Chính xác, prompt thiếu ràng buộc bẫy lỗi biên khiến AI chỉ tập trung dịch logic thô sang code mới.
[C]
Vì kiểu dữ liệu double trong Java không thể nhận giá trị null nên AI mặc định bỏ qua các kiểm tra an toàn cho kiểu đối tượng.
[EXP]
Lỗi NullPointerException xảy ra ở thuộc tính type (String), không liên quan đến biến total kiểu double.
[D]
Vì vòng lặp if-else trong Java tự động bỏ qua các giá trị null khi so sánh chuỗi mà không ném ra bất kỳ lỗi runtime nào.
[EXP]
Java sẽ ném ra NullPointerException ngay lập tức nếu type là null và gọi phương thức equals.

@correct: B
@difficulty: 5
@category: 0

## Q10

Một kỹ sư Java viết API lưu Audit Log vào MySQL. Hệ thống bị nghẽn (bottleneck) khi số lượng giao dịch tăng đột biến. Phân tích nguyên nhân sâu xa từ việc đặt câu lệnh với AI:

[A]
Do thư viện kết nối JDBC của Java không hỗ trợ kết nối đồng thời và thiếu cơ chế giải phóng kết nối sau khi thực thi.
[EXP]
JDBC và các thư viện pool kết nối như HikariCP hỗ trợ concurrency cực tốt nếu cấu hình đúng.
[B]
Do AI sinh code Java bị lỗi cú pháp làm hệ thống không thể thực thi câu lệnh SQL và gây sập toàn bộ luồng xử lý chính.
[EXP]
Nếu lỗi cú pháp, chương trình sẽ không thể biên dịch thành công từ đầu chứ không đợi đến khi tải cao.
[C]
Do cơ sở dữ liệu MySQL hoàn toàn không thể lưu trữ được dữ liệu Audit Log ở quy mô doanh nghiệp lớn trong thời gian dài.
[EXP]
MySQL lưu được log, nhưng không tối ưu cho ghi lượng dữ liệu khổng lồ liên tục ở tần suất cao.
[D]
Do prompt yêu cầu viết code SQL ngay mà không bắt AI phân tích What-if về tải hệ thống để chọn công nghệ NoSQL phù hợp hơn.
[EXP]
Đúng, việc thiếu phân tích giả định từ bước đặt prompt khiến kỹ sư chọn sai công nghệ lưu trữ ngay từ đầu.

@correct: D
@difficulty: 5
@category: 0

## Q11

Cho đoạn mã nguồn Controller Spring Boot sau:
```java
@PostMapping("/user")
public ResponseEntity<String> createUser(@RequestBody UserDTO dto) {
    userService.save(dto);
    return ResponseEntity.ok("Success");
}
```
Hệ thống bị sập khi người dùng gửi request chứa tên UserDTO bị trống. Bạn cần dùng prompt để hướng dẫn AI sửa lỗi này. Lỗi này thuộc nhóm thiếu sót nào trong thiết kế?

[A]
Thiếu Validation dữ liệu đầu vào tại Controller.
[EXP]
Chính xác, `@RequestBody UserDTO` cần đi kèm annotation `@Valid` và các ràng buộc kiểm tra dữ liệu ở lớp DTO.
[B]
Thiếu Annotation `@Transactional` tại Controller.
[EXP]
Annotation `@Transactional` dùng ở tầng Service để quản lý giao dịch DB, không dùng để kiểm tra dữ liệu đầu vào.
[C]
Thiếu cấu hình log hệ thống trong file properties.
[EXP]
Log hệ thống chỉ ghi nhận lại lỗi chứ không ngăn chặn được request lỗi đi vào tầng nghiệp vụ.
[D]
Thiếu annotation `@Repository` ở tầng kết nối DB.
[EXP]
`@Repository` dùng ở tầng DAO để Spring quản lý Bean, không liên quan đến lỗi validate ở Controller.

@correct: A
@difficulty: 5
@category: 0

## Q12

Xét hàm chuyển tiền Java sau:
```java
public void transfer(Long from, Long to, double amount) {
    accountRepo.withdraw(from, amount);
    accountRepo.deposit(to, amount);
}
```
Nếu xảy ra lỗi trong quá trình `deposit` (ví dụ tài khoản nhận bị khóa), tiền đã bị trừ ở `withdraw` nhưng không được hoàn lại. Phân tích lỗi thiết kế prompt khiến AI sinh ra đoạn mã thiếu an toàn này:

[A]
Prompt thiếu yêu cầu AI tối ưu hiệu năng của các câu lệnh cập nhật cơ sở dữ liệu bằng cách sử dụng batch update SQL.
[EXP]
Hiệu năng ghi DB không giải quyết được vấn đề toàn vẹn dữ liệu khi có lỗi xảy ra.
[B]
Prompt thiếu yêu cầu AI sử dụng kiểu dữ liệu BigDecimal để tính toán số tiền chuyển nhằm tránh sai lệch dấu phẩy động.
[EXP]
BigDecimal giúp tránh sai số làm tròn số thực, không giúp quản lý transaction rollback.
[C]
Prompt thiếu ràng buộc AI quản lý giao dịch bằng Transactional để tự động rollback khi xảy ra lỗi ở bước deposit.
[EXP]
Chính xác, việc thiếu ràng buộc về tính toàn vẹn dữ liệu (Atomic) khiến AI bỏ qua cấu trúc transaction.
[D]
Prompt không chỉ định rõ phiên bản hệ quản trị cơ sở dữ liệu quan hệ của dự án để AI sinh ra các ràng buộc khóa ngoại.
[EXP]
Phiên bản DB không quyết định việc AI có thêm annotation `@Transactional` vào code Java hay không.

@correct: C
@difficulty: 5
@category: 0

## Q13

Một lập trình viên muốn AI giải thích cơ chế hoạt động của `Bean Scope` trong Spring Framework. Đoạn prompt: `"So sánh Singleton và Prototype scope trong Spring"` trả về thông tin lý thuyết chung chung. Phân tích tại sao câu trả lời của AI chưa giúp ích nhiều cho thực hành:

[A]
Vì AI không hiểu được sự khác biệt về mặt kỹ thuật giữa hai loại scope này trong hệ sinh thái của framework Spring Boot.
[EXP]
AI hiểu rất rõ lý thuyết, vấn đề là thiếu bối cảnh thực hành lập trình Java thực tế.
[B]
Vì Singleton và Prototype hoạt động hoàn toàn giống nhau trong môi trường Spring Boot khi cấu hình chạy trên chế độ mặc định.
[EXP]
Hai scope này hoạt động trái ngược nhau: Singleton tạo duy nhất 1 instance, Prototype tạo instance mới mỗi lần gọi.
[C]
Vì Spring Framework đã khai tử scope Prototype từ các phiên bản Spring Boot mới để thay thế bằng các cơ chế tối ưu hơn.
[EXP]
Prototype vẫn là một scope quan trọng và được sử dụng rộng rãi trong các phiên bản Spring Boot hiện tại.
[D]
Vì prompt không yêu cầu code Java demo minh họa sự khác biệt của hai scope khi có nhiều luồng gọi đồng thời trong hệ thống.
[EXP]
Đúng, việc thiếu yêu cầu code demo minh họa sự khác biệt khiến lý thuyết trở nên mơ hồ và khó áp dụng.

@correct: D
@difficulty: 5
@category: 0

## Q14

Khi gặp lỗi `NullPointerException` tại một hàm Java phức tạp, bạn gửi prompt: `"Sửa lỗi NullPointerException cho tôi"` kèm Stack Trace nhưng AI sửa sai logic. Phân tích nguyên nhân:

[A]
Do Stack Trace của Java không bao giờ cung cấp số dòng gây lỗi cụ thể mà chỉ hiển thị các vết thư viện hệ thống chạy ngầm.
[EXP]
Stack Trace của Java luôn cung cấp rõ ràng tên file và số dòng xảy ra lỗi (ví dụ: `MyClass.java:15`).
[B]
Do bạn không cung cấp mã nguồn Java liên quan, làm AI phải tự suy đoán cấu trúc dữ liệu và sinh ra code sửa lỗi không khớp.
[EXP]
Chính xác, thiếu code ngữ cảnh bắt buộc AI phải "ảo giác" ra cấu trúc class để viết bản vá.
[C]
Do AI chỉ có thể sửa lỗi cú pháp biên dịch, không có khả năng phân tích luồng chạy của các ngoại lệ logic thời gian thực.
[EXP]
AI sửa lỗi runtime rất tốt nếu được cung cấp đầy đủ thông tin ngữ cảnh và Stack Trace.
[D]
Do lỗi NullPointerException chỉ có thể được sửa đổi bằng cách khởi động lại máy chủ ứng dụng để giải phóng bộ nhớ đệm.
[EXP]
NullPointerException là lỗi logic code (tham chiếu null), khởi động lại server không giải quyết được lỗi này.

@correct: B
@difficulty: 5
@category: 0

## Q15

Để thiết kế một cơ chế khóa phân tán (Distributed Lock) cho hệ thống Java có lượng truy cập cực cao, prompt nào sử dụng kỹ thuật "Phân tích giả định" (What-if) sáng tạo nhất để định hình kiến trúc?

[A]
Hỏi giải pháp Redis vs ZooKeeper. Phân tích kịch bản: Nếu Master sập sau khi Client A lấy lock, Client B có lấy được trùng lock?
[EXP]
Sáng tạo nhất vì đặt ra kịch bản mất đồng bộ (split-brain/failover) của Redis để AI phân tích rủi ro và đưa giải pháp.
[B]
Hãy viết cho tôi code Java sử dụng thư viện Redisson để tạo khóa phân tán khóa một tài khoản giao dịch khi có nhiều luồng gọi.
[EXP]
Đây là prompt yêu cầu viết code thuần túy, chưa có tính chất phân tích thiết kế hệ thống và giả định lỗi.
[C]
ZooKeeper và Redis cái nào làm khóa phân tán chạy nhanh hơn và tốn ít RAM hơn trong dự án Java Spring Boot của doanh nghiệp?
[EXP]
Chỉ hỏi so sánh thông số tĩnh, chưa đặt ra các giả định lỗi kiến trúc cực đoan để tìm giải pháp phòng vệ.
[D]
Viết prompt hướng dẫn cấu hình cụ thể một cụm máy chủ Redis Sentinel để chạy khóa phân tán an toàn và có tính dự phòng cao.
[EXP]
Chỉ tập trung vào cấu hình hạ tầng, không yêu cầu phân tích logic hoạt động của thuật toán khóa.

@correct: A
@difficulty: 6
@category: 0

## Q16

Bạn muốn viết một Prompt Hệ thống (System Prompt) biến AI thành một Trợ lý kiểm duyệt Clean Code Java nghiêm khắc. Ràng buộc nào sau đây giúp kiểm soát tốt nhất để AI không tự ý sinh code sửa đổi ngay từ lượt chat đầu tiên?

[A]
Bạn chỉ được phép nhận xét và không được viết code trong bất kỳ trường hợp nào kể cả khi tôi có yêu cầu trực tiếp sau đó.
[EXP]
Ràng buộc này quá cứng nhắc, khiến AI không thể sinh code tối ưu ngay cả khi người dùng yêu cầu ở lượt chat sau.
[B]
Hãy sửa code giúp tôi nếu code đó vi phạm các quy tắc đặt tên biến của Clean Code và giải thích lý do tại sao code lỗi.
[EXP]
Ràng buộc này yêu cầu AI viết code ngay lập tức, vi phạm mục tiêu kiểm duyệt trước sửa sau.
[C]
Ràng buộc: Lượt chat 1 chỉ chỉ lỗi Clean Code bằng danh sách gạch đầu dòng, không viết code. Lượt 2 yêu cầu mới được sinh code.
[EXP]
Tối ưu vì thiết lập quy trình 2 bước rõ ràng, giữ vai trò kiểm duyệt của con người trước khi sinh code.
[D]
Hãy đóng vai là một Java Tech Lead khó tính và luôn chê bai mã nguồn của tôi để giúp tôi tiến bộ hơn mỗi ngày khi lập trình.
[EXP]
Chỉ thiết lập vai trò (Role) mà không khóa chặt hành vi đầu ra (Constraint) của mô hình.

@correct: C
@difficulty: 6
@category: 0

## Q17

Hàm tạo hóa đơn PDF (`InvoiceGenerator`) của bạn chứa mã nguồn dài 300 dòng vi phạm nguyên tắc SRP. Prompt nào thể hiện tư duy kiến trúc sáng tạo nhất để hướng dẫn AI tái cấu trúc lớp này?

[A]
Hãy chia nhỏ lớp `InvoiceGenerator` này thành các hàm private nhỏ hơn để code trông sạch sẽ và dễ đọc hiểu hơn cho lập trình viên.
[EXP]
Chỉ yêu cầu tách hàm private trong cùng một lớp, chưa giải quyết được triệt để việc phân rã trách nhiệm thiết kế.
[B]
Hãy tối ưu hiệu năng ghi file PDF của lớp Java này để giảm thời gian xử lý xuống dưới 1 giây khi chạy trên môi trường docker.
[EXP]
Chỉ tập trung vào hiệu năng thực thi, không giải quyết vấn đề cấu trúc Clean Code và SRP.
[C]
Viết lại code tạo hóa đơn PDF này bằng cách sử dụng thư viện iText mới nhất của Java thay thế cho thư viện Apache PDFBox cũ.
[EXP]
Thay đổi thư viện chỉ thay đổi cú pháp gọi API, không thay đổi được kiến trúc thiết kế của hệ thống.
[D]
Tách InvoiceGenerator thành các lớp chuyên biệt độc lập: InvoiceValidator, PricingCalculator, PdfRenderer. Giữ nguyên chữ ký public.
[EXP]
Tối ưu nhất vì đưa ra hướng phân rã kiến trúc rõ ràng ở mức Class level, đồng thời cam kết bảo toàn tính tương thích ngược.

@correct: D
@difficulty: 6
@category: 0

## Q18

Hệ thống Spring Boot của bạn bị lỗi hiệu năng nghiêm trọng do Hibernate thực hiện N+1 truy vấn khi lấy danh sách sản phẩm kèm theo danh mục. Prompt sáng tạo nào sau đây giúp AI đưa ra giải pháp giải quyết tận gốc vấn đề này?

[A]
Hãy sửa code JPA của tôi bằng cách đổi cấu hình nạp dữ liệu danh mục từ FetchType.LAZY sang FetchType.EAGER trong file Entity.
[EXP]
Đổi sang EAGER vẫn bị lỗi N+1 query nếu dùng các phương thức tìm kiếm mặc định của JpaRepository.
[B]
Phân tích JPA code. So sánh JPQL JOIN FETCH và JPA EntityGraph. Đề xuất câu truy vấn custom lấy toàn bộ dữ liệu trong 1 câu SQL.
[EXP]
Tối ưu vì bắt AI so sánh các giải pháp nạp eager thông minh (JOIN FETCH vs EntityGraph) và sinh câu truy vấn tối ưu.
[C]
Viết code Java dùng vòng lặp for để tự động truy vấn danh mục cho từng sản phẩm từ database và lưu vào một ArrayList kết quả.
[EXP]
Cách này chính là nguyên nhân trực tiếp gây ra lỗi N+1 query trong thực tế.
[D]
Hãy viết lại API này sử dụng cơ chế cache Redis để lưu lại danh sách sản phẩm nhằm tăng tốc độ phản hồi cho người dùng cuối.
[EXP]
Dùng cache chỉ là giải pháp tạm thời ở tầng ứng dụng, không sửa đổi tận gốc lỗi thiết kế truy vấn database dưới JDBC.

@correct: B
@difficulty: 6
@category: 0

## Q19

Bạn cần cài đặt một cơ chế chặn spam yêu cầu (Rate Limiter) cho API Java. Prompt sáng tạo nào sau đây giúp AI thiết kế một giải pháp tối ưu phù hợp với dự án lớn?

[A]
So sánh Token Bucket và Leaky Bucket về xử lý bursty traffic. Viết RateLimiter Java dùng Token Bucket an toàn đa luồng (AtomicLong).
[EXP]
Đầy đủ và sáng tạo vì yêu cầu phân tích thuật toán phù hợp với đặc thù traffic trước khi viết mã nguồn đa luồng an toàn.
[B]
Viết RateLimiter Java dùng vòng lặp while và Thread.sleep để giới hạn mỗi IP chỉ gọi API 5 lần một phút trên môi trường local.
[EXP]
Sử dụng Thread.sleep và vòng lặp vô tận là giải pháp tồi gây nghẽn luồng xử lý của server (Thread block).
[C]
Viết class RateLimiter bằng Java chạy thật nhanh và không tốn nhiều bộ nhớ RAM khi chạy trên môi trường có tải truy cập cao.
[EXP]
Yêu cầu quá chung chung, không chỉ rõ thuật toán và công nghệ cụ thể cần áp dụng.
[D]
Hãy cấu hình một Rate Limiter cho API Spring Boot của tôi sử dụng các công cụ giới hạn băng thông có sẵn của hệ điều hành.
[EXP]
Yêu cầu cấu hình hệ điều hành nằm ngoài phạm vi lập trình ứng dụng Java.

@correct: A
@difficulty: 6
@category: 0

## Q20

Bạn muốn thiết kế một Prompt đóng vai trò là "Gia sư phản biện" giúp bạn tự học lập trình đa luồng (Java Concurrency). Thiết kế prompt nào dưới đây kích thích tư duy học tập chủ động tốt nhất?

[A]
Hãy viết cho tôi toàn bộ lý thuyết về Java Concurrency từ cơ bản đến nâng cao và cho ví dụ minh họa về đồng bộ hóa đa luồng.
[EXP]
Prompt này chỉ yêu cầu AI xuất tài liệu thụ động, không có tính tương tác phản biện để người học tự tư duy.
[B]
Hãy giải thích từ khóa synchronized trong Java hoạt động như thế nào và viết code demo chi tiết cách đồng bộ hóa phương thức.
[EXP]
Chỉ giải thích một từ khóa cụ thể, chưa tạo ra một lộ trình học tập tương tác.
[C]
Đóng vai Gia sư Concurrency. Đưa ra 1 code lỗi Race Condition. Đừng đưa đáp án. Hãy đặt câu hỏi gợi ý để tôi tự phát hiện lỗi.
[EXP]
Sáng tạo và tương tác tốt nhất vì ép AI đóng vai người dẫn dắt, đưa bài tập thực tế để người học tự tìm lỗi.
[D]
Hãy cho tôi danh sách 10 câu hỏi trắc nghiệm về Java Concurrency có đáp án kèm giải thích chi tiết để tôi tự luyện tập thêm.
[EXP]
Làm quiz trắc nghiệm có sẵn đáp án không kích thích tư duy chủ động lập luận như phương pháp phản biện trực tiếp.

@correct: C
@difficulty: 6
@category: 0

## Q21

Kỹ thuật "Tư duy luồng chạy nháp" (Dry-run CoT) trong sinh mã nguồn có mục đích cốt lõi là gì?

[A]
Để chạy thử nghiệm biên dịch mã nguồn Java trực tiếp trên môi trường máy chủ đám mây ảo của các công cụ AI thế hệ mới.
[EXP]
AI không thực sự biên dịch và chạy code trên Cloud, nó chỉ giả lập suy luận luồng chạy bằng văn bản.
[B]
Để kiểm tra xem cú pháp mã nguồn Java có tuân thủ đúng các tiêu chuẩn định dạng và quy ước đặt tên biến của dự án hay không.
[EXP]
Định dạng code (như thụt lề) không phải là mục tiêu chính của việc suy luận thuật toán.
[C]
Để AI tự động viết các kịch bản kiểm thử (Unit Test) toàn diện cho đoạn mã nguồn chuẩn bị được sinh ra trong phiên làm việc.
[EXP]
Viết Unit Test là một bước độc lập, không phải là quá trình chạy thử nghiệm nháp thuật toán.
[D]
Để ép AI mô phỏng luồng chạy của dữ liệu biên trước khi viết code thật, giúp phát hiện sớm và phòng ngừa các lỗi logic runtime.
[EXP]
Đúng, Dry-run CoT buộc AI tư duy chậm lại, chạy nháp luồng xử lý để tự động thêm bẫy lỗi vào code.

@correct: D
@difficulty: 7
@category: 1

## Q22

Bốn cấu phần bắt buộc của một Prompt sinh mã nguồn chuyên nghiệp bao gồm những gì?

[A]
Vai trò (Role), Mục tiêu (Goal), Ngữ cảnh (Context), Ràng buộc (Constraint).
[EXP]
Đây là 4 thành phần của prompt căn bản nói chung, không phải cấu phần kỹ thuật chuyên biệt cho sinh mã nguồn.
[B]
Đầu vào (Input), Đầu ra (Output), Logic xử lý (Processing Logic), Công nghệ/Ngôn ngữ (Technology/Language).
[EXP]
Đúng, đây là 4 cấu phần kỹ thuật bắt buộc để định hình chính xác chất lượng và cấu trúc của mã nguồn sinh ra.
[C]
Stack Trace, Mã nguồn lỗi, Nguyên nhân gốc rễ, Bản vá sửa lỗi.
[EXP]
Đây là các thành phần của quy trình debug lỗi, không phải cấu trúc prompt sinh code mới.
[D]
Bảng so sánh, Sơ đồ ASCII, Khối code Java, Chú thích tiếng Việt.
[EXP]
Đây là các thành phần định dạng trình bày đầu ra, không phải cấu phần đầu vào của prompt sinh code.

@correct: B
@difficulty: 7
@category: 1

## Q23

Trong phát triển phần mềm, "Quy trình 3 bước Debug chuẩn hóa" khi làm việc với AI bao gồm các chặng nào?

[A]
1. Cung cấp lỗi và code ngữ cảnh -> 2. Yêu cầu AI tìm nguyên nhân gốc rễ -> 3. Đề xuất bản vá tối thiểu và an toàn.
[EXP]
Chính xác, đây là quy trình debug chuẩn giúp kiểm soát chất lượng bản vá của AI, tránh sửa code lan man.
[B]
1. Dán code lỗi -> 2. Yêu cầu AI sinh mã mới thay thế hoàn toàn -> 3. Sao chép đè mã mới vào tệp tin của dự án.
[EXP]
Đây là quy trình debug cẩu thả, dễ dẫn đến ảo giác và làm thay đổi logic nghiệp vụ ngoài ý muốn.
[C]
1. Đọc Stack Trace -> 2. Tự sửa code thủ công trên IDE -> 3. Dùng AI để kiểm tra xem đoạn mã nguồn còn lỗi hay không.
[EXP]
Quy trình này không tận dụng năng lực phân tích nguyên nhân lỗi của AI ở các bước đầu.
[D]
1. Cấu hình log hệ thống -> 2. Tái hiện lại lỗi trên môi trường -> 3. Yêu cầu AI viết unit test để tự động phát hiện lỗi.
[EXP]
Viết unit test để bắt lỗi là kỹ thuật sau khi đã sửa lỗi, không phải quy trình gỡ lỗi trực tiếp.

@correct: A
@difficulty: 7
@category: 1

## Q24

Mục đích chính của việc ràng buộc AI "Giữ nguyên chữ ký hàm" (Method Signature) khi thực hiện tái cấu trúc (Refactoring) mã nguồn cũ là gì?

[A]
Để đảm bảo các thuật toán xử lý dữ liệu bên trong hàm chạy với tốc độ nhanh nhất và tốn ít dung lượng RAM nhất khi vận hành.
[EXP]
Tốc độ thuật toán phụ thuộc vào logic xử lý bên trong, không phụ thuộc vào chữ ký hàm.
[B]
Để ép AI phải sử dụng đúng các thư viện và công nghệ Java mới nhất được cài đặt trong môi trường chạy của dự án doanh nghiệp.
[EXP]
Thư viện mới hay cũ không ảnh hưởng đến việc giữ nguyên hay thay đổi chữ ký hàm.
[C]
Để đảm bảo tính tương thích ngược, giúp mã sau khi refactor thay thế được ngay mã cũ mà không làm lỗi các lớp đang liên kết.
[EXP]
Đúng, chữ ký hàm là giao diện kết nối, giữ nguyên chữ ký hàm tránh gây lỗi biên dịch dây chì trong hệ thống.
[D]
Để AI tự động phân rã phương thức lớn thành nhiều phương thức helper nhỏ gọn hơn nhằm tuân thủ nguyên tắc đơn nhiệm của code.
[EXP]
Phân rã phương thức là áp dụng nguyên lý SRP, không phải mục đích của việc giữ nguyên chữ ký hàm public.

@correct: C
@difficulty: 7
@category: 1

## Q25

Bạn cần viết một prompt để AI sinh một hàm Java 17 đọc file cấu hình. Thiết kế prompt nào dưới đây tuân thủ đúng cấu phần sinh mã nguồn chuyên nghiệp?

[A]
Viết hộ tôi code Java đọc file properties cấu hình hệ thống và hiển thị các cặp key-value ra màn hình console của IDE.
[EXP]
Prompt thiếu toàn bộ các thông số đầu vào, đầu ra, xử lý lỗi và phiên bản Java cụ thể.
[B]
Hãy đóng vai chuyên gia Java. Viết hàm đọc file cấu hình properties của dự án và trả về đối tượng Map chứa các thông số.
[EXP]
Thiếu ràng buộc logic xử lý khi file không tồn tại và không chỉ định rõ phiên bản Java.
[C]
Hãy viết hàm đọc file properties. Đầu vào là String filePath. Đầu ra là Map<String, String>. Hãy xử lý ngoại lệ an toàn.
[EXP]
Chưa chỉ định rõ phiên bản Java 17 và chưa mô tả rõ thế nào là xử lý ngoại lệ an toàn (ném lỗi hay trả về map rỗng).
[D]
Ngôn ngữ: Java 17. Viết hàm `readConfig`. Đầu vào: `String filePath` (check null/trống). Đầu ra: `Map<String, String>`. Logic: Nếu file không tồn tại, trả Map rỗng.
[EXP]
Tối ưu nhất vì định hình rõ ngôn ngữ, đầu vào kèm ràng buộc, đầu ra và logic xử lý ngoại lệ cụ thể.

@correct: D
@difficulty: 8
@category: 1

## Q26

Khi dán lỗi `LazyInitializationException` và mã nguồn JPA lên AI để debug, cách hướng dẫn AI nào sau đây tuân thủ quy trình 3 bước debug chuẩn hóa?

[A]
Hãy sửa lỗi `LazyInitializationException` trong đoạn mã nguồn JPA và Hibernate mà tôi đính kèm dưới đây giúp tôi.
[EXP]
Prompt đi thẳng vào yêu cầu sửa lỗi (Bước 3) mà bỏ qua bước yêu cầu giải thích nguyên nhân gốc rễ (Bước 2).
[B]
Bước 1: Gửi code và trace. Bước 2: Bắt AI giải thích tại sao session bị đóng. Bước 3: Yêu cầu sửa bằng JPQL JOIN FETCH.
[EXP]
Đúng vì dẫn dắt AI đi qua đủ 3 bước: cung cấp ngữ cảnh, bắt phân tích nguyên nhân gốc rễ và đề xuất giải pháp cụ thể.
[C]
Hãy thêm annotation `@Transactional` vào tất cả các phương thức trong class Service này để giải quyết triệt để lỗi nạp dữ liệu.
[EXP]
Định hướng giải pháp `@Transactional` toàn cục là một phản mẫu gây suy giảm hiệu năng hệ thống.
[D]
Hãy đổi cấu hình nạp dữ liệu của tất cả các mối quan hệ thực thể sang FetchType.EAGER để sửa lỗi no Session của Hibernate.
[EXP]
Yêu cầu AI đổi cấu hình thực thể sang EAGER trực tiếp mà không phân tích tác động phụ của N+1 query.

@correct: B
@difficulty: 8
@category: 1

## Q27

Bạn muốn AI refactor một lớp `UserManager` vi phạm nguyên tắc SRP (vừa xử lý logic vừa gửi SMS thông báo). Thiết kế prompt nào sau đây là phù hợp nhất?

[A]
Tách logic gửi SMS thành lớp độc lập SmsService. Giữ nguyên chữ ký hàm `registerUser(User user)` trong UserManager và gọi SmsService.
[EXP]
Tối ưu vì chỉ định rõ lớp cần tách (SmsService) để đảm bảo SRP, đồng thời ràng buộc bảo toàn chữ ký hàm tương thích ngược.
[B]
Hãy tối ưu hóa lớp UserManager này để nó chạy nhanh hơn, Clean Code hơn và tuân thủ các nguyên tắc thiết kế hướng đối tượng.
[EXP]
Yêu cầu quá chung chung, AI sẽ tự viết lại code theo ý nó và có thể thay đổi cấu trúc gọi hàm hiện tại.
[C]
Viết lại class Java này, loại bỏ hoàn toàn các dòng code xử lý gửi SMS để lớp chỉ làm duy nhất một việc quản lý người dùng.
[EXP]
Bỏ hẳn phần gửi SMS là sai nghiệp vụ hệ thống (hệ thống vẫn cần gửi SMS nhưng cần module hóa).
[D]
Hãy chuyển đổi toàn bộ mã nguồn gửi SMS từ đồng bộ sang bất đồng bộ sử dụng CompletableFuture trong chính lớp UserManager hiện tại.
[EXP]
Chỉ tập trung vào kỹ thuật bất đồng bộ, chưa giải quyết được lỗi thiết kế vi phạm nguyên tắc đơn nhiệm (SRP).

@correct: A
@difficulty: 8
@category: 1

## Q28

Để AI viết Unit Test cho một lớp dịch vụ Java sử dụng JUnit 5 và Mockito, cách đặt prompt nào sau đây định hình cấu trúc code test tốt nhất?

[A]
Hãy viết cho tôi các ca kiểm thử unit test cho lớp PaymentService này, viết thật nhiều kịch bản test để đạt độ phủ cao nhất.
[EXP]
Thiếu chỉ định framework, annotation mock và không yêu cầu cấu trúc code test rõ ràng.
[B]
Viết unit test JUnit 5 cho PaymentService. Hãy mock tất cả các repository bằng Mockito để chạy test độc lập không cần database.
[EXP]
Thiếu yêu cầu cấu trúc viết code test theo mô hình chuẩn và các kịch bản lỗi biên cần phủ.
[C]
Viết test JUnit 5 + Mockito. Dùng `@Mock` và `@InjectMocks`. Cấu trúc code test theo mô hình AAA. Phủ luồng thành công và ngoại lệ biên.
[EXP]
Tối ưu vì quy định rõ framework, annotation mocking, kịch bản phủ và bắt buộc tuân thủ mô hình AAA sạch đẹp.
[D]
Hãy viết code kiểm thử tự động cho lớp Java này, đảm bảo khi chạy trên máy local không phát sinh lỗi và đạt độ phủ đầy đủ.
[EXP]
Độ phủ 100% là yêu cầu phi thực tế cho prompt cơ bản, thiếu chỉ định kỹ thuật mock và mô hình thiết kế test.

@correct: C
@difficulty: 8
@category: 1

## Q29

Khi giải quyết lỗi `LazyInitializationException` ngoài transaction, tại sao phương án dùng JPQL `JOIN FETCH` lại tối ưu hơn phương án thêm `@Transactional` toàn cục về mặt hiệu năng?

[A]
Vì `@Transactional` làm tăng kích thước tệp tin bytecode của class Java sau khi biên dịch lên nhiều lần gây tốn dung lượng đĩa.
[EXP]
Annotation `@Transactional` chỉ tạo lớp proxy động ở runtime, không làm phình kích thước file class biên dịch.
[B]
Vì JPQL JOIN FETCH gộp việc lấy dữ liệu cha và con vào 1 câu SQL JOIN duy nhất, tránh phát sinh thêm N truy vấn con (N+1 query).
[EXP]
Chính xác, JPQL JOIN FETCH gộp việc lấy dữ liệu cha và con vào 1 câu SQL JOIN duy nhất, tránh phát sinh thêm N truy vấn con (N+1 query).
[C]
Vì Spring Data JPA không hỗ trợ chạy các câu lệnh SQL JOIN phức tạp khi sử dụng các hệ quản trị cơ sở dữ liệu phi quan hệ.
[EXP]
JPA và Hibernate hỗ trợ cực tốt các phép JOIN trong cơ sở dữ liệu quan hệ.
[D]
Vì `@Transactional` bắt buộc ứng dụng phải thiết lập lại toàn bộ cấu hình kết nối cơ sở dữ liệu từ đầu cho mỗi yêu cầu.
[EXP]
`@Transactional` sử dụng lại kết nối có sẵn từ connection pool, không khởi tạo lại kết nối từ đầu.

@correct: B
@difficulty: 9
@category: 1

## Q30

Nếu bạn không thiết lập ràng buộc Mocking khi yêu cầu AI viết Unit Test cho tầng Service phụ thuộc Database, mã test sinh ra có nguy cơ cao gặp lỗi gì?

[A]
Mã test sẽ bị lỗi cú pháp biên dịch do dự án thiếu các thư viện assertions của framework JUnit 5 trong file cấu hình Maven.
[EXP]
Thư viện assertions đi kèm bộ cài đặt project, không phụ thuộc vào việc có mock hay không.
[B]
Mã test chạy rất nhanh nhưng không thể phát hiện ra bất kỳ lỗi logic nghiệp vụ nào nằm trong lớp Service cần được kiểm thử.
[EXP]
Nếu gọi DB thật ngoài môi trường, test case chạy rất chậm và dễ bị failed chứ không chạy nhanh.
[C]
Mã test sẽ tự động xóa sạch dữ liệu thật trong cơ sở dữ liệu của dự án do gọi nhầm vào môi trường cấu hình của hệ thống.
[EXP]
Quy trình chạy test thông thường trong dự án không kết nối thẳng vào DB Production trừ khi cấu hình sai nghiêm trọng.
[D]
Mã test cố kết nối Database thật dưới nền, gây lỗi sập test case khi chạy trên các máy chủ tích hợp liên tục CI/CD độc lập.
[EXP]
Đúng, thiếu Mocking khiến code test cố gọi repository thật, gây lỗi kết nối khi chạy độc lập trên môi trường build tự động.

@correct: D
@difficulty: 9
@category: 1
