/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablaKenKen;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author jpveg
 */

//Botones customizados para poder manejarlos a placer con las modificaciones que se requiera
public class BotonesTablaKenKen extends JButton
{
    //Atributos del botón
    private int bordeSup = 0, bordeInf = 0, bordeIzq = 0, bordeDer = 0; //Estos son los bordes, el objetivo del atributo es ver si se colorea o no el borde del botón
    private boolean act; //Atributo para colorearlo en caso de estar seleccionado
    
    public BotonesTablaKenKen() //Constructor
    {
        act = false; //Se inicializa el estado en apagado
        
        BotonKenKenListener(); //Llama al listener, se encargará de colorear al botón en caso de ser presionado
        setContentAreaFilled(false); // Desactivar el fondo predeterminado del botón
    
    }
    
    public void ModificarBordes(int bordeSup, int bordeInf, int bordeIzq, int bordeDer)
    {
        this.bordeSup = bordeSup;
        this.bordeInf = bordeInf;
        this.bordeIzq = bordeInf;
        this.bordeDer = bordeDer;
    }

    //Esta función pinta los bordes y, en caso de ser presionado, el fondo del botón
    @Override
    protected void paintComponent(Graphics g) 
    {
        
        if(bordeSup == 1)
        {
            
            // Dibuja el borde superior
            g.setColor(Color.BLACK);
            g.drawLine(0, 0, getWidth(), 0);
        
        }
        if(bordeInf == 1)
        {
            
            // Dibuja el borde inferior
            g.setColor(Color.BLACK);
            g.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
            
        }
        if(bordeIzq == 1)
        {
            
            // Dibuja el borde izquierdo
            g.setColor(Color.BLACK);
            g.drawLine(0, 0, 0, getHeight());
        
        }
        if(bordeDer == 1)
        {
            
            // Dibuja el borde derecho
            g.setColor(Color.BLACK);
            g.drawLine(getWidth() - 1, 0, getWidth() - 1, getHeight());
            
        }
        
        if (act)
        {
            
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(new Color(219, 211, 244));
            int x = getWidth() / 2 - 45;
            int y = getHeight() / 2 - 19;
            g2.fillRoundRect(x, y, getWidth(), getHeight(), 13, 13);
            
        }

        super.paintComponent(g);
        // Puedes personalizar otros bordes aquí, como el superior e inferior

    }
    
    public void BotonKenKenListener() //Listener que se encarga de modificar el estado del botón para colorearlo en caso de ser presionado
    {
        ActionListener buttonListener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                
                cambiarEstadoAtributo();
                
            }  
        };
        
        addActionListener(buttonListener);
        
    }
        
    /**
     * Getter del atributo act
     * @return retorna el atributo act.
     */
    
    //Función para obtener el estado del botón, se usa para detectar si el botón ya está activo o no, y actuar en consecuencia
    public boolean getEstadoActivo()
    {
        
        return act;
        
    }
    
        /**
     * Cambia el estado del atributo.
     */
    public void cambiarEstadoAtributo() 
    {
        
        //Invierte el valor del estado del botón
        act = !act;

        if (act) //Manda a apagar cualquier botón que esté encendido
        {

            desactivarOtrosBotones();

        }
        
    }
    
     /**
     * Desactiva otros botones.
     */
    private void desactivarOtrosBotones() 
    {
        
        // Se obtienen los demás botones para poder trabajarlos desde este propio botón
        // getParent nos permite acceder al componente padre del botón
        Component[] componentes = getParent().getComponents();//Obtiene los componentes del padre, o sea, sus botones hermanos

        for (Component componente : componentes) 
        {
            
            //Si el componente está activo y no es este mismo (eso es el "this")
            //es decir, trabaja a todos los demás botones "hermanos"
            
            if (((BotonesTablaKenKen) componente).getEstadoActivo() && componente != this)
            {
                
                BotonesTablaKenKen celda = (BotonesTablaKenKen) componente;
                celda.cambiarEstadoAtributo();
                celda.repaint(); //Actualiza la interfaz
                break;
                //Rompe el ciclo porque solo puede haber un botón activo además del
                //que se acaba de activar, así que no hace falta seguir
                
            }
        }
    }
    
}
