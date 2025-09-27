import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DemoArrayList {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = nhapSoLuong("Nhap so luong phan tu (>0): ");
        ArrayList<Integer> list = nhapDanhSach(n);
        xuatDanhSach(list);
        Collections.sort(list);
        System.out.println("Danh sach sau khi sap xep tang dan: ");
        xuatDanhSach(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Danh sach sau khi sap xep giam dan: ");
        xuatDanhSach(list);
        sc.close();
    }// end main

    public static int nhapSoLuong(String chuoi) {
        int n;
        do {
            System.out.println(chuoi);
            n = sc.nextInt();
            if (n > 0) {
                return n;
            }
            System.out.println("Bạn vui lòng nhập lại n > 0");
        } while (true);
    }

    public static ArrayList<Integer> nhapDanhSach(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int value = sc.nextInt();
            list.add(value);
        }
        return list;
    }

    public static void xuatDanhSach(ArrayList<Integer> list) {
        System.out.println("Cac phan tu trong danh sach la: ");
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int timMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int value : list) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int timMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int value : list) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static double tinhTrungBinh(ArrayList<Integer> list) {
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        return (double) sum / list.size();
    }

    public static void sapXepTangDan(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void sapXepGiamDan(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void xoaPhanTu(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                list.remove(i);
                break;
            }
        }
        System.out.println("Da xoa phan tu " + value + " khoi danh sach.");
    }

    public static void themPhanTu(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > value) {
                list.add(i, value);
                System.out.println("Da them phan tu " + value + " vao danh sach.");
                return;
            }
        }
        list.add(value);
        System.out.println("Da them phan tu " + value + " vao cuoi danh sach.");
    }

    public static int tongChan(ArrayList<Integer> list) {
        int sum = 0;
        for (int value : list) {
            if (value % 2 == 0) {
                sum += value;
            }
        }
        return sum;
    }

    public static int tongLe(ArrayList<Integer> list) {
        int sum = 0;
        for (int value : list) {
            if (value % 2 != 0) {
                sum += value;
            }
        }
        return sum;
    }

    public static int demChan(ArrayList<Integer> list) {
        int count = 0;
        for (int value : list) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int demLe(ArrayList<Integer> list) {
        int count = 0;
        for (int value : list) {
            if (value % 2 != 0) {
                count++;
            }
        }
        return count;
    }

}// end class