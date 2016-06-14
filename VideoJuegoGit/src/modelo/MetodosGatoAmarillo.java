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
public class MetodosGatoAmarillo {
    
     FRM_VentanaJuego ventana;
    
    //Variables de la clase
    private static final int SUR = 1;
    private static final int NORTE = 2;
    private int velocidad = 60;
    
    private int direccion;
    
    //Contructor de la clase
    public MetodosGatoAmarillo(FRM_VentanaJuego ventana) {
        this.ventana = ventana;
        setDireccion(SUR);
    }
        
    public void moverse() {
        if(!puedeMoverse()) {
            return;
        }
        switch(direccion) {
            case SUR:
                    ventana.gatoAmarillo.setLocation(ventana.gatoAmarillo.getX(), ventana.gatoAmarillo.getY() - velocidad);                
                break;
            case NORTE:
                ventana.gatoAmarillo.setLocation(ventana.gatoAmarillo.getX(), ventana.gatoAmarillo.getY() + velocidad);
                break;
        }
        
    }
    
    public boolean puedeMoverse() {
        
        int y = ventana.gatoAmarillo.getY();
        switch(direccion) {
            case SUR:
                y--;
                break;
                
            case NORTE:
                y++;
                break;
        }
        //Prueba para el borde exterior
        if(y >=550) {            
            return false;
        }else if( y <= 10) {
           return false;
        }
        return true;
    }
        
    public void cambiarDireccion() {
    
        switch(direccion) {
            case SUR:
                setDireccion(NORTE);
                break;
            case NORTE:
                setDireccion(SUR);
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
        
        if(ventana.gatoAmarillo.getY() >= 620) {
            
            ventana.gatoAmarillo.setLocation(0, 0);
            
        }
        
    }
    
    public boolean comprobarEnemigo() {
        
        boolean salio = false;
        
        if(ventana.gatoAmarillo.getY() >= 420) {
            
            salio = true;
            
        }
        
        return salio;
    }
    
}
