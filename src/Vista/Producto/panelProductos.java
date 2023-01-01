
package Vista.Producto;

import static Vista.Producto.listProduct.pnlLPr;
import java.awt.BorderLayout;


public class panelProductos extends javax.swing.JPanel {
    

    public panelProductos() {
        initComponents();
        
        pnlLPr = new listProduct();
        pnlLPr.setSize(1286, 535);
        pnlLPr.setLocation(0, 0);
        pProd.removeAll();
        pProd.add(pnlLPr, BorderLayout.CENTER);
        pProd.revalidate();
        pProd.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pProd = new javax.swing.JPanel();
        btnProd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout pProdLayout = new javax.swing.GroupLayout(pProd);
        pProd.setLayout(pProdLayout);
        pProdLayout.setHorizontalGroup(
            pProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pProdLayout.setVerticalGroup(
            pProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        btnProd.setText("Productos");
        btnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Gestionar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(1034, Short.MAX_VALUE))
            .addComponent(pProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdActionPerformed
        pnlLPr = new listProduct();
        pnlLPr.setSize(1286, 535);
        pnlLPr.setLocation(0, 0);
        pProd.removeAll();
        pProd.add(pnlLPr, BorderLayout.CENTER);
        pProd.revalidate();
        pProd.repaint();
    }//GEN-LAST:event_btnProdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        aggProduct pnlAggPr = new aggProduct();
        pnlAggPr.setSize(1286, 535);
        pnlAggPr.setLocation(0, 0);
        pProd.removeAll();
        pProd.add(pnlAggPr, BorderLayout.CENTER);
        pProd.revalidate();
        pProd.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProd;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel pProd;
    // End of variables declaration//GEN-END:variables
}
