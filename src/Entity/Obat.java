/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author su
 */
public class Obat {
    private String id_obat;
    private String nama_obat;
    private String id_jenis;
    private String id_supplier;
    private int harga_beli;
    private int harga_jual;
    private int stok;
    public Obat(){}
    public Obat(String id_obat, String nama_obat, String id_jenis, String id_supplier,
    int harga_beli, int harga_jual, int stok){
        this.id_obat=id_obat;
        this.nama_obat=nama_obat;
        this.id_supplier=id_supplier;
        this.id_jenis=id_jenis;
        this.harga_beli=harga_beli;
        this.harga_jual=harga_jual;
        this.stok=stok;
    }

    public String getId_obat() {
        return id_obat;
    }

    public void setId_obat(String id_obat) {
        this.id_obat = id_obat;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public String getId_jenis() {
        return id_jenis;
    }

    public void setId_jenis(String id_jenis) {
        this.id_jenis = id_jenis;
    }

    public String getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(String id_supplier) {
        this.id_supplier = id_supplier;
    }

    public int getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(int harga_beli) {
        this.harga_beli = harga_beli;
    }

    public int getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(int harga_jual) {
        this.harga_jual = harga_jual;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

}
