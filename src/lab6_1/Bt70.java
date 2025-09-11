/**
 * Bài 70 (lab6_1): Nhập mảng và in các phần tử âm (nếu có).
 */
package lab6_1;

import java.util.Scanner;

public class Bt70 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = nhap("Nhap n >0");
        int[] a = new int[n];
        nhapMang(a);
        System.out.println("Cac phan tu am trong mang: ");
        inPhanTuAm(a);
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
     * In các phần tử âm trong mảng.
     * 
     * @param a mảng số nguyên
     */ 
    public static void inPhanTuAm(int[] a) {
        
boolean flag = false;
        for(int i: a) {
            if(i < 0) {
                System.out.print(i + " ");
                flag = true;
            }
        }
        if(!flag) {
            System.out.print("Khong co phan tu am");
        }
        System.out.println();
    }

}// end class