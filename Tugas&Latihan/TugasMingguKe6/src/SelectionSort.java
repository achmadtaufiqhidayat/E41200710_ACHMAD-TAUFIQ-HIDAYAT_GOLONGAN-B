/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = { 59, 12 ,65, 2, 32};
        
        System.out.println("Sebelum disorting : ");
            for (int l = 0; l < arr.length; l++){
                System.out.print(arr[l] + " ");
            }
            System.out.println("");
        
      SelectionSort sSelection = new SelectionSort();   
      sSelection.sort(arr);
      sSelection.printArr(arr);
      
        
    }
    
    
    void sort(int [] arr){        
        for (int i = 0; i < arr.length - 1; i++){
            int min_idx = i;
            for(int j = min_idx + 1; j < arr.length; j++){
                System.out.println("A : " + arr[j] + " < " + " B : " + arr[min_idx]);
                if(arr[j] < arr[min_idx]){
                min_idx = j;
                }
            }
            //swap disini
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        
    }
    
    void printArr(int [] arr){

        System.out.println("Sesudah disorting : ");
        for (int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

 
    
}
