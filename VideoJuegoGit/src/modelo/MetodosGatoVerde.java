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
public class MetodosGatoVerde {
    
    FRM_VentanaJuego ventana;
    
    //Variables de la clase
    private static final int OESTE = 1;
    private static final int ESTE = 2;
    private int velocidad = 20;
    
    private int direccion;
    
    //Contructor de la clase
    public MetodosGatoVerde(FRM_VentanaJuego ventana) {
        this.ventana = ventana;
        setDireccion(ESTE);
    }
        
    public void moverse() {
        if(!puedeMoverse()) {
            return;
        }
        switch(direccion) {
            case OESTE:
                ventana.gatoVerde.setLocation(ventana.gatoVerde.getX() - velocidad, ventana.gatoVerde.getY());                
                break;
            case ESTE:
                ventana.gatoVerde.setLocation(ventana.gatoVerde.getX() + velocidad, ventana.gatoVerde.getY());
                break;
        }
        
    }
    
    public boolean puedeMoverse() {
        
        int x = ventana.gatoVerde.getX();
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
        
        if(ventana.gatoVerde.getY() >= 270) {
            
            ventana.gatoVerde.setLocation(0, 0);
            
        }
        
    }
   
    public boolean comprobarEnemigo() {
        
        boolean salio = false;
        
        if(ventana.gatoVerde.getY() >= 140) {
            
            salio = true;
            
        }
        
        return salio;
    }
}
