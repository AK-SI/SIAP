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

    public static IKaryawan getKaryawanDAO() {
        karyawanDAO = new ImKaryawan();
        return karyawanDAO;
    }
}
