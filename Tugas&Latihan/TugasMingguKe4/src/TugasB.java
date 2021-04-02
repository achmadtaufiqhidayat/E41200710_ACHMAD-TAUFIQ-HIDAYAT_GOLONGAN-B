/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class TugasB {
    public static void main(String[] args) {
        
        System.out.println("                Do-While                ");
        System.out.println("Menampilkan Kelipatan 2 Antara 1-100 ");
        System.out.println("========================================");
        
        //dekllarasi y
        int y = 1;
        int x = 100;
        //saya memberikan opsi lain untuk menampilkan output yang sama, yakni dengan menggunakan while.
        //jika ingin menggunakan while, maka aktifkan boolean dibawah ini terlebih dahulu
        //boolean kondisi = true;

        
        //memulai perulangan
      do{
        
        System.out.print(y + " ");
        
        y = y * 2;
        
        }while (y <= x);
        
         /*  while (kondisi){
            
            
            System.out.print(" " + y); 
            y*=2;
            if (y >= x){//ditambah percabangan
                kondisi = false;    
            }
        }*/
    }
}
