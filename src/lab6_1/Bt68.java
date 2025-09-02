// 68. Viết chương trình phát sinh ngẫu nhiên mảng một chiều các số nguyên âm.
/*
 * Bt68.java
 * Sinh mảng số nguyên âm ngẫu nhiên.
 * Mô tả: Yêu cầu nhập n (>0), chương trình điền mảng với các số âm ngẫu nhiên
 * (ví dụ: -rand.nextInt(99)-1) rồi in ra.
 */
package lab6_1;

import java.util.Random;
import java.util.Scanner;

public class Bt68 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = nhap("Nhap n >0");
        int[] a = new int[n];
        nhapMang(a);
        xuatMang(a);
        sc.close();
    }// end main

    /**
     * Hàm `nhap`: nhập số lượng phần tử n (> 0) từ bàn phím.
     * Lặp lại cho đến khi nhập đúng giá trị hợp lệ.
     *
     * @param chuoi thông báo hướng dẫn nhập
     * @return số nguyên n (> 0)
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
     * Hàm `nhapMang`: điền mảng `a` với các số nguyên âm ngẫu nhiên.
     *
     * @param a mảng số nguyên cần điền
     */
    public static void nhapMang(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu a[" + i + "]: ");
            a[i] = -rand.nextInt(99) - 1;
        }
    }

    /**
     * Hàm `xuatMang`: in mảng `a` ra màn hình.
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