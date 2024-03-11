import javax.swing.*;

public class factorialnumero {

	public static void main(String[] args) {
		
		Long resultado=1L;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		for(int i=numero;i>0;i--) {
			resultado=resultado*i;
		}
		
		System.out.println("el factorial de "+ numero + " es "+ resultado);

	}

}
