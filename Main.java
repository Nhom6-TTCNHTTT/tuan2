/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/* H?nh vuông, h?nh ch? nh?t hay h?nh tr?n là các h?nh ph?ng ðý?c mô t? thông qua 
các thu?c tính riêng nhýng ð?u tính ðý?c chu vi và di?n tích. V?y h?nh ph?ng nói
chung có tính ðý?c chu vi và di?n tích không.
Yêu c?u:
Cài ð?t l?p H?nh ph?ng, h?nh vuông, h?nh ch? nh?t và h?nh tr?n sao cho bài toán
ðý?c th?c hi?n ð?m b?o tính hý?ng ð?i tý?ng (chú ? tính ðóng gói và s? d?ng l?i sao
cho t?i ýu). Minh h?a t?o vài ð?i tý?ng h?nh ph?ng nhýng l?i c? th? hóa t?ng l?p c?
th? ð? th?c hi?n nh?p và in thông tin c?a m?nh.
*/

package HinhPhang;
/**
 *
 * @author Admin
 */
public class Main {
     public static void main(String[] args) {
         HinhChuNhat a = new HinhChuNhat(3,4);
         System.out.println("Di?n tích " + a.tinhDienTich() + "Chu vi " + a.tinhChuVi());
         HinhTron b = new HinhTron(3.5);
         System.out.println("Di?n tích " + b.tinhDienTich() + "Chu vi " + b.tinhChuVi());
     }
}
