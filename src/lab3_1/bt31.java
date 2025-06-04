// 31. Tính S = 1 - 2 + 3 - 4 + ... + (-1)^(n+1) * n
// Tổng xen kẽ các số từ 1 đến n với dấu + và -
package lab3_1;
import java.util.Scanner;
public class bt31 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
// Khởi tạo biến sum để lưu tổng S(n), giá trị ban đầu = 0
        int sum = 0;
        int i = 1;
        // Duyệt từ 1 đến n với quy luật: số lẻ cộng, số chẵn trừ
        while (i <= n) {
            // Kiểm tra số i là chẵn hay lẻ
            // Nếu i là số chẵn thì trừ, nếu lẻ thì cộng
            if (i % 2 == 0) {
// Số chẵn: trừ
                sum -= i; 
            } else {
// Số lẻ: cộng
                sum += i; 
            }
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }
        // In kết quả tổng S(n)
    System.out.println("Tong S = " + sum);
    } // end main
} // end class