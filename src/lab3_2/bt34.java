// 34. Tính S = 1 + 1/2 + 1/3 + ... + 1/n (Tổng nghịch đảo các số tự nhiên)
package lab3_2;
import java.util.Scanner;
public class Bt34 {
    public static void main(String[] args) {
        // Nhập số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
        }
        
        // Tính tổng nghịch đảo các số từ 1 đến n
        // Khởi tạo biến sum để lưu tổng, bắt đầu từ 0
        double sum = 0;
        int i = 1;
        do {
            // Cộng 1/i vào tổng
            sum += (double) 1 / i; 
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        } while (i <= n);
        // In kết quả tổng S(n)
        System.out.println("S = " + sum);
    } // end main
} // end class Bt34
