/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Entity.Login;
import Reports.ViewReport;

/**
 *
 * @author su
 */
public class FrmMenu extends javax.swing.JFrame {
    public Login login = null;
    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        setLocationRelativeTo(this);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        if (login != null) {
            lblNamaLogin.setText(login.getUsername());
            lblAkses.setText(login.getAkses());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        iconTransaksi = new javax.swing.JLabel();
        iconObat = new javax.swing.JLabel();
        iconLaporan = new javax.swing.JLabel();
        iconPelanggan = new javax.swing.JLabel();
        iconSupplier = new javax.swing.JLabel();
        iconKaryawan = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        lblNamaLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        lblAkses = new javax.swing.JLabel();
        BarMenu = new javax.swing.JMenuBar();
        mnMaster = new javax.swing.JMenu();
        mnPelanggan = new javax.swing.JMenuItem();
        mnSupplier = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnKaryawan = new javax.swing.JMenuItem();
        mnLogin = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnObat = new javax.swing.JMenuItem();
        mnJenis = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        dbSetting = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnAkun = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnLaporanTransaksi = new javax.swing.JMenuItem();
        mnTransaksiPerbulan = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnStok = new javax.swing.JMenuItem();
        mnObatTerjual = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnLapPelanggan = new javax.swing.JMenuItem();
        PelangganAktif = new javax.swing.JMenuItem();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama");

        iconTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transaksi64.png"))); // NOI18N
        iconTransaksi.setText("Transaksi");
        iconTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconTransaksi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconTransaksiMouseClicked(evt);
            }
        });

        iconObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/obat64.png"))); // NOI18N
        iconObat.setText("Obat");
        iconObat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconObat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconObatMouseClicked(evt);
            }
        });

        iconLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/laporan64.png"))); // NOI18N
        iconLaporan.setText("Laporan");
        iconLaporan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconLaporan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLaporanMouseClicked(evt);
            }
        });

        iconPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pelanggan64.png"))); // NOI18N
        iconPelanggan.setText("Pelanggan");
        iconPelanggan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconPelanggan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconPelangganMouseClicked(evt);
            }
        });

        iconSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supplier64.png"))); // NOI18N
        iconSupplier.setText("Supplier");
        iconSupplier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconSupplier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconSupplierMouseClicked(evt);
            }
        });

        iconKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/karyawan64.png"))); // NOI18N
        iconKaryawan.setText("Pelanggan");
        iconKaryawan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconKaryawan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconKaryawanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconPelanggan))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconSupplier)
                    .addComponent(iconObat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconKaryawan))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconObat)
                    .addComponent(iconTransaksi)
                    .addComponent(iconLaporan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconSupplier, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconPelanggan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconKaryawan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jToolBar1.setRollover(true);

        lblNamaLogin.setText("jLabel1");
        jToolBar1.add(lblNamaLogin);
        jToolBar1.add(jSeparator1);

        lblAkses.setText("jLabel1");
        jToolBar1.add(lblAkses);

        mnMaster.setText("Master");

        mnPelanggan.setText("Pelanggan");
        mnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPelangganActionPerformed(evt);
            }
        });
        mnMaster.add(mnPelanggan);

        mnSupplier.setText("Supplier");
        mnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSupplierActionPerformed(evt);
            }
        });
        mnMaster.add(mnSupplier);
        mnMaster.add(jSeparator3);

        mnKaryawan.setText("Karyawan");
        mnKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKaryawanActionPerformed(evt);
            }
        });
        mnMaster.add(mnKaryawan);

        mnLogin.setText("Tambah Akun");
        mnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLoginActionPerformed(evt);
            }
        });
        mnMaster.add(mnLogin);
        mnMaster.add(jSeparator2);

        mnObat.setText("Obat");
        mnObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnObatActionPerformed(evt);
            }
        });
        mnMaster.add(mnObat);

        mnJenis.setText("Jenis Obat");
        mnJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnJenisActionPerformed(evt);
            }
        });
        mnMaster.add(mnJenis);
        mnMaster.add(jSeparator4);

        dbSetting.setText("Database Setting");
        dbSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbSettingActionPerformed(evt);
            }
        });
        mnMaster.add(dbSetting);

        BarMenu.add(mnMaster);

        jMenu2.setText("Setting");

        mnAkun.setText("Akun Setting");
        mnAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAkunActionPerformed(evt);
            }
        });
        jMenu2.add(mnAkun);

        BarMenu.add(jMenu2);

        jMenu1.setText("Laporan");

        mnLaporanTransaksi.setText("Transaksi");
        mnLaporanTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLaporanTransaksiActionPerformed(evt);
            }
        });
        jMenu1.add(mnLaporanTransaksi);

        mnTransaksiPerbulan.setText("Transaksi Perbulan");
        mnTransaksiPerbulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTransaksiPerbulanActionPerformed(evt);
            }
        });
        jMenu1.add(mnTransaksiPerbulan);
        jMenu1.add(jSeparator5);

        mnStok.setText("Stok Obat");
        mnStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnStokActionPerformed(evt);
            }
        });
        jMenu1.add(mnStok);

        mnObatTerjual.setText("Obat Terjual");
        mnObatTerjual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnObatTerjualActionPerformed(evt);
            }
        });
        jMenu1.add(mnObatTerjual);
        jMenu1.add(jSeparator6);

        mnLapPelanggan.setText("Pelanggan");
        mnLapPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLapPelangganActionPerformed(evt);
            }
        });
        jMenu1.add(mnLapPelanggan);

        PelangganAktif.setText("Pelanggan Aktif");
        PelangganAktif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelangganAktifActionPerformed(evt);
            }
        });
        jMenu1.add(PelangganAktif);

        BarMenu.add(jMenu1);

        setJMenuBar(BarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPelangganActionPerformed
        // TODO add your handling code here:
        FrmPelanggan pelanggan = new FrmPelanggan();
        pelanggan.setVisible(true);
    }//GEN-LAST:event_mnPelangganActionPerformed

    private void mnKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKaryawanActionPerformed
        // TODO add your handling code here:
        FrmKaryawan karyawan = new FrmKaryawan();
        karyawan.setVisible(true);
    }//GEN-LAST:event_mnKaryawanActionPerformed

    private void mnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSupplierActionPerformed
        // TODO add your handling code here:
        FrmSupplier supplier = new FrmSupplier();
        supplier.setVisible(true);
    }//GEN-LAST:event_mnSupplierActionPerformed

    private void iconTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconTransaksiMouseClicked
        // TODO add your handling code here:
        FrmTransaksi transaksi = new FrmTransaksi();
        transaksi.setVisible(true);
    }//GEN-LAST:event_iconTransaksiMouseClicked

    private void iconPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconPelangganMouseClicked
        // TODO add your handling code here:
        FrmPelanggan pelanggan = new FrmPelanggan();
        pelanggan.setVisible(true);
    }//GEN-LAST:event_iconPelangganMouseClicked

    private void iconKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconKaryawanMouseClicked
        // TODO add your handling code here:
        FrmKaryawan karyawan = new FrmKaryawan();
        karyawan.setVisible(true);
    }//GEN-LAST:event_iconKaryawanMouseClicked

    private void iconSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconSupplierMouseClicked
        // TODO add your handling code here:
        FrmSupplier supplier = new FrmSupplier();
        supplier.setVisible(true);
    }//GEN-LAST:event_iconSupplierMouseClicked

    private void iconObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconObatMouseClicked
        // TODO add your handling code here:
        FrmObat obat = new FrmObat();
        obat.setVisible(true);
    }//GEN-LAST:event_iconObatMouseClicked

    private void mnObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnObatActionPerformed
        // TODO add your handling code here:
        FrmObat obat = new FrmObat();
        obat.setVisible(true);
    }//GEN-LAST:event_mnObatActionPerformed

    private void mnJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnJenisActionPerformed
        // TODO add your handling code here:
        FrmJenisObat jenisObat = new FrmJenisObat();
        jenisObat.setVisible(true);
    }//GEN-LAST:event_mnJenisActionPerformed

    private void dbSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbSettingActionPerformed
        // TODO add your handling code here:
        DBSetting setting = new DBSetting();
        setting.setVisible(true);
    }//GEN-LAST:event_dbSettingActionPerformed

    private void mnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLoginActionPerformed
        // TODO add your handling code here:
        FrmCreateLogin login = new FrmCreateLogin();
        login.setVisible(true);
    }//GEN-LAST:event_mnLoginActionPerformed

    private void mnLapPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLapPelangganActionPerformed
        // TODO add your handling code here:
        ViewReport report = new ViewReport();
        report.pelanggan();
    }//GEN-LAST:event_mnLapPelangganActionPerformed

    private void PelangganAktifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelangganAktifActionPerformed
        // TODO add your handling code here:
        ViewReport report = new ViewReport();
        report.pelangganAktif();
    }//GEN-LAST:event_PelangganAktifActionPerformed

    private void mnLaporanTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLaporanTransaksiActionPerformed
        // TODO add your handling code here:
        ViewReport report = new ViewReport();
        report.transaksi();
    }//GEN-LAST:event_mnLaporanTransaksiActionPerformed

    private void mnStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnStokActionPerformed
        // TODO add your handling code here:
        ViewReport report = new ViewReport();
        report.obat();
    }//GEN-LAST:event_mnStokActionPerformed

    private void mnObatTerjualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnObatTerjualActionPerformed
        // TODO add your handling code here:
        ViewReport report = new ViewReport();
        report.obatTerjual();
    }//GEN-LAST:event_mnObatTerjualActionPerformed

    private void mnTransaksiPerbulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTransaksiPerbulanActionPerformed
        // TODO add your handling code here:
        ViewReport report = new ViewReport();
        report.transaksiPerbulan();
    }//GEN-LAST:event_mnTransaksiPerbulanActionPerformed

    private void iconLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLaporanMouseClicked
        // TODO add your handling code here:
        FrmLaporan laporan = new FrmLaporan();
        laporan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iconLaporanMouseClicked

    private void mnAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAkunActionPerformed
        // TODO add your handling code here:
        FrmSettingAkun akun = new FrmSettingAkun();
        akun.login = this.login;
        akun.setVisible(true);
    }//GEN-LAST:event_mnAkunActionPerformed

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JMenuItem PelangganAktif;
    private javax.swing.JMenuItem dbSetting;
    private javax.swing.JLabel iconKaryawan;
    private javax.swing.JLabel iconLaporan;
    private javax.swing.JLabel iconObat;
    private javax.swing.JLabel iconPelanggan;
    private javax.swing.JLabel iconSupplier;
    private javax.swing.JLabel iconTransaksi;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblAkses;
    private javax.swing.JLabel lblNamaLogin;
    private javax.swing.JMenuItem mnAkun;
    private javax.swing.JMenuItem mnJenis;
    private javax.swing.JMenuItem mnKaryawan;
    private javax.swing.JMenuItem mnLapPelanggan;
    private javax.swing.JMenuItem mnLaporanTransaksi;
    private javax.swing.JMenuItem mnLogin;
    private javax.swing.JMenu mnMaster;
    private javax.swing.JMenuItem mnObat;
    private javax.swing.JMenuItem mnObatTerjual;
    private javax.swing.JMenuItem mnPelanggan;
    private javax.swing.JMenuItem mnStok;
    private javax.swing.JMenuItem mnSupplier;
    private javax.swing.JMenuItem mnTransaksiPerbulan;
    // End of variables declaration//GEN-END:variables
}
