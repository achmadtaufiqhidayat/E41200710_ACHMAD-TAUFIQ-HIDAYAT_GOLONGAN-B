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
        System.out.println("Menampilkan Bilangan Genap Antara 1-100 ");
        System.out.println("========================================");
        
        //dekllarasi y
        int y = 1;
        int x = 100;
        System.out.print(y + " ");
        
        //memulai perulangan
        do{
        y*=2;
        System.out.print(y + " ");
        
        }while (y <= x);
    }
}
