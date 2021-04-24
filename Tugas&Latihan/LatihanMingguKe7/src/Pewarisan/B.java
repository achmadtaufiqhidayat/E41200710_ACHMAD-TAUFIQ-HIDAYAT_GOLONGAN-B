/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author asus
 */
public class B extends A { //mendeklarasikan class b yang diturunkan dari class a
    int z;
    
    void TampilkanJumlah (){
    //subclass dapat mengakses meber dari superclass
        System.out.println("Jumlah : " + (x+y+z));
    }
    
}
