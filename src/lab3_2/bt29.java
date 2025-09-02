// 29. Tính P(n) = 1 × 3 × 5 × ... × (2n + 1) với n >= 0 (tích các số lẻ).
package lab3_2;

import java.util.Scanner;

public class Bt29 {
    public static void main(String[] args) {
        // Nhập số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
        }
        // Tính tích các số lẻ từ 1 đến (2n+1)
        int tich = 1;
        int i = 0;
        do {
            // Tính số lẻ thứ i theo công thức: 2*i + 1
            int soLe = (2 * i) + 1; // Tạo số lẻ thứ i (1, 3, 5, ...)
            // Nhân vào tích
            tich *= soLe;
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        } while (i <= n);

        System.out.println("P(" + n + ") = " + tich);
    } // end main
} // end class Bt29
