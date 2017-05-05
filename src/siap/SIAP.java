package siap;

import Koneksi.KoneksiDB;
import Views.DBSetting;
import Views.FrmMenu;
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author su
 */
public class SIAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBSetting setting = new DBSetting();
        File file = new File("config.prop");
        if (file.exists()) {
            KoneksiDB conn = new KoneksiDB();
            if (conn.getKoneksi() != null) {
                FrmMenu menu = new FrmMenu();
                menu.setVisible(true);
            }else{
                setting.setVisible(true);
            }   
        }else{
            setting.setVisible(true);
        }

    }
    
}
