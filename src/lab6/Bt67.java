// 67. Viết chương trình khởi tạo mảng một chiều các số nguyên với giá trị mặc định 0.
/*
 * Bt67.java
 * Khởi tạo mảng một chiều số nguyên có n phần tử và in mảng.
 * Mô tả: Yêu cầu nhập n (>0), chương trình tạo mảng mới (giá trị mặc định 0)
   * Trong Java, mảng số nguyên khi khởi tạo sẽ được gán giá trị mặc định 0.
 * và in mảng ra màn hình.
 */
package lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Bt67 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Bước 1: Nhập số lượng phần tử của mảng (n > 0)
        int n = nhapSoLuong("Nhập n > 0");
        // Bước 2: Khởi tạo mảng `a` với kích thước n
        int[] a = new int[n];
        // Bước 3: In mảng ra màn hình (cách 1: dùng Arrays.toString)
        System.out.println("Mảng đã nhập là: " + Arrays.toString(a));
        // Bước 3 (cách 2: gọi hàm xuatMang)
        // xuatMang(a);
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
     * Hàm `xuatMang`: in mảng `a` ra màn hình.
     * 
     * @param a mảng số nguyên cần in
     */
    public static void xuatMang(int[] a) {
        System.out.print("Mảng khởi tạo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}// end class