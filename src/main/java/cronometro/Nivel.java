/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronometro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que guarda los datos de jugadores de un size de cuadricula
 * @author Kenneth Vargas Chacon
 */
public class Nivel implements Serializable{
    
    private String cuadricula;
    private List<Jugador> ListaFacil = new ArrayList<>();
    private List<Jugador> ListaMedio = new ArrayList<>();
    private List<Jugador> ListaDificil = new ArrayList<>();
    
    
    public Nivel(String cuadricula,String dificultad, List<Jugador> listaFacil, List<Jugador> listaMedio, List<Jugador> listaDificil){
        this.cuadricula = cuadricula;
        ListaFacil = listaFacil;
        ListaMedio = listaMedio;
        ListaDificil = listaDificil;
    }
    
    public Nivel(String cuadricula ){
        this.cuadricula = cuadricula;
    }
    
    public void addfacil(Jugador nuevo){
        ListaFacil.add(nuevo);
    }
    
    public void addMedio(Jugador nuevo){
        ListaMedio.add(nuevo);
    }
    
    public void addDificil(Jugador nuevo){
        ListaDificil.add(nuevo);
    }

    public String getCuadricula() {
        return cuadricula;
    }

    public List<Jugador> getListaFacil() {
        return ListaFacil;
    }

    public List<Jugador> getListaMedio() {
        return ListaMedio;
    }

    public List<Jugador> getListaDificil() {
        return ListaDificil;
    }
    
    /**
     * Este metodo lo que hace es permitir imprimir o listar todos los jugadores de una dificultad y un tamaño específico
     * @param lista Es una de las listas de los atributos
     * @return Es un String que contiene todos los datos de los jugadores
     */
    
    public String imprimirListaNivel(List<Jugador> lista){
        String str="";
        for (Jugador persona: lista){
            str+=persona.toString()+"\n";
        }
        return str;
    }
    
}
