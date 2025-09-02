// 75. Viết hàm tìm vị trí phần tử có giá trị x xuất hiện cuối cùng trong mảng.
package lab7;

import java.util.Scanner;

public class Bt75 {
    static Scanner sc = new Scanner(System.in);

    /**
     * Tìm vị trí xuất hiện cuối cùng của giá trị x trong mảng.
     * 
     * @param a mảng số nguyên đầu vào
     * @param x giá trị cần tìm
     * @return chỉ số cuối cùng mà a[i] == x, hoặc -1 nếu không tồn tại
     */
    public static int timViTriCuoi(int[] a, int x) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Nhập vào một giá trị nguyên cần tìm trong mảng.
     * 
     * @return giá trị nguyên x người dùng nhập
     */
    public static int nhapX() {
        int x;
        System.out.println("nhap phan tu can tim");
        x = sc.nextInt();
        return x;
    }

}// end class