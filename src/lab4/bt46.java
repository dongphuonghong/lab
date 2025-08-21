// 46. Nhâp sô nguyên dương n (n>0). Liêt kê n sô chinh phương đâu tiên.
package lab4;
import java.util.Scanner;
public class Bt46 {
    public static void main(String[] args) {
//gọi hàm Nhập số nguyên dương n từ bàn phím
        int n = nhap("Nhap n >0");
//gọi hàm liệt kê n số chính phương đầu tiên
        lietKeSoChinhPhuong(n);
//in kết quả
        System.out.println("Da liet ke " + n + " so chinh phuong dau tien.");
        }//end main
//đây là Hàm nhập số nguyên dương từ bàn phím
// Nếu nhập n <= 0 sẽ yêu cầu nhập lại
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
//đây là Hàm kiểm tra số chính phương
// Số chính phương là số có căn bậc hai là một số nguyên
// Trả về true nếu là số chính phương, false nếu không phải
    public  static  boolean  kiemTraSoChinhPhuong(int n) {
        int cp =(int)Math.sqrt(n);
        return cp * cp == n;
    }
//đây là Hàm liệt kê n số chính phương đầu tiên
// Sử dụng vòng lặp để tìm và in ra n số chính phương
// Bắt đầu từ 0 và kiểm tra từng số
// In ra n số chính phương đầu tiên
    public static void lietKeSoChinhPhuong(int n) {
        int d=0;
        int i = 0;
        while (d < n) {
            if (kiemTraSoChinhPhuong(i)) {
                System.out.print(i + " ");
                d++;
            }
            i++;
        }
        System.out.println();
    }
}//end class
