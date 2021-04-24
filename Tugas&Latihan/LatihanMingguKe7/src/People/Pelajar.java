/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

/**
 *
 * @author asus
 */
public class Pelajar extends Orang{
    private String nim;
    private String asalSekolah;
    private double nilai; //range : 0-30
    
    public Pelajar(String nama, double tinggi, double berat,
    String nim, String asalSekolah, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.asalSekolah = asalSekolah;
        this.nilai = nilai;
    }


    
    
    public String toString(){
        return (super.toString() + "\nNIM : " +nim+ "\nSekolah : " +asalSekolah+ "\nNilai : " +nilai);
    }
    
}
