// 87. Viết hàm tìm và đổi chỗ phần tử lớn nhất với phần tử nhỏ nhất trong mảng.
package lab7;

public class Bt87 {
    /**
     * Hoán đổi vị trí phần tử lớn nhất với phần tử nhỏ nhất trong mảng.
     * 
     * @param a mảng số nguyên cần xử lý
     */
    public static void hoanViTriMaxMin(int[] a) {
        int vtMax = 0;
        int vtMin = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[vtMax]) {
                vtMax = i;
            }
            if (a[i] < a[vtMin]) {
                vtMin = i;
            }
        }
        int temp = a[vtMax];
        a[vtMax] = a[vtMin];
        a[vtMin] = temp;
    }

}// end class