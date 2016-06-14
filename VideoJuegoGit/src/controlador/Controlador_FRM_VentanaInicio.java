package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ArchivosJugador;
import modelo.MetodosJugador;
import modelo.Sonido;
import vista.FRM_RegistroJugador;
import vista.FRM_VentanaInicio;
import vista.FRM_VentanaJuego;
import vista.FRM_VentanaPuntajes;


/**
 *
 * @author yirlany
 */
public class Controlador_FRM_VentanaInicio implements ActionListener {
    
    //Referencias de clases
    ArchivosJugador archivosJugador;
    FRM_VentanaInicio fRM_VentanaInicio;
    FRM_VentanaJuego fRM_VentanaJuego;
    FRM_VentanaPuntajes fRM_VentanaPuntajes;
    FRM_RegistroJugador fRM_RegistroJugador;
    MetodosJugador metodosJugador;    
    Sonido sonido;
    
    //Contructor de la clase
    public Controlador_FRM_VentanaInicio(FRM_VentanaInicio fRM_VentanaInicio,
                                         FRM_VentanaJuego fRM_VentanaJuego,
                                         FRM_VentanaPuntajes fRM_VentanaPuntajes,
                                         FRM_RegistroJugador fRM_RegistroJugador
                                         ) {
        
        archivosJugador = new ArchivosJugador();
        metodosJugador = new MetodosJugador(archivosJugador);
        this.fRM_VentanaInicio = fRM_VentanaInicio;
        this.fRM_VentanaJuego = fRM_VentanaJuego;
        this.fRM_VentanaPuntajes = fRM_VentanaPuntajes;
        this.fRM_RegistroJugador = fRM_RegistroJugador; 
        
        sonido = new Sonido();        
//        s.musicaInicio();    

        //Carga el archivo omprueba si el archivo fue cargado
        if(archivosJugador.cargarInfoArchivoJugador()) {
            System.out.println("Se cargó el archvio en controlador-");
        }else {
            System.out.println("No se cargó el archivo en controlador");
        }
        
        //Para que el arrayJugador sea igual a la información que trae el método
        metodosJugador.arrayJugador = archivosJugador.leerInfoArchivoEstudiante();

    }//Fin del constructor
    
    public void actionPerformed (ActionEvent e) {
        
        if(e.getActionCommand().equals("Jugar")) {
            
            this.fRM_VentanaInicio.setVisible(false);
            this.fRM_VentanaJuego.setVisible(true);
            //this.instrucciones.setVisible(true);
            
            this.fRM_VentanaJuego.limpiarPuntaje();
                        
            fRM_VentanaJuego.resetearPuntaje();
           
//            s.detenerMusica();
//            s.musicaJuego();
                    
        }
        
        if(e.getActionCommand().equals("Puntajes")) {
            this.fRM_VentanaInicio.setVisible(false);
            this.fRM_VentanaPuntajes.setVisible(true);
            if(metodosJugador.consultarEstudiante()) {
                System.err.println("Entró");
                this.fRM_VentanaPuntajes.mostrarPuntaje(metodosJugador.getArregloInformacion());
            }
        }
        
        if(e.getActionCommand().equals("Guardar")) {
            if(!this.fRM_RegistroJugador.getNombre().equals("")) {
                metodosJugador.agregarJugador(fRM_RegistroJugador.extraerDatos());
                metodosJugador.escribirInformacionArchivo();
                this.fRM_RegistroJugador.setVisible(false);
                this.fRM_VentanaInicio.setVisible(true);
                this.fRM_RegistroJugador.limpiarCampos();                
            }else {
                this.fRM_RegistroJugador.msjJugador();
            }

        }
        
        if(e.getActionCommand().equals("Atras")) {
            this.fRM_VentanaInicio.manejoDeVentanas();
        }
        
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
    }//Fin del método actionPerformed
    
    /**
     * Método que es llamado por un evento KeyPressed en la clase
     * FRM_VentanaInicio. Sirve para iniciar el juego con la tecla -Intro-
     */
    public void jugarRapido() {
        
        this.fRM_VentanaJuego.setVisible(true);
        this.fRM_VentanaInicio.setVisible(false);        

    }
    
    /**
     * Método que es llamado por un evento KeyPressed en la clase
     * FRM_VentanaInicio. Sirve para ver los puntajes con la tecla -Intro-
     */
    public  void puntajesRapido() {
        
        this.fRM_VentanaPuntajes.setVisible(true);
        this.fRM_VentanaInicio.setVisible(false);
        
    }
    
}//Fin de la clase Controlador_FRM_VentanaInicio
