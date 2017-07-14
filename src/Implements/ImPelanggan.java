/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Entity.Pelanggan;
import Interfaces.IPelanggan;
import Koneksi.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author su
 */
public class ImPelanggan implements IPelanggan {
    private String query;
    private KoneksiDB koneksi;
    private boolean status;
    private ResultSet rsPelanggan, rsGenID;
    private List<Pelanggan> listPelanggan;
    
    public ImPelanggan(){
        koneksi = new KoneksiDB();
        koneksi.getKoneksi();
    }

    @Override
    public boolean insertPelanggan(Pelanggan pl) {
        status = false;
        query = "insert into pelanggan values('" +
                pl.getId_pelanggan() + "','" +
                pl.getNama() + "','" +
                pl.getTelpon() + "','" +
                pl.getAlamat() + "')";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean updatePelanggan(Pelanggan pl) {
        status = false;
        query = "update pelanggan set nama='" + pl.getNama() +
                "', telpon='" + pl.getTelpon() +
                "', alamat='" + pl.getTelpon() + 
                "' where id_pelanggan='" + 
                pl.getId_pelanggan() + "'";
        status =  koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean deletePelanggan(String id) {
        status = false;
        query= "delete from pelanggan where id_pelanggan='" +
                id + "'";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public List selectPelanggan(String id, String nama) {
        query="select * from pelanggan where id_pelanggan like '%" +
                id + "%' or nama like '%" + nama + "' order by id_pelanggan ASC";
        status =koneksi.eksekusiQuery(query, true);
        if (status) {
            rsPelanggan = koneksi.getRs();
            listPelanggan = new ArrayList<>();
            try{
                while(rsPelanggan.next()){
                    Pelanggan p = new Pelanggan(
                            rsPelanggan.getString("id_pelanggan"),
                            rsPelanggan.getString("nama"),
                            rsPelanggan.getString("telpon"),
                            rsPelanggan.getString("alamat")
                    );
                    listPelanggan.add(p);
                }
                rsPelanggan.close();
                return listPelanggan;
            } catch (SQLException ex) {
                System.out.println("Err(Select Pelanggan) :" + ex);
                return null;
            }
        }
        return null;
    }

    @Override
    public String generateIDPelanggan() {
        String id="";
        int angka =0;
        query = "select max(right(id_pelanggan, 7)) as id from pelanggan";
        status = koneksi.eksekusiQuery(query, true);
        if (status) {
            rsGenID = koneksi.getRs();
            try{
                rsGenID.next();
                angka = rsGenID.getInt("id") +1;
                if (angka <= 9 ) {
                    id = "P000000" + (angka); 
                }
                else if (angka > 9 && angka < 100 ) {
                    id="P00000"+ (angka);
                }
                else if (angka > 99 && angka < 1000 ) {
                    id="P0000"+ (angka);
                }
                else if (angka > 999 && angka < 10000 ) {
                    id="P000"+ (angka);
                }
                else if (angka > 9999 && angka < 100000 ) {
                    id="P00"+ (angka);
                }
                else if (angka > 99999 && angka < 1000000 ) {
                    id="P0"+ (angka);
                } else{
                    id="P"+(angka);
                }
                
            } catch (SQLException ex) {
                System.out.println("Failed Generate id :" + ex);
                return null;
            }
        }
        return id;
    }
    
}
