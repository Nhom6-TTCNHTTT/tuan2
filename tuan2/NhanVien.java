package ttcn.tuan2;


import java.util.Scanner;

public class NhanVien {

    private String hoDem;
    private String ten;
    private NgayThang ngaySinh = new NgayThang();
    private NgayThang ngayVaoLam = new NgayThang();

    public String getHoDem() {
        return hoDem;
    }

    public String getTen() {
        return ten;
    }

    public NgayThang getNgaySinh() {
        return ngaySinh;
    }

    public NgayThang getNgayVaoLam() {
        return ngayVaoLam;
    }

    void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print(" ho dem=");
        hoDem = s.nextLine();
        System.out.print("nhap ten nhan vien=");
        ten = s.nextLine();
        System.out.println("nhap ngay, tháng, năm sinh=:");
        ngaySinh.nhap();
        System.out.println("nhap ngay, tháng, năm vao lam=:");
        ngayVaoLam.nhap();
    }//xuất tiêu đề

    static void xuatTieuDe() {
        System.out.printf("%-15s%-10s%15s%15s%n",
                "Ho dem", "Ten", "Ngay sinh", "Ngay vao lam");
    }//in dữ liệu

    public void xuat() {
        System.out.printf("%-15s%-10s%15s%15s%n",
                hoDem, ten, ngaySinh, ngayVaoLam);
    }
}

