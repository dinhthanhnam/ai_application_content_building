# HƯỚNG DẪN TỰ THỰC HÀNH - SESSION 03
## Chủ đề: Kỹ thuật đặt Prompt căn bản (5 thành phần chuẩn)

Tài liệu này hướng dẫn bạn thực hành từng bước để xây dựng một Prompt có cấu trúc chuẩn nhằm điều khiển AI hoạt động chính xác theo mong muốn, chuyển đổi kết quả từ văn phong kỹ thuật sang văn phong kinh doanh dễ hiểu.

> [!NOTE]
> *   **Hình thức:** Bài tập tự thực hành (Self-guided Practice), sinh viên tự hoàn thành tại nhà.
> *   **Yêu cầu nộp bài:** **KHÔNG CẦN NỘP BÀI**. Không chấm điểm và không kiểm tra.
> *   **Thời gian ước tính:** 30 phút.

---

### BƯỚC 1: Thử nghiệm với Prompt thô sơ (Không cấu trúc) (5 phút)

1.  Mở trợ lý AI (ChatGPT, Claude hoặc Gemini).
2.  Sao chép đoạn mã nguồn Java tính lãi suất ngân hàng dưới đây:
    ```java
    public class InterestCalculator {
        public static double calculateInterest(double principal, int termInMonths, double annualRate) {
            if (principal <= 0 || termInMonths <= 0 || annualRate <= 0) {
                return 0;
            }
            double monthlyRate = annualRate / 12;
            double totalInterest = 0;
            for (int i = 0; i < termInMonths; i++) {
                totalInterest += (principal + totalInterest) * monthlyRate;
            }
            return totalInterest;
        }
    }
    ```
3.  Gửi đoạn code trên cho AI kèm theo yêu cầu ngắn nhất:
    > `"Giải thích code này"`
4.  **Đọc kết quả phản hồi:** Bạn sẽ nhận thấy AI giải thích rất chi tiết về lập trình (như *vòng lặp for, biến monthlyRate, phép cộng dồn totalInterest...*). Đoạn giải thích này quá phức tạp và vô dụng nếu bạn muốn gửi cho một khách hàng gửi tiền tiết kiệm (người không biết lập trình).

---

### BƯỚC 2: Thêm "Vai trò" (Role) và "Mục tiêu" (Goal) (5 phút)

Chúng ta sẽ bắt đầu nâng cấp prompt bằng cách định vị AI để thay đổi góc nhìn giải thích.

1.  Gửi lại đoạn code Java trên với prompt mới dưới đây:
    > `"Bạn là một Chuyên viên Phân tích Nghiệp vụ (BA). Hãy giải thích logic hoạt động của hàm Java dưới đây để gửi cho khách hàng."`
2.  **Đọc kết quả phản hồi:** Bạn sẽ thấy văn phong của AI lập tức chuyển đổi từ "ngôn ngữ lập trình viên" sang "ngôn ngữ nghiệp vụ" (ví dụ: giải thích về *lãi suất hàng tháng, tiền gốc, kỳ hạn gửi*...). Tuy nhiên, AI vẫn có thể lọt các thuật ngữ code hoặc viết quá dài.

---

### BƯỚC 3: Thiết lập "Ngữ cảnh" (Context) và "Ràng buộc" (Constraint) (10 phút)

Để kiểm soát chặt chẽ câu trả lời của AI, chúng ta cần đưa vào các giới hạn nghiêm ngặt.

1.  Hãy gửi prompt nâng cấp dưới đây kèm đoạn code Java:
    > `"Bạn là một Chuyên viên Phân tích Nghiệp vụ (BA). Hãy giải thích logic hoạt động của hàm Java dưới đây cho khách hàng.*
    > *Ngữ cảnh: Khách hàng của tôi là những người gửi tiền tiết kiệm bình thường, không biết lập trình.*
    > *Ràng buộc: Tuyệt đối không sử dụng bất kỳ từ ngữ kỹ thuật lập trình nào trong câu trả lời (như class, hàm, biến, double, vòng lặp for, return, i++...). Giải thích ngắn gọn dưới 150 từ."`
2.  **Đọc kết quả phản hồi:** Hãy quan sát xem AI có vi phạm ràng buộc không. Bạn sẽ thấy AI đã lọc bỏ hoàn toàn các từ kỹ thuật và giải thích logic tính lãi kép một cách rất đời thường và dễ hiểu.

---

### BƯỚC 4: Thiết lập "Định dạng đầu ra" (Format) (5 phút)

Bước cuối cùng để hoàn thiện một Prompt 5 thành phần chuẩn là định dạng cách hiển thị thông tin để khách hàng dễ quét nhanh mắt.

1.  Gửi prompt hoàn chỉnh dưới đây:
    > `"Bạn là một Chuyên viên Phân tích Nghiệp vụ (BA). Hãy giải thích logic hoạt động của hàm Java dưới đây cho khách hàng.*
    > *Ngữ cảnh: Khách hàng của tôi là những người gửi tiền tiết kiệm bình thường, không biết lập trình.*
    > *Ràng buộc: Tuyệt đối không sử dụng bất kỳ từ ngữ kỹ thuật lập trình nào trong câu trả lời (như class, hàm, biến, double, vòng lặp for, return...). Giải thích ngắn gọn dưới 150 từ.*
    > *Định dạng: Trình bày dưới dạng 3 gạch đầu dòng ngắn gọn và dễ hiểu."`
2.  **Đọc kết quả phản hồi:** AI sẽ xuất ra đúng 3 gạch đầu dòng rất tinh gọn và dễ nhìn.

---

### BƯỚC 5: Thực hành tối ưu hóa lặp (Iterative Prompting) (5 phút)

Nếu kết quả ở Bước 4 vẫn còn một số điểm chưa ưng ý (ví dụ: AI dùng từ *"lãi suất lũy kế"* hơi khó hiểu), bạn hãy tiếp tục tương tác lặp để tinh chỉnh:

1.  Gõ tiếp lệnh chat:
    > `"Hãy sửa lại gạch đầu dòng thứ 2, thay thế cụm từ 'lãi suất lũy kế' bằng 'lãi cộng dồn' để khách hàng dễ hiểu hơn."`
2.  **So sánh kết quả cuối cùng với kết quả ở Bước 1:** Bạn sẽ tự cảm nhận được sức mạnh của việc thiết kế Prompt có cấu trúc và kỹ thuật tối ưu hóa lặp. Đây là kỹ năng nền tảng của một Augmented Developer.

---

*Chúc mừng bạn đã hoàn thành bài tự thực hành Session 03! Bạn đã nắm vững cách làm chủ đầu ra của AI bằng Prompt 5 thành phần.*
