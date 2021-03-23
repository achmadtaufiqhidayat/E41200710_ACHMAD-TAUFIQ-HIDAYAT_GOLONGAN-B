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
public class kharismaAgungPlaza {
    public static void main(String[] args) {
        
        Scanner nP = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("                Kharisma Agung Plaza <KAP>                  ");
        System.out.println("                 Promo Belanja Berhadiah                    ");
        System.out.println("             Khusus Pembelian 5 Barang Pertama              ");
        System.out.println("              Dengan Harga Minum Rp 10000.00                ");
        System.out.println("------------------------------------------------------------");
        
        //pembeli
        System.out.print("Masukkan nama pembeli : ");
        String namaP = nP.nextLine();
        System.out.print("\n");
        

        //array bilangan
        int barangH[] =  new int[6];
         //membuat scanner
        Scanner hB = new Scanner(System.in);
       
        
           // perulangan / mengisi data ke array
        for (int p = 1; p < barangH.length; p ++){
        System.out.print("Masukkan harga barang ke- "            + p + ": ");
        barangH[p]= hB.nextInt();


     }
        //total harga
       int beli = 0 ;
       beli =barangH[0] + barangH[1] + barangH[2]+barangH[3] + barangH[4] + barangH[5];
       System.out.println("Total harga pembelian atas nama " +namaP + " adalah "+ " " + beli);
    
       //akan dapat mug jika
       if(beli >= 100000){
           System.out.print("Selamat....\n");
           System.out.println("Anda mendapat hadiah 1 mug cantik");
           System.out.println("");
       }else{
           System.out.println("Maaf, anda tidak mendapat hadiah karena belum memenuhi syarat minimum belanja");
       }
       System.out.println("                        Terima Kasih                        ");
       System.out.println("        Anda sudah belanja di Kharisma Agung Plaza          ");
       System.out.println("------------------------------------------------------------");

    }
    
}
