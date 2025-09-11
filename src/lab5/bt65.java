/**
 * Bài 65: Nhập số nguyên không âm (tối đa 32-bit) và in giá trị nhị phân.
 * Dựa trên chia lấy dư cho 2 và đảo chuỗi kết quả.
 */
package lab5;

import java.util.Scanner;

public class Bt65 {
    public static void main(String[] args) {
        // Nhập số nguyên không âm từ bàn phím
        int n = nhap("Nhap n >= 0: ");
        // Chuyển đổi và in giá trị nhị phân
        String binary = chuyenSangNhiPhan(n);
        System.out.println("Gia tri nhi phan cua " + n + " la: " + binary);
    }// end main

    // Hàm nhập số nguyên không âm từ bàn phím
    // Kiểm tra điều kiện n >= 0
    // Trả về số nguyên hợp lệ
    public static int nhap(String chuoi) {
        /**
         * Nhập số nguyên không âm n.
         *
         * @param chuoi thông báo nhắc nhập
         * @return n hợp lệ (>= 0)
         */
        int n;
        System.out.println(chuoi);
        do {
            try (Scanner sc = new Scanner(System.in)) {
                n = sc.nextInt();
                if (n >= 0) {
                    return n;
                }
                System.out.println("Ban vui long nhap lai n >= 0");
            }
        } while (true);
    }

    // Hàm chuyển đổi số thập phân sang nhị phân
    // Sử dụng phương pháp chia liên tiếp cho 2 và lấy phần dư
    // Các bit được tạo ra theo thứ tự ngược (từ LSB đến MSB)
    // Tham số: n - số thập phân cần chuyển đổi
    // Trả về: chuỗi biểu diễn nhị phân
    /**
     * Chuyển số thập phân không âm sang biểu diễn nhị phân.
     *
     * @param n số nguyên không âm cần chuyển đổi
     * @return chuỗi biểu diễn nhị phân của n
     */
    public static String chuyenSangNhiPhan(int n) {
        StringBuilder binary = new StringBuilder();
        if (n == 0) {
            return "0";
        }
        while (n > 0) {
            binary.append(n % 2);
            n /= 2;
        }
        return binary.reverse().toString();
    }
}// end class
