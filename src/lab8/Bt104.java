// 104. Viết hàm ti ́nh tổng các phần tử là bộ i của 3 hoặc 5 trong mảng các số nguyên.
package lab8;

/**
 * Bài 104: Tính tổng các phần tử là bội của 3 hoặc 5 trong mảng.
 */
public class Bt104 {

    /**
     * Tính tổng các phần tử là bội số của 3 hoặc 5 trong mảng a.
     *
     * @param a mảng số nguyên
     * @return tổng các phần tử thỏa điều kiện
     */
    public static int tongPhantuBoi3Hoac5(int[] a) {
        int sum = 0;
        for (int num : a) {

            if (num % 3 == 0 || num % 5 == 0) {
                sum += num;
            }
        }
        return sum;
    }

}// end class
