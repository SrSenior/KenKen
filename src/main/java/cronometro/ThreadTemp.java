/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronometro;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase thread que permite que funcione el temporizador constantemente
 * @author Kenneth Vargas Chacon
 */
public class ThreadTemp extends Thread{
    
    private boolean running = true;
    private boolean pausa = false;
    private int contador = 0;
    private TempLabel referencia_temp;
    
    /**
     * Constructor
     * @param pTemp 
     */
    public ThreadTemp(TempLabel pTemp){
        
        this.referencia_temp = pTemp;
        
    }

    /**
     * Permite que funcione el thread
     * llama a {@link TempLabel#decrementarContador() }
     */
    public void run(){
        
       while (running){
           try {
               
               while(pausa){
                   sleep(100);
               }
               sleep(1000);
               referencia_temp.decrementarContador();
           } catch (InterruptedException ex) {
           }
       }
        
    }
    
    /**
     * Getter de running
     * @return 
     */
    public boolean isRunning() {
        return running;
    }
    
    /**
     * Cambia el estado al otro del pausa
     */
    public void pause(){
        this.pausa = !this.pausa;
    }
    /**
     * getter de pausa
     * @return 
     */
    public boolean isPaused() {
        return pausa;
    }
    
    /**
     * Detiene el programa
     */
    public void detener(){
        this.running = false;
    }

    /**
     * Setter de running
     * @param running 
     */
    public void setRunning(boolean running) {
        this.running = running;
    }

    /**
     * Setter de running
     * @param pausa 
     */
    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }
    
    
    
}
