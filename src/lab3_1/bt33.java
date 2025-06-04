// 33. Tính S = 1² + 2² + 3² + ... + n²
// Ý tưởng: sử dụng vòng lặp để tính tổng bình phương các số tự nhiên từ 1 đến n 33. Tinh,  vơi2 2 2 2 3 2 1 ) ( n n S      
package lab3_1;
import java.util.Scanner;
public class bt33 {
    public static void main(String[] args) {
        // Nhập vào số nguyên n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }        
        // Khởi tạo biến sum để lưu tổng các bình phương giá trị = 0
        int sum = 0;
    // Sử dụng vòng lặp while để tính tổng bình phương từ 1 đến n
        int i = 1;
        while (i <= n) {
            // Cộng bình phương của i vào tổng (i^2 = i * i)
            sum += i * i;
            // Tăng i lên 1 để tiếp tục vòng lặp
            i++;
        }        
        // In kết quả
        System.out.println("Tong S = " + sum);
    } // end main
} // end class