//16Giai va biên luân phương trinh:0 2    c bx ax
package lab2;
import java.util.Scanner;
public class Bt16 {
    public static void main(String[] args) {//
        //tạo biến a, b, c nhập từ bàn phím
        double a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.out.println("Nhap c: ");
        c = sc.nextDouble();
        //tính delta bằng bình phương của b - 4*a*c
double delta = b * b - 4 * a * c;
        //nếu delta < 0 thì phương trình vô nghiệm  
if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
            //nếu delta = 0 thì phương trình có nghiệm kép
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep: " + (-b / (2 * a)));
            //nếu delta > 0 thì phương trình có 2 nghiệm phân biệt
        } else {
            //tính nghiệm x1 và x2 theo công thức x1 = (-b + căn bậc 2 của delta) / 2*a và x2 = (-b - căn bậc 2 của delta) / 2*a
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            //in ra kết quả
            System.out.println("Phuong trinh co 2 nghiem phan biet: "+ x1 + " va " + x2);
        }
        //đóng sc
        sc.close();
        }
        }//end main
}// emd class
//cách 2
/**
 * import java.util.Scanner;
public class Bt16edit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        //tạo biến a,b,c,x1,x2,delta và nhập giá trị từ bàn phím
double       a,b,c; 
double       x1,x2;
double       delta;
System.out.println("Nhap a: ");
a = sc.nextDouble();
System.out.println("Nhap b: ");
b = sc.nextDouble();
System.out.println("Nhap c: ");
c = sc.nextDouble();
//Xét các trường hợp của phương trình bậc 2 ax^2 + bx + c = 0 nếu a và b và c đều bằng 0 thì phương trình có vô số nghiệm
if (a==0 && b==0) { 
    if (c==0) {
        System.out.println("Phuong trinh vo so nghiem");
    }
    }
    //công thức tính delta và x1,x2 delta = b*b - 4*a*c
    delta = b*b - 4*a*c;
    // nếu delta < 0 thì phương trình vô nghiệm
if (delta < 0) {
System.out.println("Phuong trinh vo nghiem");
}
// nếu delta = 0 thì phương trình có nghiệm kép
else if (delta == 0) {
x1 = -b/(2*a);
System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
}
// nếu delta > 0 thì phương trình có 2 nghiệm phân biệt x1 và x2
else {
    //công thức tính x1 và x2 x1 =-b+delta*0.5/(2*a) và x2 = -b-delta*0.5/(2*a) 0.5 là căn bậc 2 của delta
    x1 =(-b+delta*0.5)/(2*a);
x2 = (-b-delta*0.5)/(2*a);
//in ra kết quả
System.out.println("Phuong trinh co 2 nghiem phan biet: "+ "x1 = " + x1 + " va x2 = " + x2);
}
//đóng scanner
sc.close();
}
    }//end main
}//end class
 */
