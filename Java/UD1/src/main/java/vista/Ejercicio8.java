package vista;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hector.garaboacasas
 */
public class Ejercicio8 {
    
    public static void main(String[] args){
        
        try (FileOutputStream fos=new FileOutputStream("./src/main/resources/ficheroorigen.dat");
                DataOutputStream dos=new DataOutputStream(fos);
                FileInputStream fis=new FileInputStream("./src/main/resources/ficheroorigen.dat");
                DataInputStream dis=new DataInputStream(fis)
                ){
            String nombres[]={"ana","Luis miguel","pepe","pedro","manuel","andres",
                "julio","antonio","maria jesus"};
            int edades[]={20,22,14,15,13,16,21,20,17};
            double salarios[]={1100.11,123.45,96847.98,8685.96,1100.11,123.45,96847.98,8685.96,777.77};
            
            for(int i=0;i<edades.length;i++){
                dos.writeUTF(nombres[i]);
                dos.writeInt(edades[i]);
                dos.writeDouble(salarios[i]);
            }
            
            while(dis.available()!=0){
                System.out.println(" Nombre: "+dis.readUTF()+" Edad: "+ dis.readInt()+" Salario: "+dis.readDouble());
                
            }
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio8.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
