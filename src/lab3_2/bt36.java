// 36. Tính S = 1² + 2³ + 3⁴ + ... + n^(n+1) (Tổng lũy thừa tăng dần)
package lab3_2;
import java.util.Scanner;
public class bt36 {
    public static void main(String[] args) {
        // Nhập số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
        }

        // Tính tổng i^(i+1) từ i=1 đến n
        // Khởi tạo biến sum để lưu tổng S
        int sum = 0;
        int i = 1;
        do {
             // Cộng i^(i+1)
            sum += Math.pow(i, i + 1);
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        } while (i <= n);
        // In kết quả tổng S(n)
        System.out.println("Tổng S = " + sum);
    } // end main
} // end class bt36