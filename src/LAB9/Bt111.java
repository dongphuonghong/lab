package LAB9;

/**
 * Bài 111: Sắp xếp các phần tử lẻ trong mảng theo thứ tự tăng dần (đổi chỗ giữa
 * các phần tử lẻ).
 */
public class Bt111 {

    /**
     * Điểm vào chương trình (chưa triển khai thêm logic).
     * 
     * @param args tham số dòng lệnh (không dùng)
     */
    public static void main(String[] args) {

    }// end main

    /**
     * Sắp xếp các phần tử lẻ theo thứ tự tăng dần bằng thuật toán đổi chỗ O(n^2).
     * 
     * @param a mảng số nguyên cần sắp xếp (thay đổi tại chỗ)
     */
    public static void sapXepLeTangDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] % 2 != 0 && a[j] % 2 != 0 && a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}// end class
