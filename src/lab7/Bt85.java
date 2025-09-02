/**
 * Bài 85: Tìm số chẵn cuối cùng trong mảng (không có trả về -1).
 */
package lab7;

public class Bt85 {
    /**
     * Tìm số chẵn cuối cùng xuất hiện trong mảng.
     * 
     * @param a mảng số nguyên
     * @return giá trị số chẵn cuối cùng hoặc -1 nếu không có số chẵn
     */
    public static int timSoChanCuoiCung(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                return a[i];
            }
        }
        return -1;
    }
}// end class
