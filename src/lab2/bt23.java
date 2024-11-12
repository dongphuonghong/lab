/**
 *  * 23. Viết chương trình nhâp̣ vào số nguyên dương n. Kiểm tra xem n có phải làsố chính
phương hay không? (số chính phương làsố khi lấy căn băc̣ 2 có kết quả là nguyên).
    */
package lab2;
    import java.util.Scanner;
public class bt23 {
    public static void main(String[] args) {
        //tạo biến n nhập từ bàn phím
int n;
try(Scanner sc = new Scanner(System.in)) {
    System.out.println("nhap n: ");
    n = sc.nextInt();
    }
// kiểm tra n có phải là số chính phương hay không bằng cách lấy căn bậc 2 của n và kiểm tra xem có phải số nguyên hay không
    int cp =(int)Math.sqrt(n);
    //nếu bình phương của căn bậc 2 của n bằng n thì n là số chính phương
if(Math.pow(cp, 2) == n) {
System.out.println(n + " là số chính phương");
//nếu không thì n không phải là số chính phương
    } else {
System.out.println(n + " không phải là số chính phương");
        }
}// end  main
}// end class