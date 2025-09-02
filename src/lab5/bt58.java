// 58. Viết chương trình nhập số nguyên dương n gồm k chữ số, đếm xem n có bao nhiêu chữ số là số nguyên tố.
package lab5;

import java.util.Scanner;

public class Bt58 {
    public static void main(String[] args) {
        // Nhập số nguyên dương từ bàn phím
        int n = nhap("Nhap so nguyen duong n: ");
        // Đếm và thông báo số lượng chữ số nguyên tố
        int d = demSoNguyenTo(n);
        System.out.println("So luong chu so nguyen to trong " + n + " la: " + d);
    }// end main
    // Hàm nhập số nguyên dương từ bàn phím
    // Kiểm tra điều kiện n > 0
    // Trả về số nguyên hợp lệ

    public static int nhap(String chuoi) {
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

    // Hàm kiểm tra số nguyên tố
    // Số nguyên tố: số tự nhiên lớn hơn 1, chỉ chia hết cho 1 và chính nó
    // Các chữ số nguyên tố: 2, 3, 5, 7
    // Tham số: n - số cần kiểm tra
    // Trả về: true nếu là số nguyên tố, false nếu không phải
    public static boolean kiemTraNguyenTo(int n) {
        boolean flag = true;
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    // Hàm đếm số lượng chữ số nguyên tố trong một số nguyên dương
    // Tham số: n - số nguyên dương cần kiểm tra
    // Trả về: số lượng chữ số nguyên tố trong n
    public static int demSoNguyenTo(int n) {
        int d = 0;
        while (n > 0) {
            int chuSo = n % 10;
            if (kiemTraNguyenTo(chuSo)) {
                d++;
            }
            n /= 10; // Loại bỏ chữ số cuối cùng
        }
        return d;
    }
}// end class
