# Session 10: Kỹ năng Prompt để phân tích, xây dựng SRS dự án

## Lesson 03: Các tính năng chính của Antigravity

## 1. Mục tiêu học tập
Sau khi hoàn thành bài học này, bạn sẽ có khả năng:
* Hiểu và áp dụng tính năng Workspace Context (`@-mention`) để liên kết ngữ cảnh các file và thư mục quan trọng.
* Sử dụng thành thạo các tính năng Inline Edit và Refactoring để chỉnh sửa, làm sạch và tối ưu hóa code trực tiếp.
* Áp dụng AI Assistant để giải nghĩa cấu trúc codebase lớn và phân tích Stack Trace để gỡ lỗi nhanh chóng.

---

## 2. Đặt vấn đề thực tế
Hãy tưởng tượng bạn đang lao mình vào một dự án Spring Boot lớn và phức tạp. Bạn cần thêm một tính năng mới quan trọng, nhưng mã nguồn hiện tại là một "bãi chiến trường" với hàng trăm file và hàng ngàn dòng code kế thừa từ nhiều lập trình viên trước đây. 

Mỗi khi cần tìm hiểu một phần cụ thể, bạn dễ bị lạc lối trong mê cung thư mục, cố gắng ghép nối các mảnh ghép logic lại với nhau. Khi viết xong một chức năng, bạn lại phải mất hàng giờ để dọn dẹp code, đảm bảo tuân thủ Clean Code, hay khổ sở gỡ lỗi một ngoại lệ (Exception) lạ hoắc. Thời gian cứ thế trôi đi và deadline đến rất gần.

---

## 3. Kiến thức cốt lõi

### Các tính năng thông minh cốt lõi của Antigravity

* **Workspace Context (`@-mention`):** Cho phép lập trình viên "tag" trực tiếp các file, thư mục, hoặc đoạn code cụ thể vào khung chat. AI sẽ sử dụng các tham chiếu này làm ngữ cảnh nền để trả lời chính xác theo cấu trúc dự án thực tế.
* **Inline Edit & Refactoring:** Tính năng cho phép quét chọn một khối code và ra lệnh trực tiếp cho AI chỉnh sửa nhanh (chuyển đổi cú pháp, tối ưu hóa logic, thêm comment hoặc sinh JavaDoc) ngay tại file đang mở.
* **Gỡ lỗi thông minh (Stack Trace Analyzer):** Khả năng tiếp nhận các đoạn mã lỗi log từ terminal, phân tích nguyên nhân gốc rễ và đưa ra giải pháp sửa lỗi tối ưu ngay lập tức.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Lập trình viên cần hiểu nhanh mối quan hệ nghiệp vụ giữa `UserController` với `UserService` và `UserRepository` trong dự án Spring Boot, đồng thời xử lý lỗi `NullPointerException` phát sinh khi gọi API tạo người dùng mới.

### Thách thức
* Nếu tìm kiếm thủ công từng file bằng lệnh `grep` hoặc tính năng search mặc định của IDE sẽ rất chậm và thiếu trực quan.
* Việc chạy debugger từng dòng để tìm ra nguyên nhân của một lỗi NullPointerException ngầm trong Spring Context có thể mất hàng giờ.

### Giải pháp với Antigravity
* Sử dụng `@-mention` trong Chat Panel để tag các file `UserService.java` và `UserRepository.java`, yêu cầu AI tóm tắt luồng dữ liệu.
* Dán trực tiếp Stack Trace từ console vào Chat Panel để AI chỉ ra chính xác dòng code bị null và cách cấu hình lại Dependency Injection.

---

## 5. Demo minh họa

### Mục tiêu demo
Minh họa cách tag ngữ cảnh, thực hiện Inline Edit và phân tích Stack Trace bằng AI.

### Ví dụ 1: Sử dụng Workspace Context (`@-mention`)
Trong khung chat của Antigravity, lập trình viên nhập yêu cầu sau để phân tích mối tương quan giữa các lớp:

```text
Tôi cần hiểu cách UserController này tương tác với UserService và UserRepository.
Hãy tóm tắt mối quan hệ giữa file này với:
- @src/main/java/com/example/demo/service/UserService.java
- @src/main/java/com/example/demo/repository/UserRepository.java
Đặc biệt chú ý đến các phương thức quản lý User.
```

**Mã nguồn liên quan trong `UserController.java`:**
```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
```
*AI sẽ lập tức đọc 2 file được tag và phản hồi chi tiết luồng xử lý từ Controller gọi Service và Service tương tác với Database qua Repository.*

### Ví dụ 2: Inline Edit - Thêm JavaDoc và Refactor Logic
**Mã nguồn gốc (chưa tối ưu):**
```java
public class ProductService {
    public double calculateTotalPrice(int quantity, double unitPrice) {
        return quantity * unitPrice;
    }
}
```
**Yêu cầu gửi cho Inline Edit:** *"Add Javadoc"*
**Mã nguồn sau khi AI tự động cập nhật:**
```java
public class ProductService {
    /**
     * Calculates the total price of a product based on quantity and unit price.
     *
     * @param quantity  The number of units of the product.
     * @param unitPrice The price of a single unit of the product.
     * @return The total calculated price.
     */
    public double calculateTotalPrice(int quantity, double unitPrice) {
        return quantity * unitPrice;
    }
}
```

**Mã nguồn logic gốc:**
```java
public String checkAge(int age) {
    String result;
    if (age >= 18) {
        result = "Adult";
    } else {
        result = "Minor";
    }
    return result;
}
```
**Yêu cầu gửi cho Inline Edit:** *"Simplify logic"*
**Mã nguồn sau khi AI tự động tối ưu:**
```java
public String checkAge(int age) {
    return (age >= 18) ? "Adult" : "Minor";
}
```

### Ví dụ 3: Phân tích Stack Trace để sửa lỗi
Lập trình viên dán đoạn lỗi sau vào Chat Panel:
```text
java.lang.NullPointerException: Cannot invoke "com.example.demo.repository.UserRepository.findByEmail(String)" because "this.userRepository" is null
    at com.example.demo.service.UserServiceImpl.saveUser(UserServiceImpl.java:25)
    at com.example.demo.controller.UserController.createUser(UserController.java:38)
```
**Yêu cầu gửi AI:** *"Analyze this stack trace, explain the root cause, and suggest a fix."*

**AI phản hồi:**
Nguyên nhân gốc rễ là biến `userRepository` trong lớp `UserServiceImpl` chưa được khởi tạo (bằng null) khi phương thức `saveUser` được gọi.
*Cách khắc phục đề xuất:* Đảm bảo bạn đã inject `UserRepository` vào `UserServiceImpl` qua constructor hoặc sử dụng `@Autowired`.
```java
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    // Đảm bảo có constructor để Spring tự động inject dependency
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
```

---

## 6. Tổng kết

### Những kiến thức quan trọng nhất
* Sử dụng `@-mention` giúp thu hẹp phạm vi tìm kiếm của AI, tăng độ chính xác của câu trả lời và tránh tình trạng AI "mơ hồ".
* Inline Edit là công cụ mạnh mẽ để làm sạch code nhanh tại chỗ mà không cần sao chép qua lại giữa các file.

### Những lưu ý quan trọng khi làm việc
* **Không tin tưởng tuyệt đối:** AI có thể tạo ra mã nguồn chạy được nhưng sai về mặt logic nghiệp vụ. Luôn phải review lại kỹ lưỡng.
* **Bảo mật dữ liệu:** Tuyệt đối không dán mã nguồn nhạy cảm hoặc thông tin cấu hình chứa mật khẩu, API key của doanh nghiệp lên khung chat AI.

---

## 7. Câu hỏi đánh giá

### Câu 1
Tính năng `@-mention` (Workspace Context) giải quyết vấn đề gì khi làm việc với AI trên một dự án lớn?

**Gợi ý đáp án:**
Nó giải quyết vấn đề thiếu ngữ cảnh của các công cụ AI thông thường. Bằng cách cho phép tag trực tiếp các file/thư mục liên quan, AI sẽ biết chính xác các cấu trúc dữ liệu và logic đang sử dụng trong dự án, từ đó sinh mã nguồn hoặc đưa ra giải pháp giải thích phù hợp với hệ thống hiện tại, hạn chế tối đa việc sinh code lạc lõng hoặc sai cú pháp.

### Câu 2
Nêu sự khác biệt giữa tính năng Inline Edit và Chat Panel trong Antigravity. Khi nào nên dùng từng tính năng?

**Gợi ý đáp án:**
- **Inline Edit:** Thực hiện sửa đổi trực tiếp trên khối code được chọn ngay tại file đang mở. Nên dùng khi cần refactor nhanh, viết JavaDoc, sửa lỗi cú pháp tại chỗ hoặc chuyển đổi định dạng code nhỏ.
- **Chat Panel:** Cung cấp giao diện hội thoại đa mục đích. Nên dùng khi cần phân tích lỗi phức tạp (Stack Trace), lên ý tưởng thiết kế, giải nghĩa luồng xử lý giữa nhiều file hoặc sinh các module code hoàn toàn mới.

### Câu 3
Khi dán một Stack Trace vào Antigravity để tìm lỗi, bạn cần làm gì để AI đưa ra câu trả lời hiệu quả nhất?

**Gợi ý đáp án:**
Bên cạnh việc dán Stack Trace, cần cung cấp thêm ngữ cảnh như: loại công nghệ đang sử dụng (ví dụ: Spring Boot, Node.js), tag file code nơi xảy ra lỗi (dòng code được chỉ ra trong Stack Trace) và mô tả hành động đang thực hiện khi lỗi xảy ra.
