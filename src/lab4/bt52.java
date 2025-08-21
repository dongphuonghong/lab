// 52. Nhập vào 6 số thực a, b, c, d, e, f. Giải hệ phương trình sau:
// ax + by = c
// dx + ey = f
package lab4;
import java.util.Scanner;
public class Bt52 {
    public static void main(String[] args) {
        // Nhập 6 hệ số của hệ phương trình từ bàn phím
        // Hệ phương trình: ax + by = c và dx + ey = f
        double a = nhap("Nhap he so a: ");
        double b = nhap("Nhap he so b: ");
        double c = nhap("Nhap he so c: ");
        double d = nhap("Nhap he so d: ");
        double e = nhap("Nhap he so e: ");
        double f = nhap("Nhap he so f: ");
        
        // Gọi hàm giải hệ phương trình
        giaiPhuongTrinh(a, b, c, d, e, f);
    }//end main
    // Hàm nhập số thực từ bàn phím
    // Tham số: chuoi - thông báo hiển thị cho người dùng
    // Trả về: giá trị số thực được nhập từ bàn phím
    static Scanner sc = new Scanner(System.in);    
    public static double nhap(String chuoi){
        System.out.print(chuoi);
        return sc.nextDouble();
    }    
    // Hàm giải hệ phương trình bậc nhất 2 ẩn số
    // Hệ phương trình có dạng:
    // a*x + b*y = c  (phương trình 1)
    // d*x + e*y = f  (phương trình 2)
    // 
    // Sử dụng quy tắc Cramer để giải:
    // - Định thức chính: D = a*e - b*d
    // - Định thức Dx = c*e - b*f (thay cột x bằng cột hệ số tự do)
    // - Định thức Dy = a*f - c*d (thay cột y bằng cột hệ số tự do)
    // 
    // Kết quả:
    // - Nếu D ≠ 0: hệ có nghiệm duy nhất x = Dx/D, y = Dy/D
    // - Nếu D = 0 và Dx = Dy = 0: hệ có vô số nghiệm
    // - Nếu D = 0 và (Dx ≠ 0 hoặc Dy ≠ 0): hệ vô nghiệm
    public static void giaiPhuongTrinh(double a, double b, double c, double d, double e, double f) {
        double D  = a * e - d * b;  // Định thức chính
        double Dx = c * e - f * b;  // Định thức Dx
        double Dy = a * f - d * c;  // Định thức Dy
        
        if (D != 0) {
            // Hệ có nghiệm duy nhất
            double x = Dx / D;
            double y = Dy / D;
            System.out.printf("He phuong trinh co nghiem duy nhat: x = %.2f, y = %.2f%n", x, y);
        } else if (Dx == 0 && Dy == 0) {
            // Hệ có vô số nghiệm
            System.out.println("He phuong trinh co vo so nghiem.");
        } else {
            // Hệ vô nghiệm
            System.out.println("He phuong trinh vo nghiem.");
        } 
    }
}//end class
