/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cronometro;

/**
 * clase para cuando un jugador termina exitosamente una partida cronometrada o temporizada
 * @author José
 */
public class VentanaGanador extends javax.swing.JFrame {

    private String nombre;
    private String correo;
    private String tiempo;
    private int tamaño;
    private String dificultad;
    
    /**
     * Creates new form ventanaGanador
     * @param tiempo se usa para indicarle al jugador cuanto demoró en su partida
     * @param tamaño se usa para saber el tamaño de la cuadrícula en que el jugador jugaba, esto para saber en que podio va
     * @param dificultad se usa para saber la dificultad de la partida y saber en que podio meter al jugador
     */
    public VentanaGanador(String tiempo, int tamaño, String dificultad) 
    {
        this.tamaño = tamaño;
        this.tiempo = tiempo;
        this.dificultad = dificultad;
        panelError.setVisible(false);
        initComponents();
        campoTiempo.setText(tiempo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoTiempo = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        panelError = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 370));
        setPreferredSize(new java.awt.Dimension(650, 370));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 370));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 370));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 150, 243));

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Felicidades! Has terminado el juego");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tiempo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 90, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 90, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Correo electrónico:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 150, 20));

        campoTiempo.setEditable(false);
        campoTiempo.setBackground(new java.awt.Color(255, 255, 255));
        campoTiempo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        campoTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTiempo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 150, 243), 1, true));
        campoTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTiempoActionPerformed(evt);
            }
        });
        jPanel1.add(campoTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 460, 40));

        campoNombre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        campoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 150, 243), 1, true));
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 460, 40));

        campoCorreo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        campoCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 150, 243), 1, true));
        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 460, 40));

        jButton1.setBackground(new java.awt.Color(33, 150, 243));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 323, 120, 40));

        panelError.setBackground(new java.awt.Color(255, 153, 153));
        panelError.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rellene todos los campos");
        panelError.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, -1));

        jPanel1.add(panelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTiempoActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCorreoActionPerformed

    /**
     * Una vez se presiona el botón, se guardan los datos en las variables, para posteriormente agregarlos al .dat si es que entran en podio
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(campoNombre.getText() != "" || campoCorreo.getText() != "")
        {
            nombre = campoNombre.getText();
            correo = campoCorreo.getText();
        }
        else
        {
            panelError.setVisible(true);
        }
        
        MenuPrincipal ventana_menu = new MenuPrincipal();
        ventana_menu.setVisible(true);

        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelError;
    // End of variables declaration//GEN-END:variables
}
