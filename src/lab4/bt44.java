/**
 * Bài 44: Tính diện tích và chu vi hình tròn với bán kính nhập từ bàn phím.
 * Dùng công thức: S = πr^2, C = 2πr.
 */
package lab4;

import java.util.Scanner;

public class Bt44 {
    public static void main(String[] args) {
        // Nhập bán kính hình tròn từ bàn phím
        double banKinh = nhap("Nhập bán kính: ");
        // Gọi hàm tính diện tích và chu vi hình tròn
        double dienTich = tinhDienTich(banKinh);
        double chuVi = tinhChuVi(banKinh);
        // In kết quả của diện tích và chu vi hình tròn
        System.out.println("Diện tích hình tròn là: " + dienTich);
        System.out.println("Chu vi hình tròn là: " + chuVi);
        // Đóng Scanner để giải phóng tài nguyên
        sc.close();
    }// end main
     // đây là Hàm nhập số thực từ bàn phím

    static Scanner sc = new Scanner(System.in);

    /**
     * Nhập một số thực từ bàn phím.
     * 
     * @param chuoi thông báo nhắc nhập
     * @return giá trị double nhập vào
     */
    public static double nhap(String chuoi) {
        System.out.print(chuoi);
        return sc.nextDouble();
    }

    // đây là Hàm tính diện tích hình tròn:được tính theo công thức S = π * r^2
    /**
     * Tính diện tích hình tròn.
     * 
     * @param banKinh bán kính r
     * @return diện tích πr^2
     */
    public static double tinhDienTich(double banKinh) {
        return Math.PI * banKinh * banKinh;
    }

    // đây là Hàm tính chu vi hình tròn: được tính theo công thức C = 2 * π * r
    /**
     * Tính chu vi hình tròn.
     * 
     * @param banKinh bán kính r
     * @return chu vi 2πr
     */
    public static double tinhChuVi(double banKinh) {
        return 2 * Math.PI * banKinh;
    }
}// end class
