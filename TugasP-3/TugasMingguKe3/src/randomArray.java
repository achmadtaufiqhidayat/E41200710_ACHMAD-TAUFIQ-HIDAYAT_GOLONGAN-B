/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */import java.util.*;
public class randomArray {
    public static void main(String[] args) {
        
        //tugas No. 2
        
        Scanner pArray= new Scanner(System.in);
        System.out.print("Masukkan panjang array : ");
        int a = pArray.nextInt();
        
        int array []= new int[a];
        
        
        for (int i = 0; i < array.length; i++){
            System.out.print("Masukkan nilai array ke- " + (i+1) + ":");
            array [i] = pArray.nextInt();
            
            
        }
        System.out.println("Ini adalah array yang anda buat : ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        
        }
        System.out.println(" ");
    
    }
    
    
}
