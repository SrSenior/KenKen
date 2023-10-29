/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kenken;

import TablaKenKen.JaulasKenKen;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpveg
 */

//Esta clase va a manejar la información de las diferentes jaulas extraída del xml
//Y la información de las pilas con los movimientos realizados y  movimientos deshechos
public class ManejoInfo 
{
    
    //Lista que almacenará las jaulas según la dificultad seleccionada
    //El llenado será manual de momento y hasta contar con el xml
    private static List<JaulasKenKen> jaulasKenKen;
    
    public ManejoInfo() //Constructor
    {
        
        jaulasKenKen = new ArrayList<>();
        
    }

    public static List<JaulasKenKen> getJaulasKenKen() //Función para retornar la lista de las Jaulas
    {
        
        return jaulasKenKen;
        
    }
    
    
    
}
