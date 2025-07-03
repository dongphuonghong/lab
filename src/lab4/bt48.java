// 48. Nhâp sô nguyên dương n (0 <= n< 1000) va in ra cach đoc cua n.
package lab4;
import java.util.Scanner;
public class bt48 {
public static void main(String[] args) {        
    //gọi hàm nhập số nguyên dương n từ bàn phím
    int n = nhap("Nhap n (0 <= n < 1000): ");
    //gọi hàm đọc số nguyên n
    // In ra cách đọc của số nguyên n
    System.out.print("Cách đọc: ");
    docSo(n);
}//end main
//đây là Hàm nhập số nguyên dương từ bàn phím
// Nếu nhập n < 0 hoặc n >= 1000 sẽ yêu cầu nhập lại
// Trả về giá trị n hợp lệ
public static int nhap(String chuoi){
                    int n;
 do {
    try(Scanner sc=new Scanner(System.in)){    
        System.out.println(chuoi);
n=sc.nextInt();
        if (n >= 0 && n < 1000) {
                        return n;
}
System.out.println("ban vui long nhap lai n >0");
}    
} while (true);
}
// Hàm chuyển đổi số nguyên thành chữ số
// Nhận vào một số nguyên từ 0 đến 9
// Trả về chuỗi tương ứng với chữ số đó
public static String docChuSo(int so) {
    return switch (so) {
        case 0 -> "không";
        case 1 -> "một";
        case 2 -> "hai";
        case 3 -> "ba";
        case 4 -> "bốn";
        case 5 -> "năm";
        case 6 -> "sáu";
        case 7 -> "bảy";
        case 8 -> "tám";
        case 9 -> "chín";
        default -> "";
    };
}
public static void docSo(int n) {
        if (n == 0) {
            System.out.println("không");
            return;
        }
        int tram = n / 100;
    int chuc = (n / 10) % 10;
        int donvi = n % 10;
        String kq= "";
        if (tram > 0) {
            kq += docChuSo(tram) + " trăm ";
        }
        if (chuc > 0) {
            if (chuc == 1 && tram > 0) {
                kq += "mười ";
            } else {
                kq += docChuSo(chuc) + " mươi ";
            }
        } else if (tram > 0) {
            kq += "lẻ ";
        }
        if (donvi > 0) {
            if (chuc == 0 && tram > 0) {
                kq += "lẻ ";
            }
            if (donvi == 1 && chuc > 0) {
                kq += "một";
            } else if (donvi == 5 && chuc > 0) {
                kq += "năm";
            } else {
                kq += docChuSo(donvi);
            }
        }
        System.out.println(kq.trim());
    }
}//end class