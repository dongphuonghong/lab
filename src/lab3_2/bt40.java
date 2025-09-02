// 40. Tính P(x, n) = x^1 + x^2 + x^3 + ... + x^n (tổng lũy thừa của x).
package lab3_2;

import java.util.Scanner;

public class Bt40 {
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
        // Tính tổng P(x,n) = x¹ + x² + x³ + ... + xⁿ
        // Khởi tạo biến sum để lưu tổng, bắt đầu từ 0
        // Biến luythua để lưu lũy thừa, bắt đầu từ 1
        double sum = 0;
        double luythua = 1; // Biến lưu x^i
        int i = 1;

        do {
            luythua *= x; // Tính x^i
            sum += luythua; // Cộng x^i vào tổng
            i++;
        } while (i <= n);
        // In kết quả tổng P(x, n)
        System.out.println("Tổng P(x, n) = " + sum);
    } // end main
} // end class Bt40
