//15 Solve and discuss the equation: ax + b = 0
package lab2;
import java.util.Scanner;
public class bt15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        double a, b;
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b/a;    
            System.out.println("Phuong trinh co nghiem x = " + x);                
        }
        sc.close();
    }
    }//end main
}//end class