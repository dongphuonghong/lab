// 72. Viết chương trình nhập vào mảng một chiều các số nguyên và in các phần tử chẵn nhỏ hơn 20.
/*
 * Bt72.java
 * Nhập mảng và in các phần tử chẵn nhỏ hơn 20.
 * Mô tả: Yêu cầu nhập n (>0), nhập từng phần tử (có prompt), sau đó in các phần tử chẵn < 20.
 */
package lab6_1;

import java.util.Scanner;

public class Bt72 {
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
            System.out.print("Nhap phan tu a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] a) {
        boolean flag = false;
        for (int value : a) {
            if (laSoChan(value) && value < 20) {
                if (!flag) {
                    System.out.print("Cac so chan nho hon 20 trong mang: ");
                    flag = true;
                }
                System.out.print(value + " ");
            }
        }
        if (!flag) {
            System.out.println("Khong co so chan nho hon 20 trong mang.");
        }
        System.out.println();
    }

    public static boolean laSoChan(int x) {
        return x % 2 == 0;
    }
}// end class