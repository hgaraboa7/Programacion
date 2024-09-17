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
public class Enunciado3 {
    
    public static void main(String[] args) {
        
        System.out.println("Informacion de un fichero");
        
        File f=new File("./src/main/resources/datos/Deporte");
        
        if(f.exists()||f.isDirectory()){
           System.out.println("Existe");
             System.out.println("Es un directorio");
            //String[] lista=f.list();
              
            for (String x :f.list()){
                File nuevo=new File(f.getPath()+x);

                if(nuevo.exists()||nuevo.isDirectory()){
                    System.out.println("es directorio y su nombre: "+ nuevo.getName()+ "tamaño: "+nuevo.length());
                }else if(nuevo.exists()||nuevo.isFile()){
                    System.out.println("es fichero y su nombre: "+ nuevo.getName()+ "tamaño: "+nuevo.length());
                
            }else{
                 System.out.println("no existe o no es fichero o directorio");
                }
                
            }
        }
        else if(f.exists()||f.isFile()){
            System.out.println("Existe");
            System.out.println("es un archivo");
            
        }else{
            System.out.println("no existe");
            JOptionPane.showMessageDialog(null, "no existe");
        }
        
        
        
    }
    
}
