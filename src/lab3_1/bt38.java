// 38. Tinh,  vơi! 3 2 1 ! 3 3 2 1 ! 2 2 1 1 ) ( n n n S               
package lab3_1;
import java.util.Scanner;
public class bt38 {
    public static void main(String[] args) {
        // Nhập vào số nguyên n từ bàn phím
                        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
// Khởi tạo biến sum để lưu tổng các phân số, bắt đầu từ 1
    double sum=1;
int i=2;
// Sử dụng vòng lặp while để tính tổng các phân số từ 2 đến n
while (i<=n) {            
    // Tính tổng tử số theo công thức: 1 + 2 + ... + i
            int tong_tu = i * (i + 1) / 2;
            // Tính giai thừa mẫu số: i!
            //tạo biến giaithua để lưu giá trị giai thừa = 1
long giaithua=1;
            int k=1;
            // Sử dụng vòng lặp để tính giai thừa từ 1 đến i
            while (k<=i) {
                giaithua *= k;
                // Tăng k lên 1 để tiếp tục vòng lặp
                k++;
            }
            // Cộng phân số vào tổng
            // Cộng thêm (1+2+...+i) / i! vào tổng sum
            sum += (double) tong_tu / giaithua;
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }
        // In ra kết quả tổng S(n)
System.out.println("S = " + sum);    
    }//end main
}//end class
//cách 2 dùn 3 vòng lập while
/*
 * package lab3_1;
import java.util.Scanner;
public class bt38_1 {
    public static void main(String[] args) {
        // Nhập vào số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
    // Khởi tạo biến sum để lưu tổng các phân số, bắt đầu từ 1
        double sum = 1; 
        int i = 2;
        // Sử dụng vòng lặp while để tính tổng các phân số từ 2 đến n
    while (i <= n) {
            // Tính tổng tử số: 1 + 2 + ... + i
            int tong_tu = 0;
            // Sử dụng vòng lặp để tính tổng từ 1 đến i
            int j = 1;
            while (j <= i) {
                tong_tu += j;
                // Tăng j lên 1 để tiếp tục vòng lặp
                j++;
            }
        // Tính giai thừa mẫu số: i!
            long giaithua = 1;
            int k = 1;
            while (k <= i) {
                // Cập nhật giai thừa tại bước k
                giaithua *= k;
                // Tăng k lên 1 để tiếp tục vòng lặp
                k++;
            }
        // Cộng phân số vào tổng
            sum += (double) tong_tu / giaithua;
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }        
        // In kết quả
        System.out.println("S = " + sum);
    } // end main
} // end class
 */