/**
 * Bài 72: Nhập mảng số nguyên và in các phần tử chẵn nhỏ hơn 20.
 */
package lab6;

import java.util.Scanner;

public class Bt72 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Bước 1: Nhập số lượng phần tử của mảng (n > 0)
        int n = nhapSoLuong("Nhập n > 0");
        // Bước 2: Khởi tạo mảng `a` với kích thước n
        int[] a = new int[n];
        nhapMang(a);
        // Bước 3: In ra các phần tử chẵn nhỏ hơn 20 trong mảng
        inSoChanNhoHon20(a);
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
     * Hàm `inSoChanNhoHon20`: duyệt mảng `a` và in ra các phần tử chẵn < 20.
     * Nếu không có số nào thỏa điều kiện, in thông báo "Mảng không có số chẵn nhỏ
     * hơn 20."
     * 
     * @param a mảng số nguyên cần xử lý
     */
    public static void inSoChanNhoHon20(int[] a) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (laSoChan(a[i]) && a[i] < 20) { // Kiểm tra nếu phần tử là số chẵn và nhỏ hơn 20
                if (!flag) {
                    System.out.print("Cac so chan nho hon 20 trong mang: ");
                    flag = true;
                }
                System.out.print(a[i] + " ");

            }
        }
        if (!flag) {
            System.out.println("Khong co so chan nho hon 20 trong mang.");
        }
        System.out.println();
    }

    /**
     * Kiểm tra số chẵn.
     * 
     * @param x số nguyên cần kiểm tra
     * @return true nếu x chia hết cho 2, ngược lại false
     */
    public static boolean laSoChan(int x) {
        return x % 2 == 0;
    }
}// end class
