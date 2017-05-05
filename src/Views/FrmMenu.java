/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author su
 */
public class FrmMenu extends javax.swing.JFrame {
    private final FrmPelanggan pelanggan = new FrmPelanggan();
    private final FrmKaryawan karyawan = new FrmKaryawan();
    private final FrmSupplier supplier = new FrmSupplier();
    private final FrmJenisObat jenisObat = new FrmJenisObat();
    private final FrmObat obat = new FrmObat();
    
    
    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        setLocationRelativeTo(this);
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
        labelTransaksi = new javax.swing.JLabel();
        iconTransaksi = new javax.swing.JLabel();
        iconObat = new javax.swing.JLabel();
        labelObat = new javax.swing.JLabel();
        iconLaporan = new javax.swing.JLabel();
        labelLaporan = new javax.swing.JLabel();
        iconPelanggan = new javax.swing.JLabel();
        labelPelanggan = new javax.swing.JLabel();
        iconSupplier = new javax.swing.JLabel();
        labelSupplier = new javax.swing.JLabel();
        iconKaryawan = new javax.swing.JLabel();
        labelKaryawan = new javax.swing.JLabel();
        BarMenu = new javax.swing.JMenuBar();
        mnMaster = new javax.swing.JMenu();
        mnPelanggan = new javax.swing.JMenuItem();
        mnKaryawan = new javax.swing.JMenuItem();
        mnSupplier = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnJenis = new javax.swing.JMenuItem();
        mnObat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama");

        labelTransaksi.setText("Transaksi");

        iconTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transaksi64.png"))); // NOI18N
        iconTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconTransaksiMouseClicked(evt);
            }
        });

        iconObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/obat64.png"))); // NOI18N
        iconObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconObatMouseClicked(evt);
            }
        });

        labelObat.setText("Obat");
        labelObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelObatMouseClicked(evt);
            }
        });

        iconLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/laporan64.png"))); // NOI18N

        labelLaporan.setText("Laporan");

        iconPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pelanggan64.png"))); // NOI18N
        iconPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconPelangganMouseClicked(evt);
            }
        });

        labelPelanggan.setText("Pelanggan");
        labelPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPelangganMouseClicked(evt);
            }
        });

        iconSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supplier64.png"))); // NOI18N
        iconSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconSupplierMouseClicked(evt);
            }
        });

        labelSupplier.setText("Supplier");
        labelSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSupplierMouseClicked(evt);
            }
        });

        iconKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/karyawan64.png"))); // NOI18N
        iconKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconKaryawanMouseClicked(evt);
            }
        });

        labelKaryawan.setText("Karyawan");
        labelKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelKaryawanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconPelanggan)
                    .addComponent(labelPelanggan)
                    .addComponent(iconTransaksi)
                    .addComponent(labelTransaksi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconSupplier)
                    .addComponent(labelSupplier)
                    .addComponent(iconObat)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelObat)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelKaryawan)
                    .addComponent(iconKaryawan)
                    .addComponent(iconLaporan)
                    .addComponent(labelLaporan))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iconTransaksi)
                            .addComponent(iconLaporan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTransaksi)
                            .addComponent(labelLaporan)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconObat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelObat)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconSupplier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSupplier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconPelanggan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPelanggan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconKaryawan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKaryawan)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        mnMaster.setText("Master");

        mnPelanggan.setText("Pelanggan");
        mnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPelangganActionPerformed(evt);
            }
        });
        mnMaster.add(mnPelanggan);

        mnKaryawan.setText("Karyawan");
        mnKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKaryawanActionPerformed(evt);
            }
        });
        mnMaster.add(mnKaryawan);

        mnSupplier.setText("Supplier");
        mnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSupplierActionPerformed(evt);
            }
        });
        mnMaster.add(mnSupplier);
        mnMaster.add(jSeparator3);

        mnJenis.setText("Jenis Obat");
        mnJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnJenisActionPerformed(evt);
            }
        });
        mnMaster.add(mnJenis);

        mnObat.setText("Obat");
        mnObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnObatActionPerformed(evt);
            }
        });
        mnMaster.add(mnObat);

        BarMenu.add(mnMaster);

        jMenu2.setText("Edit");
        BarMenu.add(jMenu2);

        setJMenuBar(BarMenu);

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

    private void mnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPelangganActionPerformed
        // TODO add your handling code here:
        pelanggan.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_mnPelangganActionPerformed

    private void mnKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKaryawanActionPerformed
        // TODO add your handling code here:
        karyawan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnKaryawanActionPerformed

    private void mnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSupplierActionPerformed
        // TODO add your handling code here:
        supplier.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnSupplierActionPerformed

    private void iconTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconTransaksiMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_iconTransaksiMouseClicked

    private void iconPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconPelangganMouseClicked
        // TODO add your handling code here:
        pelanggan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iconPelangganMouseClicked

    private void iconKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconKaryawanMouseClicked
        // TODO add your handling code here:
        karyawan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iconKaryawanMouseClicked

    private void labelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKaryawanMouseClicked
        // TODO add your handling code here:
        karyawan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelKaryawanMouseClicked

    private void iconSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconSupplierMouseClicked
        // TODO add your handling code here:
        supplier.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iconSupplierMouseClicked

    private void labelSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSupplierMouseClicked
        // TODO add your handling code here:
        supplier.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelSupplierMouseClicked

    private void labelPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPelangganMouseClicked
        // TODO add your handling code here:
        pelanggan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelPelangganMouseClicked

    private void labelObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelObatMouseClicked
        // TODO add your handling code here:
        obat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelObatMouseClicked

    private void iconObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconObatMouseClicked
        // TODO add your handling code here:
        obat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iconObatMouseClicked

    private void mnObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnObatActionPerformed
        // TODO add your handling code here:
        obat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnObatActionPerformed

    private void mnJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnJenisActionPerformed
        // TODO add your handling code here:
        jenisObat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnJenisActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarMenu;
    private javax.swing.JLabel iconKaryawan;
    private javax.swing.JLabel iconLaporan;
    private javax.swing.JLabel iconObat;
    private javax.swing.JLabel iconPelanggan;
    private javax.swing.JLabel iconSupplier;
    private javax.swing.JLabel iconTransaksi;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel labelKaryawan;
    private javax.swing.JLabel labelLaporan;
    private javax.swing.JLabel labelObat;
    private javax.swing.JLabel labelPelanggan;
    private javax.swing.JLabel labelSupplier;
    private javax.swing.JLabel labelTransaksi;
    private javax.swing.JMenuItem mnJenis;
    private javax.swing.JMenuItem mnKaryawan;
    private javax.swing.JMenu mnMaster;
    private javax.swing.JMenuItem mnObat;
    private javax.swing.JMenuItem mnPelanggan;
    private javax.swing.JMenuItem mnSupplier;
    // End of variables declaration//GEN-END:variables
}
