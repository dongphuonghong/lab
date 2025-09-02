/**
 * 22. Nhập vào 3 số nguyên dương. Kiểm tra xem 3 số đó có lập thành tam giác không?
 * Nếu có, hãy cho biết tam giác đó thuộc loại nào (cân, vuông, đều, …).
 */
package lab2;

import java.util.Scanner;

public class Bt22 {
    public static void main(String[] args) {
        // tạo biến a,b,c nhập từ bàn phím
        int a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap a: ");
            a = sc.nextInt();
            System.out.println("Nhap  b: ");
            b = sc.nextInt();
            System.out.println("Nhap  c: ");
            c = sc.nextInt();
        }
        // kiểm tra 3 số có lập thành tam giác không
        // nếu có thì kiểm tra tam giác đó thuộc loại nào
        // tam giác đều: 3 cạnh bằng nhau
        // tam giác cân: 2 cạnh bằng nhau
        // tam giác vuông: cạnh huyền bằng căn bậc 2 của tổng bình phương 2 cạnh góc
        // vuông
        // tam giác thường: không thuộc 3 loại trên
        // nếu a+b>c và a+c>b và b+c>a thì 3 số đó lập thành tam giác
        // nếu a=b=c thì tam giác đó là tam giác đều
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Tam giac deu");
                // nếu a=b hoặc a=c hoặc b=c thì tam giác đó là tam giác cân
            } else if (a == b || a == c || b == c) {
                System.out.println("Tam giac can");
                // nếu a*a+b*b=c*c hoặc a*a+c*c=b*b hoặc b*b+c*c=a*a thì tam giác đó là tam giác
                // vuông
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Tam giac vuong");
                // nếu a!=b!=c thì tam giác đó là tam giác thường
            } else {
                System.out.println("Tam giac thuong");
            }
        }
    }// end main
}// end class
