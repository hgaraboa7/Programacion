import java.util.*;


public class adivinanumero {

	public static void main(String[] args) {
		
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		do {
			intentos++;
			System.out.println("introduce un numero");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				
				System.out.println("Mas bajo");
											
			}
			else if (aleatorio>numero) {
				System.out.println("mas alto");
			}
			
		}while(numero!=aleatorio);
		
		
		System.out.println("Correcto. Lo has conseguido en "+ intentos + " intentos");
		
		
	}

}
