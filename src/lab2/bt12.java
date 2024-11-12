//12. Nhâp vao hai sô nguyên a, b. In ra man hinh gia tri lơn nhât.
package lab2
import java.util.Scanner;
public class bt12 {
    public static void main(String[] args) {
        //tạo ra biến a và b nhận giá trị số nguyên của người dùng nhập vào từ bàn phím
        int a, b;
        try (Scanner sc = new Scanner(System.in)) {
System.out.println("Nhap a: ");
a = sc.nextInt();
System.out.println("Nhap b: ");
b = sc.nextInt();
//đóng scanner
sc.close();
//tạo ra biến max để lưu giá trị lớn nhất giả định là a
 int max = a;
 //nếu b lớn hơn max thì gán max = b
    if (b > max) {
        max = b;
    }
    //in ra kết quả
    System.out.println("So lon nhat la: " + max);
}
    }//end main
}//end class
//cách 2
/**
 import java.util.Scanner;
public class bt12edit{
    public static void main(String[] args) {
tạo ra biến a và b nhận giá trị số nguyên của người dùng nhập vào từ bàn phím
        int a, b;
try (Scanner sc = new Scanner(System.in)) {
System.out.println("Nhap a: ");
a = sc.nextInt();
System.out.println("Nhap b: ");
b = sc.nextInt();
//đóng scanner
sc.close();
tìm số lớn nhất bằng cách sử dụng hàm max của lớp Math
 int max=Math.max(a,b);
    System.out.println("So lon nhat la: " + max);
}
}//end main
}//end class
*/
//cách 3
/**
 * import java.util.Scanner;
public class bt12edit1 {
    public static void main(String[] args) {
        int a, b;
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Nhập vào số a: ");
        a = sc.nextInt();
        System.out.println("Nhập vào số b: ");
        b = sc.nextInt();
        //đóng scanner
        sc.close();
        //tìm số lớn nhất bằng cách sử dụng toán tử 3 ngôi để so sánh
        int max =(a>b)? a:b;
        //xuất kết quả
    System.out.println("Số lớn nhất là: " + max);
}
        }//end main
}//end class
 */