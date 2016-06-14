/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vista.FRM_VentanaJuego;

/**
 *
 * @author yirlany
 */
public class MetodosGatoAzul {
   
  FRM_VentanaJuego ventana;
    
    //Variables de la clase
    private static final int ESTE = 1;
    private static final int OESTE = 2;
    private int velocidad = 20;
    
    private int direccion;
    
    //Contructor de la clase
    public MetodosGatoAzul(FRM_VentanaJuego ventana) {
        this.ventana = ventana;
        setDireccion(OESTE);
    }
        
    public void moverse() {
        if(!puedeMoverse()) {
            return;
        }
        switch(direccion) {
            case ESTE:
                ventana.gatoAzul.setLocation(ventana.gatoAzul.getX() + velocidad, ventana.gatoAzul.getY());                
                break;
            case OESTE:
                ventana.gatoAzul.setLocation(ventana.gatoAzul.getX() - velocidad, ventana.gatoAzul.getY());
                break;
        }
        
    }
    
    public boolean puedeMoverse() {
        
        int x = ventana.gatoAzul.getX();
        switch(direccion) {
            case ESTE:
                x++;
                break;
                
            case OESTE:
                x--;
                break;
        }
        //Prueba para el borde exterior
        if(x >= 860) {            
            return false;
        }else if( x <= 0) {
           return false;
        }
        return true;
    }
        
    public void cambiarDireccion() {
    
        switch(direccion) {
            case ESTE:
                setDireccion(OESTE);
                break;
            case OESTE:
                setDireccion(ESTE);
                break;
        }
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
    
    public void estadoInicialEnemigo() {
        
        if(ventana.gatoAzul.getY() >= 680) {
            
            ventana.gatoAzul.setLocation(0, 0);
            
        }
        
    }
    
    public boolean comprobarEnemigo() {
        
        boolean salio = false;
        
        if(ventana.gatoAzul.getY() >= 620) {
            
            salio = true;
            
        }
        
        return salio;
    }
    
    
}//Fin de la clase MetodosGatoAzul


