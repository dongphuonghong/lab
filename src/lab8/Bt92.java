// 92. Viết hàm đếm số lần xuất hiện của phần tử  x trong mảng.
package lab8;

/**
 * Bài 92: Đếm số lần xuất hiện của phần tử x trong mảng.
 */
public class Bt92 {

    /**
     * Đếm số lần xuất hiện của giá trị x trong mảng a.
     *
     * @param a mảng số nguyên
     * @param x giá trị cần đếm
     * @return số lần xuất hiện của x
     */
    public static int demSoLanXuatHien(int[] a, int x) {
        int dem = 0;
        for (int value : a) {
            if (value == x) {
                dem++;
            }
        }
        return dem;
    }
}// end class
