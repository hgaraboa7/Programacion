package leyendo_escribiendo_bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escritura {

	public static void main(String[] args) {
		
		int contador=0;
		
		int datos_entrada[]=new int[809607];
		
		try {
			
			//funciona obviamente tambien con textos
			FileInputStream archivo_lectura=new FileInputStream("ficheros1/BinLaden.webp");
		
			boolean final_ar=false;
			
			while(!final_ar) {
				
				
				//la variable tiene el valor en bytes leidos con el metodo .read
				
				int byte_entrada=archivo_lectura.read();
				
				
				// mientras no sea -1(ultima posicion del metodo .read
				// pasa el valor en bytes al array en la posicion establecida en el contador
				
				if(byte_entrada!=-1) {
					
					datos_entrada[contador]=byte_entrada;}
				
				//if(byte_entrada==-1)
				else {
					final_ar=true;}
				
				//System.out.println(byte_entrada);
				
				System.out.println(datos_entrada[contador]);
				
				contador++;
				
			}
			
			archivo_lectura.close();
		
		} catch (IOException e) {
			
			System.out.println("Error al acceder a la imagen");
			
		}
		// muestra bytesw totales o vueltas del bucle while
		System.out.println(contador);
		
		// usa los datos(bytes) almacenados en el array para el metodo de crear el fichero
		crea_fichero(datos_entrada);
		

	}

	static void crea_fichero(int datos_nuevo_fichero[]) {
		
		try {
			
			FileOutputStream fichero_nuevo=new FileOutputStream("ficheros1/BinLaden_copia.webp");
			
			for(int i=0;i<datos_nuevo_fichero.length; i++) {
				
				fichero_nuevo.write(datos_nuevo_fichero[i]);
				
			}
			
			fichero_nuevo.close();
			
		}
		catch(IOException e){
			
			System.out.println("Error al crear el archivo");
			
		}
		
		
		
	}
	
	
	
	
	
}
