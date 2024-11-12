/**
 * 6. Viết chương trình cho phép nhập vào một số đo nhiệt độ theo độ Fahrenheit và xuất ra nhiệt độ tương đương của nó theo độ Celsius, sử dụng công thức chuyển đổi:) 32 ( 9 5 0 0   F C
 */
package lab1;
import java.util.Scanner;
public class bt6 {
    public static void main(String[] args) {
        //tạo biến do_f kiểu double để nhập giá trị từ bàn phím
        double do_f;
        try (Scanner sc = new Scanner(System.in)) {
    //nhập giá trị từ bàn phím
System.out.println("Nhập vào số nhiệt độ theo đọ f: ");
    do_f = sc.nextDouble();
    // chuyển đổi độ F sang độ C bằng công thức 32(9/5)=C
    double do_c=(double)9/5*(do_f+32);
    //xuất kết quả
    System.out.println("Nhiệt độ theo độ C: "+do_c);
    //đóng sc
        sc.close();
    }
    }//end main
}//end class