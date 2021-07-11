/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasDariBKPM.tugasC;

/**
 *
 * @author asus
 */
public class Animal {
     public void makeNoise(){
        System.out.println("Talk");
    }
}

class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Bark");
    }
	  public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        
        Animal animaldog = new Dog();
        animaldog.makeNoise();
        
        
        if (animal instanceof Animal)
            System.out.println("animal is an Animal");
        if (dog instanceof Animal)
            System.out.println("Dog is an Animal");
        if (animaldog instanceof Animal)
            System.out.println("animaldog is an Animal");
        if (animal instanceof Dog)
            System.out.println("animal is a Dog");
    }
}
