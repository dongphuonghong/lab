/**
 * Bài 51: Nhập vào ba cạnh a, b, c kiểm tra điều kiện tam giác.
 * Nếu hợp lệ tính diện tích (Heron) và các đường cao tương ứng (ha=2S/a,...).
 */
package lab4;

import java.util.Scanner;

public class Bt51 {
    public static void main(String[] args) {
        // Nhập vào 3 cạnh a, b, c từ bàn phím
        double a = nhap("Nhap canh a: ");
        double b = nhap("Nhap canh b: ");
        double c = nhap("Nhap canh c: ");

        // Kiểm tra xem a, b, c có thể tạo thành một tam giác hay không
        if (kiemTraTamGiac(a, b, c)) {
            System.out.println("Ba canh " + a + ", " + b + ", " + c + " co the tao thanh tam giac.");
            // Tính diện tích tam giác
            double s = tinhDienTich(a, b, c);
            System.out.println("Dien tich tam giac la: " + s);
            // In chiều cao tương ứng với các cạnh a, b, c
            inChieuCao(a, b, c, s);
        } else {
            System.out.println("Ba canh " + a + ", " + b + ", " + c + " khong the tao thanh tam giac.");
        }

        sc.close();
    }// end main
     // Hàm nhập số thực từ bàn phím
     // Tham số: chuoi - thông báo hiển thị cho người dùng
     // Trả về: giá trị số thực được nhập từ bàn phím

    static Scanner sc = new Scanner(System.in);

    /**
     * Nhập một số thực từ bàn phím.
     * 
     * @param chuoi thông báo nhắc nhập
     * @return giá trị double nhập
     */
    public static double nhap(String chuoi) {
        System.out.print(chuoi);
        return sc.nextDouble();
    }

    // Hàm kiểm tra xem ba số a, b, c có thể tạo thành một tam giác hay không
    // Điều kiện để a, b, c tạo thành tam giác: tổng của hai cạnh bất kỳ phải lớn
    // hơn cạnh còn lại
    // - a + b > c: tổng hai cạnh a và b lớn hơn cạnh c
    // - a + c > b: tổng hai cạnh a và c lớn hơn cạnh b
    // - b + c > a: tổng hai cạnh b và c lớn hơn cạnh a
    // Trả về: true nếu tạo thành tam giác, false nếu không tạo thành tam giác
    /**
     * Kiểm tra điều kiện tạo thành tam giác.
     * 
     * @param a cạnh a
     * @param b cạnh b
     * @param c cạnh c
     * @return true nếu tạo được tam giác
     */
    public static boolean kiemTraTamGiac(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    // Hàm tính diện tích tam giác theo công thức Heron
    // Công thức: S = sqrt(p × (p - a) × (p - b) × (p - c))
    // Trong đó: p = (a + b + c) / 2 (nửa chu vi tam giác)
    // Tham số: a, b, c - độ dài ba cạnh của tam giác
    // Trả về: diện tích tam giác
    /**
     * Tính diện tích tam giác theo công thức Heron.
     * 
     * @param a cạnh a
     * @param b cạnh b
     * @param c cạnh c
     * @return diện tích tam giác
     */
    public static double tinhDienTich(double a, double b, double c) {
        double p = (a + b + c) / 2; // Nửa chu vi
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // Hàm tính và in chiều cao tương ứng với các cạnh a, b, c
    // Công thức tính chiều cao:
    // - ha = (2 × S) / a: chiều cao từ đỉnh đối diện với cạnh a
    // - hb = (2 × S) / b: chiều cao từ đỉnh đối diện với cạnh b
    // - hc = (2 × S) / c: chiều cao từ đỉnh đối diện với cạnh c
    // Tham số: a, b, c - độ dài ba cạnh, s - diện tích tam giác
    /**
     * In chiều cao tương ứng với mỗi cạnh của tam giác.
     * 
     * @param a cạnh a
     * @param b cạnh b
     * @param c cạnh c
     * @param s diện tích tam giác
     */
    public static void inChieuCao(double a, double b, double c, double s) {
        double ha = (2 * s) / a;
        double hb = (2 * s) / b;
        double hc = (2 * s) / c;
        System.out.println("Chieu cao tuong ung voi canh a: " + ha);
        System.out.println("Chieu cao tuong ung voi canh b: " + hb);
        System.out.println("Chieu cao tuong ung voi canh c: " + hc);
    }
}// end class
