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

	String origen="Examen DAW/data/ejercicio_3/ejercicio_3.mkv";
	
	String destino="Examen DAW/data/ejercicio_3/copia_ejercicio_3.mkv";

    
    copiarArchivo(origen, destino);
}

public static void copiarArchivo(String origen, String destino) {
    File archivoOrigen = new File(origen);
    File archivoDestino = new File(destino);
    
    try (FileInputStream fis = new FileInputStream(archivoOrigen);
         FileOutputStream fos = new FileOutputStream(archivoDestino)) {
         
    	 // Buffer de 64 KB
        byte[] buffer = new byte[65536];
        int longitud;
        
        // Leer y escribir bloques de datos usando el buffer
        
        while ((longitud = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, longitud);// Aquí se utiliza el metodo write y hace la copia
        }
        
        System.out.println("Archivo copiado exitosamente a " + destino);
    } catch (IOException e) {
        System.err.println("Error al copiar el archivo: " + e.getMessage());
    }
}
}

  
