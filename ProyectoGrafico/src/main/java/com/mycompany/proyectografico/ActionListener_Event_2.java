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
public class ActionListener_Event_2 {

    public static void main(String[] args) {

        MarcoBotones_2 mimarco = new MarcoBotones_2();

        mimarco.setVisible(true);

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
//creo mi propia clase jframe, marco

class MarcoBotones_2 extends JFrame {

    public MarcoBotones_2() {
        setTitle("botones y eventos");
        setBounds(700, 300, 500, 300);
        LaminaBotones_2 milamina = new LaminaBotones_2();
        add(milamina);
    }
}
//creo mi lamina dentro para añadir botones y componentes

class LaminaBotones_2 extends JPanel {

    JButton botonAzul = new JButton("azul");
    JButton botonAmarillo = new JButton("amarillo");
    JButton botonRojo = new JButton("rojo");

    //constructor de la lamina añadiendo el el boton
    public LaminaBotones_2() {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        //instancias colorFondo
        ColorFondo Amarillo=new ColorFondo(Color.yellow);
        ColorFondo Azul=new ColorFondo(Color.blue);
        ColorFondo Rojo=new ColorFondo(Color.red);
        //el boton desencadena un evento de tipo action
        //y el objeto que tiene que estar a la escucha, listener,
        //es la clase colorFondo, al usar instancias creadas ya con
       // parametro Color."nombre color" se le pasa directamente por el constructor
       //y luego el evento actionperformed establece el color de fondo segun lo
       //almacendado en la variablecolorDeFondo
        
        
        botonAzul.addActionListener(Azul);
        botonAmarillo.addActionListener(Amarillo);
        botonRojo.addActionListener(Rojo);

    }

    private class ColorFondo implements ActionListener {

        public ColorFondo(Color c) {
            colorDeFondo = c;
        }
        private Color colorDeFondo;

        @Override
        public void actionPerformed(ActionEvent e) {

            setBackground(colorDeFondo);

        }

    }

}
