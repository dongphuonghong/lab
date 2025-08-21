// 24. Viết chương trình nhâp̣ số nguyên dương n. Kiểm tra n có phải là số nguyên tố hay không.
// Số nguyên tố là số lớn hơn 1, chỉ chia hết cho 1 và chính nó.
package lab3;

import java.util.Scanner;

public class Bt24 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhập số nguyên dương n: ");
            n = sc.nextInt();
        }
        // Duyệt từ 2 đến căn bậc hai của n
        for (int i = 2; i * i <= n; i++) {
            // kiểm tra Nếu có ước nào chia hết cho n thì n không phải số nguyên tố
            if (n % i == 0) {
                System.out.println(n + "không phải là số nguyên tố");
                // Thoát khỏi vòng lặp
                break;
            }
            // Nếu không có ước nào chia hết cho n thì n là số nguyên tố
            else {
                System.out.println(n + " là số nguyên tố");
            }
        }
    }// end main
}// end class
