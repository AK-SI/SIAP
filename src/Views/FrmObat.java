/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Entity.Obat;
import Factory.Factory;
import Interfaces.IObat;
import Views.Cari.FrmCariJenisObat;
import Views.Cari.FrmCariSupplier;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author su
 */
public class FrmObat extends javax.swing.JFrame {
    private int baris;
    private boolean newRecord, needSave, status;
    private DefaultTableModel dtmObat;
    private String[] tableHeader;
    private IObat obatDAO;
    private List<Obat> listObat;
    private Obat ob;
    public String id_jenis, jenis, id_supplier, nama_supplier;
    /**
     * Creates new form FrmObat
     */
    public FrmObat() {
        initComponents();
        setLocationRelativeTo(this);
        obatDAO =  Factory.getObatDAO();
        tableHeader = new String[]{
            "ID",
            "Nama Obat",
            "ID Jenis",
            "ID Supplier",
            "Harga Jual",
            "Harga Beli",
            "Stok"
        };
        dtmObat = new DefaultTableModel(null, tableHeader);
        tableObat.setModel(dtmObat);
        tableObat.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                forgotSave();
                cmdDelete.setEnabled(true);
                baris = tableObat.getSelectedRow();
                if (baris>=0) {
                    txtId.setText(dtmObat.getValueAt(baris, 0).toString());
                    txtNama.setText(dtmObat.getValueAt(baris, 1).toString());
                    txtJenis.setText(dtmObat.getValueAt(baris, 2).toString());
                    txtSupplier.setText(dtmObat.getValueAt(baris, 3).toString());
                    id_jenis=dtmObat.getValueAt(baris, 2).toString();
                    id_supplier=dtmObat.getValueAt(baris, 3).toString();
                    txtJual.setText(dtmObat.getValueAt(baris, 4).toString());
                    txtBeli.setText(dtmObat.getValueAt(baris, 5).toString());
                    txtStok.setText(dtmObat.getValueAt(baris, 6).toString());
                }
            }
            
        });
        
        refreshTableObat();
        cmdDelete.setEnabled(false);
        cmdSave.setEnabled(false);
    }

    private void refreshTableObat(){
        listObat= obatDAO.selectObat(txtSearch.getText(),txtSearch.getText());
        dtmObat = (DefaultTableModel) tableObat.getModel();
        dtmObat.setRowCount(0);
        
       for (Obat data:listObat){
           dtmObat.addRow(new Object[]{
               data.getId_obat(),
               data.getNama_obat(),
               data.getId_jenis(),
               data.getId_supplier(),
               data.getHarga_jual(),
               data.getHarga_beli(),
               data.getStok()
           });
       }
        if (tableObat.getRowCount()>0) {
            baris = tableObat.getRowCount()-1;
            tableObat.setRowSelectionInterval(baris, baris);
        }
    }
    
    private void saveRecord(){
        ob = new Obat();
        ob.setId_obat(txtId.getText());
        ob.setNama_obat(txtNama.getText());
        ob.setId_jenis(id_jenis);
        ob.setId_supplier(id_supplier);
        ob.setHarga_jual(txtJual.getText());
        ob.setHarga_beli(txtBeli.getText());
        ob.setStok(txtStok.getText());
        
        if (newRecord) {
            status = obatDAO.insertObat(ob);
            newRecord=false;
        }else{
            status = obatDAO.updateObat(ob);
        }
        
        if (!status) {
            JOptionPane.showMessageDialog(null, "Data tidak tersimpan.", "Informasi",JOptionPane.INFORMATION_MESSAGE);
        }
        needSave=false;
        cmdSave.setEnabled(false);
        refreshTableObat();
    }
    
    private void clearText(){
        txtId.setText("");
        txtNama.setText("");
        txtSupplier.setText("");
        txtJenis.setText("");
        txtBeli.setText("");
        txtJual.setText("");
        txtStok.setText("");
        txtSearch.setText("");
        id_jenis ="";
        jenis="";
        id_supplier="";
        nama_supplier="";
    }
    
    private void forgotSave(){
        if (needSave) {
            if (JOptionPane.showConfirmDialog(null, "Data yang diubah belum disimpan. Simpan sekarang?",
                    "Simpan perubahan?", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
                saveRecord();
            }
        }
        needSave=false;
        newRecord=false;
    }
    
    private void recordChanged(){
        needSave=true;
        cmdSave.setEnabled(true);
        cmdDelete.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtJenis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSupplier = new javax.swing.JTextField();
        txtJual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBeli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        cmdGetJenis = new javax.swing.JButton();
        cmdGetSupplier = new javax.swing.JButton();
        cmdNew = new javax.swing.JButton();
        cmdSave = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableObat = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("ID Obat");

        txtId.setEditable(false);

        jLabel2.setText("Nama Obat");

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        jLabel3.setText("Jenis");

        txtJenis.setEditable(false);
        txtJenis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJenisKeyTyped(evt);
            }
        });

        jLabel4.setText("ID Supplier");

        txtSupplier.setEditable(false);
        txtSupplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSupplierKeyTyped(evt);
            }
        });

        txtJual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJualKeyTyped(evt);
            }
        });

        jLabel5.setText("Harga Jual");

        jLabel6.setText("Harga Beli");

        txtBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBeliActionPerformed(evt);
            }
        });
        txtBeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBeliKeyTyped(evt);
            }
        });

        jLabel7.setText("Stok");

        txtStok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStokKeyTyped(evt);
            }
        });

        cmdGetJenis.setText("...");
        cmdGetJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGetJenisActionPerformed(evt);
            }
        });

        cmdGetSupplier.setText("...");
        cmdGetSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGetSupplierActionPerformed(evt);
            }
        });

        cmdNew.setText("New");
        cmdNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNewActionPerformed(evt);
            }
        });

        cmdSave.setText("Save");
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        cmdDelete.setText("Delete");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdSearch.setText("Search");
        cmdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearchActionPerformed(evt);
            }
        });

        tableObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableObat);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/obat64.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel9.setText("Data Obat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(txtSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmdGetJenis)
                                    .addComponent(cmdGetSupplier)))
                            .addComponent(txtNama)
                            .addComponent(txtId))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(cmdNew, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(cmdSave, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStok)
                            .addComponent(txtJual, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBeli))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(txtBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmdGetJenis)
                                    .addComponent(jLabel3))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdGetSupplier))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdNew)
                    .addComponent(cmdSave)
                    .addComponent(cmdDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void txtBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBeliActionPerformed

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        // TODO add your handling code here:
        recordChanged();
    }//GEN-LAST:event_txtNamaKeyTyped

    private void txtJenisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJenisKeyTyped
        // TODO add your handling code here:
        recordChanged();
    }//GEN-LAST:event_txtJenisKeyTyped

    private void txtSupplierKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSupplierKeyTyped
        // TODO add your handling code here:
        recordChanged();
    }//GEN-LAST:event_txtSupplierKeyTyped

    private void txtJualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJualKeyTyped
        // TODO add your handling code here:
        recordChanged();
    }//GEN-LAST:event_txtJualKeyTyped

    private void txtBeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBeliKeyTyped
        // TODO add your handling code here:
        recordChanged();
    }//GEN-LAST:event_txtBeliKeyTyped

    private void txtStokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStokKeyTyped
        // TODO add your handling code here:
        recordChanged();
    }//GEN-LAST:event_txtStokKeyTyped

    private void cmdNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNewActionPerformed
        // TODO add your handling code here:
        forgotSave();
        newRecord =true;
        needSave = true;
        clearText();
        cmdDelete.setEnabled(false);
        txtId.setText(obatDAO.generateIDObat());
    }//GEN-LAST:event_cmdNewActionPerformed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
        // TODO add your handling code here:
        saveRecord();
    }//GEN-LAST:event_cmdSaveActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
                forgotSave();
        if (JOptionPane.showConfirmDialog(null, txtNama.getText() + 
                " akan di hapus dari daftar obat. Lanjutkan?",
                "Hapus " + txtNama.getText(),
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            status = obatDAO.deleteObat(txtId.getText());
        }
        if (!status) {
            JOptionPane.showMessageDialog(null, 
                    "Obat pernah dipesan disini.", 
                    "Tidak dihapus.",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        cmdDelete.setEnabled(false);
        refreshTableObat();
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearchActionPerformed
        // TODO add your handling code here:
        clearText();
        refreshTableObat();
    }//GEN-LAST:event_cmdSearchActionPerformed

    private void cmdGetJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGetJenisActionPerformed
        // TODO add your handling code here:
        FrmCariJenisObat cari = new FrmCariJenisObat(null,true);
        cari.Fobat=this;
        cari.setVisible(true);
        cari.setResizable(true);
        txtJenis.setText(jenis);
    }//GEN-LAST:event_cmdGetJenisActionPerformed

    private void cmdGetSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGetSupplierActionPerformed
        // TODO add your handling code here:
        FrmCariSupplier cari = new FrmCariSupplier(null,true);
        cari.Fobat=this;
        cari.setVisible(true);
        cari.setResizable(true);
        txtSupplier.setText(nama_supplier);
    }//GEN-LAST:event_cmdGetSupplierActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmObat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdGetJenis;
    private javax.swing.JButton cmdGetSupplier;
    private javax.swing.JButton cmdNew;
    private javax.swing.JButton cmdSave;
    private javax.swing.JButton cmdSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableObat;
    private javax.swing.JTextField txtBeli;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJenis;
    private javax.swing.JTextField txtJual;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtSupplier;
    // End of variables declaration//GEN-END:variables
}
