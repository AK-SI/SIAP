/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Karyawan;
import java.util.List;

/**
 *
 * @author su
 */
public interface IKaryawan {
    boolean insertKaryawan(Karyawan kr);
    boolean updateKaryawan(Karyawan kr);
    boolean deleteKaryawan(String nik);
    List selectKaryawan(String kode, String nama);
    String generateIDKaryawan();
}
