// 38. Tinh,  vơi! 3 2 1 ! 3 3 2 1 ! 2 2 1 1 ) ( n n n S               
package lab3;
import java.util.Scanner;
public class bt38 {
public static void main(String[] args) {
                int n;
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        try (Scanner sc = new Scanner(System.in)) {
    // Nhập giá trị n từ bàn phím
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        // Khởi tạo biến giaithua kiểu int để tính giai thừa
        int giaithua=1;
        // Khởi tạo biến sum kiểu double để lưu tổng (phải dùng double để tính số thực)
        double sum=0;
        // Dùng vòng lặp for để tính tổng từ 1 đến n
for (int i=1; i<=n; i++) {
            // Cập nhật giai thừa i! = i * (i-1)!
            giaithua*=i;
            // Cộng thêm 1 / i! vào tổng sum (ép kiểu sang double để tránh làm tròn)

            sum+=1/giaithua;
        }
        // Cộng thêm phần tử đầu tiên trong tổng là 1 (tương đương 1/0!)
sum+=1;
        // In ra kết quả tổng S(n)
        System.out.println("S = " + sum);    
    }// end main
}// end class