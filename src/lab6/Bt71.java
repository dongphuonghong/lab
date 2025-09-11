/**
 * Bài 71: Nhập mảng số nguyên và in các phần tử lẻ.
 */
package lab6;

import java.util.Scanner;

/**
 * Lớp Bt71: Nhập mảng số nguyên và in các phần tử lẻ.
 */
public class Bt71 {
    static Scanner sc = new Scanner(System.in);

    /**
     * Điểm vào chương trình: nhập mảng và in các phần tử lẻ (nếu có).
     *
     * @param args tham số dòng lệnh (không sử dụng)
     */
    public static void main(String[] args) {
        // Bước 1: Nhập số lượng phần tử của mảng (n > 0)
        int n = nhapSoLuong("Nhập n > 0");
        // Bước 2: Khởi tạo mảng `a` với kích thước n
        int[] a = new int[n];
        nhapMang(a);
        // Bước 3: In mảng ra màn hình
        System.out.println("Cac phan tu le trong mang la: ");
        inPhanTuLe(a);
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
     * Hàm `xuatMang`: in các phần tử lẻ trong mảng `a`.
     *
     * @param a mảng số nguyên cần in
     */
    public static void inPhanTuLe(int[] a) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                flag = true;
            }
        }
        if (!flag) {
            System.out.print("Khong co phan tu le nao.");
        }
        System.out.println(); // Xuống dòng sau khi in xong
    }

}// end class