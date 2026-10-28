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
public class T1 {
           public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int thn;
    
        System.out.print("Masukkan tahun (1909 - 2024) : ");
        thn = input.nextInt();
        
        if (thn>=1909 && thn<=2024) {
            if (thn%4==0 && thn%100!=0 || thn%400==0) {
                System.out.println(thn + " adalah tahun kabisat");
            } else {
                System.out.println(thn + " bukan tahun kabisat");
            }
        }else{
            System.out.println("Tidak termasuk ke rentang tahun yang diberikan");
        }
    }
}


