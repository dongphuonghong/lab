// 43. Viêt chương trinh tinh diên tich va chu vi cua hinh chư nhât vơi chiêu dai va chiêu rông đươc nhâp tư ban phim.
package lab4;
import java.util.Scanner;
public class Bt43 {
public static void main(String[] args) {
    // Nhập chiều dài và chiều rộng của hình chữ nhật từ bàn phím
    // Sử dụng hàm nhập để lấy giá trị chiều dài và chiều rộng
double chieuDai, chieuRong;
    chieuDai = nhap("Nhập chiều dài: ");
    chieuRong = nhap("Nhập chiều rộng: ");
    // Gọi hàm tính diện tích và chu vi hình chữ nhật
double dienTich = tinhDienTich(chieuDai, chieuRong);
    double chuVi = tinhChuVi(chieuDai, chieuRong);
    // In kết quả diện tích và chu vi
    System.out.println("Diện tích hình chữ nhật là: " + dienTich);
    System.out.println("Chu vi hình chữ nhật là: " + chuVi);
    // Đóng Scanner để giải phóng tài nguyên
    sc.close();
    }//end main
    //đây là hàm nhập số thực từ bàn phím
static  Scanner sc = new Scanner(System.in);    
    public static double nhap(String chuoi){
System.out.print(chuoi);
            return sc.nextDouble();
            }    
//đây là  Hàm tính diện tích hình chữ nhật:bằng công thức S = chiều dài * chiều rộng
public static double tinhDienTich(double chieuDai, double chieuRong) {
    return chieuDai * chieuRong;
}
//đây là Hàm tính chu vi hình chữ nhật:bằng công thức P = (chiều dài + chiều rộng) * 2
public static double tinhChuVi(double chieuDai, double chieuRong) {
    return  (chieuDai + chieuRong)*2;
}
}//end class
