// 39. Tính S = 1/1 + 1/(1+2) + 1/(1+2+3) + ... + 1/(1+2+...+n).
package lab3_2;

import java.util.Scanner;

public class Bt39 {
    public static void main(String[] args) {
        // Nhập số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
        }
        // Tính tổng S = 1/1 + 1/(1+2) + 1/(1+2+3) + ... + 1/(1+2+...+n)
        // Khởi tạo biến sum để lưu tổng S(n), kiểu double để tính chính xác
        double sum = 0;
        // Biến lưu tổng 1+2+...+i
        int t = 0;
        int i = 1;

        do {
            // Cộng i vào tổng (t = 1+2+...+i)
            t += i;
            // Cộng 1/t vào tổng S
            sum += (double) 1 / t;
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        } while (i <= n);
        // In kết quả tổng S(n) với 4 chữ số thập phân
        System.out.printf("Tổng S = %.4f", sum);
    } // end main
} // end class Bt39
