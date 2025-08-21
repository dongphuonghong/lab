// 31. Tính S = 1 - 2 + 3 - 4 + ... + (-1)^(n+1) * n (Tổng dãy có dấu xen kẽ)
package lab3_2;
import java.util.Scanner;
public class Bt31 {
    public static void main(String[] args) {
        // Nhập số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
        }
        // Tính tổng dãy có dấu xen kẽ
        int sum = 0;
        int i = 1;
        
        do {
            // Kiểm tra số i là chẵn hay lẻ
            if (i % 2 == 0) {
                // Số chẵn thì trừ ra khỏi tổng
                sum -= i; 
                //ngược lại nếu là số lẻ thì cộng vào tổng
            } else {
                // Số lẻ thì cộng vào tổng
                sum += i; 
            }
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        } while (i <= n);   
        // In ra kết quả tổng S(n)
        System.out.println("Tong S = " + sum);
        }// end main
}// end class
