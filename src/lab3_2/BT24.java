// 24. Viết chương trình nhập số nguyên dương n. Kiểm tra n có phải là số nguyên tố hay không.
// Số nguyên tố là số lớn hơn 1, chỉ chia hết cho 1 và chính nó.
package lab3_2;

import java.util.Scanner;

public class Bt24 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập số nguyên dương n: ");
            n = sc.nextInt();
        }
        // nếu n nhỏ hơn 2 thì không phải là số nguyên tố
        if (n < 2) {
            System.out.println(n + " không phải là số nguyên tố");
        }
        // dùng do-while để duyệt từ 2 đến căn bậc hai của n để tìm ước số
        int i = 2;
        do {
            // kiểm tra nếu có ước nào chia hết cho n và khác n thì n không phải số nguyên
            // tố
            if (n % i == 0 && i != n) {
                System.out.println(n + " không phải là số nguyên tố");
                // thoát khỏi vòng lặp khi đã tìm thấy ước số
                break;
            }
            // tăng i lên 1
            i++;
        } while (i * i <= n);
        // kiểm tra nếu không tìm thấy ước số nào (i > căn bậc hai của n) thì n là số
        // nguyên tố
        // vì do-while nên i sẽ lớn hơn căn bậc hai của n
        if (i > Math.sqrt(n)) {
            // in ra kết quả
            System.out.println(n + " là số nguyên tố");
        }
    }// end main
}// END Class
