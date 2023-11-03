/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kenken;

import TablaKenKen.JaulasKenKen;
import java.util.ArrayList;
import java.util.List;
import cronometro.LeerXML;
import cronometro.Partida;

/**
 *
 * @author jpveg
 */

//Esta clase va a manejar la información de las diferentes jaulas extraída del xml
//Y la información de las pilas con los movimientos realizados y  movimientos deshechos
public class ManejoInfo 
{
    
    //Lista que almacenará las jaulas según la dificultad seleccionada

    private static List<Partida> listaPartidas = new ArrayList<>();
    
    public ManejoInfo() //Constructor
    {
        System.out.println(listaPartidas.size());
    }

    public static List<Partida> getPartidas() //Función para retornar la lista de las partidas
    {
        LeerXML lectura = new LeerXML();
        listaPartidas = lectura.getListaPartidas();
        
        return listaPartidas;
        
    }

    public static void setListaPartidas(List<Partida> listaPartidas) {
        ManejoInfo.listaPartidas = listaPartidas;
    }
    
}
