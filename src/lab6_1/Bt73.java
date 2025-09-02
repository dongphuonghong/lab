/**
 * Bài 73 (lab6_1): Nhập mảng và in các số nguyên tố.
 */
package lab6_1;

import java.util.Scanner;

public class Bt73 {
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
     * Kiểm tra một số có phải là số nguyên tố.
     * 
     * @param x số cần kiểm tra
     * @return true nếu x là số nguyên tố; false nếu không
     */
    public static boolean laSoNguyenTo(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * In các số nguyên tố trong mảng hoặc thông báo nếu không có.
     * 
     * @param a mảng số nguyên cần duyệt
     */
    public static void xuatMang(int[] a) {
        boolean flag = false;
        for (int value : a) {
            if (laSoNguyenTo(value)) {
                if (!flag) {
                    System.out.print("Cac so nguyen to trong mang: ");
                    flag = true; // Đánh dấu đã tìm thấy ít nhất một số nguyên tố
                }
                System.out.print(value + " ");
            }
        }
        if (!flag) {
            System.out.println("Khong co so nguyen to trong mang.");
        }
        System.out.println();
    }
}// end class
