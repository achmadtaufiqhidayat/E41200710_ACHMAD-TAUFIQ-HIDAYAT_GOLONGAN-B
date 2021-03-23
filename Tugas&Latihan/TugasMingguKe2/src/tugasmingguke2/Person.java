/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmingguke2;

/**
 *
 * @author asus
 */
public class Person {
    String fName, lName, stuStatus;
    int stuId;
  
    public Person(String fName, String lName, String stuStatus, int stuId){
    this.fName = fName;
    this.lName = lName;
    this.stuStatus = stuStatus;
    this.stuId = stuId;
    }


    public static void main(String[] args) {
    Person student = new Person("Lisa " , "Palombo", "Active",123456789);
        //Mencetak variabel yang yang sudah dideklarasikan
        System.out.println("Student Name\t : " + student.fName +""+ student.lName);
        System.out.println("Student ID\t : " + student.stuId);
        System.out.println("Student Status\t : " + student.stuStatus);

}
}


