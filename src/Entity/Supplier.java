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
public class Supplier {
    private String id_supplier;
    private String nama;
    private String telepon;
    private String alamat;

    public Supplier(){}
    public Supplier(String id_supplier, String nama, String telpon, String alamat){
        this.id_supplier=id_supplier;
        this.nama=nama;
        this.telepon=telpon;
        this.alamat=alamat;
    }
    public String getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(String id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
