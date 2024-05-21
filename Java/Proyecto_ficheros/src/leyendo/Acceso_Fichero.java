package leyendo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {

	public static void main(String[] args) {
		
		Leer_Fichero accediendo=new Leer_Fichero();
		
		accediendo.lee();

	}

}

class Leer_Fichero{
	
	 public void lee() {
		 
		 
		 try {
			FileReader entrada=new FileReader("ficheros1/ejemplo1.txt");
		
			int c=0;
			
			while(c!=-1) {
				
				c=entrada.read();
				
				char letra=(char)c;
				
				System.out.print(letra);
				
			} 
			entrada.close();
		 
		 } catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo");
		
		}
		 
		 
	 }
	 
	 
	
}
