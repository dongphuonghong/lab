// 25. Viết chương trình nhập vào hai số nguyên dương a và b. Tìm ước số chung lớn nhất và bội số chung nhỏ nhất.
package lab3_2;
import java.util.Scanner;
public class Bt25 {
    public static void main(String[] args) {
        // Nhập hai số nguyên dương a và b từ bàn phím
        int a, b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập a: ");
            a = sc.nextInt();
            System.out.print("Nhập b: ");
            b = sc.nextInt();
        }
// Lưu giá trị ban đầu để tính BCNN
        int x = a; 
        int y = b; 

        // Thuật toán Euclidean để tìm UCLN
        do {
            // Nếu a lớn hơn b, cập nhật a là phần dư của a chia cho b
            if (a > b) {
                a = a % b;
            // Nếu b lớn hơn hoặc bằng a, cập nhật b là phần dư của b chia cho a
            } else {
                b = b % a;
            }
        } while (a != 0 && b != 0);
// UCLN là số còn lại khác 0
        int ucln = (a != 0) ? a : b; 
        // In ra UCLN
        System.out.println("UCLN: " + ucln);
        // BCNN = (a * b) / UCLN
        int bcnn = (x * y) / ucln;
        // In ra BCNN
        System.out.println("BCNN: " + bcnn);
    } // end main
} // end class Bt25
