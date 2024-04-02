package paqueteRepaso;



public class CuentaAhorro extends CuentaBancaria {

	public CuentaAhorro(Persona T, double Saldo, double TIA) {
		super(T, Saldo);


		this.TIAnual=TIA;
	}

	
		
		
		
		
	

	public double getTIAnual() {
		return TIAnual;
	}

	public void setTIAnual(double tIAnual) {
		TIAnual = tIAnual;
	}

	@Override
	public String toString() {
		return "CuentaAhorro [TIAnual=" + TIAnual + ", " + super.toString() + "]";
	}

	private double TIAnual;
	
}
