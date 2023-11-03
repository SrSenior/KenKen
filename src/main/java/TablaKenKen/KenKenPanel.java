/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TablaKenKen;

import com.mycompany.kenken.ManejoInfo;
import cronometro.LeerXML;
import cronometro.Partida;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import java.util.Random;
import javax.swing.BorderFactory;

/**
 *
 * @author jpveg
 */
public class KenKenPanel extends javax.swing.JPanel {

    /**
     * Creates new form KenKenPanel
     */
    
    private List<BotonesTablaKenKen> botonesKenKen; //Array que contendrá los 36 botones, cada uno correspondiente a una casilla de la cuadrícula
    private List<JaulasKenKen> Jaulas;
    private List<Partida> Partidas = ManejoInfo.getPartidas();;
    private String dificultad;
    private Random random = new Random();
    
    public KenKenPanel() 
    {
        
        initComponents();
        
        Jaulas = new ArrayList<>();
        botonesKenKen = new ArrayList<>(); 
        
        CrearBotones();//Función que crea los 36 botones
        PintarBordesBotones();//Función para pintar los bordes de cada botón en relación con la jaula a la que pertenecen
        
    }

    public void setDificultad(String dificultad) 
    {
        this.dificultad = dificultad;
    }
    
    public void CrearBotones()
    {
        
        for(int i = 1; i <= 36; i++) //Ciclo para crear los 36 botones
        {
            
            BotonesTablaKenKen nuevoBoton = new BotonesTablaKenKen();

            this.add(nuevoBoton); //Se añade el botón al panel
            botonesKenKen.add(nuevoBoton); //Se añade el botón al array
            
        }
        
    }
    
    public void PintarBordesBotones() //Se pintan los bordes según la jaula a la que pertenezca el botón
    {

        try {
            
            int seleccion = 0;//Se inicializa porque sino da error
            
            //Se pone en un if, puesto que al inicializarse el componente la primera vez, dificulta vale null, 
            //pero una vez inicializado, ya se le da un valor nuevo a dificultad
            if(dificultad != null)
            {
                
                switch(dificultad)
                {
                    case "Fácil":

                        // Generar un número aleatorio entre 0 y 2 para escoger alguna de las 3 partidas de dificultad fácil
                        seleccion = random.nextInt(3);
                        break;

                    case "Intermedio":

                        // Generar un número aleatorio entre 3 y 5 para escoger alguna de las 3 partidas de dificultad intermedio
                        seleccion = random.nextInt(3) + 3;
                        break;

                    case "Difícil":

                        // Generar un número aleatorio entre 6 y 8 para escoger alguna de las 3 partidas de dificultad difícil
                        seleccion = random.nextInt(3) + 6;
                        break;

                }
                
            }

            Partida partidaAux = Partidas.get(seleccion); //Auxiliar de la Partida que se usará
            Jaulas = partidaAux.getJaulas(); //Se obtienen todas las jaulas
            
                int indiceBtn = 0;
                
                for(BotonesTablaKenKen btn : botonesKenKen)
                {
                    
                    int sup = 0, inf = 0, izq = 0, der = 0; //Se inicializan los bordes con valor 0
                    
                    for (JaulasKenKen jaulaAux : Jaulas)//Se recorren todas las jaulas
                    {
                        
                        if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn))//Una vez se encuentre la jaula que contenga al botón actual
                        {
                            
                            //Todos estos if son los encargados de cambiar los bordes y pintarlos
                            //o despintalos en función de si una casilla tiene casillas hermanas
                            
                            if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn + 1)){ der = 0; }
                            else{der = 1;}

                            if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn - 1)){ izq = 0; }
                            else{izq = 1;}

                            if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn + 6)){ inf = 0; }
                            else{inf = 1;}

                            if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn - 6)){ sup = 0; }
                            else{sup = 1;}

                            btn.setBorder(BorderFactory.createMatteBorder(sup, izq, inf, der, Color.BLACK));
                            
                        }
                        
                    }
                    
                    indiceBtn ++;
                    
                }    
            
        }
        catch (Exception e) 
        {
            
            e.printStackTrace();
            System.out.println("Mensaje de error: " + e.getMessage());
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(306, 306));
        setMinimumSize(new java.awt.Dimension(306, 306));
        setPreferredSize(new java.awt.Dimension(306, 306));
        setLayout(new java.awt.GridLayout(6, 6));
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
