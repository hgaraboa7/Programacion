/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.servicios.dependencias;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hector.garaboacasas
 */
public class Padre {

    public static void main(String[] args) throws IOException {
        
        String a="prueba ";
        String classPath = ".\\target\\classes";
        List<ProcessBuilder> lista=new ArrayList<>();
        
//        ProcessBuilder pb=null;
        
//       pb = new ProcessBuilder("java", "-cp", classPath, "com.servicios.dependencias.Escribir", "" + a);
//        
//       pb.inheritIO(); //heredar I/O del otro proceso
//       
//       pb.start();
        
       
        
        for(int i=0;i<=4;i++){
            
            a="prueba 2 " + i;
           
             ProcessBuilder pb2 = new ProcessBuilder("java", "-cp", classPath, "com.servicios.dependencias.Escribir", "" + a);
        
             pb2.inheritIO();
             
             lista.add(pb2);
             
            
        }
        
        List<Process> listaProceso=new ArrayList<>();
        try {
             for(int i=0;i<=4;i++){
           
                Process p=lista.get(i).start();
                         
                listaProceso.add(p);
                
                //listaProceso.get(i).waitFor();    
                listaProceso.get(1).waitFor();  
                listaProceso.get(2).waitFor(); 
                
                listaProceso.get(3).waitFor();  
                listaProceso.get(4).waitFor();  
                
            
        }
            

        } catch (IOException ex) {
            System.out.println("error");
        } catch (InterruptedException ex) {
            Logger.getLogger(Padre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
