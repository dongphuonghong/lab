package lab2;

// 20. Nhập vào giờ, phút, giây. Kiểm tra xem giờ, phút, giây đó có hợp lệ hay không; in kết quả ra màn hình.
import java.util.Scanner;

public class Bt20 {
    public static void main(String[] args) {
        // tạo biến giờ, phút, giây nhập từ bàn phím
        int gio, phut, giay;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap so giay: ");
            giay = sc.nextInt();
            System.out.print("Nhap so phut: ");
            phut = sc.nextInt();
            System.out.print("Nhap so gio: ");
            gio = sc.nextInt();
            // Kiểm tra thời gian nhập vào có hợp lệ không
            if (gio >= 0 && gio <= 23) {
                System.out.println("Gio hop le");
            } else {
                System.out.println("Gio khong hop le");
            }
            if (phut >= 0 && phut <= 59) {
                System.out.println("Phut hop le");
            } else {
                System.out.println("Phut khong hop le");
            }
            if (giay >= 0 && giay <= 59) {
                System.out.println("Giay hop le");
            } else {
                System.out.println("Giay khong hop le");
            }
            sc.close();
        }
    }// end main
}// end class
