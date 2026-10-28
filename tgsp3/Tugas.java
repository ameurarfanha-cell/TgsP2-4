/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tgsp3;
import java.util.Scanner;
/**
 *
 * @author OS
 */
public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("   SISTEM PENGOLAHAN NILAI MAHASISWA   ");
        System.out.println("=======================================");
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = input.nextInt();
        char ulg = 'n';
        
        String npm[] = new String[n];
        String nama[] = new String[n];
        float NT[] = new float[n];
        float NUTS[] = new float[n];
        float NUAS[] = new float[n];
        float NA[] = new float[n];
        char nil[] = new char[n];
        String stat[] = new String[n]; 
        int lulus = 0, tidak = 0;
        float NTT=0, NTR=100, ttl=0;
        
        for(int i=0; i<n; i++){
            input.nextLine();
            System.out.println("\nData Mahasiswa ke-" + (i+1));
            System.out.println("=======================================");
            
            System.out.print("NPM          : "); npm[i]=input.nextLine();
            System.out.print("NAMA         : "); nama[i]=input.nextLine();
            
            do{
               System.out.print("Nilai Tugas  : "); NT[i]=input.nextFloat();
               System.out.print("Nilai UTS    : "); NUTS[i]=input.nextFloat();
               System.out.print("Nilai UAS    : "); NUAS[i]=input.nextFloat();
               
               if( NT[i] > 100 || NUTS[i] > 100 || NUAS[i] > 100
                    || NT[i] < 0 || NUTS[i] < 0 || NUAS[i] < 0){
                   System.out.println("Input Invalid, Ulangi \n");
                   ulg='y';
               }else{
                   ulg='n';
               }
            }while(ulg == 'y');
            
            NA[i] = hit(NT[i], NUTS[i], NUAS[i]);
            ttl += NA[i];
            
            if(NA[i] >= 80){
                nil[i] = 'A';
            }else if(NA[i] >= 70){
                nil[i] = 'B';
            }else if(NA[i] >= 60){
                nil[i] = 'C';
            }else if(NA[i] >= 50){
                nil[i] = 'D';
            }else{
                nil[i] = 'E';
            }
            
            if(NA[i] > 60){
                stat[i] = "LULUS";
            }else{
                stat[i] = "TIDAK LULUS";    
            }
            
            if (stat[i] == ("LULUS")) {
                lulus++;
            } else {
                tidak++;
            }
            
            if (i == 0) {
                NTT = NA[i];
                NTR = NA[i];
            } else {
                if (NA[i] > NTT) NTT = NA[i];
                if (NA[i] < NTR) NTR = NA[i];
            }
        }
        
        System.out.println("\n=========================================================================================");
        System.out.println("                               DAFTAR NILAI MAHASISWA");
        System.out.println("=========================================================================================");
        System.out.printf("%-4s %-12s %-12s %-6s %-6s %-6s %-6s %-6s %-12s\n", "No", "NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf", "Status");
        System.out.println("-----------------------------------------------------------------------------------------");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%-4d %-12s %-12s %-6.0f %-6.0f %-6.0f %-6.1f %-6s %-12s\n", 
                (i + 1), npm[i], nama[i], NT[i], NUTS[i], NUAS[i], NA[i], nil[i], stat[i]);
        }
        System.out.println("=========================================================================================\n");
        System.out.println("STATISTIK NILAI");
        System.out.println("-----------------------------------------");
        System.out.println("Jumlah Mahasiswa     : " + n);
        System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
        System.out.println("Jumlah Tidak Lulus   : " + tidak);
        System.out.println("Nilai Tertinggi      : " + NTT);
        System.out.println("Nilai Terendah       : " + NTR);
        System.out.printf("Rata-rata Kelas      : %.2f\n", (ttl / n));
        System.out.println("=========================================");
    }
    
    public static float hit(float tgs, float uts, float uas){
        return((tgs*0.3f)+(uts*0.3f)+(uas*0.4f));
    }
    
}