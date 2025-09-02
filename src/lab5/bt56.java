// 56. Viết chương trình nhập số nguyên dương n gồm 5 chữ số, kiểm tra xem các chữ số n có phải là số đối xứng hay không.
// Ví dụ: Đối xứng: 13531, Không đối xứng: 13921
package lab5;

import java.util.Scanner;

public class Bt56 {
    public static void main(String[] args) {
        // Nhập số nguyên dương gồm 5 chữ số từ bàn phím
        int n = nhap("Nhap so nguyen duong n gom 5 chu so: ");
        // Kiểm tra và thông báo kết quả
        if (kiemTraDoiXung(n)) {
            System.out.println(n + " la so doi xung");
        } else {
            System.out.println(n + " khong phai la so doi xung");
        }
    }// end main
    // Hàm nhập số nguyên dương gồm 5 chữ số
    // Kiểm tra điều kiện: 10000 <= n <= 99999
    // Trả về số nguyên hợp lệ

    public static int nhap(String chuoi) {
        int n;
        do {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println(chuoi);
                n = sc.nextInt();
                if (n >= 10000 && n <= 99999) {
                    return n;
                }
                System.out.println("ban vui long nhap lai n >0");
            }
        } while (true);
    }

    // Hàm kiểm tra số đối xứng (palindrome) gồm 5 chữ số
    // Số đối xứng: chữ số đầu = chữ số cuối, chữ số thứ 2 = chữ số thứ 4
    // Ví dụ: 12321 → 1=1, 2=2 → đối xứng
    // Tham số: n - số nguyên gồm 5 chữ số
    // Trả về: true nếu đối xứng, false nếu không đối xứng
    public static boolean kiemTraDoiXung(int n) {
        int trucNgan = n / 10000;
        int Ngan = (n / 1000) % 10;
        int chuc = (n / 10) % 10;
        int donVi = n % 10;
        return (trucNgan == donVi && Ngan == chuc);
    }
}// end class
