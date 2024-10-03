/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectografico;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author hecto
 */
public class Ventana2 {
       public static void main(String[] args) {

        MarcoVentana mimarco = new MarcoVentana();

         MarcoVentana mimarco2 = new MarcoVentana();

         //si se usa exit_on_close se cierran las dos ventanas al solo cerrar una
         
         
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //dispose permite cerrrar sin finalizar el programa directamente
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mimarco.setTitle("ventana1");
        mimarco2.setTitle("ventana2");
        
        mimarco.setBounds(700, 300, 500, 300);
        mimarco2.setBounds(900, 200, 500, 300);
    }
}
//creo mi propia clase jframe, marco

class MarcoVentana extends JFrame {

    public MarcoVentana() {
        //setTitle("botones y eventos");
        //setBounds(700, 300, 500, 300);
        setVisible(true);
        
        /*M_Ventana_2 oyente=new M_Ventana_2();
        
        addWindowListener(oyente);*/
        
        
        //instanciar directamente
        addWindowListener(new M_Ventana_2());
        
    }
}


//con clase adaptadora no hace falta implementar todos los metodos, solo los
// que necesitemos
class M_Ventana_2 extends WindowAdapter{
    
    @Override
    public void windowIconified(WindowEvent e) {
       
        System.out.println("Ventana Minimizada y usado window adapter");
    
    }

}


class M_Ventana implements WindowListener{

    
    
    @Override
    public void windowOpened(WindowEvent e) {
      }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada");
        }

    @Override
    public void windowIconified(WindowEvent e) {
       
        System.out.println("Ventana Minimizada");
    
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        }

    @Override
    public void windowActivated(WindowEvent e) {
      }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
    

 