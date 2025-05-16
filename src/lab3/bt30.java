// 30. Tinh,  vơi) 1 2 ( 5 3 1 ) (        n n S 
// Gồm hai phần: tổng dãy số lẻ từ 1 đến (2n + 1) và tổng các số tự nhiên từ 1 đến n
package lab3;
import java.util.Scanner;
public class bt30 {
public static void main(String[] args) {
    int n;
            // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
try(Scanner sc = new Scanner(System.in)) {
    // Nhập giá trị n
        System.out.print("Nhap n: ");
        n = sc.nextInt();
    }
            // Khởi tạo biến tổng các số tự nhiên và tổng các số lẻ
    int tong_tu_nhien= 0;
    int tong_so_le= 0;
            // Tính tổng các số lẻ từ 1 đến (2n + 1) theo công thức (2 * i) + 1
for(int i=0; i<=n; i++){
                tong_so_le+=(2*i)+1;
                }
                        // Tính tổng các số tự nhiên từ 1 đến n
                for(int j=1; j<=n; j++){
                    tong_tu_nhien+=j;
                }
                        // Tính kết quả theo công thức: tổng số lẻ × tổng tự nhiên
    int kq=tong_so_le*tong_tu_nhien;  
            // In ra kết quả
System.out.println("Ket qua: "+kq);
}//end main    
}//end class
//cách 2
// Sử dụng công thức rút gọn:
// - Tổng các số lẻ từ 1 đến (2n + 1): (n + 1)^2 = (n + 1) * (n + 1)
// - Tổng các số tự nhiên từ 1 đến n: n(n + 1)/2
/* 
 * 
 * package lab3;
import java.util.Scanner;
public class bt30_1 {
    public  static void main(String[] args) {
        int n;
// Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        try (Scanner sc = new Scanner(System.in)) {
                    // Nhập n từ bàn phím
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
                // Tính tổng số lẻ: (n + 1)^2

                // n + 1)^2 có thể hiểu là (n + 1) * (n + 1
int  tong_so_le=(int)Math.pow(n+1,2);
                // Tính tổng các số tự nhiên từ 1 đến n: n(n + 1)/2
        int tong_tu_nhien=n*(n+1 )/2;
                // Tính kết quả: S = tổng số lẻ × tổng số tự nhiên
        int kq=tong_so_le*tong_tu_nhien;
                // In kết quả ra màn hình
        System.out.println("Ket qua: "+kq);
    }//end main
}//end class
 */