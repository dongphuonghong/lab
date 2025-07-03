// 50. Viêt chương trinh tinh tiên lương ngay cho công nhân, cho biêt trươc giơ vao ca, giơ ra ca cua môi ngươi.Biết răng:- Tiên tra cho môi giơ trươc 12 giơ la 6000đ va sau 12 giơ la 7500đ.- Giơ vao ca sơm nhât  la 6 giơ sang va giơ ra ca trê nhât la 18 giơ (Gia sư giơ nhâp vao nguyên).
package lab4;
import java.util.Scanner;
public class bt50 {
public static void main(String[] args) {
    //gọi hàm nhập giờ vào ca và giờ ra ca
    //nếu nhập giờ vào ca không hợp lệ sẽ yêu cầu nhập lại
int vaoCa, raCa;        
do {
    vaoCa = nhapGio("Nhap gio vao ca (6-18): ");
    raCa = nhapGio("Nhap gio ra ca (6-18): ");
    if (vaoCa < raCa) {
        break; 
}
                    System.out.println("Gio vao ca phai nho hon gio ra ca. Vui long nhap lai.");
} while (true);
//gọi hàm tính tổng lương dựa trên giờ vào ca và giờ ra ca
int tinhLuong= tongLuong(vaoCa, raCa);
//in kết quả tiền lương của công nhân
System.out.println("Tien luong cua cong nhan la: " + tinhLuong + " dong.");
sc.close();
    }//end main
//đây là Hàm nhập giờ vào ca và giờ ra ca
// Yêu cầu người dùng nhập giờ vào ca và giờ ra ca trong khoảng từ 6 đến 18
// Nếu nhập không hợp lệ sẽ yêu cầu nhập lại
// Trả về giá trị giờ hợp lệ
    static  Scanner sc = new Scanner(System.in);
    public static int nhapGio(String chuoi) {
        int gio;
        do {
            System.out.print(chuoi);
            gio = sc.nextInt();
            if (gio >= 6 && gio <= 18) {
                return gio;
            }
            System.out.println("Gio phai nam trong khoang tu 6 den 21.");
        } while (true);
    }
//đây là Hàm tính tổng lương dựa trên giờ vào ca và giờ ra ca theo quy định:
// - Tiền trả cho mỗi giờ trước 12 giờ là 6000đ
// - Tiền trả cho mỗi giờ sau 12 giờ là 7500đ
// - Giờ vào ca sớm nhất là 6 giờ sáng và giờ ra ca trễ nhất là 18 giờ
// - Giờ vào ca phải nhỏ hơn giờ ra ca
    public  static  int tongLuong(int vaoCa,int raCa) {
        int tongLuong = 0;
        for (int gio = vaoCa; gio < raCa; gio++) {
        if (gio < 12) {
                tongLuong += 6000; 
            } else {
                tongLuong += 7500; 
            }
        }
    return tongLuong ;
        }
}//end class