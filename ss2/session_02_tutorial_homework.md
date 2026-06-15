# HƯỚNG DẪN TỰ THỰC HÀNH - SESSION 02
## Chủ đề: Trải nghiệm giới hạn của AI & Kỹ thuật kiểm chứng (Verify)

Tài liệu này là hướng dẫn thực hành step-by-step giúp bạn tự khám phá giới hạn của AI, trực tiếp đối mặt với hiện tượng "ảo tưởng" (hallucination) và rèn luyện kỹ năng kiểm chứng thông tin.

> [!NOTE]
> *   **Hình thức:** Bài tập tự thực hành (Self-guided Practice), sinh viên tự hoàn thành tại nhà.
> *   **Yêu cầu nộp bài:** **KHÔNG CẦN NỘP BÀI**. Không chấm điểm và không kiểm tra.
> *   **Thời gian ước tính:** 30 phút.

---

### BƯỚC 1: So sánh khả năng đọc hiểu của các mô hình AI khác nhau (5 phút)

1.  Mở sẵn hai tab trình duyệt trên máy tính:
    *   **Tab 1:** ChatGPT (phiên bản miễn phí hoặc trả phí).
    *   **Tab 2:** Claude (hoặc một mô hình LLM khác như Gemini/Copilot).
2.  Sao chép đoạn mã nguồn Java dưới đây:
    ```java
    public class TaxService {
        public static double calculateFinalPrice(double basePrice, double taxRate, double discount) {
            if (basePrice <= 0) {
                return 0;
            }
            double priceWithTax = basePrice * (1 + taxRate);
            return priceWithTax - discount;
        }
    }
    ```
3.  Gửi đoạn code trên cho cả 2 AI với cùng một prompt thô sơ:
    > `"Hãy giải nghĩa đoạn code này giúp tôi."`
4.  **Tự quan sát và đánh giá:**
    *   AI nào phản hồi nhanh hơn?
    *   AI nào giải thích logic rẽ nhánh (`if (basePrice <= 0)`) rõ ràng và dễ hiểu hơn?
    *   AI nào định dạng văn bản (sử dụng in đậm, danh sách gạch đầu dòng) chuyên nghiệp hơn?

---

### BƯỚC 2: Thử thách AI bằng "Bẫy dữ liệu" (Phát hiện Ảo tưởng - Hallucination) (10 phút)

AI rất thông minh nhưng có một điểm yếu chí mạng: khi gặp kiến thức không biết, chúng thường có xu hướng tự bịa ra thông tin trông rất thuyết phục thay vì thừa nhận "tôi không biết". Bạn sẽ tự mình bắt lỗi này của AI.

1.  Hãy gửi chính xác prompt dưới đây cho cả hai công cụ AI:
    > `"Tôi đang viết ứng dụng Java quản lý danh sách sản phẩm. Hãy hướng dẫn tôi cách sử dụng hàm List.sortByMultipleProperties() có sẵn trong thư viện JDK chuẩn của Java để sắp xếp danh sách theo nhiều thuộc tính cùng lúc."`
2.  **Đọc và phân tích kỹ câu trả lời:**
    *   *Sự thật kỹ thuật:* Trong thư viện JDK chuẩn của Java **không hề tồn tại** bất kỳ phương thức nào có tên là `sortByMultipleProperties()` trên interface `List`.
    *   Hãy xem AI phản hồi như thế nào:
        *   **Trường hợp A (AI bị ảo tưởng):** AI tự viết một đoạn code ví dụ sử dụng hàm `List.sortByMultipleProperties()` và giải thích các tham số truyền vào như thể hàm đó thực sự tồn tại. (Đây chính là hiện tượng ảo tưởng nguy hiểm trong lập trình).
        *   **Trường hợp B (AI tỉnh táo):** AI phát hiện ra thư viện chuẩn của Java không có hàm này, cảnh báo bạn và gợi ý cách làm đúng bằng cách sử dụng `Comparator.comparing().thenComparing()`.

---

### BƯỚC 3: Kỹ thuật truy vấn lại để bắt lỗi AI (10 phút)

Nếu AI ở Bước 2 rơi vào **Trường hợp A** (bịa code lỗi), hãy thực hành kỹ thuật "chất vấn" AI để buộc nó phải kiểm tra lại cơ sở tri thức của mình.

1.  Nhắn tiếp đoạn prompt dưới đây vào chính cuộc hội thoại đó:
    > `"Bạn có chắc chắn interface java.util.List trong thư viện JDK chuẩn của Java có sẵn phương thức sortByMultipleProperties() không? Hãy kiểm tra lại thật kỹ tài liệu chính thức của Oracle Java."`
2.  **Quan sát phản hồi:**
    *   Bạn sẽ thấy AI lập tức xin lỗi (ví dụ: *"Tôi xin lỗi vì sự nhầm lẫn này..."*) và thừa nhận hàm đó không tồn tại.
    *   Sau đó, AI sẽ viết lại cho bạn đoạn code chuẩn bằng cách sử dụng `Comparator` hoặc Stream API để sắp xếp danh sách.
3.  **Bài học rút ra:** Không bao giờ tin tưởng code của AI 100% khi chưa chạy thử hoặc chưa đối chiếu với tài liệu chính thức (Oracle Java Docs). Luôn sẵn sàng đặt câu hỏi nghi ngờ khi thấy AI đưa ra các hàm hoặc thư viện có tên lạ.

---

### BƯỚC 4: Thực hành tối ưu hóa phương án đúng (5 phút)

Sau khi AI đã nhận lỗi và đưa ra giải pháp đúng (sử dụng `Comparator`), hãy tự mình đọc hiểu đoạn code đúng đó:

*   **Giải pháp đúng thông thường trong Java:**
    ```java
    import java.util.Comparator;
    import java.util.List;
    
    public class SortExample {
        public static void sortProducts(List<Product> products) {
            // Sắp xếp danh sách sản phẩm theo giá tăng dần, nếu bằng giá thì sắp xếp theo tên
            products.sort(Comparator.comparing(Product::getPrice)
                                    .thenComparing(Product::getName));
        }
    }
    ```
*   **Tự suy ngẫm:** Đoạn code đúng này ngắn gọn và an toàn hơn rất nhiều so với việc cố gắng đi tìm hoặc tự viết các hàm sắp xếp lặp thủ công. AI sau khi được sửa lỗi đã mang lại một giải pháp thực sự chất lượng.

---

*Chúc mừng bạn đã hoàn thành bài tự thực hành Session 02! Bạn đã biết cách làm việc cẩn trọng hơn với trợ lý AI của mình.*
