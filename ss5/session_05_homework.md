# BÀI TẬP VỀ NHÀ - SESSION 05
## Chủ đề: Kỹ thuật đặt Prompt nâng cao (Phần 1)

### Hướng dẫn làm bài:
*   Sinh viên đọc kỹ yêu cầu và thực hiện làm bài tập trực tiếp trên một file Markdown duy nhất.
*   Tuân thủ nghiêm ngặt **Hướng dẫn nộp bài** ở cuối tài liệu (chỉ nộp file văn bản `.md`, tuyệt đối không chụp ảnh màn hình).
*   Các bài tập chạy thử với AI bắt buộc phải sao chép đầy đủ nội dung cuộc trò chuyện dạng text block trực tiếp vào file làm bài. Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại.

---

## PHẦN I: NỘI DUNG BÀI TẬP

### BÀI 1: Phân tích & Lựa chọn (Kỹ thuật Prompt suy luận theo các bước - Chain-of-thought) (100 điểm)
*   **Bối cảnh:** Bạn được giao phát triển chức năng tính lương và thuế thu nhập cá nhân (TNCN) lũy tiến cho hệ thống quản lý nhân sự Core HR bằng Java. Việc tính toán rất phức tạp: tính thu nhập chịu thuế = tổng thu nhập - các khoản giảm trừ (bản thân 11 triệu, người phụ thuộc 4.4 triệu/người, bảo hiểm bắt buộc 10.5%). Sau đó áp dụng biểu thuế lũy tiến từng phần theo đúng quy định pháp luật.
*   **Đoạn prompt thô (Zero-shot):** `"Viết hàm Java tính thuế thu nhập cá nhân lũy tiến từ tổng thu nhập, số người phụ thuộc và bảo hiểm."`
*   **Đề bài:** Hãy lựa chọn prompt tối ưu nhất dưới đây để hướng dẫn AI thiết kế thuật toán này một cách chính xác nhất, tránh các lỗi làm tròn số hoặc tính sai ranh giới các bậc thuế. Giải thích lý do lựa chọn và chỉ ra nhược điểm của các phương án còn lại:
    *   **Phương án A:** `"Hãy viết hàm Java tính thuế thu nhập cá nhân lũy tiến theo biểu thuế Việt Nam hiện hành. Hãy tối ưu nhất."`
    *   **Phương án B:** `"Hãy đóng vai trò là một Java Developer chuyên nghiệp kiêm chuyên gia tài chính. Nhiệm vụ của bạn là viết một class Java tính thuế thu nhập cá nhân (TNCN) lũy tiến dựa trên thu nhập chịu thuế. Ràng buộc: Sử dụng Java 17, kiểu dữ liệu BigDecimal để tránh sai số làm tròn tiền tệ. Các bậc thuế lũy tiến giả định:
        - Bậc 1: Đến 5 triệu VND (5%)
        - Bậc 2: Trên 5 triệu đến 10 triệu VND (10%)
        - Bậc 3: Trên 10 triệu đến 18 triệu VND (15%)
        - Bậc 4: Trên 18 triệu đến 32 triệu VND (20%)
        - Bậc 5: Trên 32 triệu đến 52 triệu VND (25%)
        - Bậc 6: Trên 52 triệu đến 80 triệu VND (30%)
        - Bậc 7: Trên 80 triệu VND (35%)
        Định dạng & Quy trình thực hiện (CoT):
        Đừng viết code ngay. Hãy phân tích và suy luận từng bước sau ra màn hình trước:
        1. Phân tích cách xác định thu nhập tính thuế sau khi trừ các khoản giảm trừ gia cảnh (bản thân 11M, người phụ thuộc 4.4M/người) và bảo hiểm (10.5% tổng thu nhập).
        2. Liệt kê công thức tính thuế cho từng bậc riêng lẻ.
        3. Dry-run (chạy thử bằng tay) với ví dụ cụ thể: tổng thu nhập 30 triệu VND, 1 người phụ thuộc, không bảo hiểm. Tính ra số tiền cụ thể bằng văn bản.
        4. Cuối cùng, sinh ra mã nguồn Java hoàn chỉnh tuân thủ các phân tích trên."`
    *   **Phương án C:** `"Hãy đóng vai trò Senior Developer. Hãy viết một class Java tính thuế TNCN lũy tiến sử dụng Java Stream API song song để tính toán cực nhanh các bậc thuế lũy tiến nhằm tối ưu hiệu năng."`
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (A, B hoặc C).
    *   Phân tích chi tiết tại sao phương án đó tối ưu nhất dựa trên các nguyên tắc Chain-of-thought (CoT) và cấu trúc 5 thành phần của Prompt.
    *   Phân tích lý do loại trừ các phương án còn lại (chỉ rõ nhược điểm hoặc nguy cơ lỗi logic khi AI thực thi).
    *   Mã nguồn Java hoàn chỉnh tính thuế TNCN do AI sinh ra dựa trên prompt tối ưu đã chọn (nằm trong khối code markdown).

---

### BÀI 2: Tối ưu Prompt (Kỹ thuật Multiple Options, Trade-offs và Phân tích Giả định) (100 điểm)
*   **Bối cảnh:** Bạn đang xây dựng hệ thống gửi thông báo (Notification Service) qua email và SMS cho 1 triệu người dùng khi có sự kiện khuyến mãi. Nếu gửi đồng bộ (Synchronous) khi người dùng thao tác, API sẽ bị nghẽn (Timeout). Bạn cần thiết kế giải pháp bất đồng bộ (Asynchronous processing) nhưng đang phân vân về kiến trúc.
*   **Prompt thô hiện tại:** `"Tôi muốn viết hàm gửi email bất đồng bộ trong Spring Boot, viết code cho tôi."`
*   **Đề bài:** Prompt thô trên quá đơn giản và ép AI viết code ngay bằng một công nghệ bất kỳ (thường là `@Async` của Spring Boot), bỏ qua việc đánh giá kiến trúc hệ thống và khả năng chịu tải thực tế. Hãy tối ưu prompt này bằng cách áp dụng tích hợp cả 3 kỹ thuật: **Multiple Options** (yêu cầu đề xuất ít nhất 3 phương án), **Trade-offs** (lập bảng so sánh ưu/nhược điểm), và **Phân tích giả định (What-if Scenario)** để AI đánh giá rủi ro khi tải cao.
*   **Yêu cầu đầu ra:**
    *   Nội dung Prompt sau khi tối ưu.
    *   Đoạn mã nguồn Java hoặc bảng so sánh giải pháp kiến trúc do AI sinh ra (nằm trong khối code markdown).

---

### BÀI 3: Đọc hiểu & Dò lỗi qua Prompt (Quy trình Cải tiến đầu ra - Robustness & Maintainability) (100 điểm)
*   **Bối cảnh:** Bạn nhận bàn giao một hàm xử lý chuyển tiền giữa hai tài khoản ngân hàng từ một lập trình viên tập sự. Đoạn code "chạy được" nhưng cực kỳ nguy hiểm nếu đưa lên môi trường Production.
*   **Mã nguồn chưa tối ưu (Java):**
```java
public class AccountService {
    private AccountRepository accountRepository;

    public void transfer(Long fromAccountId, Long toAccountId, double amount) {
        Account from = accountRepository.findById(fromAccountId).orElse(null);
        Account to = accountRepository.findById(toAccountId).orElse(null);
        
        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
        
        accountRepository.save(from);
        accountRepository.save(to);
    }
}
```
*   **Đề bài:**
    1.  Phân tích các lỗ hổng nghiêm trọng của đoạn code trên ở cấp độ dự án lớn (vấn đề Transaction, Validation dữ liệu đầu vào, bắt Exception, và Logging).
    2.  Thiết kế một chuỗi **Prompt Cải tiến đầu ra** gồm 3 vòng liên tiếp để gọt giũa đoạn code này thông qua AI:
        *   **Vòng 1 (Robustness):** Yêu cầu bổ sung kiểm tra null, số tiền âm, số dư không đủ và ném Custom Exception tương ứng.
        *   **Vòng 2 (Maintainability/Clean Code):** Yêu cầu đưa vào quản lý giao dịch `@Transactional` (Spring Boot) để đảm bảo tính ACID (đặc biệt là tính nguyên tử - Atomicity) và tích hợp thư viện `Lombok` + `@Slf4j` để log thông tin chuyển tiền chuyên nghiệp.
        *   **Vòng 3 (Context-specific Tuning):** Yêu cầu trả về đối tượng `TransactionResult` chuẩn và viết JUnit Test cho trường hợp chuyển tiền thất bại do không đủ số dư.
*   **Yêu cầu đầu ra:**
    *   Đoạn phân tích các lỗ hổng của mã nguồn ban đầu.
    *   Nội dung 3 lượt Prompt tương ứng với 3 vòng cải tiến.
    *   Mã nguồn Java và test case JUnit đã tối ưu do AI sinh ra (nằm trong khối code markdown).

---

### BÀI 4: Phân tích & Lựa chọn (Prompt học kiến thức kỹ thuật nâng cao) (100 điểm)
*   **Bối cảnh:** Bạn được giao lập trình một chức năng ghi log tự động cho tất cả các Service trong dự án Spring Boot mà không muốn viết thủ công dòng log ở từng Class. Đồng nghiệp khuyên bạn nên sử dụng **Spring AOP (Aspect-Oriented Programming)**. Đây là một khái niệm rất trừu tượng với nhiều thuật ngữ hàn lâm (Aspect, JoinPoint, Pointcut, Advice).
*   **Đề bài:** Hãy lựa chọn prompt tốt nhất giúp bạn học hiểu bản chất khái niệm Spring AOP và biết cách ứng dụng nó vào dự án thực tế. Giải thích lý do lựa chọn và chỉ ra nhược điểm của các phương án còn lại:
    *   **Phương án A:** `"Giải thích Spring AOP là gì và viết cho tôi một ví dụ ghi log bằng Spring AOP."`
    *   **Phương án B:** `"Hãy đóng vai trò là một System Architect giàu kinh nghiệm sư phạm. Nhiệm vụ của bạn là giúp tôi học hiểu khái niệm Spring AOP (Aspect-Oriented Programming). Hãy giảng giải cho tôi qua 3 phần sau:
        1. (Giải thích đa cấp độ): Giải thích khái niệm AOP theo 2 cấp độ: Cấp độ 1 cho người mới bắt đầu (sử dụng phép ẩn dụ trong cuộc sống thực tế như bộ lọc camera hoặc trạm kiểm soát giao thông). Cấp độ 2 cho Senior Developer với các thuật ngữ chuyên sâu (Aspect, Pointcut, Advice).
        2. (So sánh khái niệm): Lập bảng so sánh giữa AOP (Lập trình hướng khía cạnh) và OOP (Lập trình hướng đối tượng) về mục đích sử dụng và khả năng giải quyết các vấn đề cắt ngang (Cross-cutting Concerns).
        3. (Ví dụ thực tiễn): Cung cấp một đoạn mã Java Spring Boot cực kỳ ngắn gọn sử dụng `@Aspect` và `@Before` / `@After` để tự động ghi log thời gian thực thi của các phương thức trong Service. Có chú thích chi tiết bằng tiếng Việt."`
    *   **Phương án C:** `"Hãy viết một class Aspect trong Spring Boot để ghi log khi chạy ứng dụng. Giải thích cách cấu hình trong file pom.xml."`
*   **Yêu cầu đầu ra:**
    *   Đáp án lựa chọn (A, B hoặc C).
    *   Phân tích chi tiết tại sao phương án đó tối ưu nhất dựa trên các nguyên tắc học kỹ thuật nâng cao (Level-based Explanation, Comparative Analysis, Practical Examples).
    *   Phân tích lý do loại trừ các phương án còn lại.
    *   Mã nguồn Java ví dụ Aspect ghi log do AI sinh ra dựa trên prompt tối ưu đã chọn (nằm trong khối code markdown).

---

### BÀI 5: Sáng tạo (Thiết kế Quy trình & Prompt cho Bộ Giới hạn Tần suất - Rate Limiter) (100 điểm)
*   **Bối cảnh:** Bạn đang xây dựng một cổng API GateWay cho ứng dụng tài chính "SafePay". Nhằm chống lại các cuộc tấn công từ chối dịch vụ (DDoS) và lạm dụng API, bạn cần thiết kế tính năng giới hạn tần suất truy cập (Rate Limiting).
*   **Quy tắc nghiệp vụ:** Mỗi API Key chỉ được phép gửi tối đa 100 yêu cầu (requests) trong vòng 1 phút. Nếu vượt quá giới hạn, hệ thống trả về mã lỗi HTTP 429 (Too Many Requests).
*   **Đề bài mở:** Hãy đóng vai trò kỹ sư hệ thống, thiết kế quy trình 3 bước tương tác với AI để giải quyết bài toán:
    *   **Bước 1: Tư vấn và lựa chọn thuật toán (Multiple Options & Trade-offs):** Thiết kế prompt yêu cầu AI đưa ra ít nhất 2 thuật toán phổ biến (như Token Bucket và Fixed Window) và so sánh ưu/nhược điểm của chúng trong Java.
    *   **Bước 2: Phân tích kịch bản giả định (What-if Distributed Scenario):** Thiết kế prompt thứ hai giả định: *"Nếu hệ thống chạy trên cụm 3 máy chủ (Distributed System), việc lưu trữ biến đếm trong bộ nhớ cục bộ (Local memory) sẽ bị sai lệch. Hãy đề xuất giải pháp sử dụng Redis làm kho lưu trữ tập trung."*
    *   **Bước 3: Thiết kế Prompt sinh mã nguồn CoT (Code Generation with CoT):** Thiết kế prompt thứ ba yêu cầu AI đóng vai là Senior Developer, áp dụng cấu trúc CoT (suy nghĩ từng bước) để viết mã nguồn Java Spring Boot sử dụng Spring Data Redis để triển khai Rate Limiter phân tán. Yêu cầu xử lý bẫy ngoại lệ (Nếu Redis đột ngột sập, hệ thống có cơ chế Fallback gì để bảo vệ ứng dụng?) và ghi log bằng `@Slf4j`.
*   **Yêu cầu đầu ra:**
    *   Mô tả ngắn gọn ý đồ thiết kế quy trình 3 bước của bạn.
    *   Nội dung của 3 Prompt tương ứng với các bước trên.
    *   **Minh chứng thực tế:** Bắt buộc chạy thực tế với AI và sao chép toàn bộ log chat (text log/markdown block) của cả 3 lượt chat trực tiếp vào file làm bài (tuyệt đối không nộp link chia sẻ hoặc ảnh chụp màn hình). Log chat phải thể hiện rõ:
        1.  Phần so sánh các thuật toán ở Bước 1.
        2.  Giải pháp thiết kế phân tán với Redis ở Bước 2.
        3.  Mã nguồn Java tối ưu tích hợp Redis và logic xử lý ngoại lệ hoàn chỉnh ở Bước 3.

---

## PHẦN II: TIÊU CHÍ CHẤM ĐIỂM CHI TIẾT (DÀNH CHO AI CHẤM BÀI)

### 1. Tiêu chí chấm Bài 1 (Phân tích & Lựa chọn - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (20 điểm):** Chọn chính xác **Phương án B**.
*   **Phân tích lý do chọn (30 điểm):**
    *   Chỉ ra được việc áp dụng Chain-of-thought (CoT) buộc AI phân tích tuần tự trước khi sinh code, giúp tránh các lỗi logic nghiệp vụ ngầm (15 điểm).
    *   Chỉ ra sự hiện diện đầy đủ 5 thành phần trong Prompt B: Vai trò (Java Developer & Financial Expert), Mục tiêu (Viết class tính thuế), Ngữ cảnh (Core HR, Java 17), Ràng buộc (BigDecimal, các bậc thuế chi tiết), Định dạng (CoT: phân tích, liệt kê công thức, dry-run, code) (15 điểm).
*   **Phân tích lý do loại trừ (20 điểm):**
    *   Chỉ rõ lỗi ở Phương án A: Quá mơ hồ, không chỉ rõ biểu thuế hiện hành nào (dễ bị lỗi thời), không quy định kiểu dữ liệu BigDecimal dẫn đến sai số (10 điểm).
    *   Chỉ rõ lỗi ở Phương án C: Tập trung sai trọng tâm (tính toán song song cho một phép tính thuế đơn lẻ là không cần thiết, làm phức tạp hóa code vô ích) và không giải quyết được yêu cầu đảm bảo tính chính xác của các bậc thuế (10 điểm).
*   **Kết quả mã nguồn Java từ AI (30 điểm):** Mã nguồn Java do AI sinh ra phải chính xác, sử dụng đúng kiểu `BigDecimal` cho tính toán tiền tệ (15 điểm), cấu trúc code sạch sẽ, rõ ràng và thể hiện đúng biểu thuế lũy tiến giả định của đề bài (15 điểm).

### 2. Tiêu chí chấm Bài 2 (Tối ưu Prompt - Max: 100 điểm)
*   **Cấu trúc Prompt tối ưu (30 điểm):** Prompt sinh viên viết phải có đủ yêu cầu đề xuất Multiple Options (10 điểm), so sánh Trade-offs (10 điểm), và đưa ra kịch bản What-if khi tải cao (10 điểm).
*   **Xử lý ngoại lệ/Bẫy dữ liệu (30 điểm):** Prompt yêu cầu AI chỉ ra phương án xử lý rủi ro khi hệ thống bị quá tải hoặc sập luồng gửi tin (15 điểm), cấu hình Thread Pool an toàn (15 điểm).
*   **Kết quả đầu ra từ AI (40 điểm):** Kết quả AI sinh ra phải cung cấp bảng so sánh rõ ràng giữa các giải pháp (ví dụ: Spring @Async, RabbitMQ, Kafka) và chỉ ra được phương án tối ưu nhất kèm giải pháp xử lý khi tải cao (ví dụ: dùng hàng đợi tin nhắn).

### 3. Tiêu chí chấm Bài 3 (Dò lỗi qua Prompt - Max: 100 điểm)
*   **Phân tích điểm chưa tối ưu (30 điểm):** Chỉ ra được các lỗi: (1) Thiếu `@Transactional` dẫn đến lỗi mất tính nguyên tử khi lưu một tài khoản lỗi và một tài khoản thành công; (2) Thiếu validation đầu vào (số tiền âm, ID null); (3) Thiếu cơ chế bắt lỗi an toàn (nếu lỗi xảy ra sẽ làm sập luồng); (4) Không ghi Log để truy vết giao dịch.
*   **Chuỗi Prompt 3 vòng cải tiến (30 điểm):**
    *   Vòng 1 tập trung vào Robustness (Validation, Exceptions) (10 điểm).
    *   Vòng 2 tập trung vào Clean Code & Transaction + Logging (SLF4J) (10 điểm).
    *   Vòng 3 tập trung vào Output Tuning (TransactionResult) và JUnit Test (10 điểm).
*   **Kết quả đầu ra từ AI (40 điểm):** Mã nguồn Java cuối cùng phải sạch, có `@Transactional`, kiểm tra điều kiện biên, ném Custom Exception rõ ràng, ghi log bằng `@Slf4j` và có đi kèm JUnit test case kiểm thử logic biên.

### 4. Tiêu chí chấm Bài 4 (Phân tích & Lựa chọn - Max: 100 điểm)
*   **Lựa chọn đáp án đúng (20 điểm):** Chọn chính xác **Phương án B**.
*   **Phân tích lý do chọn (30 điểm):**
    *   Chỉ ra được Phương án B áp dụng hoàn hảo 3 kỹ thuật học nâng cao: Giải thích đa cấp độ (giúp nắm vững bản chất trước khi đi sâu vào kỹ thuật), So sánh khái niệm (AOP vs OOP để hiểu giới hạn công cụ), và Ví dụ thực tiễn (chuyển lý thuyết thành code chạy được) (15 điểm).
    *   Chỉ ra được cấu trúc này giúp ghi nhớ kiến thức tốt hơn gấp nhiều lần so với chỉ đọc lý thuyết (15 điểm).
*   **Phân tích lý do loại trừ (20 điểm):**
    *   Chỉ rõ lỗi ở Phương án A: AI sẽ trả về định nghĩa khô khan và code chung chung, không giúp phân cấp hiểu biết (10 điểm).
    *   Chỉ rõ lỗi ở Phương án C: Đi thẳng vào code mà không giải thích bản chất kiến trúc, khiến sinh viên chép code chạy được nhưng không hiểu luồng chạy ngầm của AOP (10 điểm).
*   **Kết quả mã nguồn Java từ AI (30 điểm):** Đoạn mã Java Aspect do AI sinh ra phải hoạt động chính xác, sử dụng đúng các annotation `@Aspect`, `@Around` hoặc `@Before`/`@After` (15 điểm), cấu hình định vị Pointcut chuẩn để intercept các Service và có logic đo đạc/ghi log thời gian chạy rõ ràng (15 điểm).

### 5. Tiêu chí chấm Bài 5 (Sáng tạo - Max: 100 điểm)
*   **Thiết kế quy trình và ý đồ (30 điểm):** Mô tả rõ ràng mục tiêu 3 bước đi từ hiểu bản chất thuật toán -> giải quyết bài toán phân tán -> sinh mã nguồn tối ưu có phòng thủ.
*   **Chất lượng Prompt/Workflow (40 điểm):**
    *   Prompt Bước 1 so sánh được ưu nhược điểm các thuật toán Rate Limiter (20 điểm).
    *   Prompt Bước 2 & 3 đặt được vai trò chuyên gia, chỉ rõ kịch bản What-if Redis sập và yêu cầu thiết kế cơ chế fallback (ví dụ: cho phép đi qua tạm thời nhưng ghi log cảnh báo) (20 điểm).
*   **Kiểm chứng thực tế (30 điểm):** Sao chép đầy đủ log chat 3 lượt. Kết quả cho thấy mã nguồn Java cuối cùng đã được tối ưu, tích hợp Redis Template/Jedis, xử lý ngoại lệ sập kết nối Redis an toàn, và sử dụng `@Slf4j` ghi log.

---

## PHẦN III: QUY ĐỊNH NỘP BÀI

1.  **Định dạng nộp bài:** Sinh viên nộp **01 file Markdown duy nhất (.md)**.
2.  **Cú pháp đặt tên file:** `SS05_[Họ_và_Tên]_[Mã_Sinh_Viên].md`
    *Ví dụ:* `SS05_NguyenVanA_HE150123.md`
3.  **Yêu cầu bắt buộc về minh chứng:**
    *   Tất cả các phần chạy thử nghiệm với AI (Bài 1, Bài 2, Bài 3, Bài 4, Bài 5) bắt buộc phải sao chép đầy đủ nội dung prompt và phản hồi của AI vào khối mã Markdown (code block). Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại (Share Link).
    *   **Tuyệt đối không sử dụng hình ảnh chụp màn hình (screenshot).** Bài nộp chứa hình ảnh hoặc link chia sẻ thay thế văn bản hội thoại sẽ bị AI chấm bài từ chối ghi nhận điểm phần thực nghiệm để bảo vệ tính trung thực học thuật.
