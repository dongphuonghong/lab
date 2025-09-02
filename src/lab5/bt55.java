// 55. Cho 2 số nguyên a, b. Viết hàm hoán vị giá trị 2 số trên.
package lab5;

import java.util.Scanner;

/**
 * Bài 55: Nhập hai số nguyên a, b và hoán vị (minh họa cơ chế truyền tham số
 * theo giá trị trong Java).
 */
public class Bt55 {
    public static void main(String[] args) {
        // Nhập hai số nguyên a và b từ bàn phím
        int a, b;
        a = nhap("Nhap a: ");
        b = nhap("Nhap b: ");
        // In giá trị trước khi hoán vị
        System.out.println("Truoc khi hoan vi: a = " + a + ", b = " + b);
        // Gọi hàm hoán vị
        hoanVi(a, b);
    }// end main
     // Hàm nhập số nguyên từ bàn phím
     // Tham số: chuoi - thông báo hiển thị cho người dùng
     // Trả về: giá trị số nguyên được nhập từ bàn phím

    static Scanner sc = new Scanner(System.in);

    /**
     * Nhập một số nguyên từ bàn phím.
     * 
     * @param chuoi thông báo nhắc nhập
     * @return số nguyên người dùng nhập
     */
    public static int nhap(String chuoi) {
        System.out.print(chuoi);
        return sc.nextInt();
    }

    // Hàm hoán vị giá trị hai số nguyên
    // Lưu ý: Trong Java, tham số được truyền theo giá trị (pass by value)
    // nên việc hoán vị chỉ có hiệu lực trong phạm vi hàm này
    // Để hoán vị thực sự, cần sử dụng mảng hoặc đối tượng
    // Tham số: a, b - hai số nguyên cần hoán vị
    /**
     * Hoán vị hai số nguyên (chỉ hiệu lực bên trong hàm do pass-by-value).
     * 
     * @param a số thứ nhất (bản sao)
     * @param b số thứ hai (bản sao)
     */
    public static void hoanVi(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Sau khi hoán vị: a = " + a + ", b = " + b);
    }
}// end class
