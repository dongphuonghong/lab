package lab1;
import java.util.Scanner;
public class bt11 {
    public static void main(String[] args) {        
        try (Scanner sc = new Scanner(System.in)) {
        // Nhập thông tin cho hình tam giác
        System.out.println("nhap do dai tam giac");
         double dodai=sc.nextDouble(); 
        System.out.println("nhap chieu cao tam giac");
          double chieucao=sc.nextDouble(); 
 double dien_tich= (dodai*chieucao)/2;
       double  chuvi= dodai*3;
System.out.println("dien tich tam giac la: "+dien_tich);
        System.out.println("chu vi tam giac la: "+chuvi);
                        // Nhập thông tin cho hình vuông
        System.out.println("nhap do dai canh hinh vuong");
        double canh=sc.nextDouble();
        double dientich_hinhvuong=canh*canh;
        double chuvi_hinhvuong=canh*4;
        System.out.println("dien tich hinh vuong la: "+dientich_hinhvuong);
        System.out.println("chu vi hinh vuong la: "+chuvi_hinhvuong);
                // Nhập thông tin cho hình chữ nhật
        System.out.println("nhap chieu dai hinh chu nhat");
        double chieudai=sc.nextDouble();
        System.out.println("nhap chieu rong hinh chu nhat");
        double chieurong=sc.nextDouble();
        double dientich_hinhchunhat=chieudai*chieurong;
        double chuvi_hinhchunhat=(chieudai+chieurong)*2;
        System.out.println("dien tich hinh chu nhat la: "+dientich_hinhchunhat);
        System.out.println("chu vi hinh chu nhat la: "+chuvi_hinhchunhat);
                // Nhập thông tin cho hình tròn
        System.out.println("nhap ban kinh hinh tron");
        double bankinh=sc.nextDouble();
        double dientich_hinhtron=Math.PI*bankinh*bankinh;
        double chuvi_hinhtron=2*Math.PI*bankinh;
        System.out.println("dien tich hinh tron la: "+dientich_hinhtron);
        System.out.println("chu vi hinh tron la: "+chuvi_hinhtron);
               sc.close();
        }
}//end main
}//end class