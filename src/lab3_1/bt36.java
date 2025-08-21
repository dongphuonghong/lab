// 36. Tính S = 1² + 2³ + 3⁴ + ... + n^(n+1)
// Tổng các lũy thừa với số mũ tăng dần
package lab3_1;
import java.util.Scanner;
public class Bt36 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }        
        // Khởi tạo biến sum để lưu tổng các lũy thừa, giá trị ban đầu = 0
        int sum = 0;
        int i = 1;
            // Tính tổng i^(i+1) từ i=1 đến i=n
        while (i <= n) {
// Cộng i^(i+1) vào tổng
            sum += (int) Math.pow(i, i + 1); 
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }
        // In kết quả tổng S(n)
        System.out.println("Tong S = " + sum);
    } // end main
} // end class
