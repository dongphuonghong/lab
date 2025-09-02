// 13. Cho ba số a, b, c đọc vào từ bàn phím. Hãy tìm giá trị lớn nhất của ba số trên và in ra kết quả.
package lab2;

import java.util.Scanner;

public class Bt13 {
    public static void main(String[] args) {
        // khai báo biến a,b,c nhập từ bàn phím
        int a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap a: ");
            a = sc.nextInt();
            System.out.println("Nhap b: ");
            b = sc.nextInt();
            System.out.println("Nhap c: ");
            c = sc.nextInt();
            // đóng scanner
            sc.close();
            // tìm số lớn nhất trong 3 số bằng cách tạo biến max và giả sử a là số lớn nhất
            // sau đó so sánh với b và c
            int max = a;
            if (b > max) {
                max = b;
            }
            // so sánh max với c
            if (c > max) {
                max = c;
            }
            // in ra số lớn nhất
            System.out.println("So lon nhat la: " + max);
            sc.close();
        }
    }// end main
}// end class
 // cách 2
/**
 * import java.util.Scanner;
 * public class Bt13edit1 {
 * public static void main(String[] args) {
 * //tạo ra 3 biến a,b,c nhập từ bàn phím
 * int a,b,c;
 * try (Scanner sc = new Scanner(System.in)) {
 * System.out.println("Nhap a: ");
 * a = sc.nextInt();
 * System.out.println("Nhap b: ");
 * b = sc.nextInt();
 * System.out.println("Nhap c: ");
 * c = sc.nextInt();
 * //đóng scanner
 * sc.close();
 * //tìm số lớn nhất trong 3 số bằng cách so sánh 3 số với nhau
 * if (a > b && a > c) {
 * System.out.println("So lon nhat la: " + a);
 * } else if (b > a && b > c) {
 * System.out.println("So lon nhat la: " + b);
 * } else {
 * System.out.println("So lon nhat la: " + c);
 * }
 * }
 * }//end main
 * }//end class
 */
// cách 3
/**
 * import java.util.Scanner;
 * public class Bt13edit {
 * public static void main(String[] args) {
 * //tạo ra 3 biến a,b,c nhập từ bàn phím
 * int a,b,c;
 * try (Scanner sc = new Scanner(System.in)) {
 * System.out.println("Nhap a: ");
 * a = sc.nextInt();
 * System.out.println("Nhap b: ");
 * b = sc.nextInt();
 * System.out.println("Nhap c: ");
 * c = sc.nextInt();
 * //đóng scanner
 * sc.close();
 * //tìm số lớn nhất trong 3 số bằng gọi hàm max của thư viện Math
 * int max = Math.max(a, Math.max(b, c));
 * //in ra số lớn nhất
 * System.out.println("So lon nhat la: " + max);
 * }
 * }//end main
 * }//end class
 */
// cách 4
/**
 * import java.util.Scanner;
 * public class Bt13edit {
 * public static void main(String[] args) {
 * //khai báo biến a,b,c nhập từ bàn phím
 * int a, b, c;
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Nhap a: ");
 * a = sc.nextInt();
 * System.out.println("Nhap b: ");
 * b = sc.nextInt();
 * System.out.println("Nhap c: ");
 * c = sc.nextInt();
 * //tìm số lớn nhất bằng cách sử dụng toán tử 3 ngôi
 * int max=(a>b)?a:b;
 * max=(max>c)?max:c;
 * //in ra số lớn nhất
 * System.out.println("So lon nhat la: "+max);
 * //đóng scanner
 * sc.close();
 * }
 * }//end main
 * }//end class
 */
