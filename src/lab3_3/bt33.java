// 33. Tính S(n) = 1² + 2² + 3² + ... + n², với n >= 1
package lab3_3;

import java.util.Scanner;

public class Bt33 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n = nhap("Nhap n >0");
        // Gọi hàm tính tổng bình phương
        int sum = tinhTongBinhPhuong(n);
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

    // Hàm tính tổng bình phương: S(n) = 1² + 2² + 3² + ... + n²
    // Sử dụng vòng lặp để tính tổng từ 1² đến n²
    // Trả về tổng S(n)
    /**
     * Tính S(n) = 1^2 + 2^2 + ... + n^2.
     * 
     * @param n số nguyên dương
     * @return tổng bình phương
     */
    public static int tinhTongBinhPhuong(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}// end class
