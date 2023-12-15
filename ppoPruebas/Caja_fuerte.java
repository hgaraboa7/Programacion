package Examen_Practica_Clase;

import java.util.*;

public class Caja_fuerte {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	 Random rdm = new Random();

     // Generar un número aleatorio de 4 cifras
     int contraseña = 1000 + rdm.nextInt(9000);

	
	
	
		//int contraseña=1234;
	
		for(int i=1;i<=4;i++) {
			
			System.out.println("Escriba la contraseña");
			
			int prueba=sc.nextInt();
			
			if(prueba==contraseña) {
				
				System.out.println("A caixa forte abriuse satisfactoriamente");
				
				i=5;
				
			}else { System.out.println("Síntoo, esa non é a combinación"); }
			
			if(i==4) {
			System.out.println(contraseña);
				
				System.out.println("Intentos finalizados, bloqueo automatico");
			}
			
		}
		sc.close();

	}

}
