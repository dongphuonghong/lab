// 17. Giải và biện luận phương trình: ax^2 + bx + c = 0
package lab2;

import java.util.Scanner;

public class Bt17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // tạo biến a, b, c, delta, x1, x2 nhập từ bàn phím
            double a, b, c, delta, x1, x2;
            System.out.println("Nhap a: ");
            a = sc.nextDouble();
            System.out.println("Nhap b: ");
            b = sc.nextDouble();
            System.out.println("Nhap c: ");
            c = sc.nextDouble();
            // tính delta bằng công thức delta = b*b - 4*a*c
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                // nếu delta < 0 thì phương trình vô nghiệm
                System.out.println("Phuong trinh vo nghiem");
                // nếu delta = 0 thì phương trình có nghiệm kép
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
                // nếu delta > 0 thì phương trình có 2 nghiệm phân biệt x1 và x2
            } else {
                // tính x1 và x2 bằng công thức x1 = (-b + căn delta)/(2*a) và x2 = (-b - căn
                // delta)/(2*a)
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                // in kết quả
                System.out.println("Phuong trinh co 2 nghiem phan biet: " + "x1 = " + x1 + " va x2 = " + x2);
            }
            // dong scanner
            sc.close();
        } // end try
    }// end main
}// end class
 // cách 2
/*
 * import java.util.Scanner;
 * public class Bt17edit {
 * public static void main(String[] args) {
 * try (Scanner sc = new Scanner(System.in)) {
 * //tạo bien a, b, c, delta, x1, x2 nhap gia tri tu ban phim
 * double a, b, c, delta, x1, x2;
 * System.out.println("Nhap a: ");
 * a = sc.nextDouble();
 * System.out.println("Nhap b: ");
 * b = sc.nextDouble();
 * System.out.println("Nhap c: ");
 * c = sc.nextDouble();
 * //kiểm tra a, b, c có bằng 0 không nếu có thì in ra phương trình vô số nghiệm
 * if(a==0 && b==0 && c==0){
 * System.out.println("Phuong trinh vo so nghiem");
 * }
 * //công thức tính delta cdelta = b*b - 4*a*c
 * delta = b*b - 4*a*c;
 * if(delta < 0){
 * //nếu delta < 0 thì in ra phương trình vô nghiệm
 * System.out.println("Phuong trinh vo nghiem");
 * }else if(delta == 0){
 * //nếu delta = 0 thì in ra phương trình có nghiệm kép
 * x1 = -b/(2*a);
 * System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
 * }else{
 * //nếu delta > 0 thì in ra phương trình có 2 nghiệm phân biệt x1 và x2
 * //công thức tính x1, x2 x1=(-b+delta*0.5)/(2*a) và x2 = (-b-delta*0.5)/(2*a)
 * 0.5 = căn bậc 2 của delta
 * x1 =(-b+delta*0.5)/(2*a);
 * x2 = (-b-delta*0.5)/(2*a);
 * //in ra kết quả
 * System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 +
 * " va x2 = " + x2);
 * }
 * //đóng scanner
 * sc.close();
 * }//end try
 * }//end main
 * }//end class
 */
