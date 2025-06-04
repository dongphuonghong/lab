// 28. Tinh n!,  vơi0  n
// Giai thừa của n là tích của tất cả các số nguyên dương từ 1 đến n
package lab3;
import java.util.Scanner; 
public class bt28 {
 public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
            // Khai báo biến n và nhập giá trị từ bàn phím
    int n;
    System.out.print("Nhap n: ");
     n = sc.nextInt();
            // Kiểm tra nếu n âm thì không tính được giai thừa
     if(n < 0) {
                // In ra thông báo nếu không tính được giai thừa
        System.out.println("Khong tinh duoc giai thua cua so am!");
                // Nếu n không âm thì tính giai thừa
     }else{
                // Khởi tạo biến giai thừa bằng 1
        int giaithua = 1;
                // Dùng vòng lặp for để nhân từ 1 đến n
    for (int i = 2; i <= n; i++) {
        giaithua *=i;
    }
                // In kết quả giai thừa ra màn hình
    System.out.println("Giai thua cua " + n + " la: " + giaithua);
}
}
}//end main   
}//end class