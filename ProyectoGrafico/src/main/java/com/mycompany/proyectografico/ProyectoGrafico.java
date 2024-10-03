/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectografico;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author hecto
 */
public class ProyectoGrafico {

    public static void main(String[] args) {
        //marco normal
//        miMarco marco= new miMarco();
//        marco.setVisible(true);
//        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    
    
//marco centrado
          MarcoCentrado marco= new MarcoCentrado();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    
}

class miMarco extends JFrame{
    
    public miMarco(){
        
        //setSize(500,300);
        
       // setLocation(500,300);
       
       // hace setsize y setlocation a la vez
       setBounds(500,300,550,250);
       
       //no deja cambiar el tamaño con el raton
       //setResizable(false);
       
       //pantalla maximizada
       //setExtendedState(Frame.MAXIMIZED_BOTH);
        
       
       setTitle("mi ventana");
    }
    
}


class MarcoCentrado extends JFrame{
    
    public MarcoCentrado(){
        
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        
        Dimension tamano=mipantalla.getScreenSize();
        
        int altura=tamano.height;
        int ancho=tamano.width;
        
        //el tamaño sera el de la mitad de la pantalla
        setSize(ancho/2,altura/2);
        
        //para que cree centrado, se divide entre 4 por ocupar la mitad de la pantalla
        //y entonces para que este en el centro tendriamos que dividir la pantalla en 4
        //para que fuera 1/4 sin ocupar 2/4 ocupados y 1/4 sin ocupar
        setLocation(ancho/4,altura/4);
        
        setTitle("mi ventana centrada");
        
        Image Icono=mipantalla.getImage("src\\main\\java\\com\\mycompany\\proyectografico\\icono.jpg");
        setIconImage(Icono);
        
    }
    
}
