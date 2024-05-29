package repaso;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
	

		Scanner sc=new Scanner(System.in);		
		
		System.out.println("Introduzca la ruta del archivo de origen(ficheros1/ejemplo1.txt)");	

		//ficheros1/ejemplo1.txt
		
		String origen=sc.nextLine();
		
		leer(origen);
		
	}
	
public static void leer(String origen) {
		
		try(BufferedReader br=new BufferedReader(new FileReader(origen));)
		{	
			//hacer BUFFER (array de bytes) para crear el nuevo fichero1
			
			String linea="";
			
			while(linea!=null) {
				
				linea=br.readLine();
				
				if(linea!=null) {
					System.out.println(linea);
					}
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
}
