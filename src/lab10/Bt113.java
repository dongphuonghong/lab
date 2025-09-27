// 113. Viết hàm xoá phần tử tại vi ̣ tri ́ lẻ trong mảng.
package lab10;

import java.util.ArrayList;

/**
 * Bài 113: Viết hàm xóa phần tử tại vị trí lẻ trong danh sách.
 */
public class Bt113 {
    /**
     * Xóa tất cả phần tử tại vị trí lẻ (chỉ số 1, 3, 5, ...) trong danh sách.
     * Duy trì cấu trúc danh sách khi xóa phần tử.
     *
     * @param list danh sách cần xóa (bị thay đổi tại chỗ)
     */
    public static void xoaViTriLe(ArrayList<Integer> a) {
        for (int i = a.size() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                a.remove(i);
            }
        }
        System.out.println("Mảng sau khi xoa: " + a);
    }
}// end class