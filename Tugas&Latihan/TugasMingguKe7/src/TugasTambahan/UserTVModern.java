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
public class UserTVModern {
    public static void main(String[] args) {
        TVModern tv = new TVModern ("TV Modern, 29 inches", 100);
         String [] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
        "METRO TV", "TRANS TV", " TPI", "TV 7", 
        " TVRI", "TV G", "ANTV"};
         
         System.out.println("Taufiq, membeli Televisi baru : " + tv.getDeskripsi());
         
         
         tv.getChannels();
         tv.setChannels(semuaChannel);
         
         tv.setChannelAktif(3);
         tv.setVolume(10);
         tv.setChannelAktif(10);
         tv.setChannelAktif(1);
         tv.setModTampilan(TVModern.Teletext);
         tv.settampTeletext(250);
         tv.setModTampilan(TVModern.TV);
         tv.playCD();
         tv.setDiskTray("The Matrix");
         tv.playCD();
    }
}
