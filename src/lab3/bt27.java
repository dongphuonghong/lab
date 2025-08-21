// 27. Môt sô hoan thiên la môt sô co tông cac ươc sô cua no (không kê no) băng chinh no. Hay nhập vào số nguyên dương n và kiểm tra xem n có phải là số hoàn thiện không.Vi du: sô 6 la sô hoan thiên vi tông cac ươc sô la 1+2+3 = 6.
package lab3;
import java.util.Scanner;
public class Bt27 {
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
                // Nhập số nguyên dương từ bàn phím
int n, sum = 0;
System.out.print("Nhap so nguyen duong n: ");
n = sc.nextInt();
            // Duyệt qua các số từ 1 đến n - 1 để tìm ước số của n
for (int i = 1; i < n; i++) {
                    // Nếu i là ước của n thì cộng vào biến sum
if (n % i == 0) {
sum += i;
}
}
            // Kiểm tra nếu tổng các ước bằng chính n → là số hoàn thiện
if (sum == n) {
System.out.println(n + " la so hoan thien.");
} else {
System.out.println(n + " khong phai la so hoan thien.");
}
}
}//end main
}//end class
//cách 2 dùng hàm math.sqrt
/* 
 * 
 * package lab3;
import java.util.Scanner;
public class Bt27_1 {
 public static void main(String[] args) {
                // Nhập số nguyên dương từ bàn phím
    int n,sum=0;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Nhap so nguyen duong n: ");
        n = sc.nextInt();
                    // Duyệt từ 1 đến căn bậc hai của n
        for (int i = 1; i <Math.sqrt(n); i++) {
                            // Nếu i là ước của n Cộng i vào tổng
            if (n % i == 0) {
                sum += i;
                                    // Nếu i không phải là 1 và không trùng với n/i (để tránh cộng trùng)
                if (i != n / i && i != 1) {
                    // Cộng thêm ước đối xứng (n / i)
                    sum += n / i;
                }
            }
        }
                    // Kiểm tra nếu tổng các ước bằng chính n → là số hoàn thiện
        if (sum == n) {
            System.out.println(n + " la so hoan thien.");
        } else {
            System.out.println(n + " khong phai la so hoan thien.");
        }
    }
    }//end main
}//end class
 */
