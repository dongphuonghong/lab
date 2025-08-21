// 66. Viết chương trình nhập vào và xuất ra mảng một chiều các số nguyên.
/*
 * Bt66.java
 * Nhập mảng một chiều số nguyên và in ra mảng.
 * Mô tả: Yêu cầu nhập n (>0), chương trình đọc n số nguyên từ bàn phím
 * và in mảng vừa nhập ra màn hình.
 */
package lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Bt66 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Bước 1: Nhập số lượng phần tử của mảng (n > 0)
        int n = nhapSoLuong("Nhập n > 0");
        // Bước 2: Khởi tạo mảng `a` với kích thước n
        int[] a = new int[n];
        nhapMang(a);
        // Bước 3: In mảng ra màn hình (cách 1: dùng hàm xuatMang)
        // xuatMang(a);
        // Bước 3: In mảng ra màn hình (cách 1: dùng Arrays.toString)
        System.out.println("Mảng đã nhập là: " + Arrays.toString(a));
        sc.close();
    }// end main

    /**
     * Hàm `nhapSoLuong`: nhập số lượng phần tử n (> 0) từ bàn phím.
     * Lặp lại cho đến khi nhập đúng giá trị hợp lệ.
     * 
     * @param chuoi thông báo hướng dẫn nhập
     * @return số nguyên n (> 0)
     */

    public static int nhapSoLuong(String chuoi) {
        int n;
        do {
            System.out.println(chuoi);
            n = sc.nextInt();
            if (n > 0) {
                return n;
            }
            System.out.println("Bạn vui lòng nhập lại n > 0");
        } while (true);
    }

    /**
     * Hàm `nhapMang`: đọc từng phần tử từ bàn phím (có prompt)
     * và lưu vào mảng `a`.
     * 
     * @param a mảng số nguyên cần nhập
     */

    public static void nhapMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    /**
     * Hàm `xuatMang`: in mảng `a` ra màn hình.
     * 
     * @param a mảng số nguyên cần in
     */
    public static void xuatMang(int[] a) {
        System.out.print("Mảng đã nhập: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}// end class