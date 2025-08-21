// 37. Tính S = 1 + 1/2! + 1/3! + ... + 1/n! (Tổng nghịch đảo các giai thừa)
package lab3_2;
import java.util.Scanner;
public class Bt37 {
    public static void main(String[] args) {
        // Nhập số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
        }
        // Tính tổng 1 + 1/2! + 1/3! + ... + 1/n!
        //tạo biến giaithua để lưu giá trị giai thừa 
        int giaithua = 1;
        // Khởi tạo biến sum để lưu tổng các phân số, bắt đầu từ 1
        double sum = 1; 
        int i = 2;
        
        do {
            // Tính i!
            giaithua *= i; 
            // Cộng 1/i! vào tổng
            sum += (double) 1 / giaithua; 
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        } while (i <= n);
// In kết quả tổng S(n)
        System.out.println("S = " + sum);
    } // end main
} // end class Bt37
