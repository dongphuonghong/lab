// 32. Tính S = 1! + 2! + 3! + ... + n!
// Tổng giai thừa từ 1! đến n!
package lab3_1;
import java.util.Scanner;
public class bt32 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        // Khởi tạo biến giai thừa ban đầu là 1
        int giaithua = 1;
        // Khởi tạo biến sum để lưu tổng các giai thừa giá trị = 0
        int sum = 0;
        int i = 1;        
        // Tính tổng các giai thừa từ 1! đến n!
        while (i <= n) {
            // Cập nhật giai thừa tại bước i
            giaithua *= i; 
            // Cộng giai thừa hiện tại vào tổng
            sum += giaithua; 
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }
        // In kết quả tổng S(n)
        System.out.println("S = " + sum);
    } // end main
} // end class