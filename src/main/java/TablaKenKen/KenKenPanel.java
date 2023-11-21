/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TablaKenKen;

import com.mycompany.kenken.ManejoInfo;
import com.mycompany.kenken.Movimiento;
import cronometro.LeerXML;
import cronometro.Partida;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import java.util.Random;
import java.util.Stack;
import javax.swing.BorderFactory;

/**
 * Panel en el que esta el juego, no es el frame en el que se juega
 * @author Jose Pablo Vega Solano
 */
public class KenKenPanel extends javax.swing.JPanel {

    /**
     * Creates new form KenKenPanel
     */
    
    private List<BotonesTablaKenKen> botonesKenKen; //Array que contendrá los botones, cada uno correspondiente a una casilla de la cuadrícula
    private List<JaulasKenKen> Jaulas;
    private List<Partida> Partidas = ManejoInfo.getPartidas();
    private Partida partidaAux;
    private String dificultad;
    private Random random = new Random();
    private Stack<Movimiento> deshacerPila = new Stack<>();
    private Stack<Movimiento> rehacerPila = new Stack<>();
    private int sizeCuadricula;
    private int cantidadBotones;
    
    /**
     * Constructor
     */
    public KenKenPanel() 
    {
        
        initComponents();
        
        Jaulas = new ArrayList<>();
        botonesKenKen = new ArrayList<>(); 
        CrearBotones();//Función que crea los botones según el tamaño seleccionado de cuadrícula
        
    }

    /**
     * se establece el tamaño de la cuadrícula según la selección del usuario
     */
    public void setSizeCuadricula(int sizeCuadricula) 
    {
        
        this.sizeCuadricula = sizeCuadricula;
        CrearBotones();
        
    }
    
    

    /**
     * Setter de dificultad
     * @param dificultad 
     */

    
    public void setDificultad(String dificultad) 
    {
        this.dificultad = dificultad;
    }
    
    /**
     * Funcion para crear botones, con un bucle hasta la cantidad de botones según el tamaño
     */
    public void CrearBotones()
    {
        try
        {
            cantidadBotones = sizeCuadricula * sizeCuadricula;
            for(int i = 1; i <= cantidadBotones; i++) //Ciclo para crear los botones
            {

                BotonesTablaKenKen nuevoBoton = new BotonesTablaKenKen();

                this.add(nuevoBoton); //Se añade el botón al panel
                botonesKenKen.add(nuevoBoton); //Se añade el botón al array

            }
        }
        catch(Exception e)
        {

        }
        
        
    }
    
    /**
     * Se pintan los bordes según la jaula a la que pertenezca el botón
     * además le agrega texto si este lo incluye o si es presionado
     */
    public void PintarBordesBotones() 
    {

        try {
            
            int seleccion = 0;//Se inicializa porque sino da error
            int contador = 0;
            
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

            partidaAux = Partidas.get(seleccion); //La Partida que se usará
            Jaulas = partidaAux.getJaulas(); //Se obtienen todas las jaulas
            
                int indiceBtn = 0;
                
                //Esta lista almacena cuales son los índices de losprimeros botones 
                //de cada lista para ponerles el texto de operación y valor
                List<Integer> primerosBotones = new ArrayList<>();
                
                for(BotonesTablaKenKen btn : botonesKenKen)
                {
                    
                    int sup = 0, inf = 0, izq = 0, der = 0; //Se inicializan los bordes con valor 0
                    
                    for (JaulasKenKen jaulaAux : Jaulas)//Se recorren todas las jaulas
                    {
                        
                        if(indiceBtn == 0)
                        {
                            //Se agrega el primer elemento de la jaula
                            primerosBotones.add(jaulaAux.getCasillasCorrespondientes().get(0));
                            
                        }
                        
                        if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn))//Una vez se encuentre la jaula que contenga al botón actual
                        {
                            
                            
                            //Todos estos if son los encargados de cambiar los bordes y pintarlos
                            //o despintalos en función de si una casilla tiene casillas hermanas
                            
                            if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn + 1)){ der = 0; }
                            else{der = 1;}

                            if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn - 1)){ izq = 0; }
                            else{izq = 1;}

                            if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn + sizeCuadricula)){ inf = 0; }
                            else{inf = 1;}

                            if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn - sizeCuadricula)){ sup = 0; }
                            else{sup = 1;}

                            btn.setBorder(BorderFactory.createMatteBorder(sup, izq, inf, der, Color.BLACK));
                            
                        }
                        
                        //Este if agrega el texto superior en caso de que el botón sea el primero de la lista
                        if (indiceBtn == jaulaAux.getCasillasCorrespondientes().get(0) && !primerosBotones.isEmpty())
                        {
                            String texto = jaulaAux.getValor() + jaulaAux.getOperacion();
                            btn.setTextoSuperior(texto);
                            primerosBotones.remove(0);
                            
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
    
    /**
     * Es la funcion que de hecho pone un texto en el centro de cada boton
     * @param texto 
     */
    public void AgregarTextoCentral(String texto)
    {
        for(BotonesTablaKenKen btn : botonesKenKen)
        {
            btn.setTextoPrincipal(texto);
        }
    }
    
    /**
     * Esta función borra el texto de un botón 
     */
    public void BorrarTextoCasilla()
    {
        for(BotonesTablaKenKen btn : botonesKenKen)
        {
            btn.BorrarTextoIndividual();
        }
    }
    
    /**
     * Esta función borra el texto de todos los botones
     */
    public void BorrarTextoTotal()
    {
        for(BotonesTablaKenKen btn : botonesKenKen)
        {
            btn.Reinicio();
        }
    }
    
    /**
     * Esta función retorna true si hay al menos un botón activo
     */
    public boolean AlMenosUnoActivo()
    {
        for(BotonesTablaKenKen btn : botonesKenKen)
        {
            if(btn.getEstadoActivo()){return true;};
        }
        return false;
    }
    
    
    /**
     * Esta función valida la partida
     */
    public boolean validarJuego()
    {
        for(int i = 0; i <= botonesKenKen.size()-1; i++)
        {
            //System.out.println("Valor de i: " + i);
            if(i != 0)
            {
                if(validarFila((i/sizeCuadricula)*sizeCuadricula, i) || validarColumna(i%sizeCuadricula, i))
                {
                    return true;
                }
            }
            else
            {
                if(validarFila((i/sizeCuadricula)*sizeCuadricula, i) || validarColumna(0, i))
                {
                    return true;
                }
            }
            
        }
        return false;
    }
    
    
    public boolean validarFila(int numFila, int numCasilla)
    {
        String textoBtnCualquiera;
        String textoBtnActual = botonesKenKen.get(numCasilla).getTextoCentral();
        
        for(int i = 0 + numFila; i < 0 + numFila + sizeCuadricula; i++)
        {
            
            if(i != numCasilla)
            {
                textoBtnCualquiera = botonesKenKen.get(i).getTextoCentral();
                if(textoBtnCualquiera == textoBtnActual && textoBtnCualquiera != "")
                {
                    
                    botonesKenKen.get(numCasilla).SetEstadoErr(true);
                    botonesKenKen.get(i).SetEstadoErr(true);
                    return true;
                    
                }
            }
        }
        
        return false;
    }

    public boolean validarColumna(int numColumna, int numCasilla)
    {
        String textoBtnCualquiera;
        String textoBtnActual = botonesKenKen.get(numCasilla).getTextoCentral();
        for(int i = 0 + numColumna; i < 0 + numColumna + (cantidadBotones-(sizeCuadricula-1)); i+=sizeCuadricula)
        {
            if(i != numCasilla)
            {
                textoBtnCualquiera = botonesKenKen.get(i).getTextoCentral();
                if(textoBtnCualquiera == textoBtnActual && textoBtnCualquiera != "")
                {
                    
                    botonesKenKen.get(numCasilla).SetEstadoErr(true);
                    botonesKenKen.get(i).SetEstadoErr(true);
                    return true;
                    
                }
            }
        }
        
        return false;
    }
    
    public void QuitarEstadoError()
    {
        for(BotonesTablaKenKen btn : botonesKenKen)
        {
            btn.SetEstadoErr(false);
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
