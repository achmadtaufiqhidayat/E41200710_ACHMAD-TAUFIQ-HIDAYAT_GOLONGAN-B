/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import java.util.*;
public class TugasA {
    public static void main(String[] args) {
       
        System.out.println("Program Menampilkan Angka Genap Dengan Batas Awal dan Batas Akhir diinput Oleh User");
        System.out.println("=============================================================================");
        
        
        Scanner inputKu= new Scanner(System.in);
        System.out.print("Masukkan Nilai awal : ");
        int nAwal = inputKu.nextInt();
        System.out.print("Masukan Nilai Batas Akhir : ");
        int nAkhir = inputKu.nextInt();
        /*
        nantinya nilai akhir tidak akan tampil
        karena itu merupakan batas  di akhir.
        bisa saja ditampilkan dengan mengganti tanda "<" pada perulangan for 
        menjadi "<="
        */
        for (int q = nAwal; q < nAkhir; q++ ){
        if (q % 2 == 0){
            System.out.println("Bilangan genap : " + q);
        }
        
        }
    }
}
