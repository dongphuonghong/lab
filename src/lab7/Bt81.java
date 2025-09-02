// 81. Viết hàm tìm vị trí phần tử âm lớn nhất trong mảng.
package lab7;

public class Bt81 {
    /**
     * Kiểm tra số có âm không.
     * 
     * @param x số cần kiểm tra
     * @return true nếu âm
     */
    public static boolean kiemTraAm(int x) {
        return x < 0;
    }

    /**
     * Tìm vị trí phần tử âm lớn nhất (giá trị gần 0 nhất) trong mảng.
     * 
     * @param a mảng số nguyên
     * @return vị trí phần tử âm lớn nhất hoặc -1 nếu không có
     */
    public static int timViTriPhanTuAmLonNhat(int[] a) {
        int max = -1;
        int viTri = -1;
        for (int i = 0; i < a.length; i++) {
            if (kiemTraAm(a[i]) && a[i] > max) {
                max = a[i];
                viTri = i;
            }
        }
        return viTri;
    }
}// end class