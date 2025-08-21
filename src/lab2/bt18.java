//18. Viêt chương trinh nhâp vao môt sô nguyên n gôm ba chư sô. Xuât ra man hinh chư sô lơn nhât ơ vi tri nao Vi du: n=291. Chư sô lơn nhât năm ơ hang chuc chữ số 9.
package lab2;
import java.util.Scanner;
public class Bt18 {
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
    //so sánh 3 chữ số với nhau bằng cấu trúc if else
    //nêu chữ số hàng trăm lớn hơn chữ số hàng chục và chữ số hàng đơn vị
    //thì in ra chữ số lớn nhất ở hàng trăm
if(tram>chuc && tram>donvi){
    System.out.println("Chu so lon nhat o hang tram: "+tram);
    //nếu chữ số hàng chục lớn hơn chữ số hàng trăm và chữ số hàng đơn vị
    //thì in ra chữ số lớn nhất ở hàng chục
    }else if(chuc>tram && chuc>donvi){    
    System.out.println("Chu so lon nhat nam hang chuc: "+chuc);
    //nếu chữ số hàng đơn vị lớn hơn chữ số hàng trăm và chữ số hàng chục
    //thì in ra chữ số lớn nhất ở hàng đơn vị
}else{
    System.out.println("Chu so lon nhat nam hang don vi: "+donvi);
}
//đóng scanner
    sc.close();
    }
}//end main
}//end class
//cách 2
/**
 * import java.util.Scanner;
public class Bt18edit {
    public static void main(String[] args) {
        //tạo biến n và nhập giá trị từ bàn phím gồm 3 chữ số 
int n,tram,chuc,donvi;        
try (Scanner sc = new Scanner(System.in)) {
System.out.println("Nhap n: ");
n = sc.nextInt();
//tách các chữ số ra trăm chục đơn vị
tram = n/100;
chuc = (n%100)/10;
donvi = n%10;
//tìm chữ số lớn nhất trong 3 chữ số bằng cách gọi hàm max của lớp Math
int max=Math.max(tram,Math.max(chuc,donvi));
//tìm vị trí của chữ số lớn nhất bằng cách tạo biến vị trí và gán giá trị mặc định là trăm
String viTri = "trăm";
//nếu chữ số lớn nhất bằng chữ số hàng chục thì gán vị trí là chục
if(max==chuc){
viTri = "chuc";
}
//nếu chữ số lớn nhất bằng chữ số hàng đơn vị thì gán vị trí là đơn vị
if(max==donvi){
viTri = "donvi";
}
//in ra chữ số lớn nhất và vị trí của nó
System.out.print("chu so lon nhat la "+max+" o vi tri "+viTri);
//đóng scanner
sc.close();
}//end try
}//end main
}//end class
 */
//cách 3
/**
 * import java.util.Scanner;
public class Bt18edit {
    public static void main(String[] args) {
        //tạo biếnn và nhập giá trị từ bàn phím gồm 3 chữ số 
int n,tram,chuc,donvi;        
try (Scanner sc = new Scanner(System.in)) {
System.out.println("Nhap n: ");
n = sc.nextInt();
//tách số hàng trăm, chục, đơn vị
tram = n/100;
chuc = (n%100)/10;
donvi = n%10;
//tìm số lớn nhất và vị trí của số lớn nhất bằng cách tạo biến max và ketquavitri để lưu giá trị và vị trí của số lớn nhất măc định là số hàng trăm 
 int max = tram;
 String ketquavitri="Tram";
 //nếu số hàng đơn vị lớn hơn số lớn nhất thì gán số lớn nhất bằng số hàng đơn vị và vị trí là đơn vị
if (donvi > max) {
        max = donvi;
        ketquavitri = "Don vi";
    }
    //nếu số hàng chục lớn hơn số lớn nhất thì gán số lớn nhất bằng số hàng chục và vị trí là chục
    if (chuc > max) {
        max = chuc;
        ketquavitri = "Chuc";
    }
    //in ra số lớn nhất và vị trí của số lớn nhất
    System.out.println("So lon nhat la: " + max + " o vi tri: " + ketquavitri);
    //đóng scanner
    sc.close();
}//end try
}//end main
}//end class
 */
//cách 4
/**
 * import java.util.Scanner;
public class Bt18edit {
    public static void main(String[] args) {
        //tạo biếnn và nhập giá trị từ bàn phím gồm 3 chữ số 
int n,tram,chuc,donvi;        
try (Scanner sc = new Scanner(System.in)) {
System.out.println("Nhap n: ");
n = sc.nextInt();
//tách số hàng trăm, chục, đơn vị
tram = n/100;
chuc = (n%100)/10;
donvi = n%10;
//tìm số lớn nhất bằng cách sử dụng toán tử 3 ngôi
int max=(tram>chuc)?tram:chuc;
max=(max>donvi)?max:donvi;
//tìm vị trí của số lớn nhất bằng cách sử dụng toán tử 3 ngôi
String vitri=(max==tram)?"Tram":(max==chuc)?"Chuc":"Don vi";
//in kết quả số lớn nhất và vị trí của số lớn nhất
System.out.println("So lon nhat la: "+max+" o vi tri: "+vitri);
//đóng scanner
    sc.close();
}//end try
}//end main
}//end class
 */
