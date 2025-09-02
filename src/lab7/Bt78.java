/**
 * Bài 78: In vị trí các phần tử nguyên tố trong mảng.
 */
package lab7;

public class Bt78 {
    /**
     * Kiểm tra một số có phải số nguyên tố.
     * 
     * @param x số cần kiểm tra
     * @return true nếu x là số nguyên tố, ngược lại false
     */
    public static boolean laSoNguyenTo(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * In ra các vị trí trong mảng a chứa số nguyên tố.
     * 
     * @param a mảng số nguyên cần duyệt
     */
    public static void inViTriSoNguyenTo(int[] a) {
        boolean flag = false;
        System.out.print("Vi tri cac so nguyen to trong mang: ");
        for (int i = 0; i < a.length; i++) {
            if (laSoNguyenTo(a[i])) {
                System.out.print(i + " ");
                flag = true;
            }

        }
        if (!flag) {
            System.out.println("Khong co so nguyen to trong mang.");
        }
        System.out.println();
    }

}// end class
