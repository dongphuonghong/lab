// 106. Viết hàm ti ́nh giá tri ̣ trung bi ̀nh các số hoàn thiện trong mảng các số nguyên.
package lab8;

/**
 * Bài 106: Tính giá trị trung bình các số hoàn thiện trong mảng số nguyên.
 */
public class Bt106 {
    /**
     * Kiểm tra một số có phải là số hoàn thiện hay không.
     * Số hoàn thiện là số nguyên dương bằng tổng các ước số dương (không tính chính
     * nó).
     *
     * @param x số nguyên cần kiểm tra
     * @return true nếu x là số hoàn thiện, ngược lại false
     */
    public static boolean kiemTraSoHoanThien(int x) {
        if (x <= 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        return sum == x;
    }

    /**
     * Tính giá trị trung bình các phần tử là số hoàn thiện trong mảng.
     *
     * @param a mảng số nguyên
     * @return giá trị trung bình các phần tử là số hoàn thiện trong mảng, nếu không
     *         có phần tử nào là số hoàn thiện thì trả về 0
     */
    public static double giaTriTrungBinhSoHoanThien(int[] a) {
        int sum = 0;
        int d = 0;
        for (int num : a) {
            if (kiemTraSoHoanThien(num)) {
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
