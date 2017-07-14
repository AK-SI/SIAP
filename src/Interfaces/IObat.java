/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Obat;
import java.util.List;

/**
 *
 * @author su
 */
public interface IObat {
    boolean insertObat(Obat obat);
    boolean updateObat(Obat obat);
    boolean deleteObat(String id);
    List selectObat(String kode, String nama);
    String generateIDObat();
}
