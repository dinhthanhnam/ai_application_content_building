# Session 02: Lợi ích, hạn chế và trách nhiệm khi sử dụng AI

## Lesson 03: So sánh các công cụ AI thông dụng theo mục tiêu sử dụng

### 1. Mục tiêu học tập

Sau bài học này, bạn có thể:
* Lựa chọn chính xác loại công cụ AI (Web Chat, Code Assistant, Agentic Assistant) cho từng tác vụ cụ thể trong vòng đời phát triển phần mềm.
* Đánh giá được ưu thế và hạn chế về mặt hiểu ngữ cảnh dự án (Context Window) của từng công cụ.
* Áp dụng kỹ năng phân công tác vụ tối ưu cho AI để đảm bảo tiến độ và chất lượng mã nguồn mà không gặp phải giới hạn công cụ.

---

### 2. Đặt vấn đề thực tế

Nhóm phát triển QuickBite đang trong giai đoạn chạy nước rút để phát hành phiên bản mới tích hợp cổng thanh toán trực tuyến. Với vai trò lập trình viên chính, bạn phải hoàn thành 3 đầu việc lớn trong vỏn vẹn một buổi chiều:
1. **Viết tài liệu tích hợp API (API Integration Doc):** Một tài liệu định dạng Markdown giải thích cặn kẽ logic tích hợp gửi cho đối tác.
2. **Sửa lỗi bảo mật (Security Fix):** Khắc phục lỗi SQL Injection tiềm ẩn trong hàm kiểm tra đăng nhập người dùng ở một tệp tin duy nhất.
3. **Tái cấu trúc dữ liệu (Multi-file Refactoring):** Cập nhật định dạng đối tượng `Order` trên nhiều tệp tin liên quan (như `OrderService.java`, `InvoiceService.java` và `PaymentController.java`).

Nếu bạn chọn sai công cụ AI cho từng tác vụ (ví dụ: dùng tính năng tự động điền code Autocomplete để viết tài liệu hướng dẫn dài 5 trang, hoặc dùng Web Chat để copy-paste thủ công 3 tệp tin để tái cấu trúc dữ liệu), bạn sẽ lãng phí hàng giờ đồng hồ và chắc chắn không thể hoàn thành công việc trước hạn chót.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric illustration of a stressed software engineer standing at a crossroads. One path leads to a web browser icon (representing Web Chat) with a pile of documents, another path leads to a code editor icon (representing Code Assistant) with glowing code snippets, and a third path leads to an interconnected network of files (representing Agentic Assistant). Cyberpunk corporate tech style, neon blue and orange accents, highly detailed 8k.

---

### 3. Kiến thức cốt lõi

Để tối ưu hóa năng suất, lập trình viên cần nắm vững "Ma trận lựa chọn công cụ AI". Hiện nay, công cụ AI hỗ trợ lập trình được phân thành 3 nhóm năng lực:

| Tiêu chí so sánh | 1. LLM Web Chat (ChatGPT, Claude) | 2. Code Assistant Tiêu chuẩn (GitHub Copilot, Cursor Inline) | 3. Agentic Assistant (Antigravity, Cursor Composer) |
| :--- | :--- | :--- | :--- |
| **Phạm vi hiểu ngữ cảnh (Context)** | Tệp tin đơn lẻ hoặc đoạn mã được người dùng sao chép thủ công. | Tệp tin đang mở hiện tại và một vài tệp tin liên quan gần nhất trong Editor. | **Toàn bộ dự án (Workspace)** thông qua cơ chế lập chỉ mục (Indexing) kho mã nguồn. |
| **Khả năng chỉnh sửa mã** | Không thể tự sửa tệp tin nội bộ. Trả về mã ở khung chat để kỹ sư tự copy-paste. | Đề xuất mã khi đang gõ (Autocomplete) hoặc sửa nhanh tại chỗ (Inline Edit - Ctrl+K). | **Tự động mở, đọc, chỉnh sửa và tạo mới nhiều tệp tin cùng lúc** để hoàn thành một tính năng. |
| **Tác vụ phù hợp nhất** | • Giải thích khái niệm học thuật.<br>• Viết tài liệu dự án.<br>• Brainstorm ý tưởng thiết kế. | • Viết nhanh hàm cơ bản.<br>• Điền nhanh các dòng mã lặp lại.<br>• Sửa lỗi cú pháp đơn giản. | • Sửa lỗi logic nghiệp vụ phức tạp.<br>• Tái cấu trúc (Refactor) mã trên nhiều tệp tin.<br>• Viết bộ Unit Test cho toàn bộ Module. |

**Quy tắc vàng phân công nhiệm vụ cho AI:**
* Việc cần **tư duy rộng, viết lách, giải thích khái niệm** $\rightarrow$ Dùng **Web Chat**.
* Việc cần **gõ mã nhanh tại chỗ trên 1 tệp tin** $\rightarrow$ Dùng **Code Assistant (Inline)**.
* Việc liên quan đến **nhiều tệp tin, logic phức tạp, cấu trúc tổng thể** $\rightarrow$ Dùng **Agentic Assistant**.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A conceptual infographic showing three tiers of AI tools. Tier 1: A brain icon with text documents representing "Web Chat / Thinking". Tier 2: A lightning bolt icon inside a code editor representing "Inline Code Assistant / Quick Edits". Tier 3: A robotic arm orchestrating multiple connected files and folders representing "Agentic Assistant / Multi-file Automation". Corporate tech style, clean UI design, glowing elements.

---

### 4. Phân tích tình huống thực tế

#### Bối cảnh
Tại công ty TechSolutions, đội ngũ đang phát triển tính năng Giỏ hàng (`cart`). Logic của giỏ hàng lại liên quan mật thiết đến mô-đun Giảm giá (`discount`) và Thanh toán (`checkout`).

#### Thách thức
Giám đốc dự án yêu cầu viết toàn bộ kịch bản Unit Test cho chức năng tính tổng tiền trong tệp `CartService.java`. Thách thức là để tính đúng tổng tiền, tệp này đang gọi rất nhiều hàm logic phức tạp từ `DiscountService.java` và `CheckoutService.java`.

#### Cách tiếp cận
Lập trình viên không sử dụng ChatGPT (vì lười sao chép 3 tệp tin dài). Thay vào đó, họ sử dụng một **Agentic Assistant** có khả năng truy cập ngữ cảnh toàn dự án (Workspace Context). Kỹ sư nhập Prompt: *"Hãy sinh bộ Unit Test cho hàm calculateTotal trong CartService.java. Chú ý các điều kiện ràng buộc ở DiscountService.java và CheckoutService.java"*.

#### Kết quả
Agentic Assistant tự động đọc và phân tích cấu trúc của cả 3 tệp tin, sau đó sinh ra một tệp tin test hoàn chỉnh chỉ trong 20 giây. Các kịch bản kiểm thử bao gồm đầy đủ các trường hợp ngoại lệ từ mô-đun giảm giá mà kỹ sư có thể đã quên nếu tự làm thủ công.

---

### 5. Demo minh họa

**Mục tiêu demo:** So sánh cách hai công cụ khác nhau hỗ trợ giải quyết lỗi bảo mật SQL Injection ở một hàm đăng nhập.

*Đoạn mã lỗi (Java):*
```java
String query = "SELECT * FROM users WHERE email = '" + email + "' AND password = '" + password + "'";
ResultSet user = db.rawQuery(query);
```

**Cách 1: Sử dụng Web Chat (Phục vụ học thuật)**
1. Mở ChatGPT Web, dán đoạn mã lỗi và gõ Prompt: *"Đoạn mã này có lỗi bảo mật gì và cách phòng chống ra sao?"*.
2. ChatGPT đưa ra bài phân tích dài, giải thích chi tiết về cơ chế tấn công SQL Injection và cung cấp đoạn mã đã sửa bằng "Truy vấn tham số hóa" (Parameterized Query).
3. Lập trình viên đọc hiểu, sau đó copy đoạn mã an toàn về dán đè vào dự án.
*👉 Đánh giá:* Rất tốt để **học hỏi nguyên lý gốc rễ**, nhưng tốn thời gian thao tác chuyển đổi cửa sổ.

**Cách 2: Sử dụng Code Assistant (Phục vụ thực thi nhanh)**
1. Lập trình viên bôi đen trực tiếp đoạn mã lỗi trong trình soạn thảo IDE.
2. Nhấn phím tắt (VD: `Ctrl + K`) và gõ ngắn gọn: *"Fix SQL Injection using parameterized query"*.
3. Code Assistant phân tích ngay lập tức và hiển thị bản so sánh mã nguồn (Diff):
   ```diff
   - String query = "SELECT * FROM users WHERE email = '" + email + "' AND password = '" + password + "'";
   - ResultSet user = db.rawQuery(query);
   + String query = "SELECT * FROM users WHERE email = ? AND password = ?";
   + PreparedStatement pstmt = db.prepareStatement(query);
   + pstmt.setString(1, email);
   + pstmt.setString(2, password);
   + ResultSet user = pstmt.executeQuery();
   ```
4. Kỹ sư nhấn `Accept`. Lỗi bảo mật được khắc phục chỉ trong 5 giây.
*👉 Đánh giá:* Cực kỳ nhanh chóng, **tập trung vào thực thi** mà không làm gián đoạn luồng lập trình.

---

### 6. Tổng kết

* Hiệu suất làm việc thực sự của lập trình viên trong kỷ nguyên AI đến từ việc chọn đúng "vũ khí" cho từng "trận chiến".
* LLM Web Chat là chuyên gia học thuật và biên soạn tài liệu; Inline Code Assistant là người trợ lý tăng tốc độ gõ máy; Agentic Assistant là tổng trình công trình sư có khả năng giải quyết các bài toán liên tệp tin.
* **Sai lầm thường gặp:** Lạm dụng duy nhất một công cụ cho mọi loại tác vụ. Cố gắng bắt Inline Code Assistant viết kiến trúc phần mềm, hoặc dùng Web Chat để dò lỗi logic nằm rải rác trên 10 tệp tin khác nhau.

---

### 7. Câu hỏi đánh giá

## Câu 1 (Đánh giá khả năng ghi nhớ)
**Câu hỏi:** Hãy trình bày sự khác biệt về "Phạm vi hiểu ngữ cảnh" (Context Window) giữa công cụ LLM Web Chat thông thường và một Agentic Assistant. Tại sao khả năng hiểu ngữ cảnh lại quan trọng trong lập trình?

**Câu trả lời tham khảo:**
* **Sự khác biệt về phạm vi ngữ cảnh:** 
  - LLM Web Chat (như ChatGPT, Claude) chỉ hiểu được ngữ cảnh giới hạn trong cuộc trò chuyện hiện tại hoặc những tệp văn bản mà người dùng chủ động tải lên/sao chép vào khung chat. Nó hoàn toàn không có kết nối với máy tính cá nhân.
  - Agentic Assistant (như Antigravity, Cursor) được tích hợp sâu vào môi trường phát triển (IDE). Công cụ này có khả năng lập chỉ mục (Indexing) toàn bộ thư mục dự án (Workspace), cho phép nó tự động đọc, hiểu mối quan hệ liên kết giữa hàng trăm tệp tin mã nguồn, thư viện và tài nguyên cục bộ.
* **Tầm quan trọng:** Khả năng hiểu ngữ cảnh toàn dự án là yếu tố quyết định để AI sinh ra những đoạn mã có thể chạy được thực tế, tái sử dụng đúng các hàm đã định nghĩa ở tệp khác và không phá vỡ cấu trúc tổng thể, thay vì chỉ sinh ra các đoạn mã mang tính lý thuyết suông.

## Câu 2 (Đánh giá khả năng đọc hiểu & phân tích)
**Câu hỏi:** Tại sao khi cần tái cấu trúc mã nguồn liên quan đến nhiều tệp tin (Multi-file Refactoring), việc sử dụng Web Chat lại bị coi là phương pháp kém hiệu quả và tiềm ẩn nhiều rủi ro lỗi logic?

**Câu trả lời tham khảo:**
Việc sử dụng Web Chat để tái cấu trúc mã nguồn trên nhiều tệp tin là kém hiệu quả và rủi ro vì những lý do sau:
1. **Lỗi con người do thao tác thủ công:** Người dùng phải tự tay sao chép đoạn mã từ Web Chat và dán vào từng tệp tin tương ứng trong IDE. Quá trình "copy-paste" liên tục với số lượng tệp lớn rất dễ gây ra lỗi dán nhầm vị trí, thiếu dòng hoặc xóa đè sai cấu trúc hiện tại.
2. **Thiếu tính đồng bộ ngữ cảnh:** Web Chat không biết cách các tệp tin liên kết với nhau như thế nào trong môi trường thực. Khi thay đổi cấu trúc của một biến số ở tệp A, nó có thể quên không cập nhật lời gọi hàm ở tệp B và tệp C, dẫn đến lỗi hỏng ứng dụng (Crash) khi chạy thử.
3. **Mất tập trung:** Việc chuyển đổi liên tục giữa trình duyệt và IDE làm gián đoạn luồng suy nghĩ của kỹ sư, giảm tốc độ và hiệu suất công việc đi rất nhiều so với việc để Agentic Assistant tự động cập nhật cả 3 tệp tin cùng lúc bằng một câu lệnh duy nhất.

## Câu 3 (Tình huống thực chiến)
**Câu hỏi:** Dự án của bạn vừa phát hiện một lỗi SQL Injection nghiêm trọng trong hệ thống do kỹ sư cũ để lại. Giám đốc yêu cầu bạn: (1) Sửa ngay lỗi đó trong mã nguồn, và (2) Viết một tài liệu hướng dẫn kỹ thuật chi tiết bằng Markdown để phổ biến cho toàn bộ nhóm phát triển nhằm tránh lặp lại lỗi này. Dựa trên ma trận lựa chọn công cụ AI, hãy nêu chiến lược thực hiện 2 yêu cầu trên một cách nhanh và chính xác nhất.

**Câu trả lời tham khảo:**
Dựa trên ma trận công cụ AI, chiến lược tối ưu nhất là phân chia công việc cho đúng "trợ lý" dựa trên thế mạnh của chúng:
1. **Đối với Yêu cầu 1 (Sửa ngay lỗi trong mã nguồn):** Tôi sẽ sử dụng **Inline Code Assistant** trực tiếp trong trình soạn thảo (IDE). Tôi sẽ quét vùng mã nguồn bị lỗi SQL Injection, dùng phím tắt (ví dụ Ctrl+K) yêu cầu AI: *"Fix this SQL Injection vulnerability using parameterized query"*. Bằng cách này, tôi có thể xem bảng đối chiếu (Diff), kiểm duyệt và áp dụng (Accept) đoạn mã an toàn ngay lập tức vào dự án chỉ trong vòng vài giây mà không cần rời khỏi IDE.
2. **Đối với Yêu cầu 2 (Viết tài liệu hướng dẫn kỹ thuật):** Tôi sẽ chuyển sang sử dụng **LLM Web Chat** (như Claude hoặc ChatGPT). Tôi sẽ yêu cầu: *"Hãy viết một tài liệu hướng dẫn định dạng Markdown giải thích chi tiết về lỗi SQL Injection, hậu quả của nó, và quy tắc lập trình an toàn để phòng tránh. Cung cấp ví dụ thực tế dựa trên Java (JDBC)"*. Web Chat có thế mạnh vượt trội trong việc giải thích khái niệm học thuật, sắp xếp cấu trúc văn bản và hành văn mạch lạc, do đó sẽ tạo ra một tài liệu hướng dẫn chất lượng cao và dễ đọc cho toàn đội.
