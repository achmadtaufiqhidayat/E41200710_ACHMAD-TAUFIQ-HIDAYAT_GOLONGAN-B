/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmingguke2;

/**
 *
 * @author asus
 */
class Buku {
    int price;
    int page;
    
    
    public void set(int price, int page) {
        this.page = page;
        this.price = price;
    }
    
    public void show (){
    
        System.out.println("Book Information");
        System.out.println("Book Price : " + price);
        System.out.println("Number Of Pages : " + page);
    }

}
  public class book{
        public static void main(String[] args) {
            
            Buku javabook = new Buku();
            javabook.set(6000, 100);
            javabook.show();
        }
    }
