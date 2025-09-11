/**
 * Bài 73: Nhập mảng số nguyên và in các phần tử là số nguyên tố.
 */
package lab6;

import java.util.Scanner;

/**
 * Lớp Bt73: Nhập mảng và in các số nguyên tố.
 */
public class Bt73 {
    static Scanner sc = new Scanner(System.in);

    /**
     * Điểm vào chương trình: nhập mảng và in các số nguyên tố.
     *
     * @param args tham số dòng lệnh (không sử dụng)
     */
    public static void main(String[] args) {
        // Bước 1: Nhập số lượng phần tử của mảng (n > 0)
        int n = nhapSoLuong("Nhập n > 0");
        // Bước 2: Khởi tạo mảng `a` với kích thước n
        int[] a = new int[n];
        nhapMang(a);
        // Bước 3: In ra các số nguyên tố trong mảng
        inSoNguyenTo(a);
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
     * Hàm `inSoNguyenTo`: in các số nguyên tố xuất hiện trong mảng `a`.
     * Nếu không có, in thông báo thích hợp.
     *
     * @param a mảng số nguyên cần xử lý
     */
    public static void inSoNguyenTo(int[] a) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (laSoNguyenTo(a[i])) {
                if (!flag) {
                    System.out.print("Cac so nguyen to trong mang: ");
                    flag = true; // Đánh dấu đã tìm thấy ít nhất một số nguyên tố
                }
                System.out.print(a[i] + " ");
            }
        }
        if (!flag) {
            System.out.println("Khong co so nguyen to trong mang.");
        }
        System.out.println();
    }

    /**
     * Kiểm tra số nguyên tố (số >1 và không có ước khác ngoài 1 và chính nó).
     * 
     * @param x số nguyên cần kiểm tra
     * @return true nếu x là số nguyên tố, ngược lại false
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
}// end class
