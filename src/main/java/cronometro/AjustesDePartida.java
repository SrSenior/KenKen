/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cronometro;

import TablaKenKen.FrameJuego;
import TablaKenKen.KenKenPanel;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JRadioButton;

/**
 *Clase frame para configurar la partidas
 * @author Kenneth Vargas Chacon
 */
public class AjustesDePartida extends javax.swing.JFrame {

    /**
     * Creates new form AjustesDePartida
     */
    public AjustesDePartida() 
    {
        
        initComponents();
        llenarCombobox ();
        
        lblSeleccionarTiempo.setVisible(false);
        comboHoras.setVisible(false);
        comboMinutos.setVisible(false);
        comboSegundos.setVisible(false);
        panelError.setVisible(false);
        
    }

    public void llenarCombobox ()
    {
        //Se llenan las cajas de las horas y de los minutos con los números del 0 al 59
        for(int i = 0; i < 60; i++)
        {
            
            String opc = String.format("%d", i);
            comboMinutos.addItem(opc);
            comboSegundos.addItem(opc);
        
        }
        
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
        lblSeleccionarTiempo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelError = new javax.swing.JPanel();
        labelTextoError = new javax.swing.JLabel();
        comboHoras = new javax.swing.JComboBox<>();
        comboMinutos = new javax.swing.JComboBox<>();
        comboSegundos = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 110));

        lblSonido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSonido.setForeground(new java.awt.Color(0, 105, 192));
        lblSonido.setText("Sonido final:");
        jPanel1.add(lblSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        lblDificultad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDificultad.setForeground(new java.awt.Color(0, 105, 192));
        lblDificultad.setText("Nivel de dificultad:");
        jPanel1.add(lblDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        lblTiempo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(0, 105, 192));
        lblTiempo.setText("Reloj:");
        jPanel1.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        lblPosicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPosicion.setForeground(new java.awt.Color(0, 105, 192));
        lblPosicion.setText("Posición del panel de herramientas:");
        jPanel1.add(lblPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        rbtnFacil.setBackground(new java.awt.Color(255, 255, 255));
        btngDificultad.add(rbtnFacil);
        rbtnFacil.setForeground(new java.awt.Color(0, 105, 192));
        rbtnFacil.setText("Fácil");
        rbtnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFacilActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        rbtnIntermedio.setBackground(new java.awt.Color(255, 255, 255));
        btngDificultad.add(rbtnIntermedio);
        rbtnIntermedio.setForeground(new java.awt.Color(0, 105, 192));
        rbtnIntermedio.setText("Intermedio");
        rbtnIntermedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnIntermedioActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnIntermedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        rbtnDificil.setBackground(new java.awt.Color(255, 255, 255));
        btngDificultad.add(rbtnDificil);
        rbtnDificil.setForeground(new java.awt.Color(0, 105, 192));
        rbtnDificil.setText("Difícil");
        jPanel1.add(rbtnDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        rbtnCronometro.setBackground(new java.awt.Color(255, 255, 255));
        btngReloj.add(rbtnCronometro);
        rbtnCronometro.setForeground(new java.awt.Color(0, 105, 192));
        rbtnCronometro.setText("Cronómetro");
        rbtnCronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCronometroActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        rbtnTemporizador.setBackground(new java.awt.Color(255, 255, 255));
        btngReloj.add(rbtnTemporizador);
        rbtnTemporizador.setForeground(new java.awt.Color(0, 105, 192));
        rbtnTemporizador.setText("Temporizador");
        rbtnTemporizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTemporizadorActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnTemporizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        rbtnTiempo.setBackground(new java.awt.Color(255, 255, 255));
        btngReloj.add(rbtnTiempo);
        rbtnTiempo.setForeground(new java.awt.Color(0, 105, 192));
        rbtnTiempo.setText("No");
        rbtnTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTiempoActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        rbtnDerecha.setBackground(new java.awt.Color(255, 255, 255));
        btngPosicion.add(rbtnDerecha);
        rbtnDerecha.setForeground(new java.awt.Color(0, 105, 192));
        rbtnDerecha.setText("Derecha");
        jPanel1.add(rbtnDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        rbtnIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        btngPosicion.add(rbtnIzquierda);
        rbtnIzquierda.setForeground(new java.awt.Color(0, 105, 192));
        rbtnIzquierda.setText("Izquierda");
        jPanel1.add(rbtnIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        rbtnSiSonido.setBackground(new java.awt.Color(255, 255, 255));
        btngSonido.add(rbtnSiSonido);
        rbtnSiSonido.setForeground(new java.awt.Color(0, 105, 192));
        rbtnSiSonido.setText("Si");
        jPanel1.add(rbtnSiSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        rbtnNoSonido.setBackground(new java.awt.Color(255, 255, 255));
        btngSonido.add(rbtnNoSonido);
        rbtnNoSonido.setForeground(new java.awt.Color(0, 105, 192));
        rbtnNoSonido.setText("No");
        jPanel1.add(rbtnNoSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        lblSeleccionarTiempo.setForeground(new java.awt.Color(0, 105, 192));
        lblSeleccionarTiempo.setText("Horas          Minutos      Segundos");
        jPanel1.add(lblSeleccionarTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 105, 192));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 110, 50));

        panelError.setBackground(new java.awt.Color(221, 65, 84));
        panelError.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTextoError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelError.add(labelTextoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 30));

        jPanel1.add(panelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 340, 30));

        comboHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        jPanel1.add(comboHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 50, -1));

        comboMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMinutosActionPerformed(evt);
            }
        });
        jPanel1.add(comboMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 50, -1));

        comboSegundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSegundosActionPerformed(evt);
            }
        });
        jPanel1.add(comboSegundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 50, -1));

        jButton2.setBackground(new java.awt.Color(0, 105, 192));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
        comboHoras.setVisible(true);
        comboMinutos.setVisible(true);
        comboSegundos.setVisible(true);
    } else {
        lblSeleccionarTiempo.setVisible(false);
        comboHoras.setVisible(false);
        comboMinutos.setVisible(false);
        comboSegundos.setVisible(false);
    }
    }//GEN-LAST:event_rbtnTemporizadorActionPerformed

    private void rbtnCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCronometroActionPerformed
        if (rbtnCronometro.isSelected()) {
        lblSeleccionarTiempo.setVisible(false);
        comboHoras.setVisible(false);
        comboMinutos.setVisible(false);
        comboSegundos.setVisible(false);
    }
    }//GEN-LAST:event_rbtnCronometroActionPerformed

    private void rbtnTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTiempoActionPerformed
        if (rbtnTiempo.isSelected()) {
        lblSeleccionarTiempo.setVisible(false);
        comboHoras.setVisible(false);
        comboMinutos.setVisible(false);
        comboSegundos.setVisible(false);
    }
    }//GEN-LAST:event_rbtnTiempoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        boolean lado;
        
        //Valida que haya al menos una opción seleccionada en cada posible rubro del menú pre-juego
        if((rbtnFacil.isSelected() || rbtnIntermedio.isSelected() || rbtnDificil.isSelected())
                && (rbtnCronometro.isSelected() || rbtnTemporizador.isSelected() || rbtnTiempo.isSelected())
                && (rbtnIzquierda.isSelected() || rbtnDerecha.isSelected())
                && (rbtnNoSonido.isSelected() || rbtnSiSonido.isSelected()))
        {
            String dificultad = "";//Se inicializa porque sino da error
            
            //Se revisa que dificultad quedó seleccionada para actuar según eso
            Enumeration<AbstractButton> elements = btngDificultad.getElements();
            while (elements.hasMoreElements()) {
                JRadioButton radioButton = (JRadioButton) elements.nextElement();
                if (radioButton.isSelected()) {
                    dificultad = radioButton.getText();
                    break;
                }
            }
            
            if(rbtnDerecha.isSelected()){lado = true;}
            else{lado = false;}
            
            
            FrameJuego ventana_juego = new FrameJuego(dificultad, lado);//Se llama a la nueva ventana con la dificultad seleccionada
            ventana_juego.setVisible(true);
            
            this.dispose();
            
        }
        else
        {
            
            panelError.setVisible(true);//En caso de haber dejado campo en blanco
            labelTextoError.setText("Seleccione al menos una de las opciones en cada campo");
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMinutosActionPerformed

    private void comboSegundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSegundosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSegundosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        MenuPrincipal ventana_menu = new MenuPrincipal();
        ventana_menu.setVisible(true);

        this.dispose();
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbtnIntermedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnIntermedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnIntermedioActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngDificultad;
    private javax.swing.ButtonGroup btngPosicion;
    private javax.swing.ButtonGroup btngReloj;
    private javax.swing.ButtonGroup btngSonido;
    private javax.swing.JComboBox<String> comboHoras;
    private javax.swing.JComboBox<String> comboMinutos;
    private javax.swing.JComboBox<String> comboSegundos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTextoError;
    private javax.swing.JLabel lblDificultad;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lblSeleccionarTiempo;
    private javax.swing.JLabel lblSonido;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelError;
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
    // End of variables declaration//GEN-END:variables
}
