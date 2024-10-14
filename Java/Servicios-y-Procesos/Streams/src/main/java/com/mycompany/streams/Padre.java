package com.mycompany.streams;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class Padre {
    public static void main(String[] args) throws InterruptedException {
        try {
            
            String classPath = "C:\\Users\\hector.garaboacasas\\Documents\\NetBeansProjects\\Streams\\target\\classes";
            ProcessBuilder pb = new ProcessBuilder("java", "-cp", classPath, "com.mycompany.streams.Streams");
            Process procesoHijo = pb.start();
            
           
            
            OutputStream outputStreamHijo = procesoHijo.getOutputStream(); //método que afecta los procesos.
            
            
            
            outputStreamHijo.write("Hola hijo\n".getBytes());
            outputStreamHijo.write("Este es el padre\n".getBytes());
            outputStreamHijo.flush(); // se asegura que se envían los datos.
            outputStreamHijo.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(procesoHijo.getInputStream())); // me pilla el imputStream del hijo
            
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println("Padre recibió del hijo: " + linea);
            }
            
            int exitCode = procesoHijo.waitFor(); // los procesos devuelven al finla un exit code.
            
            System.out.println(exitCode);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
