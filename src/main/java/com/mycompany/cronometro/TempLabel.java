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
public class TempLabel extends javax.swing.JLabel {

    private ThreadTemp temporizador;
    private int segundos;
    private int minutos;
    private int horas;
    
    public TempLabel(int pSegundos, int pMinutos,int pHoras) {
      
        temporizador = new ThreadTemp(this);
        this.segundos = pSegundos;
        this.minutos = pMinutos;
        this.horas = pHoras;
        temporizador.start();
        
    this.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
    this.setSize(100,100);
    }
    public TempLabel(){
        
        temporizador = new ThreadTemp(this);
        this.segundos = 10;
        this.minutos = 1;
        this.horas = 0;
        temporizador.start();
        this.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        this.setSize(100,100);
    }
    
    public void actualizarLabel(String tiempo){
        
        this.setText(tiempo);
        
    }

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

    public void detenerCronometro(){
        
        temporizador.setRunning(false);
        
    }
    
    public void pausarCronometro(){
        
        temporizador.setPausa(true);
        
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