// 69. Viết chương trình phát sinh ngẫu nhiên mảng một chiều số nguyên có thứ tự tăng dần.
/*
 * Bt69.java
 * Sinh mảng số nguyên tăng dần một cách ngẫu nhiên.
 * Mô tả: Yêu cầu nhập n (>0), chương trình sinh giá trị bắt đầu ngẫu nhiên
 * và tạo dãy tăng dần bằng cách cộng các bước dương ngẫu nhiên.
 */
package lab6_1;

import java.util.Random;
import java.util.Scanner;

public class Bt69 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = nhap("Nhap n >0");
        int[] a = new int[n];
        nhapMang(a);
        // xuatMang(a);

    }// end main

    /**
     * Nhập số nguyên dương n (>0) từ bàn phím.
     * Lặp lại cho đến khi hợp lệ.
     * 
     * @param chuoi thông báo hướng dẫn
     * @return n > 0
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
     * Sinh mảng số nguyên tăng dần bằng cách tạo phần tử đầu ngẫu nhiên rồi cộng
     * bước dương.
     * 
     * @param a mảng cần điền giá trị tăng dần
     */
    public static void nhapMang(int[] a) {
        Random rand = new Random();
        a[0] = rand.nextInt(100) - 50;
        for (int i = 1; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = a[i - 1] + rand.nextInt(99) + 1;
        }
    }

    /**
     * In toàn bộ mảng ra màn hình.
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