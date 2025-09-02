// 50. Viết chương trình tính tiền lương ngày cho công nhân biết giờ vào ca và giờ ra ca của mỗi người. Trả công: trước 12h = 6000đ/giờ, sau 12h = 7500đ/giờ. Giờ vào sớm nhất 6h, ra trễ nhất 18h (giờ nguyên).
package lab4;

import java.util.Scanner;

public class Bt50 {
    public static void main(String[] args) {
        // gọi hàm nhập giờ vào ca và giờ ra ca
        // nếu nhập giờ vào ca không hợp lệ sẽ yêu cầu nhập lại
        int vaoCa, raCa;
        do {
            vaoCa = nhapGio("Nhap gio vao ca (6-18): ");
            raCa = nhapGio("Nhap gio ra ca (6-18): ");
            if (vaoCa < raCa) {
                break;
            }
            System.out.println("Gio vao ca phai nho hon gio ra ca. Vui long nhap lai.");
        } while (true);
        // gọi hàm tính tổng lương dựa trên giờ vào ca và giờ ra ca
        int tinhLuong = tongLuong(vaoCa, raCa);
        // in kết quả tiền lương của công nhân
        System.out.println("Tien luong cua cong nhan la: " + tinhLuong + " dong.");
        sc.close();
    }// end main
     // đây là Hàm nhập giờ vào ca và giờ ra ca
     // Yêu cầu người dùng nhập giờ vào ca và giờ ra ca trong khoảng từ 6 đến 18
     // Nếu nhập không hợp lệ sẽ yêu cầu nhập lại
     // Trả về giá trị giờ hợp lệ

    static Scanner sc = new Scanner(System.in);

    /**
     * Nhập giờ hợp lệ (6..18).
     * 
     * @param chuoi thông báo nhắc nhập
     * @return giờ hợp lệ
     */
    public static int nhapGio(String chuoi) {
        int gio;
        do {
            System.out.print(chuoi);
            gio = sc.nextInt();
            if (gio >= 6 && gio <= 18) {
                return gio;
            }
            System.out.println("Gio phai nam trong khoang tu 6 den 21.");
        } while (true);
    }

    // đây là Hàm tính tổng lương dựa trên giờ vào ca và giờ ra ca theo quy định:
    // - Tiền trả cho mỗi giờ trước 12 giờ là 6000đ
    // - Tiền trả cho mỗi giờ sau 12 giờ là 7500đ
    // - Giờ vào ca sớm nhất là 6 giờ sáng và giờ ra ca trễ nhất là 18 giờ
    // - Giờ vào ca phải nhỏ hơn giờ ra ca
    /**
     * Tính tổng lương theo giờ vào/ra ca.
     * Trước 12h: 6000đ/giờ; từ 12h trở đi: 7500đ/giờ.
     * 
     * @param vaoCa giờ vào ca (6..17)
     * @param raCa  giờ ra ca (vaoCa < raCa <= 18)
     * @return tổng lương (đồng)
     */
    public static int tongLuong(int vaoCa, int raCa) {
        int tongLuong = 0;
        for (int gio = vaoCa; gio < raCa; gio++) {
            if (gio < 12) {
                tongLuong += 6000;
            } else {
                tongLuong += 7500;
            }
        }
        return tongLuong;
    }
}// end class
