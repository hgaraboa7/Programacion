package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializando {

	public static void main(String[] args) {
	
		Administrador jefe=new Administrador("Juan", 8000, 2005,12,15);
		
		jefe.setIncentivo(5000);
		
		
		Empleado[] personal=new Empleado[3];
		
		personal[0]=jefe;
		
		personal[1]=new Empleado("Ana", 25000, 2008,10,1);
		
		personal[2]=new Empleado("Pepa", 12000, 2004,10,1);
		
		
		try {
			ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(
		//pide un objeto del tipo outputStream
					new FileOutputStream("ficheros1/empleado.dat")	
					);
			
			// usamos el objetoutput para pasarle los datos del array de tipo empleado
			
			escribiendo_fichero.writeObject(personal);
			
			escribiendo_fichero.close();
			
			ObjectInputStream recuperando_fichero=new ObjectInputStream(
					new FileInputStream("ficheros1/empleado.dat") 
					);
			
			
			//casting para pasar objeto tipo object( que sale del input)
			Empleado[]personal_recuperado=
				(Empleado[])recuperando_fichero.readObject();			
			
			recuperando_fichero.close();
			
			for(Empleado e: personal_recuperado) {
				
				System.out.println(e);
				
			}
			
		}catch(Exception e) {
			
			System.out.println("Error al serializar");
			
		}
		
		
		

	}

}


//----------------------------------------------------

// hay que implementar la interfaz serializable

class Empleado implements Serializable{
	
	
	public Empleado(String n, double s, int agno, int mes, int dia) {
		
		
		nombre=n;
		
		sueldo=s;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		fechaContrato=calendario.getTime();
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public double getSueldo() {
		return sueldo;
		
	}
	
	public Date getFechaContrato() {
		return fechaContrato;
	}
	
	public void subirSueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", fechaContrato=" + fechaContrato + "]";
	}

	private String nombre;
	private double sueldo;
	private Date fechaContrato;
	
}
//-------------------------------------

class Administrador extends Empleado{

	


	@Override
	public String toString() {
		
		return super.toString() + " incentivo" + incentivo;
	}



	public Administrador(String n, double s, int agno, int mes, int dia) {
		super(n, s, agno, mes, dia);
		
		
		incentivo=0;
	}
	
	
	
	@Override
	public double getSueldo() {
		
		
		double sueldoBase=super.getSueldo();
		
		return sueldoBase+incentivo;
		
	}



	public void setIncentivo(double b) {
		incentivo=b;
		
	}
	
	
	
	
	
	private double incentivo;
}


















