// 41. Tính S = x² + x⁴ + x⁶ + ... + x^(2n)
// Tổng các lũy thừa chẵn của x từ x² đến x^(2n)
package lab3_1;
import java.util.Scanner;
public class Bt41 {
    public static void main(String[] args) {
        // Nhập vào số nguyên dương n và số thực x từ bàn phím
        int n;
        double x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            System.out.print("Nhap x: ");
            x = sc.nextDouble();
        }        
        // Khởi tạo biến sum để lưu tổng S(n), kiểu double để tính chính xác
        double sum = 0;
        int i = 1;
        // Sử dụng vòng lặp while để tính tổng các lũy thừa chẵn từ x² đến x^(2n)
        while (i <= n) {
            // Cộng x^(2*i) vào tổng (lũy thừa chẵn: x², x⁴, x⁶, ...)
            sum += Math.pow(x, 2 * i);
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }
        // In kết quả tổng S(n)
        System.out.println("S = " + sum);
    } // end main
} // end class
