// 38. Tính S = 1 + (1+2)/2! + (1+2+3)/3! + ... + (1+2+...+n)/n!               
package lab3_2;
import java.util.Scanner;
public class bt38 {
public static void main(String[] args) {
    // Nhập vào số nguyên n từ bàn phím
                            int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
// Khởi tạo biến sum để lưu tổng các phân số, bắt đầu từ 1
    double sum=1;
int i=2;
do {
// Tính tổng tử số: 1 + 2 + ... + i
int tong_tu = i * (i + 1) / 2;
// Tính giai thừa mẫu số: i!
// Khởi tạo biến giaithua để lưu giá trị giai thừa với giá trị ban đầu là 1
long giaithua = 1;
// Sử dụng vòng lặp để tính giai thừa từ 1 đến i
int j = 1;
while(j <= i) {
    // Cập nhật giai thừa tại bước j
    giaithua *= j;
    // Tăng j lên 1 để tiếp tục vòng lặp
    j++;
}
// Cộng thêm (1+2+...+i) / i! vào tổng sum
sum += (double) tong_tu / giaithua;
// Tăng i lên 1 để tiếp tục vòng lặp
i++;
        } while (i <= n);
        // In ra kết quả tổng S(n)
        System.out.println("S = " + sum);
        }//end main
}//end class