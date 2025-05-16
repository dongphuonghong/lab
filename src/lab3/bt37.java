// 37. Tinh,  vơi! 1 ! 3 1 ! 2 1 1 ) ( n n S      
package lab3;
import java.util.Scanner;
public class bt37 {
    public static void main(String[] args) {
        int n;
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
try (Scanner sc = new Scanner(System.in)) {
    // Nhập giá trị n từ bàn phím
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
                // Khởi tạo biến giai thừa ban đầu là 1
        int giaithua=1;
                // Khởi tạo biến sum để lưu tổng các giai thừa

        int sum=0;
                // Dùng vòng lặp for để tính từng giai thừa từ 1 đến n và cộng dồn vào sum
        for (int i=1; i<=n; i++) {
            // Cập nhật giai thừa tại bước i
            giaithua*=i;
            // Cộng giai thừa hiện tại vào tổng
            sum+=giaithua;
        }
                // In kết quả tổng S(n) ra màn hình
System.out.println("S = " + sum);
    }//end main
}//end class