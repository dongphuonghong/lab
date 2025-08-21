// 34. Tính S(n) = 1/1 + 1/2 + 1/3 + ... + 1/n, với n >= 1
package lab3_3;

import java.util.Scanner;

public class Bt34 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n = nhap("Nhap n >0");
        // Gọi hàm tính tổng phân số
        double sum = tinhTongPhanSo(n);
        // In kết quả
        System.out.println("Tong S = " + sum);
    }// end main
     // Hàm nhập số nguyên dương từ bàn phím
     // Nếu nhập n <= 0 sẽ yêu cầu nhập lại
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

    // Hàm tính tổng phân số: S(n) = 1/1 + 1/2 + 1/3 + ... + 1/n
    // Sử dụng vòng lặp để tính tổng từ 1/1 đến 1/n
    // Ép kiểu double để có kết quả chính xác
    // Trả về tổng S(n)
    public static double tinhTongPhanSo(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
        }
        return sum;
    }

}// end class
