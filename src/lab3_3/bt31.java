/**
 * Bài 31: Tính S(n) = 1 - 2 + 3 - 4 + ... ± n (dãy xen kẽ dấu) với n >= 0.
 */
package lab3_3;

import java.util.Scanner;

public class Bt31 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n = nhap("Nhap n >0");
        // Gọi hàm tính tổng dãy xen kẽ
        int sum = tinhTong(n);
        // In kết quả
        System.out.println("Tong S = " + sum);
    }// end main
     // Hàm nhập số nguyên dương từ bàn phím
     // Nếu nhập n < 0 sẽ yêu cầu nhập lại
     // Trả về giá trị n hợp lệ

    /**
     * Nhập số nguyên dương n (>=0).
     * 
     * @param chuoi thông báo nhắc nhập
     * @return n hợp lệ
     */
    public static int nhap(String chuoi) {
        int n;
        System.out.println(chuoi);
        do {
            try (Scanner sc = new Scanner(System.in)) {
                n = sc.nextInt();
                if (n >= 0) {
                    return n;
                }
                System.out.println("ban vui long nhap lai n >0");
            }
        } while (true);
    }

    // Hàm tính tổng dãy xen kẽ: S(n) = 1 - 2 + 3 - 4 + ... ± n
    // Nếu i chẵn thì cộng, nếu i lẻ thì trừ
    // Trả về tổng S(n)
    /**
     * Tính S(n) = 1 - 2 + 3 - 4 + ... ± n.
     * 
     * @param n số nguyên không âm
     * @return tổng S(n)
     */
    public static int tinhTong(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        return sum;
    }
}// end class
