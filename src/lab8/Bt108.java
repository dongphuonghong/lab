// 108. Viết hàm tính giá trị trung bình các phần tử có giá trị là ước số của x trong mảng số nguyên 
package lab8;

/**
 * Bài 108: Tính giá trị trung bình các phần tử là ước số của x trong mảng số
 * nguyên.
 */
public class Bt108 {
    /**
     * Tính giá trị trung bình các phần tử trong mảng a mà là ước số của x.
     *
     * @param a mảng số nguyên
     * @param x số nguyên để kiểm tra ước số
     * @return giá trị trung bình các phần tử là ước số của x, nếu không có thì trả
     *         về 0
     */
    public static double giaTriTrungBinhUocSoCuaX(int[] a, int x) {
        int sum = 0;
        int d = 0;
        for (int num : a) {
            if (x % num == 0) {
                sum += num;
                d++;
            }
        }
        if (d == 0) {
            return 0;
        }
        return (double) sum / d;
    }
}// end class