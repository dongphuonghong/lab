// 28. Tính n! (giai thừa), với n >= 0/ 28. Tính n! (giai thừa), với n >= 0/ 28. Tinh n!,  vơi0  n
package lab3_3;
import java.util.Scanner;
public class bt28 {
public static void main(String[] args) {
    // Nhập số nguyên dương n từ bàn phím
int n= nhap("nhap n >0");
    // Gọi hàm tính giai thừa
    int giaithua = tinhGiaiThua(n);
    // In kết quả
    System.out.println("Giai thua cua " + n + " la: " + giaithua);
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
// Hàm tính giai thừa n! = 1 × 2 × 3 × ... × n
// Sử dụng vòng lặp for để tính tích từ 1 đến n
// Trả về kết quả giai thừa
public static int tinhGiaiThua(int n){
    int giaithua = 1;
    for (int i = 2; i <= n; i++) {
        giaithua *= i;
    }
    return giaithua;
}
}//end class