/*
5. Viết chương trình nhập một số nguyên dương N có 2 chữ số từ bàn phím, xuất ra màn hình tổng các chữ số của N.Ví dụ: Nhập N = 48, kết quả in ra màn hình là: 4+8=12Page 2 of 10*
 */
package lab1;
import java.util.Scanner;
public class bt5 {
    public static void main(String[] args) {
        //tạo biến n kiểu int để nhập giá trị từ bàn phím
        int n;
        //tạo biến sc kiểu Scanner để nhập giá trị từ bàn phím
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        //sử lý dữ liệu
        //lấy dữ liệu hàng đơn vị 
        int donvi=n%10;
        //lấy dữ liệu hàng chục
        int chuc=(n/10)%10;
        //tính tổng 2 chữ số cuối của n
        int tong=donvi+chuc;
        //xuất kết quả
        sc.close();    
        System.out.println("Tong 2 chu so cuoi cua so nguyen n la: "+tong);
        //đóng sc
        }
    }//end main
    }//end class