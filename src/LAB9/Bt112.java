package LAB9;

/**
 * Bài 112: Sắp xếp các phần tử chẵn trong mảng theo thứ tự giảm dần (đổi chỗ
 * giữa các phần tử chẵn).
 */
public class Bt112 {

    /**
     * Sắp xếp các phần tử chẵn theo thứ tự giảm dần bằng thuật toán đổi chỗ O(n^2).
     * 
     * @param a mảng số nguyên cần sắp xếp (thay đổi tại chỗ)
     */
    public static void sapXepChanGiamDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] % 2 == 0 && a[j] % 2 == 0 && a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}// end class