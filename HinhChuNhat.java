/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhPhang;

/**
 *
 * @author Admin
 */
public class HinhChuNhat extends HinhPhang {

    private int chieuDai, chieuRong;

    
    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    @Override
    public double tinhDienTich() {
       return chieuDai*chieuRong;
    }

    @Override
    public double tinhChuVi() {
       return (chieuDai+chieuRong)*2;
    }
    @Override
    public String toString() {
        return "HinhChuNhat{" + "chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + '}';
    }
    
}
