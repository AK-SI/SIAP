/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Implements.*;
import Interfaces.*;

/**
 *
 * @author su
 */
public class Factory {
    private static IKaryawan  karyawanDAO;
    private static IPelanggan pelangganDAO;
    private static ISupplier supplierDAO;
    private static IJenisObat jenisObatDAO;
    private static IObat ObatDAO;
    private static ILogin loginDAO;

    public static ILogin getLoginDAO() {
        loginDAO=new ImLogin();
        return loginDAO;
    }

    public static IObat getObatDAO() {
        ObatDAO=new ImObat();
        return ObatDAO;
    }
    
    public static ISupplier getSupplierDAO() {
        supplierDAO = new ImSupplier();
        return supplierDAO;
    }
    
    public static IKaryawan getKaryawanDAO() {
        karyawanDAO = new ImKaryawan();
        return karyawanDAO;
    }

    public static IPelanggan getPelangganDAO() {
        pelangganDAO = new ImPelanggan();
        return pelangganDAO;
    }

    public static IJenisObat getJenisObatDAO() {
        jenisObatDAO = new ImJenisObat();
        return jenisObatDAO;
    }
}
