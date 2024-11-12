/**
 * 7. Viết chương trình cho phép nhập vào giờ, phút và giây, hãy đổi sang giây và in kết quả ra màn hình
 */
package lab1;
import java.util.Scanner;
public class bt7 {
    public static void main(String[] args) {
        //tạo biến gio, phut, giay kiểu int để nhập giá trị từ bàn phím
int gio, phut, giay;
try (Scanner sc = new Scanner(System.in)) {
// yêu cầu nhập giá trị từ bàn phím
System.out.println("nhap vao so gio can doi: ");
gio = sc.nextInt();
System.out.println("Nhap vao so phut can doi : ");
phut = sc.nextInt();
System.out.println("Nhap vao so giay can doi: ");
giay = sc.nextInt();
// chuyển đổi giờ sang giây 
int gio1 = gio*3600;
// chuyển đổi phút sang giây
int phut1 = phut*60;
// giữ nguyên giây
int giay1 = giay*1;
// tính tổng số giây
int tong = gio1+phut1+giay1;
// xuất kết quả
System.out.println("Tổng số giây: "+tong);
// đóng sc
sc.close();
}
    }//end main
}//end class