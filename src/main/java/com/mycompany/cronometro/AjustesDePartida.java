/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cronometro;

/**
 *
 * @author kenne
 */
public class AjustesDePartida extends javax.swing.JFrame {

    /**
     * Creates new form AjustesDePartida
     */
    public AjustesDePartida() {
        initComponents();
        lblSeleccionarTiempo.setVisible(false);
        txfHoras.setVisible(false);
        txfMinutos.setVisible(false);
        txfSegundos.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngDificultad = new javax.swing.ButtonGroup();
        btngReloj = new javax.swing.ButtonGroup();
        btngPosicion = new javax.swing.ButtonGroup();
        btngSonido = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSonido = new javax.swing.JLabel();
        lblDificultad = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblPosicion = new javax.swing.JLabel();
        rbtnFacil = new javax.swing.JRadioButton();
        rbtnIntermedio = new javax.swing.JRadioButton();
        rbtnDificil = new javax.swing.JRadioButton();
        rbtnCronometro = new javax.swing.JRadioButton();
        rbtnTemporizador = new javax.swing.JRadioButton();
        rbtnTiempo = new javax.swing.JRadioButton();
        rbtnDerecha = new javax.swing.JRadioButton();
        rbtnIzquierda = new javax.swing.JRadioButton();
        rbtnSiSonido = new javax.swing.JRadioButton();
        rbtnNoSonido = new javax.swing.JRadioButton();
        txfSegundos = new javax.swing.JTextField();
        txfHoras = new javax.swing.JTextField();
        txfMinutos = new javax.swing.JTextField();
        lblSeleccionarTiempo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTitulo.setBackground(new java.awt.Color(33, 150, 243));

        lblTitulo.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Ajustes");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(236, 236, 236))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitulo)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 110));

        lblSonido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSonido.setForeground(new java.awt.Color(0, 105, 192));
        lblSonido.setText("Sonido final:");
        jPanel1.add(lblSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        lblDificultad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDificultad.setForeground(new java.awt.Color(0, 105, 192));
        lblDificultad.setText("Nivel de dificultad:");
        jPanel1.add(lblDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lblTiempo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(0, 105, 192));
        lblTiempo.setText("Reloj:");
        jPanel1.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lblPosicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPosicion.setForeground(new java.awt.Color(0, 105, 192));
        lblPosicion.setText("Posición del panel de herramientas:");
        jPanel1.add(lblPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        rbtnFacil.setBackground(new java.awt.Color(255, 255, 255));
        btngDificultad.add(rbtnFacil);
        rbtnFacil.setForeground(new java.awt.Color(0, 105, 192));
        rbtnFacil.setText("Fácil");
        rbtnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFacilActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        rbtnIntermedio.setBackground(new java.awt.Color(255, 255, 255));
        btngDificultad.add(rbtnIntermedio);
        rbtnIntermedio.setForeground(new java.awt.Color(0, 105, 192));
        rbtnIntermedio.setText("Intermedio");
        jPanel1.add(rbtnIntermedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        rbtnDificil.setBackground(new java.awt.Color(255, 255, 255));
        btngDificultad.add(rbtnDificil);
        rbtnDificil.setForeground(new java.awt.Color(0, 105, 192));
        rbtnDificil.setText("Difícil");
        jPanel1.add(rbtnDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        rbtnCronometro.setBackground(new java.awt.Color(255, 255, 255));
        btngReloj.add(rbtnCronometro);
        rbtnCronometro.setForeground(new java.awt.Color(0, 105, 192));
        rbtnCronometro.setText("Cronómetro");
        rbtnCronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCronometroActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        rbtnTemporizador.setBackground(new java.awt.Color(255, 255, 255));
        btngReloj.add(rbtnTemporizador);
        rbtnTemporizador.setForeground(new java.awt.Color(0, 105, 192));
        rbtnTemporizador.setText("Temporizador");
        rbtnTemporizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTemporizadorActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnTemporizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        rbtnTiempo.setBackground(new java.awt.Color(255, 255, 255));
        btngReloj.add(rbtnTiempo);
        rbtnTiempo.setForeground(new java.awt.Color(0, 105, 192));
        rbtnTiempo.setText("No");
        rbtnTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTiempoActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        rbtnDerecha.setBackground(new java.awt.Color(255, 255, 255));
        btngPosicion.add(rbtnDerecha);
        rbtnDerecha.setForeground(new java.awt.Color(0, 105, 192));
        rbtnDerecha.setText("Derecha");
        jPanel1.add(rbtnDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        rbtnIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        btngPosicion.add(rbtnIzquierda);
        rbtnIzquierda.setForeground(new java.awt.Color(0, 105, 192));
        rbtnIzquierda.setText("Izquierda");
        jPanel1.add(rbtnIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        rbtnSiSonido.setBackground(new java.awt.Color(255, 255, 255));
        btngSonido.add(rbtnSiSonido);
        rbtnSiSonido.setForeground(new java.awt.Color(0, 105, 192));
        rbtnSiSonido.setText("Si");
        jPanel1.add(rbtnSiSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        rbtnNoSonido.setBackground(new java.awt.Color(255, 255, 255));
        btngSonido.add(rbtnNoSonido);
        rbtnNoSonido.setForeground(new java.awt.Color(0, 105, 192));
        rbtnNoSonido.setText("No");
        jPanel1.add(rbtnNoSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        txfSegundos.setForeground(new java.awt.Color(142, 142, 142));
        jPanel1.add(txfSegundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 30, -1));

        txfHoras.setForeground(new java.awt.Color(142, 142, 142));
        jPanel1.add(txfHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 30, -1));

        txfMinutos.setForeground(new java.awt.Color(142, 142, 142));
        jPanel1.add(txfMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 30, -1));

        lblSeleccionarTiempo.setForeground(new java.awt.Color(0, 105, 192));
        lblSeleccionarTiempo.setText("Horas   Minutos  Segundos");
        jPanel1.add(lblSeleccionarTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 105, 192));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFacilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnFacilActionPerformed

    private void rbtnTemporizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTemporizadorActionPerformed
        if (rbtnTemporizador.isSelected()) {
        lblSeleccionarTiempo.setVisible(true);
        txfHoras.setVisible(true);
        txfMinutos.setVisible(true);
        txfSegundos.setVisible(true);
    } else {
        lblSeleccionarTiempo.setVisible(false);
        txfHoras.setVisible(false);
        txfMinutos.setVisible(false);
        txfSegundos.setVisible(false);
    }
    }//GEN-LAST:event_rbtnTemporizadorActionPerformed

    private void rbtnCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCronometroActionPerformed
        if (rbtnCronometro.isSelected()) {
        lblSeleccionarTiempo.setVisible(false);
        txfHoras.setVisible(false);
        txfMinutos.setVisible(false);
        txfSegundos.setVisible(false);
    }
    }//GEN-LAST:event_rbtnCronometroActionPerformed

    private void rbtnTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTiempoActionPerformed
        if (rbtnTiempo.isSelected()) {
        lblSeleccionarTiempo.setVisible(false);
        txfHoras.setVisible(false);
        txfMinutos.setVisible(false);
        txfSegundos.setVisible(false);
    }
    }//GEN-LAST:event_rbtnTiempoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngDificultad;
    private javax.swing.ButtonGroup btngPosicion;
    private javax.swing.ButtonGroup btngReloj;
    private javax.swing.ButtonGroup btngSonido;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDificultad;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lblSeleccionarTiempo;
    private javax.swing.JLabel lblSonido;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JRadioButton rbtnCronometro;
    private javax.swing.JRadioButton rbtnDerecha;
    private javax.swing.JRadioButton rbtnDificil;
    private javax.swing.JRadioButton rbtnFacil;
    private javax.swing.JRadioButton rbtnIntermedio;
    private javax.swing.JRadioButton rbtnIzquierda;
    private javax.swing.JRadioButton rbtnNoSonido;
    private javax.swing.JRadioButton rbtnSiSonido;
    private javax.swing.JRadioButton rbtnTemporizador;
    private javax.swing.JRadioButton rbtnTiempo;
    private javax.swing.JTextField txfHoras;
    private javax.swing.JTextField txfMinutos;
    private javax.swing.JTextField txfSegundos;
    // End of variables declaration//GEN-END:variables
}
