# Session 01: Định hướng môn học AI Application in Action

## Lesson 01: Tổng quan môn học và định hướng học tập đầu môn học

## 1. Mục tiêu học tập
Sau khi hoàn thành bài học này, bạn sẽ có khả năng:
* Nắm rõ cấu trúc môn học, các mốc đánh giá và kỳ vọng đầu ra.
* Hiểu rõ sự dịch chuyển vai trò của lập trình viên trong kỷ nguyên AI.
* Áp dụng phương pháp làm việc kết hợp AI để nâng cao hiệu suất học tập và làm việc.

---

## 2. Đặt vấn đề thực tế
Khi bắt đầu một dự án mới hoặc gia nhập một doanh nghiệp, nhân sự thường phải đối mặt với lượng lớn tài liệu nghiệp vụ và mã nguồn phức tạp (Legacy Code). Nếu tiếp cận theo phương pháp truyền thống như tự mò mẫm đọc hiểu từng dòng code, bạn sẽ tốn rất nhiều thời gian và dễ bị quá tải thông tin. 

Việc ứng dụng công cụ AI giúp tăng tốc độ đọc hiểu hệ thống, rút ngắn thời gian onboarding từ hàng tuần xuống còn vài giờ, giúp bạn nhanh chóng đóng góp giá trị cho dự án.

---

## 3. Kiến thức cốt lõi

### Khái niệm AI Application in Action
Môn học này không chỉ hướng dẫn viết code, mà trọng tâm là phương pháp tương tác và làm việc cùng AI để giải quyết các bài toán nghiệp vụ thực tế trong doanh nghiệp.

### Sự dịch chuyển vai trò của lập trình viên
Trong quy trình làm việc hiện đại, vai trò của con người dịch chuyển từ **Thực thi** (viết cú pháp chi tiết) sang **Định hướng và Kiểm soát** (thiết kế luồng nghiệp vụ và kiểm chứng kết quả từ AI).

```text
Sơ đồ dịch chuyển vai trò:

[Truyền thống]                      [Hiện đại (Kết hợp AI)]
+------------------------+          +------------------------+
| 70% Viết code thủ công |          | 70% Đặt Prompt & Kiểm  |
| (Gõ cú pháp lặp lại)   | ------>  | chứng (Verify)         |
+------------------------+          +------------------------+
| 30% Tư duy & Thiết kế  |          | 30% Tư duy hệ thống &  |
| nghiệp vụ              |          | Thiết kế giải pháp     |
+------------------------+          +------------------------+
```

* **Mô tả hình ảnh:** Sơ đồ đối chiếu vai trò của lập trình viên. Phía bên trái thể hiện quy trình truyền thống mất nhiều thời gian gõ cú pháp lặp lại. Phía bên phải thể hiện quy trình hiện đại, nơi lập trình viên thư thái thiết kế hệ thống và kiểm chứng mã nguồn do AI hỗ trợ tạo ra.
* **Prompt gợi ý (English):** A clean minimalist infographic diagram comparing traditional programming and AI-assisted programming. The left column shows "Traditional" workflow with a large red section for manual coding. The right column shows "Augmented" workflow with a large green section for prompting and verification. Corporate style, clean white background, modern flat design.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Một kỹ sư phần mềm mới gia nhập dự án quản lý tài chính doanh nghiệp và được giao xử lý một module tính toán thuế suất.

### Thách thức
Module này gồm nhiều file phức tạp, thiếu tài liệu hướng dẫn nghiệp vụ và người cũ đã nghỉ việc. Kỹ sư mới cần sửa một lỗi logic gấp trong vòng 1 ngày.

### Cách tiếp cận
Kỹ sư sử dụng trợ lý AI để giải nghĩa nhanh luồng code của module, đồng thời yêu cầu AI vẽ lại luồng xử lý dạng sơ đồ văn bản và chỉ ra các điều kiện biên.

### Kết quả
Chỉ sau 1 giờ, kỹ sư nắm rõ logic nghiệp vụ của module, xác định được vị trí lỗi và hoàn thành sửa đổi trong buổi sáng, rút ngắn tiến độ so với 3 ngày nếu tự đọc code thủ công.

---

## 5. Demo minh họa

### Mục tiêu demo
Dùng AI giải nghĩa logic của một hàm kiểm tra ưu đãi khách hàng viết bằng Java.

### Prompt sử dụng
```text
Hãy phân tích logic hoạt động và các điều kiện rẽ nhánh của hàm Java dưới đây. Giải thích ngắn gọn và dễ hiểu.
```

### Mã nguồn
```java
public class DiscountService {
    public static boolean isEligibleForDiscount(int age, boolean hasMembership) {
        if (age >= 60) {
            return true;
        }
        return hasMembership;
    }
}
```

### Giải thích mã nguồn
Từ đoạn code trên, AI phân tích nhanh logic như sau:
* **Hàm `isEligibleForDiscount`** nhận vào hai tham số: độ tuổi của khách hàng (`age`) và trạng thái thẻ thành viên (`hasMembership`).
* **Điều kiện 1:** Nếu khách hàng từ 60 tuổi trở lên (`age >= 60`), hàm lập tức trả về `true` (đủ điều kiện hưởng ưu đãi).
* **Điều kiện 2:** Nếu khách hàng dưới 60 tuổi, kết quả phụ thuộc vào trạng thái thẻ thành viên (`hasMembership`). Trả về `true` nếu có thẻ và `false` nếu không.

---

## 6. Tổng kết

### Những kiến thức quan trọng nhất
* Lập trình viên thời đại AI cần chuyển từ tư duy viết code sang tư duy đặt Prompt và kiểm chứng kết quả (Verify).
* AI là công cụ hỗ trợ onboarding và học tập chủ động cực kỳ hiệu quả để giải quyết các bài toán nghiệp vụ.

### Những sai lầm thường gặp
* Tin tưởng tuyệt đối vào kết quả của AI mà không chạy thử nghiệm hoặc kiểm tra lại logic.
* Đưa các dữ liệu bảo mật hoặc mã nguồn độc quyền của doanh nghiệp lên AI công cộng.

---

## 7. Câu hỏi đánh giá

### Câu 1
Trong mô hình làm việc kết hợp AI (Augmented Workflow), phân bổ thời gian của lập trình viên thay đổi như thế nào so với truyền thống?

**Gợi ý đáp án:**
Lập trình viên không còn dành phần lớn thời gian (70%) để gõ code thủ công và sửa lỗi cú pháp. Thay vào đó, thời gian này được dịch chuyển sang việc thiết kế Prompt, xây dựng logic hệ thống và kiểm chứng (Verify) chất lượng đầu ra của AI.

### Câu 2
Phân tích lợi ích lớn nhất của việc dùng AI khi tiếp nhận một dự án mới (onboarding) không có tài liệu hướng dẫn nghiệp vụ.

**Gợi ý đáp án:**
AI có khả năng đọc hiểu và tóm tắt luồng dữ liệu của mã nguồn cũ trong vài giây. Điều này giúp nhân sự mới nắm bắt nghiệp vụ cốt lõi ngay lập tức mà không cần mò mẫm đọc từng dòng code thô, rút ngắn đáng kể thời gian onboarding và tránh làm phiền đồng nghiệp.

### Câu 3
Khi sử dụng AI để viết code cho doanh nghiệp, bạn cần thực hiện những bước nào để đảm bảo an toàn hệ thống?

**Gợi ý đáp án:**
Cần thực hiện quy trình kiểm chứng nghiêm ngặt:
1. Đọc hiểu và phân tích kỹ giải pháp AI đề xuất để phát hiện lỗi logic.
2. Viết và chạy các bộ kiểm thử tự động (Unit Test) bao phủ các trường hợp biên để xác nhận code hoạt động chính xác.
3. Không chia sẻ mã nguồn độc quyền hoặc dữ liệu bảo mật lên các công cụ AI công cộng.
