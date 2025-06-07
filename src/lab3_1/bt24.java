// 24. Viết chương trình nhâp̣ số nguyên dương n. Kiểm tra n có phải là số nguyên tố hay không.
// Số nguyên tố là số lớn hơn 1, chỉ chia hết cho 1 và chính nó.
package lab3_1;
import java.util.Scanner;
public class bt24 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n từ bàn phím
        int n;
    try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập số nguyên dương n: ");
            n = sc.nextInt();
            } 
        //nếu n nhỏ hơn 2 thì không phải là số nguyên tố
            if (n < 2) {
                System.out.println(n + " không phải là số nguyên tố");
            } else {
                //duyệt từ 2 đến căn bậc hai của n để tìm ước số
                int i = 2;
                while (i <= Math.sqrt(n)) {
                    //kiểm tra nếu có ước nào chia hết cho n thì n không phải số nguyên tố
                    if (n % i == 0) {
                System.out.println(n + " không phải là số nguyên tố");
                        //thoát khỏi vòng lặp khi đã tìm thấy ước số
                        break;
                    }
                    i++;
                }
                //nếu không tìm thấy ước số nào (i > căn bậc hai của n) thì n là số nguyên tố
                if (i > Math.sqrt(n)) {
                    System.out.println(n + " là số nguyên tố");
                }
            }
            }// end main
}//end class