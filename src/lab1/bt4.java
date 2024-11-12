//4.	Viết chương trình nhập vào 2 số nguyên dương a và b, cho biết kết quả chia lấy phần nguyên và phần dư của a với b.  
package lab1;
import java.util.Scanner;
public class bt4 {
    public static void main(String[] args) {
        //tạo biến a, b kiểu int để nhập giá trị từ bàn phím
        int a, b;
        try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Nhap a: ");
    a = sc.nextInt();
    System.out.println("Nhap b: ");
    b = sc.nextInt();
    //tính phần nguyên và phần dư của a/b
    int nguyen=a/b;
    int du=a%b;
    //xuất kết quả của phép chia nguyên
    System.out.println("Phan nguyen cua a/b la: "+nguyen);
    //xuất kết quả của phép chia dư
    System.out.println("Phan du cua a/b la: "+du);
    //đóng sc
    sc.close();
    }
        }//end main        
    }//end class