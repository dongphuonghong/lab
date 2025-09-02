// 64. Viết chương trình nhập số nguyên dương n gồm k chữ số, sắp xếp các chữ số của n theo thứ tự tăng dần. 
package lab5;

import java.util.Scanner;

public class Bt64 {
    public static void main(String[] args) {
        // Nhập số nguyên dương từ bàn phím
        int n = nhap("Nhap n > 0: ");
        // Sắp xếp và in các chữ số theo thứ tự tăng dần
        sapXepChuSo(n);
    }// end main
     // Hàm nhập số nguyên dương từ bàn phím
     // Kiểm tra điều kiện n >= 0
     // Trả về số nguyên hợp lệ

    public static int nhap(String chuoi) {
        int n;
        do {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println(chuoi);
                n = sc.nextInt();
                if (n >= 0) {
                    return n;
                }
                System.out.println("ban vui long nhap lai n >0");
            }
        } while (true);
    }

    // Hàm sắp xếp các chữ số theo thứ tự tăng dần
    // Sử dụng phương pháp đếm tần suất xuất hiện của từng chữ số (0-9)
    // Sau đó in ra theo thứ tự từ 0 đến 9
    // Tham số: n - số nguyên dương cần sắp xếp chữ số
    public static void sapXepChuSo(int n) {
        int dem0 = 0, dem1 = 0, dem2 = 0, dem3 = 0, dem4 = 0;
        int dem5 = 0, dem6 = 0, dem7 = 0, dem8 = 0, dem9 = 0;
        while (n > 0) {
            int chuSo = n % 10;
            switch (chuSo) {
                case 0 -> dem0++;
                case 1 -> dem1++;
                case 2 -> dem2++;
                case 3 -> dem3++;
                case 4 -> dem4++;
                case 5 -> dem5++;
                case 6 -> dem6++;
                case 7 -> dem7++;
                case 8 -> dem8++;
                case 9 -> dem9++;
            }
            n /= 10;
        }
        // In các chữ số theo thứ tự từ nhỏ đến lớn
        for (int i = 0; i < dem0; i++)
            System.out.print("0 ");
        for (int i = 0; i < dem1; i++)
            System.out.print("1 ");
        for (int i = 0; i < dem2; i++)
            System.out.print("2 ");
        for (int i = 0; i < dem3; i++)
            System.out.print("3 ");
        for (int i = 0; i < dem4; i++)
            System.out.print("4 ");
        for (int i = 0; i < dem5; i++)
            System.out.print("5 ");
        for (int i = 0; i < dem6; i++)
            System.out.print("6 ");
        for (int i = 0; i < dem7; i++)
            System.out.print("7 ");
        for (int i = 0; i < dem8; i++)
            System.out.print("8 ");
        for (int i = 0; i < dem9; i++)
            System.out.print("9 ");
        System.out.println(); // Xuống dòng sau khi in xong
    }
}// end class
