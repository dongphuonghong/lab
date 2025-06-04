// 27. Một số hoàn thiện là một số có tổng các ước số của nó (không kể nó) bằng chính nó. Hãy nhập vào số nguyên dương n và kiểm tra xem n có phải là số hoàn thiện không. 
package lab3_1;
import java.util.Scanner;
public class bt27 {
    public static void main(String[] args) {
        int n, sum = 0;
        // Nhập số nguyên dương từ bàn phím
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap so nguyen duong n: ");
            n = sc.nextInt();
        }        
        // Duyệt qua các số từ 1 đến n-1 để tìm tất cả ước số của n (không bao gồm chính nó)
        int i = 1;
        while (i < n) {
            // Nếu i là ước của n thì cộng vào tổng sum
            if (n % i == 0) {
                sum += i;
            }
            // Tăng i để kiểm tra số tiếp theo
            i++;
        }
        // Kiểm tra nếu tổng các ước số bằng chính n → n là số hoàn thiện
        if (sum == n) {
            System.out.println(n + " la so hoan thien.");
        // Nếu tổng các ước số không bằng n → n không phải số hoàn thiện
        } else {
            System.out.println(n + " khong phai la so hoan thien.");
        }
    }//end main
}//end class