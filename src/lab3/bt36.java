// 36. Tính S = 1^2 + 2^2 + 3^2 + ... + n^2.
package lab3;

import java.util.Scanner;

public class Bt36 {
    public static void main(String[] args) {
        int n;
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        try (Scanner sc = new Scanner(System.in)) {
            // Nhập giá trị n từ bàn phím
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        // Khởi tạo biến sum để lưu tổng bình phương các số tự nhiên từ 1 đến n
        int sum = 0;
        // Dùng vòng lặp for để duyệt qua từng số từ 1 đến n
        for (int i = 1; i <= n; i++) {
            // Cộng bình phương của i vào biến sum (i * i là i bình phương)
            sum += i * i;
        }
        // In ra kết quả tổng S(n)
        System.out.println("Tong S = " + sum);
    }// end main
}// end class
 // cách 2 dùng math.pow để tính bình phương
/*
 * package lab3;
 * import java.util.Scanner;
 * public class Bt36_1 {
 * public static void main(String[] args) {
 * int n;
 * // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
 * try(Scanner sc = new Scanner(System.in)){
 * // Nhập giá trị n từ bàn phím
 * System.out.print("Nhap n: ");
 * n = sc.nextInt();
 * }
 * // Khởi tạo biến sum để lưu tổng bình phương các số tự nhiên từ 1 đến n
 * int sum=0;
 * // Dùng vòng lặp for để duyệt qua từng số từ 1 đến n
 * for(int i=1; i<=n; i++){
 * sum+=Math.pow(i,2);
 * }
 * // In ra kết quả tổng S(n)
 * System.out.println("Tong S = " + sum);
 * }//end main
 * }//end class
 */
