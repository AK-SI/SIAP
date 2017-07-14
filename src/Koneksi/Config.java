/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import Views.DBSetting;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author su
 */
public class Config {
    public static Properties prop = new Properties();
    public void SetConfig(String host, String port, String db, String username, String password){
        try{
            prop.setProperty("host", host);
            prop.setProperty("port", port);
            prop.setProperty("database", db);
            prop.setProperty("username", username);
            prop.setProperty("password", password);
            prop.storeToXML(new FileOutputStream("config.prop"), null);
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String[] GetConfig(){
        String[] value= null;
        File file = new File("config.prop");
        if (file.exists()) {
            try{
                prop.loadFromXML(new FileInputStream("config.prop"));
                
                value = new String[]{
                    prop.getProperty("host"),
                    prop.getProperty("port"),
                    prop.getProperty("database"),
                    prop.getProperty("username"),
                    prop.getProperty("password")
                };
            } catch (IOException ex) {
                Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return value;
        }else{
            DBSetting setting = new DBSetting();
            setting.setVisible(true);
        }
        return null;
    }
}
