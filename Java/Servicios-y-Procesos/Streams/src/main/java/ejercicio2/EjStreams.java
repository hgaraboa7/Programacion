package ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EjStreams {
    public static void main(String[] args) throws IOException {
        
        Cosa[] cosas = new Cosa[5];
        
        for (int i = 0; i < cosas.length; i++) {
            cosas[i] = new Cosa(i); 
            cosas[i].lanza();
        }
             
        /*while (true) {
            boolean anyAlive = false;
            
            for (Cosa cosa : cosas) {
                if (cosa.p.isAlive()) {
                    anyAlive = true;
                    break;
                }
            }

            if (!anyAlive) {
                break;
            }
            
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
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
        
        public Cosa(int numP) {
            this.numP = numP;
            pb = new ProcessBuilder("java", "-cp", classPath, "ejercicio2.Hijo");
        }
        

        public void lanza() throws IOException {
            //pb.inheritIO();
            p = pb.start(); 
            
            outputStream = p.getOutputStream();
            inputStream = p.getInputStream();
            writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            reader = new BufferedReader(new InputStreamReader(inputStream));
            
            while (true) {
                writer.write("" + numP + "\n"); 
                writer.flush();
                
                String response = reader.readLine();
                System.out.println("Proceso " + this.numP + "   respuesta:" + response);
                if ("1".equals(response)) { 
                    break;
                }
            }
        }
    }
}
