package paqueteRepaso;

public abstract class CuentaBancaria {

	
	public CuentaBancaria(Persona T, double Saldo) {
		
		this.Titular=T;
		this.CCC = GeneradorCCC.generarNumeroCuenta();
		this.Saldo = Saldo;
		
		
	}
	
	
	
	public String getCCC() {
		return CCC;
	}
	public void setCCC(String cCC) {
		CCC = cCC;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	
	public Persona getTitular() {
		return Titular;
	}



	public void setTitular(Persona titular) {
		Titular = titular;
	}
	  public void ingresar(double cantidad) {
	        if (cantidad > 0) {
	            Saldo += cantidad;
	            System.out.println("Ingreso de " + cantidad + " realizado con éxito.");
	            System.out.println("Nuevo saldo: " + Saldo);
	        } else {
	            System.out.println("La cantidad a ingresar debe ser mayor que cero.");
	        }
	    }
	  public boolean retirar(double cantidad) {
	        if (cantidad > 0 && Saldo >= cantidad) {
	            Saldo -= cantidad;
	            System.out.println("Retiro de " + cantidad + " realizado con éxito.");
	            System.out.println("Nuevo saldo: " + Saldo);
	            return true;
	        } else {
	            System.out.println("La cantidad a retirar no es válida o excede el saldo disponible.");
	            return false;
	        }
	    }


	@Override
	public String toString() {
		return "CCC=" + CCC + ", Saldo=" + Saldo  ;
	}


	private String CCC;
	private double Saldo;
	private Persona Titular;
	
	
}
