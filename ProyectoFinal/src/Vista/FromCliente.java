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



import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author Miguel Falcon
 */
public class FromCliente  /*javax.swing.JFrame */extends javax.swing.JInternalFrame {

    public  DefaultTableModel tcliente = new DefaultTableModel();
    public FromCliente() {
        initComponents();
        this.setBorder(null);
        tablaVista.setModel(tcliente);
        tcliente.addColumn("Número de Cliente");
             tcliente.addColumn("Nombre");
             tcliente.addColumn("Clave");
             tcliente.addColumn("Dirección");
             tcliente.addColumn("Teléfono");
             tcliente.addColumn("Email");
             tcliente.addColumn("RFC");
          //tablaCliente.setModel(cliente.cargarCliente());
         this.QuitarLaBarraTitulo();
           
      TableColumn columna;
      columna=tablaVista.getColumnModel().getColumn(0);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
         
      tablaVista.setRowHeight(35);
     //  jLabel6.setOpaque(true);
        
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
        jbnNuevoCliente = new javax.swing.JButton();
        jtfClienteID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNombreID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfDomicilioID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfRfc = new javax.swing.JTextField();
        jtfCorreoID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfTelefonoID = new javax.swing.JTextField();
        jbCancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaVista = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jbnGuardarCliente1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jbnEditarCliente1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        jbnNuevoCliente.setBackground(new java.awt.Color(0, 128, 0));
        jbnNuevoCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbnNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jbnNuevoCliente.setText("Regristrar nuevo cliente");
        jbnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnNuevoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jbnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 270, 70));

        jtfClienteID.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jtfClienteID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfClienteIDFocusLost(evt);
            }
        });
        jtfClienteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClienteIDActionPerformed(evt);
            }
        });
        jtfClienteID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfClienteIDKeyReleased(evt);
            }
        });
        jPanel1.add(jtfClienteID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 170, 40));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 80, -1));

        jtfNombreID.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jtfNombreID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfNombreID.setEnabled(false);
        jtfNombreID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreIDActionPerformed(evt);
            }
        });
        jtfNombreID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreIDKeyReleased(evt);
            }
        });
        jPanel1.add(jtfNombreID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 410, 40));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel4.setText("Domicilio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 90, -1));

        jtfDomicilioID.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jtfDomicilioID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfDomicilioID.setEnabled(false);
        jPanel1.add(jtfDomicilioID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 410, 40));

        jLabel5.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 350, 60, -1));

        jtfRfc.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jtfRfc.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfRfc.setEnabled(false);
        jPanel1.add(jtfRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 290, 410, 40));

        jtfCorreoID.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jtfCorreoID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfCorreoID.setEnabled(false);
        jPanel1.add(jtfCorreoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 340, 410, 40));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel3.setText("Teléfono:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, 90, -1));

        jtfTelefonoID.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jtfTelefonoID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfTelefonoID.setEnabled(false);
        jPanel1.add(jtfTelefonoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 240, 250, 40));

        jbCancelar.setBackground(new java.awt.Color(255, 102, 102));
        jbCancelar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 940, 290, 70));

        tablaVista.setFont(new java.awt.Font("Garamond", 0, 20)); // NOI18N
        tablaVista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaVista);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 1440, 320));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel7.setText("Código:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 90, 30));

        jbnGuardarCliente1.setBackground(new java.awt.Color(154, 205, 50));
        jbnGuardarCliente1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbnGuardarCliente1.setForeground(new java.awt.Color(255, 255, 255));
        jbnGuardarCliente1.setText("Guardar");
        jbnGuardarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnGuardarCliente1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbnGuardarCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 940, 280, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logito.png"))); // NOI18N
        jLabel8.setText("jLabel1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 20, 120, 120));

        jbnEditarCliente1.setBackground(new java.awt.Color(0, 128, 128));
        jbnEditarCliente1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbnEditarCliente1.setForeground(new java.awt.Color(255, 255, 255));
        jbnEditarCliente1.setText("Editar");
        jbnEditarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEditarCliente1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbnEditarCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 800, 290, 70));

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 240, 40));

        jLabel9.setBackground(new java.awt.Color(13, 117, 241));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 480, 10));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel6.setText("RFC:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 300, 42, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnNuevoClienteActionPerformed

    }//GEN-LAST:event_jbnNuevoClienteActionPerformed

    private void jtfClienteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClienteIDActionPerformed

    }//GEN-LAST:event_jtfClienteIDActionPerformed

    private void jtfClienteIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfClienteIDKeyReleased
    
    }//GEN-LAST:event_jtfClienteIDKeyReleased

    private void jtfNombreIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreIDActionPerformed

    private void jtfNombreIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreIDKeyReleased
        
    }//GEN-LAST:event_jtfNombreIDKeyReleased

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

       
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfClienteIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfClienteIDFocusLost

    }//GEN-LAST:event_jtfClienteIDFocusLost

    private void jbnGuardarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnGuardarCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnGuardarCliente1ActionPerformed

    private void jbnEditarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEditarCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnEditarCliente1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JButton jbCancelar;
    public javax.swing.JButton jbnEditarCliente1;
    public javax.swing.JButton jbnGuardarCliente1;
    public javax.swing.JButton jbnNuevoCliente;
    public javax.swing.JTextField jtfClienteID;
    public javax.swing.JTextField jtfCorreoID;
    public javax.swing.JTextField jtfDomicilioID;
    public javax.swing.JTextField jtfNombreID;
    public javax.swing.JTextField jtfRfc;
    public javax.swing.JTextField jtfTelefonoID;
    public javax.swing.JTable tablaVista;
    // End of variables declaration//GEN-END:variables
}
