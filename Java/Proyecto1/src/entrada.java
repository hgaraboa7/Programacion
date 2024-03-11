import java.util.*;

public class entrada {

	public static void main(String[] args) {
		
	Scanner entrada=new Scanner(System.in);
		
	System.out.println("Pon tu nombre: ");
	
	String nombre_usuario=entrada.nextLine();
	
	System.out.println("introduce edad: ");
	
	int edad=entrada.nextInt();
	
	System.out.println("hola " + nombre_usuario + 
	", el año que viene tendras " + (edad+1) + " años.");
	
	
	}

}
