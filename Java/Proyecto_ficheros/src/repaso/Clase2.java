package repaso;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Clase2 {
	
	


	public static void main(String[] args) {
		
		int contador=0;
		
		int datos_entrada[]=;
		
		String ruta="Programacion-main/Java/Proyecto_ficheros/ficheros1/coche.dat";
		
		Scanner sc=new Scanner(System.in);
		
		try(DataOutputStream dos= new DataOutputStream(new FileOutputStream(ruta, true));
				DataInputStream dis= new DataInputStream(new FileInputStream(ruta))){
			System.out.println("diga su opcion");
			
			int opcion=sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			
			case 1:{
			
			
			for(int i=0;i<=3;i++) {
			
			System.out.println("Introduce la matricula");
			
			String matr=sc.nextLine();
			
			System.out.println("Introduce la marca");
			
			String marc=sc.nextLine();
			
			System.out.println("Introduce tamaño deposito");
			
			double dep=sc.nextDouble();
			
			System.out.println("Introduce modelo");
			
			String mod=sc.nextLine();
			
			dis.
			
			
			dos.writeUTF(matr);
			dos.writeUTF(matr);
			dos.writeDouble(dep);
			dos.writeUTF(matr);
			
			
			sc.nextLine();
			}
			}
			
			case 2 : {
				
				
			
			
			boolean final_ar=false;
			
			while(!final_ar) {
				
				
				//la variable tiene el valor en bytes leidos con el metodo .read
				
				int byte_entrada=dis.read();
				
				
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
