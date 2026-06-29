# Session 10: Kỹ năng Prompt để phân tích, xây dựng SRS dự án

## Lesson 02: Cài đặt, cấu hình và giới thiệu giao diện Antigravity

## 1. Mục tiêu học tập
Sau khi hoàn thành bài học này, bạn sẽ có khả năng:
* Thực hiện cài đặt thành công Antigravity IDE và cấu hình biến môi trường PATH chính xác.
* Hiểu rõ kiến trúc và các khu vực chức năng chính trên giao diện Antigravity (Code Editor, Chat Panel, Terminal).
* Thành thạo các kỹ năng xử lý sự cố môi trường thực tế như xung đột cổng mạng (Port Conflict) và thư mục bị khóa (Folder In Use).

---

## 2. Đặt vấn đề thực tế
Hãy tưởng tượng bạn vừa nhận dự án phát triển một ứng dụng backend phức tạp cho một công ty công nghệ lớn. Bạn hào hứng khởi động máy tính, sẵn sàng cho những dòng code đầu tiên. 

Nhưng rồi, màn hình hiện ra hàng loạt thông báo lỗi khó hiểu, công cụ bạn cần không khởi động được, hoặc tình huống tệ nhất, cổng mạng bị chiếm dụng bởi một tiến trình ngầm nào đó mà bạn chẳng biết là gì. Thay vì tập trung vào logic nghiệp vụ, bạn lại mắc kẹt trong việc vật lộn với các lỗi môi trường và cài đặt phần mềm. Thời gian quý báu của dự án trôi đi, deadline đến gần, và bạn cảm thấy bế tắc.

---

## 3. Kiến thức cốt lõi

### Kiến trúc "Out-of-the-box" của Antigravity
Thay vì yêu cầu lập trình viên phải cấu hình thủ công các file hệ thống phức tạp ngay từ đầu, Antigravity được thiết kế tối ưu để sẵn sàng sử dụng ngay sau khi cài đặt. Công cụ tự động nhận diện môi trường, tích hợp sẵn các bộ quản lý thư viện và gói cấu hình tiêu chuẩn, giúp bạn nhanh chóng sinh bộ khung dự án qua chế độ Composer hoặc Agent mà không cần can thiệp sâu vào các file cấu hình.

### Các khu vực chức năng chính trên giao diện
* **Vùng Code Editor:** Khu vực làm việc chính để viết code, hỗ trợ tô sáng cú pháp thông minh và gợi ý code tự động theo ngữ cảnh.
* **Chat Panel:** Cửa sổ giao tiếp trực tiếp với AI Assistant. Nơi bạn có thể đặt câu hỏi về thuật toán, yêu cầu giải thích luồng dữ liệu, hoặc sinh mã nhanh.
* **Terminal Tích hợp:** Giao diện dòng lệnh được nhúng trực tiếp trong IDE, hỗ trợ chạy các lệnh shell hệ thống, Git, hoặc quản lý tiến trình.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Khi khởi chạy ứng dụng web Spring Boot trên cổng `8080` hoặc khi cố gắng cập nhật/xóa thư mục dự án, hệ thống báo lỗi không thể khởi chạy server hoặc thư mục đang bị giữ bởi tiến trình khác (Folder In Use).

### Thách thức
Các lỗi này xảy ra ngầm khiến IDE không thể kiểm soát trực tiếp. Lập trình viên dễ loay hoay cài lại máy hoặc khởi động lại hệ thống một cách không cần thiết, làm gián đoạn tiến độ công việc.

### Giải pháp xử lý sự cố môi trường
* **Lỗi thư mục bị khóa (Folder In Use):** Sử dụng công cụ `Resource Monitor` của hệ điều hành để tìm kiếm tiến trình (handle) đang giữ thư mục dự án và chấm dứt nó.
* **Xung đột cổng mạng (Port Conflict):** Sử dụng các lệnh dòng lệnh tìm PID (Process ID) đang lắng nghe cổng mạng và thực hiện đóng tiến trình cưỡng bức (`taskkill`).

---

## 5. Demo minh họa

### Mục tiêu demo
Thực hiện cấu hình biến môi trường PATH và xử lý lỗi xung đột cổng mạng trên Windows.

### Các bước thực hiện

#### Bước 1: Cấu hình biến môi trường PATH (Windows)
1. Cài đặt Antigravity vào thư mục mặc định (ví dụ: `C:\Antigravity`).
2. Mở **Environment Variables** (Biến môi trường) trên Windows.
3. Tìm biến `Path` trong phần *System Variables* và chọn *Edit*.
4. Thêm đường dẫn đến thư mục `bin` của Antigravity (ví dụ: `C:\Antigravity\bin`).
5. Mở Terminal mới và kiểm tra bằng lệnh:
   ```bash
   antigravity --version
   ```

#### Bước 2: Xử lý lỗi xung đột cổng mạng (ví dụ cổng 8080)
1. Mở Terminal tích hợp của Antigravity dưới quyền Administrator.
2. Chạy lệnh truy tìm PID đang chiếm dụng cổng `8080`:
   ```powershell
   netstat -ano | findstr :8080
   ```
   *Kết quả hiển thị tương tự:*
   ```text
   TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       1234
   ```
   *(Trong đó `1234` là PID của tiến trình đang chiếm cổng).*
3. Chạy lệnh kết thúc tiến trình cưỡng bức:
   ```powershell
   taskkill /PID 1234 /F
   ```

#### Bước 3: Giải phóng thư mục bị khóa
1. Nhấn `Windows + R`, gõ `resmon.exe` để mở **Resource Monitor**.
2. Chuyển qua tab **CPU**, chọn phần **Associated Handles**.
3. Nhập tên thư mục bị khóa vào ô tìm kiếm.
4. Chuột phải vào tiến trình đang giữ file và chọn **End Process**.

---

## 6. Tổng kết

### Những kiến thức quan trọng nhất
* Cài đặt và cấu hình PATH chính xác giúp bạn có thể khởi chạy và tương tác với Antigravity từ bất kỳ đâu thông qua dòng lệnh.
* Hiểu rõ giao diện tích hợp giữa Code Editor, Chat Panel và Terminal giúp lập trình viên tối ưu hóa luồng làm việc.
* Kỹ năng xử lý Port Conflict và Folder In Use là bắt buộc đối với lập trình viên để tự giải quyết các lỗi môi trường cơ bản.

### Những sai lầm thường gặp
* **Quên cấu hình PATH:** Khiến các script tự động hóa hoặc các lệnh CLI của IDE không thể hoạt động.
* **Xung đột cổng với 9Router:** Khi sử dụng các công cụ định tuyến mạng ảo, cần kiểm tra cấu hình port mapping tránh xung đột với cổng dự án đang chạy.

---

## 7. Câu hỏi đánh giá

### Câu 1
Tại sao cần phải thêm đường dẫn thư mục `bin` của Antigravity vào biến môi trường PATH?

**Gợi ý đáp án:**
Việc thêm thư mục `bin` vào biến PATH giúp hệ điều hành nhận diện được tệp thực thi của Antigravity từ bất kỳ thư mục làm việc nào khi chạy lệnh trong Terminal/PowerShell, cho phép chạy các lệnh CLI của IDE hoặc khởi động nhanh các script tự động hóa mà không cần gõ đường dẫn tuyệt đối.

### Câu 2
Nêu các bước sử dụng dòng lệnh trên Windows để giải phóng một cổng mạng đang bị chiếm dụng khiến ứng dụng không khởi chạy được.

**Gợi ý đáp án:**
1. Mở Terminal với quyền Admin.
2. Sử dụng lệnh `netstat -ano | findstr :<port_number>` để tìm PID của tiến trình đang lắng nghe cổng đó.
3. Sử dụng lệnh `taskkill /PID <PID> /F` để kết thúc tiến trình đang chiếm dụng cổng cưỡng bức.

### Câu 3
Khi nào thì xảy ra lỗi "Folder In Use" và cách xử lý nhanh chóng bằng Resource Monitor là gì?

**Gợi ý đáp án:**
Lỗi xảy ra khi người dùng cố gắng xóa, đổi tên hoặc di chuyển thư mục dự án nhưng hệ thống từ chối do có một tiến trình khác (như Terminal ngầm, trình duyệt, hoặc IDE khác) đang khóa hoặc mở tệp trong thư mục đó.
Cách xử lý: Chạy `resmon.exe`, vào tab CPU, gõ tên thư mục tại ô Associated Handles để tìm tiến trình đang khóa thư mục, sau đó chuột phải và chọn End Process.
