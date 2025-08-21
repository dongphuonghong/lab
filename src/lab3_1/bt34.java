// 34. Tính S = 1 + 1/2 + 1/3 + ... + 1/n
// Tổng nghịch đảo các số tự nhiên từ 1 đến n
package lab3_1;
import java.util.Scanner;
public class Bt34 {
    public static void main(String[] args) {
        // Nhập vào số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }        
        // Khởi tạo biến sum để lưu tổng các phân số, bắt đầu từ 0
        double sum = 0;
        int i = 1;
        // Tính tổng các phân số 1/i từ i=1 đến i=n
        while (i <= n) {
// Cộng 1/i vào tổng
            sum += (double) 1 / i; 
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }
        // In kết quả tổng S(n)
        System.out.println("Tong S = " + sum);
    } // end main
} // end class
