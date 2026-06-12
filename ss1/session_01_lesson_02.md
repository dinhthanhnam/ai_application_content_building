# Session 01: Định hướng môn học AI Application in Action

## Lesson 02: Tính cấp thiết của việc học và ứng dụng AI trong lập trình

## 1. Mục tiêu học tập
Sau khi hoàn thành bài học này, bạn sẽ có khả năng:
* Nhận diện được xu hướng chuyển dịch của ngành công nghiệp phần mềm dưới tác động của AI.
* Giải thích được lý do tại sao ứng dụng AI hỗ trợ lập trình là kỹ năng bắt buộc để nâng cao năng lực cạnh tranh.
* Áp dụng AI để tối ưu hóa hiệu năng thuật toán cơ bản trong các tình huống thực tế.

---

## 2. Đặt vấn đề thực tế
Hãy tưởng tượng bạn đang vận hành hệ thống phần mềm doanh nghiệp và chuẩn bị khởi động một sự kiện bán hàng lớn. Ngay trước giờ G, hệ thống phát hiện lỗi hiệu năng nghiêm trọng khiến trang web chạy rất chậm khi truy vấn danh sách sản phẩm. 

Nếu tiếp cận theo cách truyền thống là ngồi viết lại thuật toán từ đầu bằng tay và tự sửa lỗi cú pháp, bạn sẽ đối mặt với áp lực thời gian cực lớn và dễ phát sinh thêm lỗi logic mới. Trong tình huống này, việc dùng AI hỗ trợ phân tích code cũ và đề xuất giải pháp tối ưu là vô cùng cấp bách và giúp giảm thiểu rủi ro cho doanh nghiệp.

---

## 3. Kiến thức cốt lõi

### Khái niệm "Augmented Developer" (Lập trình viên tích hợp AI)
Đây là mô hình lập trình viên biết kết hợp tư duy logic hệ thống của con người với tốc độ sinh code và xử lý của AI. AI giúp giải phóng con người khỏi các công việc cú pháp lặp lại để tập trung vào thiết kế giải pháp nghiệp vụ.

### Ba trụ cột lợi ích của việc ứng dụng AI trong lập trình
* **Tốc độ (Speed):** Sinh code mẫu và tự động hoàn thành cú pháp tức thì.
* **Chất lượng (Quality):** Phát hiện lỗi logic tiềm ẩn và đề xuất cấu trúc tối ưu.
* **Học tập chủ động (Active Learning):** Giải thích nhanh các cú pháp và cấu trúc dữ liệu mới thông qua ví dụ thực tế.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Một doanh nghiệp Logistics gặp lỗi nghẽn luồng dữ liệu khi phân bổ tuyến đường cho hơn 10.000 đơn hàng mỗi ngày.

### Thách thức
Thuật toán phân bổ cũ sử dụng các vòng lặp lồng nhau phức tạp để duyệt dữ liệu, dẫn đến quá tải CPU khi lượng đơn hàng tăng cao.

### Cách tiếp cận
Lập trình viên sử dụng trợ lý AI để phân tích đoạn code cũ, yêu cầu AI đề xuất cấu trúc dữ liệu tối ưu hơn (như sử dụng cấu trúc Map thay vì duyệt mảng tuần tự).

### Kết quả
Sau khi áp dụng mã nguồn tối ưu do AI đề xuất, thời gian xử lý đơn hàng giảm từ 45 giây xuống còn 2 giây, giúp hệ thống vận hành ổn định trong suốt kỳ cao điểm.

---

## 5. Demo minh họa

### Mục tiêu demo
Minh họa quy trình sử dụng AI để tối ưu một hàm lọc sản phẩm giá rẻ bằng Java từ vòng lặp truyền thống sang Stream API.

### Sơ đồ tối ưu hóa luồng dữ liệu

```text
Sơ đồ tối ưu hóa luồng dữ liệu:

[Chưa tối ưu: Duyệt vòng lặp thủ công]
Danh sách sản phẩm ──> Duyệt từng sản phẩm ──> Kiểm tra giá < 100 ──> Thêm tên vào kết quả

[Tối ưu hóa: Stream Pipeline]
Danh sách sản phẩm ──> [filter: giá < 100] ──> [map: lấy tên] ──> [collect: danh sách kết quả]
```

* **Mô tả hình ảnh:** Sơ đồ luồng dữ liệu đơn giản thể hiện việc tối ưu hóa code Java. Bên trên là quy trình duyệt mảng truyền thống sử dụng vòng lặp (màu đỏ). Bên dưới là quy trình Stream API hiện đại, tinh gọn với các khối filter và map (màu xanh lá cây) chạy mượt mà hướng tới kết quả.
* **Prompt gợi ý (English):** A simple 3D infographic flowchart diagram showing software code optimization. The top row represents an old loop-based process in red. The bottom row represents an optimized stream pipeline with green blocks for filtering and mapping. Modern tech aesthetic, isolated on a white background.

### Điều kiện chuẩn bị
* Đoạn code Java lọc sản phẩm có giá dưới 100.
* Công cụ AI hỗ trợ lập trình.

### Các bước thực hiện
1. **Bước 1:** Chuẩn bị mã nguồn Java chưa tối ưu sử dụng vòng lặp `for` truyền thống.
2. **Bước 2:** Soạn Prompt yêu cầu AI tối ưu hóa hiệu năng bằng cách viết lại dưới dạng Java Stream API.
3. **Bước 3:** Nhận mã nguồn tối ưu từ AI và kiểm chứng tính đúng đắn của logic mới.

### Prompt sử dụng
```text
Hãy tối ưu hóa hàm lọc sản phẩm dưới đây bằng cách chuyển đổi sang sử dụng Java Stream API. Giải thích ngắn gọn lý do tối ưu.
```

### Mã nguồn chưa tối ưu (Java)
```java
import java.util.ArrayList;
import java.util.List;

public class ProductFilter {
    public static List<String> getCheapProducts(List<Product> products) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() < 100) {
                results.add(products.get(i).getName());
            }
        }
        return results;
    }
}
```

### Mã nguồn tối ưu hóa do AI đề xuất (Java Stream)
```java
import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {
    public static List<String> getCheapProductsOptimized(List<Product> products) {
        return products.stream()
                       .filter(p -> p.getPrice() < 100)
                       .map(Product::getName)
                       .collect(Collectors.toList());
    }
}
```

### Giải thích mã nguồn
* **Chưa tối ưu:** Sử dụng vòng lặp `for` thủ công để duyệt và thêm phần tử vào danh sách kết quả. Code dài dòng và khó tối ưu hóa song song khi cần thiết.
* **Đã tối ưu:** Sử dụng Stream API với phương thức `filter` để lọc giá và `map` để lấy tên sản phẩm. Code ngắn gọn, dễ đọc, dễ bảo trì và tối ưu hiệu năng duyệt mảng của Java.

---

## 6. Tổng kết

### Những kiến thức quan trọng nhất
* Làm chủ kỹ năng ứng dụng AI giúp lập trình viên tăng tốc độ viết code, tối ưu hóa thuật toán và rút ngắn thời gian xử lý sự cố.
* Mô hình Augmented Developer giúp nâng cao năng lực cạnh tranh trong thị trường lao động.

### Những sai lầm thường gặp
* Sao chép mã nguồn tối ưu của AI mà không hiểu rõ nguyên lý hoạt động hoặc bỏ qua việc viết test case kiểm chứng logic.
* Lạm dụng AI để viết toàn bộ code mà thiếu sự kiểm soát cấu trúc hệ thống.

---

## 7. Câu hỏi đánh giá

### Câu 1
Tại sao kỹ năng ứng dụng AI lại trở thành yêu cầu tuyển dụng quan trọng của các doanh nghiệp hiện nay?

**Gợi ý đáp án:**
Các doanh nghiệp ưu tiên nhân sự có khả năng giải quyết bài toán nghiệp vụ nhanh chóng và tối ưu bằng cách sử dụng các công cụ hiện đại. Làm chủ AI giúp lập trình viên tăng năng suất lao động từ 3 đến 5 lần và nhanh chóng thích ứng với công nghệ mới.

### Câu 2
Phân tích sự khác biệt về mặt hiệu năng và độ sạch của code (clean code) giữa việc lọc danh sách sản phẩm bằng vòng lặp `for` truyền thống và Stream API trong Java.

**Gợi ý đáp án:**
Stream API giúp code ngắn gọn, mang tính khai báo (declarative) rõ ràng hơn, giảm thiểu các biến trung gian và dễ bảo trì. Về hiệu năng, Stream API cho phép dễ dàng chuyển đổi sang xử lý song song (parallel stream) khi tập dữ liệu cực lớn, điều mà vòng lặp `for` thủ công đòi hỏi viết thêm rất nhiều code phức tạp.

### Câu 3
Khi phát hiện một đoạn code tính toán báo cáo tài chính của doanh nghiệp bị chậm ngay trước kỳ báo cáo quý, hãy đề xuất quy trình 3 bước xử lý nhanh bằng AI của một lập trình viên hiện đại.

**Gợi ý đáp án:**
1. Đưa đoạn code tính toán chậm cho AI phân tích nguyên nhân gây nghẽn và yêu cầu đề xuất giải pháp tối ưu cấu trúc dữ liệu hoặc thuật toán.
2. Kiểm tra mã nguồn do AI đề xuất xem có tương thích với hệ thống hiện tại không.
3. Sinh dữ liệu giả lập và viết các bộ unit test độc lập để xác minh code mới chạy chính xác và nhanh hơn code cũ trước khi deploy.
