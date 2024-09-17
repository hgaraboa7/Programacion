/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author hector.garaboacasas
 */
public class Ejercicio7 {
    public static void creaDirectorio(File dir){
         if(!dir.exists()){
             dir.mkdir();
         }
    }
         public static void creaFichero(File fich) throws IOException{
         if(!fich.exists()){
             fich.createNewFile();
         }
         }
    public static void main(String[] args) throws IOException{
         File d1 = new File("./src/main/resources/juegos");
         creaDirectorio(d1);
         String n1="rol";
         File d2 = new File(d1,n1);
         creaDirectorio(d2);
         File f1=new File(d2,"D&D.txt");
         creaFichero(f1);
         String n2="parejas";
         File d3=new File(d1,n2);
         creaDirectorio(d3);
             
         
    }
    
}
