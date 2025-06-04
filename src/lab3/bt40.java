// 40. Tinh.y x y x P  ) , (
package lab3;
import java.util.Scanner;
public class bt40 {
public static void main(String[] args) {
    int n;
    double x;
            // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
try(Scanner sc = new Scanner(System.in)){
                // Nhập giá trị n từ bàn phím

        System.out.print("Nhap n: ");
        n = sc.nextInt();
                    // Nhập giá trị x từ bàn phím
System.out.print("Nhap x: ");
        x = sc.nextDouble();
        }    
                // Khởi tạo biến sum để lưu tổng các lũy thừa
            double sum=0;
            // Khởi tạo biến luythua để lưu lũy thừa, bắt đầu từ 1
    double luythua=1;
            // Dùng vòng lặp for để tính tổng từ 1 đến n

    for(int i=1; i<=n; i++){
                    // Nhân dồn x để tính x^i
            // Cộng dồn vào tổng sum
luythua *= x;
        sum += luythua;
    }
            // In ra kết quả tổng P(x, n)

    System.out.println("Tong la: " + sum);
    }//end main
}//end class
//cách 2 dùng hàm math.pow
/* 
 * package lab3;
import java.util.Scanner;
public class bt40_1 {
    public static void main(String[] args) {
        int n;
        double x;
                // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        try(Scanner sc = new Scanner(System.in)){
                        // Nhập giá trị n từ bàn phím
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            // Nhập giá trị x từ bàn phím
            System.out.print("Nhap x: ");
            x = sc.nextDouble();
            }    
                    // Khởi tạo biến sum kiểu double để lưu tổng các lũy thừa
double sum=0;
        // Dùng vòng lặp for để tính tổng từ x^1 đến x^n
for(int i=1; i<=n; i++){
                // Tính x^i bằng hàm Math.pow và cộng dồn vào biến sum
sum += Math.pow(x, i);
        }
                // In ra kết quả tổng P(x, n)
        System.out.println("Tong la: " + sum);
}//end main
}//end class 
 */