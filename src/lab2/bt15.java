//15 Giải và biêṇ luâṇ phương trình: ax + b = 0
package lab2;
import java.util.Scanner;
public class Bt15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //tạo biến a, b nhập từ bàn phím
        double a, b;
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        //nếu a = 0 và b = 0 thì phương trình có vô số nghiệm
        if(a == 0 && b == 0){
            System.out.println("Phuong trinh vo so nghiem");
        //nếu  a = 0 và b khác 0 thì phương trình vô nghiệm
            } else if(a == 0 && b != 0){
                System.out.println("Phuong trinh vo nghiem");
        //nếu a khác 0 thì phương trình có nghiệm x = -b/a
} else {
            double x = -b/a;    
            System.out.println("Phuong trinh co nghiem x = " + x);                
        }
        sc.close();
    }
    }//end main
}//end clas
