// 29. Tính P(n) = 1 × 3 × 5 × ... × (2n+1), với n >= 0 
package lab3_3;

import java.util.Scanner;

public class Bt29 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n = nhap("nhap n >0");
        // Gọi hàm tính tích các số lẻ
        int t = tinhTichLe(n);
        // In kết quả
        System.out.println("t = " + t);
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

    // Hàm tính tích các số lẻ: P(n) = 1 × 3 × 5 × ... × (2n+1)
    // Với mỗi i từ 0 đến n, tính (2*i + 1) và nhân vào tích
    /**
     * Tính P(n) = 1×3×5×...×(2n+1).
     * 
     * @param n số nguyên không âm
     * @return tích các số lẻ đến 2n+1
     */
    public static int tinhTichLe(int n) {
        int t = 1;
        for (int i = 0; i <= n; i++) {
            int sum = (2 * i) + 1;
            t *= sum;
        }
        return t;
    }
}// end class
