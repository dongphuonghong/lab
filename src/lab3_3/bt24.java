// 24. Viết chương trình nhập số nguyên dương n. Kiểm tra n có phải là số nguyên tố hay không.
package lab3_3;

import java.util.Scanner;

public class Bt24 {
    public static void main(String[] args) {
        // khai báo biến n kiểu int
        // sử dụng hàm nhập để lấy giá trị n từ người dùng
        int n;
        n = nhap("nhap n");
        // gọi hàm kiểm tra số nguyên tố
        // nếu hàm trả về true thì in ra n là số nguyên tố
        // nếu hàm trả về false thì in ra n không phải là số nguyên tố
        if (kiemTraNguyenTo(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong la so nguyen to");
        }
    }// end main
     // đây là hàm nhập số nguyên dương
    // nếu nhập n nhỏ hơn 0 sẽ yêu cầu nhập lại
    // nếu nhập đúng sẽ trả về giá trị n

    /**
     * Nhập số nguyên dương n từ bàn phím (yêu cầu n >= 0).
     * Lặp lại cho đến khi hợp lệ.
     * 
     * @param chuoi thông báo nhắc nhập
     * @return giá trị n >= 0
     */
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

    // đây là hàm kiểm tra số nguyên tố
    // nếu n < 2 thì không phải số nguyên tố
    // nếu n chia hết cho bất kỳ số nào từ 2 đến căn bậc hai của n thì không phải số
    // nguyên tố
    // nếu không chia hết cho bất kỳ số nào từ 2 đến căn bậc hai của n thì là số
    // nguyên tố
    // trả về true nếu là số nguyên tố, false nếu không phải số nguyên tố
    // sử dụng vòng lặp for để kiểm tra từ 2 đến căn bậc hai của n
    // sử dụng toán tử % để kiểm tra chia hết hay không
    /**
     * Kiểm tra một số có phải là số nguyên tố.
     * 
     * @param n số cần kiểm tra
     * @return true nếu n là số nguyên tố, false nếu không
     */
    public static boolean kiemTraNguyenTo(int n) {
        boolean flag = true;
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}// end class
