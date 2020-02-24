/**
 * Farmacia San Gaabriel
 * version 2.
 * 
 */
 
package Controlador;

import Modelo.DbConexion;
import Vista.FromVenta;
import Vista.LoginMenu1;
import Vista.VentasTotales;
import static java.awt.Frame.MAXIMIZED_BOTH;
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
 * 
 * @author Candy and Gerardo
 */

public class ControlVenta implements ActionListener {
    int contNumVenta;
    LoginMenu1 vLoginMenu1;
    DbConexion db;
    FromVenta vVenta;
    int contProd;
    double a;
    LoginMenu1 vLoginv1;
    VentasTotales vTotales;
    float precio;
    double cambio;
    
    /**
     * 
     * @param db it's the object recive was created file ControladorMain 
     */
    
    public ControlVenta(DbConexion db, FromVenta vVenta,LoginMenu1 vLoginv1,VentasTotales vTotales) {
      this.db=db;
      this.vVenta=vVenta;
      this.vLoginv1=vLoginv1;
      this.vTotales=vTotales;
      this.vVenta.jbnCancelar.addActionListener(this);
      this.vVenta.jbnMENOS.addActionListener(this);
      this.vVenta.jbnMAS.addActionListener(this);
      this.vVenta.jbAgregarProducto.addActionListener(this);
      this.vVenta.jbPagar.addActionListener(this);
      this.vVenta.jbQuitarProd.addActionListener(this);
      this.vVenta.jbVentasRep.addActionListener(this);
      idProd();
      this.vVenta.jlNumVenta.setText(String.valueOf(contNumVenta));
      carga();
    }

    public void actionPerformed(ActionEvent ae){
        JButton boton=(JButton) ae.getSource();   

        
        if (boton.equals(vVenta.jbnCancelar)) {
            db.Eliminar("delete detalleVenta where idVenta="+vVenta.jlNumVenta+";");
            carga();
    }

        if (boton.equals(vVenta.jbVentasRep)) {
             vTotales.setVisible(true);
    }

        if (boton.equals(vVenta.jbPagar)) {
            a=Double.parseDouble(JOptionPane.showInputDialog(null, "Efectivo recibido :"));
            cambio=(a-(Double.parseDouble(vVenta.jlTotal.getText())));
            if(cambio>=0){
                try {
                leerJtable();
                } catch (SQLException ex) {
                Logger.getLogger(ControlVenta.class.getName()).log(Level.SEVERE, null, ex);
                }
                String cc="insert into venta values("+contNumVenta+" , "+vVenta.jlTotal.getText()+" , '"+vVenta.jlbEmpleadoNombre.getText()+"', '"+vVenta.FECHAACTUAL.getText()+"');";
                db.Eliminar(cc); 
                JOptionPane.showMessageDialog(null, "Cambio"+cambio);
                vVenta.jtfPRoducto.setText("");
                vVenta.jtfCantidad.setText("");
                contNumVenta++;
                vVenta.jlNumVenta.setText(String.valueOf(contNumVenta));
                vVenta.jtVistaDetalle.removeAll();
                carga();
            }else{
            a=Double.parseDouble(JOptionPane.showInputDialog(null, "Resta:"+cambio));
            vVenta.jlTotal.setText(String.valueOf(cambio));
            
            }
            vVenta.jlTotal.setText("");
    }


        if (boton.equals(vVenta.jbnMENOS)) {
             if(contProd>1){
             contProd--;
             vVenta.jtfCantidad.setText(String.valueOf(contProd));
             }
    }

        if (boton.equals(vVenta.jbnMAS)) {
             contProd++;
             vVenta.jtfCantidad.setText(String.valueOf(contProd));
    }    

        if (boton.equals(vVenta.jbQuitarProd)) {
                       if (vVenta.jtVistaDetalle.getSelectedRow() != -1) {
                      String codigo = (String) vVenta.tbDetalleV.getValueAt(vVenta.jtVistaDetalle.getSelectedRow(), 0);
                      db.Eliminar("delete from detalleVenta where codigoProd ="+codigo+";");
                      } else {
                       JOptionPane.showMessageDialog(null, "Seleccione un producto");
                      }
                       carga();//actualizar
                       subTotal();
    } //fin boton quitar
         
         /**
          * when pressing button add 
          */
  if (boton.equals(vVenta.jbAgregarProducto)) { 
            ResultSet d =db.Consultar("select * from producto WHERE codigoProd ='"+vVenta.jtfPRoducto.getText()+"';");//consulta para saber si el codigo del producto existe 
            try {
                if(d.next()){ 
                 String cant =vVenta.jtfCantidad.getText();
                 String nombrePro=d.getString(2);//por el codigo de producto se obtine el nombre del producto 
                 precio=d.getFloat(4);//y el precio
                 float total=precio*(Integer.parseInt(cant));
                 int stock=d.getInt(7);//STOCK
                     if(Integer.parseInt(cant)<=stock){
                         if(!prodRepetido()){
                         db.Insertar("insert into detalleVenta values("+vVenta.jlNumVenta.getText()+" ,'"+vVenta.jtfPRoducto.getText()+"' , "+cant+","+total+")");  }
                     }else{
                     JOptionPane.showMessageDialog(null, "Solo se tiene en existencia :"+stock);
                     }
                    } else{
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
                }
            } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            }
         carga();//updating
         subTotal();
                   
  }//fin agregar producto 
}
    /**
     * @return all products all the products that are in the table detalleVenta
     */
    public DefaultTableModel cargarTab(DefaultTableModel pro, ResultSet rs){
        try {
            if(rs.next()){
                do{
                    Vector fila = new Vector();
                  fila.addElement(rs.getString("codigoProd"));
                  fila.addElement(rs.getString("nombreProd"));
                  fila.addElement(rs.getFloat("precio"));
                  fila.addElement(rs.getInt("cantProd"));
                  fila.addElement(rs.getFloat("subTotal"));
                  pro.addRow(fila);
       }while (rs.next());
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex.getMessage());
        }
        return pro;
    }
 /**
  * This method is responsible for updating the Table detalleVenta 
  * every time a modification 
  */
    public void carga(){
        while(vVenta.tbDetalleV.getRowCount()>0){
        vVenta.tbDetalleV.removeRow(0);
        }
         vVenta.jtVistaDetalle.setModel(cargarTab(vVenta.tbDetalleV, db.Consultar("select d.codigoProd, p.nombreProd, "
            + "p.precio,d.cantProd, d.subtotal from detalleVenta d\n" +
            "join producto p \n" +
            "on p.codigoProd =d.codigoProd  \n" +
            "where d.idVenta="+contNumVenta+";")));
         }
/**
 * this metod calculate the subTotal of Venta
 */
    public  void subTotal(){
    ResultSet n =db.Consultar("select sum(subtotal) from detalleVenta  where idVenta="+contNumVenta+";");//tabla temporal suma subtotal
            try {
                if(n.next()){
                    float total=n.getFloat(1);
                    vVenta.jlTotal.setText(String.valueOf(total));
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
   }  
    
/** 
 * @return valible boolean if the product in database at table detalleVenta is repeated or is a  new code
 */
 public boolean prodRepetido() throws SQLException{
              boolean resultado =false;
              ResultSet d =db.Consultar("select * from detalleVenta WHERE codigoProd ='"+vVenta.jtfPRoducto.getText()+"' and idVenta="+contNumVenta+";");    
                if(d.next()){
                    resultado=true;
                    int cant=d.getInt(3);//y el precio
                    float sub=d.getFloat(4);//y el precio
                    int cantTotal=Integer.parseInt(vVenta.jtfCantidad.getText())+cant;
                    float total=precio*cantTotal;
                    db.Insertar("Update detalleVenta set cantProd="+cantTotal+", subTotal="+total+" where codigoProd = '"+vVenta.jtfPRoducto.getText()+"';");
                }else{
                resultado=false;
                }
                return resultado;
 }
 
/**
 * Make a query to fill the produc table
 */
 public void leerJtable() throws SQLException, SQLException{
     int totalStock=0;
        int cols = vVenta.jtVistaDetalle.getColumnCount();//total de columnas por producto
        int fils = vVenta.jtVistaDetalle.getRowCount();//por producto
        for(int i=0; i<fils; i++) {
           String id=String.valueOf(vVenta.jtVistaDetalle.getValueAt(i,0));
           String cant=String.valueOf(vVenta.jtVistaDetalle.getValueAt(i,3));
             ResultSet d =db.Consultar("select * from producto WHERE codigoProd ='"+id+"';");    
                        if(d.next()){ 
                        totalStock=d.getInt(7);
                        }
           int disminucion=totalStock-Integer.parseInt(cant);
           db.Insertar("update producto set stock ="+disminucion+" where codigoProd = '"+id+"';");
         }
 }
 /**
  * MAKE CONSULTATION FOR to know WHICH ID FOLLOWS FOR POSSIBLE REGISTRATION IN THE DATABASE
  */
     public void idProd(){
         ResultSet d= db.Consultar("select *from detalleVenta order by idVenta DESC ;");
            try {
                if(d.next()){
                    contNumVenta=d.getInt(1);
             }} catch (SQLException ex) {
            Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
}