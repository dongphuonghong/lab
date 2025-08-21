// 26. Viết chương trình đếm số ước số của số nguyên dương N. Ví dụ: N=12, số ước số của 12 là 6
package lab3_2;
import java.util.Scanner;
public class Bt26 {
    public static void main(String[] args) {
        // Nhập số nguyên dương từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập số nguyên dương N: ");
            n = sc.nextInt();
        }
        // Đếm số ước số của n
        int d = 0; // Biến đếm số ước
        int i = 1;
        // Duyệt từ 1 đến n để tìm các ước số
        do {
            if (n % i == 0) {
                // Tăng biến đếm nếu i là ước của n
                d++; 
            }
            i++;
        } while (i <= n);
        System.out.println("Số ước của " + n + " là: " + d);
    } // end main
} // end class Bt26 
