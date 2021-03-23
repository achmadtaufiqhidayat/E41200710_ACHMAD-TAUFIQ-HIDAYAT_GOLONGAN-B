/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmingguke2;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class PraktekScanner {
    public static void main(String[] args) {
        // membuat scanner
     Scanner s1 = new Scanner(System.in);
     
     //Ambil input dari keyboar
     
        System.out.print("Masukkan Nilai 1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("Masukkan Nilai 2 =  ");
        int nilai2 = s1.nextInt();
        
        //hitung dan print
        int jumlah = nilai1 + nilai2;
        
        System.out.println("Jumlah = " + jumlah);
    }
}
