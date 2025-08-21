// 39.  Tinh,  vơin n S               3 2 1 1 3 2 1 1 2 1 1 1 ) (
package lab3;
import java.util.Scanner;
public class Bt39 {
public static void main(String[] args) {
            int n;
                    // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
try(Scanner sc = new Scanner(System.in)){
                // Nhập giá trị n từ bàn phím
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        }    
                // Khởi tạo biến sum để lưu tổng S(n), kiểu double để tính chính xác
double sum=0;
        // Khởi tạo biến t để lưu tổng dãy 1 + 2 + ... + i
        int t= 0;
                // Dùng vòng lặp for để duyệt từ 1 đến n
for(int i=1; i<=n; i++){
// Cộng dồn vào biến t (t = 1 + 2 + ... + i)
t += i;
// Cộng 1/t vào tổng sum
sum +=(double)1/t;
}
    System.out.printf("Tong S = %.4f", sum);
    }//end main
}//end class
