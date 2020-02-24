/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DbConexion;
import Vista.FromProducto;
import Vista.FromVenta;
import Vista.LoginMenu1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *@since August 2019
 *@version 3.0
 * @author Gerardo and Candy
 */
public class ControlProducto implements ActionListener {

    DbConexion db;
    FromProducto vProducto;
    String id=null;
    int rr=0;
    
    public ControlProducto(DbConexion db, FromProducto vProducto) {
        this.db = db;
        this.vProducto = vProducto;
        this.vProducto.jbNuevoProducto.addActionListener(this);
        this.vProducto.jbBuscar.addActionListener(this);
        this.vProducto.jbGuardarProducto.addActionListener(this);
         this.vProducto.jbEditarProd.addActionListener(this);
        this.vProducto.jbCancelar.addActionListener(this);
        carga();
        vProducto.jbGuardarProducto.setEnabled(false);
        
    }

     public void actionPerformed(ActionEvent ae){
        JButton boton=(JButton) ae.getSource(); 
        
        if (boton.equals(vProducto.jbNuevoProducto)) {
            //LIMPIA CASILLAS
              vProducto.jtfCodigo.setText("");
              vProducto.jtfNombre.setText("");
              vProducto.jtfPrecio.setText("");
              vProducto.jtPresentacion.setText("");
              vProducto.jtfCantidad.setText("");
              vProducto.jtfMarca.setText("");
             //REALIZA CONSULTA PARA SABER QUE ID SIGUE PARA POSIBLE REGISTRO EN LA BASE DE DATOS
             ResultSet d= db.Consultar("select *from producto order by CodigoProd DESC");
                    try {
                        if(d.next()){
                        id=d.getString(1);
                                }} catch (SQLException ex) {
                Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
                vProducto.jtfCodigo.setEnabled(false);
               vProducto.jtfNombre.setEnabled(true);
               vProducto.jtfPrecio.setEnabled(true);
               vProducto.jtPresentacion.setEnabled(true);
           
               vProducto.jtfCantidad.setEnabled(true);
               vProducto.jtfMarca.setEnabled(true);
               vProducto.jbBuscar.setEnabled(false);
               vProducto.jbGuardarProducto.setEnabled(true);
               rr=Integer.parseInt(id)+1;
               vProducto.jtfCodigo.setText(String.valueOf(rr));
    }
        if(boton.equals(vProducto.jbBuscar)){
             ResultSet d=db.Consultar("select *from producto WHERE CodigoProd ="+vProducto.jtfCodigo.getText()+";");     
            try {
                if(d.next()){    
                   String cd=d.getString(1); 
                   String nm=d.getString(2);   
                   double pre=d.getDouble(4);
                   String jj=d.getString(5);
                    String mar=d.getString(5);
                   int cant=d.getInt(7);
               vProducto.jtfCodigo.setText(cd);
               vProducto.jtfNombre.setText(nm);
               vProducto.jtfPrecio.setText(String.valueOf(pre));
               vProducto.jtPresentacion.setText(jj);
               // vProducto.jcbCategoria.setText(true);
               vProducto.jtfCantidad.setText(String.valueOf(cant));
               vProducto.jtfMarca.setText(mar);
                }else{
                  JOptionPane.showMessageDialog(null, "Producto no encontrado");
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }

        
          if(boton.equals(vProducto.jbEditarProd)){
 if (vProducto.tablaVista.getSelectedRow() != -1) {
                      String codigo = (String) vProducto.tbProductoV.getValueAt(vProducto.tablaVista.getSelectedRow(), 0);
                       ResultSet d =db.Consultar("select * from producto WHERE codigoProd ='"+codigo+"';");            
                try {
                    if(d.next()){
                        String cd=d.getString(1);
                        String nm=d.getString(2);
                        double pre=d.getDouble(4);
                        String jj=d.getString(5);
                        String mar=d.getString(6);
                        int stok=d.getInt(7);
                          vProducto.jtfCantidad.setEnabled(false);
                        vProducto.jtfCodigo.setText(cd);
                        vProducto.jtfNombre.setText(nm);
                        vProducto.jtfPrecio.setText(String.valueOf(pre));
                        vProducto.jtPresentacion.setText(jj);
                        // vProducto.jcbCategoria.setText(true);
                        vProducto.jtfCantidad.setText(String.valueOf(stok));
                        vProducto.jtfMarca.setText(mar);
                        
                        vProducto.jtfCodigo.setEnabled(false);
                        vProducto.jtfNombre.setEnabled(true);
                        vProducto.jtfPrecio.setEnabled(true);
                        vProducto.jtPresentacion.setEnabled(true);
      
                        vProducto.jtfCantidad.setEnabled(true);
                        vProducto.jtfMarca.setEnabled(true);
                        vProducto.jbBuscar.setEnabled(false);
                        vProducto.jbGuardarProducto.setEnabled(true);
                    }
                    
                    else {
                        JOptionPane.showMessageDialog(null, "Seleccione un producto");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            
        }
              
            
        }
    if(boton.equals(vProducto.jbCancelar)){
           
             vProducto.jtfNombre.setText("");
             vProducto.jtfPrecio.setText("");
             vProducto.jtPresentacion.setText("");
             vProducto.jtfCantidad.setText("");
             vProducto.jtfMarca.setText("");
               vProducto.jtfCodigo.setEnabled(true);
               vProducto.jtfNombre.setEnabled(false);
               vProducto.jtfPrecio.setEnabled(false);
               vProducto.jtPresentacion.setEnabled(false);
         
               vProducto.jtfCantidad.setEnabled(false);
               vProducto.jtfMarca.setEnabled(false);
               vProducto.jbBuscar.setEnabled(true);
       
     }
  
      if(boton.equals(vProducto.jbGuardarProducto)){
          
          if(vProducto.jtfCantidad.getText().equals("")||vProducto.jtfNombre.getText().equals("")||vProducto.jtfPrecio.getText().equals("")){
              JOptionPane.showMessageDialog(null, "No se permiten campos vacios");
          }else{
            try {
             if(!prodRepetido()){
             db.Insertar("insert into producto values("+rr+",'"+vProducto.jtfNombre.getText()+"',1 ,"+vProducto.jtfPrecio.getText()+",'"+vProducto.jtPresentacion.getText()+"', '"+vProducto.jtfMarca.getText()+"',"+vProducto.jtfCantidad.getText()+",1,'null')");
             }
            } catch (SQLException ex) {
                Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            carga();
               vProducto.jtfNombre.setText("");
              vProducto.jtfPrecio.setText("");
              vProducto.jtPresentacion.setText("");
              vProducto.jtfCantidad.setText("");
              vProducto.jtfMarca.setText("");
             vProducto.jbGuardarProducto.setEnabled(false);
              vProducto.jtfCodigo.setEnabled(true);
               vProducto.jtfNombre.setEnabled(false);
               vProducto.jtfPrecio.setEnabled(false);
               vProducto.jtPresentacion.setEnabled(false);
             
               vProducto.jtfCantidad.setEnabled(false);
               vProducto.jtfMarca.setEnabled(false);
               vProducto.jbBuscar.setEnabled(true);
     }}
     }

     public DefaultTableModel cargarTab(DefaultTableModel pro, ResultSet rs){
        try {
            if(rs.next()){
                do{
                    Vector fila = new Vector();
                  fila.addElement(rs.getString("codigoProd"));
                  fila.addElement(rs.getString("nombreProd"));
                  fila.addElement(rs.getFloat("precio"));
                  fila.addElement(rs.getString("marca"));
                  fila.addElement(rs.getInt("stock"));
                 pro.addRow(fila);
       }while (rs.next());
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex.getMessage());
        }
        return pro;
    }
 
     
     public void carga(){
               while(vProducto.tbProductoV.getRowCount()>0){
            vProducto.tbProductoV.removeRow(0);
        }
         vProducto.tablaVista.setModel(cargarTab(vProducto.tbProductoV, db.Consultar("select p.codigoProd, p.nombreProd, p.precio, p.marca, p.stock from producto p ")));
        //vCliente.tablaVista.setModel(cargarTab(vCliente.tcliente, dbCliente.consultar("select * from CLIENTE order by NIT asc;")));
    }
 
     
 public boolean prodRepetido() throws SQLException{
              boolean resultado =false;
              ResultSet d =db.Consultar("select * from producto WHERE codigoProd ='"+vProducto.jtfCodigo.getText()+"';");    
                if(d.next()){
                    resultado=true;
                    //NombreProd,codigoCat,Precio,Presentacion,Marca,Stock,NITproveedor,Imagen
                    db.Insertar("Update producto set nombreProd='"+vProducto.jtfNombre.getText()+"', Precio="+vProducto.jtfPrecio.getText()+", Presentacion='"+vProducto.jtPresentacion.getText()+"', marca='"+vProducto.jtfMarca.getText()+"', stock= "+vProducto.jtfCantidad.getText()+" where codigoProd = '"+vProducto.jtfCodigo.getText()+"';");
                }else{
                resultado=false;
                }
                return resultado;
 } 
}
