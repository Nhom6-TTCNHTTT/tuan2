/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/* H?nh vu�ng, h?nh ch? nh?t hay h?nh tr?n l� c�c h?nh ph?ng ��?c m� t? th�ng qua 
c�c thu?c t�nh ri�ng nh�ng �?u t�nh ��?c chu vi v� di?n t�ch. V?y h?nh ph?ng n�i
chung c� t�nh ��?c chu vi v� di?n t�ch kh�ng.
Y�u c?u:
C�i �?t l?p H?nh ph?ng, h?nh vu�ng, h?nh ch? nh?t v� h?nh tr?n sao cho b�i to�n
��?c th?c hi?n �?m b?o t�nh h�?ng �?i t�?ng (ch� ? t�nh ��ng g�i v� s? d?ng l?i sao
cho t?i �u). Minh h?a t?o v�i �?i t�?ng h?nh ph?ng nh�ng l?i c? th? h�a t?ng l?p c?
th? �? th?c hi?n nh?p v� in th�ng tin c?a m?nh.
*/

package HinhPhang;
/**
 *
 * @author Admin
 */
public class Main {
     public static void main(String[] args) {
         HinhChuNhat a = new HinhChuNhat(3,4);
         System.out.println("Di?n t�ch " + a.tinhDienTich() + "Chu vi " + a.tinhChuVi());
         HinhTron b = new HinhTron(3.5);
         System.out.println("Di?n t�ch " + b.tinhDienTich() + "Chu vi " + b.tinhChuVi());
     }
}
