// 26. Viết chương trình đếm số ước số của số nguyên dương N. Ví dụ: N = 12 có 6 ước số.
package lab3;

import java.util.Scanner;

public class Bt26 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Nhập số nguyên dương từ bàn phím
            int n;
            System.out.print("Nhap so nguyen duong N: ");
            n = sc.nextInt();
            // Khởi tạo biến đếm d = 1 (vì i bắt đầu từ 1, và 1 luôn là ước của mọi số)

            int d = 1;
            // Duyệt từ 1 đến n-1 để kiểm tra ước của n
            for (int i = 1; i < n; i++) {
                // Nếu n chia hết cho i thì i là ước số của n → tăng biến đếm

                if (n % i == 0) {
                    d++;
                }
            }
            // In ra tổng số ước của n (bao gồm cả chính nó)
            System.out.println("Tong cac uoc so cua " + n + " la: " + d);
        }
    }// end main
}// end class
