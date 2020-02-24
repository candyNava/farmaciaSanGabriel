/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DbConexion;

import Vista.FromCliente;
import Vista.FromEmpleado;
import Vista.FromProducto;
import Vista.FromVenta;
import Vista.LoginMenu;
import Vista.LoginMenu1;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * 
 * Farmacia Santa Barbara
 *@version 3.0
 * @author Candy and Gerardo
 * @since Abril 2019 
 */
public class ControlLogin  implements ActionListener , KeyListener {
    LoginMenu loginMenu;
    DbConexion db;
    FromCliente vCliente;
    FromEmpleado vEmpleado;
    LoginMenu1 vLoginMenu1;
    FromVenta  vVenta;
    FromProducto vProducto;
    
    
    /**
     * @param loginMenu main class objects
     */
    public ControlLogin(LoginMenu loginMenu, DbConexion db,FromEmpleado vEmpleado ,FromCliente vCliente,LoginMenu1 vLoginMenu1,FromVenta  vVenta,FromProducto vProducto){
    this.loginMenu=loginMenu;
    this.vCliente=vCliente;
    this.db=db;
    this.vVenta=vVenta;
    this.vLoginMenu1=vLoginMenu1;
    this.vEmpleado=vEmpleado;
    this.vProducto=vProducto;
    this.loginMenu.jbnEntrar.addActionListener(this);
    this.loginMenu.jpwPSW.addActionListener(this);
    this.loginMenu.jtfUSR.addActionListener(this);
    this.vLoginMenu1.jbnCLIENTE.addActionListener(this);
    this.vLoginMenu1.jbnPRODUCTO.addActionListener(this);
    this.vLoginMenu1.jbnEMPLEADO.addActionListener(this);
    this.vLoginMenu1.jbnVENTA.addActionListener(this);
    this.vLoginMenu1.jbnSALIR.addActionListener(this);
     this.vLoginMenu1.jbnFACTURA.addActionListener(this);
    }
    
    

    @Override
   public void actionPerformed(ActionEvent ae){
        JButton boton=(JButton) ae.getSource();
       
        if (boton.equals(loginMenu.jbnEntrar)) {
             ResultSet d =db.Consultar("select * from empleado where usuario= '"+loginMenu.jtfUSR.getText()+"' and contrasena='"+loginMenu.jpwPSW.getText()+"';");    
            try {
                if(d.next()){
                loginMenu.setVisible(false);
                vLoginMenu1.setVisible(true);               
                vLoginMenu1.arrastrar(true);
                vLoginMenu1.setExtendedState(MAXIMIZED_BOTH);
                } else{
                    JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }

        if (boton.equals(vLoginMenu1.jbnCLIENTE )) { //If the client button is active
                 vLoginMenu1.Menu.removeAll();//clear the animation of botons
                 vLoginMenu1.Menu.add(vCliente);//add internalframe client at frame Menu
                 vLoginMenu1.setVisible(true);//make visible Principal frma
                 vCliente.setVisible(true);  //make visible InternaFrame
                 vLoginMenu1.arrastrar(true);//call the animation of botons
     
         }
    
         if (boton.equals(vLoginMenu1.jbnFACTURA )) {
                 vLoginMenu1.Menu.removeAll();
                 vLoginMenu1.Menu.add(vCliente);
                 vLoginMenu1.setVisible(true);
                 vCliente.setVisible(true);  
                 vLoginMenu1.arrastrar(true);
     
         }

        if (boton.equals(vLoginMenu1.jbnVENTA )) {
            vVenta.jlbEmpleadoNombre.setText(loginMenu.jtfUSR.getText());
              vLoginMenu1.Menu.removeAll();
              vLoginMenu1.Menu.add(vVenta);  
              vLoginMenu1.setVisible(true); 
              vLoginMenu1.arrastrar(true);
               vVenta.setVisible(true); 
         }
     
        if (boton.equals(vLoginMenu1.jbnPRODUCTO)) {
              vLoginMenu1.Menu.removeAll();
              vLoginMenu1.Menu.add(vProducto); 
              vLoginMenu1.setVisible(true);
              vProducto.setVisible(true);  
              vLoginMenu1.arrastrar(true); 
 

              
         }
                  if (boton.equals(vLoginMenu1.jbnSALIR)) {
                 int i= JOptionPane.showConfirmDialog(null,"Usted esta apunto de cerrar sesión . ¿Desea continuar? ");
                  if(JOptionPane.YES_OPTION ==i){
                  System.exit(0);
                  }else{
                  
                  }
         }
     
    

   }
   

   @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_ENTER){
                try {
                ResultSet d =db.Consultar("select * from empleado where usuario= '"+loginMenu.jtfUSR.getText()+"' and contrasena='"+loginMenu.jpwPSW.getText()+"';");    
                if(d.next()){
                   // vLoginMenu1.arrastrar(true);
                   
                }else{
                    JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
