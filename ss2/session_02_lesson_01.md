# Session 02: Lợi ích, hạn chế và trách nhiệm khi sử dụng AI

## Lesson 01: Tại sao AI trở thành công cụ quan trọng trong học tập, lập trình

### 1. Mục tiêu học tập
Sau bài học này, bạn sẽ có khả năng:
* Giải thích được cơ chế hoạt động cơ bản giúp AI hiểu và sinh mã nguồn lập trình.
* Áp dụng AI như một trợ lý học tập cá nhân (1-on-1 Tutor) để tự giải quyết các khái niệm kỹ thuật khó.
* Sử dụng AI để nhanh chóng tiếp cận và làm quen với một dự án phần mềm mới (Onboarding).

---

### 2. Đặt vấn đề thực tế: Onboarding dự án QuickBite
Bạn là một kỹ sư phần mềm mới được nhận vào dự án QuickBite. Vào ngày làm việc đầu tiên, đồng nghiệp đưa cho bạn một thư mục mã nguồn chứa hàng trăm tệp tin và yêu cầu bạn sửa một lỗi nhỏ liên quan đến tính năng đặt hàng (`placeOrder`). 

Mã nguồn của hàm đặt hàng trông như thế này:
```javascript
async function placeOrder(userId, cartItems, voucherCode) {
    const user = await db.findUser(userId);
    if (!user) throw new Error("User not found");
    
    let total = cartItems.reduce((sum, item) => sum + (item.price * item.quantity), 0);
    
    if (voucherCode) {
        const discount = await applyVoucher(voucherCode, total);
        total -= discount;
    }
    
    const deliveryFee = await calculateFee(user.distance, false, 'clear');
    const finalAmount = total + deliveryFee;
    
    const orderId = await db.createOrder(userId, cartItems, finalAmount);
    await sendNotification(userId, "Order placed successfully! ID: " + orderId);
    return orderId;
}
```
Mọi người trong đội đều bận rộn chuẩn bị cho kỳ báo cáo quý và không ai có thời gian giải thích chi tiết luồng xử lý hoặc cách gọi các hàm `db.findUser`, `applyVoucher`, `calculateFee` cho bạn. Nếu tự tìm tài liệu và lần mò thủ công, bạn sẽ mất nguyên cả ngày đầu tiên chỉ để hiểu luồng chạy cơ bản của một API.

> [!TIP]
> Thay vì liên tục làm phiền đồng nghiệp hoặc mất hàng giờ tự đọc tài liệu, bạn có thể biến AI thành người hướng dẫn riêng để giải thích từng bước luồng nghiệp vụ này.

---

### 3. Kiến thức cốt lõi: Sức mạnh giải nghĩa và học tập của AI

#### A. Tại sao AI hiểu được code?
Các mô hình ngôn ngữ lớn (LLM - Large Language Models) được huấn luyện trên hàng tỷ dòng code nguồn mở từ các nền tảng như GitHub. Nhờ đó, AI không chỉ nhận diện cú pháp mà còn:
* **Hiểu ngữ cảnh nghiệp vụ:** Biết rằng `placeOrder` là luồng đặt hàng, `calculateFee` là tính phí vận chuyển.
* **Liên kết các mối quan hệ:** Nhận biết được thứ tự thực thi của các tác vụ không đồng bộ (`async/await`) và luồng dữ liệu truyền qua các hàm.

#### B. Trợ lý học tập cá nhân hóa 24/7
AI hoạt động như một giảng viên lập trình có kiên nhẫn vô hạn:
* **Học theo tốc độ cá nhân:** Bạn có thể yêu cầu AI giải thích một khái niệm (như `Promise.all` hoặc `reduce` trong JavaScript) theo nhiều cách khác nhau, cho đến khi bạn thực sự hiểu rõ.
* **Cung cấp ví dụ thực tế:** Thay vì các ví dụ lý thuyết suông, bạn có thể yêu cầu AI lấy ví dụ trực tiếp bằng các bài toán thực tế của QuickBite.

---

### 4. Thực hành minh họa (Demo): Phân tích luồng đặt hàng QuickBite
Hãy dùng AI để phân tích hàm `placeOrder` ở trên để bạn có thể tự tin bắt tay vào sửa lỗi.

#### Các bước thực thi cùng AI:
1. **Bước 1:** Soạn Prompt gửi tới AI:
   > *"Tôi là lập trình viên mới đang tiếp nhận dự án QuickBite. Hãy phân tích từng bước luồng thực thi của hàm `placeOrder` sau đây và chỉ ra các điểm cần lưu ý về mặt dữ liệu."*
   *(Kèm theo đoạn code hàm `placeOrder` ở phần Đặt vấn đề)*
2. **Bước 2:** AI phản hồi phân tích chi tiết:
   * **Bước 1 (Xác thực):** Kiểm tra xem người dùng (`userId`) có tồn tại trong cơ sở dữ liệu hay không. Nếu không, ném ra lỗi lập tức.
   * **Bước 2 (Tính tổng tiền hàng):** Sử dụng hàm `reduce` để nhân đơn giá với số lượng của từng món ăn trong giỏ hàng (`cartItems`) và cộng dồn lại thành biến `total`.
   * **Bước 3 (Áp dụng mã giảm giá):** Nếu có `voucherCode`, gọi hàm `applyVoucher` để tính số tiền được giảm và trừ vào `total`.
   * **Bước 4 (Tính phí vận chuyển):** Gọi hàm không đồng bộ `calculateFee` truyền vào khoảng cách của người dùng (`user.distance`) để lấy phí ship.
   * **Bước 5 (Tạo đơn hàng & Thông báo):** Lưu đơn hàng mới với tổng số tiền cuối cùng (`total + deliveryFee`) vào database và gửi thông báo thành công cho người dùng qua `sendNotification`.

Nhờ sự hỗ trợ của AI, bạn đã nắm rõ luồng nghiệp vụ của hàm đặt hàng chỉ trong vòng 30 giây đầu tiên onboarding, sẵn sàng thực hiện các chỉnh sửa logic tiếp theo.

---

### 5. Tổng kết & Đánh giá

## Q1
Cơ chế cốt lõi nào giúp các mô hình AI (LLM) có thể hiểu và giải thích chính xác mã nguồn lập trình của các dự án thực tế?

[A]
AI được huấn luyện trên khối lượng khổng lồ mã nguồn mở, giúp nó nhận diện được cú pháp ngữ pháp và học được các mẫu logic nghiệp vụ phổ biến.
[EXP]
Đúng. Quá trình huấn luyện trên kho mã nguồn khổng lồ giúp AI nắm giữ kiến thức sâu sắc về ngôn ngữ lập trình và ngữ cảnh nghiệp vụ.
[B]
AI có khả năng tự động truy cập trực tiếp vào cơ sở dữ liệu production của doanh nghiệp để chạy thử mã nguồn.
[EXP]
Sai. AI hoạt động trên dữ liệu ngữ cảnh mà bạn cung cấp (hoặc mã nguồn dự án được cấp quyền), không tự ý truy cập trái phép vào DB production.
[C]
AI sử dụng một bộ quy tắc dịch tĩnh (Static Compiler Rules) để đối chiếu trực tiếp các dòng code sang ngôn ngữ tự nhiên.
[EXP]
Sai. AI sử dụng mạng nơ-ron học sâu để hiểu ngữ cảnh linh hoạt, không phải các quy tắc biên dịch tĩnh thông thường.
[D]
AI có kết nối thần kinh trực tiếp với bộ não của lập trình viên để hiểu ngay lập tức mục tiêu lập trình.
[EXP]
Sai. Đây là giả thuyết khoa học viễn tưởng, AI chỉ tương tác thông qua các Prompt dạng văn bản hoặc giọng nói.

@correct: A
@point: 20

## Q2
Trong tình huống onboarding tại QuickBite, tại sao việc sử dụng AI để giải thích luồng code lại được khuyến khích hơn việc tự mò mẫm code thủ công mà không có tài liệu?

[A]
Vì AI có thể thay thế lập trình viên tự động quyết định và chịu toàn bộ trách nhiệm nếu code chạy bị lỗi.
[EXP]
Sai. Lập trình viên vẫn phải chịu trách nhiệm về code; AI chỉ đóng vai trò hỗ trợ đọc hiểu nhanh hơn.
[B]
Vì việc tự mò mẫm code thủ công không có tài liệu sẽ tốn nhiều thời gian và làm giảm tốc độ thích ứng (onboarding) của nhân sự mới.
[EXP]
Đúng. AI giúp tóm tắt luồng xử lý tức thì, giảm đáng kể thời gian đọc hiểu code của nhân sự mới khi hệ thống thiếu tài liệu.
[C]
Vì AI tự động viết lại tài liệu hệ thống và gửi email báo cáo tiến độ cho sếp thay cho lập trình viên mới.
[EXP]
Sai. AI không tự động gửi email báo cáo tiến độ trừ khi được lập trình và tích hợp cụ thể cho tác vụ đó.
[D]
Vì tự mò mẫm code thủ công sẽ khiến lập trình viên ghi nhớ cú pháp kém hơn so với việc đọc giải thích từ AI.
[EXP]
Sai. Tự mò mẫm có thể giúp nhớ sâu nhưng tốn thời gian quá lớn trong tình huống công việc thực tế cần tiến độ nhanh.

@correct: B
@point: 20

## Q3
Khi gặp một hàm xử lý tính toán giỏ hàng (`reduce`) phức tạp trong QuickBite mà bạn chưa từng học qua cú pháp, cách sử dụng AI nào dưới đây mang lại hiệu quả học tập chủ động tốt nhất?

[A]
Yêu cầu AI viết lại toàn bộ bằng vòng lặp `for` truyền thống để tránh phải học cú pháp mới.
[EXP]
Sai. Cách này giúp né tránh kiến thức mới thay vì học hỏi và nâng cao trình độ bản thân.
[B]
Copy đoạn code và nhờ AI giải thích cơ chế hoạt động của hàm `reduce` kèm theo ví dụ minh họa đơn giản áp dụng trực tiếp cho giỏ hàng QuickBite.
[EXP]
Đúng. Bạn vừa hiểu được cơ chế của cú pháp mới, vừa thấy được ứng dụng thực tế của nó trong dự án đang làm.
[C]
Bỏ qua đoạn code đó và yêu cầu AI tự sinh ra một hàm tính toán giỏ hàng hoàn toàn mới bằng ngôn ngữ lập trình khác.
[EXP]
Sai. Việc chuyển đổi ngôn ngữ không giải quyết được vấn đề bạn cần đọc hiểu mã nguồn hiện tại của dự án.
[D]
Nhờ đồng nghiệp viết giải thích chi tiết ra giấy rồi nhập lại giải thích đó vào AI để AI chấm điểm.
[EXP]
Sai. Cách làm này tốn thời gian của đồng nghiệp và không tận dụng được thế mạnh tự học trực tiếp từ AI.

@correct: B
@point: 20
