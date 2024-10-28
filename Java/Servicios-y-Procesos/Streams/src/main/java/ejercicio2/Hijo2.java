/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author hector.garaboacasas
 */
public class Hijo2 {
    
    public static void main(String[] args){
        
         try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))){
           
            int numero=0;
            
           
            
          
                
            
            while(true){
                
                numero=reader.read();
                
                 int numeroHijo=(int)(Math.random()*5+1);
                if(numero==numeroHijo){
                    writer.write("funcioa");
                    writer.flush();
                    break; 
                }
                else{
                        writer.write("NO funciona");
                    writer.flush(); 
                }
                    
            }
                
            
            
        
        
        
        } catch (IOException ex) {
            Logger.getLogger(Hijo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
