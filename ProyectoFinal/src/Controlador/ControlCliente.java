

package Controlador;



import Modelo.DbConexion;
import Vista.FromCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @since August 2019
 * @version 3.0
 * @author Gerardo and candy
 */

public class ControlCliente implements ActionListener {
  int codigoProd,Stock;
  int codigoCat=1;
  String NombreProd,Presentacion,Marca,NITproveedo,Imagen;
  double Precio;
    FromCliente vCliente;
    DbConexion db;
    public ControlCliente(DbConexion db,FromCliente vCliente) {
    this.vCliente=vCliente;
    this.db=db;
    this.vCliente.jbCancelar.addActionListener(this);
    this.vCliente.jbnGuardarCliente1.addActionListener(this);
    this.vCliente.jbnNuevoCliente.addActionListener(this);
    carga();
    
    }
   

    @Override
   public void actionPerformed(ActionEvent ae){
        JButton boton=(JButton) ae.getSource();
       
   
        //save costumer
        if (boton.equals(vCliente.jbnGuardarCliente1)) {  
            //select *from producto order by CodigoProd DESC ResultSet d =db.Consultar("select * from producto WHERE codigoProd ='"+vVenta.jtfPRoducto.getText()+"';");    
                    //try {
                     //   if(d.next()){ 
            db.Consultar("select *from producto order by CodigoProd DESC");
            db.Insertar("Insert into producto values("+codigoProd+","+NombreProd+",1,"+Precio+", "+ Presentacion+","+Marca+","+Stock+",1, 'null');");
            carga();
        }
        
        //clean the spaces with information
        if (boton.equals(vCliente.jbCancelar)) {  
            vCliente.jtfNombreID.setEnabled(false);
            vCliente.jtfDomicilioID.setEnabled(false);
            vCliente.jtfTelefonoID.setEnabled(false);
            vCliente.jtfCorreoID.setEnabled(false);
            vCliente.jtfRfc.setEnabled(false);
            vCliente.jtfNombreID.setText("");
            vCliente.jtfDomicilioID.setText("");
            vCliente.jtfTelefonoID.setText("");
            vCliente.jtfCorreoID.setText("");
            vCliente.jtfRfc.setText("");
        }
        
        //does not allow editing following fields
        if (boton.equals(vCliente.jbnNuevoCliente)) {  
            vCliente.jtfNombreID.setEnabled(true);
            vCliente.jtfDomicilioID.setEnabled(true);
            vCliente.jtfTelefonoID.setEnabled(true);
            vCliente.jtfCorreoID.setEnabled(true);
            vCliente.jtfRfc.setEnabled(true);
        }

}
   /**
    * @return load customer table
    */
   public DefaultTableModel cargarTab(DefaultTableModel cli, ResultSet rs){
        try {
            if(rs.next()){
                do{
                    Vector fila = new Vector();
                 fila.addElement(rs.getString("NIT"));
                 fila.addElement(rs.getString("NombreCompleto"));
                 fila.addElement(rs.getString("Clave"));
                 fila.addElement(rs.getString("Direccion"));
                 fila.addElement(rs.getString("Telefono"));
                 fila.addElement(rs.getString("Email"));
                 fila.addElement(rs.getString("rfc"));
                
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
   /**
    * load customer table
    */
     public void carga(){
        while(vCliente.tcliente.getRowCount()>0){
            vCliente.tcliente.removeRow(0);
        }
         vCliente.tablaVista.setModel(cargarTab(vCliente.tcliente, db.Consultar("select * from cliente order by NIT asc;")));
        //vCliente.tablaVista.setModel(cargarTab(vCliente.tcliente, dbCliente.consultar("select * from CLIENTE order by NIT asc;")));
      
    }
     
}