package LAB9;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 * Bài 109 (phiên bản 1): Sử dụng lớp tiện ích Arrays và Collections để sắp xếp
 * mảng Integer giảm dần.
 */
public class Bt109_1 {
    static Scanner sc = new Scanner(System.in);

    /**
     * Điểm vào: nhập số lượng, nhập mảng Integer, sắp xếp giảm dần và xuất kết quả.
     * 
     * @param args tham số dòng lệnh (không dùng)
     */
    public static void main(String[] args) {
        int n = nhapSoLuong("Nhập số lượng phần tử của mảng: ");
        Integer[] a = nhapMang(n);
        sapXepGiamDan(a);
        xuatMang(a);
        sc.close();
    }// end main

    /**
     * Nhập số lượng phần tử n (>0).
     * 
     * @param chuoi thông báo hướng dẫn
     * @return n hợp lệ > 0
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
     * Nhập mảng Integer gồm n phần tử.
     * 
     * @param n số lượng phần tử (đã hợp lệ)
     * @return mảng Integer đã nhập
     */
    public static Integer[] nhapMang(int n) {
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            a[i] = sc.nextInt();
        }
        return a;
    }

    /**
     * Sắp xếp mảng Integer theo thứ tự giảm dần bằng Arrays.sort với Comparator
     * đảo.
     * 
     * @param a mảng cần sắp xếp (thay đổi tại chỗ)
     */
    public static void sapXepGiamDan(Integer[] a) {
        Arrays.sort(a, Collections.reverseOrder());
    }

    /**
     * Xuất mảng Integer sau khi sắp xếp.
     * 
     * @param a mảng cần xuất
     */
    public static void xuatMang(Integer[] a) {
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        for (Integer a1 : a) {
            System.out.print(a1 + " ");
        }
        System.out.println();
    }
}// end class