// 31. Tinh,  vơin n S n 1 ) 1 ( 4 3 2 1 ) (         0  n
// Ý tưởng: Sử dụng vòng lặp để duyệt từ 1 đến n.
// Nếu số đang xét là số lẻ → cộng vào tổng.
// Nếu số đang xét là số chẵn → trừ khỏi tổng.
package lab3;
import java.util.Scanner;
public class bt31 {
public static void main(String[] args) {
    int n;
    // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
    try (Scanner sc = new Scanner(System.in)) {
                // Nhập giá trị n từ bàn phím
        System.out.print("Nhap n: ");
        n = sc.nextInt();
    }
            // Khởi tạo biến sum để lưu kết quả
    int sum=0;
            // Duyệt các số từ 1 đến n
    for (int i = 1; i <= n; i++) {
                    // Nếu i là số chẵn → trừ i khỏi tổng
        if (i % 2 == 0) {
sum -= i;
        } else {
                            // Nếu i là số lẻ → cộng i vào tổng
    sum += i;
        }
    }
            // In kết quả ra màn hình
    System.out.println("Tong S = " + sum);
}//end main
}//end class
// cách 2: Dùng công thức rút gọn, không cần vòng lặp
// - Nếu n là số chẵn:     S(n) = -n / 2
// - Nếu n là số lẻ:       S(n) = (n + 1) / 2
/*
 * package lab3;
import java.util.Scanner;
public class bt31_1 {
public static void main(String[] args) {
    int n;
    // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
    try (Scanner sc = new Scanner(System.in)) {
                // Nhập n từ bàn phím
        System.out.print("Nhap n: ");
        n = sc.nextInt();
    }
            // Khai báo biến s để lưu kết quả
    int s;
            // Áp dụng công thức rút gọn để tính S(n)
if(n%2==0){        
                // Nếu n chẵn: S = -n / 2
    s=-n/2;
}
else{
                // Nếu n lẻ: S = (n + 1) / 2
     s=(n+1)/2;
}
        // In kết quả
System.out.println("S = " + s);
    }//end main
}//end class
 */