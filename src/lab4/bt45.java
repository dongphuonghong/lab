// 45. Nhâp sô nguyên dương n (n>0). Liêt kê tât ca cac sô nguyên tô nho hơn n.
package lab4;
import java.util.Scanner;
public class Bt45 {
public static void main(String[] args) {
//gọi hàm nhập số nguyên dương n từ bàn phím
        int n = nhap("Nhap n >0");
//gọi hàm liệt kê các số nguyên tố nhỏ hơn n
        lietKeNguyenTo(n);
}//end main
//đây là  Hàm nhập số nguyên dương từ bàn phím
// Nếu nhập n < 0 sẽ yêu cầu nhập lại
// Trả về giá trị n hợp lệ
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
//đây là  Hàm kiểm tra số nguyên tố
// Trả về true nếu n là số nguyên tố, ngược lại trả về false
public static boolean kiemTraNguyenTo(int n){
    boolean flag=true;
    if (n < 2) {
        return false; 
    }
    for (int i = 2; i*i <= n; i++) {
        if (n % i == 0) {
            flag = false; 
            break;
        }
    }
    return flag; 
    }
//đây là  Hàm liệt kê các số nguyên tố nhỏ hơn n và  in ra chúng
public static void lietKeNguyenTo(int n) {
    System.out.println("Cac so nguyen to nho hon " + n + " la:");
    for (int i = 2; i < n; i++) {
        if (kiemTraNguyenTo(i)) {
            System.out.print(i + " ");
        }
    }
    System.out.println(); // Xuống dòng sau khi in xong
}
}//end class
