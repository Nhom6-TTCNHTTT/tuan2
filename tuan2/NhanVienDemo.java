package ttcn.tuan2;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class NhanVienDemo {

    static NhanVien dsnv[];//=new NhanVien();
    static int n;//so phan tu mang

    static void nhapDSNV() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang n: ");
        n = s.nextInt();
        //xin caps phat n phan tu cho mang
        dsnv = new NhanVien[n];
        //nhap mang
        for (int i = 0; i < n; i++) {
            System.out.print(
            "Nhap nhan vien thu "+(i+1)+": ");
 dsnv[i] = new NhanVien();
            dsnv[i].nhap();
        }
    }

    static void inDSNV() {
        System.out.println("DS nhan vien sau khi nhap:");
        //goij ham tinh in tieu de
        NhanVien.xuatTieuDe();
        for (NhanVien nv : dsnv) {
            nv.xuat();
        }
    }
    public static NhanVien[] getDsnv() {
        return dsnv;
    }

    public static int getN() {
        return n;
    }
    
    @SuppressWarnings("empty-statement")
    static void SapXep () {
        Comparator<NhanVien> c1 = new Comparator<NhanVien> (){

            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getTen().compareToIgnoreCase(o2.getTen());
            }
        
    };
        
        Arrays.sort(dsnv , c1);
        
        System.out.println("DS sau khi sap xep :))");
        inDSNV();
    }

    static void TimMax () {
        Comparator<NhanVien> c1 = new Comparator<NhanVien> (){

            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Integer.compare(o1.getTen().length(), o2.getTen().length());
               // throw new UnsupportedOperationExc2eption("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
    };
        NhanVien nv1 = Collections.max(Arrays.asList(dsnv), c1);
        System.out.println("Ten nv dai nhat la");
        
        nv1.xuat();
    }

    public static void main(String[] args) {
        nhapDSNV();
        inDSNV();
        SapXep();
        TimMax();
    }
}

