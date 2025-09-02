// 49. Viết chương trình tính tiền thuê máy dịch vụ Internet và in kết quả. Dữ liệu nhập: giờ bắt đầu (GBD), giờ kết thúc (GKT), số máy thuê (SoMay). Điều kiện: 6 <= GBD < GKT <= 21 (giờ nguyên). Đơn giá: 2500đ/giờ trước 17h, 3000đ/giờ từ sau 17h.
package lab4;

import java.util.Scanner;

public class Bt49 {
    public static void main(String[] args) {
        // gọi hàm nhập giờ bắt đầu và giờ kết thúc
        int gbd, gkt;
        do {
            gbd = nhapGio("Nhap gio bat dau thue (>= 6 va < 21): ");
            gkt = nhapGio("Nhap gio ket thuc thue (>= 6 va <= 21): ");
            if (gbd < gkt)
                break;
            System.out.println("❌ Gio bat dau phai nho hon gio ket thuc.");
        } while (true);
        int soMay;
        do {
            soMay = nhapGio("Nhap so may thue (>= 1): ");
            if (soMay > 0)
                break;
            System.out.println("❌ So may phai lon hon 0.");
        } while (true);
        // gọi hàm tính tiền thuê máy
        // trả về in ra tổng tiền thuê máy
        int tongTien = TinhTienThueMay(gbd, gkt, soMay);
        System.out.println("Tong tien thue may: " + tongTien + " dong.");
        sc.close();
    }// end main
     // Hàm nhập giờ từ bàn phím
     // Nếu nhập giờ không hợp lệ sẽ yêu cầu nhập lại
     // Giờ phải nằm trong khoảng từ 6 đến 21
     // Trả về giá trị giờ hợp lệ

    static Scanner sc = new Scanner(System.in);

    /**
     * Nhập giờ hợp lệ (6..21) hoặc số máy (>0) tùy theo thông báo.
     * 
     * @param chuoi thông báo nhắc nhập
     * @return giá trị giờ (6..21) hoặc số máy > 0
     */
    public static int nhapGio(String chuoi) {
        int gio;
        do {
            System.out.print(chuoi);
            gio = sc.nextInt();
            if (gio >= 6 && gio <= 21) {
                return gio;
            }
            System.out.println("Gio phai nam trong khoang tu 6 den 21. Vui long nhap lai.");
        } while (true);
    }

    // Hàm tính tiền thuê máy
    // Nhận vào giờ bắt đầu, giờ kết thúc và số máy thuê
    // Tính tiền theo quy định: 2500đ/giờ trước 17h
    // và 3000đ/giờ sau 17h
    // Trả về tổng tiền thuê máy
    /**
     * Tính tổng tiền thuê máy Internet.
     * Đơn giá: trước 17h = 2500đ/giờ/máy, từ 17h trở đi = 3000đ/giờ/máy.
     * 
     * @param gbd   giờ bắt đầu (6..20)
     * @param gkt   giờ kết thúc (gbd < gkt <= 21)
     * @param soMay số máy thuê (>0)
     * @return tổng tiền thuê
     */
    public static int TinhTienThueMay(int gbd, int gkt, int soMay) {
        int tongTien = 0;
        for (int gio = gbd; gio < gkt; gio++) {
            if (gio < 17) {
                tongTien += soMay * 2500;
            } else {
                tongTien += soMay * 3000;
            }
        }
        return tongTien;
    }
}// end class
