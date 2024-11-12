/**
 * 19. Viêt chương trinh nhâp vao sô nguyên n gôm ba chư sô. Xuât ra man hinh theo thư tư tăng dân cua cac chư sô.Vi du: n=291.Xuât ra 129
 */
package lab2;
import java.util.Scanner;
 public class bt19 {
    public static void main(String[] args) {
        //tạo biến n và nhập giá trị từ bàn phím gồm 3 chữ số 
        int n,tram,chuc,donvi;
        try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Nhap  n: ");
    n = sc.nextInt();
    //tách các chữ số ra trăm chục đơn vị
    //hàng trăm = n/100
    tram = n/100;
    //hàng chục = (n%100)/10
    chuc = (n%100)/10;
    //hàng đơn vị = n%10
    donvi = n%10;
    //sắp xếp các chữ số theo thứ tự tăng dần bằng cách sử dụng hàm math.max và math.mincủa thư viện java 
    int max=Math.max(tram,Math.max(chuc,donvi));
    int min=Math.min(tram,Math.min(chuc,donvi));
    //tính chữ số còn lại bằng cách lấy tổng 3 chữ số trừ đi chữ số max và min
    int mid=tram+chuc+donvi-max-min;
    //in ra kết quả
System.out.println("thu tu tang dan cua cac so la:)"+min+" "+mid+" "+max);    
sc.close();    
        }
            }//end main
}//end class
//cách 2 sử dụng hoán vị
/**
 *  import java.util.Scanner;
public class bt19edit1 {
    public static void main(String[] args) {
                //tạo biến n và nhập giá trị từ bàn phím gồm 3 chữ số 
                int n,tram,chuc,donvi;
                try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Nhap  n: ");
                n = sc.nextInt();
                //tách các chữ số ra trăm chục đơn vị
                //hàng trăm = n/100
                tram = n/100;
                //hàng chục = (n%100)/10
                chuc = (n%100)/10;
                //hàng đơn vị = n%10
                donvi = n%10;
                //sắp xếp các chữ số theo thứ tự tăng dần bằng cách  sử dụng hoán vị 
                //nếu hàng trăm > hàng chục thì đổi chỗ 2 số đó
if(tram > chuc){
    //tạo biến tạm temp để lưu giá trị ban đầu của hàng trăm
                    int temp = tram;
                    //đổi giá trị của hàng trăm thành giá trị của hàng chục
                    tram = chuc;
                    //đổi giá trị của hàng chục thành giá trị của hàng trăm
                    chuc = temp;
}
//nếu hàng trăm > hàng đơn vị thì đổi chỗ 2 số đó
                if(tram > donvi){
                    //tạo biến tạm temp để lưu giá trị ban đầu của hàng trăm
                    int temp = tram;
                    //đổi giá trị của hàng trăm thành giá trị của hàng đơn vị   
                    tram = donvi;
                    //đổi giá trị của hàng đơn vị thành giá trị của hàng trăm
                    donvi = temp;
                }
                //nếu hàng chục > hàng đơn vị thì đổi chỗ 2 số đó
                if(chuc > donvi){
                    //tạo biến tạm temp để lưu giá trị ban đầu của hàng chục
                    int temp = chuc;
                    //đổi giá trị của hàng chục thành giá trị của hàng đơn vị
                    chuc = donvi;
                    //đổi giá trị của hàng đơn vị thành giá trị của hàng chục
                    donvi = temp;
                }
                //xuất kết quả sau khi sắp xếp
                System.out.println("So sau khi sap xep la: " + tram + chuc + donvi);
                sc.close();
                }
    }// end main
}// end class
 */
//cách 3 sử dụng toán tử 3 ngôi
/**
 * import java.util.Scanner;
public class bt19edit {
    public static void main(String[] args) {
        //tạo biến n và nhập giá trị từ bàn phím gồm 3 chữ số 
        int n,tram,chuc,donvi;
    try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Nhap  n: ");
    n = sc.nextInt();
    //tách các chữ số ra trăm chục đơn vị
    //hàng trăm = n/100
    tram = n/100;
    //hàng chục = (n%100)/10
    chuc = (n%100)/10;
    //hàng đơn vị = n%10
    donvi = n%10;
    //sắp xếp các chữ số theo thứ tự tăng dần   cách so sánh 2 số đầu tiên, sau đó so sánh số lớn nhất với số cuối cùng bằng cách sử dụng  toán tử 3 ngôi
    int max=(tram>chuc)?tram:chuc;
    max=(max>donvi)?max:donvi;
    //tìm số nhỏ nhấtthực hiện tương tự như trên 
    int min=(tram<chuc)?tram:chuc;
    min=(min<donvi)?min:donvi;
    //tìm số ở giữa bằng cách lấy tổng 3 số trừ đi số lớn nhất và số nhỏ nhất
    int mid=(tram+chuc+donvi)-max-min;
    //in ra kết quả
System.out.println("thu tu tang dan la: "+min+" "+mid+" "+max);
//đóng scanner
        sc.close();
    }
    }//end main
}// end class
 */
//cách 4 sử dụng if else
/**
 *  import java.util.Scanner;
public class bt19edit1 {
    public static void main(String[] args) {
                //tạo biến n và nhập giá trị từ bàn phím gồm 3 chữ số 
                int n,tram,chuc,donvi;
                try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Nhap  n: ");
                n = sc.nextInt();
                //tách các chữ số ra trăm chục đơn vị
                //hàng trăm = n/100
                tram = n/100;
                //hàng chục = (n%100)/10
                chuc = (n%100)/10;
                //hàng đơn vị = n%10
                donvi = n%10;
                //so sánh các chữ số với nhau bằng cách dùng if else
                //nếu chữ số hàng trăm < chữ số hàng chục < chữ số hàng đơn vị
                if(tram<chuc && chuc<donvi){
                    //kết quả in ra là chữ số hàng trăm, hàng chục, hàng đơn vị
                    System.out.print("thu tu tang dan la: "+tram+" "+chuc+" "+donvi);
                    //nếu chữ số hàng trăm < chữ số hàng đơn vị < chữ số hàng chục
                }else if(tram<donvi && donvi<chuc){
                    //kết quả in ra là chữ số hàng trăm, hàng đơn vị, hàng chục
                    System.out.print("thu tu tang dan la: "+tram+" "+donvi+" "+chuc);
                    //nếu chữ số hàng chục < chữ số hàng trăm < chữ số hàng đơn vị
                }else if(chuc<tram && tram<donvi){
                    //kết quả in ra là chữ số hàng chục, hàng trăm, hàng đơn vị
                    System.out.print("thu tu tang dan la: "+chuc+" "+tram+" "+donvi);
                    //nếu chữ số hàng chục < chữ số hàng đơn vị < chữ số hàng trăm
                }else if(chuc<donvi && donvi<tram){
                    //kết quả in ra là chữ số hàng chục, hàng đơn vị, hàng trăm
                                    System.out.print("thu tu tang dan la: "+chuc+" "+donvi+" "+tram);
                                    //nếu chữ số hàng đơn vị < chữ số hàng trăm < chữ số hàng chục
                }else if(donvi<tram && tram<chuc){
                    //kết quả in ra là chữ số hàng đơn vị, hàng trăm, hàng chục
                    System.out.print("thu tu tang dan la: "+donvi+" "+tram+" "+chuc);
                    //nếu chữ số hàng đơn vị < chữ số hàng chục < chữ số hàng trăm
                }else if(donvi<chuc && chuc<tram){
                    //kết quả in ra là chữ số hàng đơn vị, hàng chục, hàng trăm
                    System.out.print("thu tu tang dan la: "+donvi+" "+chuc+" "+tram);
                }                                    
                //đóng scanner
                   sc.close();
                }
    }// end main
}//  end class
 */