/**
 * Bài 72 (lab6_1): Nhập mảng và in các phần tử chẵn nhỏ hơn 20.
 */
package lab6_1;

import java.util.Scanner;

public class Bt72 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = nhap("Nhap n >0");
        int[] a = new int[n];
        nhapMang(a);
        System.out.println("Cac phan tu chan nho hon 20 la: ");
        inPhanTuChanNhoHon20(a);
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
     * Nhập từng phần tử của mảng.
     * 
     * @param a mảng cần nhập
     */
    public static void nhapMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    /**
     * In các phần tử chẵn nhỏ hơn 20 của mảng.
     * 
     * @param a mảng cần in
     */
    public static void inPhanTuChanNhoHon20(int[] a) {
        for(int i: a){
            if(i % 2 == 0 && i < 20){
                System.out.print(i + " ");
            }
        }
    }

}// end class