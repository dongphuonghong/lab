// 35. Tính S = Σ(i³ + i² + i) từ i=1 đến n (Tổng lũy thừa bậc 3, 2 và 1)
package lab3_2;
import java.util.Scanner;
public class Bt35 {
    public static void main(String[] args) {
        // Nhập số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
        }
// tạo biến sum để lưu tổng, khởi tạo bằng 0        
        double sum = 0;
        int i = 1;
        do {
            // Tính tổng (i³ + i² + i) từ i=1 đến n
            sum += Math.pow(i, 3) + Math.pow(i, 2) + i; 
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        } while (i <= n);
        // In ra kết quả tổng S(n)
        System.out.println("Tổng S = " + sum);
    } // end main
} // end class Bt35
