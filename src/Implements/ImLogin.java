/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Entity.Login;
import Interfaces.ILogin;
import Koneksi.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author su
 */
public class ImLogin implements ILogin{
    private String query;
    private KoneksiDB koneksi;
    private boolean status;
    private ResultSet rsLogin;
    private List<Login> listLogin;
    
    public ImLogin(){
        koneksi = new KoneksiDB();
        koneksi.getKoneksi();
    }

    @Override
    public boolean insertLogin(Login login) {
        status = false;
        query="insert into login_karyawan values('"+
                login.getUsername() + "','"+
                login.getAkses()+ "','"+
                login.getPassword()+ "')";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean updateLogin(Login login) {
        status = false;
        query = "update login_karyawan set password='" + login.getPassword() +
                "', akses='" + login.getAkses() +
                "' where nik='" + 
                login.getUsername() + "'";
        status =  koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean deleteLogin(String username, String password) {
        status = false;
        query= "delete from login_karyawan where nik='" +
                username + "' and password='"+password+"'";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public List selectLogin(String username, String password) {
        query="select * from login_karyawan where nik='" +
                username + "' and password='" + password + "'";
        status =koneksi.eksekusiQuery(query, true);
        if (status) {
            rsLogin = koneksi.getRs();
            listLogin = new ArrayList<>();
            try{
                while(rsLogin.next()){
                    Login l = new Login(
                            rsLogin.getString("nik"),
                            rsLogin.getString("password"),
                            rsLogin.getString("akses")
                    );
                    listLogin.add(l);
                }
                rsLogin.close();
                return listLogin;
            } catch (SQLException ex) {
                System.out.println("Err(Select Login) :" + ex);
                return null;
            }
        }
        return null;
    }


}
