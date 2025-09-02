/**
 * Bài 26: Đếm số lượng ước số của N (ví dụ N=12 có 6 ước: 1,2,3,4,6,12).
 */
package lab3_3;

import java.util.Scanner;

public class Bt26 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n = nhap("nhap n >0");
        // Gọi hàm đếm ước số để tính số lượng ước số của n
        int d = demUocSo(n);
        // In kết quả
        System.out.println("Tong cac uoc so cua " + n + " la: " + d);
    }// end main
     // Hàm nhập số nguyên dương từ bàn phím
     // Nếu nhập n <= 0 sẽ yêu cầu nhập lại
     // Trả về giá trị n hợp lệ

    /**
     * Nhập số nguyên dương n từ bàn phím (n >= 0).
     * 
     * @param chuoi thông báo nhắc nhập
     * @return n >= 0 hợp lệ
     */
    public static int nhap(String chuoi) {
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

    // Hàm đếm số ước số của số nguyên dương n
    // Duyệt từ 1 đến n, đếm số lượng số chia hết cho n
    // Trả về số lượng ước số
    /**
     * Đếm số lượng ước số của n.
     * 
     * @param n số nguyên dương
     * @return số lượng ước của n
     */
    public static int demUocSo(int n) {
        int d = 0; // Biến đếm số lượng ước số
        // Duyệt từ 1 đến n để tìm các ước số
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // Nếu i là ước số của n
                d++;
            }
        }
        return d;
    }
}// end class
