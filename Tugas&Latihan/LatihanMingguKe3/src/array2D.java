/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class array2D {
    public static void main(String[] args) {
        int[][] angka = {{5,4,2,1,5},{9,6,5,7,8},{5,2,1,5,10}};
        for (int baris = 0; baris < 3; baris++){
            for(int kolom = 0; kolom < 5 ; kolom++){
            System.out.print(angka[baris][kolom]+" ");
            }
            System.out.println(" ");
        }
    }
}
