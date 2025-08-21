// 53. Viêt chương trinh nhâp 2 sô nguyên dương a, b. Tim USCLN va BSCNN cua hai sô nguyên đo.
package lab4;
import java.util.Scanner;
public class Bt53 {
public static void main(String[] args) {
    // Nhập hai số nguyên dương a và b từ bàn phím
    // Sử dụng hàm nhập để lấy giá trị a và b từ người dùng
    int a= nhap("Nhap a: ");
    int b= nhap("Nhap b: ");
    //gọi hàm ucln để tính ước số chung lớn nhất
int ucln = ucln(a, b);
    //gọi hàm bcnn để tính bội số chung nhỏ nhất
    int bcnn = bcnn(a, b);
    //in kết quả
    System.out.println("UCLN cua " + a + " va " + b + " la: " + ucln);
    System.out.println("BCNN cua " + a + " va " + b + " la: " + bcnn);
    sc.close();
}//end main
//đây là hàm nhập số nguyên từ bàn phím
      static   Scanner sc = new Scanner(System.in);
        public static int nhap(String chuoi){
            
    System.out.print(chuoi);    
        return sc.nextInt();
        }
// Hàm tính ước số chung lớn nhất (UCLN) bằng thuật toán Euclid
public static int ucln(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    int ucln=a;
    return ucln;
}
// Hàm tính bội số chung nhỏ nhất (BCNN) = (a * b) / UCLN(a, b)
public static int bcnn(int a, int b) {
    int ucln = ucln(a, b);
    return (a * b) / ucln;
}
}//end class
