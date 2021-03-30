/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */

import java.util.Scanner;
public class TugasC {
    public static void main(String[] args) {
        
        // memberikan input nilai ( sebanyak kehendak user)
        Scanner myBilangan = new Scanner (System.in);
        System.out.print("Masukkan Banyaknya Data Nilai : ");
        int x = myBilangan.nextInt();
        //ini untuk membuat (menampung ) array
        int nilai [] = new int [x] ;
        
        
       
        //menghitung jumlah nilai unutk mencari rata-rata
        int result = 0;
        float rataR;
        
        
        //perulangan untuk menampilkan output sebanyakk panjang array
        for(int k = 0; k < nilai.length; k ++){
            System.out.print("Masukkan data Nilai ke-" + (k+1) + " = ");
            nilai[k] = myBilangan.nextInt();
            
            //menjumlahkan banyaknya array
           result += nilai[k];
        }
        System.out.println("");
        
        //menentukan minimum dan maksimum yang masih bernilai 0
        int max, min;
        max = nilai[0];
        min = nilai[0];
        
        //menentukan minimum dan maksimum
        for (int k = 0; k < nilai.length; k++){
        if (nilai[k] > max){
            max = nilai[k];
        }else if(nilai[k] < min){
            min = nilai[k];
            }   
        }
        //menentukan rata-rata
        rataR = result/x;
        
        //hasil operasi
        System.out.println("Nilai Minimum = " + min);
        System.out.println("Nilai Maximum = " + max);
        System.out.println("Nilai rata-ratanya adalah = " + rataR);
       
       
        
    }
}
