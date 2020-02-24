/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Vista.LoginMenu;
import Vista.LoginMenu1;
import Vista.vistaAnimacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel Falcon
 */
public class hiloAnimacion extends Thread{
   vistaAnimacion animacion;
   LoginMenu vLoginMenu;
   public int cont=0;
    public hiloAnimacion(vistaAnimacion animacion,LoginMenu vLoginMenu) {
        this.animacion=animacion;
        this.vLoginMenu=vLoginMenu; 
    }

    
    
    
    @Override
    public void run() {
        boolean  validar=true;
        
        
         while (cont<=2) {  
            cont++;
            for (int i = 0; i < 45; i++) {
                
            try {
                
                animacion.evento.setIcon(animacion.imagenes[i]);
                animacion.evento.setIcon(animacion.imagenes[i]);    
                Thread.sleep(30); 
                
               
            } catch (InterruptedException ex) {
                Logger.getLogger(hiloAnimacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
        }
        if (cont<=3) {
            System.out.println("detenido");
            animacion.setVisible(false);
            vLoginMenu.setVisible(true);
            //vLoginMenu.arrastrar(true);
        }
        
            
        
        
            
        
        
        }
}
    
    
    

