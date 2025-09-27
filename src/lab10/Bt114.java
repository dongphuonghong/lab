// 114. Viết hàm xoá phần tử có giá tri ̣ lớn nhất trong mảng.
package lab10;

import java.util.ArrayList;

/**
 * Bài 114: Xóa phần tử có giá trị lớn nhất khỏi danh sách số nguyên.
 */
public class Bt114 {
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
     * Xóa một phần tử mang giá trị lớn nhất khỏi danh sách (xóa một lần).
     *
     * @param list danh sách số nguyên cần xử lý (bị thay đổi tại chỗ)
     */
    public static void xoaMax(ArrayList<Integer> a) {
        int max = timMax(a);
        if (a.contains(max)) {
            a.remove(Integer.valueOf(max));
            System.out.println("Mảng sau khi xoa: " + a);
        }
    }

}// end class
