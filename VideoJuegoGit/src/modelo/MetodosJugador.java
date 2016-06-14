/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.FRM_RegistroJugador;

/**
 *
 * @author yirlany
 */
public class MetodosJugador {
    
    //Se declaran las variables
    public ArrayList <Jugador> arrayJugador;
    String arregloInformacionConsultada[]=new String[3];
    
    //Referencias
    ArchivosJugador archivosJugador;  
    
    //Constructor de la clase
    public MetodosJugador(ArchivosJugador estudianteArchivos)
    {
        
        arrayJugador = new ArrayList <Jugador>();
        this.archivosJugador = estudianteArchivos;
        
    }//Fin del constructor de la clase
    
    /*
    Método que agrega un nuevo jugador al arrayJugador si este es mayor
    @param informacion[] arreglo de información relacionada al estudiante; como
    cédula, nombre y dirección.
    */
    public void agregarJugador(String informacion[])
    {
        Jugador temporal = new Jugador(informacion[0], Integer.parseInt(informacion[1]));
        
        if(arrayJugador.isEmpty()) {
            arrayJugador.add(temporal);
        }else {
             if(Integer.parseInt(informacion[1]) > arrayJugador.get(0).getPuntaje()) {
                System.out.println("Guardó temporal");
               arrayJugador.get(0).setNombre(informacion[0]);
               arrayJugador.get(0).setPuntaje(Integer.parseInt(informacion[1]));
            }else {
                temporal = null;
            }   
        }
        
    }

    public boolean consultarEstudiante()
    {
        boolean existe=false;
        
        arregloInformacionConsultada[0]=arrayJugador.get(0).getNombre();
        arregloInformacionConsultada[1]=""+arrayJugador.get(0).getPuntaje();
        existe=true;
       
        return existe;
    }//Fin del método consultar
    
    /*
    Método que retorna arrayUsuario como un arreglo
    */
    public String[] getArregloInformacion()
    {
        
        return this.arregloInformacionConsultada;
        
    }//Fin del método getArregloInformacion
    
    public void escribirInformacionArchivo() {
        
        archivosJugador.crearArchivoJugador();
        
        for(int i=0; i<arrayJugador.size(); i++) {
            
            archivosJugador.escribirInfoArchivoJugador(arrayJugador.get(i));
            
        }
    }//Fin del método escribirInformacionArchivo
    
}//Fin de la clase MetodosEstudiante
