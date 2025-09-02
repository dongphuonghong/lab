/**
 * 21. Viết chương trình tính tiền cước TAXI.
 * Mô tả: Nhập số km, tính tiền cước theo quy tắc sau:
 * - Km đầu tiên: 13.000 đ
 * - Mỗi km tiếp theo: 12.000 đ
 * - Nếu tổng > 30 km thì mỗi km sau 30 km tính 11.000 đ
 * Hãy nhập số km, sau đó in ra số tiền phải trả.
 */
package lab2;

import java.util.Scanner;

public class Bt21 {
   public static void main(String[] args) {
      int n;
      try (Scanner sc = new Scanner(System.in)) {
         System.out.println("Nhap so km: ");
         n = sc.nextInt();
      }
      // tính tiền cước
      // nếu n<=1 thì in ra tổng số tiền phải trả là 13000
      if (n <= 1) {
         System.out.print("tong so tien la" + 13000);
         // nếu n<=30 thì in ra tổng số tiền phải trả là 13000+(n-1)*12000
      } else if (n <= 30) {
         System.out.print("tong so tien la" + (13000 + (n - 1) * 12000));
         // nếu n>30 thì in ra tổng số tiền phải trả là 13000+29*12000+(n-30)*11000
      } else {
         System.out.print("tong so tien la" + (13000 + 29 * 12000 + (n - 30) * 11000));
      }
   }// end main
}// end class
