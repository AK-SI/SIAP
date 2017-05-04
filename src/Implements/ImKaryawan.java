/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Entity.Karyawan;
import Interfaces.IKaryawan;
import Koneksi.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author su
 */
public class ImKaryawan implements IKaryawan{
    private String query;
    private KoneksiDB koneksi;
    private boolean status;
    private ResultSet rsKaryawan, rsGenID;
    private List<Karyawan> listKaryawan;
    
    public ImKaryawan(){
        koneksi = new KoneksiDB();
        koneksi.getKoneksi();
    }
    
    @Override
    public boolean insertKaryawan(Karyawan kr) {
        status = false;
        query = "insert into karyawan values ('" + kr.getNik() + "','"
                + kr.getNama() +"','"
                + kr.getTelpon() +"','"
                + kr.getAlamat() +"','"
                + kr.getJabatan() +"')";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean updateKaryawan(Karyawan kr) {
        status = false;
        query = "update karyawan set nama='" + kr.getNama() 
                + "', telpon='" + kr.getTelpon()
                + "', alamat='" + kr.getAlamat()
                + "', jabatan='" + kr.getJabatan()
                + "' where nik='" + kr.getNik() + "';";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean deleteKaryawan(String nik) {
        status=false;
        query = "delete from karyawan where nik='" + nik +"';";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public List selectKaryawan(String kode, String nama) {
        query="select * from karyawan where nik like '%" + kode +
                "%' or nama like '%" + nama +
                "%' order by nik ASC";
        status = koneksi.eksekusiQuery(query, true);
        if (status) {
            rsKaryawan = koneksi.getRs();
            listKaryawan=new ArrayList<>();
            try{
                while(rsKaryawan.next()){
                    Karyawan k = new Karyawan();
                    k.setNik(rsKaryawan.getString("nik"));
                    k.setNama(rsKaryawan.getString("nama"));
                    k.setTelpon(rsKaryawan.getString("telpon"));
                    k.setAlamat(rsKaryawan.getString("alamat"));
                    k.setJabatan(rsKaryawan.getString("jabatan"));
                    listKaryawan.add(k);
                }
                rsKaryawan.close();
                return listKaryawan;
            } catch (SQLException ex) {
                System.out.println("Select Karyawan : " + ex);
                return null;
            }
        }
        return null;
    }

    @Override
    public String generateIDKaryawan() {
        String id="";
        int angka=0;
        query="select max(right(nik,6)) as id from karyawan";
        status = koneksi.eksekusiQuery(query, true);
        if (status) {
            rsGenID = koneksi.getRs();
            try{
                rsGenID.next();
                angka = rsGenID.getInt("id")+1;
                if (angka <= 9 ) {
                    id = "N00000" + (angka); 
                }
                else if (angka > 9 && angka < 100 ) {
                    id="N0000"+ (angka);
                }
                else if (angka > 99 && angka < 1000 ) {
                    id="N000"+ (angka);
                }
                else if (angka > 999 && angka < 10000 ) {
                    id="N00"+ (angka);
                }
                else if (angka > 9999 && angka < 100000 ) {
                    id="N0"+ (angka);
                } else{
                    id="N"+(angka);
                }
            } catch (SQLException ex) {
                System.out.println("Failed Generate id :" + ex);
                return null;
            }
        }
        return id;
    }
    
}
