/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buscaminas;

import javax.swing.JButton;
/**
 *
 * @author PC
 */
public class Cuadro extends JButton{
    private boolean mina;
    
    public Cuadro(){
        super();
        double random = Math.random();
        if (random > 0.9)
            mina=true;
        else
            mina=false;
    }
    public boolean estaMinado(){
        return mina;
    }
}
