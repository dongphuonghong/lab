// 94. Viết hàm đếm các phần tử là số nguyên tố trong mảng.
package lab8;

/**
 * Bài 94: Đếm số phần tử là số nguyên tố trong mảng.
 */
public class Bt94 {

    /**
     * Kiểm tra số nguyên x có phải là số nguyên tố.
     *
     * @param x số cần kiểm tra
     * @return true nếu x là số nguyên tố, ngược lại false
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
     * Đếm số phần tử nguyên tố trong mảng a.
     *
     * @param a mảng số nguyên
     * @return số phần tử là số nguyên tố
     */
    public static int demSoPhanTuNguyenTo(int[] a) {
        int dem = 0;
        for (int value : a) {
            if (laSoNguyenTo(value)) {
                dem++;
            }
        }
        return dem;
    }
}// end class