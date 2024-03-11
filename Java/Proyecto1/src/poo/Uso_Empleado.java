package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		
		Jefatura jefe_RRHH=new Jefatura("Jon", 55500, 2005, 9, 22);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		misEmpleados[1]=new Empleado("Pilucha", 45000, 19860, 8, 1);
		
		misEmpleados[2]=new Empleado("Maria Maria", 105000, 2015, 9, 8);
		
		misEmpleados[3]=new Empleado("Manolo Furao");
		
		misEmpleados[4]=jefe_RRHH; //poliformismo, principio de sustitucion
		
		misEmpleados[5]=new Jefatura("Mar Salada", 55500, 2004, 9, 8);
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5]; //casting, convertir de clase misEmpleados a Jefatura
		
		jefa_Finanzas.estableceIncentivo(5000);
		
		/*for(int i=0; i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}*/
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a empleados"));		
		
		
		System.out.println("El Jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de: " +
		jefa_Finanzas.establece_bonus(500));
		
		System.out.println("El Empleado " + misEmpleados[3].dameNombre() + " tiene un bonus de: " +
		misEmpleados[3].establece_bonus(200));
		
		
		for(Empleado e:misEmpleados) {
			
			e.subeSueldo(5);
			
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e:misEmpleados) {  //bucle for each
			
			System.out.println("Nombre: "+ e.dameNombre()
					+ " Sueldo: " + e.dameSueldo()
					+ " Fecha de Alta: " + e.dameFechaContrato());
		}
		
		/*for(int i=0;i<3;i++) {
			System.out.println("Nombre: "+ misEmpleados[i].dameNombre()
					+ " Sueldo: " + misEmpleados[i].dameSueldo()
					+ " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		
		
		
		
	}

}




class Empleado implements Comparable, Trabajadores {
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) { //Constructor
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
		
	}
	
	public Empleado(String nom) {
		
		this(nom, 10000, 2000,01,01);
		
	}
	
	
	
	public String dameNombre() { //getter
		
		return nombre;
	}
	public double dameSueldo() { //getter
		
		return sueldo;
	}
	public Date dameFechaContrato() { //getter
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public int compareTo(Object miObjeto) {
	
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
		
	}
	
	
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
}

class Jefatura extends Empleado implements Jefes{
	
	
	
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
		
		
	}
	
	public String tomar_decisiones(String decision) {
		
		return "un miembro de la dirección ha tomado la decisión de: " + decision; 
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
		
	}
	
	
	public void estableceIncentivo(double b) { //setter
		
		incentivo=b;
		
	}
	
	public double dameSueldo() { //getter sobreescribiendo, solo para esta clase 
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	
	private double incentivo;
	
	
}

	

