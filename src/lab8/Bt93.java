// 93. Viết hàm đếm các phần tử nhỏ hơn x trong mảng.
package lab8;

/**
 * Bài 93: Đếm số phần tử nhỏ hơn x trong mảng.
 */
public class Bt93 {

    /**
     * Đếm số phần tử có giá trị nhỏ hơn x trong mảng a.
     *
     * @param a mảng số nguyên
     * @param x ngưỡng so sánh
     * @return số phần tử < x
     */
    public static int demSoPhanTuNhoHonx(int[] a, int x) {
        int dem = 0;
        for (int value : a) {
            if (value < x) {
                dem++;
            }
        }
        return dem;
    }
}// end class
