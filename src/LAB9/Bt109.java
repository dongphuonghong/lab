package LAB9;

import java.util.Scanner;

/**
 * Bài 109: Cung cấp các hàm nhập, xuất và sắp xếp mảng số nguyên theo thứ tự
 * giảm dần.
 */
public class Bt109 {
    static Scanner sc = new Scanner(System.in);

    /**
     * Điểm vào chương trình: nhập số lượng phần tử, nhập mảng, sắp xếp giảm dần và
     * xuất kết quả.
     * 
     * @param args tham số dòng lệnh (không sử dụng)
     */
    public static void main(String[] args) {
        int n = nhapSoLuong("Nhập n > 0");
        int[] a = new int[n];
        nhapMang(a);
        sapXepGiamDan(a);
        System.out.println("Mảng sau khi sắp xếp giảm dần là: ");
        xuatMang(a);
        sc.close();
    }// end main

    /**
     * Nhập số nguyên dương n (>0) đại diện số lượng phần tử của mảng.
     * Lặp lại cho đến khi người dùng nhập hợp lệ.
     * 
     * @param chuoi thông báo hướng dẫn nhập
     * @return giá trị n > 0 hợp lệ
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
     * Nhập các phần tử cho mảng số nguyên.
     * 
     * @param a mảng cần nhập (đã được cấp phát kích thước)
     */
    public static void nhapMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    /**
     * Xuất các phần tử của mảng trên một dòng.
     * 
     * @param a mảng cần xuất
     */
    public static void xuatMang(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * Sắp xếp mảng theo thứ tự giảm dần bằng thuật toán đổi chỗ đơn giản (O(n^2)).
     * 
     * @param a mảng số nguyên cần sắp xếp (thay đổi tại chỗ)
     */
    public static void sapXepGiamDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}// end class