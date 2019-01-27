/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.view;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author teguhsis
 */
public class MainView extends javax.swing.JFrame {
    
    private int activeMenu;
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }

    public int getActiveMenu() {
        return activeMenu;
    }

    public void setActiveMenu(int activeMenu) {
        btnMainKategori.setBackground(new Color(75, 123, 236));
        btnMainOnderdil.setBackground(new Color(75, 123, 236));
        btnMainSupplier.setBackground(new Color(75, 123, 236));
        btnMainPembelian.setBackground(new Color(75, 123, 236));
        btnMainPenjualan.setBackground(new Color(75, 123, 236));
        btnMainService.setBackground(new Color(75, 123, 236));
        
        switch(activeMenu){
            case 1:btnMainKategori.setBackground(new Color(45, 152, 218));break;
            case 2:btnMainOnderdil.setBackground(new Color(45, 152, 218));break;
            case 3:btnMainSupplier.setBackground(new Color(45, 152, 218));break;
            case 4:btnMainPembelian.setBackground(new Color(45, 152, 218));break;
            case 5:btnMainPenjualan.setBackground(new Color(45, 152, 218));break;
            case 6:btnMainService.setBackground(new Color(45, 152, 218));break;
        }
        
        this.activeMenu = activeMenu;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        btnMainKategori = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMainOnderdil = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMainSupplier = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnMainPembelian = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnMainPenjualan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnMainService = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        katonPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        onderdilPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pembelianPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        penjualanPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        servicePanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        supplierPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Sistem Bengkel Motor");

        bodyPanel.setBackground(java.awt.Color.white);
        bodyPanel.setMaximumSize(new java.awt.Dimension(1366, 768));
        bodyPanel.setMinimumSize(new java.awt.Dimension(1366, 768));
        bodyPanel.setPreferredSize(new java.awt.Dimension(1355, 768));

        menuPanel.setBackground(new java.awt.Color(56, 103, 214));
        menuPanel.setPreferredSize(new java.awt.Dimension(250, 768));

        btnMainKategori.setBackground(new java.awt.Color(75, 123, 236));
        btnMainKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMainKategoriMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMainKategoriMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMainKategoriMouseEntered(evt);
            }
        });
        btnMainKategori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnMainKategoriKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Kategori Onderdil");

        javax.swing.GroupLayout btnMainKategoriLayout = new javax.swing.GroupLayout(btnMainKategori);
        btnMainKategori.setLayout(btnMainKategoriLayout);
        btnMainKategoriLayout.setHorizontalGroup(
            btnMainKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMainKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnMainKategoriLayout.setVerticalGroup(
            btnMainKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMainKategoriLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        btnMainOnderdil.setBackground(new java.awt.Color(75, 123, 236));
        btnMainOnderdil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMainOnderdilMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMainOnderdilMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMainOnderdilMouseEntered(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Onderdil");

        javax.swing.GroupLayout btnMainOnderdilLayout = new javax.swing.GroupLayout(btnMainOnderdil);
        btnMainOnderdil.setLayout(btnMainOnderdilLayout);
        btnMainOnderdilLayout.setHorizontalGroup(
            btnMainOnderdilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMainOnderdilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        btnMainOnderdilLayout.setVerticalGroup(
            btnMainOnderdilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMainOnderdilLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        btnMainSupplier.setBackground(new java.awt.Color(75, 123, 236));
        btnMainSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMainSupplierMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMainSupplierMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMainSupplierMouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Supplier");

        javax.swing.GroupLayout btnMainSupplierLayout = new javax.swing.GroupLayout(btnMainSupplier);
        btnMainSupplier.setLayout(btnMainSupplierLayout);
        btnMainSupplierLayout.setHorizontalGroup(
            btnMainSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMainSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        btnMainSupplierLayout.setVerticalGroup(
            btnMainSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMainSupplierLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        btnMainPembelian.setBackground(new java.awt.Color(75, 123, 236));
        btnMainPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMainPembelianMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMainPembelianMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMainPembelianMouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Pembelian");

        javax.swing.GroupLayout btnMainPembelianLayout = new javax.swing.GroupLayout(btnMainPembelian);
        btnMainPembelian.setLayout(btnMainPembelianLayout);
        btnMainPembelianLayout.setHorizontalGroup(
            btnMainPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMainPembelianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        btnMainPembelianLayout.setVerticalGroup(
            btnMainPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMainPembelianLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        btnMainPenjualan.setBackground(new java.awt.Color(75, 123, 236));
        btnMainPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMainPenjualanMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMainPenjualanMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMainPenjualanMouseEntered(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Penjualan");

        javax.swing.GroupLayout btnMainPenjualanLayout = new javax.swing.GroupLayout(btnMainPenjualan);
        btnMainPenjualan.setLayout(btnMainPenjualanLayout);
        btnMainPenjualanLayout.setHorizontalGroup(
            btnMainPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMainPenjualanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        btnMainPenjualanLayout.setVerticalGroup(
            btnMainPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMainPenjualanLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        btnMainService.setBackground(new java.awt.Color(75, 123, 236));
        btnMainService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMainServiceMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMainServiceMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMainServiceMouseEntered(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Service");

        javax.swing.GroupLayout btnMainServiceLayout = new javax.swing.GroupLayout(btnMainService);
        btnMainService.setLayout(btnMainServiceLayout);
        btnMainServiceLayout.setHorizontalGroup(
            btnMainServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMainServiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        btnMainServiceLayout.setVerticalGroup(
            btnMainServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMainServiceLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMainKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMainOnderdil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMainSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMainPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMainPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMainService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btnMainKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMainOnderdil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMainSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMainPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMainPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMainService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        mainPanel.setBackground(java.awt.Color.white);
        mainPanel.setPreferredSize(new java.awt.Dimension(1105, 768));
        mainPanel.setLayout(new java.awt.CardLayout());

        katonPanel.setBackground(java.awt.Color.white);

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel7.setText("Manajemen Kategori Onderdil");

        javax.swing.GroupLayout katonPanelLayout = new javax.swing.GroupLayout(katonPanel);
        katonPanel.setLayout(katonPanelLayout);
        katonPanelLayout.setHorizontalGroup(
            katonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(katonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(730, Short.MAX_VALUE))
        );
        katonPanelLayout.setVerticalGroup(
            katonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(katonPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addContainerGap(704, Short.MAX_VALUE))
        );

        mainPanel.add(katonPanel, "card2");

        onderdilPanel.setBackground(java.awt.Color.white);

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel8.setText("Manajemen Onderdil");

        javax.swing.GroupLayout onderdilPanelLayout = new javax.swing.GroupLayout(onderdilPanel);
        onderdilPanel.setLayout(onderdilPanelLayout);
        onderdilPanelLayout.setHorizontalGroup(
            onderdilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onderdilPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(839, Short.MAX_VALUE))
        );
        onderdilPanelLayout.setVerticalGroup(
            onderdilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onderdilPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addContainerGap(706, Short.MAX_VALUE))
        );

        mainPanel.add(onderdilPanel, "card3");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel9.setText("Pembelian Onderdil");

        javax.swing.GroupLayout pembelianPanelLayout = new javax.swing.GroupLayout(pembelianPanel);
        pembelianPanel.setLayout(pembelianPanelLayout);
        pembelianPanelLayout.setHorizontalGroup(
            pembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pembelianPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(856, Short.MAX_VALUE))
        );
        pembelianPanelLayout.setVerticalGroup(
            pembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pembelianPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addContainerGap(707, Short.MAX_VALUE))
        );

        mainPanel.add(pembelianPanel, "card4");

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel10.setText("Penjualan Onderdil");

        javax.swing.GroupLayout penjualanPanelLayout = new javax.swing.GroupLayout(penjualanPanel);
        penjualanPanel.setLayout(penjualanPanelLayout);
        penjualanPanelLayout.setHorizontalGroup(
            penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penjualanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(862, Short.MAX_VALUE))
        );
        penjualanPanelLayout.setVerticalGroup(
            penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penjualanPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addContainerGap(704, Short.MAX_VALUE))
        );

        mainPanel.add(penjualanPanel, "card5");

        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel11.setText("Service Motor");

        javax.swing.GroupLayout servicePanelLayout = new javax.swing.GroupLayout(servicePanel);
        servicePanel.setLayout(servicePanelLayout);
        servicePanelLayout.setHorizontalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(928, Short.MAX_VALUE))
        );
        servicePanelLayout.setVerticalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel11)
                .addContainerGap(701, Short.MAX_VALUE))
        );

        mainPanel.add(servicePanel, "card6");

        javax.swing.GroupLayout supplierPanelLayout = new javax.swing.GroupLayout(supplierPanel);
        supplierPanel.setLayout(supplierPanelLayout);
        supplierPanelLayout.setHorizontalGroup(
            supplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        supplierPanelLayout.setVerticalGroup(
            supplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        mainPanel.add(supplierPanel, "card7");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainKategoriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnMainKategoriKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMainKategoriKeyPressed

    private void btnMainServiceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainServiceMousePressed
        // TODO add your handling code here:
        setActiveMenu(6);
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        // add panel
        mainPanel.add(servicePanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnMainServiceMousePressed

    private void btnMainKategoriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainKategoriMousePressed
        // TODO add your handling code here:
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        setActiveMenu(1);
        // add panel
        mainPanel.add(katonPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnMainKategoriMousePressed

    private void btnMainKategoriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainKategoriMouseEntered
        // TODO add your handling code here:
        if (getActiveMenu() != 1) {
            btnMainKategori.setBackground(new Color(75, 123, 236));
        }
            btnMainKategori.setBackground(new Color(69, 170, 242));
    }//GEN-LAST:event_btnMainKategoriMouseEntered

    private void btnMainKategoriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainKategoriMouseExited
        // TODO add your handling code here:
        if (getActiveMenu() != 1) {
            btnMainKategori.setBackground(new Color(75, 123, 236));
        }
    }//GEN-LAST:event_btnMainKategoriMouseExited

    private void btnMainOnderdilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainOnderdilMouseEntered
        // TODO add your handling code here:
        if (getActiveMenu() != 2) {
            btnMainOnderdil.setBackground(new Color(75, 123, 236));
        }
            btnMainOnderdil.setBackground(new Color(69, 170, 242));
    }//GEN-LAST:event_btnMainOnderdilMouseEntered
    private void btnMainOnderdilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainOnderdilMouseExited
        // TODO add your handling code here:
        if (getActiveMenu() != 2) {
            btnMainOnderdil.setBackground(new Color(75, 123, 236));
        }
    }//GEN-LAST:event_btnMainOnderdilMouseExited

    private void btnMainSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainSupplierMouseEntered
        // TODO add your handling code here:
       if (getActiveMenu() != 3) {
            btnMainSupplier.setBackground(new Color(75, 123, 236));
        } 
            btnMainSupplier.setBackground(new Color(69, 170, 242));
    }//GEN-LAST:event_btnMainSupplierMouseEntered

    private void btnMainSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainSupplierMouseExited
        // TODO add your handling code here:
        if (getActiveMenu() != 3) {
            btnMainSupplier.setBackground(new Color(75, 123, 236));
        }
    }//GEN-LAST:event_btnMainSupplierMouseExited

    private void btnMainPembelianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainPembelianMouseEntered
        // TODO add your handling code here:
         if (getActiveMenu() != 4) {
            btnMainPembelian.setBackground(new Color(75, 123, 236));
        }
            btnMainPembelian.setBackground(new Color(69, 170, 242));
    }//GEN-LAST:event_btnMainPembelianMouseEntered

    private void btnMainPembelianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainPembelianMouseExited
        // TODO add your handling code here:
        if (getActiveMenu() != 4) {
            btnMainPembelian.setBackground(new Color(75, 123, 236));
        }
    }//GEN-LAST:event_btnMainPembelianMouseExited

    private void btnMainPenjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainPenjualanMouseEntered
        // TODO add your handling code here:
        if (getActiveMenu() != 5) {
            btnMainPenjualan.setBackground(new Color(75, 123, 236));
        }
            btnMainPenjualan.setBackground(new Color(69, 170, 242));
    }//GEN-LAST:event_btnMainPenjualanMouseEntered

    private void btnMainPenjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainPenjualanMouseExited
        // TODO add your handling code here:
        if (getActiveMenu() != 5) {
            btnMainPenjualan.setBackground(new Color(75, 123, 236));
        }
    }//GEN-LAST:event_btnMainPenjualanMouseExited

    private void btnMainServiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainServiceMouseExited
        // TODO add your handling code here:
//        btnMainService.setBackground(new Color(75, 123, 236));
        if (getActiveMenu() != 6) {
            btnMainService.setBackground(new Color(75, 123, 236));
        }
    }//GEN-LAST:event_btnMainServiceMouseExited

    private void btnMainServiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainServiceMouseEntered
        // TODO add your handling code here:
        if (getActiveMenu() != 6) {
            btnMainService.setBackground(new Color(75, 123, 236));
        }
            btnMainService.setBackground(new Color(69, 170, 242));
    }//GEN-LAST:event_btnMainServiceMouseEntered

    private void btnMainOnderdilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainOnderdilMousePressed
        // TODO add your handling code here:
        setActiveMenu(2);
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        // add panel
        mainPanel.add(onderdilPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnMainOnderdilMousePressed

    private void btnMainSupplierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainSupplierMousePressed
        // TODO add your handling code here:
        setActiveMenu(3);
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        // add panel
        mainPanel.add(supplierPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnMainSupplierMousePressed

    private void btnMainPembelianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainPembelianMousePressed
        // TODO add your handling code here:
        setActiveMenu(4);
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        // add panel
        mainPanel.add(pembelianPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnMainPembelianMousePressed

    private void btnMainPenjualanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainPenjualanMousePressed
        // TODO add your handling code here:
        setActiveMenu(5);
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        // add panel
        mainPanel.add(penjualanPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnMainPenjualanMousePressed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel btnMainKategori;
    private javax.swing.JPanel btnMainOnderdil;
    private javax.swing.JPanel btnMainPembelian;
    private javax.swing.JPanel btnMainPenjualan;
    private javax.swing.JPanel btnMainService;
    private javax.swing.JPanel btnMainSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel katonPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel onderdilPanel;
    private javax.swing.JPanel pembelianPanel;
    private javax.swing.JPanel penjualanPanel;
    private javax.swing.JPanel servicePanel;
    private javax.swing.JPanel supplierPanel;
    // End of variables declaration//GEN-END:variables
}
