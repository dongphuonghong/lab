// 117. Viết hàm chèn phần tử có giá tri ̣ X vào vi ̣ tri ́ đầu tiên của mảng.
package lab10;

/**
 * Bài 117: Chèn phần tử X vào đầu danh sách số nguyên.
 */

import java.util.ArrayList;

/**
 * Bài 117: Chèn phần tử X vào vị trí đầu tiên của danh sách.
 */
public class Bt117 {
    /**
     * Chèn phần tử X vào đầu danh sách.
     *
     * @param a danh sách số nguyên (bị thay đổi tại chỗ)
     * @param x giá trị cần chèn
     */
    public static void chènVaoDau(ArrayList<Integer> a, int x) {
        a.add(0, x);
        System.out.println("Mảng sau khi chèn: " + a);
    }

}// end class