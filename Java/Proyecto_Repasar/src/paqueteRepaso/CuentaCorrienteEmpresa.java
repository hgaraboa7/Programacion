package paqueteRepaso;

public class CuentaCorrienteEmpresa extends CuentaCorriente {

	public CuentaCorrienteEmpresa(Persona T, double Saldo, double TID, double MDP, double CD) {
		super(T, Saldo);
		
		this.TIDescubierto=TID;
		this.MxDescPermitido=MDP;
		this.comisionDescubierto=CD;
		
	}

	
	
	
	
	public double getTIDescubierto() {
		return TIDescubierto;
	}
	public void setTIDescubierto(double tIDescubierto) {
		TIDescubierto = tIDescubierto;
	}
	public double getMxDescPermitido() {
		return MxDescPermitido;
	}
	public void setMxDescPermitido(double mxDescPermitido) {
		MxDescPermitido = mxDescPermitido;
	}


	public double getComisionDescubierto() {
		return comisionDescubierto;
	}





	public void setComisionDescubierto(double comisionDescubierto) {
		this.comisionDescubierto = comisionDescubierto;
	}


	private double TIDescubierto;
	private double MxDescPermitido;
	private double comisionDescubierto;
	
}
