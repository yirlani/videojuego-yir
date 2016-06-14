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
public class MetodosGatoRosado {
     FRM_VentanaJuego ventana;
    
    //Variables de la clase
    private static final int OESTE = 1;
    private static final int ESTE = 2;
    private int velocidad = 20;
    
    private int direccion;
    
    //Contructor de la clase
    public MetodosGatoRosado(FRM_VentanaJuego ventana) {
        this.ventana = ventana;
        setDireccion(ESTE);
    }
        
    public void moverse() {
        if(!puedeMoverse()) {
            return;
        }
        switch(direccion) {
            case OESTE:
                ventana.gatoRosado.setLocation(ventana.gatoRosado.getX() - velocidad, ventana.gatoRosado.getY());                
                break;
            case ESTE:
                ventana.gatoRosado.setLocation(ventana.gatoRosado.getX() + velocidad, ventana.gatoRosado.getY());
                break;
        }
        
    }
    
    public boolean puedeMoverse() {
        
        int x = ventana.gatoRosado.getX();
        switch(direccion) {
            case OESTE:
                x--;
                break;
                
            case ESTE:
                x++;
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
            case OESTE:
                setDireccion(ESTE);
                break;
            case ESTE:
                setDireccion(OESTE);
                break;
        }
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
    
    /*
    Método que posiciona el enemigo en su estado inicial después de haber
    salido de la pantalla
    */
    public void estadoInicialEnemigo() {
        
        if(ventana.gatoRosado.getY() >= 860) {
            
            ventana.gatoRosado.setLocation(0, 0);
            
        }
        
    }
  
    public boolean comprobarEnemigo() {
        
        boolean salio = false;
        
        if(ventana.gatoRosado.getY() >= 860) {
            
            salio = true;
            
        }
        
        return salio;
    }
    
}
