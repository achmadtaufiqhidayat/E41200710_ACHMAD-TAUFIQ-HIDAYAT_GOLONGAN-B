/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydb;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class MyDB {
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String dbURL = "jdbc : mysql: //localhost/workshop_ilnaa";
    String user = "lusi budianti";
    String pass = "lusi";
    
    Connection con;
    Statement stmt;
    ResultSet st;
    
    public static void main(String[] args) {
        MyDB myDB = new MyDB();
        myDB.koneksi();
    }
    
    public void koneksi (){
        try {
            Class.forName(jdbcDriver);
            System.out.println("Class sukses dipanggil");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Error");
        }
        
        
        try {
            con = (Connection) DriverManager.getConnection(dbURL,user,pass);
            System.out.println("Koneksi berhasil");
        } catch (SQLException ex) {
            System.out.println("Koneksi Error");
        }
        
    }
    
    
    
    
    
    
    
    
    
}
