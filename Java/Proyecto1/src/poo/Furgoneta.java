package poo;

public class Furgoneta  extends Coche{

	private int capacidad_carga;
	
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		
		super(); //llamar al constructor de la clase padre, en este caso "Coche"
		
		this.capacidad_carga=capacidad_carga;
		
		this.plazas_extra=plazas_extra;
		
	}
	
	public String dimeDatosFurgoneta() {
		
		return "la capacidad de carga es: "+ capacidad_carga + " y las plazas son: "
				+ plazas_extra;
		
	}
	
	
	
}
