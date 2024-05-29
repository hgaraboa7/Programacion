package repaso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca su documento, para leer 10 palabras");
		
		//ficheros1/manifiesto.txt
		
		String doc=sc.nextLine();
		
		for(int i=1;i<=10;i++) {
			
		
		
		System.out.println("Introduzca su palabra "+ i );
		
		String pal=sc.nextLine();
		
		contar(pal,doc);}
		
		
		
	}
	
	public static void contar(String palabra, String doc) {
		
		 
		
		int count=0;
		
		try(FileInputStream fi=new FileInputStream(doc)){
			
			  byte[] af = fi.readAllBytes();
	            byte[] ap = palabra.toLowerCase().getBytes(); // Convertir la palabra a minúsculas aquí

	           
	       
			
			for (int i = 0; i <= af.length - ap.length; i++) {
                boolean found = true;
                for (int j = 0; j < ap.length; j++) {
                    if (af[i + j] != ap[j]) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    count++;
                    i += ap.length - 1;
                }
			}
			 System.out.println("La palabra '" + palabra + "' aparece " + count + " veces en el documento.");
		       
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
