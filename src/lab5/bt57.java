// 57. Viết chương trình nhập số nguyên dương n gồm k chữ số, đếm xem n có bao nhiêu chữ số chẵn và bao nhiêu chữ số lẻ.
// (Với 0 < k <= 5)/ 57. Viêt chương trinh nhâp sô nguyên dương n gôm k chư sô, đêm xem n co bao nhiêu chư sô chăn va bao nhiêu chư sô le.) 5 0 (  k
package lab5;

import java.util.Scanner;

public class Bt57 {
    public static void main(String[] args) {
        // Nhập số nguyên dương từ bàn phím
        int n = nhap("Nhap so nguyen duong n (1 <= n <= 9999): ");
        // Gọi hàm đếm số chẵn lẻ
        DemSoChanLe(n);
    }// end main
     // Hàm nhập số nguyên dương trong khoảng [1, 9999]
     // Kiểm tra điều kiện và yêu cầu nhập lại nếu không hợp lệ
     // Trả về số nguyên hợp lệ

    public static int nhap(String chuoi) {
        int n;
        do {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println(chuoi);
                n = sc.nextInt();
                if (n > 1 && n <= 9999) {
                    return n;
                }
                System.out.println("ban vui long nhap lai n >0");
            }
        } while (true);
    }

    // Hàm đếm số chữ số chẵn và lẻ trong một số nguyên
    // Sử dụng phép chia lấy dư (%) để tách từng chữ số
    // In kết quả đếm ra màn hình
    // Tham số: n - số nguyên dương cần đếm
    public static void DemSoChanLe(int n) {
        int demChan = 0;
        int demLe = 0;
        while (n > 0) {
            int chuSo = n % 10;
            if (chuSo % 2 == 0) {
                demChan++;
            } else {
                demLe++;
            }
            n /= 10;
        }
        System.out.println("So chu so chan: " + demChan);
        System.out.println("So chu so le: " + demLe);
    }
}// end class
