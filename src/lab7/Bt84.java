/**
 * Bài 84: In các phần tử là bội của 3 hoặc 5.
 */
package lab7;

public class Bt84 {
    /**
     * In các phần tử trong mảng là bội của 3 hoặc 5.
     * 
     * @param a mảng số nguyên cần duyệt
     */
    public static void inBoi3hoac5(int[] a) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 || a[i] % 5 == 0) {
                System.out.print(a[i] + " ");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Khong co phan tu nao la boi cua 3 hoac 5.");
        }
        System.out.println();
    }
}// end class