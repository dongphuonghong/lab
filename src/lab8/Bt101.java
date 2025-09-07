// 101. Viết hàm ti ́nh tổng các phần tử chia hết cho 5 có trong mảng.
package lab8;

/**
 * Bài 101: Tính tổng các phần tử chia hết cho 5 trong mảng.
 */
public class Bt101 {

    /**
     * Tính tổng phần tử có giá trị chia hết cho 5 trong mảng a.
     *
     * @param a mảng số nguyên
     * @return tổng các phần tử chia hết cho 5
     */
    public static int tongPhanTuChiaHetCho5(int[] a) {
        int sum = 0;
        for (int num : a) {
            if (num % 5 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}// end class