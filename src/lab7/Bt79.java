// 79. Viết hàm in vị trí các phần tử nguyên tố lớn hơn 23.
package lab7;

public class Bt79 {
    /**
     * Kiểm tra một số có phải số nguyên tố.
     * 
     * @param x số cần kiểm tra
     * @return true nếu nguyên tố, ngược lại false
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
     * In các vị trí của phần tử nguyên tố > 23 trong mảng.
     * 
     * @param a mảng số nguyên cần duyệt
     */
    public static void inViTriSoNguyenTo(int[] a) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (laSoNguyenTo(a[i]) && a[i] > 23) {
                if (!flag) {
                    System.out.print("Vi tri cac so nguyen to lon hon 23: ");
                }
                System.out.print(i + " ");
                flag = true;
            }

        }
        if (!flag) {
            System.out.println("Khong co so nguyen to > 23 trong mang.");
        }
        System.out.println();
    }
}// end class