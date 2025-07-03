// 62. Viết chương trình nhập vào số nguyên dương n, in ra màn hình n số nguyên tố đầu tiên.
package lab5;
import java.util.Scanner;
public class bt62 {
public static void main(String[] args) {
    // Nhập số nguyên dương từ bàn phím
    int n = nhap("Nhap n > 0: ");    
    // In n số nguyên tố đầu tiên
    inSoNguyenToDauTien(n);
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
// Hàm kiểm tra số nguyên tố
// Số nguyên tố: số tự nhiên > 1, chỉ chia hết cho 1 và chính nó
// Tham số: n - số cần kiểm tra
// Trả về: true nếu là số nguyên tố, false nếu không phải
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
public static void inSoNguyenToDauTien(int n) {
    int d = 0;
    for (int i = 2; d < n; i++) {
        if (kiemTraNguyenTo(i)) {
            System.out.print(i + " ");
            d++;
        }
    }
}
    }//end class