/**
 * Bài 56: Nhập số nguyên dương n gồm 5 chữ số và kiểm tra n có đối xứng (palindrome) hay không.
 * Ví dụ: 13531 đối xứng, 13921 không đối xứng.
 */
package lab5;

import java.util.Scanner;

/**
 * Lớp Bt56: Kiểm tra một số nguyên dương gồm 5 chữ số có phải là số đối xứng.
 */
public class Bt56 {
    /**
     * Bài 56: Kiểm tra số nguyên dương gồm 5 chữ số có đối xứng (palindrome) hay
     * không.
     * Người dùng nhập n trong khoảng [10000, 99999], chương trình kiểm tra và thông
     * báo kết quả.
     */
    /**
     * Điểm vào chương trình.
     *
     * @param args tham số dòng lệnh (không sử dụng)
     */
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
        /**
         * Nhập số nguyên dương gồm 5 chữ số từ bàn phím.
         * Lặp lại cho đến khi n nằm trong khoảng hợp lệ [10000, 99999].
         *
         * @param chuoi thông báo nhắc nhập
         * @return giá trị n hợp lệ trong [10000, 99999]
         */
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
    /**
     * Kiểm tra số nguyên 5 chữ số có phải là số đối xứng (palindrome).
     *
     * @param n số nguyên gồm 5 chữ số
     * @return true nếu n đối xứng, ngược lại false
     */
    public static boolean kiemTraDoiXung(int n) {
        int trucNgan = n / 10000;
        int Ngan = (n / 1000) % 10;
        int chuc = (n / 10) % 10;
        int donVi = n % 10;
        return (trucNgan == donVi && Ngan == chuc);
    }
}// end class
