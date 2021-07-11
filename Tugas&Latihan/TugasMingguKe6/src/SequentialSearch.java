/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class SequentialSearch {
    
    public static void main (String [] args){
    
    int [] exampleVariableOne = {2, 9, 6, 7, 4, 5, 3, 0, 1};
    int target = 1;
    sequentialSearch(exampleVariableOne, target);
    }
    
    public static void sequentialSearch(int [] parameterOne, int parameterTwo){
        int index = -1;
        //search each index of the array until it reaches the last index
        for (int i = 0; i < parameterOne.length; i++){
        if (parameterOne[i] == parameterTwo){
        //if the targett is found, int index is set as the value of i and the for loop iz terminated
        index = i;
        break;
            }
        }
        if (index == -1){
            System.out.println("Your target integer does not exist in the array");
        } else {
            System.out.println("Your target integer is im index " + index + " of the array");
        }
    }
    
}
