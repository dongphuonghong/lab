// 98. Viết hàm ti ́nh tổng các phần tử lẻ trong mảng các số nguyên.
package lab8;

/**
 * Bài 98: Tính tổng các phần tử lẻ trong mảng số nguyên.
 */
public class Bt98 {
    /**
     * Tính tổng các phần tử lẻ trong mảng a.
     *
     * @param a mảng số nguyên
     * @return tổng các phần tử lẻ
     */
    public static int tongLe(int[] a) {
        int sum = 0;
        for (int num : a) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}// end class
