// 54. Viêt chương trinh tinh tông nghich đao cua n giai thưa.
package lab4;
import java.util.Scanner;
public class bt54 {
public static void main(String[] args) {
    //gọi hàm nhập để lấy giá trị n từ người dùng
    int n = nhap("Nhap n >0");
    //gọi hàm tính nghịch đảo giai thừa
    double sum = tinhGiaiThua(n);   
    //in kết quả
    System.out.println("Tong nghich dao giai thua cua " + n + " la: " + sum);
        }//end main
//đây là Hàm nhập số nguyên dương từ bàn phím
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
// đây là hàm tính nghịch đảocủa  giai thừa
public static int tinhGiaiThua(int n){
    int giaithua = 1;
                    double sum=1;
for (int i = 2; i <= n; i++) {
        giaithua *= i;
                    sum +=(double)1/giaithua; 
}
    return(int)sum; 
    }
}//end class
