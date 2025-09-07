// 103. Viết hàm ti ́nh tổng các phần tử cực tiểu trong mảng các số nguyên (phần tử cực tiểu là phần tử nhỏ hơn các phần tử xung quanh nó ).Vi ́ dụ :  6 4 2 9 5 3 7 1 5 8
package lab8;

/**
 * Bài 103: Tính tổng các phần tử cực tiểu (nhỏ hơn hai láng giềng) trong mảng.
 */
public class Bt103 {

    /**
     * Tính tổng các phần tử a[i] sao cho a[i] < a[i-1] và a[i] < a[i+1].
     *
     * @param a mảng số nguyên (độ dài >= 0)
     * @return tổng các phần tử cực tiểu; 0 nếu mảng có độ dài < 3
     */
    public static int tongPhanTuCucTieu(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
                sum += a[i];
            }
        }
        return sum;
    }

}// end class