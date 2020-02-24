/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DbConexion;
import Vista.FromEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ControlEmpleado implements ActionListener {
    
    FromEmpleado vEmpleado;
    DbConexion db;
    public ControlEmpleado(DbConexion db, FromEmpleado vEmpleado) {
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       JButton boton=(JButton) ae.getSource();
       
       /* if (boton.equals(vEmpleado.)) {
        }*/
    }
    
}
