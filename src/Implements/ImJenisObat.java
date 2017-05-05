/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Entity.JenisObat;
import Interfaces.IJenisObat;
import Koneksi.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author su
 */
public class ImJenisObat implements IJenisObat{
    private String query;
    private KoneksiDB koneksi;
    private boolean status;
    private ResultSet rsJenisObat, rsGenID;
    private List<JenisObat> listJenisObat;
    
    public ImJenisObat(){
        koneksi = new KoneksiDB();
        koneksi.getKoneksi();
    }
    
    @Override
    public boolean insertJenisObat(JenisObat jo) {
        status = false;
        query = "insert into jenis_obat values('" +
                jo.getId_jenis() + "','" +
                jo.getJenis() + "','" +
                jo.getKeterangan()+ "');";
        status =  koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean updateJenisObat(JenisObat jo) {
        status = false;
        query = "update jenis_obat set jenis ='" + jo.getJenis() +
                "', keterangan='" + jo.getKeterangan() +
                "' where id_jenis='" + jo.getId_jenis() + "';";
        status = koneksi.eksekusiQuery(query, false);
        return status;
                
    }

    @Override
    public boolean deleteJenisObat(String id) {
        status = false;
        query = "delete from jenis_obat where id_jenis='" + id +"'";
        status= koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public List selectJenisObat(String kode, String jenis) {
        query = "select * from jenis_obat where id_pelanggan like'%" + kode +
                "%' or nama like '%"+ jenis+ "%'";
        status = koneksi.eksekusiQuery(query, true);
        if (status) {
            rsJenisObat = koneksi.getRs();
            listJenisObat = new ArrayList<>();
            try{
                while(rsJenisObat.next()){
                    JenisObat j = new JenisObat();
                    j.setId_jenis(rsJenisObat.getString("id_jenis"));
                    j.setJenis(rsJenisObat.getString("jenis"));
                    j.setKeterangan(rsJenisObat.getString("keterangan"));
                }
                rsJenisObat.close();
                return listJenisObat;
            } catch (SQLException ex) {
                System.out.println("Err(Select Jenis obat) :" + ex);
                return null;
            }
        }
        return null;
    }
    
    @Override
    public String generateIDJenisObat() {
        String id="";
        int angka =0;
        query = "select max(right(id_jenis, 4)) as id from jenis_obat";
        status = koneksi.eksekusiQuery(query, true);
        if (status) {
            rsGenID = koneksi.getRs();
            try{
                rsGenID.next();
                angka = rsGenID.getInt("id") +1;
                if (angka <= 9 ) {
                    id = "J000" + (angka); 
                }
                else if (angka > 9 && angka < 100 ) {
                    id="J00"+ (angka);
                }
                else if (angka > 99 && angka < 1000 ) {
                    id="J0"+ (angka);
                }else{
                    id="J"+(angka);
                }
                
            } catch (SQLException ex) {
                System.out.println("Failed Generate id :" + ex);
                return null;
            }
        }
        return id;
    }
}
