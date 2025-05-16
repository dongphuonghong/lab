// 29. Tinh,  vơi) 1 2 ( 5 . 3 . 1 ) (   n n P 
// Đây là tích của dãy các số lẻ liên tiếp bắt đầu từ 1 đến (2n + 1)
package lab3;
import java.util.Scanner;
public class bt29 {
public static void main(String[] args) {
    int n;
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
    try (Scanner sc = new Scanner(System.in)) {
            // Nhập giá trị n từ bàn phím

    System.out.print("Nhap n: ");
        n = sc.nextInt();
        }
            // Khởi tạo biến t = 1 để lưu tích
        int t=1;
            // Duyệt từ i = 0 đến i = n

        for(int i=0;i<=n;i++){
                // Tính số lẻ theo công thức (2 * i) + 1
            int sum=(2*i)+1;
                // Nhân t với giá trị vừa tính được
            t*=sum;
        }
            // In kết quả ra màn hình

        System.out.println("t = " + t);
}//end main
}//end class