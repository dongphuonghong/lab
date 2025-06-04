// 37. Tính S = 1 + 1/2! + 1/3! + ... + 1/n!
// Tổng nghịch đảo các giai thừa từ 1! đến n!
package lab3_1;
import java.util.Scanner;
public class bt37 {
    public static void main(String[] args) {
        // Nhập vào số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        // Khởi tạo biến giai thừa ban đầu là 1
    int giaithua = 1;
        // Khởi tạo biến sum để lưu tổng các giai thừa, bắt đầu từ 1 (tương ứng với 1/1!)
    double sum = 1; 
        int i = 2;
        // Tính tổng 1/i! từ i=2 đến n
        while (i <= n) {
            // Cập nhật giai thừa tại bước i
            giaithua *= i; 
// Cộng 1/giaithua! vào tổng
            sum += (double) 1 / giaithua; 
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }
        // In kết quả tổng S(n)
System.out.println("S = " + sum);
    } // end main
} // end class