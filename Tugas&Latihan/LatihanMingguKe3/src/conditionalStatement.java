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
public class conditionalStatement {
    public static void main(String[] args) {
       //create scanner variable
        int nilai;
        String grade;
        Scanner scan =  new Scanner(System.in);
        // take input
        System.out.print(" Masukkan nilai : ");
        nilai = scan.nextInt();
        
        
        //menghitung kelasnya
    if(nilai >= 90){
       grade = "A";
    }else if(nilai >= 80){
       grade = "B+";
    }else if(nilai >= 70){
        grade = "B";
    }else if (nilai >= 60){
        grade = "C+";
    }else if (nilai >= 50){
        grade = "C";
    }else if(nilai >= 40){
        grade = "D";
    }else {
        grade = "E";
    }
//cetak hasilnya

        System.out.println(" Grade : " + grade);
}
}
