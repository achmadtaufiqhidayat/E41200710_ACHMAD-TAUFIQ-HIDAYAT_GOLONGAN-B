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
public class SelectionSearchOk {
    public static void main(String[] args) {

   
        //membuat objek scanner
        Scanner scan = new Scanner(System.in);
        
        //mendeklarasikan jumlah data
        System.out.print("Jumlah angka yang ingin disorting : ");
        int jum_dt = scan.nextInt();
        
        //memasukkan data 
        int[] angka = new int[jum_dt];
        System.out.println();
        for ( int a = 0; a < jum_dt; a++){
            System.out.print("Masukkan angka ke-" + (a+1) + " : ");
            angka[a] = scan.nextInt();
        }
        
        //data sebelum disorting
        System.out.println();
        System.out.print("Angka sebelum di sorting : ");
        for ( int a = 0; a < jum_dt; a++)
            System.out.print(angka[a] + " ");
        
        
        //proses selection sort
        System.out.println("\n\nProses Selection Sort");
        for (int a = 0; a < jum_dt-1; a++){
            System.out.println("Iterasi ke-" + (a+1) + " : ");
            for (int b = 0; b < jum_dt; b++)
                System.out.print(angka[b] + " ");
            System.out.println("    Apakah angka " + angka[a] + " sudah benar pada urutannya?");
            
            boolean tukar = false;
            int index = 0;
            int min = angka[a];
            String pesan = "    Tidak ada pertukaran";
            for(int b = a+1; b < jum_dt; b++){
                if (min > angka[b]){
                    tukar = true;
                    index = b;
                    min = angka[b];
                }
            }
            //pertukaran data (pindah posisi)
            if (tukar == true){
            pesan = "    Angka " + angka[a] + " ditukar dengan angka " + angka[index];
            int temp = angka[a];
                angka [a] = angka[index];
                angka[index] = temp;
            }
            for (int b = 0; b < jum_dt; b++)
               System.out.print(angka[b] + " ");
            System.out.println(pesan + "\n");
        }
        
        // data setelah di sorting
        System.out.print("Angka setelah disorting : ");
        for(int a = 0; a < jum_dt; a++)
            System.out.print(angka[a] + " ");
      
    }
}