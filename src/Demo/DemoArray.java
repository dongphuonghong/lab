import java.util.Arrays;
import java.util.Scanner;

public class DemoArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = nhap("Nhap so luong phan tu cua mang (n > 0):");
        int[] a = new int[n];
        System.out.println("Nhap " + n + " phan tu cho mang:");
        nhapMang(a);
        Arrays.sort(a);
        System.out.print("Mang sau khi sap xep tang dan: ");
        xuatMang(a);
        sc.close();
    }// end maine

    public static int nhap(String chuoi) {
        int n;
        do {
            System.out.println(chuoi);
            n = sc.nextInt();
            if (n > 0) {
                return n;
            }
            System.out.println("ban vui long nhap lai n >0");
        } while (true);
    }

    public static void nhapMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int timMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int timMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void lietKeChan(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static void lietKeLonHonX(int[] a, int x) {
        System.out.print("Cac phan tu lon hon " + x + ": ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > x) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static int demNhoHonX(int[] a, int x) {
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < x) {
                d++;
            }
        }
        return d;
    }

    public static boolean kiemTraSoNguyenTo(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int tongLe(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int TongLonHonX(int[] a, int x) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > x) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static double TrungBinhAm(int[] a) {
        int sum = 0;
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                sum += a[i];
                d++;
            }
        }
        if (d == 0)
            return 0;
        return (double) sum / d;
    }

    public static double TrungBinhAm(int[] a, int x) {
        int sum = 0;
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < x) {
                sum += a[i];
                d++;
            }
        }
        if (d == 0)
            return 0;
        return (double) sum / d;
    }

    public static boolean KiemTraTonTaiLe(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean KiemTraTonTaiChan(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean KiemTraToanAm(int a[], int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                return false;
            }
        }
        return true;
    }

    public static void SapXepTang(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void SapXepGiam(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void SapSepChan(int[] a) {
        int[] chan = new int[a.length];
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                chan[d] = a[i];
                d++;
            }
        }
        Arrays.sort(chan, 0, d);
        System.out.print("Cac so chan sap xep tang dan: ");
        for (int i = 0; i < d; i++) {
            System.out.print(chan[i] + " ");
        }
        System.out.println();
    }

    public static void SapSepLe(int[] a) {
        int[] le = new int[a.length];
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                le[d] = a[i];
                d++;
            }
        }
        Arrays.sort(le, 0, d);
        System.out.print("Cac so le sap xep tang dan: ");
        for (int i = 0; i < d; i++) {
            System.out.print(le[i] + " ");
        }
        System.out.println();
    }

    public static int[] chenPhanTu(int[] a, int n, int x, int k) {
        if (k < 0 || k > n) {
            System.out.println("Vi tri chen khong hop le.");
            return a;
        }
        int[] b = new int[n + 1];
        for (int i = 0; i < k; i++) {
            b[i] = a[i];
        }
        b[k] = x;
        for (int i = k; i < n; i++) {
            b[i + 1] = a[i];
        }
        return b;
    }

    public static int[] xoaPhanTu(int[] a, int n, int k) {
        if (k < 0 || k >= n) {
            System.out.println("Vi tri xoa khong hop le.");
            return a;
        }
        int[] b = new int[n - 1];
        for (int i = 0; i < k; i++) {
            b[i] = a[i];
        }
        for (int i = k + 1; i < n; i++) {
            b[i - 1] = a[i];
        }
        return b;
    }
}// end class