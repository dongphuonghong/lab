/**
 * Bài 67 (lab6_1): Khởi tạo mảng số nguyên n phần tử (mặc định 0) và in ra.
 */
package lab6_1;

import java.util.Scanner;

public class Bt67 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = nhap("Nhap n >0");
        int[] a = new int[n];
        xuatMang(a);
        sc.close();
    }// end main

    /**
     * Nhập vào số nguyên dương n (>0) để khởi tạo mảng.
     * 
     * @param chuoi thông báo hướng dẫn nhập
     * @return giá trị n > 0
     */
    public static int nhap(String chuoi) {
        int n;
        do {
            System.out.println(chuoi);
            n = sc.nextInt();
            if (n > 0) {
                return n;
            }
            System.out.println("ban vui long nhap lai n >0");
        } while (true);
    }

    /**
     * In tất cả phần tử của mảng (giá trị mặc định 0).
     * 
     * @param a mảng số nguyên cần in
     */
    public static void xuatMang(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}// end class