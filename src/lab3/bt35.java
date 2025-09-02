// 35. Tính S = 1/(1.2) + 1/(2.3) + ... + 1/(n(n+1)) (n >= 0).
package lab3;

import java.util.Scanner;

public class Bt35 {
    public static void main(String[] args) {
        int n;
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        try (Scanner sc = new Scanner(System.in)) {
            // Nhập giá trị n từ bàn phím
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        // Khởi tạo biến sum kiểu double để lưu tổng các phân số
        double sum = 0;
        // Dùng vòng lặp for để tính tổng các phân số từ 1 đến 1/(n+1)
        for (int i = 1; i <= n + 1; i++) {
            // Cộng dồn 1/i vào biến sum (ép kiểu để đảm bảo chia thực)
            sum += (int) Math.pow(i, i + 1);
        }
        // In ra kết quả tổng S(n)
        System.out.println("Tong S = " + sum);
    }// end main
}// end class
