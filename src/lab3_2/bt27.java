// 27. Một số hoàn thiện là số có tổng các ước số của nó (không kể nó) bằng chính nó.
//     Nhập số nguyên dương n và kiểm tra n có phải là số hoàn thiện hay không.
package lab3_2;

import java.util.Scanner;

public class Bt27 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n, sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập số nguyên dương n: ");
            n = sc.nextInt();
        }

        // Tính tổng các ước số của n (không kể n)
        int i = 1;
        do {
            // Kiểm tra nếu i là ước của n
            if (n % i == 0) {
                // Cộng ước số vào tổng
                sum += i;
            }
            // Tăng i lên 1 để kiểm tra số tiếp theo
            i++;
        } while (i < n); // Duyệt từ 1 đến n-1

        // Kiểm tra n có phải là số hoàn thiện hay không
        if (sum == n) {
            // Nếu tổng các ước số bằng n thì n là số hoàn thiện
            System.out.println(n + " là số hoàn thiện.");
            // ngược lại nếu tổng các ước số không bằng n không là số hoàn thiện
        } else {
            System.out.println(n + " không phải là số hoàn thiện.");
        }
    } // end main
} // end class Bt27
