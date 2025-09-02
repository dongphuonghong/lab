
// In bảng cửu chương của số nguyên dương n từ 1 đến 10
import java.util.Scanner;

public class BangCuuChuong {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhập số nguyên dương n: ");
            n = sc.nextInt();
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }// end main
}// end class