/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

;

import java.sql.*;

public class DbConexion {
    static Connection con;
    static final String driver="com.mysql.jdbc.Driver";
//Connection con;
static final  String user="root";
static final String passw="";
static final String url="jdbc:mysql://localhost:3306/store";
String codigoProducto;

    public String getCodigoProducto() {
        return codigoProducto;
    }


 
    public String getPassw() {
        return passw;
    }

    
/*
    String dbHost="localhost";
    String dbPort="1433";
    String dbName="store";
    String dbUser="us1";
    String dbPass="123456789Iron1624";
    String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";*/





public void Conexion() throws ClassNotFoundException, SQLException {
         //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //String query ="jdbc:sqlserver://DESKTOP-3T2SGMT\\SQLEXPRESS:1433;databaseName=store;user=us1;password=123456789;";  
       //con = DriverManager.getConnection(query);
       con=null;
       try {
        Class.forName(driver);
        con=DriverManager.getConnection(url,user,passw);
        if(con!=null){
         System.out.println("nos conectamos chi cheñol");}
    } catch (Exception e) {
           System.out.println("Error al conectar"+e);
    }
       
     
}
 public void actualizar(String query){
        Statement sm;
        try {
            sm = con.createStatement();
            sm.execute(query);
        } catch (SQLException e) {
            System.err.println("Error "+e.getMessage());
        }
    }
 
  public ResultSet Consultar(String query){
        ResultSet datos=null;
        Statement sm;
        try {
            sm = con.createStatement();
            datos = sm.executeQuery(query);
            
        } catch (SQLException ex) {
            System.err.println("Error: "+ex.getMessage());
        }
        return datos;
    }
   public void Insertar(String query){
       
        Statement sm;
        try {
            sm = con.createStatement();
            sm.execute(query);
        } catch (SQLException ex) {
            System.err.println("Error: "+ex.getMessage());
        }
      
    }
    public void Eliminar(String query){
        Statement sm;
        try {
            sm = con.createStatement();
            sm.execute(query);
        } catch (SQLException e) {
            System.err.println("Error "+e.getMessage());
        }
    }
        
}