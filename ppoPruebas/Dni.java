package Examen_Practica_Clase;

import java.util.*;

public class Dni {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		
		System.out.println("Hola, introduzca su numero de DNI para averiguarle la letra");
				
		int a=sc.nextInt();
				
		int resto=a%23;
		
		String [] cadena1= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		
		for(int i=0; i<=resto;i++) {
			
			if(i==resto) {
				System.out.println(cadena1[i]);
			}
			
		}
		
		sc.close();

	}

}
