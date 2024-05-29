package repaso;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class clase1 {

	public static void main(String[] args) {
		
		try(BufferedReader br= new BufferedReader(new FileReader("Programacion-main/Java/Proyecto_ficheros/ficheros1/fichero_prueba_comas.csv"));
			//true para que el bw cree despues del ultimo 
				BufferedWriter bw= new BufferedWriter(new FileWriter("Programacion-main/Java/Proyecto_ficheros/ficheros1/fichero_prueba_comas.csv", true));
					){
			
			String numero="6";
			
			String linea;
			
			
			while((linea= br.readLine()) != null) {
				
				String[] numeros= linea.split(",");
				
				if(numeros[0].startsWith(numero)) {
					
					System.out.println("cp: "+numeros[0]+" localidad: "+numeros[1]+" dinero: "+ numeros[2]);
					
				}
				linea=br.readLine();
				
				
				
	
}//escribir

			//newline para crearlo debajo del ultimo
			bw.newLine();
			//append para añadir el restaurante nuevo
			bw.append("1111,Restaurante Pepito,4856");
			
			
		
		
			
			
			
			
				
			
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
