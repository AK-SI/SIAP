/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;

import Koneksi.KoneksiDB;
import java.awt.HeadlessException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author RahmatSubekti
 */
public class ViewReport {
    public void obat(){
        try{
            KoneksiDB koneksi = new KoneksiDB();
            koneksi.getKoneksi();
            try{
                Map<String, Object> parameter = new HashMap<String, Object>();
                File rpt = new File("src/Reports/Obat.jrxml");
                JasperDesign jDesign = null;
                jDesign = (JasperDesign) JRXmlLoader.load(rpt);
                parameter.clear();
                JasperReport jReport = JasperCompileManager.compileReport(jDesign);
                JasperPrint jPrint = JasperFillManager.fillReport(jReport,
                        parameter,koneksi.getKoneksi());
                JasperViewer.viewReport(jPrint,false);
            }catch(JRException e){
                JOptionPane.showMessageDialog(null, "Laporan Tidak Ditemukan " + e);
            }
        }catch(HeadlessException e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    public void obatTerjual(){
        try{
            KoneksiDB koneksi = new KoneksiDB();
            koneksi.getKoneksi();
            try{
                Map<String, Object> parameter = new HashMap<String, Object>();
                File rpt = new File("src/Reports/ObatTerjual.jrxml");
                JasperDesign jDesign = null;
                jDesign = (JasperDesign) JRXmlLoader.load(rpt);
                parameter.clear();
                JasperReport jReport = JasperCompileManager.compileReport(jDesign);
                JasperPrint jPrint = JasperFillManager.fillReport(jReport,
                        parameter,koneksi.getKoneksi());
                JasperViewer.viewReport(jPrint,false);
            }catch(JRException e){
                JOptionPane.showMessageDialog(null, "Laporan Tidak Ditemukan " + e);
            }
        }catch(HeadlessException e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    public void pelanggan(){
        try{
            KoneksiDB koneksi = new KoneksiDB();
            koneksi.getKoneksi();
            try{
                Map<String, Object> parameter = new HashMap<String, Object>();
                File rpt = new File("src/Reports/Pelanggan.jrxml");
                JasperDesign jDesign = null;
                jDesign = (JasperDesign) JRXmlLoader.load(rpt);
                parameter.clear();
                JasperReport jReport = JasperCompileManager.compileReport(jDesign);
                JasperPrint jPrint = JasperFillManager.fillReport(jReport,
                        parameter,koneksi.getKoneksi());
                JasperViewer.viewReport(jPrint,false);
            }catch(JRException e){
                JOptionPane.showMessageDialog(null, "Laporan Tidak Ditemukan " + e);
            }
        }catch(HeadlessException e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    public void pelangganAktif(){
        try{
            KoneksiDB koneksi = new KoneksiDB();
            koneksi.getKoneksi();
            try{
                Map<String, Object> parameter = new HashMap<String, Object>();
                File rpt = new File("src/Reports/PelangganAktif.jrxml");
                JasperDesign jDesign = null;
                jDesign = (JasperDesign) JRXmlLoader.load(rpt);
                parameter.clear();
                JasperReport jReport = JasperCompileManager.compileReport(jDesign);
                JasperPrint jPrint = JasperFillManager.fillReport(jReport,
                        parameter,koneksi.getKoneksi());
                JasperViewer.viewReport(jPrint,false);
            }catch(JRException e){
                JOptionPane.showMessageDialog(null, "Laporan Tidak Ditemukan " + e);
            }
        }catch(HeadlessException e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    public void transaksi(){
        try{
            KoneksiDB koneksi = new KoneksiDB();
            koneksi.getKoneksi();
            try{
                Map<String, Object> parameter = new HashMap<String, Object>();
                File rpt = new File("src/Reports/Transaksi.jrxml");
                JasperDesign jDesign = null;
                jDesign = (JasperDesign) JRXmlLoader.load(rpt);
                parameter.clear();
                JasperReport jReport = JasperCompileManager.compileReport(jDesign);
                JasperPrint jPrint = JasperFillManager.fillReport(jReport,
                        parameter,koneksi.getKoneksi());
                JasperViewer.viewReport(jPrint,false);
            }catch(JRException e){
                JOptionPane.showMessageDialog(null, "Laporan Tidak Ditemukan " + e);
            }
        }catch(HeadlessException e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
        
    public void transaksiPerbulan(){
        try{
            KoneksiDB koneksi = new KoneksiDB();
            koneksi.getKoneksi();
            try{
                Map<String, Object> parameter = new HashMap<String, Object>();
                File rpt = new File("src/Reports/TransaksiPerbulan.jrxml");
                JasperDesign jDesign = null;
                jDesign = (JasperDesign) JRXmlLoader.load(rpt);
                parameter.clear();
                JasperReport jReport = JasperCompileManager.compileReport(jDesign);
                JasperPrint jPrint = JasperFillManager.fillReport(jReport,
                        parameter,koneksi.getKoneksi());
                JasperViewer.viewReport(jPrint,false);
            }catch(JRException e){
                JOptionPane.showMessageDialog(null, "Laporan Tidak Ditemukan " + e);
            }
        }catch(HeadlessException e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
}
