# Session 11: Kỹ thuật Prompt để tạo mã nguồn dự án

## Lesson 01: Tạo Prompt yêu cầu viết code trực tiếp trong Antigravity

## 1. Mục tiêu học tập
Sau khi hoàn thành bài học này, bạn sẽ có khả năng:
* Sử dụng tính năng liên kết tệp (`@filename`) và thư mục (`@folder`) để cung cấp ngữ cảnh kiến trúc dự án cho AI.
* Xây dựng Prompt có cấu trúc đầy đủ (Context, Objective, Technology, Function, Output) để sinh mã nguồn chuẩn.
* Tạo ra các API RESTful CRUD hoàn chỉnh có tích hợp Validation và Global Exception Handling tương thích với codebase hiện tại.

---

## 2. Đặt vấn đề thực tế
Trong quá trình phát triển phần mềm, bạn được giao nhiệm vụ mở rộng một dự án hiện có. Yêu cầu là tạo một bộ API CRUD (Create, Read, Update, Delete) cho một thực thể mới (ví dụ như `Product`), nhưng phải tuân thủ nghiêm ngặt kiến trúc dự án đã định, từ cách đặt tên biến, cấu trúc package, đến việc sử dụng các lớp chuẩn hóa như DTO (Data Transfer Object) hay Repository. 

Thử thách ở đây là làm sao để code được sinh ra nhanh chóng và "hòa nhập" hoàn toàn vào dự án hiện có, tránh phải chỉnh sửa lại quá nhiều. Bạn không muốn nhận về những đoạn code "chung chung", thiếu ngữ cảnh, mà cần một trợ lý thực sự hiểu về dự án của mình.

---

## 3. Kiến thức cốt lõi

### Cơ chế sinh code hướng ngữ cảnh (Context-Aware) trong Antigravity
Khác với các chatbot AI thông thường chỉ sinh code cô lập, Antigravity cho phép bạn liên kết trực tiếp các file và thư mục của dự án vào prompt. Nhờ đó, AI sẽ tự động phân tích:
* Cấu trúc package và thư mục hiện có của bạn.
* Cách định nghĩa các Entity, DTO hiện tại.
* Phong cách viết code (Coding Convention) và các thư viện hỗ trợ (như Spring Boot 3, Java 17, Lombok).
* Các lớp xử lý ngoại lệ (Exception) dùng chung để áp dụng đồng bộ.

### Cấu trúc Prompt viết code chuẩn
Một prompt viết code chuyên nghiệp trong Antigravity nên được cấu tạo từ các phần:
1. **Mục tiêu tổng quát:** Mô tả tính năng cần viết.
2. **Yêu cầu ngữ cảnh:** Chỉ rõ các file/thư mục tham chiếu qua `@filename`.
3. **Yêu cầu công nghệ & kiến trúc:** Phiên bản ngôn ngữ, framework, các layer (Controller, Service, Repository), design patterns.
4. **Yêu cầu chức năng:** Mô tả các API endpoint, logic nghiệp vụ, validation dữ liệu.
5. **Yêu cầu định dạng đầu ra:** Tên file cần sinh, vị trí lưu trữ và cách tổ chức code.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Lập trình viên cần tạo đầy đủ các API quản lý sản phẩm (`Product`) có chức năng kiểm tra hợp lệ dữ liệu đầu vào (Validation) và xử lý lỗi toàn cục.

### Thách thức
Nếu gõ thủ công từng file từ DTO, Service, ServiceImpl đến Controller sẽ rất tốn thời gian và dễ nhầm lẫn cú pháp. Ngược lại, nếu dùng AI ngoài trình duyệt, code sinh ra sẽ bị lệch package hoặc không bắt được các Exception tùy chỉnh có sẵn trong hệ thống.

### Giải pháp
Xây dựng một prompt có cấu trúc chặt chẽ, sử dụng các thẻ `@Product.java` (Entity), `@ProductRepository.java` (Repository) và `@exception` (thư mục chứa các custom exception) làm ngữ cảnh đầu vào cho Antigravity.

---

## 5. Demo minh họa

### Mục tiêu demo
Thực hành viết Prompt sinh DTO và sinh REST API CRUD đầy đủ cho thực thể `Product` trong Spring Boot.

---

### Ví dụ 1: Prompt sinh DTO tương thích với Entity có sẵn
Giả sử bạn đang mở file `Product.java` (Entity) và muốn sinh một Request DTO.

**Prompt sử dụng:**
```text
# Create a DTO for the Product entity
# Contextualize with current file: @Product.java
# Use Lombok annotations for boilerplate code.
# Ensure all fields from Product entity are present in DTO.
# Output should be a new Java class.
```
*Antigravity sẽ đọc các trường từ `@Product.java` và tự động tạo ra một class DTO với đầy đủ `@Data`, `@NoArgsConstructor`, `@AllArgsConstructor` mà không cần bạn phải khai báo lại danh sách trường.*

---

### Ví dụ 2: Prompt sinh RESTful CRUD API hoàn chỉnh
Giả sử dự án đã có `Product.java` (Entity), `ProductRepository.java` và thư mục `exception/` chứa lớp `ResourceNotFoundException.java`.

**Prompt sử dụng:**
```text
# Generate a full RESTful CRUD API for the 'Product' entity.

# Contextualize with existing files and folder structure:
# Use @src/main/java/com/example/demo/model/Product.java for entity definition.
# Use @src/main/java/com/example/demo/repository/ProductRepository.java for repository interface.
# Refer to @src/main/java/com/example/demo/exception/ for custom exception classes.

# Technology and architecture requirements:
# - Target: Spring Boot 3, Java 17.
# - Architecture: Adhere to standard Spring layered architecture (Controller, Service, Repository).
# - Design Patterns: Use Repository pattern for data access.
# - DTOs: Create ProductRequestDTO for creation/update and ProductResponseDTO for responses.
# - Validation: Include JSR-303/Jakarta Bean Validation annotations (@NotNull, @Min, @Max, etc.) on DTOs.
# - Exception Handling: Implement global exception handling using @ControllerAdvice catching ResourceNotFoundException (from provided exception folder).

# Functional requirements:
# - POST /api/products: Create a new product.
# - GET /api/products: Get all products.
# - GET /api/products/{id}: Get product by ID.
# - PUT /api/products/{id}: Update product by ID.
# - DELETE /api/products/{id}: Delete product by ID.

# Output format:
# Generate separate Java files for:
# - ProductRequestDTO.java
# - ProductResponseDTO.java
# - ProductService.java and ProductServiceImpl.java
# - ProductController.java
# Ensure all generated classes use appropriate package declarations.
```
*Antigravity sẽ phân tích các file được tag và xuất ra cấu trúc các class Controller, Service, DTO đồng bộ với hệ thống cũ, sẵn sàng để lập trình viên nhấn "Accept" đưa vào codebase.*

---

## 6. Tổng kết

### Những kiến thức quan trọng nhất
* Việc cung cấp ngữ cảnh thông qua `@filename` giúp AI định hình phong cách viết code và cấu trúc dự án.
* Prompt có cấu trúc chi tiết giúp hạn chế tối đa việc sinh mã lỗi thời hoặc không khớp kiến trúc.

### Những sai lầm thường gặp
* **Không cung cấp file tham chiếu:** AI phải tự đoán cấu trúc Entity, dẫn đến việc ánh xạ sai kiểu dữ liệu giữa Database và API.
* **Không kiểm tra code trước khi Apply:** AI có thể sinh các import thừa hoặc không tương thích hoàn toàn. Lập trình viên luôn phải rà soát và chạy build thử trước khi hoàn thành task.

---

## 7. Câu hỏi đánh giá

### Câu 1
Tại sao tính năng tag file (`@`) hoặc folder trong Antigravity lại quan trọng khi viết Prompt sinh code?

**Gợi ý đáp án:**
Tính năng này giúp AI tiếp cận được ngữ cảnh thực tế của dự án. Thay vì sinh code chung chung, AI có thể đọc cấu trúc package, tên các class, các annotation đang sử dụng và convention của dự án để viết ra mã nguồn có thể lắp ráp trực tiếp (plug-and-play) mà không cần refactor lại cấu trúc.

### Câu 2
Nêu cấu trúc 5 thành phần của một Prompt viết code chuyên nghiệp trong Antigravity.

**Gợi ý đáp án:**
1. **Mục tiêu (Objective):** Mô tả chức năng chính cần xây dựng.
2. **Ngữ cảnh (Context):** Chỉ định các file/thư mục liên quan bằng `@`.
3. **Kiến trúc & Công nghệ (Architecture/Tech Stack):** Xác định rõ Spring Boot 3, Java 17, Layered Architecture, DTO, Lombok...
4. **Yêu cầu chức năng (Functions):** Chi tiết các API endpoints và logic xử lý nghiệp vụ.
5. **Định dạng đầu ra (Output):** Các class cần sinh và vị trí lưu trữ.

### Câu 3
Khi sinh API CRUD bằng AI, làm thế nào để đảm bảo dữ liệu đầu vào được xác thực (validation) và các lỗi được xử lý đồng bộ với dự án?

**Gợi ý đáp án:**
Trong phần ràng buộc (Constraints) của Prompt, cần yêu cầu AI sử dụng các annotation của JSR-303/Jakarta Bean Validation (như `@NotNull`, `@Size`) trên các lớp Request DTO, đồng thời tag thư mục chứa các Custom Exception của dự án và yêu cầu tích hợp chúng vào bộ xử lý ngoại lệ toàn cục `@ControllerAdvice`.