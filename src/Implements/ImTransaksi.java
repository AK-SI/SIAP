/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Entity.Transaksi;
import Interfaces.ITransaksi;
import Koneksi.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author su
 */
public class ImTransaksi implements ITransaksi{
    private String query;
    private KoneksiDB koneksi;
    private boolean status;
    private ResultSet rsTransaksi, rsGenID;
    private List<Transaksi> listTransaksi;
    
    public ImTransaksi(){
        koneksi = new KoneksiDB();
        koneksi.getKoneksi();
    }
    @Override
    public boolean insertTransaksi(Transaksi t) {
        status= false;
        query = "insert into transaksi values('" +
                t.getIdTransaksi() + "','" +
                t.getIdPelanggan() + "','" +
                t.getTanggal() + "','" +
                t.getTotalBayar() + "')";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public boolean insertDetailTransaksi(Transaksi t) {
        status= false;
        query = "insert into det_transaksi values('" +
                t.getIdTransaksi() + "','" +
                t.getIdObat() + "','" +
                t.getJumlah() + "','" +
                t.getTotalHarga() + "')";
        status = koneksi.eksekusiQuery(query, false);
        return status;
    }

    @Override
    public List selectTransaksi() {
        query="select id_transaksi, nama, tanggal, total_bayar from transaksi inner join pelanggan" +
            " on transaksi.id_pelanggan = pelanggan.id_pelanggan limit 50";
        status = koneksi.eksekusiQuery(query, true);
        if (status) {   
            rsTransaksi = koneksi.getRs();
            listTransaksi = new ArrayList<>();
            try{
                while(rsTransaksi.next()){
                    Transaksi t= new Transaksi();
                    t.setIdTransaksi(rsTransaksi.getString("id_transaksi"));
                    t.setIdPelanggan(rsTransaksi.getString("nama"));
                    t.setTanggal(rsTransaksi.getString("tanggal"));
                    t.setTotalBayar(rsTransaksi.getInt("total_bayar"));
                    listTransaksi.add(t);
                }
                rsTransaksi.close();
                return listTransaksi;
            } catch (SQLException ex) {
                Logger.getLogger(ImTransaksi.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return null;
    }
    
    @Override
    public String generateIDTransaksi() {
        String id="";
        int angka =0;
        query = "select max(right(id_transaksi, 7)) as id from transaksi";
        status = koneksi.eksekusiQuery(query, true);
        if (status) {
            rsGenID = koneksi.getRs();
            try{
                rsGenID.next();
                angka = rsGenID.getInt("id") + 1;
                if (angka <= 9 ) {
                    id = "AT000000" + (angka); 
                }
                else if (angka > 9 && angka < 100 ) {
                    id="AT00000"+ (angka);
                }
                else if (angka > 99 && angka < 1000 ) {
                    id="AT0000"+ (angka);
                }
                else if (angka > 999 && angka < 10000 ) {
                    id="AT000"+ (angka);
                }
                else if (angka > 9999 && angka < 100000 ) {
                    id="AT00"+ (angka);
                }
                else if (angka > 99999 && angka < 1000000 ) {
                    id="AT0"+ (angka);
                } else{
                    id="AT"+(angka);
                }
                
            } catch (SQLException ex) {
                System.out.println("Failed Generate id :" + ex);
                return null;
            }
        }
        return id;
    }
}
