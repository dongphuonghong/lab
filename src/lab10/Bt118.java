// 118. Viết hàm chèn phần tử có giá tri ̣ X vào phi ́a sau phần tử có giá tri ̣ lớn nhất trong mảng.
package lab10;

import java.util.ArrayList;

/**
 * Bài 118: Chèn X vào phía sau phần tử có giá trị lớn nhất (sau lần xuất hiện
 * cuối cùng của max).
 */
public class Bt118 {

    /**
     * Tìm giá trị lớn nhất trong danh sách.
     *
     * @param list danh sách số nguyên (không rỗng)
     * @return giá trị lớn nhất
     */
    public static int timMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int value : list) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Chèn X vào ngay sau phần tử có giá trị lớn nhất (vị trí xuất hiện cuối cùng).
     *
     * @param a danh sách số nguyên (bị thay đổi tại chỗ)
     * @param x giá trị cần chèn
     */
    public static void chenSauMax(ArrayList<Integer> a, int x) {
        int max = timMax(a);
        int index = a.lastIndexOf(max);
        a.add(index + 1, x);
        System.out.println("Mảng sau khi chèn: " + a);
    }
}// end class
