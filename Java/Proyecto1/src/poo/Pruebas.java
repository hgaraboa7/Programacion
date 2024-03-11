package poo;

public class Pruebas {

	public static void main(String[] args) {
		
	Empleados trabajador1=new Empleados("Paco");	
		
	Empleados trabajador2=new Empleados("Ana");
	
	Empleados trabajador3=new Empleados("Pipo");
	
	Empleados trabajador4=new Empleados("Eugenia");
	
	Empleados trabajador5=new Empleados("Polo");
	
	trabajador1.cambiaSeccion("RRHH");
	
	
	
	
	System.out.println(trabajador1.devuelveDatos() + "\n" + 
			trabajador2.devuelveDatos()+ "\n" + trabajador3.devuelveDatos() 
			+ "\n" + trabajador4.devuelveDatos());

	System.out.println(Empleados.dameIdSiguiente());
	
	
	
	
	
	
	}

}






class Empleados{
	
	public Empleados(String nom) {
		
		nombre=nom;
		
		seccion="Administracion";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	public void cambiaSeccion(String seccion) { //setter
		
		this.seccion=seccion;
		
	}
	
	
	
	
	
	
	
	public String devuelveDatos() { //getter
		
		return "El nombre es: " + nombre + " y la seccion es: " + seccion
				+ " y el Id=" +Id;
		
	}
	
	public static String dameIdSiguiente() {
		
		return "El IdSiguiente es: " + IdSiguiente;
	}
	
	
	
	private final String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=1;
	
}