//14Cho ba sô a, b, c đoc vao tư ban phim. Hay in ra man hinh theo thư tư tăng dân cac sô.
package lab2;
import java.util.Scanner;
public class bt14{
    public static void main(String[] args) {
                //khai báo biến a,b,c nhập từ bàn phím
int a,b,c;
try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Nhap c: ");
        c = sc.nextInt();
//sử dụng if else để sắp xếp 3 số
        //nếu a<b<c thì in ra a,b,c
        if(a<b && b<c){
            System.out.println("thứ tự tăng dần của ba số là"+a + " " + b + " " + c);
        //nếu a<c<b thì in ra a,c,b
        }else if(a<c && c<b){
            System.out.println("thứ tự của tăng dần  ba số là"+a + " " + c + " " + b);
    //nếu b<a<c thì in ra b,a,c
        }else if(b<a && a<c){
            System.out.println("thứ tự của tăng dần  ba số là"+b + " " + a + " " + c);
            //nếu b<c<a thì in ra b,c,a
        }else if(b<c && c<a){
            System.out.println("thứ tự của tăng dần  ba số là"+b + " " + c + " " + a);
            //nếu c<a<b thì in ra c,a,b
        }else if(c<a && a<b){            
            System.out.println("thứ tự của tăng dần  ba số là"+c + " " + a + " " + b);
            //nếu c<b<a thì in ra c,b,a
        }else if(c<b && b<a){
            System.out.println("thứ tự của tăng dần  ba số là"+c + " " + b + " " + a);
        }
        sc.close();
    }
    }//end main
}//end class
//cách 2 sử dụng hàm Math.max và Math.min
/**
 * import java.util.Scanner;
public class bt14edit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        //tạo biến a, b, c nhập từ bàn phím
        int a,b,c;
        System.out.println("Nhap a");
        a = sc.nextInt();
        System.out.println("Nhap b");
        b = sc.nextInt();
        System.out.println("Nhap c");
        c = sc.nextInt();       
        //sắp xếp 3 số a,b,c theo thứ tự tăng dần bằng cách sử dụng hàm Math.max và Math.min
        int max = Math.max(a,Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));
        //tìm số còn lại bằng cách lấy tổng 3 số trừ đi max và min
        int mid = a+b+c-max-min;
        //xuất kết quả
        System.out.println("Thu tu tang dan cua 3 so la: "+min+" "+mid+" "+max);
        //đóng scanner
        sc.close();
        }
    }//end main
}//end class
 */
//cách 3 sử dụng toán tử 3 ngôi
/**
 * import java.util.Scanner;
public class bt14edit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        //Nhap vao 3 so a,b,c tu ban phim
        int a,b,c;
        System.out.println("Nhap vao so a");
        a = sc.nextInt();
        System.out.println("Nhap vao so b");
        b = sc.nextInt();
        System.out.println("Nhap vao so c");
        c = sc.nextInt();
        //Sắp xếp 3 số a,b,c theo thứ tự tăng dần bằng cách so sánh 2 số đầu tiên, sau đó so sánh số lớn nhất với số còn lại bằng cách sử dụng toán tử 3 ngôi
        int max=(a>b)?a:b;
        max=(max>c)?max:c;
        int min=(a<b)?a:b;
        min=(min<c)?min:c;
        int mid=(a+b+c)-max-min;
        //xuất kết quả
        System.out.println("thu tu tang dan la: "+min+" "+mid+" "+max);
        //đóng scanner
        sc.close();
        }
        }//endnd main
}//end class
 */
// cách 4 so sánh từng cặp số bằng cách sử dụng phép  hoán vị
/**
 * import java.util.Scanner;
public class bt14{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        //tạo biến a, b, c nhập từ bàn phím
        int a, b, c;    
        System.out.println("Nhap a");
        a = sc.nextInt();
        System.out.println("Nhap b");
        b = sc.nextInt();
        System.out.println("Nhap c");
        c = sc.nextInt();
        //sắp xếp 3 số theo thứ tự tăng dần bằng cách so sánh từng cặp số
        //nếu a lớn hơn b thì đổi chỗ a và b 
        if(a>b){
            //tạo biến temp để lưu giá trị của a
            int temp = a;
            //gán giá trị của b cho a
            a = b;
            //gán giá trị của temp cho b
            b = temp;
        }
        //nếu a lớn hơn c thì đổi chỗ a và c
        if(a>c){
            //tạo biến temp để lưu giá trị của a
            int temp = a;
            //gán giá trị của c cho a
            a = c;
            //gán giá trị của temp cho c
            c = temp;
        }
        //nếu b lớn hơn c thì đổi chỗ b và c
        if(b>c){
            //tạo biến temp để lưu giá trị của b
            int temp = b;
            //gán giá trị của c cho b
            b = c;
            //gán giá trị của temp cho c
            c = temp;
        }
        //xuất  kết  quả  
        System.out.println("Thu tu tang dan cua 3 so la: " + a + " " + b + " " + c);
        //đóng scanner
    sc.close();        
    }
    }//end main
}//end class
 */
//cách 5 sử dụng if else if
/**
 * //Cho ba sô a, b, c đoc vao tư ban phim. Hay in ra man hinh theo thư tư tăng dân cac sô.
import java.util.Scanner;
public class bt14edit {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
        //tạo biến a, b, c nhập từ bàn phím
        int a, b, c;    
        System.out.println("Nhap a");
        a = sc.nextInt();
        System.out.println("Nhap b");
        b = sc.nextInt();
        System.out.println("Nhap c");
        c = sc.nextInt();
        //sử dụng if else để so sánh 3 số
        //nếu a < b và a < c thì so sánh b và c
if (a < b && a < c) {   
    if (b < c) {
        System.out.println(a + " " + b + " " + c);
        //nếu b < c thì so sánh a và c
    } else {
        System.out.println(a + " " + c + " " + b);
    }
    //nếu b < a và b < c thì so sánh a và c
} else if (b < a && b < c) {
    if (a < c) {
        System.out.println(b + " " + a + " " + c);
        //nếu a < c thì so sánh b và c
    } else {
        System.out.println(b + " " + c + " " + a);
    }
    //nếu c < a và c < b thì so sánh a và b
} else if (c < a && c < b) {
    if (a < b) {
        System.out.println(c + " " + a + " " + b);
        //nếu a < b thì so sánh c và b
    } else {
        System.out.println(c + " " + b + " " + a);
    }
}
}
    }//end main
}//end class
 */