/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Entity.Supplier;
import Interfaces.ISupplier;
import Koneksi.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author su
 */
public class ImSupplier implements ISupplier{
    private String query;
    private KoneksiDB koneksi;
    private boolean status;
    private ResultSet rsSupplier, rsGenID;
    private List<Supplier> listSupplier;
    
    public ImSupplier(){
        koneksi = new KoneksiDB();
        koneksi.getKoneksi();
    }

    @Override
    public boolean insertSupplier(Supplier sp) {
        status = false;
        query = "insert into supplier values('"+
                sp.getId_supplier() + "','" +
                sp.getNama() + "','" +
                sp.getTelepon() + "','" +
                sp.getAlamat() + "')";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean updateSupplier(Supplier sp) {
        status = false;
        query = "update karyawan set nama='" + sp.getNama() + 
                "', telpon='" + sp.getTelepon() + 
                "', alamat='" + sp.getAlamat() +
                "' where id_supplier='" + sp.getId_supplier() + "';";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean deleteSupplier(String id) {
        status =false;
        query = "delete from supplier where id_supplier='" + id + "'";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public List selectSupplier(String id, String nama) {
        query = "select * from supplier where id_supplier like '%" + id +
                "%' or nama like '%" + nama +
                "%' order by id_supplier ASC";
        status = koneksi.eksekusiQuery(query, true);
        if (status) {
            rsSupplier = koneksi.getRs();
            listSupplier = new ArrayList<>();
            try{
                while(rsSupplier.next()){
                    Supplier s = new Supplier();
                    s.setId_supplier(rsSupplier.getString("id_supplier"));
                    s.setNama(rsSupplier.getString("nama"));
                    s.setTelepon(rsSupplier.getString("telpon"));
                    s.setAlamat(rsSupplier.getString("alamat"));
                    listSupplier.add(s);
                }
                rsSupplier.close();
                return listSupplier;
            } catch (SQLException ex) {
                System.out.println("Err(select supplier) :" + ex );
                return null;
            }
        }
        return null;
    }

    @Override
    public String generateIDSupplier() {
        String id="";
        int angka =0;
        query = "select max(right(id_supplier, 5)) as id from supplier";
        status = koneksi.eksekusiQuery(query, true);
        if (status) {
            rsGenID = koneksi.getRs();
            try{
                rsGenID.next();
                angka = rsGenID.getInt("id") + 1;
                if (angka <= 9 ) {
                    id = "P0000" + (angka); 
                }
                else if (angka > 9 && angka < 100 ) {
                    id="P000"+ (angka);
                }
                else if (angka > 99 && angka < 1000 ) {
                    id="P00"+ (angka);
                }
                else if (angka > 999 && angka < 10000 ) {
                    id="P0"+ (angka);
                }
                else{
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
