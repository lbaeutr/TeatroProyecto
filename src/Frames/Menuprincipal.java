package Frames;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
public class Menuprincipal extends javax.swing.JFrame {
    public Menuprincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();
        BotonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonAdministrar = new javax.swing.JButton();
        BotonVentaEntradas = new javax.swing.JButton();
        BotonCatalogo = new javax.swing.JButton();
        BotonComprar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 850, 0));

        contenido.setBackground(new java.awt.Color(0, 0, 0));
        contenido.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        contenido.setForeground(new java.awt.Color(255, 255, 255));
        contenido.setToolTipText("");

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 670, 480));

        BotonCancelar.setBackground(new java.awt.Color(102, 0, 0));
        BotonCancelar.setFont(new java.awt.Font("Dubai", 0, 48)); // NOI18N
        BotonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BotonCancelar.setText("X");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HeaderCortinas_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -14, 850, 140));

        BotonAdministrar.setBackground(new java.awt.Color(51, 51, 51));
        BotonAdministrar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        BotonAdministrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonAdministrar.setText("Administrar");
        BotonAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAdministrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 170, 70));

        BotonVentaEntradas.setBackground(new java.awt.Color(51, 51, 51));
        BotonVentaEntradas.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        BotonVentaEntradas.setForeground(new java.awt.Color(255, 255, 255));
        BotonVentaEntradas.setText("Venta de entradas");
        BotonVentaEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVentaEntradasActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVentaEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, 80));

        BotonCatalogo.setBackground(new java.awt.Color(51, 51, 51));
        BotonCatalogo.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        BotonCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        BotonCatalogo.setText("Catálogo");
        BotonCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCatalogoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 70));

        BotonComprar.setBackground(new java.awt.Color(51, 102, 0));
        BotonComprar.setForeground(new java.awt.Color(0, 0, 0));
        BotonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Checkout2.png"))); // NOI18N
        jPanel1.add(BotonComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logofalla.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 850, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAdministrarActionPerformed
        Administrar administar = new Administrar();
        administar.setSize(670, 480);
        administar.setVisible(true);
        contenido.removeAll();
        contenido.add(administar);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_BotonAdministrarActionPerformed

    private void BotonVentaEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentaEntradasActionPerformed
        RegistroVE registroVE = new RegistroVE();
        registroVE.setSize(670, 480);
        registroVE.setVisible(true);
        contenido.removeAll();
        contenido.add(registroVE);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_BotonVentaEntradasActionPerformed

    private void BotonCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCatalogoActionPerformed
        Catalogo catalogo = new Catalogo();
        catalogo.setSize(670, 480);
        catalogo.setVisible(true);
        contenido.removeAll();
        contenido.add(catalogo);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_BotonCatalogoActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarActionPerformed

    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuprincipal().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAdministrar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonCatalogo;
    private javax.swing.JButton BotonComprar;
    private javax.swing.JButton BotonVentaEntradas;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
    

