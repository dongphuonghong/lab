/**
 * Bài 89: Nhập dãy a (n số thực, 1 ≤ n ≤ 100) và dãy b (m số thực, 1 ≤ m ≤ 100).
 * In ra:
 *  - Các phần tử chỉ xuất hiện trong dãy a mà không xuất hiện trong dãy b (mỗi giá trị duy nhất).
 *  - Các phần tử xuất hiện ở cả hai dãy (mỗi giá trị duy nhất).
 */
package lab8;

import java.util.Scanner;

public class Bt89 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = nhap("Nhap so luong phan tu mang A: ");
        double[] a = new double[n];
        nhapMang(a, "Nhap mang A: ");
        // xuatMang(a); // Không in mảng A theo yêu cầu đề

        int m = nhap("Nhap so luong phan tu mang B: ");
        double[] b = new double[m];
        nhapMang(b, "Nhap mang B: ");
        // xuatMang(b); // Không in mảng B theo yêu cầu đề

        xuatPhanTuChiXuatHienTrongMangA(a, b);
        xuatPhanTuXuatHienOcaHaiMang(a, b);
    }// end main

    /**
     * Nhập số nguyên trong khoảng 1..100 từ bàn phím.
     *
     * @param chuoi lời nhắc nhập dữ liệu
     * @return giá trị nguyên hợp lệ trong [1, 100]
     */
    public static int nhap(String chuoi) {
        int n;
        do {
            System.out.println(chuoi);
            n = sc.nextInt();
            if (n > 0 && n <= 100) {
                return n;
            }
            System.out.println("Vui long nhap gia tri trong khoang 1..100");
        } while (true);
    }

    /**
     * Nhập các phần tử cho mảng số thực từ bàn phím.
     *
     * @param a     mảng cần nhập dữ liệu
     * @param chuoi tiền tố hiển thị trước mỗi phần tử
     */
    public static void nhapMang(double[] a, String chuoi) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(chuoi + "[" + i + "]: ");
            a[i] = sc.nextDouble();
        }
    }

    /**
     * Xuất các phần tử của mảng số thực ra màn hình theo một dòng.
     * Lưu ý: Hiện không được sử dụng theo yêu cầu bài toán.
     *
     * @param a mảng số thực cần xuất
     */
    public static void xuatMang(double[] a) {
        for (double value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * Kiểm tra giá trị x có tồn tại trong mảng a (so sánh theo epsilon 1e-6).
     *
     * @param a mảng số thực cần kiểm tra
     * @param x giá trị cần tìm
     * @return true nếu tồn tại phần tử bằng x (theo epsilon), ngược lại false
     */
    public static boolean kiemTraTonTai(double[] a, double x) {
        for (double value : a) {
            if ((Math.abs(value - x) < 1e-6)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Kiểm tra phần tử tại vị trí index có bị trùng với phần tử trước đó trong mảng
     * a hay không.
     * Dùng so sánh theo epsilon 1e-6 để xác định trùng lặp.
     *
     * @param a     mảng số thực
     * @param index vị trí đang xét
     * @return true nếu không bị trùng với các phần tử trước đó; false nếu đã xuất
     *         hiện trước đó
     */
    public static boolean KiemtraTrungLap(double[] a, int index) {
        for (int i = 0; i < index; i++) {
            if (Math.abs(a[i] - a[index]) < 1e-6) {
                return false;
            }
        }
        return true;

    }

    /**
     * In các phần tử chỉ xuất hiện trong mảng a mà không xuất hiện trong mảng b
     * (mỗi giá trị duy nhất).
     *
     * @param a mảng A
     * @param b mảng B
     */
    public static void xuatPhanTuChiXuatHienTrongMangA(double[] a, double[] b) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (!kiemTraTonTai(b, a[i]) && KiemtraTrungLap(a, i)) {
                if (!flag) {
                    System.out.print("Cac phan tu chi xuat hien trong mang A: ");
                    flag = true;
                }
                System.out.print(a[i] + " ");
            }
        }
        if (!flag) {
            System.out.println("Khong co phan tu nao chi xuat hien trong mang A");
        }
        System.out.println();
    }

    /**
     * In các phần tử xuất hiện ở cả hai mảng a và b (mỗi giá trị duy nhất).
     *
     * @param a mảng A
     * @param b mảng B
     */
    public static void xuatPhanTuXuatHienOcaHaiMang(double[] a, double[] b) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (kiemTraTonTai(b, a[i]) && KiemtraTrungLap(a, i)) {
                if (!flag) {
                    System.out.print("Cac phan tu xuat hien o ca hai mang: ");
                }
                System.out.print(a[i] + " ");
                flag = true;
            }

        }

        if (!flag) {
            System.out.println("Khong co phan tu nao xuat hien o ca hai mang");
        }
        System.out.println();
    }
}// end class