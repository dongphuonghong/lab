// 99. Viết hàm ti ́nh tổng các phần tử là nguyên tố trong mảng.
package lab8;

/**
 * Bài 99: Tính tổng các phần tử là số nguyên tố trong mảng.
 */
public class Bt99 {

    /**
     * Kiểm tra số x có phải là số nguyên tố.
     *
     * @param x số cần kiểm tra
     * @return true nếu x là nguyên tố; ngược lại false
     */
    public static boolean laSoNguyenTo(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Tính tổng các phần tử nguyên tố trong mảng a.
     *
     * @param a mảng số nguyên
     * @return tổng các phần tử nguyên tố
     */
    public static int tongNguyenTo(int[] a) {
        int sum = 0;
        for (int num : a) {
            if (laSoNguyenTo(num)) {
                sum += num;
            }
        }
        return sum;
    }
}// end class
