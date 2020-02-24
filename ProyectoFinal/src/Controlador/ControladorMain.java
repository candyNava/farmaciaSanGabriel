/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.DbConexion;
import Vista.LoginMenu;


import Modelo.hiloAnimacion;
import Vista.FromCliente;
import Vista.FromEmpleado;
import Vista.FromProducto;
import Vista.FromVenta;
import Vista.LoginMenu1;
import Vista.VentasTotales;
import Vista.vistaAnimacion;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.Properties;



/**
 *
 * @author CandyPalomaNavaLlama
 */
public class ControladorMain {
     public static void main(String[] args) throws ClassNotFoundException, SQLException {

        DbConexion db = new DbConexion();
        db.Conexion();
        
         LoginMenu vLogin =new LoginMenu();
         LoginMenu1 vLogin1 =new LoginMenu1();
         FromCliente vCliente =new FromCliente();
         FromEmpleado vEmpleado =new FromEmpleado();
         FromVenta vVenta =new FromVenta();
         FromProducto vProducto =new FromProducto();
          VentasTotales vTotales= new  VentasTotales();

        vistaAnimacion animacion = new vistaAnimacion();
        hiloAnimacion hilo = new hiloAnimacion(animacion,vLogin );
        hilo.start();
        animacion.setVisible(true);
        
       ControlVenta controlventa=new ControlVenta(db,vVenta,vLogin1,vTotales);   
       ControlLogin controlLogin=new ControlLogin(vLogin, db, vEmpleado, vCliente,vLogin1,vVenta, vProducto);
       ControlCliente controlCliente=new ControlCliente(db, vCliente);
       ControlReporteVentas controlVenta=new ControlReporteVentas (db, vTotales);
       ControlProducto controlProducto =new ControlProducto(db,vProducto);

       
         
     }
}
