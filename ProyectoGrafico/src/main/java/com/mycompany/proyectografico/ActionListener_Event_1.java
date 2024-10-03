/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectografico;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hecto
 */
public class ActionListener_Event_1 {
    
    public static void main(String[] args) {
        
       MarcoBotones mimarco= new MarcoBotones();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
    //creo mi propia clase jframe, marco
    class MarcoBotones extends JFrame{
        
        public MarcoBotones(){
            setTitle("botones y eventos");
            setBounds(700,300,500,300);
            LaminaBotones milamina=new LaminaBotones();
            add(milamina);
        }
    }
//creo mi lamina dentro para añadir botones y componentes


//la lamina al ser la que recibe el evento es quien implementa el actionlistener
//
    class LaminaBotones extends JPanel implements ActionListener{
        
        JButton botonAzul=new JButton("azul");
        JButton botonAmarillo=new JButton("amarillo");
        JButton botonRojo=new JButton("rojo");
        
        
        //constructor de la lamina añadiendo el el boton
        public LaminaBotones(){
            add(botonAzul);
            add(botonAmarillo);
            add(botonRojo);
            
            //el boton desencadena un evento de tipo action
            //y el objeto que tiene que estar a la escucha, listener,
            //es la propia clase, this, LaminaBotones
            botonAzul.addActionListener(this);
            botonAmarillo.addActionListener(this);
            botonRojo.addActionListener(this);
            
            //
        }

        
        //al pulsar el boton se crea un objeto de tipo actionevent
        //que viaja al metodo actionperformed para realizar lo que hemos puesto
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        //al usar getSource conseguimos un object para poder saber la fuente
        //vease el boton que ha sido pulsado
        Object botonPulsado=e.getSource();
        
        if(botonPulsado==botonAzul){
    
        setBackground(Color.blue);
        }else if(botonPulsado==botonRojo){
    
        setBackground(Color.red);
        }else if(botonPulsado==botonAmarillo){
    
        setBackground(Color.yellow);
        }
    
    }
        
    }
    
    
    

