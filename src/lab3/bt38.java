// 38. Tinh,  vơi! 3 2 1 ! 3 3 2 1 ! 2 2 1 1 ) ( n n n S               
// Phiên bản sử dụng vòng lặp for thay vì while

package lab3;
import java.util.Scanner;
public class Bt38 {
public static void main(String[] args) {
                int n;
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        try (Scanner sc = new Scanner(System.in)) {
    // Nhập giá trị n từ bàn phím
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        // Khởi tạo biến sum kiểu double để lưu tổng (phải dùng double để tính số thực)
        double sum=1;
        // Dùng vòng lặp for để tính tổng từ 2 đến n
        for (int i=2; i<=n; i++) {
            // Tính tổng từ 1 đến i: 1+2+3+...+i
            int tong_tu = 0;
            for (int j=1; j<=i; j++) {
                tong_tu += j;
            }
            // Tính giai thừa i!
            long giaithua=1;
            for (int k=1; k<=i; k++) {
                giaithua *= k;
            }
            // Cộng thêm (1+2+...+i) / i! vào tổng sum
            sum += (double) tong_tu / giaithua;
        }
        // In ra kết quả tổng S(n)
        System.out.println("S = " + sum);    
    }// end main
}// end class
// cách 2 dùng 3 vòng lặp for thay vì dùng công thức tổng
/* 
 * package lab3;
import java.util.Scanner;
public class Bt38_1 {
    public static void main(String[] args) {
        // Nhập vào số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }        
        // Khởi tạo biến sum để lưu tổng các phân số, bắt đầu từ 1
        double sum = 1;        
        for (int i = 2; i <= n; i++) {
            // Tạo biến tong_tu để lưu tổng tử số với giá trị ban đầu từ 0
            int tong_tu = 0;
            // Sử dụng vòng lặp for để tính tổng từ 1 đến i
            for (int j = 1; j <= i; j++) {
                // Cộng dồn j vào biến tong_tu
                tong_tu += j;
            }
            
            // Tính giai thừa mẫu số: i!
            // Tạo biến giaithua để lưu giá trị giai thừa với giá trị ban đầu là 1
            long giaithua = 1;
            // Sử dụng vòng lặp for để tính giai thừa từ 1 đến i
            for (int k = 1; k <= i; k++) {
                // Cập nhật giai thừa tại bước k
                giaithua *= k;
            }            
            // Cộng thêm (1+2+...+i) / i! vào tổng sum
            sum += (double) tong_tu / giaithua;
        }
        
        // In ra kết quả tổng S(n)
        System.out.println("S = " + sum);
    } // end main
} // end class
 */
