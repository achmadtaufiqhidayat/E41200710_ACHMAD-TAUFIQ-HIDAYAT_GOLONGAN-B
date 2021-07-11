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
class Televisi {//nama class
    private String deskripsi; //menyimpan deskripsi dari class televisi
    private int jmlChannel; //menampung banyaknya channel dari televisi
    private String[] channels = null; // menampung data dari channel sebelum di set
    private int channelAktif; // menyimpan channel yang aktif sekarang
    private int volume; // menyimpan informasi besaran volume satt ini
    
    
    public Televisi(String deskripsi, int jmlChannel){
    this.deskripsi = deskripsi;
    this.jmlChannel = jmlChannel;
    }
    
    public String getDeskripsi(){
    return deskripsi;
    }
    
    public int getjmlChannel (){
    return jmlChannel;
    }
    
    public String[] getChannels(){
    if (channels == null){
        System.out.println("Belum ada channel yang diset!");
        }
    return channels;
    }
    
    public void setChannels(String [] channels){
    if (channels.length > jmlChannel){
        System.out.println("Maaf Tv ini hanya dapat menampung " + jmlChannel + " channel");
    } else {
        this.channels = channels;
        System.out.println("Channel sukses diupdate!");
        }
    }
    
    public int getChannelAktif(){
    return channelAktif;
    }
    
    public void setChannelAktif(int channelAktif){
    if (channelAktif > channels.length){
        System.out.println("Channel yang diinginkan belum diset!");
        return;
        }
    this.channelAktif = channelAktif;
        System.out.println("Pindah ke channel : " + channels[channelAktif]);
    }
    
    
    public int getVolume(){
    return volume;
    }
    
    public void setVolume (int volume){
    this.volume = volume;
        System.out.println("Volume TV anda : " + volume);
    }
    
    
}
