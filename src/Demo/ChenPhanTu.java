// Chương trình chèn phần tử vào mảng tại vị trí chỉ định

import java.util.Arrays;

public class ChenPhanTu {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng ban đầu
        int[] a = {12, 5, 7, 9, 21, 38};
        // Giá trị cần chèn
        int x = 111;
        // Vị trí cần chèn
        int k = 3;
        // Tạo mảng mới có kích thước lớn hơn 1
        int[] b = new int[a.length + 1];
        // Sao chép phần tử từ mảng cũ sang mảng mới từ đầu đến vị trí k
        System.arraycopy(a, 0, b, 0, k);
        // Chèn phần tử x vào vị trí k
        b[k] = x;
    System.arraycopy(a, k, b, k + 1, a.length - k);
    System.out.println("mang sau khi chen phan tu"+ Arrays.toString(b));
    }//end main
}//end class