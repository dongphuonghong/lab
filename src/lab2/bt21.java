/**
 * /**
 * 21.	Viết chương trinh tì	́nh tiền cước TAXI. Biết rằng: 
-	km đầu tiên là 13000đ.  
-	Mỗi km tiếp theo là 12000đ.  
-	Nếu lớn hơn 30km thì môĩ km thêm sẽ là 11000đ.  Hay nhẫ	p sộ	́ km sau đó in ra số tiền phải trả. 
*/
package lab2;
import    java.util.Scanner;
public class bt21 {
     public static void main(String[] args) {
          //tạo biến n nhập từ bàn phím 
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap so km: ");
               n = sc.nextInt();
            }
            //tính tiền cước
            //nếu n<=1 thì in ra tổng số tiền phải trả là 13000
            if(n<=1){
               System.out.print("tong so tien la"+13000);
               //nếu n<=30 thì in ra tổng số tiền phải trả là 13000+(n-1)*12000
}else if(n<=30){
               System.out.print("tong so tien la"+(13000+(n-1)*12000));
               //nếu n>30 thì in ra tổng số tiền phải trả là 13000+29*12000+(n-30)*11000
               }else{
               System.out.print("tong so tien la"+(13000+29*12000+(n-30)*11000));
               }
               }//end main
    }//end class