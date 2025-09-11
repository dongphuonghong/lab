/**
 * Bài 70: Nhập mảng số nguyên và in các phần tử âm.
 */
package lab6;

import java.util.Scanner;

/**
 * Lớp Bt70: Nhập mảng số nguyên và in các phần tử âm.
 */
public class Bt70 {
    static Scanner sc = new Scanner(System.in);

    /**
     * Điểm vào chương trình: nhập mảng và in các phần tử âm (nếu có).
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
        xuatMang(a);
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
     * Hàm `xuatMang`: in mảng `a` ra màn hình.
     *
     * @param a mảng số nguyên cần in
     */
    public static void xuatMang(int[] a) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (kiemTraAm(a[i])) {
                if (!flag) {
                    System.out.print("Mang co cac phan tu am: ");
                    flag = true;
                }
                System.out.print(a[i] + " ");
            }
        }
        if (!flag) {
            System.out.print("Mang khong co phan tu am");
        }
        System.out.println();
    }

    /**
     * Kiểm tra xem một số có phải là số âm hay không.
     * 
     * @param x số nguyên cần kiểm tra
     * @return true nếu x < 0, ngược lại false
     */
    public static boolean kiemTraAm(int x) {
        return x < 0;
    }
}// end classs