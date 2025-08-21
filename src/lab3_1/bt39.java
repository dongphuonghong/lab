// 39. Tính S = 1/1 + 1/(1+2) + 1/(1+2+3) + ... + 1/(1+2+...+n)
// Tổng các phân số có mẫu số là tổng các số tự nhiên liên tiếp
package lab3_1;
import java.util.Scanner;
public class Bt39 {
    public static void main(String[] args) {
        // Nhập vào số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        // Khởi tạo biến sum để lưu tổng S(n), kiểu double để tính chính xác
        double sum = 0;
        // Biến t để lưu tổng các số từ 1 đến i (mẫu số của phân số)
        int t = 0;
        int i = 1;
// Sử dụng vòng lặp while để tính tổng các phân số từ 1 đến n
        while (i <= n) {
                // Cập nhật mẫu số: t = 1+2+...+i
            t += i; 
            // Cộng 1/t vào tổng sum
            sum += 1.0 / t;
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }
// In kết quả tổng S(n) với 4 chữ số thập phân        
        System.out.printf("Tong S = %.4f", sum);
    } // end main
} // end class
