// 30. Tính S = (1 + 3 + 5 + ... + (2n+1)) × (1 + 2 + 3 + ... + n)
package lab3_2;
import java.util.Scanner;
public class Bt30 {
    public static void main(String[] args) {
        // Nhập số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
        }
        // Tính tổng các số tự nhiên và tổng các số lẻ
        int tong_tu_nhien = 0;
        int tong_so_le = 0;
        // Tính tổng các số lẻ: 1 + 3 + 5 + ... + (2n+1)
        int i = 0;
        do {
            // Tính số lẻ thứ i theo công thức: 2*i + 1
            tong_so_le += (2 * i) + 1;
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        } while (i <= n);
        // Tính tổng các số tự nhiên: 1 + 2 + 3 + ... + n
        int j = 1;
        while (j <= n) {
            // Cộng dồn các số tự nhiên vào tổng
            tong_tu_nhien += j;
            // Tăng j lên 1 để tiếp tục vòng lặp
            j++;
        }
        // Tính kết quả cuối cùng
        int kq = tong_so_le * tong_tu_nhien;
        // In ra kết quả
        System.out.println("Kết quả: " + kq);
    } // end main
} // end class Bt30
