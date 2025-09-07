// 105. Viết hàm ti ́nh tổng các phần tử là số hoàn thiện trong mảng các số nguyên.
package lab8;

/**
 * Bài 105: Viết hàm tính tổng các phần tử là số hoàn thiện trong mảng số
 * nguyên.
 */
public class Bt105 {

    /**
     * Kiểm tra một số có phải là số hoàn thiện hay không.
     * Số hoàn thiện là số nguyên dương bằng tổng các ước số dương (không tính chính
     * nó).
     *
     * @param x số nguyên cần kiểm tra
     * @return true nếu x là số hoàn thiện, ngược lại false
     */
    public static boolean kiemTraSoHoanThien(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        return sum == x;
    }

    /**
     * Tính tổng các phần tử là số hoàn thiện trong mảng.
     *
     * @param a mảng số nguyên
     * @return tổng các phần tử là số hoàn thiện trong mảng
     */
    public static int tongSoHoanThien(int[] a) {
        int sum = 0;
        for (int num : a) {
            if (kiemTraSoHoanThien(num)) {
                sum += num;
            }
        }
        return sum;
    }
}// end class
