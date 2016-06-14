/*
 * Segundo proyecto programado del curso de programación.
 * Universidad de Costa Rica - Sede del Pacífico Arnoldo Ferreto Segura
 */
package vista;
import java.awt.Rectangle;
import modelo.Hilo;
import modelo.MetodosGatoAmarillo;
import modelo.MetodosGatoAzul;
import modelo.MetodosPersonaje;
import modelo.MetodosGatoGris;
import modelo.MetodosGatoMorado;
import modelo.MetodosGatoRosado;
import modelo.MetodosGatoVerde;
import modelo.MetodosPuntaje;
import modelo.MetodosQueso;


/**
 *
 * @author yirlany
 */
public class FRM_VentanaJuego extends javax.swing.JFrame {

    //Referencias de clases
    Hilo hilo;
    FRM_VentanaInicio frm_VentanaInicio;
    FRM_RegistroJugador frm_RegistroJugador;
    
    //Referencias de métodos
    MetodosPersonaje metodosPersonaje;
    MetodosQueso metodosQueso;
    MetodosGatoGris metodosGatoGris;
    MetodosGatoMorado metodosGatoMorado;
    MetodosGatoRosado metodosGatoRosado;
    MetodosGatoAzul metodosGatoAzul;
    MetodosGatoAmarillo metodosGatoAmarillo;
    MetodosGatoVerde metodosGatoVerde;
    MetodosPuntaje metodosPuntaje;
   
    
    //Variables de la clase
    int puntaje = 0;
    int num = 0;
    
    //Se declaran las variables
    public String estado = "EnELSuelo";
    
    
    //Constructor de la clase
    public FRM_VentanaJuego(FRM_VentanaInicio fRM_VentanaInicio, FRM_RegistroJugador fRM_RegistroJugador) {
        initComponents();
        
        this.setSize(980, 680);
        this.setLocation(200, 10);
        //System.out.println("posicion: "+this.ratonPersonaje.getY());
        
        //Instancias de la clase
        metodosPersonaje = new MetodosPersonaje(this);
        metodosQueso = new MetodosQueso(this);
        metodosGatoGris = new MetodosGatoGris(this);
        metodosGatoMorado = new MetodosGatoMorado(this);
        metodosGatoRosado = new MetodosGatoRosado(this);
        metodosGatoAzul = new MetodosGatoAzul(this);
        metodosGatoAmarillo = new MetodosGatoAmarillo(this);
        metodosGatoVerde = new MetodosGatoVerde(this);
        
        metodosPuntaje = new MetodosPuntaje(this);
                
        //Instancia de la clase hilJuego
        this.frm_VentanaInicio = fRM_VentanaInicio;
        this.frm_RegistroJugador = fRM_RegistroJugador;
        hilo = new Hilo(this,
                        metodosPersonaje,
                        metodosQueso,
                        metodosGatoGris,
                        metodosGatoMorado,
                        metodosGatoRosado,
                        metodosGatoAzul,
                        metodosGatoAmarillo,
                        metodosGatoVerde,
                        this.frm_RegistroJugador);
        hilo.start();
                
    }//Fin del constructor de la clase
    
    
    public boolean detectarColision() {
        
        boolean colision = false;
        int xPersonaje = ratonPersonaje.getX();
        int yPersonaje = ratonPersonaje.getY();
        
        int xEnemigo = gatoGris.getX();
        int yEnemigo = gatoGris.getY();
        
        int xEnemigo1 = gatoMorado.getX();
        int yEnemigo1 = gatoMorado.getY();
        
        int xEnemigo2 = gatoAzul.getX();
        int yEnemigo2 = gatoAzul.getY();
        
        int xEnemigo3 = gatoRosado.getX();
        int yEnemigo3 = gatoRosado.getY();
        
        int xEnemigo4 = gatoAmarillo.getX();
        int yEnemigo4 = gatoAmarillo.getY();
        
        int xEnemigo5 = gatoVerde.getX();
        int yEnemigo5 = gatoVerde.getY();
        
        
        Rectangle p = new Rectangle(xPersonaje, yPersonaje, ratonPersonaje.getWidth(), ratonPersonaje.getHeight());
        Rectangle e = new Rectangle(xEnemigo, yEnemigo, gatoGris.getWidth(), gatoGris.getHeight());
        Rectangle e1 = new Rectangle(xEnemigo1, yEnemigo1, gatoMorado.getWidth(), gatoMorado.getHeight());
        Rectangle e2 = new Rectangle(xEnemigo2, yEnemigo2, gatoAzul.getWidth(), gatoAzul.getHeight());
        Rectangle e3 = new Rectangle(xEnemigo3, yEnemigo3, gatoRosado.getWidth(), gatoRosado.getHeight());
        Rectangle e4 = new Rectangle(xEnemigo4, yEnemigo4, gatoAmarillo.getWidth(), gatoAmarillo.getHeight());
        Rectangle e5 = new Rectangle(xEnemigo5, yEnemigo5, gatoVerde.getWidth(), gatoVerde.getHeight());
        
        if(p.intersects(e)) {
            
            colision = true;
            frm_RegistroJugador.agregarPuntaje(metodosQueso.getPuntos());
        }
        
        if(p.intersects(e1))
        {
           colision = true;
            frm_RegistroJugador.agregarPuntaje(metodosQueso.getPuntos()); 
        }
        
         if(p.intersects(e2))
        {
            colision = true;
            frm_RegistroJugador.agregarPuntaje(metodosQueso.getPuntos());
        }
         
          if(p.intersects(e3))
        {
            colision = true;
            frm_RegistroJugador.agregarPuntaje(metodosQueso.getPuntos());
        }
          
           if(p.intersects(e4))
        {
            colision = true;
            frm_RegistroJugador.agregarPuntaje(metodosQueso.getPuntos());
        }
           
            if(p.intersects(e5))
        {
            colision = true;
            frm_RegistroJugador.agregarPuntaje(metodosQueso.getPuntos());
        }
        
            return colision;
     
      
    }//Fin del método Colision()
    
    
      
    public void agregarPuntaje(String puntaje) {
        this.jL_Puntaje.setText(puntaje);
    }
    
    public void limpiarPuntaje() {
        this.jL_Puntaje.setText("");
    }
    
    public void resetearPuntaje() {
        this.metodosPuntaje.estadoInicialPuntaje();
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ratonPersonaje = new javax.swing.JLabel();
        jL_Puntaje = new javax.swing.JLabel();
        gatoGris = new javax.swing.JLabel();
        queso = new javax.swing.JLabel();
        gatoAmarillo = new javax.swing.JLabel();
        gatoAzul = new javax.swing.JLabel();
        gatoRosado = new javax.swing.JLabel();
        gatoVerde = new javax.swing.JLabel();
        gatoMorado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(null);

        ratonPersonaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ratónPersonaje.png"))); // NOI18N
        ratonPersonaje.setPreferredSize(new java.awt.Dimension(130, 105));
        getContentPane().add(ratonPersonaje);
        ratonPersonaje.setBounds(860, 560, 90, 100);

        jL_Puntaje.setBackground(new java.awt.Color(0, 0, 0));
        jL_Puntaje.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jL_Puntaje.setForeground(new java.awt.Color(255, 231, 0));
        jL_Puntaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Puntaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        jL_Puntaje.setOpaque(true);
        getContentPane().add(jL_Puntaje);
        jL_Puntaje.setBounds(420, 10, 100, 40);

        gatoGris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gatoGris.png"))); // NOI18N
        getContentPane().add(gatoGris);
        gatoGris.setBounds(20, 10, 110, 100);

        queso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/queso.png"))); // NOI18N
        getContentPane().add(queso);
        queso.setBounds(30, 40, 40, 50);

        gatoAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gatoAmarillo.png"))); // NOI18N
        getContentPane().add(gatoAmarillo);
        gatoAmarillo.setBounds(270, 10, 110, 100);

        gatoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gatoAzul.png"))); // NOI18N
        getContentPane().add(gatoAzul);
        gatoAzul.setBounds(20, 270, 108, 100);

        gatoRosado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gatoFucsia.png"))); // NOI18N
        getContentPane().add(gatoRosado);
        gatoRosado.setBounds(860, 390, 110, 100);

        gatoVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gatoVerde.png"))); // NOI18N
        getContentPane().add(gatoVerde);
        gatoVerde.setBounds(860, 150, 110, 100);

        gatoMorado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gatoRosado.png"))); // NOI18N
        getContentPane().add(gatoMorado);
        gatoMorado.setBounds(560, 550, 110, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo-videojuego.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 982, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if(evt.getKeyCode() == 65 ) {

            estado = "izquierda";
            
        }
        if(evt.getKeyCode() == 68) {
            estado = "derecha";
            
        }
        if(evt.getKeyCode() == 87) {
            estado = "arriba";
            
        }
        if(evt.getKeyCode() == 83) {
            estado = "abajo";
            
        }
        
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        
        if(evt.getKeyCode() == 65 ) {

            estado = "EnELSuelo";
            
        }
        if(evt.getKeyCode() == 68) {
            estado = "EnELSuelo";
            
        }
        if(evt.getKeyCode() == 87) {
            estado = "EnELSuelo";
            
        }
        if(evt.getKeyCode() == 83) {
            estado = "EnELSuelo";
            
        }
        
    }//GEN-LAST:event_formKeyReleased
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel gatoAmarillo;
    public javax.swing.JLabel gatoAzul;
    public javax.swing.JLabel gatoGris;
    public javax.swing.JLabel gatoMorado;
    public javax.swing.JLabel gatoRosado;
    public javax.swing.JLabel gatoVerde;
    private javax.swing.JLabel jL_Puntaje;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel queso;
    public javax.swing.JLabel ratonPersonaje;
    // End of variables declaration//GEN-END:variables


}//Fin de la clase FRM_VentanaJuego
