/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cronometro;

import java.awt.Font;
import javax.swing.JLabel;

/**
 * Clase que se complementa con su thread para mostrar en pantalla un temporizador
 * @author Kenneth Vargas Chacon
 */
public class TempLabel extends javax.swing.JLabel {

    private ThreadTemp temporizador;
    private int segundos;
    private int minutos;
    private int horas;
    
    /**
     * Constructor
     * @param pSegundos
     * @param pMinutos
     * @param pHoras 
     */
    public TempLabel(int pSegundos, int pMinutos,int pHoras) {
      
        temporizador = new ThreadTemp(this);
        this.segundos = pSegundos;
        this.minutos = pMinutos;
        this.horas = pHoras;
        temporizador.start();
        
    this.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
    this.setSize(100,100);
    }
    /**
     * Otro constructor pero sin parametros
     */
    public TempLabel(){
        
        temporizador = new ThreadTemp(this);
        this.segundos = 10;
        this.minutos = 1;
        this.horas = 0;
        temporizador.start();
        this.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        this.setSize(100,100);
    }
    
    /**
     * Metodo que actualiza el label en la ventana
     * @param tiempo nuevo string con el formato correcto
     */
    public void actualizarLabel(String tiempo){
        
        this.setText(tiempo);
        
    }

    /**
     * Metodo que mantiene el formato de los atributos segundos, horas y minutos conforme pasa el tiempo
     * Llama a {@link TempLabel#actualizarLabel(java.lang.String) }
     * Llama a {@link TempLabel#formatNumber(int) }
     */
    public void decrementarContador(){
    if (segundos > 0){
        segundos--;
    }else{
        if (minutos>0){
            minutos--;
            segundos = 59;
        }else{
            if (horas>0){
                horas--;
                minutos = 59;
                segundos = 59;
            }
        }
    }

    actualizarLabel(formatNumber(horas) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos));
    } 

    /**
     * Detiene completamente el temporizador
     */
    public void detenerTemporizador(){
        
        temporizador.setRunning(false);
        
    }
    
    /**
     * Puede pausar el temporizador
     */
    public void pausarTemporizador(){
        
        temporizador.setPausa(true);
        
    }
    
    /**
     * Mantiene coherencia para el formato de los numeros, agregando un 0 antes si es menos a 10 y pasandolo a string
     * @param tiempo minutos, segundo u horas
     * @return String
     */
    private String formatNumber(int tiempo) {
        if (tiempo<10){
            return "0" + tiempo;
        }else{
            return tiempo + "";
        }
    }

    /**
     * Getter de segundos
     * @return int
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * Setter de segundos
     * @param segundos 
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    /**
     * Getter de minutos
     * @return int
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Setter de minutos
     * @param minutos 
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * Getter de horas
     * @return int
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Setter de horas
     * @param horas 
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
}