/**
 * Bài 68: Phát sinh mảng số nguyên âm ngẫu nhiên (mỗi phần tử trong [-99,-1]).
 */
package lab6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Lớp Bt68: Phát sinh mảng số nguyên âm ngẫu nhiên trong [-99,-1].
 */
public class Bt68 {
    static Scanner sc = new Scanner(System.in);

    /**
     * Điểm vào chương trình.
     *
     * @param args tham số dòng lệnh (không sử dụng)
     */
    public static void main(String[] args) {
        // Nhập số lượng phần tử của mảng (n > 0)
        int n = nhapSoLuong("Nhập n > 0");
        // Khởi tạo mảng có n phần tử
        int[] a = new int[n];
        // Điền mảng bằng các số nguyên âm ngẫu nhiên [-99, -1]
        nhapMang(a);
        // In mảng ra màn hình (cách 1: gọi hàm xuatMang)
        // xuatMang(a);
        // Cách 2: sử dụng Arrays.toString()
        System.out.println("Mảng phát sinh ngẫu nhiên các số âm là: " + Arrays.toString(a));
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
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu a[" + i + "]: ");
            a[i] = -rand.nextInt(99) - 1;
        }
    }

    /**
     * Hàm `xuatMang`: in mảng `a` ra màn hình.
     *
     * @param a mảng số nguyên cần in
     */
    public static void xuatMang(int[] a) {
        System.out.print("Mảng phát sinh (số âm): ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}// end class