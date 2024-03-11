import java.util.*;


public class CuentasUsuarios {

	public static void main(String[] args) {
		
		Cliente cl1=new Cliente("Manolo", "00001", 200000);
		
		Cliente cl2=new Cliente("Antonio", "00002", 450000);
		
		Cliente cl3=new Cliente("Jose", "00003", 90000);
		
		Cliente cl4=new Cliente("Julio", "00004", 23000);
		
		HashSet <Cliente> clientesBanco= new HashSet<Cliente>();

		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		
		
	}

}
