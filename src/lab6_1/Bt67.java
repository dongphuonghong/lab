// 67. Viết chương trình khởi tạo mảng một chiều các số nguyên với giá trị mặc định 0.
/*
 * Bt67.java
 * Khởi tạo mảng một chiều số nguyên có n phần tử và in mảng.
 * Mô tả: Yêu cầu nhập n (>0), chương trình tạo mảng mới (giá trị mặc định 0)
 * và in mảng ra màn hình.
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

    public static void xuatMang(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}// end class