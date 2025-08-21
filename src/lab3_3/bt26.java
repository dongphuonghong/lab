// 26. Viết chương trình đếm số ước số của số nguyên dương N. Ví dụ: N=12, số ước số của 12 là 6
package lab3_3;
import java.util.Scanner;
public class Bt26 {
    public static void main(String[] args) {
    // Nhập số nguyên dương n từ bàn phím
    int n= nhap("nhap n >0");
    // Gọi hàm đếm ước số để tính số lượng ước số của n
    int d = demUocSo(n);
    // In kết quả
System.out.println("Tong cac uoc so cua " + n + " la: " + d);    
    }//end main
// Hàm nhập số nguyên dương từ bàn phím
// Nếu nhập n <= 0 sẽ yêu cầu nhập lại
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
// Hàm đếm số ước số của số nguyên dương n
// Duyệt từ 1 đến n, đếm số lượng số chia hết cho n
// Trả về số lượng ước số
public static int demUocSo(int n){
    int d = 0;  // Biến đếm số lượng ước số
    // Duyệt từ 1 đến n để tìm các ước số
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {  // Nếu i là ước số của n
            d++;  
        }
    }
    return d;
    }
  }//end class
