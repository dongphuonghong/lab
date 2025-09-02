/**
 * Bài 82: Tìm vị trí phần tử dương đầu tiên trong mảng (không có trả về -1).
 */
package lab7;

public class Bt82 {
    /**
     * Tìm vị trí phần tử dương đầu tiên trong mảng.
     * 
     * @param a mảng số nguyên
     * @return chỉ số phần tử dương đầu tiên hoặc -1 nếu không có
     */
    public static int timViTriDuongDauTien(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                return i;
            }
        }
        return -1;
    }

}// end class
