
package Acceso_Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class leyendo {
    public static void main(String[] args){
       
       leer_fichero acce=new leer_fichero();
       acce.lee();
         
    }
 }
class leer_fichero{
    public void lee(){
        
            try (FileReader entrada = new FileReader("./src/main/resources/datos/Fichero1")) {
                int c=0;
                while (c!=-1){
                    c=entrada.read();
                    char letra=(char)c;
                    System.out.print(letra);
                }
            }
         catch (IOException ex) {
            System.out.println("No se ha encontrado");
        } 
    }
}