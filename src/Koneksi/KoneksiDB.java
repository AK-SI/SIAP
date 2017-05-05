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
    
    public Connection getKoneksi(){
        if (koneksi==null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try {
                    String url="jdbc:mysql://bekti:3306/db_apotek";
                    koneksi = (Connection) DriverManager.getConnection(url,"root","");
                    System.out.println("Koneksi Sukses");
                } catch (SQLException ex) {
                    System.out.println("Koneksi Gagal" + ex);
                    System.exit(0);
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
            System.out.println("Query Gagal"+ex);
            return false;
        }
    }
}
