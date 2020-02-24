/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import javax.swing.JOptionPane;
import AppPackage.AnimationClass;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.xml.sax.Attributes;


/**
 *
 * @author Centauro
 */
public class LoginMenu1 extends javax.swing.JFrame {

AnimationClass Inicio= new AnimationClass();
    public LoginMenu1() {
        initComponents();
   
    }
/*
      public void paint(Graphics g) {
  Graphics2D g2d = (Graphics2D) g;
  GradientPaint horizontalGradient = new GradientPaint(0, 0, Color.WHITE, getWidth(), 0, Color.BLUE);
  g2d.setPaint(horizontalGradient);
 
  g2d.fillRect(0, 0, getWidth(), getHeight());
 
 }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jpIngreso = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlbInternet = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtfUsuario = new javax.swing.JTextField();
        jtfContrasena = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        fondoColor = new javax.swing.JLabel();
        panelSuperior = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        jlbInternet1 = new javax.swing.JLabel();
        jlMaximizar = new javax.swing.JLabel();
        PanelLogin = new javax.swing.JPanel();
        jlbMusica1 = new javax.swing.JLabel();
        jlbCalculadora1 = new javax.swing.JLabel();
        jbnPRODUCTO = new javax.swing.JButton();
        jbnPROVEEDOR = new javax.swing.JButton();
        jbnFACTURA = new javax.swing.JButton();
        jbnVENTA = new javax.swing.JButton();
        bienvenido = new javax.swing.JLabel();
        jbnCLIENTE = new javax.swing.JButton();
        jbnEMPLEADO = new javax.swing.JButton();
        jlbBIENVENIDO = new javax.swing.JLabel();
        jbnSALIR = new javax.swing.JButton();
        fondoColor2 = new javax.swing.JLabel();
        Menu = new javax.swing.JDesktopPane();
        logoAngel = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 0, -1, -1));

        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 37, 27));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 130, 110));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 130, 110));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 130, 110));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 130, 110));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 130, 110));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 130, 110));

        jpIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jpIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setText("Password:");
        jpIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 80, 40));

        jLabel5.setBackground(new java.awt.Color(238, 112, 82));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 112, 82));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_User_96px_2.png"))); // NOI18N
        jpIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 90));

        jLabel6.setBackground(new java.awt.Color(238, 112, 82));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 112, 82));
        jLabel6.setText("User:");
        jpIngreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, 40));
        jpIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 250, 30));
        jpIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 250, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Menu_32px.png"))); // NOI18N
        jpIngreso.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Key_32px.png"))); // NOI18N
        jpIngreso.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 40, 30));

        jlbInternet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpIngreso.add(jlbInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 50, -1, -1));

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpIngreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 130, 30));
        jpIngreso.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 220, 30));
        jpIngreso.add(jtfContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 220, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_customer_32px_1.png"))); // NOI18N
        jpIngreso.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        fondoColor.setBackground(new java.awt.Color(238, 112, 82));
        fondoColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoColor.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        panelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        panelSuperior.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 10));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Menu_32px.png"))); // NOI18N
        panelSuperior.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 30));

        jlbInternet1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbInternet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Globe_32px.png"))); // NOI18N
        jlbInternet1.setText("Ir al Sitio Web");
        jlbInternet1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlbInternet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbInternet1MouseClicked(evt);
            }
        });
        panelSuperior.add(jlbInternet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -20, -1, -1));

        jlMaximizar.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jlMaximizar.setForeground(new java.awt.Color(51, 51, 51));
        jlMaximizar.setText("x");
        jlMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMaximizarMouseClicked(evt);
            }
        });
        panelSuperior.add(jlMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 10, 40, 30));

        getContentPane().add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1860, 10));

        PanelLogin.setBackground(new java.awt.Color(8, 69, 129));
        PanelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelLogin.setForeground(new java.awt.Color(50, 49, 115));
        PanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbMusica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Musical_Notes_32px.png"))); // NOI18N
        jlbMusica1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelLogin.add(jlbMusica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 80, -1, -1));

        jlbCalculadora1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Calculator_32px.png"))); // NOI18N
        jlbCalculadora1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelLogin.add(jlbCalculadora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 110, -1, -1));

        jbnPRODUCTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRODUCTO.png"))); // NOI18N
        jbnPRODUCTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnPRODUCTOMouseClicked(evt);
            }
        });
        jbnPRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnPRODUCTOActionPerformed(evt);
            }
        });
        PanelLogin.add(jbnPRODUCTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -260, 230, 50));

        jbnPROVEEDOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PROVEEDOR.png"))); // NOI18N
        jbnPROVEEDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnPROVEEDORActionPerformed(evt);
            }
        });
        PanelLogin.add(jbnPROVEEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 230, 50));

        jbnFACTURA.setBackground(new java.awt.Color(100, 167, 247));
        jbnFACTURA.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jbnFACTURA.setForeground(new java.awt.Color(255, 255, 255));
        jbnFACTURA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Candy\\Documents\\NetBeansProjects\\ProyectoFinal\\ProyectoFinal\\src\\Imagenes\\FACTURA.png")); // NOI18N
        jbnFACTURA.setText("REPORTES");
        jbnFACTURA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbnFACTURA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnFACTURAActionPerformed(evt);
            }
        });
        PanelLogin.add(jbnFACTURA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -310, 230, 50));

        jbnVENTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VENTA.png"))); // NOI18N
        jbnVENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnVENTAActionPerformed(evt);
            }
        });
        PanelLogin.add(jbnVENTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -360, 230, 50));

        bienvenido.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        bienvenido.setText("BIENVENIDO");
        PanelLogin.add(bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -400, 110, 20));

        jbnCLIENTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLIENTE.png"))); // NOI18N
        jbnCLIENTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnCLIENTEMouseClicked(evt);
            }
        });
        jbnCLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnCLIENTEActionPerformed(evt);
            }
        });
        PanelLogin.add(jbnCLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -210, 230, 50));

        jbnEMPLEADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EMPLEADO.png"))); // NOI18N
        jbnEMPLEADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEMPLEADOActionPerformed(evt);
            }
        });
        PanelLogin.add(jbnEMPLEADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -160, 230, 50));

        jlbBIENVENIDO.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlbBIENVENIDO.setForeground(new java.awt.Color(255, 255, 255));
        PanelLogin.add(jlbBIENVENIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -380, 230, 20));

        jbnSALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jbnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSALIRActionPerformed(evt);
            }
        });
        PanelLogin.add(jbnSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -50, 90, 40));

        fondoColor2.setBackground(new java.awt.Color(238, 112, 82));
        fondoColor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoColor.png"))); // NOI18N
        PanelLogin.add(fondoColor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -440, 260, 450));

        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 1180));

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setForeground(new java.awt.Color(255, 255, 255));

        logoAngel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoAngel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logon.png"))); // NOI18N
        Menu.add(logoAngel);
        logoAngel.setBounds(0, 10, 1650, 1150);

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 1670, 1160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited

    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
      
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed
 public void mantener(){
            AnimationClass Inicio= new AnimationClass();
        //   jlbBIENVENIDO.setText(jlbBIENVENIDO.getText()+"\n "+String.valueOf(Login.getNombreUsuario()));
      
        
    }
   public boolean arrastrar(boolean mantener){
         AnimationClass Inicio= new AnimationClass();
         if(mantener==true){
// jlbBIENVENIDO.setText(jlbBIENVENIDO.getText()+"\n "+String.valueOf(Login.getNombreUsuario()));

        Inicio.jLabelYDown(-440, 0, 15, 10, fondoColor);
          
            Inicio.jLabelYDown(-400, 20, 15, 10, bienvenido);
            Inicio.jLabelYDown(-380, 40, 15, 10, jlbBIENVENIDO);
            
            Inicio.jButtonYDown(-360, 70, 15, 10, jbnVENTA );
            Inicio.jButtonYDown(-310, 120, 15, 10, jbnFACTURA );
            Inicio.jButtonYDown(-260, 170, 15, 10, jbnPRODUCTO );
            Inicio.jButtonYDown(-210, 220, 15, 10, jbnCLIENTE );
            Inicio.jButtonYDown(-160, 270, 15, 10, jbnEMPLEADO );
            Inicio.jButtonYDown(-110, 320, 15, 10, jbnPROVEEDOR );
            Inicio.jButtonYDown(-50, 390, 15, 10, jbnSALIR );
            Inicio=null;
            return mantener;
        }else{
             if(mantener==false){
 
            Inicio.jLabelYDown(0, 0, 15, 10, fondoColor);
            Inicio.jLabelYDown(20, 20, 15, 10, bienvenido);
            Inicio.jLabelYDown(40, 40, 15, 10, jlbBIENVENIDO);
            Inicio.jButtonYDown(70, 70, 15, 10, jbnVENTA );
            Inicio.jButtonYDown(120, 120, 15, 10, jbnPRODUCTO );
            Inicio.jButtonYDown(170, 170, 15, 10, jbnCLIENTE );
            Inicio.jButtonYDown(220, 220, 15, 10, jbnEMPLEADO );
            Inicio.jButtonYDown(270, 270, 15, 10, jbnEMPLEADO );
            Inicio.jButtonYDown(320, 320, 15, 10, jbnPROVEEDOR );
            Inicio.jButtonYDown(390, 390, 15, 10, jbnSALIR );
        }
         return mantener;
         }
             
         
    }
    
    private void jlbInternet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbInternet1MouseClicked

    }//GEN-LAST:event_jlbInternet1MouseClicked

    private void jbnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSALIRActionPerformed

    }//GEN-LAST:event_jbnSALIRActionPerformed

    private void jbnEMPLEADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEMPLEADOActionPerformed

    }//GEN-LAST:event_jbnEMPLEADOActionPerformed

    private void jbnCLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnCLIENTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnCLIENTEActionPerformed

    private void jbnCLIENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnCLIENTEMouseClicked

    }//GEN-LAST:event_jbnCLIENTEMouseClicked

    private void jbnVENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnVENTAActionPerformed

    }//GEN-LAST:event_jbnVENTAActionPerformed

    private void jbnFACTURAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnFACTURAActionPerformed

    }//GEN-LAST:event_jbnFACTURAActionPerformed

    private void jbnPROVEEDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnPROVEEDORActionPerformed

    }//GEN-LAST:event_jbnPROVEEDORActionPerformed

    private void jbnPRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnPRODUCTOActionPerformed

    }//GEN-LAST:event_jbnPRODUCTOActionPerformed

    private void jbnPRODUCTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnPRODUCTOMouseClicked

    }//GEN-LAST:event_jbnPRODUCTOMouseClicked

    private void jlMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMaximizarMouseClicked

    }//GEN-LAST:event_jlMaximizarMouseClicked

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Menu;
    public javax.swing.JPanel PanelLogin;
    public javax.swing.JLabel bienvenido;
    public javax.swing.JLabel fondoColor;
    public javax.swing.JLabel fondoColor2;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    public javax.swing.JButton jbnCLIENTE;
    public javax.swing.JButton jbnEMPLEADO;
    public javax.swing.JButton jbnFACTURA;
    public javax.swing.JButton jbnPRODUCTO;
    public javax.swing.JButton jbnPROVEEDOR;
    public javax.swing.JButton jbnSALIR;
    public javax.swing.JButton jbnVENTA;
    private javax.swing.JLabel jlMaximizar;
    public javax.swing.JLabel jlbBIENVENIDO;
    public javax.swing.JLabel jlbCalculadora1;
    private javax.swing.JLabel jlbInternet;
    private javax.swing.JLabel jlbInternet1;
    public javax.swing.JLabel jlbMusica1;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfUsuario;
    public javax.swing.JLabel logoAngel;
    public javax.swing.JLabel menu;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
}
