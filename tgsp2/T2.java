/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tgsp2;

import java.util.Scanner;
/**
 *
 * @author OS
 */
public class T2 {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        T2 hitung = new T2();
        
        hitung.PPanj();
        hitung.Ling();
        hitung.waktu();
    }
    
    void PPanj(){
        float panjang=2, lebar=5, luas;
        luas = panjang*lebar;
        
        System.out.println("Luas Persegi Panjang = " + luas);
    }
    
    void Ling(){
        float jari, keliling, luas;
        final float pi=3.14f;
        
        System.out.print("Masukkan jari jari = ");
        jari = input.nextFloat();
        
        luas = pi*jari*jari;
        keliling = 2*pi*jari;
        
        System.out.println("Luas Lingkaran = " + luas);
        System.out.println("Keliling Lingkaran = " + keliling);
    }
    
    void waktu(){
        int jam, menit, detik, totdet;
        
        System.out.print("Jam = ");
        jam = input.nextInt();
        System.out.print("menit = ");
        menit = input.nextInt();
        System.out.print("detik = ");
        detik = input.nextInt();
        
        totdet = jam*3600+menit*60+detik;
        
        System.out.println("Total Detik = " + totdet);
    }
}