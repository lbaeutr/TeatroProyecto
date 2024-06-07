package Frames;
import DAO.Conexion;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dani
 */

public class Menuprincipal extends javax.swing.JFrame {
    Conexion conex = new Conexion();
    /**
     * Creates new form Menuprincipal
     */
    public Menuprincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        contenido = new javax.swing.JPanel();
        botonDesconectar = new javax.swing.JButton();
        fotoTelon = new javax.swing.JLabel();
        botonAdministrar = new javax.swing.JButton();
        botonVenta = new javax.swing.JButton();
        botonCatalogo = new javax.swing.JButton();
        botonCalculoDinero = new javax.swing.JButton();
        fotoGTF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setBackground(new java.awt.Color(70, 73, 75));
        contenido.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        contenido.setForeground(new java.awt.Color(255, 255, 255));
        contenido.setToolTipText("");

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        jPanel1.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 680, 480));

        botonDesconectar.setBackground(new java.awt.Color(102, 0, 0));
        botonDesconectar.setFont(new java.awt.Font("Dubai", 0, 48)); // NOI18N
        botonDesconectar.setForeground(new java.awt.Color(255, 255, 255));
        botonDesconectar.setText("X");
        botonDesconectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDesconectarMouseClicked(evt);
            }
        });
        botonDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDesconectarActionPerformed(evt);
            }
        });
        jPanel1.add(botonDesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 60, 60));

        fotoTelon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HeaderCortinas_1.png"))); // NOI18N
        fotoTelon.setText("jLabel1");
        jPanel1.add(fotoTelon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 850, 140));

        botonAdministrar.setBackground(new java.awt.Color(51, 51, 51));
        botonAdministrar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        botonAdministrar.setForeground(new java.awt.Color(255, 255, 255));
        botonAdministrar.setText("Administrar");
        botonAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 170, 80));

        botonVenta.setBackground(new java.awt.Color(51, 51, 51));
        botonVenta.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        botonVenta.setForeground(new java.awt.Color(255, 255, 255));
        botonVenta.setText("Venta de entradas");
        botonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVentaActionPerformed(evt);
            }
        });
        jPanel1.add(botonVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, 80));

        botonCatalogo.setBackground(new java.awt.Color(51, 51, 51));
        botonCatalogo.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        botonCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        botonCatalogo.setText("Catálogo");
        botonCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCatalogoActionPerformed(evt);
            }
        });
        jPanel1.add(botonCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 80));

        botonCalculoDinero.setBackground(new java.awt.Color(51, 102, 0));
        botonCalculoDinero.setForeground(new java.awt.Color(0, 0, 0));
        botonCalculoDinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Checkout2.png"))); // NOI18N
        jPanel1.add(botonCalculoDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 60, 60));

        fotoGTF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logofalla.png"))); // NOI18N
        jPanel1.add(fotoGTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 850, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministrarActionPerformed
        Administrar administar = new Administrar();
        administar.setSize(680, 480);
        administar.setVisible(true);
        contenido.removeAll();
        contenido.add(administar);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonAdministrarActionPerformed

    private void botonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVentaActionPerformed
        RegistroVE registroVE = new RegistroVE();
        registroVE.setSize(680, 480);
        registroVE.setVisible(true);
        contenido.removeAll();
        contenido.add(registroVE);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonVentaActionPerformed

    private void botonCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCatalogoActionPerformed
       Catalogo catalogo = new Catalogo();
        catalogo.setSize(680, 480);
        catalogo.setVisible(true);
        contenido.removeAll();
        contenido.add(catalogo);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonCatalogoActionPerformed

    private void botonDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDesconectarActionPerformed
        conex.desconectar();
        
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonDesconectarActionPerformed

    private void botonDesconectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDesconectarMouseClicked
        
    }//GEN-LAST:event_botonDesconectarMouseClicked

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JButton botonAdministrar;
    private javax.swing.JButton botonCalculoDinero;
    private javax.swing.JButton botonCatalogo;
    private javax.swing.JButton botonDesconectar;
    private javax.swing.JButton botonVenta;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel fotoGTF;
    private javax.swing.JLabel fotoTelon;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
    

