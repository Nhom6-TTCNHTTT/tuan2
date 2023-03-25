package LearnJAVA.OOP_JAVA.NhapxuatThongtinxe;

import java.util.Scanner;
public class Test {
    static Scanner sc = new Scanner(System.in);
    Vehicle xe = new Vehicle();
     static void nhapXe(Vehicle xe){
        System.out.println("Nhap ma xe");
        xe.setMaXe(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap dung tich xe");
        xe.setDungTich(sc.nextInt());
        System.out.println("Nhap tri gia xe");
        xe.setTriGia(sc.nextDouble());
        System.out.println("Nhap ten chu xe");
        xe.setChuXe(sc.nextLine()); sc.nextLine();
        System.out.println("Nhap mo ta xe");
        xe.setMoTa(sc.nextLine());
        

    }
    public static void main(String[] args) {
        Vehicle v[] = null;
        int n=0,a;
        boolean flag = true;
        do{
            
            System.out.println("Nhap 1 de nhap thong tin!");
            System.out.println("Nhap 2 de xuat bang thue!");
            a = sc.nextInt();
            switch(a){
                
                case 1: {
                    System.out.println("Nhap thong tin ve xe da khai bao");
                    n = sc.nextInt();
                    v = new Vehicle[n];
                    for(int i = 0;i<n;i++){
                        System.out.println("Xe thu " + (i+1));
                        v[i] = new Vehicle();
                        nhapXe(v[i]); 
                    }
                    break;
                }
                case 2: {
                    System.out.printf("%5s %5s %5s %10s %10s %8s \n","Ma Xe","Dung Tich","Tri gia","Chu xe","Mo Ta","Thue");
                    for(int i = 0;i<n;i++){
                        v[i].inThue();
                    }
                    break;
                }
                default:
                System.out.println("Ket thuc");
                flag = false;
                break;
            }
        }while(flag);
    }
}
