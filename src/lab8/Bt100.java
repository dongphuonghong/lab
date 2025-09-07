// 100. Viết hàm ti ́nh tổng các phần tử nằm ở vi ̣ tri ́ chẵn trong mảng các số nguyên.
package lab8;

/**
 * Bài 100: Tính tổng các phần tử ở vị trí chỉ số chẵn trong mảng.
 */
public class Bt100 {
    /**
     * Tính tổng các phần tử a[0], a[2], a[4], ... trong mảng.
     *
     * @param a mảng số nguyên
     * @return tổng phần tử ở vị trí chẵn
     */
    public static int tongViTriChan(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i += 2) {
            sum += a[i];
        }
        return sum;
    }
}// end class