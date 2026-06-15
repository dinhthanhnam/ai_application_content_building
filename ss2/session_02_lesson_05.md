# Session 02: Lợi ích, hạn chế và trách nhiệm khi sử dụng AI

## Lesson 05: Trách nhiệm của người học và cách kiểm chứng đầu ra từ AI

### 1. Mục tiêu học tập

Sau bài học này, bạn có thể:
* Nhận thức rõ ràng trách nhiệm học thuật và đạo đức của người học khi sử dụng các công cụ AI trong học tập và lập trình.
* Áp dụng các phương pháp thực tiễn để kiểm chứng, xác thực và đánh giá độ chính xác của mã nguồn do AI sinh ra.
* Xây dựng tư duy "Học từ AI" (Learn from AI) thay vì "Phụ thuộc mù quáng vào AI" (Rely blindy on AI).

---

### 2. Đặt vấn đề thực tế

Trong kỳ thi bảo vệ bài tập lớn môn Lập trình Java, một sinh viên năm 2 đã trình bày ứng dụng "Quản lý Thư viện". Ứng dụng chạy rất mượt mà trên máy chiếu. Tuy nhiên, khi giảng viên yêu cầu sinh viên giải thích luồng xử lý của đối tượng `PreparedStatement` trong tệp `DatabaseConnection.java`, sinh viên hoàn toàn ấp úng và không hiểu ý nghĩa của các dòng lệnh. 

Sau đó, giảng viên nhập thử một dữ liệu biên (nhập ngày trả sách trước ngày mượn sách) vào hệ thống. Ứng dụng lập tức bị sập (Crash) với lỗi `NullPointerException` chưa được xử lý. Sinh viên thú nhận rằng do sát hạn nộp bài, bạn đã copy toàn bộ yêu cầu đưa cho ChatGPT và dán mã nguồn trả về thẳng vào dự án mà không hề đọc hiểu hay chạy thử. 

Sự phụ thuộc mù quáng vào AI không chỉ tước đi cơ hội rèn luyện tư duy logic của sinh viên mà còn vi phạm nghiêm trọng tính liêm chính học thuật. Trong môi trường doanh nghiệp thực tế, hành động tương tự có thể đánh sập cả một hệ thống lớn. Vậy làm thế nào để chúng ta coi AI là một "gia sư" thay vì một "người làm thuê"?

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A split-screen illustration showing two types of students. On the left, a stressed student mindlessly copying glowing code from an AI interface directly into an assignment folder without looking at it, with a "Failing Grade" stamp floating above. On the right, a focused student using a magnifying glass to examine the AI's code, taking notes, and stepping through a debugger, with an "A+" stamp. Bright academic tech style, colorful, 8k resolution.

---

### 3. Kiến thức cốt lõi

Để sử dụng AI một cách bền vững, người học cần nắm vững hai khía cạnh cốt lõi: Trách nhiệm học thuật và Phương pháp kiểm chứng.

#### A. Trách nhiệm của người học (Academic Responsibility)
* **Giữ vững Liêm chính học thuật (Academic Integrity):** Việc sử dụng AI để sinh mã hoàn chỉnh nộp bài thay cho nỗ lực cá nhân là hành vi đạo văn (Plagiarism). Trách nhiệm của người học là sử dụng AI như một công cụ hỗ trợ để vượt qua rào cản kỹ thuật, không phải công cụ làm bài hộ.
* **Nguyên tắc làm chủ kiến thức:** Bạn là người chịu trách nhiệm cuối cùng về mọi dòng mã được nộp lên (hoặc gộp vào dự án). **Nếu bạn không thể giải thích được đoạn mã, đoạn mã đó không thuộc về bạn.**

#### B. Các phương pháp kiểm chứng đầu ra từ AI (Verifying AI Output)
AI có thể bị ảo giác (Hallucination) hoặc sử dụng các thư viện lỗi thời. Dưới đây là 3 phương pháp kiểm chứng bắt buộc:
1. **Kiểm tra chéo với tài liệu chính thức (Cross-referencing):** Khi AI cung cấp một hàm mới, hãy tra cứu ngay tài liệu chính thức của ngôn ngữ (VD: Java API Documentation) để đảm bảo hàm đó tồn tại và đang không bị đánh dấu là lỗi thời (Deprecated).
2. **Kiểm thử hộp trắng qua Debug (Dry-run & Debugging):** Đặt các điểm dừng (Breakpoints) trong môi trường phát triển (IDE). Chạy từng dòng lệnh (Step-over) để quan sát sự thay đổi của biến số, qua đó hiểu rõ logic bên trong.
3. **Viết kịch bản kiểm thử (Unit Testing):** Chủ động thiết kế các trường hợp kiểm thử cho mã của AI, đặc biệt chú ý đến các giá trị biên (Edge cases) như chuỗi rỗng, giá trị null, hoặc số âm.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric diagram showing a 3-step verification process for AI code. Step 1: A book icon representing Official Documentation check. Step 2: A glowing bug icon with a magnifying glass representing Debugging. Step 3: A checklist board with green checkmarks representing Unit Testing. Neon blue and orange tech style, clear and educational.

---

### 4. Phân tích tình huống thực tế

#### Bối cảnh
Bạn cần viết hàm `calculateLateFee` để tính tiền phạt cho sinh viên trả sách trễ hạn (Mỗi ngày trễ phạt 5000 VNĐ).

#### Thách thức
Khi bạn yêu cầu AI sinh mã, AI viết một đoạn mã dài sử dụng đối tượng `java.util.Date` và thư viện `SimpleDateFormat` để thực hiện phép trừ toán học trên milliseconds (mili-giây), sau đó chia cho số mili-giây của một ngày. Đoạn mã trông có vẻ rối rắm và khó hiểu đối với người mới học.

#### Cách tiếp cận kiểm chứng của sinh viên có trách nhiệm
Thay vì sao chép ngay, sinh viên thực hiện kiểm chứng:
1. **Tra cứu tài liệu:** Sinh viên tra cứu trên mạng và biết được rằng từ Java 8, gói `java.time` (như `LocalDate`) đã được ra mắt để xử lý ngày tháng trực quan và chính xác hơn rất nhiều so với thư viện cũ `java.util.Date`.
2. **Yêu cầu AI điều chỉnh:** Sinh viên đặt lại Prompt: *"Đoạn mã này dùng thư viện Date cũ. Hãy viết lại bằng LocalDate của Java 8 và làm cho logic tính số ngày trễ ngắn gọn hơn"*.
3. **Kiểm thử logic:** Sau khi nhận mã mới, sinh viên tự tạo hàm `main` để gọi thử hàm với ngày mượn là "15/10" và ngày trả là "20/10", kiểm tra xem tiền phạt có in ra đúng "25000" hay không.

#### Kết quả
Sinh viên không chỉ hoàn thành được bài toán mà còn học thêm được kiến thức mới về Java 8 `LocalDate`, làm chủ hoàn toàn đoạn mã mình đưa vào đồ án.

---

### 5. Demo minh họa

**Mục tiêu demo:** Hướng dẫn quá trình nhận diện mã do AI sinh ra sử dụng thư viện cũ và các bước kiểm chứng, tối ưu mã.

**Lần 1: Mã gốc AI sinh ra (Thư viện cũ, logic thủ công dễ sai số)**
```java
import java.util.Date;

public class LibrarySystem {
    // ❌ HẠN CHẾ: Dùng thư viện cũ, tính toán mili-giây thủ công không quan tâm năm nhuận, giờ mùa hè
    public double calculateLateFee(Date dueDate, Date returnDate) {
        long diffInMillies = returnDate.getTime() - dueDate.getTime();
        long diffInDays = diffInMillies / (1000 * 60 * 60 * 24); 
        
        if (diffInDays > 0) {
            return diffInDays * 5000.0;
        }
        return 0.0;
    }
}
```

**Lần 2: Mã sau khi người học kiểm chứng, ép AI sửa lại bằng kiến thức chuẩn**
```java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibrarySystem {
    // ✅ CHUẨN XÁC: Sử dụng thư viện Java 8+ hiện đại, logic rõ ràng, dễ bảo trì
    public double calculateLateFee(LocalDate dueDate, LocalDate returnDate) {
        if (returnDate.isAfter(dueDate)) {
            long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
            return daysLate * 5000.0;
        }
        return 0.0; // Trả đúng hạn hoặc trước hạn
    }
}
```
**Quy trình kiểm thử đơn giản tại hàm main (Sinh viên tự viết):**
```java
public static void main(String[] args) {
    LibrarySystem system = new LibrarySystem();
    LocalDate due = LocalDate.of(2023, 10, 15);
    LocalDate returned = LocalDate.of(2023, 10, 20);
    
    // Kiểm chứng kết quả (Phải in ra 25000.0)
    System.out.println("Tiền phạt: " + system.calculateLateFee(due, returned)); 
}
```

---

### 6. Tổng kết

* AI là người dẫn đường, nhưng chính bạn mới là người phải đi trên con đường đó. Nếu bạn để AI làm thay toàn bộ đồ án, thứ bạn nhận được chỉ là điểm số ảo, còn năng lực cốt lõi sẽ dần thui chột.
* Quy trình làm việc lý tưởng của người học trong thời đại AI: **Yêu cầu AI $\rightarrow$ Đọc hiểu $\rightarrow$ Phản biện/Kiểm chứng $\rightarrow$ Tinh chỉnh $\rightarrow$ Áp dụng.**
* Nếu bạn không thể tự tin đứng trước bản vẽ kiến trúc hoặc mã nguồn của mình để giải thích cặn kẽ cho người khác, bạn chưa hề hoàn thành nhiệm vụ học tập.

---

### 7. Câu hỏi đánh giá

## Câu 1 (Đánh giá khả năng ghi nhớ)
**Câu hỏi:** Hãy nêu ít nhất 3 phương pháp cơ bản nhất để người học kiểm chứng một đoạn mã nguồn do AI tạo ra trước khi chính thức đưa vào đồ án môn học.

**Câu trả lời tham khảo:**
Để đảm bảo đoạn mã do AI sinh ra là chính xác và an toàn, người học cần áp dụng 3 phương pháp kiểm chứng sau:
1. **Tra cứu tài liệu chính thức (Cross-referencing):** Đối chiếu các hàm và thư viện AI sử dụng với tài liệu gốc (VD: Java API Docs) để đảm bảo hàm đó tồn tại, không bị lỗi thời (deprecated) và hoạt động đúng như tài liệu mô tả.
2. **Kiểm tra trực quan và đặt điểm dừng (Debugging):** Sử dụng các công cụ Debug trong IDE để chạy thử mã từng bước (Step-by-step). Qua đó, người học quan sát được giá trị biến thay đổi qua từng dòng lệnh để hiểu luồng thực thi.
3. **Viết kịch bản kiểm thử (Unit Testing):** Người học tự mình viết các đoạn mã chạy thử (test cases) với nhiều đầu vào khác nhau (như giá trị đúng, sai, giá trị null, giá trị cực lớn) để xem đoạn mã của AI có chịu được lỗi hay sẽ làm sập chương trình.

## Câu 2 (Đánh giá khả năng đọc hiểu & phân tích)
**Câu hỏi:** Tại sao đối với người đang học lập trình, việc "hiểu rõ cách đoạn mã hoạt động" lại có tầm quan trọng lớn hơn nhiều so với việc "đoạn mã đó chạy ra đúng kết quả ngay lập tức"?

**Câu trả lời tham khảo:**
Hiểu rõ bản chất của đoạn mã quan trọng hơn kết quả tức thời vì những lý do sau:
* **Xây dựng nền tảng tư duy:** Học lập trình không chỉ là học cách giải quyết một bài toán cụ thể, mà là học cách tư duy logic. Nếu chỉ sao chép để ra kết quả, người học sẽ mất đi cơ hội rèn luyện khả năng phân tích hệ thống.
* **Xử lý sự cố (Troubleshooting):** Mã do AI sinh ra có thể chạy đúng trong điều kiện hoàn hảo, nhưng khi tích hợp vào dự án lớn, nó có thể xung đột và gây lỗi. Nếu không hiểu đoạn mã hoạt động ra sao, kỹ sư sẽ hoàn toàn bất lực và không biết bắt đầu sửa lỗi từ đâu khi hệ thống thực tế gặp sự cố.
* **Yêu cầu của môi trường doanh nghiệp:** Doanh nghiệp không trả lương cho bạn để "copy mã từ ChatGPT". Họ trả lương để bạn trở thành chuyên gia bảo trì hệ thống, có khả năng tối ưu hóa, đảm bảo tính bảo mật và chịu trách nhiệm cho các sản phẩm công nghệ. Nếu không hiểu mã, bạn không thể cam kết chất lượng.

## Câu 3 (Tình huống thực chiến)
**Câu hỏi:** Khi thực hiện bài tập lớn bằng Java, bạn nhờ AI sinh ra một đoạn mã kết nối với cơ sở dữ liệu MySQL. Bạn nhận thấy đoạn mã sử dụng lớp `Class.forName("com.mysql.jdbc.Driver")` - một cú pháp đã rất cũ và không còn bắt buộc trong các phiên bản Java mới. Là một người học có trách nhiệm, bạn sẽ làm gì tiếp theo thay vì sao chép thẳng vào bài nộp?

**Câu trả lời tham khảo:**
Là một người học có trách nhiệm và tuân thủ nguyên tắc kiểm chứng, tôi sẽ thực hiện các bước sau:
1. **Kiểm chứng thông tin:** Tôi sẽ lên trang tài liệu chính thức của MySQL Connector/J hoặc diễn đàn lập trình (như StackOverflow) để tìm hiểu lý do tại sao cú pháp này lại lỗi thời. Qua tra cứu, tôi hiểu được rằng từ JDBC 4.0, Java đã tự động nạp Driver, việc gọi `Class.forName` là dư thừa.
2. **Học hỏi và Phản biện AI:** Tôi sẽ nhập một đoạn Prompt mới phản hồi lại AI: *"Cú pháp Class.forName đã cũ từ JDBC 4.0. Hãy cập nhật lại đoạn mã kết nối bằng thư viện mới nhất mà không cần dòng lệnh này"*.
3. **Đánh giá và Áp dụng:** Sau khi AI trả về mã mới gọn gàng và chuẩn xác hơn (thường dùng `DriverManager.getConnection()`), tôi sẽ đặt đoạn mã vào trong khối `try-with-resources` để tự động đóng kết nối (đảm bảo chống rò rỉ bộ nhớ), sau đó tiến hành biên dịch thử. Lúc này, tôi mới chính thức đưa mã vào dự án vì tôi đã hiểu và làm chủ 100% logic của nó.
