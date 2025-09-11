/**
 * Bài 67: Khởi tạo mảng một chiều số nguyên n phần tử (mặc định 0) và in ra.
 */
package lab6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Lớp Bt67: Khởi tạo mảng số nguyên n phần tử (mặc định 0) và in ra.
 */
public class Bt67 {
    static Scanner sc = new Scanner(System.in);

    /**
     * Điểm vào chương trình.
     *
     * @param args tham số dòng lệnh (không sử dụng)
     */
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