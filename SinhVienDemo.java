/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import static javaapplication2.SinhVienDemo.sv;

/**
 *
 * @author PC
 */
public class SinhVienDemo {

    static SinhVien sv = new SinhVien();

    static Mon monHoc[];

    static int n;

    static void Nhap() {
        Scanner s = new Scanner(System.in);
        sv.Nhap();

        System.out.println("Nhap so mon hoc n = ");
        n = s.nextInt();
        monHoc = new Mon[n];
        sv.diemThi = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap sinh vien thu " + (i + 1) + ": ");
            monHoc[i] = new Mon();
            monHoc[i].Nhap();
            System.out.println("nhap diem thi: ");
            sv.diemThi[i] = s.nextInt();
        }
    }

    static void Xuat() {
        sv.Xuat();
        for (int i = 0; i < n; i++) {
            monHoc[i].xuat();

            System.out.println(sv.diemThi[i]);
        }
    }

    static void SapXep() {
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (sv.diemThi[i] < sv.diemThi[j]) {
                    index = j;
                }

                float temp = sv.diemThi[index];
                sv.diemThi[index] = sv.diemThi[i];
                sv.diemThi[i] = temp;
                Mon m = monHoc[index];
                monHoc[index] = monHoc[i];
                monHoc[i] = m;

            }
        }
        Xuat();
    }

    public static void main(String[] args) {
        Nhap();
        Xuat();
        SapXep();
    }
}
