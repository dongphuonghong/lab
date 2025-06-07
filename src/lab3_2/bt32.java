// 32. Tính S = 1! + 2! + 3! + ... + n! (Tổng các giai thừa)
package lab3_2;
import java.util.Scanner;
public class bt32 {
    public static void main(String[] args) {
        // Nhập số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
        }
        // Tính tổng các giai thừa từ 1! đến n!
        int giaithua = 1;
        int sum = 0;
        int i = 1;
        do {
            // Tính i!
            giaithua *= i; 
            // Cộng vào tổng
            sum += giaithua; 
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        } while (i <= n);
        // In ra kết quả tổng S(n)
        System.out.println("S = " + sum);
    } // end main
} // end class 