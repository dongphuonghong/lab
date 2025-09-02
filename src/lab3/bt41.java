// 41. Tính S theo biểu thức dạng tổng các tích giảm dần (mô tả trong đề).
package lab3;

import java.util.Scanner;

public class Bt41 {
        public static void main(String[] args) {
                int n;
                double x;
                // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
                try (Scanner sc = new Scanner(System.in)) {
                        // Nhập giá trị n từ bàn phím
                        System.out.print("Nhap n: ");
                        n = sc.nextInt();
                        // Nhập giá trị x từ bàn phím
                        System.out.print("Nhap x: ");
                        x = sc.nextDouble();
                }
                // Khởi tạo biến sum kiểu double để lưu tổng
                double sum = 0;
                // Dùng vòng lặp for chạy từ 1 đến n
                for (int i = 1; i <= n; i++) {
                        // Tính lũy thừa x^(2*i) và cộng dồn vào sum
                        sum += Math.pow(x, 2 * i);
                }
                // In ra kết quả tổng S
                System.out.println("S = " + sum);
        }// end main
}// end class
 // cách 2 dùng công thức nhân kế tiếp
/*
 * package lab3;
 * import java.util.Scanner;
 * public class Bt41_1 {
 * public static void main(String[] args) {
 * int n;
 * double x;
 * // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
 * try(Scanner sc = new Scanner(System.in)){
 * // Nhập giá trị n từ bàn phím
 * System.out.print("Nhap n: ");
 * n = sc.nextInt();
 * // Nhập giá trị x từ bàn phím
 * 
 * System.out.print("Nhap x: ");
 * x = sc.nextDouble();
 * }
 * // Khởi tạo biến sum để lưu tổng, ban đầu bằng 0
 * double sum=0;
 * // Tính x1 = x^2 để dùng lặp lại nhiều lần
 * double x1=x*x;
 * // Khởi tạo biến luythua = x^2
 * double luythua=x1;
 * // Dùng vòng lặp for chạy từ 1 đến n
 * for(int i=1; i<=n; i++){
 * // Cộng giá trị luythua vào tổng sum
 * sum+=luythua;
 * // Nhân tiếp luythua với x^2 để ra x^(2*i) cho lần lặp tiếp theo
 * 
 * luythua*=x1;
 * }
 * // In ra kết quả tổng S
 * System.out.println("S = "+sum);
 * }//end main
 * }//end class
 */
