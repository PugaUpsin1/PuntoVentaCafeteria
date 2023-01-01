
package Vista;

import Vista.Venta.panelVentas;
import Modelo.Usuarios;
import Vista.Configuracion.Configuracion;
import Vista.Producto.panelProductos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;


public class Index extends javax.swing.JFrame {
    Container cont = this.getContentPane();
    public static Configuracion frmConf;
    Usuarios usr;
    public Index() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        cont.setBackground(new Color(173,216,230));
        panelVentas p1 = new panelVentas();
        p1.setSize(1288,569);
        p1.setLocation(0,0);
        pIndex.removeAll();
        pIndex.add(p1, BorderLayout.CENTER);
        pIndex.revalidate();
        pIndex.repaint();
        
        
    }

    public Index(Usuarios usr){
        initComponents();
        this.setLocationRelativeTo(null);
        cont.setBackground(new Color(173,216,230));
        
        panelVentas p1 = new panelVentas();
        p1.setSize(1288,570);
        p1.setLocation(0,0);
        pIndex.removeAll();
        pIndex.add(p1, BorderLayout.CENTER);
        pIndex.revalidate();
        pIndex.repaint();
        
        this.usr = usr;
        lblUsr.setText(usr.getNombre()+" "+ usr.getApellido());
        
        if(usr.getTipo() == 1){
            
        }else if(usr.getTipo() == 2){
            btnConf.setVisible(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pIndex = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btnInvent = new javax.swing.JButton();
        btnConf = new javax.swing.JButton();
        btnProd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsr = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pIndex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pIndex.setPreferredSize(new java.awt.Dimension(1000, 523));

        javax.swing.GroupLayout pIndexLayout = new javax.swing.GroupLayout(pIndex);
        pIndex.setLayout(pIndexLayout);
        pIndexLayout.setHorizontalGroup(
            pIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pIndexLayout.setVerticalGroup(
            pIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        btnVentas.setText("Ventas");
        btnVentas.setPreferredSize(new java.awt.Dimension(90, 23));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnInvent.setText("Inventario");
        btnInvent.setPreferredSize(new java.awt.Dimension(73, 23));
        btnInvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventActionPerformed(evt);
            }
        });

        btnConf.setText("Configuracion");
        btnConf.setMinimumSize(new java.awt.Dimension(100, 30));
        btnConf.setPreferredSize(new java.awt.Dimension(100, 30));
        btnConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfActionPerformed(evt);
            }
        });

        btnProd.setText("Productos");
        btnProd.setPreferredSize(new java.awt.Dimension(73, 23));
        btnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Imagen 2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");

        lblUsr.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblUsr.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInvent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 638, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion))
                .addContainerGap())
            .addComponent(pIndex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1288, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInvent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblUsr, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrarSesion)
                        .addGap(24, 24, 24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pIndex, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        panelVentas p1 = new panelVentas();
        p1.setSize(1288,570);
        p1.setLocation(0,0);
        pIndex.removeAll();
        pIndex.add(p1, BorderLayout.CENTER);
        pIndex.revalidate();
        pIndex.repaint();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnInventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventActionPerformed

    private void btnConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfActionPerformed
        
        if(frmConf == null){
            frmConf = new Configuracion();
            frmConf.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_btnConfActionPerformed

    private void btnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdActionPerformed
        panelProductos pnlProd = new panelProductos();
        pnlProd.setSize(1288,570);
        pnlProd.setLocation(0,0);
        pIndex.removeAll();
        pIndex.add(pnlProd, BorderLayout.CENTER);
        pIndex.revalidate();
        pIndex.repaint();
    }//GEN-LAST:event_btnProdActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        Login lg =  new Login();
        lg.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_btnCerrarSesionActionPerformed


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
    javax.swing.JButton btnInvent;
    javax.swing.JButton btnProd;
    javax.swing.JButton btnVentas;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel lblUsr;
    javax.swing.JPanel pIndex;
    // End of variables declaration//GEN-END:variables
}
