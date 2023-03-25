/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SinhVien {

    public String hoTen;
    public Date ngaySinh = new Date();
    public float diemThi[];


    public void Nhap() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = s.nextLine();
        System.out.println("nhap ngay sinh: ");
        ngaySinh.nhap();

    }

     void inTieuDe() {
        System.out.printf("%-15s%15s%n",
                "Ho Ten", "Ngay sinh");
    }//in dữ liệu

    /**
     *
     */
    public void Xuat() {
        System.out.printf("%-15s%15s%n",
                hoTen, ngaySinh);

    }

    void nhapSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
