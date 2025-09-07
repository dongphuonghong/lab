// 96. Viết hàm đếm các phần tử là bộ i của 3 hoặc 5 trong mảng các số nguyên.
package lab8;

/**
 * Bài 96: Đếm các phần tử là bội của 3 hoặc 5 trong mảng số nguyên.
 */
public class Bt96 {

    /**
     * Đếm số phần tử là bội của 3 hoặc 5 trong mảng.
     *
     * @param a mảng số nguyên
     * @return số phần tử thỏa điều kiện (bội 3 hoặc 5)
     */
    public static int demPhanTuBoi3Hoac5(int[] a) {

        int d = 0;
        for (int value : a) {
            if (value % 3 == 0 || value % 5 == 0) {
                d++;
            }
        }
        return d;
    }
}// end class