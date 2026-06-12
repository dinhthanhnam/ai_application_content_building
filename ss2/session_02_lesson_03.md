# Session 02: Lợi ích, hạn chế và trách nhiệm khi sử dụng AI

## Lesson 03: So sánh các công cụ AI thông dụng theo mục tiêu sử dụng

### 1. Mục tiêu học tập
Sau bài học này, bạn sẽ có khả năng:
* Lựa chọn chính xác công cụ AI (Web Chat, Code Assistant, Agentic Assistant) cho từng tác vụ cụ thể trong vòng đời phát triển phần mềm.
* Đánh giá được ưu thế và hạn chế về mặt ngữ cảnh (Context Window) của từng công cụ.
* Áp dụng thành thạo các tính năng nâng cao của Code Assistant để sửa lỗi đa tệp tin (Multi-file Refactoring).

---

### 2. Đặt vấn đề thực tế: Khối lượng công việc khổng lồ trước kỳ phát hành của QuickBite
QuickBite chuẩn bị phát hành phiên bản mới tích hợp cổng thanh toán trực tuyến. Với vai trò là lập trình viên chịu trách nhiệm chính, bạn phải hoàn thành 3 đầu việc lớn trong vòng một buổi chiều:
1. **Viết tài liệu tích hợp API (API Integration Doc):** Tài liệu chi tiết bằng định dạng Markdown để gửi cho đối tác cổng thanh toán.
2. **Sửa lỗi bảo mật đăng nhập (`login`):** Khắc phục lỗi SQL Injection tiềm ẩn trong hàm kiểm tra tài khoản người dùng dưới đây:
   ```javascript
   // LỖI BẢO MẬT: Ghép chuỗi trực tiếp dễ bị SQL Injection
   const query = `SELECT * FROM users WHERE email = '${email}' AND password = '${password}'`;
   const user = await db.rawQuery(query);
   ```
3. **Refactor cấu trúc dữ liệu trên nhiều file:** Thay đổi cấu trúc đối tượng `Order` ở cả file xử lý đơn hàng (`orderService.js`) và file hiển thị hóa đơn (`invoiceService.js`).

Nếu bạn chọn sai công cụ AI cho từng tác vụ (ví dụ: dùng tính năng tự động điền code Autocomplete để viết tài liệu dài, hoặc dùng Web Chat copy-paste thủ công 3 file liên quan để refactor cấu trúc dữ liệu), bạn sẽ không thể hoàn thành công việc trước thời hạn.

---

### 3. Kiến thức cốt lõi: Ma trận lựa chọn công cụ AI theo mục tiêu

Để tối ưu hóa năng suất, lập trình viên cần hiểu rõ thế mạnh của từng công cụ thông qua bảng so sánh dưới đây:

| Tiêu chí so sánh | LLM Web Chat (ChatGPT, Claude) | Code Assistant Tiêu chuẩn (GitHub Copilot) | Agentic Code Assistant (Antigravity, Cursor Composer) |
| :--- | :--- | :--- | :--- |
| **Phạm vi hiểu ngữ cảnh (Context)** | File đơn lẻ hoặc văn bản copy-paste thủ công. | File hiện tại đang mở và một số file liên quan gần nhất. | **Toàn bộ dự án (Workspace)** thông qua cơ chế lập chỉ mục (indexing). |
| **Khả năng chỉnh sửa code** | Không thể tự sửa file. Trả về mã nguồn ở khung chat để user tự copy. | Đề xuất code tự động khi gõ (Autocomplete) hoặc inline chat (Ctrl+K) trên file hiện tại. | **Tự động mở, chỉnh sửa và tạo mới nhiều file cùng lúc** theo yêu cầu. |
| **Tác vụ phù hợp nhất** | * Giải thích khái niệm học thuật.<br>* Viết tài liệu (Markdown).<br>* Brainstorm ý tưởng thiết kế. | * Viết nhanh boilerplate code.<br>* Điền nhanh các dòng code lặp.<br>* Sửa lỗi cú pháp đơn giản. | * Sửa lỗi logic phức tạp.<br>* Refactor code trên nhiều file.<br>* Viết Unit Test cho toàn bộ module. |

> [!IMPORTANT]
> **Quy tắc bỏ túi:**
> * Việc cần **tư duy rộng, viết lách, giải thích khái niệm** -> Sử dụng **Web Chat**.
> * Việc cần **code nhanh tại chỗ trên 1 file** -> Sử dụng **Inline Code Assistant (Ctrl+K)**.
> * Việc liên quan đến **nhiều file, logic phức tạp, cấu trúc dự án** -> Sử dụng **Agentic Assistant (Composer/Workspace Chat)**.

---

### 4. Thực hành minh họa (Demo): So sánh giải quyết lỗi SQL Injection của QuickBite
Hãy cùng xem cách hai công cụ khác nhau hỗ trợ bạn giải quyết lỗi bảo mật SQL Injection trong hàm đăng nhập của QuickBite.

#### Cách 1: Sử dụng Web Chat (ChatGPT)
1. Bạn sao chép đoạn code chứa lỗi SQL Injection ở phần Đặt vấn đề.
2. Mở ChatGPT Web, viết Prompt: *"Đoạn code JS ghép chuỗi SQL này có lỗi bảo mật gì và sửa lại như thế nào?"*
3. ChatGPT giải thích về cơ chế tấn công SQL Injection và cung cấp đoạn code đã sửa bằng cách sử dụng **Parameterized Query (Truy vấn tham số hóa)**.
4. Bạn sao chép code đã sửa từ ChatGPT, quay lại IDE và dán đè lên code cũ.
*👉 Đánh giá:* Rất tốt để học bản chất lỗi bảo mật SQL Injection, nhưng tốn công copy-paste.

#### Cách 2: Sử dụng Code Assistant (như Antigravity/Cursor)
1. Bạn bôi đen đoạn code chứa lỗi SQL.
2. Nhấn phím tắt **Ctrl + K** và gõ yêu cầu: *"Fix SQL Injection using parameterized query"*.
3. Code Assistant phân tích ngay lập tức và hiển thị bản sửa đổi Diff trực tiếp:
   ```diff
   - const query = `SELECT * FROM users WHERE email = '${email}' AND password = '${password}'`;
   - const user = await db.rawQuery(query);
   + const query = 'SELECT * FROM users WHERE email = ? AND password = ?';
   + const user = await db.query(query, [email, password]);
   ```
4. Bạn nhấn **Accept**. Lỗi bảo mật được giải quyết an toàn trong 5 giây.
*👉 Đánh giá:* Cực kỳ nhanh chóng, chính xác và không làm gián đoạn luồng làm việc của bạn trong IDE.

---

### 5. Tổng kết & Đánh giá

## Q1
Khi lập trình viên QuickBite cần viết mã nguồn kiểm thử (Unit Test) cho một module phức tạp liên quan đến 3 file khác nhau (ví dụ: `cart.js`, `discount.js` và `checkout.js`), công cụ nào dưới đây hỗ trợ tối ưu nhất?

[A]
Giao diện chat Web của ChatGPT (phiên bản miễn phí).
[EXP]
Sai. Bản chat Web thông thường không tự động đọc và liên kết được cấu trúc của 3 file nội bộ trong máy tính của bạn trừ khi bạn copy-paste thủ công tất cả, rất dễ thiếu sót ngữ cảnh.
[B]
Tính năng tự động điền từ (Inline Autocomplete) của trình soạn thảo văn bản.
[EXP]
Sai. Autocomplete chỉ đoán từ tiếp theo khi gõ, không thể tự sinh mã kiểm thử logic phức tạp liên kết nhiều file.
[C]
Một Agentic Code Assistant (như Antigravity hoặc Cursor Composer) hỗ trợ ngữ cảnh toàn dự án (Workspace Context).
[EXP]
Đúng. Công cụ này có thể phân tích mối quan hệ giữa 3 file thông qua cơ chế lập chỉ mục dự án và viết bộ test case đồng bộ chính xác.
[D]
Trình kiểm tra lỗi chính tả tiếng Anh mặc định của hệ điều hành.
[EXP]
Sai. Đây là công cụ kiểm tra chính tả văn bản, không liên quan đến kiểm thử phần mềm.

@correct: C
@point: 20

## Q2
Trong trường hợp nào lập trình viên nên ưu tiên sử dụng LLM Web Chat (như Claude Web) thay vì các công cụ hỗ trợ code trực tiếp trong IDE?

[A]
Khi muốn AI tự động viết và thay đổi code trực tiếp trên các file mã nguồn hiện tại của dự án.
[EXP]
Sai. Chat Web không thể tự động chỉnh sửa trực tiếp file trong máy tính của bạn.
[B]
Khi cần giải thích một khái niệm kiến trúc phần mềm trừu tượng hoặc viết tài liệu hướng dẫn tích hợp chi tiết.
[EXP]
Đúng. Khung chat web rộng rãi và khả năng xử lý ngôn ngữ tự nhiên tốt giúp viết tài liệu và thảo luận kiến trúc hiệu quả hơn.
[C]
Khi cần sửa nhanh một lỗi cú pháp thiếu dấu ngoặc đơn ở file code hiện tại.
[EXP]
Sai. Lỗi cú pháp nhỏ tại chỗ nên dùng Code Assistant inline (Ctrl+K) hoặc Autocomplete để sửa trong 2 giây thay vì copy lên Web.
[D]
Khi máy tính hoàn toàn không có kết nối Internet và cần làm việc offline.
[EXP]
Sai. Cả LLM Web Chat và hầu hết Code Assistant hiện tại đều yêu cầu kết nối Internet để gửi dữ liệu lên server AI xử lý.

@correct: B
@point: 20

## Q3
Tính năng "Truy vấn tham số hóa" (Parameterized Query) được AI đề xuất để giải quyết lỗi bảo mật nào trong hàm đăng nhập của QuickBite?

[A]
Lỗi tràn bộ nhớ đệm (Buffer Overflow) do người dùng nhập mật khẩu quá dài.
[EXP]
Sai. Parameterized Query dùng để tách biệt mã lệnh SQL và dữ liệu nhập vào, không liên quan đến kích thước bộ đệm.
[B]
Lỗi tấn công chèn mã lệnh SQL độc hại (SQL Injection) thông qua việc ghép chuỗi đầu vào trực tiếp.
[EXP]
Đúng. Parameterized Query xử lý đầu vào của người dùng như các tham số thuần túy, ngăn chặn kẻ tấn công chèn mã độc để thao túng câu lệnh SQL.
[C]
Lỗi rò rỉ bộ nhớ (Memory Leak) do không giải phóng các kết nối cơ sở dữ liệu cũ.
[EXP]
Sai. Đây là lỗi quản lý tài nguyên kết nối, không liên quan đến cách viết câu lệnh truy vấn SQL.
[D]
Lỗi không mã hóa mật khẩu người dùng trước khi lưu trữ vào cơ sở dữ liệu (Hashing).
[EXP]
Sai. Hashing mật khẩu là quy trình mã hóa bảo mật mật khẩu ở DB, còn Parameterized Query ngăn chặn chèn câu lệnh SQL ở tầng truy vấn.

@correct: B
@point: 20
