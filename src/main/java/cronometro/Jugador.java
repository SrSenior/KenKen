/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronometro;

import java.io.Serializable;

/**
 * Esta clase permite guardar los datos de un jugador en un objeto
 * @author Kenneth Vargas Chacón
 */
public class Jugador implements Serializable{
    
    private final String nombre;
    private final String correo;
    private final String tiempo;
    private int horas;
    private int minutos;
    private int segundos;

    public Jugador(String nombre, String correo, String tiempo, int horas, int minutos, int segundos) {
        this.nombre = nombre;
        this.correo = correo;
        this.tiempo = tiempo;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\tTiempo: " + this.getTiempo();
    }
    
    
    
    
}
