// 30. Tính S = (1 + 3 + 5 + ... + (2n+1)) × (1 + 2 + 3 + ... + n)
// Gồm hai phần: tổng dãy số lẻ từ 1 đến (2n + 1) và tổng các số tự nhiên từ 1 đến n
package lab3_1;
import java.util.Scanner;
public class Bt30 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        // Khởi tạo biến tổng các số tự nhiên và tổng các số lẻ
        int tong_tu_nhien = 0;
        int tong_so_le = 0;        
        // Dùng vòng lặp để tính tổng các số lẻ từ 1 đến (2n + 1)
        int i = 0;
        while (i <= n) {
            // Tính số lẻ thứ i theo công thức: 2*i + 1
            tong_so_le += (2 * i) + 1;
            i++;
        }
    // Dùng vòng lặp để tính tổng các số tự nhiên từ 1 đến n
        int j = 1;
        while (j <= n) {
            tong_tu_nhien += j;
            j++;
        }
                // Tính kết quả theo công thức: tổng số lẻ × tổng tự nhiên
        int kq = tong_so_le * tong_tu_nhien;    
        // In ra kết quả
        System.out.println("Ket qua: " + kq);
    } // end main
} // end class
