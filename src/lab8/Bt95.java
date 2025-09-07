// 95. Viết hàm đếm các phần tử là số hoàn thiện trong mảng.
package lab8;

/**
 * Bài 95: Đếm số phần tử là số hoàn thiện trong mảng.
 */
public class Bt95 {

    /**
     * Kiểm tra x có phải số hoàn thiện (perfect number).
     *
     * @param x số nguyên cần kiểm tra
     * @return true nếu x là số hoàn thiện; ngược lại false
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
     * Đếm số phần tử là số hoàn thiện trong mảng a.
     *
     * @param a mảng số nguyên
     * @return số phần tử hoàn thiện
     */
    public static int demSoHoanThien(int[] a) {
        int dem = 0;
        for (int value : a) {
            if (kiemTraSoHoanThien(value)) {
                dem++;
            }
        }
        return dem;
    }
}// end class
