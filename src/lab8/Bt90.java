// 90. Viết hàm đếm các phần tử âm, hàm đếm các phần tử dương trong mảng.
package lab8;

/**
 * Bài 90: Đếm số phần tử âm và số phần tử dương trong mảng số nguyên.
 */
public class Bt90 {

    /**
     * Đếm số lượng phần tử âm trong mảng.
     *
     * @param a mảng số nguyên đầu vào
     * @return số phần tử âm trong mảng
     */
    public static int demSoAm(int[] a) {
        int dem = 0;
        for (int value : a) {
            if (value < 0) {
                dem++;
            }
        }
        return dem;
    }

    /**
     * Đếm số lượng phần tử dương trong mảng.
     *
     * @param a mảng số nguyên đầu vào
     * @return số phần tử dương trong mảng
     */
    public static int demSoDuong(int[] a) {
        int dem = 0;
        for (int value : a) {
            if (value > 0) {
                dem++;
            }
        }
        return dem;
    }
}// end class