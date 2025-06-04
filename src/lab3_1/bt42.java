// 42. In ra dãy số Fibonacci
// Chương trình in ra n số đầu tiên trong dãy số Fibonacci
package lab3_1;
import java.util.Scanner;
public class bt42 {
    public static void main(String[] args) {
        // Khởi tạo biến n để lưu số nguyên dương nhập từ bàn phím
        int n;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap so nguyen duong N: ");
            n = sc.nextInt();
        }
        // Tạo biến a và b để lưu hai số đầu tiên của dãy Fibonacci: 0 và 1
        int a = 0;
        int b = 1;
        // Biến fibonacci để lưu giá trị tiếp theo trong dãy
        int fibonacci;
    // In ra dãy số Fibonacci
        System.out.print("Day so Fibonacci: ");
        int i = 0;

        // Sử dụng vòng lặp while để in ra n số trong dãy Fibonacci
        while (i < n) {
            // In ra số Fibonacci hiện tại
            System.out.print(a + " ");
            // Tính số Fibonacci tiếp theo bằng cách cộng hai số trước đó
            fibonacci = a + b;
            // Cập nhật a và b cho lần lặp tiếp theo
            a = b;
            // Cập nhật b là số Fibonacci mới
            b = fibonacci;
            // Tăng biến đếm i lên 1 để tiếp tục vòng lặp
            i++;
        }
// In dòng mới sau khi in dãy số
        System.out.println(); 
    } // end main
} // end class