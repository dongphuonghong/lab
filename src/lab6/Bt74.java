// 74. Viết chương trình nhập vào mảng một chiều các số nguyên và xuất ra các phần tử là số chính phương nằm tại những vị trí lẻ trong mảng.
/*
 * Bt74.java
 * Nhập mảng và in các số chính phương ở vị trí lẻ trong mảng.
 * Mô tả: Nhập n (>0), nhập từng phần tử (có prompt), in các phần tử là số chính phương
 * xuất hiện ở chỉ số lẻ (i % 2 != 0).
 */
package lab6;

import java.util.Scanner;

public class Bt74 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Bước 1: Nhập số lượng phần tử của mảng (n > 0)
        int n = nhapSoLuong("Nhập n > 0");
        // Bước 2: Khởi tạo mảng `a` với kích thước n
        int[] a = new int[n];
        nhapMang(a);
        // Bước 3: In ra các số chính phương ở vị trí lẻ trong mảng
        inSoChinhPhuongViTriLe(a);
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
            System.out.print("Nhap phan tu a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    /**
     * Hàm `inSoChinhPhuongViTriLe`: in các số chính phương xuất hiện ở vị trí lẻ
     * trong mảng `a`.
     * Nếu không có, in thông báo thích hợp.
     *
     * @param a mảng số nguyên cần xử lý
     */
    public static void inSoChinhPhuongViTriLe(int[] a) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (laChinhPhuong(a[i]) && i % 2 != 0) {
                if (!flag) {
                    System.out.print("Các số chính phương ở vị trí lẻ trong mảng: ");
                    flag = true;
                }
                System.out.print(a[i] + " ");
            }
        }
        if (!flag) {
            System.out.println("Không có số chính phương nào ở vị trí lẻ trong mảng.");
        }
        System.out.println();
    }

    /**
     * Hàm `laSoChinhPhuong`: kiểm tra số nguyên có phải là số chính phương không.
     *
     * @param x số nguyên cần kiểm tra
     * @return true nếu x là số chính phương, ngược lại false
     */
    public static boolean laChinhPhuong(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }
}// end class