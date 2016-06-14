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
public class MetodosGatoMorado {

    //Referencias de la clase
    FRM_VentanaJuego ventana;
    
    //Variables de la clase
    private static final int NORTE = 1;
    private static final int SUR = 2;
    private int velocidad = 60;
    
    private int direccion;
    
    //Contructor de la clase
    public MetodosGatoMorado(FRM_VentanaJuego ventana) {
        this.ventana = ventana;
        setDireccion(NORTE);
    }
        
    public void moverse() {
        if(!puedeMoverse()) {
            return;
        }
        switch(direccion) {
            case NORTE:
                ventana.gatoMorado.setLocation(ventana.gatoMorado.getX(), ventana.gatoMorado.getY() + velocidad);                
                break;
            case SUR:
                ventana.gatoMorado.setLocation(ventana.gatoMorado.getX(), ventana.gatoMorado.getY() - velocidad);
                break;
        }
        
    }
    
    public boolean puedeMoverse() {
        
        int y = ventana.gatoMorado.getY();
        switch(direccion) {
            case NORTE:
                y++;
                break;
                
            case SUR:
                y--;
                break;
        }
        //Prueba para el borde exterior
        if(y >= 550) {            
            return false;
        }else if( y <= 10) {
           return false;
        }
        return true;
    }
        
    public void cambiarDireccion() {
    
        switch(direccion) {
            case NORTE:
                setDireccion(SUR);
                break;
            case SUR:
                setDireccion(NORTE);
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
        
        if(ventana.gatoMorado.getY() >= 620) {
            
            ventana.gatoMorado.setLocation(0, 0);
            
        }
    }
   
    public boolean comprobarEnemigo() {
        
        boolean salio = false;
        
        if(ventana.gatoMorado.getY() >= 620) {
            
            salio = true;
            
        }
        
        return salio;
    }
    
}//Fin de la clase MetodosGatoGris
