package ficheros_directorios;

import java.io.File;

public class Acceso_ficheros {

	public static void main(String[] args) {
	

		File ruta=new File("C:\\Users\\hecto\\OneDrive\\Escritorio\\DAW\\Programacion java\\Proyecto_ficheros");
		
		
		//imprimir ruta absoluta
		System.out.println(ruta.getAbsolutePath());
		
		
		//pasar ruta a array de strings
		String[]nombres_archivos=ruta.list();
		
		//usar foreach y array de strings para recorrer todos los elementos
		for(String s: nombres_archivos) {
			
			System.out.println(s);

			//almacenar en file f lo obtenido por el bucle
			File f=new File(ruta.getAbsolutePath(),s);
			
			//comprueba si lo almacenado en f en cada vuelta del 
			//bucle es un directrorio
			if(f.isDirectory()) {
				
				//pasar f a array de strings
				String[]archivos_subcarpeta=f.list();
				
				//otro foreach para recorrer como antes
				for (String j: archivos_subcarpeta) {
					System.out.println(j);
					
				}
				
			}
			
			
			
		}
		
		

	}

}
