/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronometro;

import TablaKenKen.JaulasKenKen;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene las jaulas y la dificultad de una partida
 * @author Jose Pablo Vega Solano
 */
public class Partida {
    
    private String nivelDificultad;
    private List<JaulasKenKen> jaulas = new ArrayList<>();

    /**
     * Constructor
     * @param nivelDificultad
     * @param jaulas 
     */
    public Partida(String nivelDificultad, List<JaulasKenKen> jaulas) 
    {
        
        this.nivelDificultad = nivelDificultad;
        this.jaulas = jaulas;
        
    }
    
    /**
     * Setter de nivelDificultad
     * @param nivelDificultad 
     */
    public void setNivelDificultad(String nivelDificultad) 
    {
        this.nivelDificultad = nivelDificultad;
    }

    /**
     * Setter de jaulas
     * @param jaulas 
     */
    public void setJaulas(List<JaulasKenKen> jaulas) {
        this.jaulas = jaulas;
    }

    /**
     * Getter de getnivelDificultad
     * @return String
     */
    public String getNivelDificultad() {
        return nivelDificultad;
    }

    /**
     * Getter de una lista que es de Jaulas
     * @return  lista de Jaulas
     */
    public List<JaulasKenKen> getJaulas() {
        return jaulas;
    }
    
}
