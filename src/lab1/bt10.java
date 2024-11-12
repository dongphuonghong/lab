/**
 * 10. Viết chương trình nhập vào 4 số nguyên a, b, c, d. Tính giá trị trung bình cộng của 4 số trên và in kết quả ra màn hình.
 */
package lab1;
import java.util.Scanner;
public class bt10 {
public static void main(String[] args) {
    //tạo biến a,b,c,d kiểu int để nhập giá trị từ bàn phím
    int a,b,c,d;
    try (Scanner sc = new Scanner(System.in)) {
    //nhập giá trị từ bàn phím
    System.out.println("Nhap a: ");
    a = sc.nextInt();
    System.out.println("Nhap b: ");
    b = sc.nextInt();
    System.out.println("Nhap c: ");
    c = sc.nextInt();
    System.out.println("Nhap d: ");
    d = sc.nextInt();
    //tính giá trị trung bình cộng của 4 số
 int tb=(a+b+c+d)/4;
    //xuất kết quả
    System.out.println("Trung binh cua cac  so nguyen la: "+tb);
    //đóng sc
    sc.close();
    }
}//end main
    }//end class