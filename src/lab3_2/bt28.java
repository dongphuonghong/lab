// 28. Tính n! với n >= 0 (Giai thừa của n)
package lab3_2;
import java.util.Scanner;
public class Bt28 {
    public static void main(String[] args) {
        // Nhập số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
        }
        // Kiểm tra n có hợp lệ không
        if(n < 0) {
            System.out.println("Không tính được giai thừa của số âm!");
        } else {
            // Tính giai thừa của n bằng vòng lặp do-while
            int giaithua = 1;
            int i = 2;
            do {
                // Nhân với i
                giaithua *= i; 
                // Tăng i lên 1 để tiếp tục vòng lặp
                i++;
            } while (i <= n);
System.out.println("Giai thừa của " + n + " là: " + giaithua);
        }
    } // end main
} // end class Bt28
