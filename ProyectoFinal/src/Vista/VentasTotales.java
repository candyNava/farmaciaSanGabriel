/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.awt.Dimension;
import javax.swing.JComponent;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;*/

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author Miguel Falcon
 */
public class VentasTotales  /*javax.swing.JFrame */extends  javax.swing.JFrame{

    public  DefaultTableModel tcliente = new DefaultTableModel();
    public VentasTotales() {
        initComponents();
   
        tablaVista.setModel(tcliente);
        tcliente.addColumn("Número de Venta");
         
             tcliente.addColumn("Total");
             tcliente.addColumn("Empleado");
             tcliente.addColumn("Fecha");
          //tablaCliente.setModel(cliente.cargarCliente());
        
           
      TableColumn columna;
      columna=tablaVista.getColumnModel().getColumn(0);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
         
      tablaVista.setRowHeight(35);
     
        
    }

 public void tamanoJtable(){
 //tablaVista.getColumnModel().getColumn(0).setPreferredWidth(100);
 
 }
   

/*public DefaultTableModel cargarCliente() {
       
         cliente.addColumn("Número de Cliente");
             cliente.addColumn("Nombre");
             cliente.addColumn("Clave");
             cliente.addColumn("Dirección");
             cliente.addColumn("Teléfono");
             cliente.addColumn("Email");
             cliente.addColumn("RFC");
             return cliente;
}*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaVista = new javax.swing.JTable();
        jbActualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte Ventas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, 40));

        tablaVista.setFont(new java.awt.Font("Garamond", 0, 20)); // NOI18N
        tablaVista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaVista);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 940, 660));

        jbActualizar.setBackground(new java.awt.Color(154, 205, 50));
        jbActualizar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 150, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logito.png"))); // NOI18N
        jLabel8.setText("jLabel1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 120, 120));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 140, 70));

        jButton2.setText("Ver");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 110, 70));

        jLabel2.setText("Total:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1000, -1, -1));

        jButton3.setText("FACTURAR");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 130, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JButton jbActualizar;
    public javax.swing.JTable tablaVista;
    // End of variables declaration//GEN-END:variables
}
