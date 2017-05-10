/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Entity.Obat;
import Interfaces.IObat;
import Koneksi.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author su
 */
public class ImObat implements IObat{
    private String query;
    private KoneksiDB koneksi;
    private boolean status;
    private ResultSet rsObat, rsGenID;
    private List<Obat> listObat;
    
    public ImObat(){
        koneksi = new KoneksiDB();
        koneksi.getKoneksi();
    }

    
    @Override
    public boolean insertObat(Obat obat) {
        status = false;
        query = "insert into obat values('" +
                obat.getId_obat() + "','" +
                obat.getNama_obat() + "','" +
                obat.getId_jenis() + "','" +
                obat.getId_supplier() + "','" +
                obat.getHarga_beli() + "','" +
                obat.getHarga_jual() + "','" +
                obat.getStok() + "')";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean updateObat(Obat obat) {
        status = false;
        query = "update obat set nama_obat='" + obat.getNama_obat() +
                "', id_jenis='" + obat.getId_jenis() +
                "', id_supplier='" + obat.getId_supplier() +
                "', harga_beli='" + obat.getHarga_beli() +
                "', harga_jual='" + obat.getHarga_jual() +
                "', stok='" + obat.getStok()+ 
                "' where id_obat='" + 
                obat.getId_obat() + "';";
        status =  koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean deleteObat(String id) {
        status = false;
        query= "delete from obat where id_obat='" +
                id + "'";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public List selectObat(String kode, String nama) {
        query="select * from obat where id_obat like '%" +
                kode + "%' or nama_obat like '%" + nama + "' order by id_obat ASC";
        status =koneksi.eksekusiQuery(query, true);
        if (status) {
            rsObat = koneksi.getRs();
            listObat = new ArrayList<>();
            try{
                while(rsObat.next()){
                    Obat obat = new Obat();
                    obat.setId_obat(rsObat.getString("id_obat"));
                    obat.setNama_obat(rsObat.getString("nama_obat"));
                    obat.setId_jenis(rsObat.getString("id_jenis"));
                    obat.setId_supplier(rsObat.getString("id_supplier"));
                    obat.setHarga_jual(rsObat.getString("harga_jual"));
                    obat.setHarga_beli(rsObat.getString("harga_beli"));
                    obat.setStok(rsObat.getString("stok"));
                    listObat.add(obat);
                }
                rsObat.close();
                return listObat;
            } catch (SQLException ex) {
                System.out.println("Err(Select Obat) :" + ex);
                return null;
            }
        }
        return null;
    }

    @Override
    public String generateIDObat() {
        String id="";
        int angka =0;
        query = "select max(right(id_obat, 5)) as id from obat";
        status = koneksi.eksekusiQuery(query, true);
        if (status) {
            rsGenID = koneksi.getRs();
            try{
                rsGenID.next();
                angka = rsGenID.getInt("id") +1;
                if (angka <= 9 ) {
                    id = "B0000" + (angka); 
                }
                else if (angka > 9 && angka < 100 ) {
                    id="B000"+ (angka);
                }
                else if (angka > 99 && angka < 1000 ) {
                    id="B00"+ (angka);
                }
                else if (angka > 999 && angka < 10000 ) {
                    id="B0"+ (angka);
                }
                else{
                    id="B"+(angka);
                }
                
            } catch (SQLException ex) {
                System.out.println("Failed Generate id :" + ex);
                return null;
            }
        }
        return id;
    }
    
}
