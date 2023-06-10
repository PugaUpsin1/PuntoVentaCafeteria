package Vista.Inicio;

import Vista.Venta.panelVentas;
import Controlador.Usuarios;
import Vista.Clientes.panelClientes;
import Vista.Configuracion.Configuracion;
import Vista.Gestion.panelGestion;
import Vista.Inventario.panelInventario;
import Vista.Producto.panelProductos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

public class Index extends javax.swing.JFrame {

    Container cont = this.getContentPane();
    public static Configuracion frmConf;
    public int tipo;
    Usuarios usr;

    public Index() {
        initComponents();
        this.setLocationRelativeTo(null);
        cont.setBackground(new Color(163, 189, 129));

    }

    public Index(Usuarios usr) {
        initComponents();
        this.setLocationRelativeTo(null);
        cont.setBackground(new Color(163, 189, 129));
        cont.setSize(1288, 696);
        pIndex.setSize(1288, 570);
        

        panelVentas p1 = new panelVentas();
        p1.setSize(1288, 570);
        p1.setLocation(0, 0);
        pIndex.removeAll();
        pIndex.add(p1, BorderLayout.CENTER);
        pIndex.revalidate();
        pIndex.repaint();
        lblUsr.setText(usr.getNombre() + " " + usr.getApellido());
        this.usr = usr;

        if (usr.getTipo() == 1) {
            tipo = usr.getTipo();
        } else if (usr.getTipo() == 2) {
            tipo = usr.getTipo();
            btnConf.setVisible(false);
            btnEstadisticas.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pIndex = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl3 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        lblUsr = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        btnConf = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnInvent = new javax.swing.JButton();
        btnProd = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pIndex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pIndex.setPreferredSize(new java.awt.Dimension(1288, 570));

        javax.swing.GroupLayout pIndexLayout = new javax.swing.GroupLayout(pIndex);
        pIndex.setLayout(pIndexLayout);
        pIndexLayout.setHorizontalGroup(
            pIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1286, Short.MAX_VALUE)
        );
        pIndexLayout.setVerticalGroup(
            pIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo Diana.png"))); // NOI18N

        pnl3.setBackground(new java.awt.Color(163, 189, 129));

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        lblUsr.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblUsr.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion))
                .addGap(25, 25, 25))
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pnl3Layout.createSequentialGroup()
                        .addComponent(lblUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnCerrarSesion)))
                .addGap(17, 17, 17))
        );

        pnl2.setBackground(new java.awt.Color(163, 189, 129));

        btnConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/configuraciones.png"))); // NOI18N
        btnConf.setText("Cofiguracion");
        btnConf.setMinimumSize(new java.awt.Dimension(100, 30));
        btnConf.setPreferredSize(new java.awt.Dimension(100, 30));
        btnConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfActionPerformed(evt);
            }
        });

        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/indicador-clave-de-rendimiento.png"))); // NOI18N
        btnEstadisticas.setText("Gestion");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/revisar.png"))); // NOI18N
        jButton2.setText("Clientes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnInvent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/granos-de-cafe.png"))); // NOI18N
        btnInvent.setText("  Inventario");
        btnInvent.setPreferredSize(new java.awt.Dimension(73, 23));
        btnInvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventActionPerformed(evt);
            }
        });

        btnProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/taza-de-cafe.png"))); // NOI18N
        btnProd.setText("Productos");
        btnProd.setPreferredSize(new java.awt.Dimension(73, 23));
        btnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdActionPerformed(evt);
            }
        });

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/punto-de-venta.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setPreferredSize(new java.awt.Dimension(90, 23));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnProd, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnInvent, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(pnl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        panelVentas p1 = new panelVentas();
        p1.setSize(1288, 570);
        p1.setLocation(0, 0);
        pIndex.removeAll();
        pIndex.add(p1, BorderLayout.CENTER);
        pIndex.revalidate();
        pIndex.repaint();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnInventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventActionPerformed
        panelInventario pI = new panelInventario(tipo);
        pI.setSize(1288, 570);
        pI.setLocation(0, 0);
        pIndex.removeAll();
        pIndex.add(pI, BorderLayout.CENTER);
        pIndex.revalidate();
        pIndex.repaint();
    }//GEN-LAST:event_btnInventActionPerformed

    private void btnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdActionPerformed
        panelProductos pnlProd = new panelProductos();
        pnlProd.setSize(1288, 570);
        pnlProd.setLocation(0, 0);
        pIndex.removeAll();
        pIndex.add(pnlProd, BorderLayout.CENTER);
        pIndex.revalidate();
        pIndex.repaint();
    }//GEN-LAST:event_btnProdActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfActionPerformed

        if (frmConf == null) {
            frmConf = new Configuracion();
            frmConf.setVisible(true);
        }

    }//GEN-LAST:event_btnConfActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        panelGestion pnlGes = new panelGestion();
        pnlGes.setSize(1288, 570);
        pnlGes.setLocation(0, 0);
        pIndex.removeAll();
        pIndex.add(pnlGes, BorderLayout.CENTER);
        pIndex.revalidate();
        pIndex.repaint();
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panelClientes  panClien = new panelClientes();
        panClien.setSize(1288, 570);
        panClien.setLocation(0, 0);
        pIndex.removeAll();
        pIndex.add(panClien, BorderLayout.CENTER);
        pIndex.revalidate();
        pIndex.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void privilegios(Usuarios usr) {
        
    }

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnCerrarSesion;
    javax.swing.JButton btnConf;
    javax.swing.JButton btnEstadisticas;
    javax.swing.JButton btnInvent;
    javax.swing.JButton btnProd;
    javax.swing.JButton btnVentas;
    javax.swing.JButton jButton2;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel lblUsr;
    javax.swing.JPanel pIndex;
    javax.swing.JPanel pnl2;
    javax.swing.JPanel pnl3;
    // End of variables declaration//GEN-END:variables
}
