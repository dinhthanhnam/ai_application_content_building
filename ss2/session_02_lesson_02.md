# Session 02: Lợi ích, hạn chế và trách nhiệm khi sử dụng AI

## Lesson 02: Giới thiệu các công cụ AI thông dụng

### 1. Mục tiêu học tập

Sau bài học này, bạn có thể:
* Phân loại được hai nhóm công cụ AI hỗ trợ lập trình chính: LLM đa năng (General LLM) và Trợ lý lập trình tích hợp (Code Assistant).
* Phân tích rõ cơ chế hoạt động, ưu điểm và hạn chế của từng nhóm công cụ trong quy trình làm việc thực tế.
* Thực hiện được việc lựa chọn đúng công cụ AI tùy thuộc vào từng loại tác vụ (viết mã, viết tài liệu, thiết kế hệ thống).
* Áp dụng thành thạo tư duy tối ưu hóa luồng làm việc, giảm thiểu sự gián đoạn do chuyển đổi ngữ cảnh (Context Switching).

---

### 2. Đặt vấn đề thực tế

Trong quá trình phát triển tính năng áp dụng mã giảm giá cho dự án hệ thống đặt đồ ăn QuickBite, bạn phát hiện ra một lỗi liên quan đến việc so sánh ngày hết hạn của thẻ giảm giá (Voucher). Bạn cần chỉnh sửa nhanh logic điều kiện trong một tệp mã nguồn.

Theo thói quen, bạn sao chép đoạn mã đó, mở trình duyệt web, truy cập vào một công cụ AI như ChatGPT, dán đoạn mã vào ô chat và gõ yêu cầu sửa. Sau khi AI trả lời, bạn lại quét khối mã mới, nhấn sao chép, chuyển tab trở lại giao diện trình soạn thảo code (IDE) và dán đè lên đoạn mã cũ. 

Quy trình "copy-paste" thủ công liên tục giữa các ứng dụng khiến bạn bị mất sự tập trung, tốn thời gian thao tác và đôi khi xảy ra lỗi do dán nhầm vị trí. Hiện tượng liên tục thay đổi màn hình làm việc này được gọi là "Context Switching" (Chuyển đổi ngữ cảnh) - một trong những nguyên nhân hàng đầu làm suy giảm năng suất của kỹ sư. Làm thế nào để bạn có thể nhờ AI sửa mã ngay tại dòng lệnh đang viết mà không cần phải rời khỏi màn hình lập trình?

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A split-screen illustration showing two scenarios. On the left, a frustrated software engineer overwhelmed by dozens of browser tabs and copy-pasting code between windows, labeled "Context Switching". On the right, a highly focused engineer looking at a clean code editor where a glowing AI assistant is smoothly auto-completing code directly on the screen, labeled "Integrated Code Assistant". Clean corporate aesthetic, neon UI accents, 8k resolution.

---

### 3. Kiến thức cốt lõi

Hiện nay, các công cụ AI hỗ trợ lập trình được phân thành hai nhóm chính với chức năng bổ trợ cho nhau:

```text
Phân loại Công cụ AI:
[Công cụ AI] 
   ├──> [Nhóm 1: LLM Đa năng (Web Chat)]
   │      └── Ví dụ: ChatGPT, Claude, Gemini Web
   └──> [Nhóm 2: Trợ lý Lập trình Tích hợp (Code Assistant)]
          └── Ví dụ: Antigravity, Cursor, GitHub Copilot
```

#### A. Nhóm 1: LLM Đa năng (General-purpose LLM)
* **Định nghĩa:** Các mô hình ngôn ngữ lớn hoạt động trên trình duyệt web, cung cấp giao diện tương tác dưới dạng hộp thoại chat tự do.
* **Đặc điểm:** Không có kết nối trực tiếp với các tệp tin trong máy tính của bạn. Người dùng phải cung cấp thủ công các đoạn mã (ngữ cảnh) vào khung chat.
* **Vai trò:** Phân tích ý tưởng cấp cao, thảo luận kiến trúc hệ thống, biên soạn tài liệu, hoặc giải nghĩa các khái niệm lý thuyết phức tạp.
* **Khi nào sử dụng:** Khi cần bắt đầu dự án từ con số 0, brainstorm ý tưởng, hoặc viết các tài liệu dài như Hướng dẫn sử dụng (User Manual).

#### B. Nhóm 2: Trợ lý lập trình tích hợp (Code Assistant)
* **Định nghĩa:** Các tiện ích bổ sung hoặc trình soạn thảo mã chuyên dụng được tích hợp trực tiếp AI vào môi trường lập trình (IDE).
* **Đặc điểm:** AI có quyền truy cập, đọc hiểu cấu trúc thư mục của toàn bộ dự án hiện tại (Workspace Context).
* **Vai trò:** Tự động hoàn thành mã (Autocomplete) theo thời gian thực khi lập trình viên đang gõ, sửa lỗi trực tiếp tại dòng code (Inline Edit).
* **Khi nào sử dụng:** Khi cần sinh các hàm nghiệp vụ, cấu trúc lại mã (Refactoring), hoặc sinh nhanh các Unit Test cho mã nguồn đang có.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric infographic comparing a Web Chat AI interface and an Integrated IDE AI interface. The Web Chat shows a generic conversational UI floating in a browser. The IDE interface shows glowing code lines being generated automatically inside a professional dark-mode code editor (VS Code style). The illustration highlights the deep integration of the IDE tool. Corporate tech style, highly detailed.

---

### 4. Phân tích tình huống thực tế

#### Bối cảnh
Tại công ty phần mềm FinCore, nhóm kỹ sư đang xây dựng một tính năng thanh toán định kỳ. 

#### Thách thức
Một kỹ sư mới của FinCore cần tối ưu lại hàm tính lãi suất (`calculateInterest`), nhưng hệ thống này yêu cầu hàm mới phải phù hợp với quy ước đặt tên (Coding Convention) và cấu trúc dữ liệu khổng lồ của dự án. Nếu sao chép hàm này ra ChatGPT, ChatGPT sẽ không thể biết các tệp tin khác trong dự án được cấu trúc như thế nào, dẫn đến việc sinh ra mã không chạy được khi tích hợp vào dự án thực.

#### Cách tiếp cận
Kỹ sư này quyết định sử dụng tính năng "Trò chuyện với Cơ sở mã" (Chat with Codebase) của một Code Assistant (ví dụ: Antigravity). Kỹ sư chọn toàn bộ hàm `calculateInterest` và gõ Prompt trực tiếp trong IDE: *"Hãy tối ưu lại hàm này, đảm bảo gọi đúng chuẩn mô hình dữ liệu của User trong dự án của chúng ta"*.

#### Kết quả
Do Code Assistant có khả năng tự động đọc quét các tệp định nghĩa dữ liệu (Models) trong dự án, nó lập tức đề xuất một phiên bản tối ưu hoàn toàn khớp với cấu trúc hệ thống. Lập trình viên chỉ cần nhấn phím `Accept` để áp dụng mà không phải chỉnh sửa bất kỳ lỗi tương thích nào.

---

### 5. Demo minh họa

**Mục tiêu demo:** Minh họa sự khác biệt thao tác giữa Web Chat và Code Assistant khi xử lý cùng một vấn đề sửa mã nguồn.

*Điều kiện chuẩn bị:* Hàm kiểm tra voucher cần sửa trong dự án (như phần Đặt vấn đề).

**Cách 1: Sử dụng Web Chat (Truyền thống)**
1. **Thao tác:** Chuyển sang IDE, quét chọn hàm, nhấn Ctrl+C.
2. **Chuyển ngữ cảnh:** Nhấn Alt+Tab mở trình duyệt, mở tab ChatGPT.
3. **Gửi Prompt:** Dán hàm và yêu cầu: *"Sửa so sánh ngày hết hạn của voucher không tính giờ phút giây"*.
4. **Nhận kết quả:** AI sinh ra kết quả, bạn nhấn nút Copy.
5. **Hoàn thiện:** Nhấn Alt+Tab quay lại IDE, chọn vùng cũ và nhấn Ctrl+V để dán đè.
*👉 Tổng thời gian: ~45 giây. Rất nhiều thao tác thủ công và dễ gây phân tâm.*

**Cách 2: Sử dụng Code Assistant trực tiếp (Inline Edit)**
1. **Thao tác:** Bôi đen đoạn mã cần sửa ngay trong IDE.
2. **Giao tiếp tại chỗ:** Nhấn tổ hợp phím tắt `Ctrl + K` (hoặc `Cmd + K`), một hộp thoại Prompt nhỏ xuất hiện ngay tại dòng lệnh đó.
3. **Gửi Prompt:** Gõ *"Sửa so sánh ngày hết hạn không tính giờ"*.
4. **Đánh giá Diff:** Công cụ AI lập tức hiển thị một bảng so sánh Diff trực quan (Màu đỏ là mã cũ sẽ bị xóa, màu xanh là mã mới sẽ được thêm) ngay trên màn hình IDE:
   ```diff
   - if (voucher.getExpiryDate().before(today)) {
   + if (voucher.getExpiryDate().toLocalDate().isBefore(LocalDate.now())) {
   ```
5. **Hoàn thiện:** Bạn đánh giá thấy mã xanh chính xác, nhấn `Accept` (hoặc `Ctrl + Enter`) để áp dụng.
*👉 Tổng thời gian: ~10 giây. Không cần chuyển tab, thao tác tập trung, độ chính xác cao.*

---

### 6. Tổng kết

* Không có công cụ AI nào là "tốt nhất" cho mọi tình huống. Hiệu suất của lập trình viên phụ thuộc vào việc kết hợp nhuần nhuyễn cả LLM Đa năng và Code Assistant.
* LLM Đa năng đóng vai trò như một **Chuyên gia tư vấn tổng thể** (thiết kế kiến trúc, lên ý tưởng, viết tài liệu).
* Code Assistant đóng vai trò như một **Trợ lý thao tác nhanh** (viết mã, tối ưu hàm, tự động điền cú pháp).
* **Sai lầm thường gặp:** Sử dụng sai công cụ (ví dụ: yêu cầu Code Assistant viết toàn bộ tài liệu kiến trúc dài 20 trang, hoặc liên tục copy-paste qua lại giữa ChatGPT Web và IDE để sửa từng dòng lỗi nhỏ).

---

### 7. Câu hỏi đánh giá

## Câu 1 (Đánh giá khả năng ghi nhớ)
**Câu hỏi:** Hãy phân tích điểm khác biệt lớn nhất giữa LLM đa năng chạy trên Web (như ChatGPT Web) và một Trợ lý Lập trình (Code Assistant) tích hợp trực tiếp vào môi trường lập trình (IDE). Khi nào nên sử dụng công cụ nào?

**Câu trả lời tham khảo:**
* **Điểm khác biệt cốt lõi:** LLM đa năng trên Web hoạt động như một nền tảng trò chuyện độc lập, không kết nối với dự án thực tế; trong khi đó, Code Assistant được nhúng sâu vào môi trường lập trình (IDE), có khả năng đọc hiểu ngữ cảnh (context) từ toàn bộ cấu trúc thư mục, các tệp tin trong dự án và tự động điền mã nguồn trực tiếp khi lập trình viên đang gõ.
* **Khi nào sử dụng LLM đa năng:** Khi cần tóm tắt và đọc hiểu các khái niệm kỹ thuật trừu tượng, viết hướng dẫn sử dụng, xây dựng cấu trúc thiết kế cơ sở dữ liệu ban đầu, hoặc phân tích tài liệu chuyên sâu.
* **Khi nào sử dụng Code Assistant:** Khi đang trong trạng thái viết mã liên tục (flow state), cần sửa đổi cú pháp một hàm cụ thể, thêm dòng kiểm thử (Unit test), hoặc áp dụng tái cấu trúc mã (Refactor) trực tiếp vào tệp tin.

## Câu 2 (Đánh giá khả năng đọc hiểu & phân tích)
**Câu hỏi:** Tại sao việc sử dụng Code Assistant để sửa đổi các hàm xử lý logic nhỏ lại được đánh giá là chuyên nghiệp và an toàn hơn so với việc sử dụng Web Chat? Hãy liên hệ với khái niệm "Context Switching".

**Câu trả lời tham khảo:**
* Sử dụng Code Assistant chuyên nghiệp và an toàn hơn vì công cụ này có khả năng cung cấp bảng so sánh Diff (hiển thị rõ dòng cũ màu đỏ, dòng mới màu xanh). Lập trình viên có thể kiểm duyệt và xác nhận trực quan trước khi mã bị thay đổi, tránh tình trạng dán nhầm, dán thiếu như khi copy-paste từ Web Chat.
* Việc thao tác trên Code Assistant giúp lập trình viên tránh được "Context Switching" (Sự chuyển đổi ngữ cảnh). Chuyển đổi ngữ cảnh xảy ra khi ta phải thay đổi màn hình, chuyển tab trình duyệt và thay đổi môi trường ứng dụng liên tục. Điều này làm ngắt quãng dòng suy nghĩ của kỹ sư, gây phân tâm và giảm năng suất làm việc đáng kể. Bằng cách thao tác trực tiếp trên IDE qua các phím tắt, kỹ sư giữ được sự tập trung tuyệt đối vào mã nguồn.

## Câu 3 (Tình huống thực chiến)
**Câu hỏi:** Trong một dự án hệ thống giáo dục, bạn cần thiết kế kiến trúc toàn bộ cơ sở dữ liệu cho tính năng thi trắc nghiệm (gồm Bảng Câu hỏi, Câu trả lời, Điểm số, Lịch sử thi). Sau đó, bạn cần tạo nhanh một tệp tin `StudentModel.java` để khai báo các trường dữ liệu theo kiến trúc đã chốt. Hãy đưa ra chiến lược phân bổ công việc cho hai công cụ AI: Web Chat và Code Assistant để xử lý tác vụ này.

**Câu trả lời tham khảo:**
Chiến lược kết hợp công cụ tối ưu cho tình huống này sẽ bao gồm hai giai đoạn:
1. **Giai đoạn 1 (Thiết kế Kiến trúc) - Sử dụng LLM Đa năng (Web Chat):**
   - *Hành động:* Tôi sẽ mở trình duyệt (như ChatGPT hoặc Claude), đưa ra Prompt yêu cầu thiết kế lược đồ cơ sở dữ liệu (Database Schema) cho tính năng thi trắc nghiệm. 
   - *Lý do:* Khung chat trên web rộng rãi, phù hợp cho việc AI hiển thị các cấu trúc bảng (Table), phân tích rõ các mối quan hệ (1-Nhiều, Nhiều-Nhiều) và dễ dàng trao đổi, chỉnh sửa kiến trúc ở mức vĩ mô.
2. **Giai đoạn 2 (Thực thi Mã nguồn) - Sử dụng Code Assistant (Tích hợp IDE):**
   - *Hành động:* Sau khi chốt được cấu trúc dữ liệu trên Web Chat, tôi quay lại IDE tạo tệp tin `StudentModel.java`. Sử dụng phím tắt (như Ctrl+K) của Code Assistant, tôi dán cấu trúc bảng Student vừa chốt và yêu cầu: *"Sinh mã nguồn Class StudentModel bằng ngôn ngữ Java kèm theo các hàm Getter/Setter chuẩn"*.
   - *Lý do:* Sử dụng Code Assistant ở bước này để thao tác sinh mã diễn ra ngay tại môi trường dự án, tự động áp dụng đúng các tiêu chuẩn khai báo (Import) đang có, giúp hoàn thành công việc nhanh chóng mà không cần copy-paste thủ công.
