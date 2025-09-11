/**
 * Bài 76: Tìm vị trí phần tử nhỏ nhất trong mảng (nếu nhiều lấy đầu tiên).
 */
package lab7;

/**
 * Lớp Bt76: Tìm vị trí phần tử nhỏ nhất trong mảng.
 */
public class Bt76 {
    /**
     * Tìm vị trí phần tử nhỏ nhất trong mảng.
     * 
     * @param a mảng số nguyên (độ dài >= 1)
     * @return chỉ số phần tử nhỏ nhất (nếu có nhiều chọn phần đầu tiên)
     */
    public static int timViTriMin(int[] a) {
        int min = a[0];
        int viTri = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                viTri = i;
            }
        }
        return viTri;
    }
}// end class