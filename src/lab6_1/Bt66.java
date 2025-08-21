// 66. Viết chương trình nhập vào và xuất ra mảng một chiều các số nguyên.
/*
 * Bt66.java
 * Nhập mảng một chiều số nguyên và in ra mảng.
 * Mô tả: Yêu cầu nhập n (>0), chương trình đọc n số nguyên từ bàn phím
 * và in mảng vừa nhập ra màn hình.
 */

package lab6_1;

import java.util.Scanner;
import java.util.Arrays;

public class Bt66 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = nhap("Nhap n >0");
        int[] a = new int[n];
        nhapMang(a);
        // xuatMang(a);
        System.out.println("Mang da nhap la: " + Arrays.toString(a));
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

    public static void nhapMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}// end class