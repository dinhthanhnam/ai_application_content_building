# Session 01: Định hướng môn học AI Application in Action

## Lesson 01: Tổng quan môn học và định hướng học tập đầu môn học

## 1. Mục tiêu học tập
Sau khi hoàn thành bài học này, bạn sẽ có khả năng:
* Hiểu rõ cấu trúc tổng quan của môn học, các mốc đánh giá quan trọng và kỳ vọng đầu ra của chương trình đào tạo.
* Phân tích được sự dịch chuyển vai trò của nhân sự phát triển phần mềm trong kỷ nguyên trí tuệ nhân tạo (AI-Assisted Development).
* Định hình được phương pháp và lộ trình học tập tối ưu, kết hợp hài hòa giữa tư duy lập trình nền tảng và sức mạnh của công cụ AI.
* Áp dụng tư duy "Định hướng và Kiểm soát" khi giao tiếp và nghiệm thu kết quả từ các trợ lý AI để giải quyết các bài toán nghiệp vụ.

---

## 2. Đặt vấn đề thực tế
Trong môi trường doanh nghiệp hiện đại, tốc độ thay đổi công nghệ diễn ra vô cùng nhanh chóng. Khi gia nhập một dự án mới hoặc tiếp nhận một hệ thống phần mềm sẵn có (Legacy System), nhân sự thường phải đối mặt với một lượng thông tin khổng lồ bao gồm hàng nghìn dòng mã nguồn phức tạp, tài liệu nghiệp vụ rời rạc và các quy trình vận hành chưa được chuẩn hóa.

Nếu tiếp cận theo phương pháp học tập và làm việc truyền thống, bạn sẽ phải tự đọc hiểu từng dòng code, thủ công tra cứu tài liệu kỹ thuật trên các công cụ tìm kiếm, và tự xây dựng các phương án kiểm thử từ đầu. Quy trình này đòi hỏi rất nhiều thời gian, dễ gây quá tải thông tin và làm giảm khả năng thích ứng nhanh với tiến độ dự án của doanh nghiệp.

Để giải quyết thách thức này, việc ứng dụng trí tuệ nhân tạo hỗ trợ lập trình (AI-Assisted Development) không còn là một lựa chọn công nghệ, mà đã trở thành một kỹ năng sinh tồn bắt buộc. Việc làm chủ AI giúp người học tăng tốc độ đọc hiểu hệ thống, nhanh chóng nắm bắt luồng nghiệp vụ và tập trung nguồn lực vào việc tối ưu hóa giải pháp thay vì tiêu tốn thời gian cho các tác vụ lặp lại thủ công.

---

## 3. Kiến thức cốt lõi

### Khái niệm AI Application in Action
Môn học này tập trung vào phương pháp luận và kỹ năng thực hành để tích hợp các mô hình ngôn ngữ lớn (LLM), trợ lý lập trình (Code Assistant) và các tác tử AI (AI Agent) vào quy trình phân tích, xây dựng và tối ưu hóa phần mềm. Trọng tâm của môn học không chỉ dừng lại ở việc sinh mã nguồn tự động, mà là cách lập trình viên tương tác với AI để giải quyết các bài toán nghiệp vụ thực tế trong doanh nghiệp.

### Sự dịch chuyển vai trò của nhân sự phát triển phần mềm
Trong mô hình phát triển phần mềm truyền thống, lập trình viên dành phần lớn thời gian cho việc viết cú pháp và kiểm tra lỗi biên dịch. Khi có sự hỗ trợ của AI, vai trò này dịch chuyển mạnh mẽ sang việc định hướng kiến trúc và kiểm chứng chất lượng đầu ra.

```text
Sơ đồ minh họa sự dịch chuyển vai trò:

[Truyền thống]                                [Hiện đại (AI-Assisted)]
┌───────────────────────────┐                 ┌───────────────────────────┐
│  70% Viết code & Cú pháp   │                 │  70% Đặt Prompt & Kiểm    │
│  (Gõ boilerplate, fix lặt   ├───────────────>│  chứng logic (Verify)     │
│   vặt thủ công)           │                 │                           │
└───────────────────────────┘                 └───────────────────────────┘
┌───────────────────────────┐                 ┌───────────────────────────┐
│  30% Tư duy thiết kế &    │                 │  30% Tư duy kiến trúc &   │
│  Logic nghiệp vụ          │                 │  Giải quyết bài toán      │
└───────────────────────────┘                 └───────────────────────────┘
```

* **Mô tả hình ảnh:** Một hình ảnh minh họa sự đối lập và chuyển dịch vai trò của lập trình viên. Phía bên trái là một lập trình viên đang ngồi gõ code mệt mỏi với đống cú pháp phức tạp trên màn hình tối (phong cách truyền thống). Một mũi tên sáng rực chuyển dịch sang phía bên phải, nơi lập trình viên đang thư thái điều khiển một sơ đồ kiến trúc hệ thống hiện đại, xung quanh là các biểu tượng trí tuệ nhân tạo (AI) đang tự động hóa các tác vụ lặp lại (phong cách hiện đại).
* **Prompt gợi ý (English):** A split-screen illustration showing the evolution of a software developer. On the left side, a tired developer is manually typing lines of syntax-heavy code on a dark screen, representing the traditional workflow. A bright glowing arrow transitions to the right side, where a relaxed developer is overseeing a clean, modern system architecture diagram, with glowing holographic AI icons representing automated code generation and validation. Futuristic office background, 3D render, digital art, highly detailed.

| Tiêu chí so sánh | Quy trình làm việc truyền thống | Quy trình làm việc kết hợp AI (Augmented Workflow) |
| :--- | :--- | :--- |
| **Trọng tâm công việc** | Tự viết cú pháp chi tiết, ghi nhớ cấu trúc các thư viện và API thủ công. | Định nghĩa bài toán nghiệp vụ, thiết kế kiến trúc và kiểm soát luồng dữ liệu. |
| **Phân bổ thời gian** | Dành 70% thời gian để viết mã nguồn lặp lại (Boilerplate) và sửa lỗi cú pháp. | Dành 70% thời gian để thiết kế Prompt, phân tích logic nghiệp vụ và kiểm chứng kết quả. |
| **Giải quyết vấn đề** | Tìm kiếm giải pháp thủ công qua các diễn đàn kỹ thuật hoặc tài liệu đặc tả. | Sử dụng AI để tổng hợp các phương án tối ưu, sau đó chọn lọc và tích hợp vào dự án. |

### Lộ trình phát triển năng lực làm việc cùng AI
Hành trình học tập được thiết kế theo mô hình nâng cao năng lực thực chiến qua các giai đoạn:
1. **Giai đoạn 1 (Lý thuyết và kỹ thuật cơ bản):** Nhận thức về lợi ích, giới hạn của AI và làm chủ kỹ thuật đặt Prompt căn bản (tóm tắt, giải thích, định dạng đầu ra).
2. **Giai đoạn 2 (Kỹ thuật nâng cao):** Ứng dụng kỹ thuật Prompt suy luận (Chain-of-Thought), tái cấu trúc mã nguồn (Refactor), và tự động hóa sinh dữ liệu kiểm thử (Unit Test).
3. **Giai đoạn 3 (Thực chiến hệ thống):** Làm việc trực tiếp với các Code Assistant chuyên sâu để sinh tài liệu đặc tả yêu cầu phần mềm (SRS) và tự động hóa phát triển các module chức năng.
4. **Giai đoạn 4 (Đánh giá và hoàn thiện):** Xây dựng dự án tổng hợp, đánh giá hiệu năng và bảo mật của hệ thống dưới sự hỗ trợ của AI.

---

## 4. Phân tích tình huống thực tế

### Bối cảnh
Một công ty dịch vụ tài chính tiếp nhận một kỹ sư phần mềm mới để hỗ trợ bảo trì và phát triển tính năng cho hệ thống đối soát giao dịch doanh nghiệp. Hệ thống này được xây dựng từ nhiều năm trước với hàng trăm tệp tin mã nguồn phức tạp và không có tài liệu kỹ thuật đi kèm.

### Thách thức
Trong tuần làm việc đầu tiên, kỹ sư mới được giao nhiệm vụ khắc phục lỗi logic trong hàm tính toán thuế suất doanh nghiệp theo khu vực địa lý. Do thiếu tài liệu và không có nhân sự hướng dẫn trực tiếp, kỹ sư đối mặt với nguy cơ trễ hạn hoàn thành do mất quá nhiều thời gian đọc hiểu luồng dữ liệu.

### Cách tiếp cận
Thay vì đọc thủ công toàn bộ mã nguồn, kỹ sư này đã sử dụng trợ lý AI để thực hiện phân tích:
* Đưa các đoạn mã nguồn cốt lõi vào AI và yêu cầu giải thích luồng thực thi của hàm nghiệp vụ.
* Yêu cầu AI vẽ lại cấu trúc luồng xử lý dưới dạng sơ đồ văn bản để hiểu rõ các điều kiện biên và các nhánh rẽ nhánh của logic tính thuế.
* Nhờ AI phát hiện các biến đầu vào chưa được khởi tạo hoặc các lỗi logic tiềm ẩn trong quá trình tính toán.

### Kết quả
Chỉ sau 2 giờ làm việc với AI, kỹ sư mới đã nắm rõ toàn bộ logic của module tính thuế, xác định chính xác vị trí phát sinh lỗi logic và đề xuất phương án sửa đổi lên Tech Lead. Thời gian hoàn thành tác vụ onboarding được rút ngắn từ 5 ngày xuống còn nửa ngày, đồng thời đảm bảo chất lượng mã nguồn nhờ quy trình kiểm chứng logic chặt chẽ.

---

## 5. Demo minh họa

### Mục tiêu demo
Minh họa quy trình sử dụng AI để giải nghĩa logic nghiệp vụ của một hàm xử lý thuế phức tạp không có tài liệu hướng dẫn trong dự án doanh nghiệp.

### Điều kiện chuẩn bị
* Một đoạn mã nguồn Java thực hiện tính toán thuế suất doanh thu dựa trên doanh thu, chi phí, khu vực hoạt động và diện ưu tiên của doanh nghiệp.
* Công cụ AI hỗ trợ (ví dụ: ChatGPT, Claude hoặc Code Assistant tích hợp).

### Các bước thực hiện
1. **Bước 1:** Sao chép đoạn mã nguồn cần phân tích.
2. **Bước 2:** Soạn thảo câu lệnh (Prompt) gửi tới AI với mục tiêu yêu cầu giải thích rõ logic nghiệp vụ, các điều kiện rẽ nhánh và các lưu ý về mặt dữ liệu đầu vào.
3. **Bước 3:** Gửi mã nguồn kèm Prompt cho AI và phân tích kết quả phản hồi.
4. **Bước 4:** Kiểm chứng lại thông tin giải nghĩa từ AI dựa trên hiểu biết về mặt nghiệp vụ doanh nghiệp.

### Prompt sử dụng
```text
Hãy phân tích logic hoạt động của hàm tính thuế doanh thu dưới đây. Liệt kê rõ các điều kiện tính thuế, tỷ lệ thuế áp dụng, và chỉ ra những điểm cần lưu ý về mặt dữ liệu đầu vào để đảm bảo hàm chạy chính xác.
```

### Mã nguồn
```java
public class TaxCalculator {
    public static long calculateCorporateTax(double revenue, double expense, String region, boolean isPrioritized) {
        double taxableIncome = revenue - expense;
        if (taxableIncome <= 0) {
            return 0;
        }
        double taxRate = 0.20;
        if ("Special-Zone".equals(region)) {
            taxRate = 0.15;
        }
        if (isPrioritized) {
            taxRate -= 0.02;
        }
        double baseTax = taxableIncome * taxRate;
        return Math.round(baseTax);
    }
}
```

### Giải thích mã nguồn
Từ đoạn mã nguồn trên, AI phân tích và trả về các thông tin logic nghiệp vụ cốt lõi:
* **Thu nhập tính thuế (Taxable Income):** Được tính bằng hiệu số giữa doanh thu (`revenue`) và chi phí (`expense`). Nếu thu nhập này nhỏ hơn hoặc bằng 0, doanh nghiệp không phải nộp thuế (hàm trả về 0).
* **Thuế suất cơ bản (Base Tax Rate):** Mặc định là 20% (0.20) áp dụng trên phần thu nhập tính thuế.
* **Điều kiện giảm thuế theo khu vực (Region Incentive):** Nếu tham số khu vực (`region`) là `'Special-Zone'`, thuế suất áp dụng sẽ giảm xuống còn 15% (0.15). Sử dụng phương thức an toàn `"Special-Zone".equals(region)` để tránh lỗi NullPointerException trong Java.
* **Điều kiện ưu tiên doanh nghiệp (Priority Incentive):** Nếu tham số diện ưu tiên (`isPrioritized`) là `true`, doanh nghiệp được giảm thêm 2% thuế suất (trừ đi 0.02 từ mức thuế hiện tại).
* **Làm tròn kết quả:** Thuế phải nộp được tính bằng phép nhân giữa thu nhập tính thuế và thuế suất cuối cùng, sau đó làm tròn đến số nguyên gần nhất (kiểu dữ liệu `long`) bằng phương thức `Math.round()`.

### Kết quả đầu ra mong đợi
Lập trình viên nhận được một bản giải trình nghiệp vụ rõ ràng, chi tiết chỉ trong vài giây, giúp loại bỏ hoàn toàn các phỏng đoán mơ hồ về mặt logic nghiệp vụ khi đọc mã nguồn thô.

---

## 6. Tổng kết

### Những kiến thức quan trọng nhất
* Lập trình viên hiện đại cần chuyển dịch tư duy từ việc tập trung viết mã nguồn thủ công sang việc thiết kế, ra lệnh (Prompting) và kiểm chứng chất lượng đầu ra của AI.
* AI là một công cụ hỗ trợ đọc hiểu và phân tích cực kỳ mạnh mẽ, giúp tối ưu hóa thời gian onboarding nhân sự và giảm thiểu thời gian tra cứu tài liệu kỹ thuật.

### Những sai lầm thường gặp
* Tin tưởng tuyệt đối vào mã nguồn hoặc tài liệu do AI sinh ra mà không thực hiện kiểm chứng logic và chạy thử nghiệm.
* Cung cấp các thông tin nhạy cảm hoặc bí mật kinh doanh của doanh nghiệp lên các công cụ AI công cộng mà không có biện pháp bảo mật hoặc che giấu dữ liệu.

### Những lưu ý khi áp dụng thực tế
* Luôn áp dụng quy trình kiểm thử (Unit Test, Integration Test) để xác thực tính chính xác của mã nguồn được hỗ trợ bởi AI.
* Sử dụng AI một cách chủ động để giải thích khái niệm mới, nhưng phải đối chiếu lại với tài liệu chính thức (Official Documentation) để tránh hiện tượng AI ảo tưởng thông tin (Hallucination).

---

## 7. Câu hỏi đánh giá

### Câu 1
Trong mô hình phát triển phần mềm kết hợp AI (Augmented Workflow), vai trò nào dưới đây trở thành trọng tâm hàng đầu của lập trình viên?
* [A] Ghi nhớ chi tiết cú pháp của tất cả các framework để gõ code nhanh nhất có thể.
* [B] Định nghĩa bài toán nghiệp vụ, thiết kế kiến trúc hệ thống và kiểm chứng kết quả từ AI.
* [C] Để AI tự động đưa ra các quyết định thiết kế quan trọng và đưa thẳng lên môi trường production.
* [D] Hạn chế tối đa việc sử dụng AI để tự viết mọi thành phần mã nguồn một cách thủ công.

**Đáp án đúng:** B
**Giải thích chi tiết:**
* **Đáp án B đúng** vì trong thời đại AI, các công việc viết cú pháp lặp đi lặp lại được AI hỗ trợ rất tốt. Lập trình viên cần tập trung vào các khâu ở mức cao hơn như định nghĩa bài toán, thiết kế hệ thống và quan trọng nhất là kiểm soát, kiểm chứng chất lượng đầu ra của AI để đảm bảo tính chính xác và an toàn.
* **Đáp án A sai** vì ghi nhớ chi tiết cú pháp không còn là ưu thế hàng đầu khi có AI hỗ trợ tra cứu và viết code nhanh chóng.
* **Đáp án C sai** vì việc để AI tự quyết định kiến trúc cốt lõi và triển khai thẳng lên production mà không kiểm duyệt chứa đựng rủi ro bảo mật và lỗi hệ thống cực kỳ nghiêm trọng.
* **Đáp án D sai** vì việc từ chối sử dụng công nghệ AI sẽ làm giảm hiệu suất cạnh tranh cá nhân trong thị trường hiện đại.

### Câu 2
Khi tiếp nhận một đoạn mã nguồn cũ phức tạp không có tài liệu hướng dẫn, việc sử dụng AI để giải nghĩa mang lại lợi ích trực tiếp nào nhất?
* [A] AI tự động tối ưu hóa hiệu năng hệ thống mà không cần lập trình viên kiểm thử.
* [B] Giúp lập trình viên dịch chuyển tức thời toàn bộ dự án sang một ngôn ngữ lập trình khác.
* [C] Rút ngắn thời gian đọc hiểu luồng dữ liệu nghiệp vụ phức tạp từ vài giờ xuống còn vài phút.
* [D] Thay thế hoàn toàn vai trò của người quản lý dự án trong việc lập kế hoạch công việc.

**Đáp án đúng:** C
**Giải thích chi tiết:**
* **Đáp án C đúng** vì thế mạnh lớn nhất của LLM là khả năng tóm tắt, giải thích và phân tích logic ngôn ngữ tự nhiên cũng như mã nguồn. Nó giúp lập trình viên nhanh chóng hiểu được mục đích và luồng đi của dữ liệu trong một đoạn code phức tạp mà không cần đọc từng dòng.
* **Đáp án A sai** vì AI không tự động tích hợp hay tối ưu hóa hệ thống nếu không có sự điều khiển và kiểm thử của con người.
* **Đáp án B sai** vì dịch chuyển dự án sang ngôn ngữ khác là việc phức tạp, AI chỉ hỗ trợ chuyển đổi cú pháp từng phần chứ không thể tự động dịch chuyển toàn bộ dự án hoàn hảo 100% không cần kiểm chứng.
* **Đáp án D sai** vì AI không thể thay thế vai trò quản lý con người và lập kế hoạch chiến lược của Project Manager.

### Câu 3
Một kỹ sư được giao nhiệm vụ tích hợp một thư viện thanh toán mới vào dự án của doanh nghiệp. Để tối ưu hóa hiệu suất làm việc bằng AI theo đúng phương pháp luận đã học, quy trình nào sau đây là phù hợp nhất?
* [A] Yêu cầu AI tự động viết toàn bộ code tích hợp và dán trực tiếp vào hệ thống đang chạy.
* [B] Tự nghiên cứu tài liệu gốc trong vài ngày và chỉ sử dụng AI khi gặp lỗi runtime không thể tự sửa.
* [C] Sử dụng AI để tóm tắt các bước tích hợp cốt lõi của thư viện, viết mã nguồn thử nghiệm dưới sự kiểm chứng của bản thân, sau đó xây dựng bộ test case để xác thực.
* [D] Nhờ đồng nghiệp viết code mẫu, sau đó gửi code mẫu đó lên AI để AI tự động cấu hình lại máy chủ doanh nghiệp.

**Đáp án đúng:** C
**Giải thích chi tiết:**
* **Đáp án C đúng** vì đây là quy trình làm việc chuẩn mực khi kết hợp với AI: sử dụng AI để học nhanh kiến thức tổng quát và các bước tích hợp (tăng tốc độ nghiên cứu), tự thực hiện viết code dưới sự kiểm soát và kiểm chứng kỹ lưỡng, sau đó viết test case độc lập để nghiệm thu kết quả.
* **Đáp án A sai** vì đưa thẳng code AI chưa qua kiểm duyệt vào hệ thống đang chạy là vô cùng nguy hiểm.
* **Đáp án B sai** vì tự nghiên cứu hoàn toàn bằng phương pháp truyền thống gây tốn thời gian không cần thiết, làm giảm hiệu suất làm việc.
* **Đáp án D sai** vì AI không thể tự động kết nối và cấu hình trực tiếp máy chủ doanh nghiệp an toàn nếu không có sự thiết lập cụ thể và quy trình kiểm soát của quản trị viên.
