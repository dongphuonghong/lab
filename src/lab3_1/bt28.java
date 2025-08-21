// 28. Tính n! với n >= 0
// Giai thừa của n là tích của tất cả các số nguyên dương từ 1 đến n (quy ước 0! = 1) 28. Tinh n!,  vơi0  n
// Giai thừa của n là tích của tất cả các số nguyên dương từ 1 đến n
package lab3_1;
import java.util.Scanner; 
public class Bt28 {
    public static void main(String[] args) {
        // Khai báo biến n và nhập giá trị từ bàn phím
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        // Kiểm tra nếu n âm thì không tính được giai thừa
        if(n < 0) {
            System.out.println("Khong tinh duoc giai thua cua so am!");
        } else {
            // Khởi tạo biến giai thừa bằng 1 (phù hợp cho cả trường hợp n=0)
            int giaithua = 1;
            // Dùng vòng lặp while để nhân từ 2 đến n
            int i = 2;
            while (i <= n) {
                // Nhân giai thừa với i
                giaithua *= i;
                // Tăng i lên 1 để tiếp tục vòng lặp
                i++;
            }
            // In kết quả giai thừa
            System.out.println("Giai thua cua " + n + " la: " + giaithua);
        }
    }//end main
}//end class
