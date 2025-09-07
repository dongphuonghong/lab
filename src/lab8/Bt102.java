// 102. Viết hàm ti ́nh tổng các phần tử cực đại trong mảng các số nguyên (phần tử cực đại là phần tử lớn hơn các phần tử xung quanh nó ).Vi ́ dụ :  1 5 2 6 3 5 1 8 6
package lab8;

/**
 * Bài 102: Tính tổng các phần tử cực đại (lớn hơn hai láng giềng) trong mảng.
 */
public class Bt102 {

    /**
     * Tính tổng các phần tử a[i] sao cho a[i] > a[i-1] và a[i] > a[i+1].
     *
     * @param a mảng số nguyên (độ dài >= 0)
     * @return tổng các phần tử cực đại; 0 nếu mảng có độ dài < 3
     */
    public static int tongPhanTuCucDai(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                sum += a[i];
            }
        }
        return sum;
    }
}// end class