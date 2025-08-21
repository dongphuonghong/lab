// 40. Tính P(x,n) = x¹ + x² + x³ + ... + xⁿ
package lab3_1;
import java.util.Scanner;
public class Bt40 {
    public static void main(String[] args) {
        // Khai báo biến n và x từ bàn phím
        int n;
        double x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            System.out.print("Nhap x: ");
            x = sc.nextDouble();
        }
        // Khởi tạo biến sum kiểu double để lưu tổng các lũy thừa
        double sum = 0;
        // Khởi tạo biến luythua để lưu lũy thừa, bắt đầu từ 1
        double luythua = 1;
        int i = 1;
        // Dùng vòng lặp while để tính tổng từ x¹ đến xⁿ
        // Trong mỗi vòng lặp, nhân dồn x để tính x^i và cộng dồn vào tổng sum
        while (i <= n) {
// Tính x^i
            luythua *= x; 
// Cộng x^i vào tổng
            sum += luythua; 
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }
// In ra kết quả tổng P(x, n)
        System.out.println("Tong la: " + sum);
    } // end main
} // end class
