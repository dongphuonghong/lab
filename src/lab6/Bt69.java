// 69. Viết chương trình phát sinh ngẫu nhiên mảng một chiều số nguyên có thứ tự tăng dần.
/*
 * Bt69.java
 * Sinh mảng số nguyên tăng dần một cách ngẫu nhiên.
 * Mô tả: Yêu cầu nhập n (>0), chương trình sinh giá trị bắt đầu ngẫu nhiên
 * và tạo dãy tăng dần bằng cách cộng các bước dương ngẫu nhiên.
   *  - Phần tử đầu tiên được chọn ngẫu nhiên trong khoảng [-50, 49].
 */
package lab6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bt69 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Bước 1: Nhập số lượng phần tử của mảng (n > 0)
        int n = nhapSoLuong("Nhập n > 0");
        // Bước 2: Khởi tạo mảng và sinh mảng tăng dần ngẫu nhiên
        int[] a = new int[n];
        nhapMang(a);
        // Bước 3 (cách 1: gọi hàm xuatMang)
        // xuatMang(a);
        // Bước 3: In mảng ra màn hình (cách 2: dùng Arrays.toString)
        System.out.println("Mảng phát sinh ngẫu nhiên tăng dần là: " + Arrays.toString(a));
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
        a[0] = rand.nextInt(100) - 50; // giá trị khởi tạo có thể âm hoặc dương
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + rand.nextInt(99) + 1; // đảm bảo phần tử sau lớn hơn phần tử trước
        }
    }

    /**
     * Hàm `xuatMang`: in mảng `a` ra màn hình.
     *
     * @param a mảng số nguyên cần in
     */
    public static void xuatMang(int[] a) {
        System.out.print("Mảng phát sinh tăng dần là: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}// end class
