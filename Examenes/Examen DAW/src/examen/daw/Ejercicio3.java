/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;



import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

/**
 *
 * @author 
 */
public class Ejercicio3 {
public static void ejecutar() {
public static void ejecutar() {
        try(BufferedOutputStream br = new BufferedOutputStream(new FileOutputStream(".\\data\\ejercicio_3\\copia_ejercicio_3.mkv"));
            BufferedInputStream bi = new BufferedInputStream(new FileInputStream(".\\data\\ejercicio_3\\ejercicio_3.mkv"))){
            byte [] b = bi.readAllBytes();
            br.write(b);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
}
}
  
