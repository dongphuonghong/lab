// 119. Viết hàm chèn phần tử có giá tri ̣ X vào trước phần tử có giá tri ̣ là số nguyên tố đầu tiên trong mảng.
package lab10;

import java.util.ArrayList;

/**
 * Bài 119: Chèn X vào trước phần tử đầu tiên là số nguyên tố trong danh sách.
 */
public class Bt119 {
    /**
     * Kiểm tra một số có phải số nguyên tố hay không.
     *
     * @param x số nguyên cần kiểm tra
     * @return true nếu là số nguyên tố, ngược lại false
     */
    public static boolean laSoNguyenTo(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Chèn phần tử X vào trước phần tử đầu tiên là số nguyên tố.
     * Nếu không có số nguyên tố nào, chèn X vào cuối danh sách.
     *
     * @param a danh sách số nguyên (bị thay đổi tại chỗ)
     * @param x giá trị cần chèn
     */
    public static void chenPhanTu(ArrayList<Integer> a, int x) {
        for (int i = 0; i < a.size(); i++) {
            if (laSoNguyenTo(a.get(i))) {
                a.add(i, x);
                break;
            }
        }
        a.add(x);
        System.out.println("Mảng sau khi chèn: " + a);
    }
}// end class
