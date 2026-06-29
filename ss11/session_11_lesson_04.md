# Session 11: Kỹ thuật Prompt để tạo mã nguồn dự án

## Lesson 04: Tạo Prompt để tái cấu trúc mã nguồn của dự án

## 1. Mục tiêu học tập
Sau khi hoàn thành bài học này, bạn sẽ có khả năng:
* Sử dụng AI để phát hiện nhanh các dấu hiệu "mã nguồn xấu" (Code Smells) trong dự án.
* Thiết kế Prompt để tái cấu trúc (refactor) mã nguồn từ vòng lặp tuần tự sang cấu trúc khai báo Java Stream API tối ưu.
* Áp dụng AI để refactor các khối điều kiện `if-else` phức tạp bằng cách áp dụng nguyên tắc Đa hình (Polymorphism).

---

## 2. Đặt vấn đề thực tế
Trong hành trình phát triển phần mềm, bạn và đội ngũ của mình đã không ngừng xây dựng và thêm tính năng mới vào một ứng dụng tài chính. Dự án giờ đây đã đạt đến một quy mô đáng kể: hàng trăm module, hàng nghìn file code, và hàng triệu dòng lệnh. 

Mỗi lần cần thêm một tính năng nhỏ hoặc sửa một lỗi, các lập trình viên lại phải "lặn" sâu vào một ma trận các hàm phức tạp, những đoạn code lặp lại, và các khối điều kiện `if-else` chồng chéo. Thời gian hoàn thành công việc cứ thế kéo dài, các lỗi mới liên tục phát sinh, và việc tiếp nhận lập trình viên mới trở thành một cơn ác mộng. Làm thế nào để dọn dẹp hệ thống khổng lồ này một cách hiệu quả?

---

## 3. Kiến thức cốt lõi

### Khái niệm Refactoring và Code Smells
Refactoring (Tái cấu trúc mã nguồn) là quá trình thay đổi cấu trúc bên trong của mã nguồn mà không làm thay đổi hành vi bên ngoài của nó. Mục tiêu là giúp mã nguồn trở nên sạch sẽ, dễ đọc, dễ bảo trì và dễ mở rộng hơn.
Code Smells (Mùi của code) là những dấu hiệu trong mã nguồn cảnh báo cấu trúc hệ thống đang gặp vấn đề (ví dụ: hàm quá dài, class đảm nhận quá nhiều vai trò, các khối điều kiện lồng nhau phức tạp).

### Vai trò của AI trong tái cấu trúc mã nguồn
AI hoạt động giống như một "Senior Reviewer" có kinh nghiệm rộng lớn về các mẫu thiết kế (Design Patterns) và các phương pháp viết code tối ưu (Best Practices). AI có thể giúp:
* Phát hiện nhanh các Code Smells trong đoạn code được chỉ định.
* Đề xuất các giải pháp tối ưu hóa hiệu năng (ví dụ: sử dụng cấu trúc dữ liệu Map/Set thay cho duyệt mảng tuần tự).
* Tách hàm lớn thành các hàm nhỏ đơn trách nhiệm (Single Responsibility).
* Chuyển đổi mã nguồn cũ sang các cú pháp hiện đại của ngôn ngữ (ví dụ: Java Stream API).

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Lập trình viên đối mặt với lớp `DataProcessor` xử lý lọc và chuẩn hóa dữ liệu chuỗi bằng vòng lặp `for` thủ công, cùng với phương thức quản lý người dùng chứa rất nhiều nhánh `if-else` rẽ nhánh theo quyền hạn.

### Thách thức
* Việc tự viết lại các cấu trúc rẽ nhánh phức tạp rất dễ làm thay đổi hoặc mất đi một số quy tắc nghiệp vụ quan trọng.
* Việc tự review thủ công toàn bộ hệ thống tốn nhiều tài nguyên nhân lực và không đảm bảo bao phủ được hết các điểm nghẽn hiệu năng.

### Giải pháp với Antigravity
Sử dụng các prompt chuyên biệt yêu cầu AI phát hiện lỗi hiệu năng và đề xuất giải pháp viết lại mã nguồn theo cấu trúc sạch, đảm bảo giữ nguyên logic nghiệp vụ.

---

## 5. Demo minh họa

### Mục tiêu demo
Thực hành xây dựng Prompt tự động refactor code Java bằng Stream API và Polymorphism.

---

### Ví dụ 1: Thiết kế Prompt Refactor động (sử dụng TypeScript/JavaScript helper)

Lập trình viên có thể viết một script nhỏ để sinh tự động các prompt tái cấu trúc có cấu trúc chuẩn:

```typescript
function generateRefactoringPrompt(codeToRefactor: string, refactoringGoal: string, language: string): string {
    return `Bạn là một chuyên gia tái cấu trúc mã nguồn.
Tôi sẽ cung cấp một đoạn mã nguồn trong ngôn ngữ ${language}.
Mục tiêu của tôi là: ${refactoringGoal}.
Vui lòng phân tích đoạn mã sau và đề xuất/cung cấp phiên bản tái cấu trúc theo best practices.
Đảm bảo giữ nguyên logic nghiệp vụ.
Giải thích chi tiết các thay đổi đã thực hiện.

\`\`\`${language}
${codeToRefactor}
\`\`\``;
}
```

**Cách sử dụng:**
```typescript
const exampleCode = `
class UserService {
    public void processUser(User user) {
        if (user.getRole().equals("ADMIN")) {
            // Logic cho admin
        } else if (user.getRole().equals("EDITOR")) {
            // Logic cho editor
        } else if (user.getRole().equals("VIEWER")) {
            // Logic cho viewer
        }
    }
}
`;

const prompt = generateRefactoringPrompt(
    exampleCode,
    "áp dụng nguyên tắc đa hình (Polymorphism) để loại bỏ các khối if-else lồng nhau",
    "Java"
);
console.log(prompt);
```

---

### Ví dụ 2: Tái cấu trúc vòng lặp bằng Java Stream API

**Mã nguồn ban đầu của `DataProcessor.java`:**
```java
import java.util.List;
import java.util.ArrayList;

public class DataProcessor {
    public List<String> processAndFilterNames(List<String> names) {
        List<String> processedNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A") && name.length() > 3) {
                processedNames.add(name.toUpperCase());
            }
        }
        return processedNames;
    }
}
```

**Prompt gửi AI:**
```text
Bạn là một chuyên gia Java hiệu năng cao.
Tôi có một đoạn mã Java sử dụng vòng lặp để xử lý một danh sách lớn ở trên.
Vui lòng phân tích đoạn mã này, chỉ ra bất kỳ "code smell" nào liên quan đến hiệu năng và đề xuất một phiên bản tái cấu trúc sử dụng Java Stream API để tối ưu hóa.
Hãy giữ nguyên logic nghiệp vụ và giải thích các thay đổi.
```

**Mã nguồn sau khi AI tái cấu trúc:**
```java
import java.util.List;
import java.util.stream.Collectors;

public class DataProcessor {
    /**
     * Lọc và chuyển đổi danh sách tên.
     * Tận dụng Java Stream API để nâng cao tính khai báo và tối ưu hóa luồng dữ liệu.
     */
    public List<String> processAndFilterNames(List<String> names) {
        if (names == null) {
            return List.of();
        }
        return names.stream()
                .filter(name -> name != null && name.startsWith("A") && name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
```
**Giải thích thay đổi từ AI:**
* **Chuyển đổi sang Stream API:** Thay thế vòng lặp `for` tuần tự thủ công, giúp mã nguồn ngắn gọn, mang tính khai báo rõ ràng.
* **Thêm kiểm tra an toàn:** Bổ sung kiểm tra `null` đầu vào và kiểm tra `null` cho từng phần tử để phòng ngừa lỗi `NullPointerException`.
* **Sử dụng Collectors:** Thu thập kết quả trực tiếp, giúp code sạch và dễ tích hợp xử lý song song (`parallelStream`) khi tập dữ liệu lớn.

---

## 6. Tổng kết

### Những kiến thức quan trọng nhất
* AI hỗ trợ đắc lực trong việc phát hiện các Code Smells khó thấy và đưa ra các giải pháp refactor chuẩn mực.
* Nguyên tắc cốt lõi của Refactoring là thay đổi cấu trúc bên trong nhưng giữ nguyên hành vi nghiệp vụ bên ngoài.

### Những lưu ý quan trọng khi thực hiện
* **Kiểm chứng bằng Unit Test:** Sau khi thay đổi code theo AI, bắt buộc phải chạy lại toàn bộ hệ thống Unit Test để đảm bảo không phát sinh lỗi logic mới.
* **Bảo mật mã nguồn:** Không đưa các hàm chứa thông tin nhạy cảm (mật khẩu, API key, thuật toán độc quyền) lên các công cụ AI công cộng. Cần ẩn thông tin trước khi tạo prompt.
* **Chia nhỏ bài toán:** Tránh đưa toàn bộ file mã nguồn lớn vào prompt. Hãy chia nhỏ thành từng hàm hoặc module hẹp để AI xử lý chính xác nhất.

---

## 7. Câu hỏi đánh giá

### Câu 1
Mục tiêu cốt lõi của việc tái cấu trúc (refactoring) mã nguồn là gì? Tại sao phải chạy lại unit test ngay sau khi refactor?

**Gợi ý đáp án:**
Mục tiêu của refactoring là cải thiện cấu trúc bên trong của code (giúp code sạch hơn, dễ bảo trì, dễ hiểu và tối ưu hiệu năng hơn) mà không làm thay đổi hành vi nghiệp vụ bên ngoài. Phải chạy lại unit test ngay lập tức vì việc thay đổi cấu trúc code rất dễ vô tình gây ra các lỗi logic mới (regression bugs). Unit test sẽ giúp phát hiện ra các lỗi này ngay lập tức.

### Câu 2
Nêu một số dấu hiệu "mã nguồn xấu" (Code Smells) mà AI có thể giúp bạn phát hiện và đề xuất hướng xử lý.

**Gợi ý đáp án:**
- **Long Method (Hàm quá dài):** AI đề xuất tách hàm thành nhiều hàm nhỏ đơn trách nhiệm.
- **Nested If-Else (Các khối điều kiện lồng nhau):** AI đề xuất áp dụng nguyên tắc Đa hình (Polymorphism) hoặc sử dụng câu lệnh Guard Clauses (trả về sớm).
- **Duplicate Code (Code trùng lặp):** AI đề xuất gom nhóm logic chung vào một helper class hoặc phương thức dùng chung.

### Câu 3
Khi sử dụng AI để refactor một hàm xử lý nghiệp vụ phức tạp của doanh nghiệp, lập trình viên cần làm những gì để đảm bảo an toàn bảo mật?

**Gợi ý đáp án:**
1. Rà soát đoạn code trước khi dán vào prompt để tìm và xóa/thay thế các thông tin nhạy cảm như thông tin kết nối database, các khóa API, hoặc dữ liệu khách hàng thật.
2. Thay thế tên các biến, hàm đặc thù của doanh nghiệp bằng các tên chung chung (dummy names) nếu đó là thuật toán cốt lõi bảo mật.
3. Sử dụng các công cụ AI được triển khai trong môi trường mạng nội bộ của doanh nghiệp (Private AI/Local LLM) nếu có quy định bảo mật bắt buộc.
