/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author hector.garaboacasas
 */
public class Enunciado2 {
    
    public static void main(String[] args) {
        
        System.out.println("Informacion de un fichero");
        
        File f=new File("./src/main/resources/datos/Fichero2");
        
        if(f.exists()){
           System.out.println("Existe");
            if (f.isDirectory()){
                System.out.println("Es un directorio");
            }else{
                System.out.println("es un archivo");
            }
            
            
            
            
        }else{
            System.out.println("no existe");
            JOptionPane.showMessageDialog(null, "no existe");
        }
        
        
        
    }
    
}
