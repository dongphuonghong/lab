// 91. Viết hàm đếm các phần tử chẵn, hàm đếm các phần tử lẻ trong mảng.
package lab8;

/**
 * Bài 91: Đếm số phần tử chẵn và số phần tử lẻ trong mảng số nguyên.
 */
public class Bt91 {
    /**
     * Đếm số lượng phần tử lẻ trong mảng.
     *
     * @param a mảng số nguyên đầu vào
     * @return số phần tử lẻ
     */
    public static int demSoLe(int[] a) {
        int dem = 0;
        for (int value : a) {
            if (value % 2 != 0) {
                dem++;
            }
        }
        return dem;
    }

    /**
     * Đếm số lượng phần tử chẵn trong mảng.
     *
     * @param a mảng số nguyên đầu vào
     * @return số phần tử chẵn
     */
    public static int demSoChan(int[] a) {
        int dem = 0;
        for (int value : a) {
            if (value % 2 == 0) {
                dem++;
            }
        }
        return dem;
    }

}// end class