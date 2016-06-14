/*
 * Segundo proyecto programado del curso de programación.
 * Universidad de Costa Rica - Sede del Pacífico Arnoldo Ferreto Segura
 */
package vista;

import javax.swing.JOptionPane;
import vista.FRM_VentanaInicio;

/**
 *
 * @author yirlany
 */
public class FRM_RegistroJugador extends javax.swing.JFrame {

    //Referencias de clases
    FRM_VentanaInicio fRM_VentanaInicio;
    
    public FRM_RegistroJugador() {
        initComponents();
        
        this.setLocation(200, 10);
    
    }
    
    public String[] extraerDatos() {
        
        String var[] = new String[2];
        
        var[0] = this.jT_NombreRegistroJugador.getText();
        var[1] = this.jT_RecordRegistroJugador.getText();
        
        return var;        
    }
    
    public void limpiarCampos() {
        
        this.jT_NombreRegistroJugador.setText("");
        this.jT_RecordRegistroJugador.setText("");
        
    }
    
    public void agregarPuntaje(String puntaje) {
        this.jT_RecordRegistroJugador.setText(puntaje);
    }
    
    public String getNombre() {
        return this.jT_NombreRegistroJugador.getText();
    }
    
    public void msjJugador() {
        JOptionPane.showMessageDialog(null, "Debería escribir un nombre de jugador", "Registro Jugador",JOptionPane.INFORMATION_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jB_GuardarRegistroJugador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jT_NombreRegistroJugador = new javax.swing.JTextField();
        jT_RecordRegistroJugador = new javax.swing.JTextField();
        jL_FondoRegistroJugador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tibetan Machine Uni", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 22, 22));
        jLabel1.setText("Jugador:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 170, 70));

        jB_GuardarRegistroJugador.setBackground(new java.awt.Color(244, 7, 25));
        jB_GuardarRegistroJugador.setFont(new java.awt.Font("Tibetan Machine Uni", 1, 24)); // NOI18N
        jB_GuardarRegistroJugador.setForeground(new java.awt.Color(17, 227, 242));
        jB_GuardarRegistroJugador.setText("GUARDAR");
        jB_GuardarRegistroJugador.setActionCommand("Guardar");
        jB_GuardarRegistroJugador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 243, 255)));
        getContentPane().add(jB_GuardarRegistroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, 70));

        jLabel2.setFont(new java.awt.Font("Tibetan Machine Uni", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 17, 17));
        jLabel2.setText("Record:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 160, 50));

        jT_NombreRegistroJugador.setBackground(new java.awt.Color(151, 90, 9));
        jT_NombreRegistroJugador.setFont(new java.awt.Font("Impact", 2, 24)); // NOI18N
        jT_NombreRegistroJugador.setForeground(new java.awt.Color(204, 204, 204));
        jT_NombreRegistroJugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jT_NombreRegistroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 340, 50));

        jT_RecordRegistroJugador.setBackground(new java.awt.Color(193, 92, 6));
        jT_RecordRegistroJugador.setFont(new java.awt.Font("Impact", 2, 24)); // NOI18N
        jT_RecordRegistroJugador.setForeground(new java.awt.Color(204, 204, 204));
        jT_RecordRegistroJugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jT_RecordRegistroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 340, 50));

        jL_FondoRegistroJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contraste-colores_GIF.gif"))); // NOI18N
        getContentPane().add(jL_FondoRegistroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jB_GuardarRegistroJugador;
    private javax.swing.JLabel jL_FondoRegistroJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jT_NombreRegistroJugador;
    private javax.swing.JTextField jT_RecordRegistroJugador;
    // End of variables declaration//GEN-END:variables

    
}
