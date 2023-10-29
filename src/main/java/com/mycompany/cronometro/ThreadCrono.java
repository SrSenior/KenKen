/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometro;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kenne
 */
public class ThreadCrono extends Thread{
    
    private boolean running = true;
    private boolean pausa = false;
    private int contador = 0;
    private CronoLabel referencia_crono;
    
    
    public ThreadCrono(CronoLabel pCrono){
        
        this.referencia_crono = pCrono;
        
    }

    public void run(){
        
       while (running){
           try {
               
               while(pausa){
                   sleep(100);
               }
               sleep(1000);
               referencia_crono.incrementarContador();
           } catch (InterruptedException ex) {
           }
       }
        
    }
    
        public boolean isRunning() {
        return running;
    }
    
    public void pause(){
        this.pausa = !this.pausa;
    }

    public boolean isPaused() {
        return pausa;
    }
    
    public void detener(){
        this.running = false;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }
    
    
    
}
