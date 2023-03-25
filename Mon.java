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
public class Mon {
    private String tenMon;
    private int soHocKy;
    private String hocKy;
    
    void Nhap ()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap ten mon:");
        tenMon = s.nextLine();
        System.out.println("Nhap so hoc ky:");
        soHocKy = Integer.parseInt(s.nextLine());
        System.out.println("Nhap hoc ky:");
        hocKy = s.nextLine();
    }
    
    public void xuat() {
        System.out.printf("%-15s%-10s%-15s",
                tenMon, soHocKy , hocKy);
    }
}
