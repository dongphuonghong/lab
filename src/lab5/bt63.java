/**
 * Bài 63: Nhập n và in các số hoàn thiện nhỏ hơn 5000 (nếu n < 5000 thì in theo n, ngược lại thông báo).
 */
package lab5;

import java.util.Scanner;

public class Bt63 {
    public static void main(String[] args) {
        // Nhập số nguyên dương từ bàn phím
        int n = nhap("Nhap n > 0: ");
        // In các số hoàn thiện nhỏ hơn 5000
        if (n < 5000) {
            System.out.println("Cac so hoan thien nho hon " + n + " la: ");
            inSoHoanThienNhoHon5000();
        } else {
            System.out.println("Khong co so hoan thien nao nho hon " + n);
        }
    }// end main
     // Hàm nhập số nguyên dương từ bàn phím
     // Kiểm tra điều kiện n >= 0
     // Trả về số nguyên hợp lệ

    public static int nhap(String chuoi) {
        /**
         * Nhập số nguyên dương n (>= 0).
         *
         * @param chuoi thông báo nhắc nhập
         * @return n hợp lệ (>= 0)
         */
        int n;
        do {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println(chuoi);
                n = sc.nextInt();
                if (n >= 0) {
                    return n;
                }
                System.out.println("ban vui long nhap lai n >0");
            }
        } while (true);
    }

    // Hàm kiểm tra số hoàn thiện
    // Số hoàn thiện: số có tổng các ước số (không kể chính nó) bằng chính nó
    // Ví dụ: 6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14
    // Tham số: n - số cần kiểm tra
    // Trả về: true nếu là số hoàn thiện, false nếu không phải
    /**
     * Kiểm tra n có phải là số hoàn thiện (perfect number).
     *
     * @param n số nguyên dương cần kiểm tra
     * @return true nếu n là số hoàn thiện; ngược lại false
     */
    public static boolean kiemTraSoHoanThien(int n) {
        int sum = 0; // Tổng các ước số của n (không kể n)
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    /**
     * In ra các số hoàn thiện nhỏ hơn 5000.
     */
    public static void inSoHoanThienNhoHon5000() {
        for (int i = 1; i < 5000; i++) {
            if (kiemTraSoHoanThien(i)) {
                System.out.print(i + " ");
            }
        }
    }
}// end class
