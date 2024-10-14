/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hector.garaboacasas
 */
public class Padre2 {

    public static void main(String[] args) {

        int numero = 3;

        List<ProcessBuilder> lista = new ArrayList<>();

        ProcessBuilder pb;

        String classPath = "C:\\Users\\hector.garaboacasas\\Documents\\NetBeansProjects\\Streams\\target\\classes";

        try {

            for (int i = 1; i <= 5; i++) {
                pb = new ProcessBuilder("java", "-cp", classPath, "ejercicio2.Hijo2");
                
                lista.add(pb);
            }

            List<Process> listaProceso = new ArrayList<>();

            for (int i = 0; i <= 4; i++) {
            
            listaProceso.add(lista.get(i).start());
            

            OutputStream ouHijo = listaProceso.get(i).getOutputStream();
            
            
            ouHijo.write(numero);
            ouHijo.flush();
            
            
             InputStreamReader reader = new InputStreamReader(listaProceso.get(i).getInputStream());
            
            

            int linea;
            while ((linea = reader.read()) != -1) {
                System.out.println("recibido " + linea);
                ouHijo.close();
            }
            
            
            
            }
            
//            ouHijo2.write(numero);
//            ouHijo2.flush();
//            ouHijo3.write(numero);
//            ouHijo3.flush();
//            ouHijo4.write(numero);
//            ouHijo4.flush();
//            ouHijo5.write(numero);
//            ouHijo5.flush();
            

           

        } catch (IOException ex) {
            Logger.getLogger(Padre2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
