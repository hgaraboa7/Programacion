package paqueteRepaso;

public class CuentaCorrientePersonal extends CuentaCorriente {

	public CuentaCorrientePersonal(Persona T, double Saldo, double CM) {
		super(T, Saldo);
		
		this.CMantenimiento=CM;
		
	}

	
	
	
	
	public double getCMantenimiento() {
		return CMantenimiento;
	}

	public void setCMantenimiento(double cMantenimiento) {
		CMantenimiento = cMantenimiento;
	}

	private double CMantenimiento;
	
}
