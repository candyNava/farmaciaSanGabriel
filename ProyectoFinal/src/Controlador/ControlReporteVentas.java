/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.DbConexion;
import Vista.FromCliente;
import Vista.VentasTotales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;


public class ControlReporteVentas implements ActionListener {
   
    VentasTotales vCliente;
    DbConexion db;
    public ControlReporteVentas(DbConexion db,VentasTotales vCliente) {
    this.vCliente=vCliente;
    this.db=db;
    this.vCliente.jbActualizar.addActionListener(this);
    carga();
    
    }

    @Override
   public void actionPerformed(ActionEvent ae){
        JButton boton=(JButton) ae.getSource();
       
   
        
        if (boton.equals(vCliente.jbActualizar)) { 
            carga();
        }

}
   public DefaultTableModel cargarTab(DefaultTableModel cli, ResultSet rs){
        try {
            if(rs.next()){
                do{
                    Vector fila = new Vector();
                 fila.addElement(rs.getInt("idVenta"));
                 fila.addElement(rs.getFloat("total"));
                 fila.addElement(rs.getString("usuario"));
                 fila.addElement(rs.getDate("fecha"));
  
                
                 cli.addRow(fila);
       }while (rs.next());
            }else{
                System.out.println("error");
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex.getMessage());
        }
        return cli;
    }
     public void carga(){
        while(vCliente.tcliente.getRowCount()>0){
            vCliente.tcliente.removeRow(0);
        }
         vCliente.tablaVista.setModel(cargarTab(vCliente.tcliente, db.Consultar("select * from venta order by idVenta asc;")));
        //vCliente.tablaVista.setModel(cargarTab(vCliente.tcliente, dbCliente.consultar("select * from CLIENTE order by NIT asc;")));
      
    }
     
}