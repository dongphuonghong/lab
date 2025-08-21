// 25. Viêt chương trinh nhâp vao hai sô nguyên dương a va b. Tim ươc sô chung lơn nhât va bôi sô 
//ước số chung lớn nhất (UCLN) của hai số nguyên dương a và b là số nguyên dương lớn nhất chia hết cho cả a và b.
//bội số chung nhỏ nhất (BCNN) của hai số nguyên dương a và b là số nguyên dương nhỏ nhất chia hết cho cả a và b.
package lab3_1;
import java.util.Scanner;
public class Bt25 {
    public static void main(String[] args) {
        // Nhập hai số nguyên dương từ bàn phím
        int a, b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap a: ");
            a = sc.nextInt();
            System.out.print("Nhap b: ");
            b = sc.nextInt();
        }
        // Tạo biến x và y để lưu giá trị ban đầu của a và b
        int x = a;
        int y = b;
        // Sử dụng thuật toán Euclid để tính UCLN
        // Lặp cho đến khi một trong hai số bằng 0
        while (a != 0 && b != 0) {
            // Nếu a lớn hơn b, cập nhật a là phần dư của a chia cho b
            if (a > b) {
                a = a % b;
            // Nếu b lớn hơn hoặc bằng a, cập nhật b là phần dư của b chia cho a
            } else {
                b = b % a;
            }
        }
        // Khi vòng lặp kết thúc, số nào khác 0 chính là UCLN
        int ucln = (a != 0) ? a : b;
        // In ra Ước số chung lớn nhất
        System.out.println("UCLN cua " + x + " va " + y + " la: " + ucln);
        // Tính BCNN theo công thức: (x * y) / UCLN
        int bcnn = (x * y) / ucln;
        // In ra Bội số chung nhỏ nhất
        System.out.println("BCNN cua " + x + " va " + y + " la: " + bcnn);
    }//end main
}//end class
//cách 2: dùng thuật toán Euclid chuẩn (biến tạm)
/* 
 * package lab3_1;
import java.util.Scanner;
public class Bt25_1 {
    public static void main(String[] args) {
        // Nhập hai số nguyên dương từ bàn phím
        int a, b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap a: ");
            a = sc.nextInt();
            System.out.print("Nhap b: ");
            b = sc.nextInt();
        }
        // Lưu giá trị ban đầu để tính BCNN
        int x = a;
        int y = b;
        
        // Sử dụng thuật toán Euclid chuẩn để tính UCLN
        // Lặp cho đến khi b bằng 0
        while(b != 0){
            // Tạo biến tạm để lưu giá trị của b
            int temp = b;
            // Cập nhật b là phần dư của phép chia a cho b
            b = a % b;
            // Cập nhật a là giá trị tạm (giá trị b cũ)
            a = temp;
        }
        // Khi vòng lặp kết thúc, a chính là UCLN
        int ucln = a;   
        // Tính BCNN theo công thức: (x * y) / UCLN
        int bcnn = (x * y) / ucln;        
        // In kết quả
        System.out.println("UCLN: " + ucln);
        System.out.println("BCNN: " + bcnn);
    }//end main
}//end class
 */
