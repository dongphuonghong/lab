// 33. Tinh,  vơi2 2 2 2 3 2 1 ) ( n n S      
// Ý tưởng: sử dụng vòng lặp để tính tổng bình phương các số tự nhiên từ 1 đến n
package lab3;
import  java.util.Scanner;
public class bt33 {
public static void main(String[] args) {
    int n;
            // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
try(Scanner sc = new Scanner(System.in)){
            // Nhập giá trị n từ bàn phím
    System.out.print("Nhap n: ");
    n = sc.nextInt();
}
        // Khởi tạo biến sum để lưu tổng
int sum=0;
        // Dùng vòng lặp for để tính tổng bình phương từ 1 đến n
for(int i=1; i<=n; i++){
                // Cộng bình phương của i vào tổng (i^2 = i * i)
    sum += i*i;
}
        // In ra kết quả
System.out.println("Tong S = " + sum);
}//end main
}//end class
// Cách 2 : sử dụng vòng lặp và hàm Math.pow để tính bình phương từng số từ 1 đến n
/*
 * package lab3;
import  java.util.Scanner;
public class bt33_1 {
    public static void main(String[] args) {
        int n;
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
            try(Scanner sc = new Scanner(System.in)){
                // Nhập giá trị n từ bàn phím

        System.out.print("Nhap n: ");
        n = sc.nextInt();
    }
            // Khởi tạo biến sum để lưu tổng
int sum=0;
        // Dùng vòng lặp for để tính tổng bình phương từ 1 đến n

for(int i=1; i<=n; i++){
                // Dùng hàm Math.pow để tính lũy thừa i^2, sau đó ép kiểu về int
sum+=(int)Math.pow(i,2);
}
        // In ra kết quả
System.out.println("Tong S = " + sum);
    }//    end main
}//end class
*/