// 33. Tính S = 1² + 2² + 3² + ... + n² (Tổng bình phương các số tự nhiên)
package lab3_2;
import java.util.Scanner;
public class bt33 {
    public static void main(String[] args) {
        // Nhập số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
        }
        // Tính tổng bình phương các số từ 1 đến n
        // Khởi tạo biến sum để lưu tổng, bắt đầu từ 0
        int sum = 0;
        int i = 1;
        do {
            // Cộng bình phương của i
            sum += i * i; 
            i++;
        } while (i <= n);
        // In kết quả tổng S(n)
        System.out.println("Tổng S = " + sum);
    } // end main
} // end class bt33