// 35. Tính S = Σ(i³ + i² + i) từ i=1 đến n
// Tổng của (i³ + i² + i) với i từ 1 đến n
package lab3_1;
import java.util.Scanner;
public class Bt35 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }        
        // Khởi tạo biến sum kiểu double để lưu tổng các giá trị
        double sum = 0;
        int i = 1;
    // Sử dụng vòng lặp while để tính tổng các giá trị từ 1 đến n
        while (i <= n) {
            // Cộng i³ + i² + i vào tổng
            sum += Math.pow(i, 3) + Math.pow(i, 2) + i;
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }
        // In ra kết quả tổng S(n)
    System.out.println("Tong S = " + sum);
    } // end main
} // end class
