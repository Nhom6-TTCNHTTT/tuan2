/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhPhang;

/**
 *
 * @author Admin
 */
public class HinhTron extends HinhPhang {

    private double R;

    public HinhTron(double R) {
        this.R = R;
    }
    
    @Override
    public double tinhDienTich() {
        return 3.14*R*R;
    }

    @Override
    public double tinhChuVi() {
        return 3.14*2*R;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "R=" + R + '}' +"Dien tich "+tinhDienTich() + "Chu vi" + tinhChuVi();
    }
    
}
