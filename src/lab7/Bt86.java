// 86. Viết hàm tìm số lẻ lớn nhất có trong mảng, nếu không tồn tại số lẻ hàm trả về -1.
package lab7;

public class Bt86 {
    /**
     * Tìm số lẻ lớn nhất trong mảng.
     * 
     * @param a mảng số nguyên
     * @return giá trị số lẻ lớn nhất hoặc -1 nếu không có số lẻ
     */
    public static int timSoLeLonNhat(int[] a) {
        int max = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0 && a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}// end class