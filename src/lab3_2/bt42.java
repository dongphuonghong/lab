// 42. In ra dãy số Fibonacci (Dãy số mà mỗi số bằng tổng hai số trước đó)
package lab3_2;
import java.util.Scanner;
public class bt42 {
    public static void main(String[] args) {
        // Nhập số nguyên dương N từ bàn phím
        int n;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập số nguyên dương N: ");
            n = sc.nextInt();
        }
        // In ra N số đầu tiên trong dãy Fibonacci
        int a = 0; // Số Fibonacci đầu tiên
        int b = 1; // Số Fibonacci thứ hai
        int fibonacci;
        
        System.out.print("Dãy số Fibonacci: ");
        int i = 0;
        do {
            // In ra số Fibonacci hiện tại
            System.out.print(a + " ");
            // Tính số Fibonacci tiếp theo
            fibonacci = a + b; 
            // Cập nhật a = b
            a = b; 
            // Cập nhật b = fibonacci
            b = fibonacci; 
            // Tăng biến đếm i lên 1 để tiếp tục vòng lặp
            i++;
        } while (i < n);
        // In dòng mới sau khi in dãy số
System.out.println(); // In dòng mới sau khi in dãy số
    } // end main
} // end class bt42