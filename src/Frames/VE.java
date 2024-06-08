package Frames;
import DAO.*;
import Logica.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;

public class VE extends javax.swing.JPanel {
    Conexion conex = new Conexion();
    private Cliente cliente;
    public VE(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        cargarEspectaculos(); // Llamada al método para cargar los espectáculos
        cargarFilas(); // Llamada al método para cargar las filas
        cargarAsientos(); //LLamada al método para cargarAsientos
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CBEspectaculos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        CBFilas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CBAsientos = new javax.swing.JComboBox<>();
        Enviar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        jLabel1.setText("Venta Entradas");

        jLabel2.setText("Espectáculos");

        CBEspectaculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEspectaculosActionPerformed(evt);
            }
        });

        jLabel3.setText("Fila");

        CBFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBFilasActionPerformed(evt);
            }
        });

        jLabel4.setText("Asiento");

        CBAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBAsientosActionPerformed(evt);
            }
        });

        Enviar.setText("Enviar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Enviar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(58, 58, 58)
                                .addComponent(CBEspectaculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(CBEspectaculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CBFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enviar)
                    .addComponent(Cancelar))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void cargarEspectaculos() {
        EspectaculoDao espectaculoDao = new EspectaculoDao();
        try {
            List<Espectaculo> espectaculos = espectaculoDao.listarTodos();
            for (Espectaculo espectaculo : espectaculos) {
                CBEspectaculos.addItem(espectaculo.getNombreEspectaculo());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar los espectáculos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarFilas() {
        for (int i = 1; i <= 10; i++) {
            CBFilas.addItem(String.valueOf(i));
        }
    }

    private void cargarAsientos() {
        for (int i = 1; i <= 10; i++) {
            CBAsientos.addItem(String.valueOf(i));
        }
    }
    private void CBEspectaculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEspectaculosActionPerformed

    }//GEN-LAST:event_CBEspectaculosActionPerformed

    private void CBFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBFilasActionPerformed

    }//GEN-LAST:event_CBFilasActionPerformed

    private void CBAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBAsientosActionPerformed

    }//GEN-LAST:event_CBAsientosActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        String filaSeleccionada = (String) CBFilas.getSelectedItem();
        String asientoSeleccionado = (String) CBAsientos.getSelectedItem();
        String espectaculoSeleccionado = (String) CBEspectaculos.getSelectedItem();
        String mensajeConfirmacion = "Has seleccionado el espectáculo: " + espectaculoSeleccionado + ", la fila: " + filaSeleccionada + ", y el asiento: " + asientoSeleccionado + ".\n¿Deseas confirmar esta selección?";
        int respuesta = JOptionPane.showConfirmDialog(null, mensajeConfirmacion, "Confirmar selección", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            try {
                int fila = Integer.parseInt(filaSeleccionada);
                int columna = Integer.parseInt(asientoSeleccionado);
                LocalDate fechaCompra = LocalDate.now();
                /*double precio*/
                EspectaculoDao espectaculoDao = new EspectaculoDao();
                Espectaculo espectaculo = espectaculoDao.leerPorId(espectaculoSeleccionado);
                if (espectaculo == null) {
                    JOptionPane.showMessageDialog(this, "Error al obtener el espectáculo.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Entrada entrada = new Entrada(null, espectaculo.getCodEspectaculo(), cliente.getDni(), fila, columna, fechaCompra, precio);
                EntradaDao entradaDao = new EntradaDao();
                entradaDao.crear(entrada, cliente, espectaculo);
                JOptionPane.showMessageDialog(this, "Entrada creada", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al crear la entrada: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccion cancelada.", "Cancelación", JOptionPane.INFORMATION_MESSAGE);
        }
        /*private double calcularPrecio() {

        }*/
    }//GEN-LAST:event_EnviarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        RegistroVE registroVE = new RegistroVE();
        registroVE.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBAsientos;
    private javax.swing.JComboBox<String> CBEspectaculos;
    private javax.swing.JComboBox<String> CBFilas;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
