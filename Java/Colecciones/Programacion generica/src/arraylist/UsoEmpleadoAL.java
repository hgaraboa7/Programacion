package arraylist;
import java.util.*;

public class UsoEmpleadoAL {
	public static void main(String[] args) {
		
		/*Empleado listaEmpleados[]=new Empleado[3];
		
		listaEmpleados[0]=new Empleado("Ana", 45, 2500);
		
		listaEmpleados[1]=new Empleado("Manolo", 57, 2000);
		
		listaEmpleados[2]=new Empleado("Fran", 25, 35000);*/
		
		ArrayList <Empleado> listaEmpleados=new ArrayList<Empleado>();
		
		listaEmpleados.ensureCapacity(11);
		
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		
		listaEmpleados.add(new Empleado("Manolo", 57, 2000));
		
		listaEmpleados.add(new Empleado("Fran", 25, 35000));
		
		//listaEmpleados.trimToSize();
		
		
		//Set poner un elemento en posicion concreta, get obtener un objeto de una posicion concreta
		
		/*listaEmpleados.set(1, new Empleado("Pio", 29, 8900));
		
		System.out.println(listaEmpleados.get(1).dameDatos());*/
		
		
		//uso iterador
		
		Iterator <Empleado> mi_iterador=listaEmpleados.iterator();
		
		while(mi_iterador.hasNext()) {
			
			System.out.println(mi_iterador.next().dameDatos());
			
			
		}
		
		
		
		/*System.out.println(listaEmpleados.size());
		
		
		/*for (Empleado e: listaEmpleados) {
			
			System.out.println(e.dameDatos());
			
		}
		
		/*for(int i=0;i<listaEmpleados.size();i++) {
			
			Empleado e=listaEmpleados.get(i);
			
			System.out.println(e.dameDatos());
	
			
		}*/
		
		
		//pasar arraylist a array normal
		
		/*Empleado arrayEmpleados[]=new Empleado[listaEmpleados.size()];
		
		
		listaEmpleados.toArray(arrayEmpleados);
		
		for(int i=0; i<arrayEmpleados.length;i++) {
			
			System.out.println(arrayEmpleados[i].dameDatos());
			
		}*/
		
		
	}

}


class Empleado{
	
	public Empleado(String nombre, int edad, double salario) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
		
	}
	
	public String dameDatos() {
		return "El empleado se llama "+nombre+". Tiene "+edad
				+" años."+" Y un salario de "+salario;
		
	}
	private String nombre;
	private int edad;
	private double salario;
}