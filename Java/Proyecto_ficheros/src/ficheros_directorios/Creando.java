package ficheros_directorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {
		
		File ruta=new File("C:\\Users\\hecto\\OneDrive\\Escritorio\\DAW\\Programacion java\\Proyecto_ficheros\\nuevo_archivo.txt");
		
		//crear directorio, en la ruta especificada con el nombre especificado
		//ruta.mkdir();

		String archivo_destino=ruta.getAbsolutePath();
		
		
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			System.out.println("Error al crear el archivo");
		}
		
		
		
		Escribiendo accede_es=new Escribiendo();
		
		accede_es.escribir(archivo_destino);
		
		
	}

}



class Escribiendo{
	
	public void escribir(String ruta_archivo) {
		
		String frase="Esto es un ejemplo";
		
		//escribimos cpn filewritter el string frase
		try {
			FileWriter escritura=new FileWriter(ruta_archivo);
			
			for(int i=0; i<frase.length();i++) {
				
				escritura.write(frase.charAt(i));
				
			}
			
			escritura.close();
			
		}catch(IOException e){
			
		}
		
	}
	
}





