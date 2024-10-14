/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author hector.garaboacasas
 */
public class Hijo2 {
    
    public static void main(String[] args) {
        
        try {
            InputStreamReader reader= new InputStreamReader(System.in);
            int numero;
            
            int numeroHijo=(int)(Math.random()*5+1);
            
            
            
            while((numero=reader.read())!=-1){
                
                if(numero==numeroHijo)
                    System.out.println("El Proceso responde");
                
                
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Hijo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
