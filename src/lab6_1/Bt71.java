// 71. Viết chương trình nhập vào mảng một chiều các số nguyên và in các phần tử lẻ.
/*
 * Bt71.java
 * Nhập mảng và in các số lẻ có trong mảng.
 * Mô tả: Yêu cầu nhập n (>0), đọc n số nguyên, sau đó in các phần tử lẻ.
 */
package lab6_1;

import java.util.Scanner;

public class Bt71 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = nhap("Nhap n >0");
        int[] a = new int[n];
        nhapMang(a);
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

    public static void nhapMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] a) {
        boolean flag = false;
        for (int value : a) {
            if (laSoLe(value)) {
                if (!flag) {
                    System.out.print("Cac so le trong mang: ");
                    flag = true;
                }
                System.out.print(value + " ");

            }
        }
        if (!flag) {
            System.out.println("Khong co so le trong mang.");
        }
        System.out.println();
    }

    public static boolean laSoLe(int x) {
        return x % 2 != 0;
    }
}// end class