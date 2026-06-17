# Session 05 - Lesson 03: Cải tiến đầu ra qua các vòng chỉnh sửa Prompt

## 1. Mục tiêu học tập
Sau khi hoàn thành Lesson này, người học có thể:
- Phân biệt được sự khác nhau giữa việc "Sửa lỗi bằng Prompt lặp cơ bản" và "Cải tiến đầu ra nâng cao" để đạt chuẩn môi trường doanh nghiệp (Production-ready).
- Nhận diện các dấu hiệu của một đoạn mã nguồn "chạy được nhưng chưa tốt" do AI sinh ra (thiếu Validate, thiếu cơ chế Log, hoặc cấu trúc lỏng lẻo).
- Thực hiện chuỗi kỹ thuật bổ sung Ràng buộc (Constraints) ở mức độ chuyên sâu vào Prompt để gọt giũa kết quả qua từng vòng.
- Áp dụng quy trình nâng cấp Prompt để thiết kế các đoạn mã Java an toàn, đáp ứng tiêu chuẩn Clean Code và quy ước mã hóa (Coding Convention) của đội ngũ.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric graphic showing a code block undergoing a forging process. In the first stage, it's a rough block of working code. In the second stage, robotic arms label it with "Validation" and "Logging" components. In the final stage, it emerges as a glowing, polished, diamond-like code structure labeled "Production-Ready". High-tech corporate UI aesthetic, blue and silver color palette.

---

## 2. Đặt vấn đề thực tế

Trong dự án nâng cấp phần mềm Quản lý nhân sự, bạn cần viết một API RESTful bằng Spring Boot để thêm mới một nhân viên vào cơ sở dữ liệu. Bạn mở công cụ AI và viết một Prompt nhanh: *"Hãy viết một API Java thêm mới nhân viên."*

AI cung cấp ngay một phương thức (Method) sử dụng chú thích `@PostMapping`, nhận dữ liệu đầu vào và lưu thẳng vào cơ sở dữ liệu bằng `Repository.save()`. Đoạn mã chạy hoàn hảo trên máy tính cá nhân của bạn, nhân viên mới được thêm thành công.

Tuy nhiên, khi Giám đốc Kỹ thuật (Tech Lead) đánh giá mã nguồn (Code Review), anh ấy đã từ chối (Reject) đoạn mã này vì hàng loạt lỗi nghiêm trọng theo tiêu chuẩn doanh nghiệp:
1. Không kiểm tra tính hợp lệ của dữ liệu đầu vào (Validation): Tên nhân viên để trống hoặc số điện thoại ghi bằng chữ vẫn được hệ thống lưu lại.
2. Không bắt ngoại lệ an toàn (Exception Handling): Nếu cơ sở dữ liệu bị mất kết nối, API trả về thông báo lỗi đỏ lòm (Stack Trace) chứa thông tin bảo mật cho người dùng cuối.
3. Thiếu ghi vết hệ thống (Logging): Hệ thống không lưu lại lịch sử truy vết ai đã thêm nhân viên lúc nào.

Sự khác biệt lớn nhất giữa một lập trình viên nghiệp dư và một kỹ sư chuyên nghiệp khi dùng AI nằm ở chỗ: Người nghiệp dư dừng lại khi đoạn mã "chạy được", còn kỹ sư chuyên nghiệp biết cách **cải tiến đầu ra qua các vòng chỉnh sửa Prompt** cho đến khi đoạn mã đạt tiêu chuẩn triển khai thực tế.

---

## 3. Kiến thức cốt lõi

### 3.1. Tại sao cần vòng chỉnh sửa nâng cao?
Ở cấp độ cơ bản (như đã học ở Session 03), chúng ta dùng Prompt lặp để sửa lỗi khi code bị hỏng (Compile/Runtime Error). Ở cấp độ nâng cao này, mã của AI đã hoàn toàn chạy được 100%, nhưng chúng ta phải chỉnh sửa Prompt để nâng cấp kiến trúc (Architecture) và độ an toàn (Safety) của nó lên chuẩn dự án lớn.

### 3.2. Ba bước của quy trình "Cải tiến đầu ra"
Để biến một đoạn mã "Hoạt động" (Working) thành "Hoàn hảo" (Perfect), bạn thực hiện các vòng lặp phản hồi tập trung vào 3 trụ cột sau:

**Vòng 1: Củng cố tính bền vững (Robustness)**
- Lệnh cho AI tập trung vào việc xử lý các trường hợp ngoại lệ (Edge Cases) và kiểm chứng đầu vào.
- *Câu lệnh chỉnh sửa mẫu:* *"Hãy bổ sung thư viện `Hibernate Validator` vào đối tượng đầu vào. Đảm bảo Email phải đúng chuẩn định dạng và số điện thoại phải đủ 10 số."*

**Vòng 2: Áp dụng chuẩn bảo trì (Maintainability & Clean Code)**
- Lệnh cho AI tập trung vào cách cấu trúc lại mã nguồn sao cho các đồng nghiệp khác dễ đọc, dễ bảo trì sau này.
- *Câu lệnh chỉnh sửa mẫu:* *"Đoạn mã xử lý của bạn đang bị dồn hết trong Controller. Hãy tách phần logic lưu trữ sang lớp Service. Bổ sung cơ chế `SLF4J` để log lại sự kiện ở cấp độ INFO và ERROR."*

**Vòng 3: Tối ưu theo ngữ cảnh doanh nghiệp (Context-specific Tuning)**
- Lệnh cho AI tập trung vào định dạng kiểu trả về, quy định ngôn ngữ phản hồi, hoặc quy ước đặt tên (Naming Convention) đặc thù của công ty.
- *Câu lệnh chỉnh sửa mẫu:* *"Thay đổi kiểu dữ liệu trả về của API thành lớp `ApiResponse<T>` chuẩn của dự án chúng tôi. Các thông báo lỗi phải được trả về bằng tiếng Việt chuẩn mực."*

### 3.3. Tư duy "Nuôi dưỡng Prompt" (Prompt Evolution)
Khi một chuỗi Prompt lặp (qua 3 vòng trên) tạo ra được kết quả xuất sắc, thay vì bỏ đi, bạn hãy gộp tất cả các yêu cầu đó thành một **Prompt duy nhất (Master Prompt)** để tái sử dụng cho toàn bộ các API khác trong dự án sau này. Quá trình đó gọi là sự tiến hóa của Prompt.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A circular diagram illustrating the "Prompt Evolution" cycle. It starts with "Working Code" at the bottom left, flows up to "Robustness (Edge Cases)" on the top, moves right to "Maintainability (Clean Code)", and descends to "Production-Ready". An AI glowing brain sits in the center coordinating the flow. Professional data visualization style, dark mode with neon green arrows.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Dự án Ví điện tử yêu cầu viết một hàm Java để xử lý việc trừ tiền trong tài khoản người dùng khi tiến hành thanh toán hóa đơn.

### Thách thức
Hàm trừ tiền do AI sinh ra lúc đầu rất đơn giản và gọn gàng: Lấy số dư hiện tại, trừ đi số tiền hóa đơn, và lưu lại. Tuy nhiên, nếu hai giao dịch thanh toán của cùng một khách hàng xảy ra đồng thời trong một mili-giây (Multi-threading), hàm này sẽ bị lỗi "Ghi đè dữ liệu" (Race Condition), khiến số dư bị sai lệch và ngân hàng thất thoát tiền.

### Cách tiếp cận qua các vòng chỉnh sửa
- **Kết quả Vòng 1 (Khởi tạo):** Lập trình viên yêu cầu viết hàm trừ tiền. AI trả về mã chạy đúng logic tính toán cơ bản bằng toán học. Mã chạy tốt trên máy tính đơn.
- **Vòng 2 (Cải tiến An toàn dữ liệu lõi):** Lập trình viên bổ sung Prompt: *"Hệ thống này xử lý thanh toán đa luồng (Multi-threading) cường độ cao. Hãy bổ sung cơ chế khóa dữ liệu (Pessimistic Locking) trong Spring Data JPA để ngăn chặn lỗi Race Condition."* AI lập tức phản hồi và thêm chú thích `@Lock(LockModeType.PESSIMISTIC_WRITE)` để khóa bản ghi cơ sở dữ liệu an toàn.
- **Vòng 3 (Cải tiến Trải nghiệm & Quy trình):** Lập trình viên tiếp tục gọt giũa: *"Nếu tài khoản khách hàng không đủ tiền, thay vì báo lỗi hệ thống chung chung, hãy tạo ra một ngoại lệ tùy chỉnh có tên `InsufficientBalanceException` và tiến hành Rollback (hoàn tác) toàn bộ giao dịch."* AI cập nhật cấu trúc sử dụng `@Transactional` của Spring.

### Kết quả
Đoạn mã cuối cùng không chỉ thực hiện phép trừ toán học thông thường. Nó đã trở thành một giải pháp phần mềm cấp độ doanh nghiệp (Enterprise-level) với đầy đủ cơ chế khóa bản ghi CSDL, quản lý giao dịch tự động và bắt ngoại lệ tinh tế bảo vệ khách hàng.

---

## 5. Demo minh họa

**Mục tiêu demo:** Minh họa cách từng bước cải tiến một mã nguồn Java từ mức độ "Fresher" (Thực tập sinh) lên mức độ "Senior" (Kỹ sư cao cấp) bằng cách liên tiếp bồi đắp các Ràng buộc nâng cao vào Prompt.

**Điều kiện chuẩn bị:** Một trình duyệt mở công cụ AI (như ChatGPT, Claude) hoặc sử dụng Code Assistant ngay trong môi trường lập trình (Antigravity).

**Luồng Prompt thực tế (Demo Script):**

1. **Khởi tạo (Mức độ Fresher):**
   > *Prompt:* Viết một hàm Java upload (tải lên) hình ảnh đại diện của người dùng.
   > *Kết quả AI:* Trả về hàm lưu file vào ổ cứng cục bộ bằng thư viện `java.io.File`. Mã rất ngắn và chạy được.

2. **Vòng chỉnh sửa 1 - Bảo vệ an ninh mạng (Security):**
   > *Prompt Cải tiến:* "Đoạn mã trên cực kỳ nguy hiểm nếu người dùng cố tình tải lên file mã độc hoặc Virus (.exe, .sh). Hãy bổ sung logic kiểm tra Validate: Chỉ cho phép tải file định dạng hình ảnh JPG, PNG và dung lượng không được vượt quá 5MB."
   > *Kết quả AI:* Bổ sung các mệnh đề `if` nghiêm ngặt để kiểm tra đuôi mở rộng của tệp tin và kiểm tra kích thước bytes đầu vào.

3. **Vòng chỉnh sửa 2 - Kiến trúc đám mây (Cloud Architecture):**
   > *Prompt Cải tiến:* "Hệ thống của chúng tôi không cho phép lưu file ở ổ cứng máy chủ cục bộ. Hãy sửa lại đoạn mã này để tải file thẳng lên dịch vụ đám mây Amazon S3 bằng thư viện `AWS SDK for Java`."
   > *Kết quả AI:* Xóa bỏ hoàn toàn phần mã `java.io.File`, thay thế bằng logic khởi tạo đối tượng `AmazonS3Client` và thực thi luồng tải.

4. **Vòng chỉnh sửa 3 - Tối ưu hóa Clean Code và Bảo mật cấu hình:**
   > *Prompt Cải tiến:* "Trong đoạn mã vừa sinh ra, thông tin chìa khóa mật khẩu `AccessKey` của AWS đang bị lộ do gắn cứng (Hardcode) trực tiếp trong file. Hãy sửa lại để ứng dụng lấy cấu hình từ biến môi trường (Environment Variables) hoặc file `application.yml` của Spring Boot."
   > *Kết quả AI:* Gỡ bỏ các biến văn bản nhạy cảm, áp dụng chú thích `@Value("${aws.s3.access-key}")` theo đúng chuẩn quy trình bảo mật của doanh nghiệp.

**Lưu ý thực tế:**
Quá trình cải tiến đầu ra ở cấp độ này giống hệt như quy trình Code Review khắt khe của một dự án lớn. Bạn đang thực thi quyền hạn của một Tech Lead, liên tục sử dụng Prompt để "bắt bẻ" và ép AI nâng cấp chất lượng mã nguồn lên chuẩn cao nhất.

---

## 6. Tổng kết

- **Thay đổi tư duy cốt lõi:** Đừng dễ dãi sao chép và chấp nhận dòng mã đầu tiên do AI tạo ra. Mã nguồn sinh ra từ Zero-shot Prompt thường chỉ ở mức độ của thực tập sinh (Fresher). Chỉ có mã nguồn đã trải qua nhiều vòng tinh chỉnh mới đạt tiêu chuẩn của chuyên gia (Senior).
- **Chuỗi cải tiến (Refinement Chain):** Luôn tập thói quen kiểm duyệt mã của AI theo thứ tự: Logic cơ bản -> Xử lý ngoại lệ và Bảo mật (Robustness) -> Kiến trúc phần mềm sạch (Clean Code/Maintainability) -> Tùy chỉnh nghiệp vụ đặc thù nội bộ.
- **Kiến thức kỹ năng nền:** Để có thể chỉnh sửa và "bắt bẻ" AI hiệu quả, bản thân kỹ sư cũng phải tự trang bị nền tảng lý thuyết vững chắc về thiết kế phần mềm. Bởi vì, nếu bạn hoàn toàn không biết hệ thống cần phải lưu vết (Logging) hay mã hóa mật khẩu, bạn sẽ không bao giờ nghĩ ra được lệnh Prompt để yêu cầu AI thực hiện điều đó.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A conceptual infographic comparing "Fresher AI Code" to "Senior AI Code". The Fresher side shows a simple, fragile, unprotected block of code. The Senior side shows the same code reinforced with security shields (Validation), gears (Cloud Architecture), and a lock (Clean Code/Environment Variables). Clean corporate tech style, glowing accents.

---

## 7. Câu hỏi đánh giá

**Câu 1:** Hãy phân tích sự khác biệt cốt lõi giữa khái niệm "Prompt lặp cơ bản" (thường dùng để sửa lỗi Compile/Runtime) và khái niệm "Cải tiến đầu ra nâng cao" (dùng để đạt chuẩn Production-ready).

*Gợi ý đáp án:* 
- **Prompt lặp cơ bản:** Tập trung chủ yếu vào việc giải quyết lỗi (Fix Bugs). Mục tiêu cuối cùng là biến một đoạn mã bị lỗi hỏng (không chạy được hoặc tính toán sai) thành một đoạn mã có thể hoạt động được (Working Code).
- **Cải tiến đầu ra nâng cao:** Chỉ bắt đầu triển khai khi đoạn mã đã hoạt động hoàn hảo ở mặt logic tính toán. Mục tiêu là biến một đoạn mã "Working Code" thành mã chuyên nghiệp (Production-ready) bằng cách bổ sung thêm các lớp phòng thủ (Validate dữ liệu, Bắt Exception), tăng tính bảo mật hệ thống (Ghi Logging, che giấu mật khẩu), tích hợp kiến trúc đám mây, và áp dụng tiêu chuẩn Clean Code khắt khe của dự án doanh nghiệp.

**Câu 2:** Lập trình viên A yêu cầu AI viết một API RESTful thực hiện chức năng xóa tài khoản người dùng bằng Java. AI đã sinh ra mã chạy thành công và xóa được dữ liệu dưới CSDL. Tuy nhiên, lập trình viên A nhận thấy nếu ID tài khoản đó không tồn tại trong hệ thống, API không báo lỗi gì mà vẫn trả về thông báo thành công. Theo quy trình 3 vòng cải tiến đầu ra, lập trình viên A cần bổ sung Prompt gì để khắc phục vấn đề này? Hành động này thuộc về vòng cải tiến nào của mã nguồn?

*Gợi ý đáp án:*
- **Prompt đề xuất:** *"Hãy sửa API xóa người dùng trên. Bổ sung logic kiểm tra xem ID tài khoản có tồn tại trong CSDL hay không trước khi thực hiện xóa. Nếu không tồn tại, hãy ném ra ngoại lệ `UserNotFoundException` và trả về cấu trúc mã trạng thái HTTP 404 (Not Found)."*
- **Vòng cải tiến:** Động thái này thuộc về Vòng 1 của quá trình cải tiến đầu ra: **Củng cố tính bền vững (Robustness)**. Nó trực tiếp giải quyết bài toán xử lý ngoại lệ biên (Edge Cases) để hệ thống hoạt động chặt chẽ, không sinh ra ảo giác thành công giả và không gây hiểu lầm cho người sử dụng hệ thống.

**Câu 3 (Thực chiến):** Đội dự án của công ty vừa nhận được một hàm Java do AI tạo ra để xử lý tính toán chiết khấu thanh toán. Mặc dù luồng logic toán học hoàn toàn đúng, nhưng mọi cảnh báo lỗi hệ thống (ví dụ: số tiền chiết khấu bị âm) đều được in thẳng ra màn hình Console bằng lệnh cơ bản `System.out.println()`. Hệ thống của công ty bạn đang sử dụng thư viện `Lombok` và `SLF4J` để quản lý Log chuyên nghiệp. 
Dựa trên kiến thức của Lesson này, hãy viết một đoạn Prompt cải tiến yêu cầu AI thay thế cách in lỗi cũ bằng chuẩn Logging khắt khe của công ty.

*Gợi ý đáp án (Tham khảo đoạn Prompt mẫu sau):*
- **Vai trò:** Hãy đóng vai Kỹ sư phần mềm tuân thủ nghiêm ngặt tiêu chuẩn Clean Code.
- **Mục tiêu:** Hãy tái cấu trúc hàm tính chiết khấu thanh toán bên trên để sử dụng cơ chế lưu vết dữ liệu (Logging) chuyên nghiệp thay vì in ra màn hình máy tính thô sơ.
- **Ngữ cảnh:** Dự án Spring Boot doanh nghiệp của chúng tôi bị đánh dấu lỗi (Lint Error) và tuyệt đối cấm sử dụng dòng lệnh `System.out.println()`. Hệ thống quản lý các Annotation tự động qua thư viện `Lombok`.
- **Ràng buộc:** Bắt buộc sử dụng chú thích `@Slf4j` của thư viện Lombok. Thay thế việc in ra màn hình bằng cách chuyển các thông báo mang tính thông tin tiến trình sang cấp độ `log.info()`. Nếu phát hiện số tiền bị âm hoặc lỗi nghiệp vụ nghiêm trọng, hãy chuyển luồng thông báo sang cấp độ `log.error()` và đính kèm thông tin biến thể lỗi để phục vụ quá trình Debug.
