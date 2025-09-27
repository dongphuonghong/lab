// 116. Nhập vào giá tri ̣ X. Viết hàm xoá phần tử có giá tri ̣ gần X nhất.
package lab10;

/**
 * Bài 116: Xóa phần tử có giá trị gần X nhất trong danh sách số nguyên.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Bt116 {
    static Scanner sc = new Scanner(System.in);

    /**
     * Nhập giá trị X từ bàn phím.
     *
     * @return giá trị X
     */
    public static int nhapX() {
        int x;

        System.out.println("Nhap gia tri X: ");
        x = sc.nextInt();
        return x;
    }

    /**
     * Xóa phần tử có giá trị gần X nhất (theo trị tuyệt đối) ra khỏi danh sách.
     *
     * @param list danh sách số nguyên cần xử lý (bị thay đổi tại chỗ)
     * @param x    giá trị mục tiêu
     */
    public static void xoaGanX(ArrayList<Integer> a, int x) {

        if (a.isEmpty()) {
            System.out.println("Danh sách rỗng, không thể xóa.");
            return;
        }

        int indexGanNhat = 0;
        int minKhoangCach = Math.abs(a.get(0) - x);

        for (int i = 1; i < a.size(); i++) {
            int khoangCach = Math.abs(a.get(i) - x);
            if (khoangCach < minKhoangCach) {
                minKhoangCach = khoangCach;
                indexGanNhat = i;
            }
        }

        a.remove(indexGanNhat);
        System.out.println("Mảng sau khi xoa phan tu gan X nhat: " + a);
    }
}// end class
