// 47. Nhập số nguyên dương n (n > 0). Đếm xem có bao nhiêu số hoàn thiện < n.
package lab4;

import java.util.Scanner;

public class Bt47 {
    public static void main(String[] args) {
        // gọi hàm nhập số nguyên dương n từ bàn phím
        int n = nhap("Nhap n >0");
        // gọi hàm đếm số hoàn thiện nhỏ hơn n
        int d = demSoHoanThien(n);
        // in kết quả
        System.out.println("Cac so hoan thien < " + n + " la: " + d);
    }// end main
     // đây là Hàm nhập số nguyên dương từ bàn phím
     // Nếu nhập n < 0 sẽ yêu cầu nhập lại
     // Trả về giá trị n hợp lệ

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

    // đây là Hàm kiểm tra số hoàn thiện: Số hoàn thiện là số mà tổng các ước số của
    // nó (không kể chính nó) bằng chính nó
    // Ví dụ: 6 là số hoàn thiện vì 1 + 2 + 3 = 6 (các ước số của 6 không kể 6)
    /**
     * Kiểm tra số hoàn thiện.
     * 
     * @param n số cần kiểm tra
     * @return true nếu là số hoàn thiện
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

    // đây là hàm đếm số hoàn thiện nhỏ hơn n
    /**
     * Đếm số hoàn thiện nhỏ hơn n.
     * 
     * @param n cận trên (không bao gồm)
     * @return số lượng số hoàn thiện < n
     */
    public static int demSoHoanThien(int n) {
        int d = 0;
        for (int i = 1; i < n; i++) {
            if (kiemTraSoHoanThien(i)) {
                d++;
            }
        }
        return d;
    }
}// end class
