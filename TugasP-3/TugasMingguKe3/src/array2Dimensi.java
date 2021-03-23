/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class array2Dimensi {
    public static void main(String[] args) {
        
        
        int arrayKu [] [] = {
            {5, 6, 1, 7},
            {8, 1, 2, 9,},
            {5, 4, 7, 1},
            {8, 3, 7, 5}
        }; 
        
        
        // for
        
        for (int bar = 0; bar < 4; bar++){
            for(int kol = 0; kol < 4; kol++){
                System.out.print(arrayKu[bar][kol]+" ");
            }
        
            System.out.println(" ");
        }
    }
}
