/**
 * Bài 60: Nhập số nguyên dương n và tìm ước số lẻ lớn nhất của n.
 * Ví dụ: n=27 => 27.
 */
package lab5;

import java.util.Scanner;

public class Bt60 {
    public static void main(String[] args) {
        // Nhập số nguyên dương từ bàn phím
        int n = nhap("Nhap n > 0: ");
        // Tìm và thông báo ước số lẻ lớn nhất
        int maxLe = timUocSoLeLonNhat(n);
        System.out.println("Uoc so le lon nhat cua " + n + " la: " + maxLe);
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

    // Hàm tìm ước số lẻ lớn nhất của n
    // Duyệt từ 1 đến n, tìm các ước số lẻ và lưu giá trị lớn nhất
    // Số lẻ: số không chia hết cho 2 (n % 2 != 0)
    // Tham số: n - số nguyên dương
    // Trả về: ước số lẻ lớn nhất của n
    /**
     * Tìm ước số lẻ lớn nhất của n.
     *
     * @param n số nguyên dương
     * @return ước số lẻ lớn nhất của n
     */
    public static int timUocSoLeLonNhat(int n) {
        int maxLe = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0 && i > maxLe) {
                maxLe = i;
            }
        }
        return maxLe;
    }
}// end class
