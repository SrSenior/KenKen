/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.cronometro;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author kenne
 */
public class CronoLabel extends javax.swing.JLabel {

    private ThreadCrono cronometro;
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;
    
    public CronoLabel() {
      
        cronometro = new ThreadCrono(this);
        cronometro.start();
        
    this.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
    this.setSize(100,100);
    }
    
    
    public void actualizarLabel(String tiempo){
        
        this.setText(tiempo);
        
    }

    public void incrementarContador(){
    if(segundos>59){
        segundos=0;
        minutos++;
    }else segundos++;
    if(minutos>59){
        minutos=0;
        horas++;
    }

    actualizarLabel(formatNumber(horas) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos));
    } 

    public void detenerCronometro(){
        
        cronometro.setRunning(false);
        
    }
    
    public void pausarCronometro(){
        
        cronometro.setPausa(true);
        
    }
    
    private String formatNumber(int tiempo) {
        if (tiempo<10){
            return "0" + tiempo;
        }else{
            return tiempo + "";
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    
}