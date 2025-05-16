// 34. Tinh,  vơin n S 1 3 1 2 1 1 ) (      0  n
package lab3;
import java.util.Scanner;
public class bt34 {
public static void main(String[] args) {
    int n;
            // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
    try(Scanner sc = new Scanner(System.in)){
        // Nhập giá trị n từ bàn phím
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        }    
                // Khởi tạo biến sum kiểu double để lưu tổng các phân số
double  sum=0;
        // Dùng vòng lặp for để tính tổng các phân số từ 1 đến n
for(int i=1; i<=n; i++){
    // Ép kiểu 1/i để đảm bảo phép chia chính xác
        sum+=(double)1/i;
    }
// In ra kết quả tổng
    System.out.println("Tong S = " + sum);
}//end main
}//end class