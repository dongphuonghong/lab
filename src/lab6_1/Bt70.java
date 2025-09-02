// 70. Viết chương trình nhập vào mảng một chiều các số nguyên và in các phần tử âm.
/*
 * Bt70.java
 * Nhập mảng và in các phần tử âm trong mảng.
 * Mô tả: Yêu cầu nhập n (>0), đọc n số nguyên, sau đó in các phần tử < 0 (nếu có).
 */
package lab6_1;

import java.util.Scanner;

public class Bt70 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = nhap("Nhap n >0");
        int[] a = new int[n];
        nhapMang(a);
        xuatMang(a);
        sc.close();
    }// end main

    /**
     * Nhập số nguyên dương n (>0) từ bàn phím.
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
     * Nhập từng phần tử của mảng từ bàn phím.
     * 
     * @param a mảng số nguyên cần nhập
     */
    public static void nhapMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    /**
     * In các phần tử âm trong mảng (nếu có), nếu không có báo không tồn tại.
     * 
     * @param a mảng số nguyên cần kiểm tra
     */
    public static void xuatMang(int[] a) {
        boolean flag = false;
        for (int value : a) {
            if (kiemTraAm(value)) {
                if (!flag) {
                    System.out.print("Mang co cac phan tu am: ");
                    flag = true;
                }
                System.out.print(value + " ");
            }
        }
        if (!flag) {
            System.out.print("Mang khong co phan tu am");
        }
        System.out.println();
    }

    /**
     * Kiểm tra giá trị có âm không.
     * 
     * @param x số cần kiểm tra
     * @return true nếu x < 0
     */
    public static boolean kiemTraAm(int x) {
        return x < 0;
    }
}// end class