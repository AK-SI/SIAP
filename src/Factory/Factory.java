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
}
