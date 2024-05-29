package repaso;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejer1 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);		
		
		System.out.println("Introduzca la ruta del archivo de origen(ficheros1/BinLaden.webp)");	

		//ficheros1/BinLaden.webp
		
		String origen=sc.nextLine();
		
		
		System.out.println("Introduzca la ruta del archivo de destino(ficheros1/BinLaden_copia)");	
			
		//ficheros1/BinLaden_copia_n.webp
		
		String destino=sc.nextLine();
		
		copiar(origen, destino);
		
		sc.close();
			
	}
			
		public static void copiar(String origen, String destino) {
		
		try(BufferedInputStream bi=new BufferedInputStream(new FileInputStream(origen));
				BufferedOutputStream bo= new BufferedOutputStream(new FileOutputStream(destino));){
			
			//hacer BUFFER (array de bytes) para crear el nuevo fichero1
			
			byte[] bff=bi.readAllBytes();
			
			bo.write(bff);
			System.out.println("copiado con exito");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
