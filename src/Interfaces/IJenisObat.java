/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.JenisObat;
import java.util.List;

/**
 *
 * @author su
 */
public interface IJenisObat {
    boolean insertJenisObat(JenisObat jo);
    boolean updateJenisObat(JenisObat jo);
    boolean deleteJenisObat(String id);
    List selectJenisObat(String kode, String jenis);
    String generateIDJenisObat();
}
