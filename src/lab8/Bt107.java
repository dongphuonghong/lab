// 107. Viết hàm tính giá trị trung bình các phần tử có giá trị lẻ trong mảng số nguyên.
package lab8;

/**
 * Bài 107: Tính giá trị trung bình các phần tử có giá trị lẻ trong mảng số
 * nguyên.
 */
public class Bt107 {
    /**
     * Tính giá trị trung bình của các phần tử lẻ trong mảng.
     *
     * @param a mảng số nguyên
     * @return giá trị trung bình của các phần tử lẻ, hoặc 0 nếu không có phần tử lẻ
     */
    public static double giaTriTrungBinhLe(int[] a) {
        int sum = 0;
        int dem = 0;
        for (int num : a) {
            if (num % 2 != 0) {
                sum += num;
                dem++;
            }
        }
        if (dem == 0) {
            return 0;
        }
        return (double) sum / dem;
    }

}// end class
