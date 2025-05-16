// 36. Tinh,  vơi1 4 3 3 2 2 1 ) (       n n n S 
package lab3;
import java.util.Scanner;
public class bt36 {
    public static void main(String[] args) {
        int n;
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
try(Scanner sc = new Scanner(System.in)){
    // Nhập giá trị n từ bàn phím
System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
                // Khởi tạo biến sum để lưu tổng bình phương các số tự nhiên từ 1 đến n

        int sum=0;
                // Dùng vòng lặp for để duyệt qua từng số từ 1 đến n

        for(int i=1; i<=n; i++){
                        // Cộng bình phương của i vào biến sum (i * i là i bình phương)

            sum += i*i;
        }
                // In ra kết quả tổng S(n)
System.out.println("Tong S = " + sum);
    }//end main
}//end class
//cách 2 dùng math.pow để tính bình phương
/* 
 * package lab3;
import java.util.Scanner;
public class bt36_1 {
    public static void main(String[] args) {
                int n;
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
try(Scanner sc = new Scanner(System.in)){
    // Nhập giá trị n từ bàn phím
System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
                // Khởi tạo biến sum để lưu tổng bình phương các số tự nhiên từ 1 đến n
        int sum=0;
                // Dùng vòng lặp for để duyệt qua từng số từ 1 đến n
        for(int i=1; i<=n; i++){
            sum+=Math.pow(i,2); // Tính bình phương của i và cộng dồn vào sum
        }
                // In ra kết quả tổng S(n)
System.out.println("Tong S = " + sum);
    }//end main
}//end class
 */