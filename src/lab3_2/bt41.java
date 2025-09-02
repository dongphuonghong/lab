// 41. Tính S = x^2 + x^4 + x^6 + ... + x^(2n) (tổng lũy thừa chẵn của x).
package lab3_2;

import java.util.Scanner;

public class Bt41 {
    public static void main(String[] args) {
        // Nhập n và x từ bàn phím
        int n;
        double x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
            System.out.print("Nhập x: ");
            x = sc.nextDouble();
        }
        // Tính tổng S = x² + x⁴ + x⁶ + ... + x^(2n)
        // Khởi tạo biến sum để lưu tổng, bắt đầu từ 0
        double sum = 0;
        int i = 1;
        do {
            // Cộng x^(2i) vào tổng
            sum += Math.pow(x, 2 * i);
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        } while (i <= n);
        // In kết quả tổng S(n, x)
        System.out.printf("Tổng S = %.4f", sum);
    } // end main
} // end class Bt41
