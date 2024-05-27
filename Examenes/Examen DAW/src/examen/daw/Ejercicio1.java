/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;

import java.io.File;

/**
 *
 * @author 
 */
public class Ejercicio1 {
	
	   public static void ejecutar() {
	   
	   /*
	    *
	    *  //Codigo refinado
	    * { 
	        File file = new File("Examen DAW/data/ejercicio_1");
	        for(File f :file.listFiles()){
	            if(f.isDirectory()){
	                System.out.println(f.getName()+" -  D");
	            }
	            if(f.isFile()){
	                System.out.println(f.getName()+" -  F");
	            }
	        }
	        


	    }
	}*/
      

    	
        // Ruta relativa al directorio de datos desde el directorio de trabajo actual
        File fl = new File( "Examen DAW/data/ejercicio_1");
    	
        //comprobar que el directorio existe en la ruta indicada
        if (!fl.exists()) {
            System.out.println("El directorio no existe: " + fl.getAbsolutePath());
            return;
        }else
        System.out.println("El directorio Existe");
        
        
        //listar los archivos y directorios
    	File arFile[]=fl.listFiles();
    	
    	for(int i=0;i<arFile.length;i++) {
    		
    		if(arFile[i].isDirectory()) {
    			
    			System.out.println(arFile[i]+" --- D ");
    			
    		} else if(arFile[i].isFile()) {
    		
    		System.out.println(arFile[i]+" --- F ");
    		
    	} else {
    		System.out.println(arFile[i]+" --- No es ni directorio ni archivo  ");
    	}
    	
    	
    	
    	
    	
        
    	
    	

    	}
    }
}

