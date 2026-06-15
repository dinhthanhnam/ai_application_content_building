# Session 02: Lợi ích, hạn chế và trách nhiệm khi sử dụng AI

## Lesson 04: Hạn chế, rủi ro bảo mật và trách nhiệm khi sử dụng AI

### 1. Mục tiêu học tập

Sau bài học này, bạn có thể:
* Nhận diện được những hạn chế cốt lõi của các công cụ AI hiện nay, đặc biệt là hiện tượng ảo giác (Hallucination) trong sinh mã.
* Đánh giá và nhận thức sâu sắc các rủi ro bảo mật tiềm ẩn khi chia sẻ dữ liệu và mã nguồn doanh nghiệp cho các mô hình AI.
* Thực hành đúng trách nhiệm đạo đức, nghề nghiệp của một kỹ sư lập trình (AI-Assisted Developer) trong việc kiểm duyệt mã nguồn do AI tạo ra.

---

### 2. Đặt vấn đề thực tế

Vào đêm trước ngày phát hành (Go-live) hệ thống giao dịch của một công ty công nghệ, một kỹ sư trẻ do áp lực tiến độ đã sao chép toàn bộ tệp cấu hình kết nối cơ sở dữ liệu (`DatabaseConfig.java` - chứa cả chuỗi kết nối, tên đăng nhập và mật khẩu thật của môi trường Production) dán lên một công cụ AI Chat trên Web để nhờ tìm ra lỗi kết nối. 

Dù AI đã chỉ ra lỗi cú pháp thành công, nhưng chỉ vài ngày sau, máy chủ cơ sở dữ liệu của công ty bị tấn công và đánh cắp dữ liệu từ bên ngoài. Nguyên nhân được xác định là thông tin đăng nhập nhạy cảm đã bị lưu lại vào bộ nhớ của mô hình AI học máy công cộng, sau đó vô tình bị tiết lộ thông qua các cuộc hội thoại của những người dùng khác. 

Công ty đứng trước nguy cơ tổn thất hàng triệu đô la và khủng hoảng truyền thông, trong khi kỹ sư đó phải đối mặt với trách nhiệm pháp lý nặng nề. Việc ứng dụng AI mang lại tốc độ siêu việt, nhưng nếu thiếu đi ý thức bảo mật và sự thấu hiểu về giới hạn của AI, kỹ sư có thể vô tình tạo ra những thảm họa khôn lường cho doanh nghiệp.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A dramatic split-screen digital illustration. On the top half, a programmer carelessly copy-pasting code containing golden "API Keys" into a glowing, mysterious AI web portal. On the bottom half, a red alarm flashing in a corporate server room with hackers accessing the data. Theme of cybersecurity risk and AI. Corporate cyberpunk style, high contrast, 8k resolution.

---

### 3. Kiến thức cốt lõi

Bên cạnh những lợi ích to lớn, việc sử dụng AI trong vòng đời phát triển phần mềm đi kèm với 3 khía cạnh rủi ro bắt buộc kỹ sư phải quản trị được:

#### A. Hạn chế về tính chính xác: Hiện tượng Ảo giác (Hallucination)
* **Định nghĩa:** AI đưa ra những câu trả lời nghe có vẻ cực kỳ logic, tự tin, đúng ngữ pháp nhưng thực chất lại hoàn toàn sai lệch hoặc không tồn tại.
* **Biểu hiện trong lập trình:** AI có thể tự bịa ra một hàm trong Java, gọi một lớp đối tượng không hề tồn tại trong bộ thư viện chuẩn (JDK), hoặc sử dụng một gói phần mềm (dependency) chưa từng được phát hành trên Maven.
* **Cách phòng tránh:** Tuyệt đối không sao chép - dán (copy-paste) mã nguồn một cách mù quáng. Luôn kiểm tra tài liệu chính thức (Official Documentation) để xác minh xem các hàm do AI gọi có thực sự tồn tại hay không.

#### B. Rủi ro về rò rỉ dữ liệu và bảo mật (Data Privacy & Security)
* **Nguyên lý:** Hầu hết các phiên bản AI miễn phí chạy trên trình duyệt web đều có điều khoản sử dụng (Terms of Service) cho phép họ dùng đoạn hội thoại của bạn làm dữ liệu huấn luyện (Training data) cho các mô hình tương lai.
* **Biểu hiện rủi ro:** Lập trình viên vô tình gửi mã nguồn bí mật của công ty, Khóa kết nối (API Key), Mật khẩu (Password), hoặc Dữ liệu cá nhân của người dùng (PII) lên khung chat.
* **Cách phòng tránh:** Che giấu hoặc xóa bỏ mọi thông tin nhạy cảm trước khi cung cấp ngữ cảnh cho AI. Ưu tiên sử dụng các dịch vụ Code Assistant nội bộ dành cho doanh nghiệp (Enterprise version) có cam kết không sử dụng dữ liệu để huấn luyện.

#### C. Trách nhiệm giải trình của kỹ sư (Accountability)
* **Nguyên lý:** AI chỉ đóng vai trò tư vấn và hỗ trợ thao tác, **không có tư cách pháp nhân**. Người nhấn nút Gộp mã (Merge code) và Triển khai (Deploy) là con người. Do đó, kỹ sư là người phải chịu trách nhiệm 100% về chất lượng, tính năng và hậu quả của đoạn mã đó.
* **Thay đổi tư duy:** Trách nhiệm chính của lập trình viên chuyển từ việc "Gõ mã nguồn" sang việc làm "Người gác cổng" (Gatekeeper) - sử dụng tư duy phản biện để đánh giá rủi ro trước khi chấp nhận mã do AI sinh ra.

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric illustration of a software engineer acting as a "Gatekeeper". The engineer stands confidently in front of a giant digital vault representing the corporate codebase. A glowing AI assistant hands them blocks of code, and the engineer is examining the blocks through a magnifying glass that highlights security risks and errors before placing them in the vault. Clean tech aesthetic, neon blue and caution yellow.

---

### 4. Phân tích tình huống thực tế

#### Bối cảnh
Tại công ty thương mại điện tử mua sắm trực tuyến, bạn được giao nhiệm vụ viết hàm lấy dữ liệu thời tiết dựa vào vĩ độ/kinh độ của khách hàng (để gợi ý trang phục mùa đông) thông qua một dịch vụ API bên thứ ba.

#### Thách thức
Khi bạn yêu cầu AI sinh mã nguồn bằng Java, AI cung cấp một đoạn mã chạy hoàn hảo. Tuy nhiên, khi kiểm tra kỹ, bạn nhận thấy AI đã khởi tạo một chuỗi mã xác thực (Token Key) ngay bên trong tệp `WeatherService.java`. Thêm vào đó, AI đã gọi hàm `WeatherClient.getInstantTemp()` - một hàm bịa đặt không có trong tài liệu của nhà cung cấp.

#### Cách tiếp cận của một kỹ sư có trách nhiệm
Thay vì sao chép toàn bộ, kỹ sư thực hiện "Zero Trust" (Không tin tưởng tuyệt đối):
1. **Lọc thông tin nhạy cảm:** Chuyển mã xác thực tĩnh thành lệnh đọc biến môi trường để đảm bảo không rò rỉ API Key lên kho lưu trữ mã nguồn (Git).
2. **Kiểm tra chéo (Cross-check):** Vào trang tài liệu của đối tác và nhận ra hàm đúng phải là `WeatherClient.getCurrentTemperature()`.
3. **Chỉnh sửa và kiểm thử:** Viết lại lời gọi hàm cho đúng chuẩn và tự chạy thử trên máy cá nhân trước khi đưa vào hệ thống chính.

#### Kết quả
Đoạn mã được tối ưu với tốc độ nhanh của AI nhưng vẫn đảm bảo tính chính xác và không có một lỗ hổng bảo mật nào được đưa vào nền tảng mua sắm của công ty.

---

### 5. Demo minh họa

**Mục tiêu demo:** Minh họa sự nguy hiểm của lỗi gán tĩnh (Hardcode) và Ảo giác AI (Hallucination) khi sử dụng các mô hình không được kiểm duyệt, và cách sửa chữa theo chuẩn của kỹ sư Java.

**Đoạn mã ban đầu do AI sinh ra (Chứa Rủi ro lớn):**
```java
import com.amazonaws.services.s3.AmazonS3;

public class AWSS3Uploader {
    // ❌ RỦI RO BẢO MẬT: Khóa bí mật bị AI "gán tĩnh" ngay trong mã nguồn
    private String awsAccessKey = "AKIAIOSFODNN7EXAMPLE";
    private String awsSecretKey = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";
    
    public void uploadFile(String bucketName, java.io.File file) {
        // ❌ HALLUCINATION: AI tự bịa ra phương thức 'fastUploadDirectly' không tồn tại trong AWS SDK
        AmazonS3 s3Client = new AmazonS3(awsAccessKey, awsSecretKey);
        s3Client.fastUploadDirectly(bucketName, file); 
    }
}
```

**Cách kỹ sư có trách nhiệm chỉnh sửa lại mã nguồn:**
```java
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class AWSS3Uploader {
    
    public void uploadFile(String bucketName, java.io.File file) {
        // ✅ BẢO MẬT: Sử dụng biến môi trường hoặc IAM Role (AmazonS3ClientBuilder mặc định tự tìm cấu hình an toàn)
        // Tuyệt đối không lưu chuỗi bí mật vào mã nguồn
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard().build();
        
        // ✅ CHÍNH XÁC: Sử dụng đúng API chuẩn của AWS SDK sau khi đã đối chiếu tài liệu
        s3Client.putObject(bucketName, file.getName(), file);
    }
}
```
*👉 Đánh giá:* Sự can thiệp của kỹ sư đã biến một đoạn mã rác, mang mầm mống thảm họa bảo mật thành một đoạn mã sạch, chuẩn kiến trúc (Best Practice) và an toàn tuyệt đối.

---

### 6. Tổng kết

* Trí tuệ nhân tạo (AI) là một trợ thủ đắc lực, nhưng tuyệt đối không phải là người chịu trách nhiệm thay thế cho lập trình viên.
* **Nguyên tắc "3 Không" khi dùng AI:** 
  1. Không đưa thông tin nhạy cảm/API Key lên công cụ AI công cộng.
  2. Không tin tưởng 100% logic mã nguồn do AI tạo ra (Đề phòng Hallucination).
  3. Không đẩy mã nguồn (Commit) khi chưa tự mình đọc hiểu từng dòng lệnh.
* Hãy luôn giữ vững vai trò "Người gác cổng" (Gatekeeper) để bảo vệ sự an toàn, bảo mật và uy tín của dự án.

---

### 7. Câu hỏi đánh giá

## Câu 1 (Đánh giá khả năng ghi nhớ)
**Câu hỏi:** Hiện tượng "Hallucination" (Ảo giác) của AI trong bối cảnh phát triển phần mềm là gì? Hãy đưa ra một ví dụ minh họa về hiện tượng này đối với ngôn ngữ lập trình Java.

**Câu trả lời tham khảo:**
* **Hallucination (Ảo giác AI):** Là hiện tượng trí tuệ nhân tạo đưa ra các thông tin, đoạn mã nguồn, thư viện hoặc logic trông có vẻ cực kỳ hợp lý, thuyết phục và đúng ngữ pháp chuẩn, nhưng trên thực tế lại hoàn toàn sai sự thật, bịa đặt hoặc không hề tồn tại.
* **Ví dụ minh họa trong Java:** Khi người dùng yêu cầu AI viết một hàm trích xuất văn bản từ tệp PDF, AI có thể tự động sinh ra một đoạn mã gọi thư viện `import java.util.pdf.PDFExtractor;` và sử dụng hàm `PDFExtractor.readText()`. Tuy nhiên, trong bộ thư viện chuẩn của Java (JDK) hoàn toàn không tồn tại gói `java.util.pdf`. Nếu kỹ sư sao chép đoạn mã này vào dự án, trình biên dịch sẽ báo lỗi ngay lập tức vì thiếu thư viện.

## Câu 2 (Đánh giá khả năng đọc hiểu & phân tích)
**Câu hỏi:** Tại sao việc chia sẻ các tệp tin cấu hình dự án (ví dụ: `application.properties`, `DatabaseConfig.java`) hoặc các đoạn mã chứa logic cốt lõi của doanh nghiệp lên khung chat của các mô hình AI Web công cộng (như ChatGPT bản miễn phí) lại bị xem là một lỗi vi phạm bảo mật nghiêm trọng?

**Câu trả lời tham khảo:**
Hành động này bị xem là vi phạm bảo mật nghiêm trọng vì những lý do sau:
1. **Rò rỉ thông tin nhạy cảm:** Các tệp tin cấu hình thường chứa các Mật khẩu (Password), Khóa bí mật (API Keys/Secret Keys) và thông tin đăng nhập máy chủ. Việc đưa các thông tin này lên mạng đồng nghĩa với việc doanh nghiệp mở toang cánh cửa cho tin tặc xâm nhập vào cơ sở dữ liệu thực.
2. **Nguy cơ từ quy trình huấn luyện của AI:** Hầu hết các phiên bản AI công cộng có chính sách thu thập đoạn hội thoại của người dùng làm dữ liệu đầu vào (Training Data) để huấn luyện mô hình thế hệ tiếp theo. Do đó, các khóa bí mật hoặc thuật toán độc quyền của công ty bạn có thể vô tình bị ghi nhớ và sau đó hiển thị trong câu trả lời cho một người dùng khác (thậm chí là đối thủ cạnh tranh) ở bất kỳ đâu trên thế giới.
3. **Trách nhiệm pháp lý:** Việc làm lộ dữ liệu cá nhân khách hàng (PII) hoặc tài sản trí tuệ thông qua AI vi phạm nghiêm trọng các tiêu chuẩn bảo mật toàn cầu (như ISO 27001, GDPR), gây thiệt hại lớn về kinh tế và danh tiếng của doanh nghiệp.

## Câu 3 (Tình huống thực chiến)
**Câu hỏi:** Đứng trước một đoạn mã dài hơn 100 dòng do AI sinh ra (nhằm xử lý tính toán lãi suất thanh toán ngân hàng), hãy nêu quy trình thực tiễn gồm 3 bước bạn sẽ thực hiện để đảm bảo tính trách nhiệm và bảo mật của một "Người gác cổng" (Gatekeeper) trước khi đẩy đoạn mã này vào dự án chính thức.

**Câu trả lời tham khảo:**
Là một người gác cổng, trước khi gộp (Merge) một đoạn mã nhạy cảm do AI sinh ra vào dự án chính, tôi sẽ thực hiện nghiêm ngặt quy trình 3 bước sau:
1. **Bước 1 (Rà soát Bảo mật & Lọc thông tin nhạy cảm):** Tôi sẽ đọc lướt qua toàn bộ đoạn mã để đảm bảo AI không tự ý gán tĩnh (hardcode) bất kỳ thông tin nhạy cảm nào (như khóa mã hóa, thông tin khách hàng giả định dễ gây hiểu nhầm). Đảm bảo mọi lời gọi API đều lấy cấu hình qua các biến môi trường thay vì nằm trần trụi trong mã nguồn.
2. **Bước 2 (Kiểm chứng tính hợp lệ - Chống Hallucination):** Do đoạn mã xử lý nghiệp vụ ngân hàng (cần độ chính xác tuyệt đối), tôi sẽ kiểm tra thủ công xem các thư viện toán học và cấu trúc dữ liệu AI sử dụng (ví dụ như `BigDecimal` trong Java thay vì `double` để tránh sai số thập phân) có chuẩn xác hay không. Nếu phát hiện các hàm chưa từng thấy, tôi sẽ tra cứu tài liệu Java chính thức để xác nhận chúng thực sự tồn tại và được khuyến nghị sử dụng.
3. **Bước 3 (Kiểm thử tự động & Đánh giá logic):** Tôi sẽ không bao giờ tin tưởng logic tính lãi suất chỉ bằng mắt thường. Tôi sẽ tự viết (hoặc dùng chính AI sinh ra) một bộ kịch bản kiểm thử đơn vị (Unit Tests) để chạy thử đoạn mã với các giá trị biên, giá trị âm, và giá trị bằng 0. Chỉ khi đoạn mã vượt qua 100% các bài kiểm tra này, tôi mới chính thức xác nhận và đưa mã vào hệ thống (Commit).
