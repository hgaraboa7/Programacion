/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Persona;

/**
 *
 * @author hector.garaboacasas
 */
public class Ejercicio10 {
    
   public static void main(String[] args){
       File datos=new File("./src/main/resources/datos/datos.txt");
       Persona p1;
       if(!datos.exists()){
           System.out.println("Fichero no existe");
       }
       try(FileReader fr=new FileReader(datos);BufferedReader br=new BufferedReader(fr);
               FileOutputStream fos=new FileOutputStream(datos);ObjectOutputStream oos=new ObjectOutputStream(fos);
               //FileInputStream fos=new FileInputStream(datos);ObjectInputStream oos=new ObjectInputStream(fos);
               ){
           String linea="";
           String[] palabras;
           
           while(linea!=null){
               linea=br.readLine();
               System.out.println(linea);
               palabras=linea.split(":");
               
               int id=Integer.parseInt(palabras[0]);
               String  nombre=palabras[1];
               double salario=Double.parseDouble(palabras[3]);
               
               p1=new Persona(id,nombre,salario);
               
           }
           
           
           
       } catch (FileNotFoundException ex) {
           Logger.getLogger(Ejercicio9.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Ejercicio9.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   } 
   
    
    
}
