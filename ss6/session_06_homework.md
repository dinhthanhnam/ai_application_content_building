# BÀI TẬP VỀ NHÀ - SESSION 06
## Chủ đề: Thực hành kỹ thuật đặt Prompt nâng cao (Phần 1)

### Hướng dẫn làm bài:
*   Sinh viên đọc kỹ yêu cầu và thực hiện làm bài tập trực tiếp trên một file Markdown duy nhất.
*   Tuân thủ nghiêm ngặt **Hướng dẫn nộp bài** ở cuối tài liệu (chỉ nộp file văn bản `.md`, tuyệt đối không chụp ảnh màn hình).
*   **Đây là bài tập thực hành tổng hợp:** Đối với tất cả các bài tập (từ Bài 1 đến Bài 5), sinh viên bắt buộc phải tự thiết kế prompt, tương tác với AI và sao chép toàn bộ nội dung văn bản cuộc trò chuyện (text log) cùng mã nguồn Java do AI sinh ra trực tiếp vào tệp làm bài. Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại.

---

## PHẦN I: NỘI DUNG BÀI TẬP

### BỐI CẢNH DỰ ÁN XUYÊN SUỐT: HỆ THỐNG THƯƠNG MẠI ĐIỆN TỬ "SPEEDYCART"
Để giải quyết các bài tập trong Session này, sinh viên sẽ đóng vai trò là một **Kỹ sư Hệ thống / Java Core Developer** tham gia phát triển dự án "SpeedyCart" - một hệ thống mua sắm trực tuyến có lượng truy cập lớn. Các bài tập từ 1 đến 5 sẽ lần lượt đi qua các giai đoạn thiết kế và lập trình cho hệ thống này.

---

### BÀI 1: Thực hành Tối ưu hóa Lưu trữ Giỏ hàng (What-if Scenario & Multiple Options) (100 điểm)
*   **Bối cảnh:** Giỏ hàng tạm thời (Shopping Cart) của khách hàng trên SpeedyCart có tần suất đọc/ghi cực kỳ lớn khi người dùng thêm, bớt hoặc thay đổi số lượng sản phẩm. Việc ghi trực tiếp vào cơ sở dữ liệu quan hệ (SQL Database) truyền thống đang làm nghẽn hệ thống và tăng độ trễ trang web. Bạn cần tìm kiếm và thiết kế một giải pháp lưu trữ tối ưu hơn.
*   **Nhiệm vụ:** Hãy đóng vai trò là Kiến trúc sư hệ thống (System Architect), thiết kế một prompt tối ưu gửi cho AI để giải quyết các vấn đề sau:
    1.  **(Multiple Options):** Yêu cầu AI đề xuất ít nhất 3 phương án công nghệ lưu trữ dữ liệu giỏ hàng tạm thời (ví dụ: SQL Database, In-memory Redis Cache, Client-side Session/Cookie).
    2.  **(Trade-offs):** Yêu cầu AI lập một bảng so sánh chi tiết giữa các phương án dựa trên các tiêu chí: Tốc độ đọc/ghi, Tính đồng nhất dữ liệu, Khả năng chịu lỗi/mất mát dữ liệu, và Độ phức tạp triển khai.
    3.  **(What-if Scenario):** Đưa ra kịch bản giả định: *"Chuyện gì xảy ra nếu cụm máy chủ Redis đột ngột bị crash hoặc mất nguồn điện? Làm thế nào để đảm bảo giỏ hàng của khách hàng không bị biến mất hoàn toàn (cấu hình cơ chế Persistence RDB/AOF của Redis kết hợp cơ chế fallback ghi tạm xuống SQL)?"*
    4.  **(Implementation):** Yêu cầu AI cung cấp đoạn mã cấu hình kết nối Redis (`RedisTemplate`) bằng Java Spring Boot an toàn.
*   **Yêu cầu đầu ra:**
    *   Phần phân tích ngắn gọn của bạn về bối cảnh và lý do cần thiết kế prompt đa chiều cho bài toán này.
    *   Nội dung Prompt tối ưu do bạn thiết kế (chứa đầy đủ 5 thành phần của Prompt).
    *   **Minh chứng chạy thực tế:** Sao chép toàn bộ text log phản hồi của AI (bao gồm bảng so sánh, phần phân tích kịch bản What-if và mã nguồn cấu hình Java `RedisTemplate` do AI sinh ra).

---

### BÀI 2: Thực hành Xây dựng Thuật toán Khuyến mãi Phức tạp (Chain-of-thought - CoT) (100 điểm)
*   **Bối cảnh:** Khi khách hàng tiến hành thanh toán đơn hàng trên SpeedyCart, hệ thống phải áp dụng các quy tắc khuyến mãi và tính tổng số tiền cuối cùng. Các quy tắc tính tiền bao gồm:
    1.  Tính tổng tiền gốc của các mặt hàng trong giỏ hàng.
    2.  Áp dụng Giảm giá sản phẩm (Product Discount - nếu sản phẩm đó đang được giảm giá trực tiếp).
    3.  Áp dụng Mã giảm giá (Coupon Code - giảm 10% tổng đơn nhưng tối đa 100,000 VND, chỉ áp dụng cho đơn hàng có giá trị gốc sau khi giảm giá sản phẩm đạt tối thiểu 500,000 VND).
    4.  Áp dụng Chiết khấu thành viên (Loyalty Discount - hạng Gold giảm 5%, hạng Platinum giảm 10% tính trên tổng tiền đã trừ coupon).
    5.  Cộng Thuế VAT (10% tính trên tổng tiền sau khi đã trừ tất cả các chiết khấu trên).
    6.  Cộng Phí vận chuyển (Shipping Fee - tính mặc định là 30,000 VND cho khoảng cách dưới 10km, mỗi km tiếp theo cộng 5,000 VND. Miễn phí vận chuyển nếu tổng tiền đơn hàng sau chiết khấu và trước thuế lớn hơn 1,000,000 VND).
    *   *Lưu ý:* Thứ tự ưu tiên thực hiện các bước tính toán trên ảnh hưởng trực tiếp đến kết quả số tiền cuối cùng. Nếu làm sai thứ tự, hệ thống sẽ gây thất thoát tài chính hoặc tính sai thuế.
*   **Nhiệm vụ:** Thiết kế một prompt áp dụng kỹ thuật **Chain-of-thought (CoT - Suy luận theo các bước)** để hướng dẫn AI:
    1.  Phân tích và xác định thứ tự thực hiện đúng của các quy tắc tính toán trên để đảm bảo tính hợp pháp và logic nghiệp vụ.
    2.  Liệt kê công thức tính chi tiết cho từng bước.
    3.  Thực hiện chạy thử bằng tay (Dry-run) bằng văn bản với ca kiểm thử cụ thể: Giỏ hàng có 2 sản phẩm A (giá gốc 400,000 VND/sản phẩm, đang được giảm giá 10% trực tiếp) và 1 sản phẩm B (giá gốc 300,000 VND, không giảm). Khách hàng có mã coupon giảm 50,000 VND (đơn hàng tối thiểu 500,000 VND). Khách hàng hạng Gold (giảm 5%). Địa chỉ nhận hàng cách kho 12km.
    4.  Dựa trên phân tích, sinh class Java `OrderCalculator` chứa phương thức `calculateTotal(Order order)` sử dụng kiểu dữ liệu `BigDecimal` để đảm bảo độ chính xác tuyệt đối của tiền tệ.
*   **Yêu cầu đầu ra:**
    *   Phần giải thích của bạn về tầm quan trọng của thứ tự ưu tiên tính toán trong các nghiệp vụ kế toán/tài chính.
    *   Nội dung Prompt CoT do bạn thiết kế.
    *   **Minh chứng chạy thực tế:** Sao chép toàn bộ text log phản hồi của AI (gồm các bước phân tích logic, các phép tính dry-run chi tiết, và class Java `OrderCalculator` hoàn chỉnh).

---

### BÀI 3: Thực hành Refactor & Nâng cấp Giao dịch (Refinement Process - Robustness & Logging) (100 điểm)
*   **Bối cảnh:** Sau khi tính tiền, hệ thống thực hiện lưu đơn hàng, trừ số lượng sản phẩm trong kho (Inventory) và tiến hành gọi cổng thanh toán (Payment Gateway). Đoạn code Java hiện tại do một lập trình viên tập sự viết đang chứa các lỗi nghiêm trọng về an toàn dữ liệu và bảo trì:
    ```java
    public class OrderPlacementService {
        private InventoryRepository inventoryRepository;
        private PaymentGateway paymentGateway;
        private OrderRepository orderRepository;

        public void placeOrder(Order order) {
            // Trừ kho
            for (OrderItem item : order.getItems()) {
                Product product = inventoryRepository.findById(item.getProductId()).orElse(null);
                product.setStock(product.getStock() - item.getQuantity());
                inventoryRepository.save(product);
            }
            // Thanh toán qua Gateway
            paymentGateway.charge(order.getCustomerId(), order.getTotalAmount());
            // Lưu đơn hàng
            orderRepository.save(order);
        }
    }
    ```
*   **Nhiệm vụ:** Thiết kế chuỗi **Prompt Cải tiến đầu ra nâng cao (Refinement Chain) gồm 3 vòng** để yêu cầu AI refactor đoạn code trên thành mã nguồn chuẩn doanh nghiệp (Production-ready):
    *   **Vòng 1 (Robustness):** Yêu cầu kiểm tra các lỗi dữ liệu đầu vào (null, empty), kiểm tra số lượng tồn kho (nếu sản phẩm hết hàng hoặc số lượng mua vượt quá số lượng tồn kho thì ném ngoại lệ `OutOfStockException`), và bắt các lỗi phát sinh từ cổng thanh toán (nếu thanh toán thất bại thì ném ngoại lệ `PaymentFailedException`).
    *   **Vòng 2 (Maintainability & Clean Code):** Yêu cầu đưa vào quản lý giao dịch `@Transactional` (Spring Boot) để đảm bảo tính ACID (đặc biệt là tính nguyên tử - Atomicity - nếu thanh toán lỗi thì số lượng tồn kho phải được rollback hoàn trả lại). Tích hợp thư viện `Lombok` và `@Slf4j` để ghi log các bước xử lý đơn hàng chi tiết ở cấp độ INFO và ERROR.
    *   **Vòng 3 (Context-specific Tuning):** Yêu cầu trả về đối tượng `OrderPlacementResult` chuẩn và viết một class JUnit Test sử dụng thư viện `Mockito` để mock các repository/gateway, viết test case kiểm thử kịch bản thanh toán thất bại (đảm bảo exception được ném ra và kho được rollback).
*   **Yêu cầu đầu ra:**
    *   Phân tích các lỗ hổng nghiêm trọng của đoạn code thô ban đầu.
    *   Chi tiết nội dung 3 lượt Prompt tương ứng với 3 vòng cải tiến.
    *   **Minh chứng chạy thực tế:** Sao chép toàn bộ text log phản hồi ở lượt chat cuối cùng chứa mã nguồn Java `OrderPlacementService` và class JUnit Test đã tối ưu hoàn chỉnh.

---

### BÀI 4: Thực hành Tích hợp API Vận chuyển Bất đồng bộ (Technical Learning Prompts) (100 điểm)
*   **Bối cảnh:** Đơn hàng sau khi đặt thành công cần được đồng bộ sang hệ thống vận chuyển của đối tác bên thứ ba (như Giao Hàng Nhanh hoặc Viettel Post) qua API. Để không làm chậm luồng xử lý chính của người dùng, Tech Lead yêu cầu gọi API này một cách bất đồng bộ (Asynchronous/Non-blocking). Bạn chưa từng sử dụng thư viện **WebClient (Spring WebFlux)** để gọi API bất đồng bộ.
*   **Nhiệm vụ:** Hãy vận dụng bộ 4 kỹ năng viết Prompt học kiến thức kỹ thuật để thiết kế một đoạn Prompt tối ưu nhờ AI hướng dẫn và sinh mã nguồn:
    1.  **(Level-based Explanation):** Yêu cầu AI giải thích cơ chế hoạt động bất đồng bộ và Non-blocking của `WebClient` ở 2 cấp độ: Cấp độ 1 cho người mới bắt đầu (sử dụng phép ẩn dụ trong cuộc sống thực tế như đặt món ăn tại nhà hàng); Cấp độ 2 cho Senior Developer với các thuật ngữ chuyên sâu (Event Loop, Reactive Streams, Mono/Flux).
    2.  **(Comparative Analysis):** Yêu cầu lập bảng so sánh chi tiết giữa `RestTemplate` (Blocking) và `WebClient` (Non-blocking) về: Mức tiêu thụ tài nguyên hệ thống (Thread, RAM) và Số lượng kết nối tối đa khi hệ thống xử lý 10,000 yêu cầu đồng thời.
    3.  **(Practical Examples):** Viết class Java Spring Boot `DeliveryIntegrationService` sử dụng `WebClient` để gửi thông tin đơn hàng (POST request). Ràng buộc kỹ thuật: Cấu hình Connection Timeout là 5 giây, có cơ chế tự động **Retry 3 lần** nếu gặp lỗi sập mạng hoặc Timeout trước khi ném ra ngoại lệ và ghi log bằng `@Slf4j`.
*   **Yêu cầu đầu ra:**
    *   Nội dung Prompt học tập kiến thức kỹ thuật nâng cao do bạn thiết kế.
    *   **Minh chứng chạy thực tế:** Sao chép toàn bộ text log phản hồi của AI (gồm các phần giải thích đa cấp độ, bảng so sánh và class Java `DeliveryIntegrationService` hoàn chỉnh).

---

### BÀI 5: Thực hành Thiết kế Hệ thống Hướng Sự kiện và Xử lý Đơn hàng (Creative/Advanced) (100 điểm)
*   **Bối cảnh:** Cuối cùng, khi đơn hàng hoàn tất, SpeedyCart cần thực hiện các hành động phụ: gửi email xác nhận cho khách hàng, cộng điểm tích lũy thành viên, và thông báo cho bộ phận nhà kho đóng gói hàng. Để API phản hồi nhanh nhất và đảm bảo các dịch vụ hoạt động độc lập, hệ thống được thiết kế theo kiến trúc hướng sự kiện (Event-Driven Architecture) sử dụng Message Broker.
*   **Đề bài mở:** Hãy đóng vai trò kỹ sư thiết kế hệ thống (System Designer), thực hiện quy trình 3 bước tương tác liên tiếp với AI để giải quyết bài toán:
    *   **Bước 1: Tư vấn và lựa chọn Broker (Options & Trade-offs):** Thiết kế prompt yêu cầu AI đề xuất và so sánh 2 giải pháp: Dùng `Apache Kafka` và `RabbitMQ` để phân phối sự kiện đơn hàng (`OrderCompletedEvent`) cho các dịch vụ tiêu thụ (consumers). Lập bảng so sánh về hiệu năng, khả năng mở rộng (Scalability) và độ tin cậy.
    *   **Bước 2: Phân tích kịch bản sập hệ thống (What-if Scenario):** Thiết kế prompt thứ hai giả định sự cố: *"Nếu dịch vụ gửi Email bị sập nguồn trong 3 tiếng, tin nhắn trên Broker có bị mất không? Khi Email Service hoạt động trở lại, làm thế nào để đảm bảo nó chỉ tiêu thụ và gửi đúng 1 email cho mỗi đơn hàng (chống gửi trùng email - Idempotency), tránh làm phiền khách hàng? Hãy đề xuất giải pháp sử dụng Redis làm Idempotency Key Store."*
    *   **Bước 3: Thiết kế Prompt sinh mã nguồn CoT (Code Generation with CoT):** Thiết kế prompt thứ ba yêu cầu AI đóng vai là Senior Developer, áp dụng cấu trúc CoT (suy nghĩ từng bước) để viết mã nguồn Java Spring Boot cho một Kafka Consumer (`OrderEventListener`). Ràng buộc: Sử dụng `@KafkaListener`, tích hợp với Redis Template để kiểm tra xem event ID đã được xử lý chưa trước khi gọi Email Service gửi thư. Nếu gặp lỗi kết nối với Mail Server, hãy cấu hình cơ chế tự động gửi lại (Retry) và chuyển sang Dead Letter Queue (DLQ) sau 3 lần thất bại. Code phải có logging bằng `@Slf4j`.
*   **Yêu cầu đầu ra:**
    *   Mô tả ngắn gọn ý đồ thiết kế quy trình 3 bước của bạn.
    *   Nội dung của 3 Prompt tương ứng với các bước trên.
    *   **Minh chứng thực tế:** Bắt buộc chạy thực tế với AI và sao chép toàn bộ log chat (text log/markdown block) của cả 3 lượt chat trực tiếp vào file làm bài (tuyệt đối không nộp link chia sẻ hoặc ảnh chụp màn hình). Log chat phải thể hiện rõ:
        1.  Phần so sánh các Broker ở Bước 1.
        2.  Giải pháp thiết kế chống trùng lặp với Redis ở Bước 2.
        3.  Mã nguồn Java Kafka Consumer tối ưu tích hợp Redis và logic xử lý ngoại lệ hoàn chỉnh ở Bước 3.

---

## PHẦN II: TIÊU CHÍ CHẤM ĐIỂM CHI TIẾT (DÀNH CHO AI CHẤM BÀI)

### 1. Tiêu chí chấm từ Bài 1 đến Bài 4 (Thực hành tổng hợp - Max: 100 điểm/bài)
*   **Thiết kế Prompt tối ưu (30 điểm):** Prompt sinh viên viết phải chuyên nghiệp, có đầy đủ các thành phần cốt lõi (Role, Goal, Context, Constraint, Format) và áp dụng đúng kỹ thuật nâng cao được yêu cầu của bài đó.
*   **Phân tích kỹ thuật & Đánh giá (30 điểm):** Phần trình bày lập luận bằng văn bản của sinh viên về kiến trúc, sự đánh đổi hoặc thuật toán phải rõ ràng, logic và chính xác.
*   **Chất lượng mã nguồn Java sinh ra (40 điểm):** Mã nguồn Java do AI phản hồi (được sinh viên dán vào file bài làm) phải hoạt động chính xác, sạch sẽ, không lỗi cú pháp, có validate đầu vào, bắt ngoại lệ đầy đủ và tuân thủ đúng các ràng buộc nghiệp vụ/kỹ thuật của đề bài.

### 2. Tiêu chí chấm Bài 5 (Sáng tạo nâng cao - Max: 100 điểm)
*   **Phân tích & Thiết kế giải pháp (30 điểm):** Trình bày rõ ràng bài toán tự định nghĩa, sơ đồ luồng dữ liệu xử lý (khuyến khích sơ đồ ASCII) và cách giải quyết bài toán chống trùng lặp (Idempotency).
*   **Chất lượng Prompt/Workflow (30 điểm):** Prompt có tính phòng thủ cao, lường trước các kịch bản What-if sập dịch vụ trung gian, cấu hình tham số hàng đợi/bộ đệm an toàn.
*   **Kiểm chứng thực tế & Mã nguồn (40 điểm):** Cung cấp đầy đủ text log hội thoại 3 bước trực tiếp trong file. Mã nguồn Listener/Consumer Java do AI sinh ra phải hoàn chỉnh, có cơ chế lưu vết log, xử lý lỗi Dead Letter Queue và đảm bảo idempotency.

---

## PHẦN III: QUY ĐỊNH NỘP BÀI

1.  **Định dạng nộp bài:** Sinh viên nộp **01 file Markdown duy nhất (.md)**.
2.  **Cú pháp đặt tên file:** `SS06_[Họ_và_Tên]_[Mã_Sinh_Viên].md`
    *Ví dụ:* `SS06_NguyenVanA_HE150123.md`
3.  **Yêu cầu bắt buộc về minh chứng:**
    *   Tất cả các phần chạy thử nghiệm với AI (từ Bài 1 đến Bài 5) bắt buộc phải sao chép đầy đủ nội dung prompt và phản hồi của AI vào khối mã Markdown (code block). Tuyệt đối không chấp nhận nộp link chia sẻ cuộc hội thoại (Share Link).
    *   **Tuyệt đối không sử dụng hình ảnh chụp màn hình (screenshot).** Bài nộp chứa hình ảnh hoặc link chia sẻ thay thế văn bản hội thoại sẽ bị AI chấm bài từ chối ghi nhận điểm phần thực nghiệm để bảo vệ tính trung thực học thuật.
