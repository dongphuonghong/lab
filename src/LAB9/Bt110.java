package LAB9;

/**
 * Bài 110: Cung cấp hàm sắp xếp tăng dần các phần tử nguyên tố trong mảng giữ
 * nguyên vị trí tương đối các phần tử khác.
 */
public class Bt110 {

    /**
     * Điểm vào chương trình (hiện chưa triển khai luồng xử lý cụ thể).
     * 
     * @param args tham số dòng lệnh (không dùng)
     */
    public static void main(String[] args) {

    }// end main

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
     * Sắp xếp các phần tử là số nguyên tố theo thứ tự tăng dần (đổi chỗ trực tiếp
     * giữa các số nguyên tố).
     * Các phần tử không phải số nguyên tố không bị xét điều kiện đổi chỗ.
     * 
     * @param a mảng số nguyên cần sắp xếp (thay đổi tại chỗ)
     */
    public static void sapXepTangDanNguyenTo(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (laSoNguyenTo(a[i]) && laSoNguyenTo(a[j]) && a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}// end class
