package ficheros_directorios;

import java.io.File;

public class Eliminando {
	
	public static void main(String[] args) {
	
		File ruta=new File("C:\\Users\\hecto\\OneDrive\\Escritorio\\DAW\\Programacion java\\Proyecto_ficheros\\nuevo_archivo.txt");
		
		
		
		ruta.delete();
	}

}
