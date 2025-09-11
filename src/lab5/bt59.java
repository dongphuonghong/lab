/**
 * Bài 59: Nhập số nguyên dương n và tính tổng các ước số của n (gồm cả n).
 * Ví dụ: n=6 => 1+2+3+6 = 12.
 */
package lab5;

import java.util.Scanner;

public class Bt59 {
    public static void main(String[] args) {
        // Nhập số nguyên dương từ bàn phím
        int n = nhap("Nhap n > 0: ");
        // Tính và thông báo tổng các ước số
        int sum = tinhTongUocSo(n);
        System.out.println("Tong cac uoc so cua " + n + " la: " + sum);
    }// end main

    // Hàm nhập số nguyên dương từ bàn phím
    // Kiểm tra điều kiện n > 0
    // Trả về số nguyên hợp lệ
    public static int nhap(String chuoi) {
        /**
         * Nhập số nguyên dương n (> 0) từ bàn phím.
         *
         * @param chuoi thông báo nhắc nhập
         * @return n hợp lệ (> 0)
         */
        int n;
        do {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println(chuoi);
                n = sc.nextInt();
                if (n > 0) {
                    return n;
                }
                System.out.println("ban vui long nhap lai n >0");
            }
        } while (true);
    }

    // Hàm tính tổng các ước số của n
    // Ước số của n: số tự nhiên chia hết cho n
    // Duyệt từ 1 đến n, tìm các số chia hết cho n và cộng dồn
    // Tham số: n - số nguyên dương
    // Trả về: tổng các ước số của n
    /**
     * Tính tổng các ước số của n (bao gồm cả n).
     *
     * @param n số nguyên dương
     * @return tổng các ước số của n
     */
    public static int tinhTongUocSo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // Nếu i là ước số của n
                sum += i;
            }
        }
        // Trả về tổng các ước số
        return sum;
    }
}// end class
