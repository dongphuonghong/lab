// 77. Viết hàm tìm vị trí của phần tử lớn nhất trong mảng các số nguyên.
package lab7;

public class Bt77 {
    /**
     * Tìm vị trí phần tử lớn nhất trong mảng.
     * 
     * @param a mảng số nguyên (độ dài >= 1)
     * @return chỉ số phần tử lớn nhất (nếu có nhiều chọn phần đầu tiên)
     */
    public static int timViTriMax(int[] a) {
        int max = a[0];
        int viTri = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                viTri = i;
            }
        }
        return viTri;
    }

}// end class
