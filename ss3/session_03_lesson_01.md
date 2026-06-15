# Session 03: Kỹ thuật đặt Prompt căn bản

## Lesson 01: Prompt là gì? Vì sao nó quan trọng hơn bạn nghĩ?

### 1. Mục tiêu học tập

Sau bài học này, bạn có thể:
* Trình bày được định nghĩa chính xác về "Prompt" và nguyên lý hoạt động của nó khi tương tác với các công cụ AI.
* Phân tích được nguyên lý "Garbage In, Garbage Out" (Đầu vào rác, đầu ra rác) thông qua việc đánh giá chất lượng của các câu lệnh.
* Nhận thức được tầm quan trọng cốt lõi của kỹ năng "Prompt Engineering" (Kỹ sư thiết kế câu lệnh) trong việc nâng cao năng suất của một lập trình viên.

---

### 2. Đặt vấn đề thực tế

Giả sử trong một bài tập lập trình Java, hai sinh viên cùng nhận được yêu cầu: *"Viết một hàm kiểm tra tính hợp lệ của mật khẩu người dùng (Mật khẩu hợp lệ khi dài ít nhất 8 ký tự, có chứa ít nhất 1 chữ hoa, 1 chữ thường và 1 chữ số)"*. 

* Sinh viên A mở ChatGPT và gõ thật nhanh: *"Viết hàm kiểm tra mật khẩu bằng Java"*. AI lập tức sinh ra một hàm rất đơn giản, nó chỉ kiểm tra xem độ dài chuỗi có lớn hơn 8 hay không và bỏ qua toàn bộ các quy tắc về chữ hoa, chữ số. Sinh viên A copy đoạn mã vào dự án, chạy thử, hệ thống báo lỗi sai nghiệp vụ. Bạn ấy mất thêm 30 phút tự ngồi dò dẫm viết thêm mã (code) để sửa.
* Sinh viên B dành ra thêm 20 giây để gõ đầy đủ: *"Hãy đóng vai trò là một Senior Java Developer. Viết một phương thức tĩnh (static method) trong Java kiểm tra tính hợp lệ của mật khẩu. Yêu cầu bắt buộc: độ dài tối thiểu 8 ký tự, có ít nhất 1 chữ hoa, 1 chữ thường và 1 chữ số. Vui lòng sử dụng biểu thức chính quy (Regex) và thêm chú thích giải thích cụm Regex đó"*. Kết quả, AI trả về một hàm hoàn hảo, xử lý sạch sẽ mọi trường hợp và sinh viên B áp dụng thành công ngay trong lần chạy đầu tiên.

Tại sao dùng chung một công cụ AI tiên tiến nhất thế giới, nhưng kết quả nhận được của hai sinh viên lại hoàn toàn trái ngược? Sự khác biệt duy nhất ở đây chính là cách họ "giao tiếp" với cỗ máy. Cách giao tiếp đó được gọi là **Prompt**.

```text
Sơ đồ minh họa: Sự khác biệt giữa Prompt Tồi và Prompt Tốt

[Lập trình viên]
       |
       +--> Kịch bản A (Prompt tồi): "Viết hàm kiểm tra mật khẩu"
       |        |
       |        +--> [AI phỏng đoán] --> [Mã nguồn rác, lỏng lẻo] --> [Mất thời gian sửa lỗi]
       |
       +--> Kịch bản B (Prompt tốt): "Đóng vai Senior Java Dev, viết hàm kiểm tra >8 ký tự..."
                |
                +--> [AI tuân thủ] --> [Mã nguồn chuẩn, bảo mật] --> [Hoàn thành tức thì]
```

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] A split-screen illustration showing two contrasting scenarios of software developers interacting with AI. On the left, a developer typing a vague, one-sentence instruction into an AI terminal, resulting in a chaotic, tangled mess of code and a confused face. On the right, a developer typing a structured, detailed prompt like a blueprint, resulting in the AI generating a glowing, perfectly organized structure of code. High-tech, clean corporate style, 8k resolution.

---

### 3. Kiến thức cốt lõi

#### A. Prompt là gì?
* **Định nghĩa:** Prompt (Câu lệnh/Chỉ thị) là toàn bộ những dữ liệu đầu vào bao gồm văn bản, đoạn mã nguồn, hoặc ngữ cảnh mà bạn cung cấp cho hệ thống Trí tuệ Nhân tạo (AI) để yêu cầu nó thực hiện một tác vụ cụ thể.
* **Vai trò:** Prompt giống như "bản mô tả yêu cầu công việc" (Task Brief) mà bạn giao cho một thành viên trong nhóm. Bản mô tả càng chi tiết, kết quả trả về càng đúng ý.
* **Khi nào sử dụng:** Mọi lúc khi giao tiếp với AI, từ việc tìm kiếm thông tin đến sinh mã nguồn dự án.
* **Ví dụ nghiệp vụ thực tế:** Yêu cầu AI viết một hàm Java truy vấn cơ sở dữ liệu dựa trên mô hình bảng (Table schema) được cung cấp sẵn.

#### B. Tại sao Prompt lại quan trọng hơn bạn nghĩ?
* **Nguyên lý "Garbage In, Garbage Out":** Nếu bạn đưa cho AI một yêu cầu hời hợt (Rác), nó sẽ trả về đoạn mã chung chung, sai nghiệp vụ (Rác). AI không có khả năng "đọc tâm trí" (Mind-reading) để hiểu ngữ cảnh ngầm định của dự án.
* **Tính điều hướng (Steerability):** Một Prompt tốt giúp "khóa" không gian tìm kiếm khổng lồ của AI lại, ép nó phải trả lời theo đúng ngôn ngữ (Java 17), đúng chuẩn mã hóa (Clean Code), và đúng kiến trúc bạn cần.

#### C. Kỹ sư câu lệnh (Prompt Engineering)
* **Định nghĩa:** Kỹ năng thiết kế, tối ưu hóa và tinh chỉnh các câu lệnh để giao tiếp hiệu quả nhất với các hệ thống AI.
* **Vai trò:** Giúp tiết kiệm thời gian sửa lỗi. Đầu tư 1 phút viết Prompt chi tiết sẽ tiết kiệm 1 tiếng đồng hồ gỡ lỗi do AI làm sai.
* **Khi nào sử dụng:** Là kỹ năng nền tảng bắt buộc của lập trình viên thế hệ mới (AI-Assisted Developer).

```text
Sơ đồ minh họa: Tính điều hướng (Steerability) của Prompt

[Không gian giải pháp của AI (Hàng tỷ đoạn mã)]
                |
                V
+-------------------------------+
|       Prompt của bạn          |  <-- Chiếc vô lăng điều hướng (Ngôn ngữ, Ràng buộc, Định dạng)
+-------------------------------+
                |
                V
[Mã nguồn chính xác, đúng nghiệp vụ dự án]
```

*Gợi ý hình ảnh minh họa:*
> [prompt hình ảnh] An isometric concept art showing a steering wheel connected to a powerful, glowing AI brain matrix. A human hand is firmly gripping the steering wheel (representing the "Prompt"). Text floating nearby says "Steerability". The overall aesthetic is futuristic, neon blues and purples, highly detailed, illustrating that prompts are the control mechanism for vast AI power.

---

### 4. Phân tích tình huống thực tế

#### Bối cảnh
Tại dự án xây dựng phần mềm quản lý sinh viên của một trường đại học, đội ngũ phát triển cần thiết kế các thực thể (Entity) bằng ngôn ngữ Java để ánh xạ (map) với cơ sở dữ liệu.

#### Thách thức
Một thực tập sinh mới sử dụng AI và đưa ra một Prompt quá ngắn gọn: *"Tạo một lớp sinh viên bằng Java"*. AI có xu hướng "chiều lòng" người dùng bằng cách sinh ra câu trả lời tốn ít tài nguyên tính toán nhất. Do đó, AI trả về một tệp `Student.java` nghèo nàn với các thuộc tính công khai (`public id`, `public name`), hoàn toàn bỏ qua các quy tắc đóng gói (Encapsulation), không có hàm khởi tạo, và thiếu các trường dữ liệu thực tế.

#### Cách tiếp cận
Thực tập sinh được hướng dẫn thay đổi cách giao tiếp. Thay vì "nhờ vả" một cách chung chung, bạn đó cung cấp một Prompt đóng vai trò mô tả nghiệp vụ: *"Hãy tạo một lớp Student trong Java. Yêu cầu: Tuân thủ nguyên lý đóng gói OOP (sử dụng private, có getter/setter), có hàm khởi tạo đầy đủ 3 tham số (id, name, gpa). Ngoài ra, viết thêm một phương thức đánh giá học lực: nếu gpa >= 8.0 trả về 'Giỏi', nếu không trả về 'Khá'."*

#### Kết quả
Nhờ sự thay đổi trong cấu trúc Prompt, AI đã sinh ra một lớp đối tượng `Student` hoàn thiện, đáp ứng các tiêu chuẩn bảo mật và kiến trúc của dự án. Thực tập sinh có thể gộp (merge) mã này trực tiếp vào dự án mà không cần phải chỉnh sửa lại các lỗi cơ bản.

---

### 5. Demo minh họa

**Mục tiêu demo:** Trực quan hóa sự tiến hóa của chất lượng mã nguồn Java thông qua việc thay đổi mức độ chi tiết của Prompt.

**Mô phỏng luồng làm việc:**

**Bước 1: Sử dụng Prompt "tồi" (Thiếu ngữ cảnh, thiếu ràng buộc)**
* **Prompt sử dụng:** *"Viết code tạo danh sách sinh viên."*
* **Kết quả do AI sinh ra:** Mảng cơ bản, không có đối tượng, tính ứng dụng thấp.
```java
public class Main {
    public static void main(String[] args) {
        String[] students = {"Nguyen Van A", "Tran Thi B"};
        for(String s : students) {
            System.out.println(s);
        }
    }
}
```

**Bước 2: Sử dụng Prompt "tốt" (Sát nghiệp vụ, cấu trúc dữ liệu rõ ràng)**
* **Prompt sử dụng:** *"Hãy viết một chương trình Java áp dụng Hướng đối tượng (OOP). Khai báo một lớp Student (có id, name, gpa) đóng gói cẩn thận. Sử dụng List và ArrayList để lưu trữ danh sách các đối tượng Student. Cung cấp hàm in ra tên của những sinh viên có gpa > 8.0."*
* **Kết quả do AI sinh ra:** Chuẩn cấu trúc OOP, code sạch, có thể tái sử dụng.
```java
import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public double getGpa() { return gpa; }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyen Van A", 8.5));
        students.add(new Student(2, "Tran Thi B", 7.0));

        System.out.println("Danh sách sinh viên giỏi:");
        for (Student s : students) {
            if (s.getGpa() > 8.0) {
                System.out.println(s.getName());
            }
        }
    }
}
```
*👉 Đánh giá:* Chỉ bằng cách thay đổi Prompt, bạn đã điều khiển AI tạo ra được các đoạn mã với chất lượng chuyên nghiệp thay vì mã dành cho người mới bắt đầu.

---

### 6. Tổng kết

* **Prompt chính là chiếc vô lăng để điều khiển AI:** Cỗ máy có mạnh đến đâu, nếu người lái bẻ lái sai hướng, nó vẫn sẽ đi sai đường.
* **Garbage In, Garbage Out:** Chất lượng câu lệnh đầu vào quyết định trực tiếp tới khả năng áp dụng thực tế của mã nguồn đầu ra.
* Viết Prompt không đơn thuần là nhắn tin (chatting). Việc viết Prompt là một quá trình mô phỏng lại **tư duy phân tích yêu cầu phần mềm**, đòi hỏi sự cụ thể, logic và bao quát các trường hợp.
* Đầu tư 1 phút để trau chuốt Prompt sẽ giúp bạn tránh lãng phí hàng giờ đồng hồ để gỡ lỗi.

---

### 7. Câu hỏi đánh giá

## Câu 1 (Đánh giá khả năng ghi nhớ)
**Câu hỏi:** Hãy giải thích ý nghĩa của nguyên lý "Garbage In, Garbage Out" trong ngữ cảnh sử dụng các công cụ Trí tuệ Nhân tạo để sinh mã nguồn lập trình.

**Câu trả lời tham khảo:**
Nguyên lý "Garbage In, Garbage Out" (Đầu vào rác, đầu ra rác) trong ngữ cảnh sử dụng AI lập trình có nghĩa là: Chất lượng của đoạn mã nguồn (đầu ra) mà AI trả về phụ thuộc hoàn toàn vào chất lượng câu lệnh - Prompt (đầu vào) mà người lập trình cung cấp. AI không có khả năng tự suy luận các yêu cầu nghiệp vụ ngầm định hoặc hiểu được ngữ cảnh chưa được nói ra trong đầu của lập trình viên. Nếu lập trình viên cung cấp một câu lệnh hời hợt, thiếu chi tiết hoặc gây nhầm lẫn (đầu vào rác), AI sẽ tự động phỏng đoán và sinh ra một đoạn mã chung chung, sai logic, hoặc không đáp ứng chuẩn mực (đầu ra rác).

## Câu 2 (Đánh giá khả năng đọc hiểu & phân tích)
**Câu hỏi:** Tại sao các công cụ AI hiện tại thường có xu hướng trả về các đoạn mã mang tính "đồ chơi" (toy code) rất đơn điệu và thiếu tính bảo vệ dữ liệu (ví dụ: các biến đều để ở chế độ public) nếu người dùng chỉ đưa ra một Prompt quá ngắn gọn?

**Câu trả lời tham khảo:**
Khi nhận một Prompt quá ngắn gọn (Ví dụ: "Tạo một lớp sinh viên"), AI đứng trước một không gian giải pháp vô cùng rộng lớn. Nguyên tắc hoạt động của các mô hình ngôn ngữ (LLM) là tối ưu hóa để đưa ra câu trả lời nhanh nhất và tốn ít tài nguyên tính toán nhất có thể để làm hài lòng người dùng. Vì người dùng không đưa ra các "ràng buộc" cụ thể (như phải tuân thủ hướng đối tượng, phải dùng private, phải có getter/setter), AI sẽ tự động lựa chọn đường đi dễ nhất: sinh ra một lớp trống với các thuộc tính công khai (public) để đoạn mã ngắn gọn và hiển thị ngay lập tức. Tính "phỏng đoán ưu tiên sự tối giản" này chính là nguyên nhân dẫn đến các đoạn mã đồ chơi không phù hợp với chuẩn mực của dự án thực tế.

## Câu 3 (Tình huống thực chiến)
**Câu hỏi:** Giả sử bạn cần một hàm trong Java để tìm giá trị lớn nhất trong một danh sách các con số nguyên. Dưới đây là một Prompt "tồi": *"Viết code tìm số lớn nhất"*. 
Dựa vào tư duy kiểm soát AI, hãy viết lại thành một Prompt "tốt" bằng cách bổ sung thêm ít nhất 2 ràng buộc quan trọng (ví dụ như chỉ định cấu trúc dữ liệu Java cụ thể và cách xử lý ngoại lệ khi danh sách bị rỗng).

**Câu trả lời tham khảo:**
Để biến một Prompt "tồi" thành một Prompt "tốt", tôi sẽ bổ sung ngữ cảnh, ngôn ngữ lập trình, cấu trúc dữ liệu và xử lý trường hợp đặc biệt (edge case) như sau:
* **Prompt được nâng cấp:** *"Hãy đóng vai trò là một lập trình viên Java có kinh nghiệm. Viết một hàm trong Java (static method) để tìm và trả về giá trị lớn nhất từ một danh sách các số nguyên. Bắt buộc phải sử dụng cấu trúc `List<Integer>` làm tham số đầu vào. Nếu danh sách truyền vào bị rỗng (empty) hoặc mang giá trị null, hàm phải ném ra (throw) ngoại lệ `IllegalArgumentException` với thông báo lỗi thích hợp. Không sử dụng thư viện bên ngoài, chỉ sử dụng Java chuẩn."*
* **Phân tích lý do nâng cấp:** Việc bổ sung ràng buộc sử dụng `List<Integer>` giúp AI không sinh ra mảng tĩnh truyền thống. Việc yêu cầu ném ra ngoại lệ `IllegalArgumentException` giúp đoạn mã trở nên chuyên nghiệp, an toàn và có thể dễ dàng tích hợp vào hệ thống thực tế mà không lo chương trình bị sập bởi lỗi `NullPointerException` ngầm.
