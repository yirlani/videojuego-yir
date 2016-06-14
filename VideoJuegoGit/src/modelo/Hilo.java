/*
 * Segundo proyecto programado del curso de programación.
 * Universidad de Costa Rica - Sede del Pacífico Arnoldo Ferreto Segura
 */
package modelo;

import vista.FRM_RegistroJugador;
import vista.FRM_VentanaJuego;

/**
 *
 * @author yirlany
 */
public class Hilo extends Thread{

    //Referencias de la clase
    FRM_VentanaJuego ventana;
    FRM_RegistroJugador fRM_RegistroJugador;
    MetodosPersonaje metodosPersonaje;
    MetodosQueso metodosQueso;
    
    MetodosGatoGris gatoGris;
    MetodosGatoMorado gatoMorado;
    MetodosGatoRosado gatoRosado;
    MetodosGatoAzul gatoAzul;
    MetodosGatoAmarillo gatoAmarillo;
    MetodosGatoVerde gatoVerde;
        
   public Hilo(FRM_VentanaJuego ventana,
               MetodosPersonaje mp,
               MetodosQueso metodosQueso,
               MetodosGatoGris gatoGris,
               MetodosGatoMorado gatoMorado,
               MetodosGatoRosado gatoRosado,
               MetodosGatoAzul gatoAzul,
               MetodosGatoAmarillo gatoAmarillo,
               MetodosGatoVerde gatoVerde,
               FRM_RegistroJugador fRM_RegistroJugador)
   {
       this.fRM_RegistroJugador = fRM_RegistroJugador;
       this.ventana = ventana;
       this.metodosPersonaje = mp;
       this.metodosQueso =metodosQueso;
       this.gatoGris = gatoGris;
       this.gatoMorado = gatoMorado;
       this.gatoRosado = gatoRosado;
       this.gatoAzul=gatoAzul;
       this.gatoAmarillo=gatoAmarillo;
       this.gatoVerde=gatoVerde;
       
   }
   
   @Override
   
   //Método que inicia el hilo
   public void run()
   {
       try{
           while(true)
           {

               sleep(100);
               
               //Método que sirve para mover el personaje principal entre el escenario
               metodosPersonaje.moverPersonaje();
               
               //Condición que evalua los movimientos del gato gris
               if(gatoGris.puedeMoverse()) {
                   gatoGris.moverse();
               }else {
                   gatoGris.cambiarDireccion();
               }
               
               //Condición que evalua los movimientos del gato morado
               if(gatoGris.puedeMoverse()) {
                   gatoGris.moverse();
               }else {
                   gatoGris.cambiarDireccion();
               }
               
               //Condición que evalua los movimientos del gato morado
               if(gatoMorado.puedeMoverse()) {
                   gatoMorado.moverse();
               }else {
                   gatoMorado.cambiarDireccion();
               }
               
               //Condición que evalua los movimientos del gato rosado
               if(gatoRosado.puedeMoverse()) {
                   gatoRosado.moverse();
               }else {
                   gatoRosado.cambiarDireccion();
               }
               
               //Condición que evalua los movimientos del gato Azul
               if(gatoAzul.puedeMoverse()) {
                   gatoAzul.moverse();
               }else {
                   gatoAzul.cambiarDireccion();
               }
               
              // Condición que evalua los movimientos del gato Amarillo
               if(gatoAmarillo.puedeMoverse()) {
                   gatoAmarillo.moverse();
               }else {
                   gatoAmarillo.cambiarDireccion();
               }
               
               //Condición que evalua los movimientos del gato Verde
               if(gatoVerde.puedeMoverse()) {
                   gatoVerde.moverse();
               }else {
                   gatoVerde.cambiarDireccion();
               }

               
               //Métodos que comprueban las colisiones entre los objetos
               if(ventana.detectarColision()) {
                   metodosPersonaje.posicionInicialRaton();
//                   this.ventana.setVisible(false);
//                   this.fRM_RegistroJugador.setVisible(true);
                  
               }
               
               if(ventana.detectarColision()) {
                   metodosPersonaje.posicionInicialRaton();
//                   this.ventana.setVisible(false);
//                   this.fRM_RegistroJugador.setVisible(true);
                   
               }
                
               if(ventana.detectarColision()) {
                   metodosPersonaje.posicionInicialRaton();
//                   this.ventana.setVisible(false);
//                   this.fRM_RegistroJugador.setVisible(true);
                   
               }
               
               if(ventana.detectarColision()) {
                   metodosPersonaje.posicionInicialRaton();
//                   this.ventana.setVisible(false);
//                   this.fRM_RegistroJugador.setVisible(true);
                  
               }
               
               if(ventana.detectarColision()) {
                   metodosPersonaje.posicionInicialRaton();
//                   this.ventana.setVisible(false);
//                   this.fRM_RegistroJugador.setVisible(true);
                   
               }
               
               if(ventana.detectarColision()) {
                   metodosPersonaje.posicionInicialRaton();
//                   this.ventana.setVisible(false);
//                   this.fRM_RegistroJugador.setVisible(true);
                   
               }
               
               if(metodosQueso.comerQueso()) {
                   if(Integer.parseInt(metodosQueso.getPuntos()) == 3) {
                       this.ventana.setVisible(false);
                       this.fRM_RegistroJugador.setVisible(true);
                       metodosPersonaje.posicionInicialRaton();
                   }
               }
           }
           
           
       }
       catch(Exception e)
       {
           System.out.println("Error en la ejecución hilo juego: "+e);
       }
   }
   
   public void puntaje() {
       
       
       
   }
   
  
}//Fin de la clase Hilo
