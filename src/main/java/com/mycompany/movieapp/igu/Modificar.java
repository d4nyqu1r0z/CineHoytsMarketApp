/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.movieapp.igu;

import com.mycompany.movieapp.logica.Controlador;
import com.mycompany.movieapp.logica.Movie;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author dani2
 */
public class Modificar extends javax.swing.JFrame {

    
    Controlador control = null;
    int id;
    Movie peli;
    
    public Modificar(int id) {
        control = new Controlador();
        //this.id = id;
        initComponents();
        cargarDatos(id);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spDuracion = new javax.swing.JSpinner();
        txtGenero = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtDirector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        spAnio = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 103, 173));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Género:");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 100, 30));

        spDuracion.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        spDuracion.setBorder(null);
        background.add(spDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 150, 30));

        txtGenero.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtGenero.setBorder(null);
        background.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 370, 40));

        txtTitulo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtTitulo.setBorder(null);
        background.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 370, 40));

        txtDirector.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtDirector.setBorder(null);
        background.add(txtDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 370, 40));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(34, 103, 173));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Título:");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(34, 103, 173));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Director:");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(34, 103, 173));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Año:");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(34, 103, 173));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("minutos");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 70, 30));

        spAnio.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        spAnio.setBorder(null);
        background.add(spAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 150, 30));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 370, -1));
        background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 150, 30));
        background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 370, 30));
        background.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 150, 30));
        background.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 690, 30));

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        background.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 140, 40));

        btnActualizar.setBackground(new java.awt.Color(34, 103, 173));
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        background.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 140, 40));

        jLabel1.setFont(new java.awt.Font("Montserrat Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 103, 173));
        jLabel1.setText("Modificar");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 250, 60));
        background.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 370, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(34, 103, 173));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Duración:");
        background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        background.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtTitulo.setText("");
        txtDirector.setText("");
        txtGenero.setText("");
        spAnio.setValue(0);
        spDuracion.setValue(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        String titulo = txtTitulo.getText();
        String director = txtDirector.getText();
        int anio = (int) spAnio.getValue();
        int duracion = (int) spDuracion.getValue();
        String genero = txtGenero.getText();
        
        // Validación de campos
        if (titulo.isEmpty() || director.isEmpty() || genero.isEmpty()) {
            mostrarMensaje("Por favor, complete todos los campos.", "error", "Error de validación");
            return;
        }

        if (anio < 1895) {
            mostrarMensaje("El año no puede ser menor a 1895.", "error", "Error de validación");
            return;
        }

        if (duracion < 0) {
            mostrarMensaje("La duración no puede ser menor a 0.", "error", "Error de validación");
            return;
        }
        
        control.modificarPelicula(peli,titulo,director,anio,duracion,genero);
        
        mostrarMensaje("Registro actualizado exitosamente!","info","Modificar");
        
        VerPeliculas pantalla = new VerPeliculas();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner spAnio;
    private javax.swing.JSpinner spDuracion;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int id) {
        this.peli = control.traerPelicula(id);
        
        txtTitulo.setText(peli.getTitulo());
        txtDirector.setText(peli.getDirector());
        spAnio.setValue(peli.getAnio());
        spDuracion.setValue(peli.getDuracion());
        txtGenero.setText(peli.getGenero());
        
        
    }
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if(tipo.equals("error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
