// 29. Tính P(n) = 1 × 3 × 5 × ... × (2n + 1) với n >= 0
// Đây là tích của (n+1) số lẻ đầu tiên: 1, 3, 5, ..., (2n+1) 29. Tinh,  vơi) 1 2 ( 5 . 3 . 1 ) (   n n P 
// Đây là tích của dãy các số lẻ liên tiếp bắt đầu từ 1 đến (2n + 1)
package lab3_1;
import java.util.Scanner;
public class Bt29 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        // Khởi tạo biến tích = 1
        int tich = 1;
        int i = 0;
        // Duyệt từ i = 0 đến i = n để tính tích các số lẻ
        while(i <= n) {
            // Tính số lẻ thứ i theo công thức: 2*i + 1
            int soLe = (2 * i) + 1;
            // Nhân tích với số lẻ vừa tính được
            tich *= soLe;
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }
        // In kết quả tích P(n)
        System.out.println("P(" + n + ") = " + tich);
    }//end main
}//end class
