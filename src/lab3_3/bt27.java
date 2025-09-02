/**
 * Bài 27: Kiểm tra n có phải số hoàn thiện (perfect number).
 */
package lab3_3;

import java.util.Scanner;

public class Bt27 {
    public static void main(String[] args) {
        // Khai báo biến n kiểu int
        // Sử dụng hàm nhập để lấy giá trị n từ người dùng
        int n = nhap("Nhap so nguyen duong N: ");
        // Gọi hàm kiểm tra số hoàn thiện
        // Nếu hàm trả về true thì in ra n là số hoàn thiện
        // Nếu hàm trả về false thì in ra n không phải là số hoàn thiện
        if (kiemTraSoHoanThien(n)) {
            System.out.println(n + " la so hoan thien");
        } else {
            System.out.println(n + " khong phai la so hoan thien");
        }
    }// end main
     // đây là Hàm nhập số nguyên dương từ bàn phím
     // nếu nhập n nhỏ hơn 0 sẽ yêu cầu nhập lại
     // nếu nhập đúng sẽ trả về giá trị n

    /**
     * Nhập số nguyên dương n từ bàn phím (n >= 0).
     * 
     * @param chuoi thông báo nhắc nhập
     * @return giá trị n hợp lệ
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

    // đây là Hàm kiểm tra số hoàn thiện
    // Một số hoàn thiện là một số có tổng các ước số của nó (không kể nó) bằng
    // chính nó.
    // Ví dụ: 6 là số hoàn thiện vì 1 + 2 + 3 = 6 (các ước số của 6 không kể 6)
    // Ví dụ: 28 là số hoàn thiện vì 1 + 2 + 4 + 7 + 14 = 28
    /**
     * Kiểm tra một số có phải là số hoàn thiện.
     * 
     * @param n số nguyên dương
     * @return true nếu n là số hoàn thiện, false nếu không
     */
    public static boolean kiemTraSoHoanThien(int n) {
        int sum = 0; // Tổng các ước số của n (không kể n)
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n; // Kiểm tra tổng ước số có bằng n không
    }
}// end class
