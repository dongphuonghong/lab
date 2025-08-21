// 42. In ra day sô Fibonaci
package lab3;

import java.util.Scanner;

public class Bt42 {
        public static void main(String[] args) {
                int n;
                // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
                try (Scanner sc = new Scanner(System.in)) {
                        System.out.print("Nhap so nguyen duong N: ");
                        n = sc.nextInt();
                }
                // Khởi tạo hai phần tử đầu tiên của dãy Fibonaci là 0 và 1

                int a = 0;
                int b = 1;
                int Fibonaci;
                // In thông báo bắt đầu dãy số
                System.out.print("Day so Fibonaci: ");
                // Dùng vòng lặp for để in ra n phần tử đầu tiên của dãy Fibonaci
                for (int i = 0; i < n; i++) {
                        // In ra giá trị hiện tại của a
                        System.out.print(a + " ");
                        // Tính số Fibonaci tiếp theo bằng tổng của hai số trước đó
                        Fibonaci = a + b;
                        // Cập nhật giá trị a và b cho lần lặp tiếp theo

                        a = b;
                        b = Fibonaci;
                }
                // Xuống dòng sau khi in xong dãy
                System.out.println();
        }// end main
}// end class
