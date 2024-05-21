package leyendo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_Buffered {

	public static void main(String[] args) {
		
		Leer_Buffer accediendo=new Leer_Buffer();
		
		accediendo.lee();

	}

}

class Leer_Buffer{
	
	 public void lee() {
		 
		 
		 try {
			 
			 
			 //igual para Writter
			 
			FileReader entrada=new FileReader("ficheros1/ejemplo1.txt");
		
			BufferedReader buff=new BufferedReader(entrada);
			
			
			
			String linea="";
			
			while(linea!=null) {
				
				linea=buff.readLine();
				
				if(linea!=null) {
				System.out.println(linea);
				}
			} 
			entrada.close();
		 
		 } catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo");
		
		}
		 
		 
	 }
	 
	 
	
}
