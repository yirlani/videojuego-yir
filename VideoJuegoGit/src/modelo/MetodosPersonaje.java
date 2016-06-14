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
public class MetodosPersonaje {
    
    //Referencias de la clase
    FRM_VentanaJuego ventana;
    
    //Variables de la clase
    int velocidad = 30;
    
    //Constructor de la clase
    public MetodosPersonaje(FRM_VentanaJuego ventana) {
        this.ventana = ventana;
    }    
    
    public void posicionInicialRaton() {
        this.ventana.ratonPersonaje.setLocation(860, 560);
    }
    
    /**
     * Método que mediante condicionales permite y limita el movimiento del
     * objeto en el mundo
     */
    public void moverPersonaje() {
        
        //Si el jugador presionó la flecha izquierda
        if(ventana.estado.equals("izquierda")) {
            
            ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX() - velocidad, ventana.ratonPersonaje.getY());
            
            if(comprobarIzq()) { 
                ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX() + velocidad, ventana.ratonPersonaje.getY());
            }
            //Si el jugador soltó la flecha izquierda
        }else if(ventana.estado.equals("EnElSuelo")) {
            ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX(), ventana.ratonPersonaje.getY());
        }
        
        //Si el jugador presionó la flecha arriba
        if(ventana.estado.equals("arriba")) {
            
            ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX(), ventana.ratonPersonaje.getY() - velocidad);
            
            if(comprobarArriba()) {
                ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX(), ventana.ratonPersonaje.getY() + velocidad);
            }
            //Si el jugador soltó la tecla flecha arriba
        }else if(ventana.estado.equals("EnElSuelo")) {
            ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX(), ventana.ratonPersonaje.getY());
        }

        //Si el jugador presionó la flecha derecha
        if(ventana.estado.equals("derecha")) {
            
            ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX() + velocidad, ventana.ratonPersonaje.getY());
            
            if(comprobarDer()) {
                ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX() - velocidad, ventana.ratonPersonaje.getY());
            }
            //Si el jugador soltó la tecla flecha derecha
        }else if(ventana.estado.equals("EnElSuelo")) {
            ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX(), ventana.ratonPersonaje.getY());
        }
        
        //Si el jugadorpresionó la flecha abajo
        if(ventana.estado.equals("abajo")) {
            
            ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX(), ventana.ratonPersonaje.getY() + velocidad);
            
            if(comprobarAbajo()) {
                ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX(), ventana.ratonPersonaje.getY() - velocidad);
            }
            //Si el jugador soltó la tecla 
        }else if(ventana.estado.equals("EnElSuelo")) {
            ventana.ratonPersonaje.setLocation(ventana.ratonPersonaje.getX(), ventana.ratonPersonaje.getY());
        }
        
    }//Fin del método moverPersonaje
    
    /**
     * Método que verifica si el personaje se encuentra en -x- posición en la 
     * pantalla.
     * @return limiteIzq se convierte en -true- si se cumple la condición. 
     */
    public boolean comprobarIzq() {
        
        boolean limiteIzq = false;
        
        int location = ventana.ratonPersonaje.getX();
        //System.out.println("Location" + location);
        
        if(location <= -30) {
            limiteIzq = true;
        }
        
        return limiteIzq;
    }
    
    /**
     * Método que verifica si el personaje se encuentra en -y- posición en la 
     * pantalla.
     * @return limiteArriba se convierte en -true- si se cumple la condición. 
     */
    public boolean comprobarArriba() {
        
       boolean limiteArriba = false;
       
       int location = ventana.ratonPersonaje.getY(); 
       
       if(location < -5) {
           limiteArriba = true;
       }
       
       return limiteArriba;
    }
        
    /**
     * Método que verifica si el personaje se encuentra en -x- posición en la 
     * pantalla.
     * @return limiteDer se convierte en -true- si se cumple la condición. 
     */
    public boolean comprobarDer() {
        
        boolean limiteDer = false;
        
        int location = ventana.ratonPersonaje.getX();
        
        if(location > 895) {
            limiteDer = true;
        }
       
        return limiteDer;
    }
    
    /**
     * Método que verifica si el personaje se encuentra en -y- posición en la 
     * pantalla.
     * @return limiteIzq se convierte en -true- si se cumple la condición. 
     */
    public boolean comprobarAbajo() {
        
        boolean limiteAbajo = false;
        
        int location = ventana.ratonPersonaje.getY();
        
        if(location > 600) {
            limiteAbajo = true;
        }
        return limiteAbajo;   
    }  

    
}//Fin de la clase MetodosPersonaje
