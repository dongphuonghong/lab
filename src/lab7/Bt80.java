// 80. Viết hàm tìm vị trí phần tử âm đầu tiên trong mảng. Nếu không có phần tử âm trả về -1.
package lab7;

public class Bt80 {
    /**
     * Tìm vị trí phần tử âm đầu tiên trong mảng.
     * 
     * @param a mảng số nguyên
     * @return chỉ số phần tử âm đầu tiên hoặc -1 nếu không có
     */
    public static int timViTriPhanTuAmDauTien(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                return i;
            }
        }
        return -1;
    }

}// end class