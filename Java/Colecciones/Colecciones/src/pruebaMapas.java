
import java.util.*;

public class pruebaMapas {

	

	public static void main(String[] args) {
		

		HashMap<String, Empleado> personal=new HashMap<String, Empleado>();
		
		
		
		personal.put("145", new Empleado("Juan"));
		
		personal.put("146", new Empleado("Lol"));
		
		personal.put("149", new Empleado("Jun"));
		
		personal.put("167", new Empleado("Pop"));
		
		System.out.println(personal);
		
		personal.put("146", new Empleado("pepal"));
		System.out.println(personal);
		
		//System.out.println(personal.entrySet());
		
		
		for(Map.Entry<String, Empleado> entrada:personal.entrySet()) {
			
			
			String clave=entrada.getKey();
			
			Empleado valor=entrada.getValue();		
			
			System.out.println("Clave= "+ clave + " Valor= " +valor);
			
		}
		
		
	}

}

class Empleado{
	
	public Empleado(String n) {
		
		nombre=n;
		
		sueldo=2000;
		
		
	}
	
	public String toString() {
		
		return"[nombre=" + nombre + ",sueldo=" + sueldo +"]";
		
	}
	
	
	private String nombre;
	
	private double sueldo;
	
}