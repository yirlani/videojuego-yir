/*
 * Segundo proyecto programado del curso de programación.
 * Universidad de Costa Rica - Sede del Pacífico Arnoldo Ferreto Segura
 */
package modelo;

import vista.FRM_VentanaJuego;
/**
 *
 * @author yirlany
 */
public class MetodosGatoGris {

    //Referencias de la clase
    FRM_VentanaJuego ventana;
    
    //Variables de la clase
    private static final int ESTE = 1;
    private static final int OESTE = 2;
    private int velocidad = 20;
    
    private int direccion;
    
    //Contructor de la clase
    public MetodosGatoGris(FRM_VentanaJuego ventana) {
        this.ventana = ventana;
        setDireccion(OESTE);
    }
        
    public void moverse() {
        if(!puedeMoverse()) {
            return;
        }
        switch(direccion) {
            case ESTE:
                ventana.gatoGris.setLocation(ventana.gatoGris.getX() + velocidad, ventana.gatoGris.getY());                
                break;
            case OESTE:
                ventana.gatoGris.setLocation(ventana.gatoGris.getX() - velocidad, ventana.gatoGris.getY());
                break;
        }
        
    }
    
    public boolean puedeMoverse() {
        
        int x = ventana.gatoGris.getX();
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
        
        if(ventana.gatoGris.getY() >= 620) {
            
            ventana.gatoGris.setLocation(0, 0);
        } 
    }
 
    public boolean comprobarEnemigo() {
        
        boolean salio = false;
        
        if(ventana.gatoGris.getY() >= 620) {
            
            salio = true;
        }
        
        return salio;
    }
    
}//Fin de la clase MetodosGatoGris
