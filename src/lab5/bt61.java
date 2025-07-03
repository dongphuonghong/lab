// 61. Viết chương trình nhập số nguyên dương n gồm k chữ số, kiểm tra xem các chữ số của n có toàn lẻ hay toàn chẵn không.
package lab5;
import java.util.Scanner;
public class bt61 {
public static void main(String[] args) {
    // Nhập số nguyên dương từ bàn phím
    int n = nhap("Nhap n > 0: ");    
    // Kiểm tra và thông báo kết quả
    if (laSoToanChanHoacToanLe(n)) {
        System.out.println("Cac chu so cua " + n + " toan chan hoac toan le.");
    } else {
        System.out.println("Cac chu so cua " + n + " khong toan chan va khong toan le.");
    } 
    }//end main

// Hàm nhập số nguyên dương từ bàn phím
// Kiểm tra điều kiện n > 0
// Trả về số nguyên hợp lệ
public static int nhap(String chuoi){
                    int n;
 do {
    try(Scanner sc=new Scanner(System.in)){    
        System.out.println(chuoi);
n=sc.nextInt();
if (n>0) {
return n;
}
System.out.println("ban vui long nhap lai n >0");
}
} while (true);
}

// Hàm kiểm tra số có toàn chữ số chẵn hoặc toàn chữ số lẻ
// Duyệt qua từng chữ số, kiểm tra tính chẵn lẻ
// Trả về true nếu toàn chẵn hoặc toàn lẻ, false nếu vừa chẵn vừa lẻ
// Tham số: n - số nguyên dương
// Trả về: true/false
public static boolean laSoToanChanHoacToanLe(int n) {
    boolean toanChan = true;
    boolean toanLe = true;
while (n > 0) {
        int chuSo = n % 10; 
        if (chuSo % 2 == 0) {
            toanLe = false; 
        }else {
            toanChan = false; 
        }
        n /= 10; 
    }
    return toanChan || toanLe; 
}
}//end class