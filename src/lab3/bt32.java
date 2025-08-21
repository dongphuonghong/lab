// 32. Tinh,  vơin n S   3 . 2 . 1 3 . 2 . 1 2 . 1 1 ) (     0  n
// Ý tưởng: dùng vòng lặp để tính từng giai thừa từ 1 đến n+1 và cộng dồn vào tổng S
package lab3;
import java.util.Scanner;
public class Bt32 {
public static void main(String[] args) {
    int n;
    // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
    try (Scanner sc = new Scanner(System.in)) {
                // Nhập n từ bàn phím
        System.out.print("Nhap n: ");
        n = sc.nextInt();
    }
            // Khởi tạo biến giai thừa với giá trị ban đầu là 1
    int giaithua=1;
            // Khởi tạo biến tổng S
    int sum=0;
            // Duyệt từ 1 đến n+1 để tính tổng các giai thừa
    for (int i=1; i<=n+1; i++) {
                    // Tính giai thừa bằng cách nhân dồn
        giaithua*=i;
                    // Cộng giai thừa hiện tại vào tổng
        sum+=giaithua;
    }
            // In ra kết quả
    System.out.println("S = " + sum);
}//end main
}//end class 
