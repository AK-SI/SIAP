/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author su
 */
public class KoneksiDB {
    private Connection koneksi;
    private ResultSet rs;
    private PreparedStatement ps;
    private String[] setting;
    private static final Config CON = new Config();
    
    public Connection getKoneksi(){
        setting = CON.GetConfig();
        if (koneksi==null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try {
                    String url="jdbc:mysql://"+setting[0]+":"+setting[1]+"/"+setting[2];
                    koneksi = (Connection) DriverManager.getConnection(url,setting[3],setting[4]);
                    System.out.println("Koneksi Sukses");
                }catch(NullPointerException ex){
                    System.err.println(ex + " : 'File konfigurasi belum dibuat.'");
                }
                catch (SQLException ex) {
                    System.out.println("Koneksi Gagal" + ex);
                }
            } catch (ClassNotFoundException ex) {
                System.out.println("Class tidak ditemukan"+ex);
                System.exit(0);
            }
        }
        return koneksi;
    }
    
    public ResultSet getRs(){
        return rs;
    }
    
    public boolean eksekusiQuery(String query, boolean status){
        try {
            ps = (PreparedStatement) koneksi.prepareStatement(query);
            if (status) {
                rs = ps.executeQuery();
            }else{
                ps.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            System.err.println(ex+": Query Gagal");
            return false;
        }
    }
    
    public boolean buatDatabase(String url, String username, String password, String query){
        try {
            koneksi = (Connection) DriverManager.getConnection(url,username,password);
            ps = (PreparedStatement) koneksi.prepareStatement(query);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex+": Query Gagal");
            return false;
        }
    }
}
