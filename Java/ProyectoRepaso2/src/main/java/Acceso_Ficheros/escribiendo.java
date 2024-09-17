
package Acceso_Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class escribiendo {
    public static void main(String[] args){
       
       escribir_fichero escr=new escribir_fichero();
       escr.escribir();
        
    }
 }
class escribir_fichero{
    public void escribir(){
        String frase="Esto es una prueba de escritura2";
        //si el 2º argumento es "true" modifica un archivo que existe ya
            try (FileWriter escritura = new FileWriter("./src/main/resources/datos/Fichero2.txt", true)) {
               for(int i=0;i<frase.length();i++){
                   escritura.write(frase.charAt(i));
               }
               System.out.println("Escrito con exito");
        } catch (IOException ex) {
            System.out.println("No se ha encontrado");
        } 
    }
}