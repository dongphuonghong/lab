/**
 * 9. Viết chương trình nhập vào 2 số nguyên a, b. Tính tổng, hiệu, tích, thương của 2 số trên và in kết quả ra màn hình.
 */
package lab1;
import java.util.Scanner;
public class Bt9 {
public static void main(String[] args) {
    //tạo biến a,b kiểu int để nhập giá trị từ bàn phím
    int a,b;
    try (Scanner sc = new Scanner(System.in)) {
    //nhập giá trị từ bàn phím
    System.out.println("Nhap so a : ");
    a = sc.nextInt();
    System.out.println("Nhap so b : ");
    b = sc.nextInt();
    //tính tổng, hiệu, tích, thương của 2 số
    //tính tổng của 2 số
 int tong=a+b;
 //tính hiệu của 2 số
    int hieu=a-b;
    //tính tích của 2 số
    int tich=a*b;
    //tính thương của 2 số
    int thuong=a/b;
    //xuất kết quả  
    System.out.println("Tong cua a va b la : " + tong);
    System.out.println("Hieu cua a va b la : " + hieu);
    System.out.println("Tich cua a va b la : " + tich);
    System.out.println("Thuong cua a va b la : " + thuong);
    //đóng sc
    sc.close();
    }//end try
}//end main
}//end class
//cách 2
/**
 * import java.util.Scanner;
public class Bt9edit {
    public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
int a,b;
System.out.println(" nhap a");
a = sc.nextInt();
System.out.println(" nhap b");
b = sc.nextInt();
//tính tổng, hiệu, tích, thương của 2 số a và b bằng cách sử dụng toán tử rồi cho nó vô câu lệnh System.out.printlnthay vì tạo biến mới 
System.out.println("tong cua a va b la: " + (a+b));
System.out.println("hieu cua a va b la: " + (a-b));
System.out.println("tich cua a va b la: " + (a*b));
System.out.println("thuong cua a va b la: " + (a/b));
sc.close();
}//end try
}//end main
}//end class
 */
