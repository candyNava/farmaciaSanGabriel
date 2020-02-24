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
public class FromReportes  /*javax.swing.JFrame */extends javax.swing.JInternalFrame {

     public  DefaultTableModel tbProductoV = new DefaultTableModel();
    public FromReportes() {
        initComponents();
        this.setBorder(null);
     
        tablaVista.setModel(tbProductoV);
             tbProductoV.addColumn("Mes");
             tbProductoV.addColumn("Compras");
             tbProductoV.addColumn("Ventas");
             tbProductoV.addColumn("Marca");
             tbProductoV.addColumn("Stock");
    
    
          //tablaCliente.setModel(cliente.cargarCliente());
         this.QuitarLaBarraTitulo();
           
      TableColumn columna;
      columna=tablaVista.getColumnModel().getColumn(0);
      columna.setPreferredWidth(100);
      columna.setMaxWidth(100);
      columna.setMinWidth(100);
         
        columna=tablaVista.getColumnModel().getColumn(1);
      columna.setPreferredWidth(150);
      columna.setMaxWidth(150);
      columna.setMinWidth(150);
         
      tablaVista.setRowHeight(35);
      
        
    }

 public void tamanoJtable(){
 //tablaVista.getColumnModel().getColumn(0).setPreferredWidth(100);
 
 }
   
    public void QuitarLaBarraTitulo()
{
        JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        Dimension DimensionBarra = Barra.getPreferredSize();
Barra.setSize(3,3);
Barra.setPreferredSize(new Dimension(0,0));
repaint();
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
        jbNuevoProducto = new javax.swing.JButton();
        jtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtPresentacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfCategoria = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jbCancelar = new javax.swing.JButton();
        jbEditarProd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaVista = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jbGuardarProducto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox();
        jtfCategoria1 = new javax.swing.JLabel();
        jtfCategoria2 = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbNuevoProducto.setBackground(new java.awt.Color(0, 128, 0));
        jbNuevoProducto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevoProducto.setText("Regristrar nuevo producto");
        jbNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 270, 70));

        jtfCodigo.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jtfCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoFocusLost(evt);
            }
        });
        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });
        jtfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyReleased(evt);
            }
        });
        jPanel1.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 200, 40));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 80, -1));

        jtfNombre.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jtfNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfNombre.setEnabled(false);
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreKeyReleased(evt);
            }
        });
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 200, 40));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jLabel4.setText("Presentacion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 160, -1));

        jtPresentacion.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jtPresentacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtPresentacion.setEnabled(false);
        jPanel1.add(jtPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 410, 40));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Almacen");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 190, 40));

        jtfCategoria.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jtfCategoria.setText("Marca:");
        jPanel1.add(jtfCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 100, -1));

        jtfMarca.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jtfMarca.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfMarca.setEnabled(false);
        jPanel1.add(jtfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 320, 410, 40));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jLabel3.setText("Precio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 280, 90, -1));

        jtfPrecio.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jtfPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfPrecio.setEnabled(false);
        jPanel1.add(jtfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 270, 150, 40));

        jbCancelar.setBackground(new java.awt.Color(255, 102, 102));
        jbCancelar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 700, 250, 70));

        jbEditarProd.setBackground(new java.awt.Color(0, 128, 128));
        jbEditarProd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbEditarProd.setForeground(new java.awt.Color(255, 255, 255));
        jbEditarProd.setText("Editar");
        jbEditarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarProdActionPerformed(evt);
            }
        });
        jPanel1.add(jbEditarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 520, 250, 70));

        tablaVista.setFont(new java.awt.Font("Garamond", 0, 20)); // NOI18N
        tablaVista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaVista);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 1200, 500));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jLabel7.setText("Código:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 90, 30));

        jbGuardarProducto.setBackground(new java.awt.Color(154, 205, 50));
        jbGuardarProducto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbGuardarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardarProducto.setText("Guardar");
        jbGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 610, 250, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logito.png"))); // NOI18N
        jLabel8.setText("jLabel1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 30, 120, 120));

        jcbCategoria.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Seleccionar-", "Pastillas", "Píldora", "Jarabe", "Ampolleta", "Soluble", "Producto General" }));
        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 140, 50));

        jtfCategoria1.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jtfCategoria1.setText("Cantidad:");
        jPanel1.add(jtfCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 380, 100, 40));

        jtfCategoria2.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jtfCategoria2.setText("Categoría:");
        jPanel1.add(jtfCategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, 100, -1));

        jtfCantidad.setEditable(false);
        jtfCantidad.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jPanel1.add(jtfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 370, 140, 50));

        jbBuscar.setFont(new java.awt.Font("Candara", 0, 21)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Candy\\Documents\\NetBeansProjects\\ProyectoFinal\\ProyectoFinal\\src\\Imagenes\\searcher_magnifyng_glass_search_locate_find_icon_123813.png")); // NOI18N
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 60, 40));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("------------------------");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoProductoActionPerformed

    }//GEN-LAST:event_jbNuevoProductoActionPerformed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed

    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jtfCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyReleased
    
    }//GEN-LAST:event_jtfCodigoKeyReleased

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased
        
    }//GEN-LAST:event_jtfNombreKeyReleased

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

       
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEditarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarProdActionPerformed
        

    }//GEN-LAST:event_jbEditarProdActionPerformed

    private void jtfCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoFocusLost

    }//GEN-LAST:event_jtfCodigoFocusLost

    private void jbGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarProductoActionPerformed

    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed
       
    }//GEN-LAST:event_jcbCategoriaActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JButton jbBuscar;
    public javax.swing.JButton jbCancelar;
    public javax.swing.JButton jbEditarProd;
    public javax.swing.JButton jbGuardarProducto;
    public javax.swing.JButton jbNuevoProducto;
    public javax.swing.JComboBox jcbCategoria;
    public javax.swing.JTextField jtPresentacion;
    public javax.swing.JTextField jtfCantidad;
    public javax.swing.JLabel jtfCategoria;
    public javax.swing.JLabel jtfCategoria1;
    public javax.swing.JLabel jtfCategoria2;
    public javax.swing.JTextField jtfCodigo;
    public javax.swing.JTextField jtfMarca;
    public javax.swing.JTextField jtfNombre;
    public javax.swing.JTextField jtfPrecio;
    public javax.swing.JTable tablaVista;
    // End of variables declaration//GEN-END:variables
}
