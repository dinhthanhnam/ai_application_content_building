# HƯỚNG DẪN TỰ THỰC HÀNH - SESSION 05
## Chủ đề: Kỹ thuật đặt Prompt nâng cao (Phần 1)

Tài liệu này hướng dẫn bạn thực hành từng bước để làm chủ các kỹ thuật Prompting nâng cao (Chain-of-thought, Multiple Options, What-if Scenario, và Prompt Refinement) bằng cách trực tiếp tương tác với trợ lý AI. Bạn sẽ thấy rõ sự khác biệt lớn về độ an toàn và độ chính xác của mã nguồn khi nâng cấp từ prompt thô sơ lên prompt có cấu trúc nâng cao.

> [!NOTE]
> *   **Hình thức:** Bài tập tự thực hành (Self-guided Practice), sinh viên tự hoàn thành tại nhà hoặc trên lớp.
> > *   **Yêu cầu nộp bài:** **KHÔNG CẦN NỘP BÀI**. Không chấm điểm và không kiểm tra.
> > *   **Thời gian ước tính:** 30 phút.

---

### BƯỚC 1: Trải nghiệm Zero-shot vs. Chain-of-Thought (CoT) (10 phút)

Chúng ta sẽ thử nghiệm yêu cầu AI giải quyết một bài toán tính toán nghiệp vụ có nhiều bước phụ thuộc lẫn nhau.

1.  Mở trợ lý AI (ChatGPT, Claude hoặc Gemini).
2.  Gửi prompt thô sơ dưới đây cho AI:
    > `"Viết hàm Java tính tổng tiền thanh toán cho đơn hàng gồm: giảm giá coupon 10% (cho đơn trên 500k), chiết khấu thành viên Gold 5%, thuế VAT 10% và phí ship 30k (miễn phí ship cho đơn trên 1 triệu)."`
3.  **Đọc kết quả phản hồi:** Bạn sẽ nhận thấy AI viết code ngay lập tức (Zero-shot). Tuy nhiên, hãy nhìn kỹ logic: AI có thể tính thuế VAT 10% trực tiếp trên giá gốc (thay vì giá sau khi đã giảm giá), hoặc cộng phí ship trước rồi mới tính chiết khấu. Việc nhảy vọt này rất dễ gây sai sót về mặt kế toán tài chính.
4.  Bây giờ, hãy nâng cấp prompt bằng kỹ thuật **Chain-of-thought (CoT)**, hướng dẫn AI tư duy tuần tự và thực hiện chạy thử (dry-run) bằng cách gửi prompt dưới đây:
    > `"Hãy đóng vai trò là một Java Developer chuyên nghiệp kiêm chuyên gia tài chính. Nhiệm vụ của bạn là viết một class Java tính tổng tiền thanh toán đơn hàng.*
    > *Ràng buộc: Sử dụng Java 17, kiểu dữ liệu BigDecimal để tránh sai số làm tròn tiền tệ.*
    > *Quy trình thực hiện (CoT):*
    > *Đừng viết code ngay. Hãy phân tích và suy luận từng bước sau ra màn hình trước:*
    > *1. Xác định thứ tự ưu tiên tính toán đúng: Tính tổng giá trị gốc -> Áp dụng coupon 10% (nếu đơn >= 500k) -> Áp dụng chiết khấu thành viên Gold 5% trên số tiền sau coupon -> Cộng thuế VAT 10% -> Cộng phí ship (miễn phí ship nếu đơn sau chiết khấu lớn hơn 1 triệu, ngược lại phí ship là 30k).*
    > *2. Thực hiện chạy nháp (Dry-run) bằng toán học với ví dụ: Giỏ hàng trị giá 1,200,000 VND. Tính toán số tiền từng bước cụ thể bằng văn bản để kiểm tra.*
    > *3. Cuối cùng, sinh ra mã nguồn Java hoàn chỉnh tuân thủ các phân tích trên."`
5.  **So sánh kết quả:** Bạn sẽ thấy AI in ra từng bước suy luận logic cực kỳ rõ ràng, thực hiện phép tính nháp chính xác cho ví dụ 1.2M VND (và nhận ra đơn hàng này được miễn phí ship vì > 1 triệu), sau đó xuất ra class Java sử dụng đúng `BigDecimal` với cấu trúc vô cùng sạch sẽ.

---

### BƯỚC 2: Tự trải nghiệm Multiple Options và What-if Scenario (10 phút)

Khi bắt đầu một tính năng mới, thay vì để AI tự ý chọn công nghệ, bạn hãy dùng nó như một đối tác tư vấn kiến trúc.

1.  Gửi prompt thô sơ dưới đây cho AI:
    > `"Tôi muốn viết hàm lưu trữ giỏ hàng tạm thời của khách hàng trong Spring Boot, viết code cho tôi."`
2.  **Đọc kết quả phản hồi:** AI thường sẽ chọn ngẫu nhiên một giải pháp (ví dụ: dùng SQL Database hoặc JPA) và viết code ngay. Điều này rất nguy hiểm vì có thể giải pháp đó quá nặng hoặc không phù hợp với lượng truy cập lớn của hệ thống.
3.  Bây giờ, hãy gửi prompt nâng cấp tích hợp cả **Multiple Options**, **Trade-offs** và **What-if Scenario**:
    > `"Tôi đang xây dựng chức năng giỏ hàng tạm thời cho website thương mại điện tử bằng Java Spring Boot. Tần suất thêm/bớt sản phẩm của khách hàng là cực kỳ lớn.*
    > *Hãy thực hiện các bước sau:*
    > *1. (Multiple Options): Đề xuất ít nhất 3 phương án công nghệ để lưu trữ giỏ hàng (ví dụ: SQL Database, Redis Cache, Session/Cookie).*
    > *2. (Trade-offs): Lập bảng so sánh ưu/nhược điểm của 3 phương án dựa trên tiêu chí: Tốc độ đọc/ghi, Nguy cơ mất dữ liệu khi sập hệ thống, và Độ phức tạp cài đặt.*
    > *3. (What-if Scenario): Chuyện gì sẽ xảy ra nếu tôi chọn Redis và máy chủ Redis đột ngột bị sập (What-if Redis crashes)? Hãy đề xuất cơ chế tự động ghi nhận (fallback) hoặc cấu hình Redis Persistence (RDB/AOF) để bảo vệ giỏ hàng của khách hàng.*
    > *4. Cung cấp mã nguồn Java Spring Boot cấu hình kết nối Redis an toàn."`
4.  **Quan sát kết quả:** Bạn sẽ nhận được một bảng so sánh tuyệt đẹp. Phần phân tích What-if sẽ chỉ ra nguy cơ mất dữ liệu RAM và đề xuất cấu hình AOF (Append Only File) của Redis, đồng thời đề xuất viết một lớp Fallback Service để ghi tạm dữ liệu xuống SQL nếu Redis mất kết nối.

---

### BƯỚC 3: Thực hành Prompt Refinement (3 vòng cải tiến) (10 phút)

Chúng ta sẽ nâng cấp một đoạn code Java gửi email thô sơ của một lập trình viên tập sự thành code chuẩn doanh nghiệp.

1.  Sao chép đoạn code thô dưới đây:
```java
public class EmailService {
    public void send(String to, String body) {
        System.out.println("Sending email to " + to + " with body: " + body);
    }
}
```
2.  **Vòng 1 - Củng cố tính bền vững (Robustness):** Gửi code trên cho AI kèm prompt:
    > `"Hãy nâng cấp phương thức send trên: Bổ sung logic kiểm tra dữ liệu đầu vào (validate email format bằng Regex, kiểm tra chuỗi rỗng hoặc null). Nếu email không hợp lệ, hãy ném ra ngoại lệ InvalidEmailException tự định nghĩa."`
3.  **Vòng 2 - Áp dụng chuẩn bảo trì (Clean Code & Logging):** Tiếp tục chat trong cùng phiên với prompt:
    > `"Tuyệt vời. Bây giờ hãy refactor tiếp: Thay thế dòng System.out.println() bằng cơ chế ghi log chuyên nghiệp của Lombok @Slf4j. Đảm bảo phương thức chạy bất đồng bộ bằng cách thêm chú thích @Async của Spring."`
4.  **Vòng 3 - Tùy chỉnh kiểm thử (Unit Test):** Tiếp tục gửi prompt:
    > `"Bước cuối cùng: Hãy viết một class JUnit 5 test sử dụng Mockito để viết test case kiểm thử phương thức send trên trong cả hai trường hợp: email hợp lệ và email không hợp lệ (đảm bảo ngoại lệ được ném ra chuẩn xác)."`
5.  **Đánh giá:** Hãy nhìn lại cả quá trình. Chỉ sau 3 lượt chat ngắn có định hướng rõ ràng, bạn đã biến một hàm in chữ thô sơ thành một dịch vụ gửi email bất đồng bộ an toàn, có validate, ghi log đầy đủ và có sẵn bộ unit test chuyên nghiệp.

---

*Chúc mừng bạn đã hoàn thành bài tự thực hành Session 05! Bạn đã làm chủ được các kỹ thuật đặt Prompt nâng cao để tăng tốc và đảm bảo chất lượng phát triển phần mềm.*
