/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Ejercicio2 {
	
	/*
	 * 
	 * 
	 *  //codigo refinado
    Scanner scan = new Scanner(System.in);
    String respuesta = "";
    String line = "";
    String comp="";
    int counter = 0;
    System.out.println("Dime una palabra:");
    respuesta=scan.nextLine();
    try(BufferedReader br = new BufferedReader(new FileReader("Examen DAW/data/ejercicio_2/ejercicio_2.txt"))){
        line=br.readLine();
        while(line!=null){
            comp+=line;
            line=br.readLine();
        }
        String [] palabras = comp.split(" ");
        for(String palabra:palabras){
            if(palabra.equals(respuesta)){
                counter++;
            }
        }
        System.out.println("La palabra "+respuesta+"aparece "+counter+" veces.");
        
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
}*/


    public static void ejecutar() {   
    	 Scanner sc2 = new Scanner(System.in);
    
        String ruta="Examen DAW/data/ejercicio_2/ejercicio_2.txt";

    	
    	
    	try(BufferedReader br = new BufferedReader(new FileReader(ruta));
				
    			){
			
    		 String linea;
    		 
    		// Solicitar al usuario una palabra 
			
    		
    		 
			System.out.println("introduzca una palabra para contar sus apariciones");
			
			String palabra=sc2.nextLine().toLowerCase();
			
			int contador=0;
			
			while((linea= br.readLine()) != null) {
				
				 // Dividir la línea en palabras
                String[] palabras = linea.split("\\s+");

                // Contar las apariciones de la palabra buscada en la línea actual
                for (String p : palabras) {
                    if (p.toLowerCase().contains(palabra)) {
                        contador++;
                    }
                }
			}
			 System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces en el archivo.");
	           
			
			
    	} catch (IOException e) {
			
			
			
			e.printStackTrace();
		}
    }
}

	        
	       
    	
    	

    
    
