package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjStreams {
    public static void main(String[] args)  {
        
       
        
       
        try { 
            Cosa cosa = new Cosa();
            cosa.lanza();
            
            
         
        } catch (IOException ex) {
            Logger.getLogger(EjStreams.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static class Cosa {
        int numP; 
        String classPath = "C:\\Users\\hector.garaboacasas\\Documents\\NetBeansProjects\\Streams\\target\\classes";
        public ProcessBuilder pb;
        public Process p;
        public OutputStream outputStream;
        public InputStream inputStream;
        public BufferedWriter writer;
        public BufferedReader reader;
        
        public Cosa() {
           
            pb = new ProcessBuilder("java", "-cp", classPath, "ejercicio3.Hijo");
        }
        

        public void lanza() throws IOException {
           
            p = pb.start(); 
            
            outputStream = p.getOutputStream();
            inputStream = p.getInputStream();
            writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            reader = new BufferedReader(new InputStreamReader(inputStream));
             Scanner sc= new Scanner(System.in);
            while (true) {
                
                
                String palabras=sc.nextLine();
                
               
               writer.write("" + palabras + "\n"); 
               
               writer.flush();
                
                String response = reader.readLine();
                System.out.println("Proceso  respuesta:" + response);
                
                
                if ("1".equals(response)) { 
                    break;
                }
               
            }
        }
    }
}
