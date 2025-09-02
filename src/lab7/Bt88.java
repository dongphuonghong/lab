// 88. Nhập vào X, viết hàm in ra màn hình những phần tử có giá trị từ 1 đến X có trong mảng.
package lab7;

import java.util.Scanner;

public class Bt88 {
    static Scanner sc = new Scanner(System.in);

    /**
     * In các phần tử trong mảng có giá trị thuộc đoạn [1, x].
     * 
     * @param a mảng số nguyên
     * @param x cận trên giá trị cần lọc (x > 0)
     */
    public static void inPhanTu(int[] a, int x) {
        boolean flag = false;
        System.out.println("Cac phan tu co gia tri tu 1 den " + x + " la:");
        for (int i : a) {
            if (i >= 1 && i <= x) {
                System.out.print(i + " ");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Khong co phan tu nao thoa man");
        }
        System.out.println();
    }

    /**
     * Nhập vào giá trị nguyên dương x từ bàn phím.
     * 
     * @return giá trị x > 0 người dùng nhập
     */
    public static int nhapX() {
        int x;
        do {
            System.out.println("nhap phan tu can tim");
            x = sc.nextInt();
            if (x > 0) {
                return x;
            }
            System.out.println("ban vui long nhap lai x >0");
        } while (true);
    }
}// end class