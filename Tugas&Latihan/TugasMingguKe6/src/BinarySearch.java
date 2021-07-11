/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class BinarySearch {
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
                        System.out.println("Sebuah array : ");
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " " );
            
        }
        System.out.println("");
        
        BinarySearch binSearch = new BinarySearch();
        int result = binSearch.bSearch(arr, 0, arr.length - 1, 6);
        
        System.out.println("Angka berada pada indeks ke : " + result);
        
        

    }
    
    int bSearch(int arr [],int left, int right, int search){
        
        
        if (right >= left){
            int aTengah = left + (right - left) / 2;
            
            System.out.println("Ini adalah angka tengah (intervval) yang dilalui : " + arr[aTengah]);
            
            if (arr[aTengah] == search){
                return aTengah;
            }
            if (search > arr[aTengah]){
                return bSearch(arr, aTengah +1, right, search);
            }
            
            return bSearch(arr, left, aTengah - 1, search);
        
        }
        
        return -1;
    }
}
