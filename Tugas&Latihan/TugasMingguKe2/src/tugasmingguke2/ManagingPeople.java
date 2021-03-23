/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmingguke2;
public class ManagingPeople {
    public static void main(String[] args) {
        
        person p1 = new person();
        p1.set("Arial", 37);
        person p2 = new person();
        p2.set("Joseph" ,15);
        
        
        if(p1.getAge() == p2.getAge()){
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        }else{
        System.out.println(p1.getName() + " is NOT same age as " + p2.getName());
        }
    }
}

class  person{
    String getName;
    int getAge;
    
    public void set (String getName, int getAge){
    this.getName = getName ;
    this.getAge = getAge;
    }
    
    public String getName(){
    return getName;
    }
    
    public int getAge(){
    return getAge;
    }

}




