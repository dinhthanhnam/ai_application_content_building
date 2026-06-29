# Session 11: Kỹ thuật Prompt để tạo mã nguồn dự án

## Lesson 03: Tạo Prompt để thêm test case, sinh dữ liệu giả lập

## 1. Mục tiêu học tập
Sau khi hoàn thành bài học này, bạn sẽ có khả năng:
* Thiết kế Prompt để AI tự động tạo bộ Unit Test toàn diện sử dụng JUnit 5 và Mockito cho các lớp Service/Controller.
* Sử dụng AI để sinh dữ liệu giả lập (Mock Data) có cấu trúc dạng JSON phong phú và sát với thực tế địa phương (tên, số điện thoại, địa chỉ Việt Nam).
* Viết Prompt yêu cầu sinh các script SQL nạp dữ liệu (SQL INSERT statements) tương thích hoàn toàn với schema của dự án.

---

## 2. Đặt vấn đề thực tế
Hãy tưởng tượng bạn đang là một lập trình viên trong một dự án lớn, sắp đến giai đoạn bàn giao (release). Tính năng mới đã hoàn tất, nhưng sếp yêu cầu bạn phải viết hàng trăm Unit Test cho lớp `UserService` phức tạp và tạo ra hàng nghìn bản ghi dữ liệu giả lập cho bảng `Orders` và `Products` để đội QA có thể kiểm thử hiệu năng. 

Bạn ngồi gõ code test, suy nghĩ các trường hợp thành công, rồi lại đến các trường hợp lỗi, cuối cùng là ngồi nhập liệu thủ công vào file JSON hay viết tay từng câu SQL INSERT. Đồng hồ điểm 2 giờ sáng, bạn mệt mỏi và tự hỏi, có cách nào nhanh hơn, thông minh hơn không? Liệu có công cụ nào giúp bạn tự động hóa công việc này?

---

## 3. Kiến thức cốt lõi

### Tự động hóa viết Unit Test bằng AI
Viết Unit Test đòi hỏi lập trình viên phải suy nghĩ về nhiều nhánh rẽ của code. AI có khả năng đọc hiểu luồng xử lý và tự động sinh ra các ca kiểm thử bao phủ:
* **Happy Path (Nhánh thành công):** Đảm bảo hệ thống hoạt động đúng khi dữ liệu đầu vào chuẩn.
* **Edge Cases (Trường hợp biên):** Kiểm tra đầu vào là `null`, danh sách rỗng, hoặc các giá trị vượt ngưỡng giới hạn.
* **Error Handling (Xử lý lỗi):** Đảm bảo các Exception được ném ra chính xác khi gặp dữ liệu sai hoặc khi các dependency bị lỗi.
* **Mockito usage:** Giả lập hành vi của các Repository/Service phụ thuộc bằng Mockito để chạy Unit Test cô lập.

### Sinh dữ liệu giả lập có cấu trúc
* **Dữ liệu API (JSON):** Định hình nhanh các payload truyền lên API cho các công cụ như Postman để kiểm thử tích hợp.
* **Script Database (SQL INSERT):** Sinh mã SQL INSERT số lượng lớn có ràng buộc khóa ngoại và dữ liệu ngẫu nhiên nhưng hợp lệ để nạp nhanh vào cơ sở dữ liệu kiểm thử.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Cần bổ sung bộ Unit Test cho phương thức `saveUser` của lớp `UserService` có chứa các logic kiểm tra định dạng email và kiểm tra trùng lặp, đồng thời nạp 10 bản ghi khách hàng Việt Nam vào bảng `Customers`.

### Thách thức
* Tự viết các kịch bản mock (giả lập) cho `UserRepository` bằng tay tốn nhiều dòng code thiết lập ban đầu.
* Viết các câu lệnh INSERT thủ công dễ bị trùng lặp email (do ràng buộc UNIQUE) và thông tin không thực tế.

### Giải pháp với Antigravity
Cung cấp mã nguồn `UserService` và cấu trúc bảng `Customers` làm ngữ cảnh cho AI, viết prompt yêu cầu sinh trọn gói file test và script nạp dữ liệu.

---

## 5. Demo minh họa

### Mục tiêu demo
Thực hành viết prompt tạo JUnit 5 Test Class, dữ liệu JSON và SQL INSERT Script.

---

### Ví dụ 1: Sinh bộ Unit Test (JUnit 5 + Mockito)

**Mã nguồn lớp `UserService.java` cần kiểm thử:**
```java
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("User ID cannot be null");
        }
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        return userRepository.save(user);
    }
}
```

**Prompt gửi AI:**
```text
You are an expert Java developer specializing in Spring Boot, JUnit 5, and Mockito.
Your task is to write comprehensive unit tests for the provided Java service method.
Please focus on generating tests that cover:
1. Happy Paths: Successful execution scenarios.
2. Edge Cases: Null inputs, boundary values.
3. Error Handling: Correct exception throwing.
4. Mockito usage: Properly mock UserRepository and verify interactions.
Provide the tests as a complete Java file.
```

**Kết quả lớp Test do AI sinh ra (`UserServiceTest.java`):**
```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void findUserById_shouldReturnUser_whenUserExists() {
        Long userId = 1L;
        User mockUser = new User(userId, "test@example.com");
        when(userRepository.findById(userId)).thenReturn(Optional.of(mockUser));

        User foundUser = userService.findUserById(userId);

        assertNotNull(foundUser);
        assertEquals(userId, foundUser.getId());
        verify(userRepository, times(1)).findById(userId);
    }

    @Test
    void findUserById_shouldThrowException_whenIdIsNull() {
        assertThrows(IllegalArgumentException.class, () -> userService.findUserById(null));
        verify(userRepository, never()).findById(anyLong());
    }

    @Test
    void saveUser_shouldReturnSavedUser_whenUserIsValid() {
        User userToSave = new User(null, "newuser@example.com");
        User savedUser = new User(3L, "newuser@example.com");
        when(userRepository.save(any(User.class))).thenReturn(savedUser);

        User result = userService.saveUser(userToSave);

        assertNotNull(result);
        assertEquals(savedUser.getId(), result.getId());
        verify(userRepository, times(1)).save(userToSave);
    }

    @Test
    void saveUser_shouldThrowException_whenEmailIsInvalid() {
        User userWithInvalidEmail = new User(null, "invalid-email");
        assertThrows(IllegalArgumentException.class, () -> userService.saveUser(userWithInvalidEmail));
        verify(userRepository, never()).save(any(User.class));
    }
}
```

---

### Ví dụ 2: Sinh dữ liệu Mock dạng JSON

**Prompt sử dụng:**
```text
You are an expert in generating realistic mock data. Please create a JSON array containing 3 realistic user objects. Each user object should have the following fields:
- id: unique integer
- firstName: Vietnamese first name
- lastName: Vietnamese last name
- email: valid email address based on first and last name
- phoneNumber: valid Vietnamese phone number (starting with 09, 03, or 08)
- address: realistic Vietnamese street address
- isActive: boolean (true/false)
Ensure variety in names and addresses.
```

**Kết quả từ AI:**
```json
[
  {
    "id": 1,
    "firstName": "Nguyễn",
    "lastName": "Văn A",
    "email": "nguyen.a@example.com",
    "phoneNumber": "0987654321",
    "address": "Số 123, Đường Thái Hà, Phường Trung Liệt, Quận Đống Đa, Hà Nội",
    "isActive": true
  },
  {
    "id": 2,
    "firstName": "Trần",
    "lastName": "Thị B",
    "email": "tran.b@example.com",
    "phoneNumber": "0312345678",
    "address": "Phòng 405, Tòa nhà Bitexco, Đường Hồ Tùng Mậu, Quận 1, TP.HCM",
    "isActive": false
  },
  {
    "id": 3,
    "firstName": "Lê",
    "lastName": "Quốc C",
    "email": "le.c@example.com",
    "phoneNumber": "0778899001",
    "address": "Hẻm 789, Đường Nguyễn Trãi, Quận 5, TP.HCM",
    "isActive": true
  }
]
```

---

### Ví dụ 3: Sinh Script nạp Database (SQL INSERT)

**Prompt sử dụng:**
```text
You are an expert SQL engineer. Please generate SQL INSERT statements for the Customers table. 
The table has columns: customer_id (INT PK), first_name (VARCHAR), last_name (VARCHAR), email (VARCHAR UNIQUE), phone_number (VARCHAR), address (VARCHAR), is_active (BOOLEAN).
Generate 3 INSERT statements with realistic Vietnamese customer data. Do not insert customer_id as it is auto-increment.
```

**Kết quả từ AI:**
```sql
INSERT INTO Customers (first_name, last_name, email, phone_number, address, is_active) VALUES 
('Nguyễn', 'Thị Mai', 'nguyen.mai@example.com', '0912345678', 'Số 45, Đường Lý Thường Kiệt, Quận Tân Bình, TP.HCM', TRUE),
('Trần', 'Văn Chung', 'tran.chung@example.com', '0334567890', 'Ngõ 20, Phố Tràng Tiền, Quận Hoàn Kiếm, Hà Nội', TRUE),
('Lê', 'Thị Hương', 'le.huong@example.com', '0701234567', 'Lê Lợi, Quận 1, TP.HCM', FALSE);
```

---

## 6. Tổng kết

### Những kiến thức quan trọng nhất
* Sử dụng AI để sinh test case và mock data giúp tăng độ bao phủ (test coverage) và tăng độ đa dạng của dữ liệu thử nghiệm.
* Prompt càng chi tiết về cấu trúc (schema) và ràng buộc (như số điện thoại bắt đầu bằng 09, email không trùng) thì dữ liệu sinh ra càng chất lượng.

### Những lỗi thường gặp
* **Sao chép mù quáng:** Chạy trực tiếp code test của AI mà không rà soát lại các assert, dễ dẫn đến test chạy đúng giả tạo hoặc lỗi compile do thiếu dependency.
* **Vượt quá giới hạn token:** Đối với các file service lớn chứa hàng ngàn dòng code, cần chia nhỏ từng phương thức để gửi cho AI thay vì dán toàn bộ file.

---

## 7. Câu hỏi đánh giá

### Câu 1
Khi yêu cầu AI sinh mã kiểm thử Unit Test cho một Service phụ thuộc vào nhiều Repository, tại sao cần chỉ định sử dụng Mockito trong Prompt?

**Gợi ý đáp án:**
Vì Unit Test cần chạy độc lập và cô lập với cơ sở dữ liệu thực tế. Mockito giúp giả lập (mock) hành vi của các Repository phụ thuộc (ví dụ: trả về dữ liệu ảo khi gọi `findById`), giúp kiểm thử tập trung vào logic xử lý của Service đó mà không cần khởi tạo kết nối database thật, tăng tốc độ chạy test và tránh làm bẩn dữ liệu.

### Câu 2
Nêu nguyên tắc "Garbage in, garbage out" (Dữ liệu rác vào, dữ liệu rác ra) trong việc ứng dụng AI để tạo dữ liệu giả lập.

**Gợi ý đáp án:**
Nếu ta đưa vào prompt yêu cầu chung chung như "Sinh dữ liệu khách hàng", AI sẽ sinh ra dữ liệu mơ hồ, tên tiếng Anh, địa chỉ không thực tế và định dạng sai lệch. Muốn có dữ liệu chất lượng ("Gold out"), ta phải cung cấp đầu vào ("Gold in") chi tiết bao gồm: định dạng đầu ra (JSON/SQL), các trường thông tin cụ thể, kiểu dữ liệu, các ràng buộc giá trị và đặc tính địa phương (ví dụ tên và địa chỉ Việt Nam).

### Câu 3
Khi sinh dữ liệu giả lập cho cơ sở dữ liệu có các ràng buộc khoá ngoại (FOREIGN KEY), bạn thiết lập prompt thế nào để đảm bảo tính toàn vẹn dữ liệu?

**Gợi ý đáp án:**
Cần cung cấp sơ đồ quan hệ của cả hai bảng (bảng chính và bảng phụ) cho AI. Trong prompt, chỉ định rõ các giá trị khóa ngoại ở bảng phụ phải tương thích và nằm trong tập hợp các khóa chính đã được khai báo ở bảng chính (hoặc yêu cầu AI sinh các câu lệnh INSERT cho bảng chính trước, sau đó dùng đúng các ID đó làm khóa ngoại cho các câu lệnh INSERT ở bảng phụ).
