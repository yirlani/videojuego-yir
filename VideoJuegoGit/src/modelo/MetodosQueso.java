/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Rectangle;
import vista.FRM_VentanaJuego;

/**
 *
 * @author yirlany
 */
public class MetodosQueso {
   
   FRM_VentanaJuego frm_ventanaJuego;
   MetodosPersonaje metodosPersonaje;
   private int puntos = 0;
   private int puntosAcumulados=0;
   private int direccion;
   private int velocidad;
   
   public MetodosQueso(FRM_VentanaJuego frm_ventanaJuego)
   {
       this.frm_ventanaJuego=frm_ventanaJuego;
   }
         
   public boolean comerQueso()
   {
        boolean obtenerQueso = false;
        int xRaton = frm_ventanaJuego.ratonPersonaje.getX();
        int yRaton = frm_ventanaJuego.ratonPersonaje.getY();
        
        int xQueso = frm_ventanaJuego.queso.getX();
        int yQueso = frm_ventanaJuego.queso.getY();
       
        Rectangle raton = new Rectangle(xRaton, yRaton, frm_ventanaJuego.ratonPersonaje.getWidth(), frm_ventanaJuego.ratonPersonaje.getHeight());
        Rectangle queso = new Rectangle(xQueso, yQueso, frm_ventanaJuego.queso.getWidth(),frm_ventanaJuego.queso.getHeight());
        
        if(raton.intersects(queso))
               {
                obtenerQueso = true;
                puntos = puntos + 1;
                frm_ventanaJuego.agregarPuntaje(""+puntos);

                 this.cambiarPosicionQueso(puntos);
                 
                }
        
        return obtenerQueso; 
   }
   
   public void cambiarPosicionQueso(int puntos)
   {
       
       if(puntos == 1)
       {
           frm_ventanaJuego.queso.setLocation(0, 600);

       }
       if(puntos == 2) 
       {
           frm_ventanaJuego.queso.setLocation(800,210);
       }
       if(puntos == 3)
       {
           frm_ventanaJuego.queso.setLocation(410,200);
       }
       
   }
   
   public String getPuntos() {
       return ""+this.puntos;
   }
}
