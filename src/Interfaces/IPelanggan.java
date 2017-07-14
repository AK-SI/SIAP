/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Pelanggan;
import java.util.List;

/**
 *
 * @author su
 */
public interface IPelanggan {
    boolean insertPelanggan(Pelanggan pl);
    boolean updatePelanggan(Pelanggan pl);
    boolean deletePelanggan(String id);
    List selectPelanggan(String id, String nama);
    String generateIDPelanggan();
}
