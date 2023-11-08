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
    private boolean act, err; //Atributo para colorearlo en caso de estar seleccionado o en caso de tener error
    private String textoSuperior = "";
    private String textoCentral = "";
    
    public BotonesTablaKenKen() //Constructor
    {
        act = false; //Se inicializa el estado en apagado
        
        BotonKenKenListener(); //Llama al listener, se encargará de colorear al botón en caso de ser presionado
        setContentAreaFilled(false); // Desactivar el fondo predeterminado del botón
    
    }

    //Esta función pinta el fondo del botón si este se presiona o si tiene error
    @Override
    protected void paintComponent(Graphics g) 
    {
        
        if (act) //Si se activa
        {
            
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(new Color(219, 211, 244));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 13, 13);
            
        }
        
        if (err) //Si tiene error
        {
            
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(new Color(221, 65, 84));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 13, 13);
            
        }
        
        this.repaint();//Se actualiza la interfaz
        super.paintComponent(g);

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
    
    public void setTextoPrincipal(String textoCentral)
    {
        if(act)
        {
            if(textoSuperior == "")
            {
                setText("<html><center>" + textoCentral + "</html>");
            }
            else
            {
                this.setText("<html><center>" + textoSuperior + "<br><br>" + textoCentral +"</html>");
            }
        }
    }
    
    public void setTextoSuperior(String texto)
    {
        
        this.setText("<html><center>" + texto + "<br><br>" + " " + "</html>");
        textoSuperior = texto;
    }
}
