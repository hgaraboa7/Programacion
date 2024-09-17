/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;

/**
 *
 * @author hector.garaboacasas
 */
public class Ejercicio6 {
    public static void main(String[] args){
         File f = new File("./src/main/resources/datos");
         if(!f.exists()){
             System.out.println("la ruta no existe");
             return;
         }
         if(f.exists()&&f.isFile()){
             
         }
    }
    
}
