# Session 07 - Lesson 02: Prompt yêu cầu phân tích, sửa lỗi từ code, stack-trace

## 1. Mục tiêu học tập
Sau khi hoàn thành Lesson này, người học có thể:
- Nhận diện các thành phần cốt lõi của một Stack Trace lỗi trong môi trường Java.
- Phân tích và nâng cấp kỹ thuật Chain-of-Thought (CoT) thành **Quy trình 3 bước Debug chuẩn hóa** khi tương tác với AI.
- Thực hiện thiết kế Prompt kết hợp mã nguồn và Stack Trace để định hướng AI gỡ các lỗi logic phức tạp hoặc lỗi liên kết Framework.
- Áp dụng kỹ thuật debug bằng AI để nhanh chóng cô lập nguyên nhân gốc rễ (Root Cause) và đưa ra bản vá tối thiểu, tránh sửa chữa lan man làm hỏng hệ thống.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric artwork depicting a software debugging scene. A giant translucent screen displays a glowing red stack-trace log with a highlighted line. A developer uses a virtual glowing magnifying glass to inspect a single line of Java code. An AI assistant projects a clear three-step debugging flowchart hovering in the air. Modern corporate dark mode, neon red, blue and yellow accents, 8k.

---

## 2. Đặt vấn đề thực tế
Trong dự án xây dựng trang thương mại điện tử Spring Boot, đội ngũ phát triển gặp một lỗi nghiêm trọng khi triển khai tính năng xem chi tiết thông tin khách hàng kèm danh sách đơn hàng đã mua. Khi gọi API `GET /api/customers/1`, hệ thống lập tức trả về lỗi HTTP 500 kèm theo một log lỗi dài hàng chục dòng (Stack Trace) bắt đầu bằng dòng chữ khó hiểu:
`org.hibernate.LazyInitializationException: could not initialize proxy [Customer#1] - no Session`.

Một lập trình viên Junior dán nguyên đoạn lỗi này lên AI và hỏi: *"Lỗi Hibernate LazyInitializationException sửa thế nào?"*

AI trả về 5 giải pháp khác nhau: từ cấu hình `spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true` cho đến việc đổi kiểu nạp dữ liệu sang `FetchType.EAGER`. Lập trình viên thử cấu hình theo cách đầu tiên. Lỗi 500 biến mất, nhưng vài tuần sau hệ thống bị quá tải bộ nhớ và treo cứng (out of memory) do Hibernate âm thầm thực hiện hàng ngàn truy vấn dư thừa dưới nền (N+1 query problem).

Tại sao giải pháp của AI lại tạo ra thảm họa khác? Bởi vì lập trình viên chỉ dán lỗi mà không cung cấp mã nguồn thực tế và không yêu cầu AI giải thích nguyên nhân gốc rễ trước khi đưa ra bản vá. Làm thế nào để điều hướng AI tìm ra đúng lỗi và đưa ra giải pháp an toàn nhất?

---

## 3. Kiến thức cốt lõi

### 3.1. Phân tích giải mã Stack Trace trong Java
Stack Trace (Vết ngăn xếp) là bản ghi chi tiết các bước thực thi của chương trình tại thời điểm xảy ra ngoại lệ. Khi làm việc với AI, bạn cần trích xuất được 3 thông tin chính:
- **Loại ngoại lệ (Exception Type):** Ví dụ `NullPointerException`, `LazyInitializationException`.
- **Thông điệp chi tiết (Detailed Message):** Gợi ý trực tiếp nguyên nhân (ví dụ: `- no Session` nghĩa là session kết nối DB của JPA đã bị đóng).
- **Vị trí gây lỗi (Error Location):** Tìm dòng code của dự án (thường chứa tên package của dự án, ví dụ `at CustomerService.getCustomerDetails(CustomerService.java:25)`) để khoanh vùng.

### 3.2. Nâng cấp CoT thành Quy trình 3 bước Debug chuẩn hóa với AI
Để gỡ lỗi an toàn, hãy áp dụng kỹ thuật CoT dưới dạng một quy trình 3 bước chặt chẽ trong Prompt:

```
+-------------------------------------------------------------+
|               QUY TRÌNH 3 BƯỚC DEBUG VỚI AI                 |
+-------------------------------------------------------------+
|  Bước 1: Cung cấp lỗi    -->  Bước 2: Bắt AI phân tích CoT  |
|   & Mã nguồn ngữ cảnh          tìm nguyên nhân gốc rễ       |
+-------------------------------------------------------------+
                                       |
                                       v
                            Bước 3: Đề xuất bản vá
                             tối thiểu và an toàn
```

1.  **Cung cấp ngữ cảnh đầy đủ:** Dán cả đoạn mã nguồn của tệp tin nghi ngờ (dưới 50 dòng) và đoạn Stack Trace liên quan (chỉ cần lấy 5-10 dòng đầu tiên chứa thông tin lỗi và file dự án).
2.  **Yêu cầu tìm nguyên nhân gốc rễ (Root Cause Analysis):** Bắt AI giải thích rõ cơ chế hoạt động dẫn đến lỗi (không cho AI đưa code sửa ngay).
3.  **Ràng buộc giải pháp an toàn:** Yêu cầu AI đưa ra bản vá tối thiểu, ít xâm lấn mã nguồn nhất và giải thích tác động phụ (side effects) của bản vá.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
API lấy thông tin khách hàng và các đơn hàng liên kết (mối quan hệ 1-nhiều `@OneToMany` với cấu hình mặc định là `FetchType.LAZY` để tối ưu bộ nhớ).

### Thách thức
Khi gọi hàm hiển thị danh sách đơn hàng ở tầng Controller (ngoài phạm vi Transaction của Service), session kết nối cơ sở dữ liệu của Hibernate đã bị đóng, dẫn đến lỗi `LazyInitializationException`.

### Cách tiếp cận bằng Quy trình Debug 3 bước
Thay vì hỏi chung chung, lập trình viên dán tệp `CustomerService.java`, tệp `CustomerController.java` và Stack Trace. Prompt yêu cầu AI giải thích tại sao proxy của Hibernate không được nạp và yêu cầu so sánh 2 cách sửa: Dùng `@Transactional` ở Service hay sử dụng truy vấn JPQL `JOIN FETCH` (sử dụng kỹ thuật What-if để so sánh các giải pháp).

### Kết quả
AI chỉ ra rằng việc gọi `customer.getOrders()` ở Controller nằm ngoài Transaction là nguyên nhân. AI khuyến nghị sử dụng JPQL `JOIN FETCH` để nạp dữ liệu chủ động trong 1 truy vấn duy nhất, tránh lỗi sập hệ thống và giải quyết triệt để bài toán hiệu năng N+1 truy vấn.

---

## 5. Demo minh họa

### Mục tiêu demo
Thực hành viết Prompt Debug nâng cao để sửa lỗi `LazyInitializationException` một cách an toàn nhất.

### Các bước thực hiện
1. Dán đoạn mã lỗi và Stack Trace vào Prompt có cấu trúc quy trình 3 bước.
2. AI phân tích nguyên nhân và đề xuất code sửa lỗi.

#### Đoạn mã lỗi (Java):
```java
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    // Lỗi: Hàm này không có Annotation Transactional
    public Customer getCustomerWithOrders(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow();
        // orders được cấu hình @OneToMany(fetch = FetchType.LAZY)
        System.out.println(customer.getOrders().size()); // Gây lỗi tại đây
        return customer;
    }
}
```

#### Prompt thực hành debug tối ưu:
```text
Hãy đóng vai trò là một chuyên gia Debugger Java Spring Boot.
Tôi đang gặp lỗi LazyInitializationException khi chạy hàm getCustomerWithOrders.

[Mã nguồn nghi ngờ]
(Dán đoạn mã CustomerService phía trên)

[Stack Trace lỗi ở Console]
org.hibernate.LazyInitializationException: could not initialize proxy [Customer#1] - no Session
    at org.hibernate.collection.internal.AbstractPersistentCollection.throwLazyInitializationException(AbstractPersistentCollection.java:351)
    at org.hibernate.collection.internal.AbstractPersistentCollection.withTemporarySessionIfNeeded(AbstractPersistentCollection.java:220)
    at CustomerService.getCustomerWithOrders(CustomerService.java:9)

[Yêu cầu gỡ lỗi 3 bước]
1. Hãy giải thích nguyên nhân gốc rễ (Root Cause) tại sao Hibernate ném ra lỗi này tại dòng 9.
2. Áp dụng kỹ thuật phân tích so sánh để phân tích ưu/nhược điểm của 2 giải pháp: (A) Thêm annotation @Transactional, và (B) Sử dụng truy vấn JPQL "JOIN FETCH" trong Repository.
3. Xuất ra mã nguồn Java sửa đổi tối ưu nhất cho CustomerService và JPQL query (nếu chọn phương án B).
```

#### Kết quả phân tích và sửa lỗi mong đợi từ AI:
AI sẽ giải thích: *Do danh sách Orders được cấu hình LAZY, Hibernate chỉ tạo đối tượng Proxy. Khi hàm kết thúc truy vấn tìm Customer, Session kết nối DB bị đóng. Việc gọi getOrders().size() yêu cầu kết nối DB để tải dữ liệu nhưng session không còn tồn tại, gây lỗi.*

AI đề xuất giải pháp **JPQL JOIN FETCH** (Phương án B) vì tối ưu hiệu năng nhất (chỉ tốn 1 câu lệnh SQL JOIN thay vì phát sinh thêm các câu lệnh SELECT sau này).

```java
// Khai báo Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT c FROM Customer c LEFT JOIN FETCH c.orders WHERE c.id = :id")
    Optional<Customer> findByIdWithOrders(@Param("id") Long id);
}

// Lớp Service sau khi sửa
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomerWithOrders(Long id) {
        // Sử dụng hàm JPQL custom để nạp eager dữ liệu an toàn
        return customerRepository.findByIdWithOrders(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer not found"));
    }
}
```

---

## 6. Tổng kết
- Khi debug bằng AI, tuyệt đối không gửi lỗi suông. Phải gửi kèm mã nguồn xung quanh dòng gây lỗi.
- Ép AI phân tích nguyên nhân gốc rễ (Root Cause) trước khi sinh bản vá để tránh các giải pháp chắp vá làm hỏng kiến trúc hệ thống.
- Sử dụng kỹ thuật so sánh phương án sửa lỗi để chọn ra giải pháp tối ưu nhất cho hiệu năng dài hạn của dự án.

---

## 7. Câu hỏi đánh giá

**Câu 1:** Stack Trace trong Java cung cấp những thông tin cốt lõi nào? Tại sao việc dán Stack Trace thiếu mã nguồn ngữ cảnh lại khiến AI dễ đưa ra các giải pháp sửa lỗi sai lầm hoặc kém hiệu năng?

*Gợi ý đáp án:*
- **Thông tin cốt lõi:** Loại ngoại lệ (Exception Type), thông điệp lỗi chi tiết (Detailed Message), và vết cuộc gọi hàm (Call Stack) chứa tên tệp, tên hàm cùng số dòng gây lỗi.
- **Giải thích:** Nếu thiếu mã nguồn, AI không biết được cấu trúc dữ liệu và thiết kế nghiệp vụ của dự án. AI sẽ đề xuất các giải pháp mang tính chung chung, chắp vá (ví dụ cấu hình bật nạp lazy toàn cục, đổi sang nạp eager vô tội vạ) làm mất đi khả năng kiểm soát hiệu năng hệ thống, dẫn đến lỗi rò rỉ bộ nhớ hoặc N+1 query.

**Câu 2:** Hãy so sánh ưu điểm và nhược điểm của 2 giải pháp gỡ lỗi `LazyInitializationException`: sử dụng `@Transactional` ở Service và sử dụng truy vấn JPQL `JOIN FETCH`. Trong trường hợp nào thì nên ưu tiên cách thứ hai?

*Gợi ý đáp án:*
- **Sử dụng `@Transactional`:** 
  - *Ưu điểm:* Cài đặt cực kỳ nhanh, chỉ cần thêm một annotation. Hibernate sẽ giữ session mở trong suốt hàm.
  - *Nhược điểm:* Dễ dẫn đến lỗi hiệu năng N+1 query (Hibernate phát sinh thêm 1 câu lệnh SELECT cho mỗi thực thể con khi duyệt mảng), làm giữ kết nối DB lâu hơn cần thiết.
- **Sử dụng JPQL `JOIN FETCH`:**
  - *Ưu điểm:* Tải trước toàn bộ dữ liệu cha và con trong đúng 1 truy vấn SQL duy nhất (SQL JOIN), tối ưu hiệu năng tuyệt đối.
  - *Nhược điểm:* Phải viết thêm câu lệnh truy vấn custom trong Repository.
- **Ưu tiên cách thứ hai** khi danh sách liên kết con lớn hoặc khi cần tối ưu hiệu năng truy vấn cho các API RESTful đọc dữ liệu tần suất cao.

**Câu 3 (Thực chiến):** Một lập trình viên viết hàm lọc danh sách các số chẵn từ một danh sách liên kết và xóa chúng. Tuy nhiên, khi chạy code dưới đây thì chương trình bị sập với lỗi `java.util.ConcurrentModificationException` tại dòng 7. Hãy thiết kế một prompt áp dụng quy trình debug 3 bước để AI giải thích nguyên nhân và sửa lại hàm này một cách an toàn nhất bằng Java.

```java
public static void removeEvenNumbers(List<Integer> list) {
    for (Integer num : list) {
        if (num % 2 == 0) {
            list.remove(num); // Dòng 7 gây lỗi ConcurrentModificationException
        }
    }
}
```

*Gợi ý đáp án (Tham khảo Prompt sau):*
```text
Hãy đóng vai trò là một chuyên gia gỡ lỗi Java. 
Hàm removeEvenNumbers của tôi bị lỗi ConcurrentModificationException tại dòng 7 khi chạy thử.

[Mã nguồn lỗi]
public static void removeEvenNumbers(List<Integer> list) {
    for (Integer num : list) {
        if (num % 2 == 0) {
            list.remove(num); // Dòng 7
        }
    }
}

[Stack Trace]
Exception in thread "main" java.util.ConcurrentModificationException
    at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    at MyClass.removeEvenNumbers(MyClass.java:4)

[Yêu cầu gỡ lỗi 3 bước]
1. Hãy giải thích nguyên nhân gốc rễ tại sao vòng lặp for-each của Java lại gây ra lỗi ConcurrentModificationException khi thực hiện xóa phần tử trực tiếp từ list.
2. Hãy so sánh 2 cách sửa: (A) Sử dụng Iterator.remove(), và (B) Sử dụng phương thức Collection.removeIf() giới thiệu từ Java 8.
3. Xuất ra mã nguồn Java đã sửa đổi theo phương án (B) vì code ngắn gọn và tối ưu nhất.
```
