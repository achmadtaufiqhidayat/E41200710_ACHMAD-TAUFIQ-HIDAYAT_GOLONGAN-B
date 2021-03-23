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
public class switcCaseStatement {
    public static void main(String[] args) {
      // membuat input scanner
      String lampu;
      Scanner warnaL = new Scanner(System.in);
      
      //mengambil mwarna masuakn lampu
      System.out.print(" Inputkan nama warna lampu : ");
      lampu = warnaL.nextLine();
      
      switch(lampu){
        case "merah":
        System.out.println("Lampu Merah, Berhenti");
        break;
        case "kuning":
        System.out.println("Lampu Kunig, harap hati-hati");
        break;
        case "hijau":
        System.out.println("Lampu Hijau, silahkan jalan");
        break;
        default:
        System.out.println("Warna lampu salah !!");
        break;
        }
    }
}
