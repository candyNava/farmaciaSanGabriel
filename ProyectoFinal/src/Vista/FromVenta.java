/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Dimension;
import java.util.Calendar;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;

import java.awt.Dimension;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Miguel Falcon
 */
public class FromVenta extends javax.swing.JInternalFrame {
    public  DefaultTableModel tbDetalleV = new DefaultTableModel();
Date now = new Date(System.currentTimeMillis());
SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

    public FromVenta() {
        initComponents();
        this.setBorder(null);
         this.QuitarLaBarraTitulo();  
         FECHAACTUAL.setText(String.valueOf(now));
         jtVistaDetalle.setModel(tbDetalleV);     
        tbDetalleV.addColumn("codigo");
        tbDetalleV.addColumn("producto");
        tbDetalleV.addColumn("Precio por unidad");
        tbDetalleV.addColumn("cantidad");
        tbDetalleV.addColumn("SubTotal");
    
TableColumn columna;
      columna=jtVistaDetalle.getColumnModel().getColumn(0);
      columna.setPreferredWidth(100);
      columna.setMaxWidth(100);
      columna.setMinWidth(100);
       columna=jtVistaDetalle.getColumnModel().getColumn(4);
      columna.setPreferredWidth(200);
      columna.setMaxWidth(200);
      columna.setMinWidth(200);
         
      jtVistaDetalle.setRowHeight(35);
      
    }
   public void QuitarLaBarraTitulo()
{
        JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        Dimension DimensionBarra = Barra.getPreferredSize();
Barra.setSize(3,3);
Barra.setPreferredSize(new Dimension(0,0));
repaint();
}
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfPRoducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbnMAS = new javax.swing.JButton();
        jbnMENOS = new javax.swing.JButton();
        jtfCantidad = new javax.swing.JTextField();
        jbnCancelar = new javax.swing.JButton();
        jlbEnServicio = new javax.swing.JLabel();
        jlbEmpleadoNombre = new javax.swing.JLabel();
        FECHAACTUAL = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbAgregarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVistaDetalle = new javax.swing.JTable();
        jbPagar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlNumVenta = new javax.swing.JLabel();
        jbQuitarProd = new javax.swing.JButton();
        jlTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbVentasRep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logito.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 50, 120, 120));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setText("Cantidad:");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, -1, -1));

        jtfPRoducto.setFont(new java.awt.Font("Garamond", 0, 20)); // NOI18N
        jtfPRoducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPRoductoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jtfPRoducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 250, 50));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel3.setText("Total:");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 820, 100, -1));

        jbnMAS.setBackground(new java.awt.Color(153, 255, 153));
        jbnMAS.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbnMAS.setForeground(new java.awt.Color(255, 255, 255));
        jbnMAS.setText("+");
        jbnMAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnMASActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbnMAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, 90, 50));

        jbnMENOS.setBackground(new java.awt.Color(255, 102, 102));
        jbnMENOS.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbnMENOS.setForeground(new java.awt.Color(255, 255, 255));
        jbnMENOS.setText("-");
        jbnMENOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnMENOSActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbnMENOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, 90, 50));

        jtfCantidad.setFont(new java.awt.Font("Garamond", 0, 20)); // NOI18N
        jtfCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCantidadActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jtfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, 70, 50));

        jbnCancelar.setBackground(new java.awt.Color(248, 92, 61));
        jbnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jbnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbnCancelar.setText("CANCELAR");
        jbnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnCancelarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 940, 240, 80));

        jlbEnServicio.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jlbEnServicio.setText("Empleado en servicio:");
        jDesktopPane1.add(jlbEnServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 50));

        jlbEmpleadoNombre.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jlbEmpleadoNombre.setText("...");
        jDesktopPane1.add(jlbEmpleadoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 170, 50));

        FECHAACTUAL.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        FECHAACTUAL.setText("...");
        jDesktopPane1.add(FECHAACTUAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 180, 40));

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel9.setText("Venta General");
        jDesktopPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, 40));

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel10.setText("Código");
        jDesktopPane1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jbAgregarProducto.setBackground(new java.awt.Color(0, 204, 0));
        jbAgregarProducto.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jbAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregarProducto.setText("Agregar");
        jbAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarProductoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 320, 160, 60));

        jtVistaDetalle.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        jtVistaDetalle.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jtVistaDetalle);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 1360, 350));

        jbPagar.setBackground(new java.awt.Color(69, 194, 63));
        jbPagar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jbPagar.setForeground(new java.awt.Color(255, 255, 255));
        jbPagar.setText("EFECTIVO");
        jbPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPagarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 930, 320, 80));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel5.setText("Fecha:");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 40));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel6.setText("#");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 40, 40));

        jlNumVenta.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jlNumVenta.setText(".");
        jDesktopPane1.add(jlNumVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 110, 40));

        jbQuitarProd.setBackground(new java.awt.Color(255, 51, 51));
        jbQuitarProd.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jbQuitarProd.setForeground(new java.awt.Color(255, 255, 255));
        jbQuitarProd.setText("Eliminar");
        jDesktopPane1.add(jbQuitarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 320, 140, 60));

        jlTotal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jDesktopPane1.add(jlTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 810, 200, 70));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel8.setText("$");
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 800, 60, 80));

        jbVentasRep.setBackground(new java.awt.Color(204, 204, 255));
        jbVentasRep.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jbVentasRep.setForeground(new java.awt.Color(255, 255, 255));
        jbVentasRep.setText("Tickets");
        jbVentasRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVentasRepActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbVentasRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 100, 110, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1646, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnMENOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnMENOSActionPerformed
   

    }//GEN-LAST:event_jbnMENOSActionPerformed

    private void jtfCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCantidadActionPerformed

    private void jbnMASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnMASActionPerformed
  
    }//GEN-LAST:event_jbnMASActionPerformed

    private void jtfPRoductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPRoductoActionPerformed
       
        
    }//GEN-LAST:event_jtfPRoductoActionPerformed

    private void jbAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarProductoActionPerformed
  
    
    }//GEN-LAST:event_jbAgregarProductoActionPerformed


    private void jbnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnCancelarActionPerformed
    
    }//GEN-LAST:event_jbnCancelarActionPerformed

    private void jbPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPagarActionPerformed

    private void jbVentasRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVentasRepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVentasRepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel FECHAACTUAL;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbAgregarProducto;
    public javax.swing.JButton jbPagar;
    public javax.swing.JButton jbQuitarProd;
    public javax.swing.JButton jbVentasRep;
    public javax.swing.JButton jbnCancelar;
    public javax.swing.JButton jbnMAS;
    public javax.swing.JButton jbnMENOS;
    public javax.swing.JLabel jlNumVenta;
    public javax.swing.JLabel jlTotal;
    public static javax.swing.JLabel jlbEmpleadoNombre;
    public javax.swing.JLabel jlbEnServicio;
    public javax.swing.JTable jtVistaDetalle;
    public javax.swing.JTextField jtfCantidad;
    public javax.swing.JTextField jtfPRoducto;
    // End of variables declaration//GEN-END:variables
}
