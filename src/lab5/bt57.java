/**
 * Bài 57: Nhập số nguyên dương n (tối đa 5 chữ số) và đếm số chữ số chẵn, lẻ.
 */
package lab5;

import java.util.Scanner;

public class Bt57 {
    /**
     * Bài 57: Đếm số chữ số chẵn và lẻ trong một số nguyên dương (tối đa 5 chữ số).
     */
    public static void main(String[] args) {
        // Nhập số nguyên dương từ bàn phím
        int n = nhap("Nhap so nguyen duong n (1 <= n <= 9999): ");
        // Gọi hàm đếm số chẵn lẻ
        DemSoChanLe(n);
    }// end main
     // Hàm nhập số nguyên dương trong khoảng [1, 9999]
     // Kiểm tra điều kiện và yêu cầu nhập lại nếu không hợp lệ
     // Trả về số nguyên hợp lệ

    /**
     * Nhập số nguyên dương trong khoảng [1, 9999] từ bàn phím.
     *
     * @param chuoi thông báo nhắc nhập
     * @return n hợp lệ trong [1, 9999]
     */
    public static int nhap(String chuoi) {
        int n;
        do {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println(chuoi);
                n = sc.nextInt();
                if (n > 1 && n <= 9999) {
                    return n;
                }
                System.out.println("ban vui long nhap lai n >0");
            }
        } while (true);
    }

    // Hàm đếm số chữ số chẵn và lẻ trong một số nguyên
    // Sử dụng phép chia lấy dư (%) để tách từng chữ số
    // In kết quả đếm ra màn hình
    // Tham số: n - số nguyên dương cần đếm
    /**
     * Đếm và in ra số lượng chữ số chẵn và chữ số lẻ của n.
     *
     * @param n số nguyên dương cần đếm chữ số chẵn/lẻ
     */
    public static void DemSoChanLe(int n) {
        int demChan = 0;
        int demLe = 0;
        while (n > 0) {
            int chuSo = n % 10;
            if (chuSo % 2 == 0) {
                demChan++;
            } else {
                demLe++;
            }
            n /= 10;
        }
        System.out.println("So chu so chan: " + demChan);
        System.out.println("So chu so le: " + demLe);
    }
}// end class
