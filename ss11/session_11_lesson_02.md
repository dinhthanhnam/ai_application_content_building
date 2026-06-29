# Session 11: Kỹ thuật Prompt để tạo mã nguồn dự án

## Lesson 02: Tạo Prompt để sinh docstring, comment, giải thích logic

## 1. Mục tiêu học tập
Sau khi hoàn thành bài học này, bạn sẽ có khả năng:
* Viết Prompt để AI phân tích và giải thích chi tiết các khối logic code, vòng lặp và điều kiện rẽ nhánh phức tạp.
* Sử dụng AI để sinh tài liệu Javadoc/docstring chuẩn chỉnh cho các lớp (class) và phương thức (method) trong dự án.
* Áp dụng AI để viết các chú thích nội dòng (inline comments) giải thích nghiệp vụ ngắn gọn và súc tích.

---

## 2. Đặt vấn đề thực tế
Trong một dự án phần mềm lớn, đặc biệt là các hệ thống Backend phức tạp, bạn thường xuyên phải làm việc với các khối mã do người khác viết, hoặc tệ hơn là mã nguồn cũ đã lâu không ai đụng đến (Legacy Code). 

Đôi khi, bạn mất hàng giờ, thậm chí hàng ngày chỉ để hiểu một Service hay Controller đơn giản mà có lẽ tác giả đã viết trong vòng vài phút. Những dòng mã "ma thuật" này hoạt động như thế nào, dữ liệu đi từ đâu đến đâu, và mục đích thực sự của nó là gì? Sự thiếu hụt tài liệu và lời giải thích rõ ràng không chỉ làm chậm tiến độ mà còn tiềm ẩn rất nhiều lỗi khi bạn buộc phải thay đổi hoặc mở rộng chúng.

---

## 3. Kiến thức cốt lõi

### Tầm quan trọng của việc tài liệu hóa mã nguồn
Tài liệu hóa (Documentation) giúp duy trì tính bền vững của dự án. Code dễ đọc và có tài liệu đi kèm giúp giảm thời gian nghiên cứu mã nguồn của lập trình viên mới và hỗ trợ đắc lực cho quy trình Code Review.

### Ứng dụng AI trong giải nghĩa và chú thích code
* **Giải nghĩa logic:** AI phân tích luồng điều khiển (vòng lặp, điều kiện) và chuyển đổi thành các bước mô tả bằng ngôn ngữ tự nhiên giúp lập trình viên hiểu nhanh ý đồ của đoạn code.
* **Tự động sinh Javadoc/Docstring:** AI tự động điền các thẻ tiêu chuẩn như `@param`, `@return`, `@throws` giúp chuẩn hóa tài liệu API.
* **Inline Comments nghiệp vụ:** AI giúp tóm tắt các phép biến đổi dữ liệu phức tạp thành các ghi chú ngắn ngay trước dòng code, tập trung giải thích *tại sao* (why) thay vì giải thích cú pháp *như thế nào* (how).

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Lập trình viên tiếp nhận lớp `OrderProcessingService` chứa logic duyệt đơn hàng, lọc trạng thái, biến đổi thông tin và tính điểm số cho khách hàng.

### Thách thức
Hàm xử lý có nhiều khối điều kiện `if` lồng nhau. Việc tự đọc và viết tài liệu hướng dẫn cho hàm này tốn thời gian và dễ bỏ sót các quy tắc lọc (ví dụ: chỉ lọc đơn hàng "ACTIVE").

### Giải pháp
Bôi đen đoạn code của hàm, gửi prompt yêu cầu AI giải nghĩa và sinh Javadoc chuẩn để đính kèm trực tiếp vào mã nguồn.

---

## 5. Demo minh họa

### Mục tiêu demo
Minh họa cách viết prompt để AI giải nghĩa và sinh Javadoc/comment cho lớp `MathService` và `OrderProcessingService`.

---

### Ví dụ 1: Sinh Javadoc cho phương thức tính giai thừa (`MathService`)

**Mã nguồn ban đầu:**
```java
public class MathService {
    public long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        } else if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
```

**Prompt sinh Javadoc:**
```text
Sinh JavaDoc chuẩn cho phương thức calculateFactorial trong Spring Boot, bao gồm mô tả hàm, các tham số @param, giá trị trả về @return và ngoại lệ @throws bằng tiếng Anh.
```

**Kết quả sau khi chèn Javadoc do AI sinh ra:**
```java
public class MathService {
    /**
     * Calculates the factorial of a non-negative integer.
     *
     * @param n The integer to calculate the factorial of. Must be non-negative.
     * @return The factorial of n.
     * @throws IllegalArgumentException If n is negative.
     */
    public long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        } else if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
```

---

### Ví dụ 2: Giải thích logic và sinh tài liệu cho `OrderProcessingService`

**Mã nguồn ban đầu:**
```java
@Service
public class OrderProcessingService {
    public List<Double> processOrders(List<Order> orderRecords) {
        List<Double> processedData = new ArrayList<>();
        for (Order record : orderRecords) {
            if (record.isValid()) {
                Order transformedRecord = record.transform();
                if ("ACTIVE".equalsIgnoreCase(transformedRecord.getStatus())) {
                    double computedValue = transformedRecord.computeScore();
                    processedData.add(computedValue);
                }
            }
        }
        return processedData;
    }
}
```

**Prompt giải nghĩa logic:**
```text
Giải thích chi tiết logic của phương thức processOrders này. Nhấn mạnh mục đích của mỗi bước kiểm tra điều kiện và biến đổi dữ liệu. Trình bày dưới dạng các bước rõ ràng.
```
*AI sẽ phản hồi các bước xử lý: 1. Khởi tạo danh sách kết quả; 2. Duyệt từng đơn hàng và kiểm tra tính hợp lệ qua `isValid()`; 3. Biến đổi cấu trúc dữ liệu qua `transform()`; 4. Lọc trạng thái "ACTIVE" (không phân biệt chữ hoa thường); 5. Tính toán điểm số qua `computeScore()` và lưu vào danh sách.*

**Prompt sinh Javadoc và Inline Comment nghiệp vụ:**
```text
Hãy sinh Javadoc tiếng Anh cho phương thức processOrders này. Đồng thời, viết một inline comment ngắn gọn bằng tiếng Anh giải thích mục đích chính của dòng gọi phương thức transform().
```

**Mã nguồn sau khi áp dụng phản hồi từ AI:**
```java
@Service
public class OrderProcessingService {
    /**
     * Processes a list of order records by filtering, transforming, and calculating scores for active orders.
     *
     * @param orderRecords A list of {@link Order} objects representing the raw data to be processed.
     * @return A {@link List} of {@link Double} representing the computed scores for all valid and active orders.
     */
    public List<Double> processOrders(List<Order> orderRecords) {
        List<Double> processedData = new ArrayList<>(); 
        for (Order record : orderRecords) {
            if (record.isValid()) {
                // Apply complex business rules including data normalization and enrichment for the specific order type
                Order transformedRecord = record.transform(); 
                if ("ACTIVE".equalsIgnoreCase(transformedRecord.getStatus())) { 
                    double computedValue = transformedRecord.computeScore(); 
                    processedData.add(computedValue);
                }
            }
        }
        return processedData;
    }
}
```

---

## 6. Tổng kết

### Những kiến thức quan trọng nhất
* Sử dụng AI giúp đẩy nhanh tiến độ viết tài liệu kỹ thuật của dự án, đảm bảo mã nguồn tuân thủ Clean Code.
* Javadoc giúp định nghĩa rõ ràng các giao diện API (Input/Output/Exceptions) giúp các lập trình viên khác dễ dàng sử dụng lại.

### Những lưu ý quan trọng khi sử dụng
* **Rà soát lại thông tin:** AI không hiểu sâu nghiệp vụ đặc thù của dự án nên có thể giải thích sai mục đích của hàm. Luôn phải đọc lại và sửa từ ngữ cho chính xác.
* **Tránh lạm dụng comment:** Không comment giải thích những dòng code quá rõ ràng (ví dụ: `int a = 5; // Gán a bằng 5`). Chỉ comment ở những khối logic nghiệp vụ phức tạp hoặc giải thuật khó hiểu.

---

## 7. Câu hỏi đánh giá

### Câu 1
Nêu sự khác biệt về mặt mục đích giữa Javadoc (docstring) ở đầu phương thức và Inline Comment (chú thích nội dòng) bên trong phương thức.

**Gợi ý đáp án:**
- **Javadoc:** Dành cho người sử dụng phương thức. Nó tập trung giải thích phương thức này làm gì, nhận vào tham số gì, trả về kết quả gì và ném ra lỗi nào (mô tả giao diện API).
- **Inline Comment:** Dành cho người bảo trì mã nguồn bên trong phương thức. Nó tập trung giải thích *tại sao* logic đó lại được viết như vậy (giải thích chi tiết cài đặt và quy tắc nghiệp vụ đặc thù).

### Câu 2
Viết một prompt chuẩn để yêu cầu AI giải thích một đoạn code legacy phức tạp mà bạn chưa từng tiếp xúc.

**Gợi ý đáp án:**
```text
Bạn là một lập trình viên Java lâu năm. Hãy đọc đoạn code dưới đây và:
1. Giải thích mục đích tổng quan của đoạn code này.
2. Tách nhỏ logic và giải thích chi tiết từng bước xử lý, đặc biệt là các cấu trúc vòng lặp và câu lệnh rẽ nhánh.
3. Chỉ ra các điều kiện biên hoặc lỗi tiềm ẩn (nếu có).
[Dán đoạn code]
```

### Câu 3
Tại sao nguyên tắc Clean Code khuyên chúng ta "hạn chế comment giải thích cú pháp code"? AI có thể giúp gì để cải thiện điều này?

**Gợi ý đáp án:**
Vì comment giải thích cú pháp (ví dụ: giải thích vòng lặp `for` chạy từ 0 đến n) là dư thừa, khiến code bị rối và nhanh chóng lỗi thời khi logic code thay đổi. Code tốt nhất nên tự giải nghĩa (Self-documenting code). AI có thể giúp cải thiện bằng cách refactor lại đặt tên hàm, tên biến rõ ràng hơn và thay thế các comment cú pháp thừa bằng cấu trúc code ngắn gọn, mạch lạc.