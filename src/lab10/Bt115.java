// 115. Nhập vào giá tri ̣ X. Viết hàm xoá tất cả các phần tử có giá tri ̣ nhỏ hơn X.
package lab10;

/**
 * Bài 115: Xóa các phần tử nhỏ hơn X trong danh sách số nguyên.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Bt115 {
    static Scanner sc = new Scanner(System.in);

    /**
     * Nhập giá trị X từ bàn phím.
     *
     * @return giá trị X được nhập
     */
    public static int nhapX() {
        int x;

        System.out.println("Nhap gia tri X: ");
        x = sc.nextInt();
        return x;
    }

    /**
     * Xóa tất cả phần tử có giá trị nhỏ hơn X khỏi danh sách.
     * Duyệt từ cuối về đầu để tránh lệch chỉ số khi xóa.
     *
     * @param list danh sách số nguyên cần xử lý (bị thay đổi tại chỗ)
     * @param x    ngưỡng so sánh
     */
    public static void xoaPhanTuNhoHonX(ArrayList<Integer> a, int x) {
        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.get(i) < x) {
            }
        }
        System.out.println("Mảng sau khi xoa: " + a);
    }

}// end class