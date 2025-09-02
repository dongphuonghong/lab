// 83. Viết hàm tìm vị trí phần tử dương bé nhất trong mảng.
package lab7;

public class Bt83 {
    /**
     * Tìm vị trí phần tử dương nhỏ nhất trong mảng.
     * 
     * @param a mảng số nguyên
     * @return chỉ số phần tử dương nhỏ nhất hoặc -1 nếu không có số dương
     */
    public static int timViTriPhanTuDuongNhoNhat(int[] a) {
        boolean flag = false;
        int min = 0;
        int viTri = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                if (!flag || a[i] < min) {
                    min = a[i];
                    viTri = i;
                    flag = true;
                }
            }
        }
        return viTri;
    }
}// end class