// 32. Tính S(n) = 1! + 2! + 3! + ... + n!, với n >= 0
package lab3_3;
import java.util.Scanner;
public class Bt32 {
public static void main(String[] args) {
    // Nhập số nguyên dương n từ bàn phím
    int n = nhap("Nhap n >0");
    // Gọi hàm tính tổng giai thừa
    int sum = tinhGiaiThua(n);
    // In kết quả
    System.out.println("Tong S = " + sum);
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
// Hàm tính tổng giai thừa: S(n) = 1! + 2! + 3! + ... + n!
// Sử dụng vòng lặp để tính từng giai thừa và cộng dồn
// Trả về tổng S(n)
public static int tinhGiaiThua(int n) {
    int giaithua = 1;
    int sum=0;
    for (int i = 2; i <= n; i++) {
        giaithua *= i;
        sum += giaithua; 
    }
    return sum;
}
}//end class
