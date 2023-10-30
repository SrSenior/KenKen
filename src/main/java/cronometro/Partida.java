/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronometro;

import TablaKenKen.JaulasKenKen;
import java.util.List;

/**
 *
 * @author jpveg
 */
public class Partida {
    
    private String nivelDificultad;
    private List<JaulasKenKen> jaulas;

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public void setJaulas(List<JaulasKenKen> jaulas) {
        this.jaulas = jaulas;
    }

    public Partida(String nivelDificultad, List<JaulasKenKen> jaulas) {
        this.nivelDificultad = nivelDificultad;
        this.jaulas = jaulas;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public List<JaulasKenKen> getJaulas() {
        return jaulas;
    }
    
}
