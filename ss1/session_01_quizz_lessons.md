# Quiz Session 01

## Quiz Lesson 01: Tổng quan môn học và định hướng học tập đầu môn học

## Q1
Trọng tâm hoạt động của môn học "AI Application in Action" là gì?

[A]
Hướng dẫn lập trình viên ghi nhớ cú pháp và viết mã nguồn thủ công nhanh hơn.
[EXP]
Sai. Môn học không tập trung vào việc ghi nhớ cú pháp chi tiết vì AI có thể hỗ trợ việc này.
[B]
Phương pháp tương tác và làm việc kết hợp cùng AI để giải quyết bài toán nghiệp vụ thực tế.
[EXP]
Đúng. Trọng tâm của môn học là trang bị tư duy và phương pháp luận làm việc hiệu quả với AI để giải quyết các vấn đề nghiệp vụ.
[C]
Nghiên cứu các thuật toán chuyên sâu để tự xây dựng một mô hình trí tuệ nhân tạo mới.
[EXP]
Sai. Môn học hướng đến ứng dụng công cụ AI sẵn có vào công việc, không đi sâu vào nghiên cứu phát triển mô hình AI gốc.
[D]
Chuyển giao toàn bộ công việc phân tích hệ thống cho các chatbot tự động thực hiện hoàn toàn.
[EXP]
Sai. Con người vẫn đóng vai trò định hướng và ra quyết định, AI chỉ đóng vai trò trợ lý hỗ trợ.

@correct: B
@point: 20

## Q2
Trong mô hình làm việc kết hợp AI (Augmented Workflow), lập trình viên nên phân bổ thời gian như thế nào để đạt hiệu quả cao nhất?

[A]
Dành 95% thời gian gõ code thủ công và 5% thời gian để chạy chương trình.
[EXP]
Sai. Cách phân bổ này thuộc về quy trình làm việc truyền thống khi chưa có sự hỗ trợ của các công cụ AI.
[B]
Phó mặc 100% thời gian cho AI tự sinh code và triển khai thẳng lên máy chủ doanh nghiệp.
[EXP]
Sai. Phó mặc hoàn toàn cho AI mà không kiểm chứng sẽ gây ra rủi ro nghiêm trọng về bảo mật và lỗi logic.
[C]
Dành phần lớn thời gian (70%) để thiết kế Prompt tối ưu và kiểm chứng kết quả từ AI.
[EXP]
Đúng. Trọng tâm công việc chuyển dịch sang khâu định hướng (Prompting) và kiểm duyệt, kiểm thử chất lượng mã nguồn (Verify).
[D]
Không sử dụng AI trong suốt quá trình viết code và chỉ dùng khi hệ thống xảy ra sự cố lớn.
[EXP]
Sai. Cách làm này bỏ lỡ cơ hội tối ưu hóa năng suất và đẩy nhanh tiến độ làm việc ở mọi công đoạn của dự án.

@correct: C
@point: 20

## Q3
Phân tích đoạn mã nguồn Java đơn giản sau:

```java
public static boolean isEligibleForDiscount(int age, boolean hasMembership) {
    if (age >= 60) {
        return true;
    }
    return hasMembership;
}
```

Nếu khách hàng 25 tuổi và có thẻ thành viên (`hasMembership` có giá trị là `true`), hàm sẽ trả về kết quả gì?

[A]
Hàm trả về giá trị true.
[EXP]
Đúng. Khách hàng 25 tuổi không thỏa mãn điều kiện `age >= 60`, chương trình chuyển xuống dòng lệnh tiếp theo và trả về giá trị của `hasMembership` là `true`.
[B]
Hàm trả về giá trị false.
[EXP]
Sai. Vì tham số `hasMembership` truyền vào là `true` nên dòng lệnh cuối cùng sẽ trả về `true`.
[C]
Hàm ném ra lỗi ngoại lệ NullPointerException.
[EXP]
Sai. Các kiểu dữ liệu nguyên thủy `int` và `boolean` trong Java không thể nhận giá trị `null` nên không gây ra lỗi NullPointerException ở đây.
[D]
Hàm không trả về giá trị nào do thiếu điều kiện.
[EXP]
Sai. Hàm luôn trả về một giá trị kiểu `boolean` ở mọi nhánh rẽ nhánh của chương trình.

@correct: A
@point: 20

## Q4
Điểm khác biệt lớn nhất về vai trò của lập trình viên truyền thống so với lập trình viên tích hợp AI (Augmented Developer) là gì?

[A]
Lập trình viên truyền thống không cần phải hiểu logic nghiệp vụ của doanh nghiệp.
[EXP]
Sai. Cả hai đối tượng lập trình viên đều bắt buộc phải thấu hiểu logic nghiệp vụ của doanh nghiệp.
[B]
Lập trình viên tích hợp AI chỉ cần viết tài liệu hướng dẫn vận hành hệ thống.
[EXP]
Sai. Lập trình viên tích hợp AI vẫn trực tiếp tham gia phát triển phần mềm chứ không chỉ viết tài liệu hướng dẫn.
[C]
Lập trình viên truyền thống gõ code chậm hơn nhưng không bao giờ viết sai cú pháp.
[EXP]
Sai. Lập trình viên truyền thống vẫn thường xuyên gặp các lỗi cú pháp và lỗi biên dịch trong thực tế.
[D]
Lập trình viên tích hợp AI dịch chuyển vai trò từ thực thi chi tiết sang định hướng và kiểm soát.
[EXP]
Đúng. Nhờ sự hỗ trợ của AI ở tầng cú pháp, lập trình viên hiện đại tập trung vào kiến trúc hệ thống và kiểm chứng kết quả đầu ra.

@correct: D
@point: 20

## Q5
Khi sử dụng đoạn code Java `"Special-Zone".equals(region)`, điều gì xảy ra nếu tham số `region` truyền vào có giá trị là `null`?

[A]
Chương trình bị dừng ngay lập tức và ném ra ngoại lệ NullPointerException.
[EXP]
Sai. Cách viết này so sánh trực tiếp từ hằng số chuỗi nên tránh được lỗi NullPointerException khi biến truyền vào là null.
[B]
Chương trình tự động biên dịch lại và gán giá trị mặc định cho biến region.
[EXP]
Sai. Chương trình không tự động biên dịch lại hay gán lại giá trị cho biến ở thời điểm chạy.
[C]
Chương trình hoạt động bình thường một cách an toàn và trả về giá trị false.
[EXP]
Đúng. Phương thức `.equals()` được gọi trên đối tượng chuỗi khác null là `"Special-Zone"` sẽ kiểm tra đối số `null` và trả về `false` một cách an toàn.
[D]
Chương trình báo lỗi biên dịch do không thể so sánh chuỗi với giá trị rỗng.
[EXP]
Sai. Cú pháp hoàn toàn hợp lệ và không gây ra bất kỳ lỗi biên dịch nào trong Java.

@correct: C
@point: 20

---

## Quiz Lesson 02: Tính cấp thiết của việc học và ứng dụng AI trong lập trình

## Q6
Khái niệm "Augmented Developer" mô tả đối tượng nào trong ngành công nghiệp phần mềm hiện nay?

[A]
Người biết kết hợp tư duy logic hệ thống cá nhân với tốc độ xử lý của AI.
[EXP]
Đúng. Đây là mô hình nhân sự biết tận dụng các trợ lý AI để tăng năng suất làm việc lên nhiều lần.
[B]
Một robot thông minh tự động lập trình toàn bộ dự án mà không cần con người.
[EXP]
Sai. Robot hoặc tác tử AI hiện nay vẫn cần sự điều khiển, định hướng và ra lệnh từ con người.
[C]
Kỹ sư chỉ chuyên cấu hình thiết bị mạng và cài đặt phần cứng máy tính.
[EXP]
Sai. Khái niệm này thuộc về lĩnh vực phát triển phần mềm và ứng dụng công nghệ phần mềm.
[D]
Lập trình viên từ chối dùng công nghệ mới để bảo trì hệ thống bằng tay.
[EXP]
Sai. Đối tượng này là lập trình viên truyền thống thuần túy, không tích hợp công nghệ AI.

@correct: A
@point: 20

## Q7
Khi gặp sự cố hiệu năng hệ thống báo cáo tài chính chạy chậm ngay trước giờ báo cáo, lập trình viên tích hợp AI nên thực hiện bước nào đầu tiên?

[A]
Sao chép trực tiếp code của AI rồi dán đè lên hệ thống production để kịp tiến độ.
[EXP]
Sai. Đưa thẳng code chưa qua kiểm chứng lên production là hành động vô cùng nguy hiểm, vi phạm quy trình an toàn.
[B]
Sử dụng AI phân tích mã nguồn cũ để xác định vị trí nghẽn và gợi ý tối ưu.
[EXP]
Đúng. AI giúp đọc hiểu và phân tích cực kỳ nhanh để định vị lỗi hiệu năng của thuật toán cũ.
[C]
Trì hoãn sự kiện của doanh nghiệp để tự nghiên cứu tài liệu tối ưu lại từ đầu.
[EXP]
Sai. Cách làm này gây thiệt hại cho doanh nghiệp và thể hiện sự thụ động trong việc ứng dụng công nghệ.
[D]
Yêu cầu AI viết lại toàn bộ module hệ thống bằng một ngôn ngữ lập trình khác.
[EXP]
Sai. Việc dịch chuyển toàn bộ ngôn ngữ lập trình trong thời gian ngắn là bất khả thi và không giải quyết được sự cố nghẽn tại chỗ.

@correct: B
@point: 20

## Q8
Phân tích đoạn code Java Stream sau:

```java
products.stream()
        .filter(p -> p.getPrice() < 100)
        .map(Product::getName)
        .collect(Collectors.toList());
```

Chức năng chính của đoạn pipeline này là gì?

[A]
Sắp xếp các sản phẩm có giá dưới 100 theo thứ tự tăng dần của giá tiền.
[EXP]
Sai. Hàm không chứa phương thức sắp xếp như `sorted()`.
[B]
Xóa bỏ hoàn toàn các sản phẩm có giá từ 100 trở lên khỏi cơ sở dữ liệu.
[EXP]
Sai. Hàm chỉ thực hiện lọc dữ liệu trên luồng nhớ, không thực hiện hành động xóa ở cơ sở dữ liệu.
[C]
Lọc ra danh sách tên của các sản phẩm trong mảng có giá nhỏ hơn 100.
[EXP]
Đúng. `filter` lọc các sản phẩm có giá nhỏ hơn 100, `map` chuyển đổi sản phẩm sang tên của sản phẩm, và `collect` gom lại thành một danh sách.
[D]
Tính toán tổng số lượng sản phẩm có giá rẻ trong kho của doanh nghiệp.
[EXP]
Sai. Hàm trả về một danh sách các chuỗi (tên sản phẩm), không trả về một số đếm tổng lượng sản phẩm.

@correct: C
@point: 20

## Q9
So với vòng lặp `for` truyền thống, ưu điểm nổi bật nhất của Java Stream API khi thực hiện lọc dữ liệu là gì?

[A]
Stream API giúp code chạy nhanh hơn vòng lặp for trên các mảng rất nhỏ.
[EXP]
Sai. Với mảng cực nhỏ, vòng lặp for thủ công có thể nhanh hơn hoặc tương đương do không mất chi phí khởi tạo Stream.
[B]
Tự động sửa chữa các lỗi sai cú pháp do lập trình viên viết chưa chuẩn.
[EXP]
Sai. Stream API không thể tự động sửa lỗi cú pháp, chương trình vẫn sẽ bị lỗi biên dịch nếu viết sai.
[C]
Không tiêu tốn bộ nhớ RAM của máy chủ khi thực hiện duyệt tập dữ liệu lớn.
[EXP]
Sai. Stream API vẫn tiêu tốn tài nguyên bộ nhớ RAM để quản lý và vận hành luồng dữ liệu.
[D]
Giúp mã nguồn ngắn gọn, mang tính khai báo rõ ràng và dễ xử lý song song.
[EXP]
Đúng. Sử dụng Stream API giúp code tường minh hơn, viết theo phong cách khai báo (declarative) và dễ nâng cấp sang xử lý song song bằng `parallelStream()`.

@correct: D
@point: 20

## Q10
Trong bài toán tối ưu hóa thuật toán lọc sản phẩm, việc chuyển đổi thuật toán từ sử dụng vòng lặp duyệt mảng lặp thủ công sang cấu trúc Stream API được tối ưu giúp mang lại lợi ích gì cho hệ thống doanh nghiệp khi lượng dữ liệu cực lớn?

[A]
Tốc độ xử lý của máy chủ không đổi vì xung nhịp của CPU là cố định.
[EXP]
Sai. Tốc độ xử lý (thời gian phản hồi) phụ thuộc trực tiếp vào số phép toán thuật toán thực hiện trên CPU, thuật toán tối ưu sẽ chạy nhanh hơn.
[B]
Tốc độ xử lý tăng đáng kể và giảm thiểu rủi ro quá tải tài nguyên máy chủ.
[EXP]
Đúng. Việc tối ưu hóa mã nguồn giúp giảm số lượng phép toán thừa, giúp máy chủ phản hồi nhanh hơn và tiết kiệm CPU.
[C]
Máy chủ bị treo do Stream API không hỗ trợ duyệt danh sách dữ liệu lớn.
[EXP]
Sai. Stream API được thiết kế để hỗ trợ xử lý dữ liệu lớn một cách hiệu quả và an toàn.
[D]
Chương trình báo lỗi biên dịch do không thể chuyển đổi kiểu dữ liệu mảng.
[EXP]
Sai. Việc chuyển đổi từ Collection sang Stream hoàn toàn hợp lệ và được Java hỗ trợ mặc định.

@correct: B
@point: 20
