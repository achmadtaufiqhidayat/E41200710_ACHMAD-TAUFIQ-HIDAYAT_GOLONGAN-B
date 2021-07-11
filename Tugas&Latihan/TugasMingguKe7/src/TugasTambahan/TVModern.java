/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTambahan;

/**
 *
 * @author asus
 */
public class TVModern  extends Televisi{ //turunan dari televisi
    public static final int TV = 0;
    //teletext
    public static final int Teletext = 1;
    int modTampilan = TV;
    int tampTeletext = 100;
    String diskTray = null;
    public TVModern (String deskripsi, int jmlChannel){
    super(deskripsi, jmlChannel);
    }
    
    public void settampTeletext (int tampTeletext){
    this.tampTeletext = tampTeletext;
        System.out.println("Move to Teletext " + tampTeletext);
    }
    
    public void setModTampilan (int modTampilan){
    switch (modTampilan){
        case TV:
            System.out.println("Modus tampilan : Televisi");
            break;
        case Teletext:
            System.out.println("Modus tampilan : Teletext");
            break;
    }
    }
    
    //cd player built yang digunakan memutar video
    public String getDiskTray(){
    return diskTray;
    }
    
    public void setDiskTray(String diskTray){
    this.diskTray = diskTray;
    }
    public void playCD(){
        if (diskTray == null){
            System.out.println("Tidak ada kaset CD dalam disktray!");
            return;
        }
        System.out.println("Memutar file dari " + diskTray);
    }
    //cd player built in yang dapat digunakan memutar vcd

   
}
