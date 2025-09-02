/**
 * Bài 66 (lab6_1): Nhập mảng một chiều số nguyên và in ra (Arrays.toString).
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

    /**
     * Nhập vào một số nguyên dương n (>0) từ bàn phím.
     * Lặp lại cho đến khi người dùng nhập hợp lệ.
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
     * Nhập giá trị cho từng phần tử của mảng từ bàn phím.
     * 
     * @param a mảng số nguyên cần nhập dữ liệu
     */
    public static void nhapMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    /**
     * In các phần tử của mảng trên một dòng.
     * 
     * @param a mảng số nguyên cần in
     */
    public static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}// end class