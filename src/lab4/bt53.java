// 53. Viết chương trình nhập 2 số nguyên dương a, b. Tìm ƯSCLN và BCNN của hai số đó.
package lab4;

import java.util.Scanner;

public class Bt53 {
    public static void main(String[] args) {
        // Nhập hai số nguyên dương a và b từ bàn phím
        // Sử dụng hàm nhập để lấy giá trị a và b từ người dùng
        int a = nhap("Nhap a: ");
        int b = nhap("Nhap b: ");
        // gọi hàm ucln để tính ước số chung lớn nhất
        int ucln = ucln(a, b);
        // gọi hàm bcnn để tính bội số chung nhỏ nhất
        int bcnn = bcnn(a, b);
        // in kết quả
        System.out.println("UCLN cua " + a + " va " + b + " la: " + ucln);
        System.out.println("BCNN cua " + a + " va " + b + " la: " + bcnn);
        sc.close();
    }// end main
     // đây là hàm nhập số nguyên từ bàn phím

    static Scanner sc = new Scanner(System.in);

    /**
     * Nhập số nguyên từ bàn phím.
     * 
     * @param chuoi thông báo nhắc nhập
     * @return giá trị int nhập
     */
    public static int nhap(String chuoi) {

        System.out.print(chuoi);
        return sc.nextInt();
    }

    // Hàm tính ước số chung lớn nhất (UCLN) bằng thuật toán Euclid
    /**
     * Tính UCLN của hai số bằng thuật toán Euclid.
     * 
     * @param a số thứ nhất
     * @param b số thứ hai
     * @return UCLN
     */
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int ucln = a;
        return ucln;
    }

    // Hàm tính bội số chung nhỏ nhất (BCNN) = (a * b) / UCLN(a, b)
    /**
     * Tính BCNN của hai số.
     * 
     * @param a số thứ nhất
     * @param b số thứ hai
     * @return BCNN
     */
    public static int bcnn(int a, int b) {
        int ucln = ucln(a, b);
        return (a * b) / ucln;
    }
}// end class
