/**
 * 8. Viết chương trình cho phép nhập vào thời gian của một công việc nào đó tính bằng giây. Hãy chuyển đổi và in ra màn hình thời gian trên dưới dạng bao nhiêu giờ, bao nhiêu phút, bao nhiêu giây.
 */
package lab1;
import java.util.Scanner;
public class Bt8 {
    public static void main(String[] args) {
        //tạo biến congviet kiểu double để nhập giá trị từ bàn phím
        double congviet;
        try (Scanner sc = new Scanner(System.in)) {
        //nhập giá trị từ bàn phím
        System.out.println("Nap thoi gian : ");
         congviet = sc.nextDouble();
        //chuyển đổi giờ sang giây
        double gio = congviet / 3600;
        //chuyển đổi phút sang giây
        double phut = congviet/60;
        //giữ nguyên giây   
        double giay = congviet/1;
        //xuất kết quả
        System.out.println("Thoi gian la : " + gio + " gio " + phut + " phut " + giay + " giay ");
        //đóng sc
        sc.close();
        }
    }//end main
}//end class
