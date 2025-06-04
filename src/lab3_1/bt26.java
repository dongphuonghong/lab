// 26. Viêt chương trinh đêm sô ươc sô cua sô nguyên dương N.Vi du:  N=12sô ươc sô cua 12 la 6
package lab3_1;
import java.util.Scanner;
public class bt26 {
    public static void main(String[] args) {
        int n;
        // Nhập số nguyên dương từ bàn phím
            try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Nhap so nguyen duong N: ");
        n = sc.nextInt();
            }
        // Khởi tạo biến đếm số ước
        int d = 0;
        int i = 1;
        // Duyệt từ 1 đến n để kiểm tra từng số có phải là ước của n không
        while (i <= n) {
            // Nếu n chia hết cho i thì i là ước số của n → tăng biến đếm
            if (n % i == 0) {
                d ++;
            }
            i++;
        }
        // In ra tổng số ước của n (bao gồm 1 và chính nó)
        System.out.println("Tong so uoc cua " + n + " la: " + d);
    }//end main
}//end class