/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TablaKenKen;

import com.mycompany.kenken.ManejoInfo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

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
    
    public KenKenPanel() 
    {
        
        initComponents();
        
        Jaulas = new ArrayList<>();
        botonesKenKen = new ArrayList<>();
        
        CrearBotones();//Función que crea los 36 botones
        PintarBordesBotones();//Función para pintar los bordes de cada botón en relación con la jaula a la que pertenecen
        
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

        Jaulas = ManejoInfo.getJaulasKenKen(); //Se obtienen todas las jaulas
        
        for(JaulasKenKen jaula : Jaulas) //Se recorre cada jaula
        {
            List<Integer> casillasCorrespondientes = jaula.getCasillasCorrespondientes(); //Se extrae la lista de los botones que son parte de la jaula que se esté iterando
            
            for (int i = 0; i >= botonesKenKen.size(); i++)//Se recorre toda la lista de botones
            {
                
                BotonesTablaKenKen btn = botonesKenKen.get(i);//Se extrae el botón correspondiente al valor actual de i
                int sup = 0, inf = 0, izq = 0, der = 0; //Se inicializan los bordes con valor 0
                
                if (casillasCorrespondientes.contains(i)) //Si la jaula contiene el valor de i, es decir, contiene el botón, se ingresa al condicional
                {
                    //Como si pertenece, se inicializan todos los bordes
                    sup = 1;
                    inf = 1;
                    izq = 1;
                    der = 1;
                    
                    if (i == 0)//En caso de ser la casilla cero, solo preguntamos por las casillas de la derecha e inferior, puesto que no tiene superior ni izquierda
                    {

                        if (casillasCorrespondientes.contains(i + 1)){ der = 0; } //Si la casilla derecha forma parte de la jaula, ese borde no se pinta para que estén contectados
                        if (casillasCorrespondientes.contains(i + 6)){ inf = 0; } //Si la casilla inferior forma parte de la jaula, ese borde no se pinta para que estén contectados

                        btn.ModificarBordes(sup, inf, izq, der); //Se realiza el pintado con los nueos bordes

                    }
                    else if (i == botonesKenKen.size()) //En caso de ser la casilla cero, solo preguntamos por las casillas de la izquierda y superior, puesto que no tiene inferior ni derecha
                    {

                        if (casillasCorrespondientes.contains(i - 1)){ izq = 0; } 
                        if (casillasCorrespondientes.contains(i - 6)){ sup = 0; }

                        btn.ModificarBordes(sup, inf, izq, der); //Se realiza el pintado con los nueos bordes

                    }
                    else if(i >= 30 && i != botonesKenKen.size()) //En caso de ser una casilla de la última fila, no se consulta por una fila siguiente
                    {
                        if (casillasCorrespondientes.contains(i + 1)){ der = 0; } 
                        if (casillasCorrespondientes.contains(i - 1)){ izq = 0; }
                        if (casillasCorrespondientes.contains(i - 6)){ sup = 0; }

                        btn.ModificarBordes(sup, inf, izq, der); //Se realiza el pintado con los nueos bordes
                    }
                    else if(i <= 5 && i != 0) //En caso de ser una casilla de la primera fila, no se consulta por una fila anterior
                    {
                        if (casillasCorrespondientes.contains(i + 1)){ der = 0; } 
                        if (casillasCorrespondientes.contains(i - 1)){ izq = 0; }
                        if (casillasCorrespondientes.contains(i + 6)){ inf = 0; }

                        btn.ModificarBordes(sup, inf, izq, der); //Se realiza el pintado con los nueos bordes
                    }
                    else //Si no entra a ninguna de las condiciones anteriores, entonnces consultamos por cualquier posible coincidencia
                    {
                        if (casillasCorrespondientes.contains(i + 1)){ der = 0; } 
                        if (casillasCorrespondientes.contains(i - 1)){ izq = 0; }
                        if (casillasCorrespondientes.contains(i + 6)){ inf = 0; }
                        if (casillasCorrespondientes.contains(i - 6)){ sup = 0; }

                        btn.ModificarBordes(sup, inf, izq, der); //Se realiza el pintado con los nueos bordes

                    }
                    
                }        
                
            }
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(306, 306));
        setMinimumSize(new java.awt.Dimension(306, 306));
        setPreferredSize(new java.awt.Dimension(306, 306));
        setLayout(new java.awt.GridLayout(6, 6));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
