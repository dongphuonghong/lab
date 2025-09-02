// 25. Viết chương trình nhập vào hai số nguyên dương a và b. Tìm ước số chung lớn nhất và bội số chung nhỏ nhất.
//ước số chung lớn nhất (UCLN) của hai số nguyên dương a và b là số nguyên dương lớn nhất chia hết cho cả a và b.
//bội số chung nhỏ nhất (BCNN) của hai số nguyên dương a và b là số nguyên dương nhỏ nhất chia hết cho cả a và b.
package lab3;

import java.util.Scanner;

public class Bt25 {
        public static void main(String[] args) {
                // Nhập hai số nguyên dương từ bàn phím
                int a, b;
                try (Scanner sc = new Scanner(System.in)) {
                        System.out.println("Nhap vao so nguyen duong a: ");
                        a = sc.nextInt();
                        System.out.println("Nhap vao so nguyen duong b: ");
                        b = sc.nextInt();
                }
                // Khởi tạo biến ucln = 1 (trường hợp giả sử là 1)
                int ucln = 1;
                // Duyệt các số từ 2 đến min(a, b)
                for (int i = 1; i <= Math.min(a, b); i++) {
                        // Nếu tìm được số i chia hết cho cả a và b thì cập nhật ucln
                        if (a % i == 0 && b % i == 0) {
                                ucln = i;
                        }
                }
                // In ra Ước số chung lớn nhất
                System.out.println("UCLN: " + ucln);
                // Tính BCNN theo công thức: (a * b) / UCLN
                int bcnn = (a * b) / ucln;
                // In ra Bội số chung nhỏ nhất
                System.out.println("BCNN: " + bcnn);
        }// end main
}// end class
