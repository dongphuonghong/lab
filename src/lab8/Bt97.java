// 97. Viết hàm ti ́nh tổng các phần tử chẵn trong mảng.
package lab8;

/**
 * Bài 97: Tính tổng các phần tử chẵn trong mảng.
 */
public class Bt97 {

    /**
     * Tính tổng các phần tử chẵn trong mảng a.
     *
     * @param a mảng số nguyên
     * @return tổng các phần tử chẵn
     */
    public static int tongChan(int[] a) {
        int sum = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}// end class