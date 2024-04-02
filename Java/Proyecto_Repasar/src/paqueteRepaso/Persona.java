package paqueteRepaso;

import java.time.LocalDate;

public class Persona {

	
	public Persona(String n, String ap, LocalDate fn) {
		
		this.nombre=n;
		this.apellidos=ap;
		this.fechaNacimiento=fn;
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + "]";
	}



	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	
}
