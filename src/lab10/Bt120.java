// 120. Viết hàm chèn phần tử có giá tri ̣ X vào phi ́a sau tất cả các phần tử có giá tri ̣ chẵn trong mảng.
package lab10;

import java.util.ArrayList;

/**
 * Bài 120: Chèn X vào phía sau tất cả phần tử có giá trị chẵn trong danh sách.
 */
public class Bt120 {
    /**
     * Duyệt danh sách và chèn X ngay sau mỗi phần tử chẵn gặp được.
     *
     * @param a danh sách số nguyên (bị thay đổi tại chỗ)
     * @param x giá trị cần chèn
     */
    public static void chenPhanTu(ArrayList<Integer> a, int x) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                a.add(i + 1, x);
                i++;
            }
        }
        System.out.println("Mảng sau khi chèn: " + a);
    }
}// end class