/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kenken;

/**
 *
 * @author José
 */
public class Movimiento {
    
    String texto;
    String tipo;
    int numeroBtn;

    public Movimiento(String tipo, String texto, int numeroBtn) {
        this.tipo = tipo;
        this.texto = texto;
        this.numeroBtn = numeroBtn;
    }

    public String getTexto() {
        return texto;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroBtn() {
        return numeroBtn;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroBtn(int numeroBtn) {
        this.numeroBtn = numeroBtn;
    }
    
}
