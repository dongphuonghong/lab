// 30. Tính S(n) = (1 + 3 + 5 + ... + (2n+1)) × (1 + 2 + 3 + ... + n), với n >= 0
package lab3_3;
import java.util.Scanner;
public class bt30 {
public static void main(String[] args) {
    // Nhập số nguyên dương n từ bàn phím
int n= nhap("nhap n >0");        
    // Gọi hàm tính kết quả S(n)
    int kq = tinhKetQua(n);
    // In kết quả
    System.out.println("Ket qua: " + kq);
    }//end main
// Hàm nhập số nguyên dương từ bàn phím
// Nếu nhập n < 0 sẽ yêu cầu nhập lại
// Trả về giá trị n hợp lệ
public static int nhap(String chuoi){
                    int n;
 do {
    try(Scanner sc=new Scanner(System.in)){    
        System.out.println(chuoi);
n=sc.nextInt();
if (n>=0) {
return n;
}
System.out.println("ban vui long nhap lai n >0");
}
} while (true);
}
// Hàm tính tổng các số lẻ: 1 + 3 + 5 + ... + (2n+1)
public static int tinhTongSoLe(int n) {
    int tongSoLe = 0;
    for (int i = 0; i <= n; i++) {
        tongSoLe += (2 * i) + 1; 
    }
    return tongSoLe; 
}
// Hàm tính tổng các số tự nhiên: 1 + 2 + 3 + ... + n
public static int tinhTongTuNhien(int n) {
    int tongTuNhien = 0;
    for (int j = 1; j <= n; j++) {
        tongTuNhien += j; 
    }
    return tongTuNhien;     
}
// Hàm tính kết quả S(n) = tổng số lẻ × tổng số tự nhiên
public static int tinhKetQua(int n) {
    int tongSoLe = tinhTongSoLe(n);
    int tongTuNhien = tinhTongTuNhien(n);
    return tongSoLe * tongTuNhien; 
}
}//end class