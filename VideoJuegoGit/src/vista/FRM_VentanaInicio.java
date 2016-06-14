/*
 * Segundo proyecto programado del curso de programación.
 * Universidad de Costa Rica - Sede del Pacífico Arnoldo Ferreto Segura
 */
package vista;

import controlador.Controlador_FRM_VentanaInicio;
import vista.FRM_RegistroJugador;

/**
 *
 * @author yirlany
 */
public class FRM_VentanaInicio extends javax.swing.JFrame {

    //Referencias de clase
    Controlador_FRM_VentanaInicio controlador_FRM_VentanaInicio;
    FRM_VentanaJuego fRM_VentanaJuego;
    FRM_VentanaPuntajes fRM_VentanaPuntajes;
    FRM_RegistroJugador fRM_RegistroJugador;
    

    
    public FRM_VentanaInicio() {
        initComponents();
        
        //Instancias de clase
        fRM_RegistroJugador = new FRM_RegistroJugador();
        fRM_VentanaJuego = new FRM_VentanaJuego(this, fRM_RegistroJugador);
        fRM_VentanaPuntajes = new FRM_VentanaPuntajes();  
        
        controlador_FRM_VentanaInicio = new Controlador_FRM_VentanaInicio(this, fRM_VentanaJuego, fRM_VentanaPuntajes, fRM_RegistroJugador);
        
        this.setLocation(200, 10);
        
        agregarEventos(controlador_FRM_VentanaInicio);
        
        this.fRM_RegistroJugador.jB_GuardarRegistroJugador.addActionListener(controlador_FRM_VentanaInicio);
        this.fRM_VentanaPuntajes.jB_Atras.addActionListener(controlador_FRM_VentanaInicio);
        
    }
    
    public void manejoDeVentanas() {
        this.fRM_VentanaPuntajes.setVisible(false);
        this.setVisible(true);
    }
    
    public void agregarEventos(Controlador_FRM_VentanaInicio controlador_FRM_VentanaInicio) {
        
        this.controlador_FRM_VentanaInicio = controlador_FRM_VentanaInicio;
        
        this.jB_Jugar.addActionListener(controlador_FRM_VentanaInicio);
        this.jB_Puntajes.addActionListener(controlador_FRM_VentanaInicio);
        this.btn_Salir.addActionListener(controlador_FRM_VentanaInicio);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB_Jugar = new javax.swing.JButton();
        jB_Puntajes = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        jl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(652, 450));
        setMinimumSize(new java.awt.Dimension(652, 450));
        setPreferredSize(new java.awt.Dimension(652, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jB_Jugar.setBackground(new java.awt.Color(241, 234, 234));
        jB_Jugar.setFont(new java.awt.Font("Tibetan Machine Uni", 1, 24)); // NOI18N
        jB_Jugar.setForeground(new java.awt.Color(18, 8, 8));
        jB_Jugar.setText("Jugar");
        jB_Jugar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 82), new java.awt.Color(0, 255, 2)));
        jB_Jugar.setFocusPainted(false);
        jB_Jugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jB_JugarKeyPressed(evt);
            }
        });
        getContentPane().add(jB_Jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, 70));

        jB_Puntajes.setBackground(new java.awt.Color(254, 247, 247));
        jB_Puntajes.setFont(new java.awt.Font("Tibetan Machine Uni", 1, 24)); // NOI18N
        jB_Puntajes.setForeground(new java.awt.Color(14, 4, 4));
        jB_Puntajes.setText("Puntajes");
        jB_Puntajes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 26), new java.awt.Color(0, 255, 2)));
        jB_Puntajes.setFocusPainted(false);
        jB_Puntajes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jB_PuntajesKeyPressed(evt);
            }
        });
        getContentPane().add(jB_Puntajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 160, 70));

        btn_Salir.setFont(new java.awt.Font("Tibetan Machine Uni", 1, 24)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(20, 10, 10));
        btn_Salir.setText("Salir");
        btn_Salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(1, 243, 250), new java.awt.Color(0, 251, 245), new java.awt.Color(7, 248, 13), new java.awt.Color(0, 255, 108)));
        getContentPane().add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 140, 70));

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contraste-colores_GIF.gif"))); // NOI18N
        getContentPane().add(jl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_JugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jB_JugarKeyPressed
       
        if(evt.getKeyCode() == 10) {
            
            controlador_FRM_VentanaInicio.jugarRapido();
            
        }
        
    }//GEN-LAST:event_jB_JugarKeyPressed

    private void jB_PuntajesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jB_PuntajesKeyPressed
      
        if(evt.getKeyCode() == 10) {
            controlador_FRM_VentanaInicio.puntajesRapido();
        }
        
    }//GEN-LAST:event_jB_PuntajesKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  new FRM_VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton jB_Jugar;
    private javax.swing.JButton jB_Puntajes;
    private javax.swing.JLabel jl_Fondo;
    // End of variables declaration//GEN-END:variables
}
