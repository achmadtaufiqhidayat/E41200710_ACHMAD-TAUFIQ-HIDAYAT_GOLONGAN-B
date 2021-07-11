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
public class cafeCeria {
    public static void main(String[] args) {
       //nama kafe
        
        System.out.println("                    CAFE CERIA                  ");
        System.out.println("                   ANEKA MINUMAN                ");
        System.out.println("------------------------------------------------");
        System.out.println(" ");
        
        //daftar menu yang menggunakan string dan int dalam bentuk array
        System.out.println("                   SPECIAL MENU                 ");
        
        String minuman[] = {"Soft Drink", "Mix Juice", "Nescafe", "Soda Milk", "Tea"};
        int list[] = {1,2,3,4};
        System.out.println("                  " + list[0]  + ". " + minuman[0]);
        System.out.println("                  " + list[1]  + ". " + minuman[1]);
        System.out.println("                  " + list[2]  + ". " + minuman[2]);
        System.out.println("                  " + list[3]  + ". " + minuman[3]);
        System.out.println("------------------------------------------------");
        // masukan nama pembeli
        String nama;
        Scanner namaU = new Scanner(System.in);
        System.out.print("Masukkan nama pembeli :");
        nama = namaU.next();
        
        //memasukkan pilihan
        int input;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Silahkan masukkan pilihan anda : ");
        input = inputUser.nextInt();
        
      switch(input){
          case 1:
              System.out.println("Minuman yang anda pesan adalah " + minuman[0]);
              System.out.println("Pesanan anda akan segera kami antar");
              System.out.println("Terimakasih " + nama + " telah berkunjung di CAFE CERIA");
              break;
          case 2:
              System.out.println("Minuman yang anda pesan adalah " + minuman[1]);
              System.out.println("Pesanan anda akan segera kami antar");
              System.out.println("Terimakasih " + nama + " telah berkunjung di CAFE CERIA");
              break;
          case 3:
              System.out.println("Minuman yang anda pesan adalah " + minuman[2]);
              System.out.println("Pesanan anda akan segera kami antar");
              System.out.println("Terimakasih " + nama + " telah berkunjung di CAFE CERIA");
              break;
          case 4:
              System.out.println("Minuman yang anda pesan adalah " + minuman[3]);
              System.out.println("Pesanan anda akan segera kami antar");
              System.out.println("Terimakasih " + nama + " telah berkunjung di CAFE CERIA");
              break;
          default:
              System.out.println("Maaf data yang anda masukkan salah,silahkna masukkan data yang valid");
              break;
       }
        
      
  }
}
