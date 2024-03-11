import javax.swing.*;

public class Bucles {

	public static void main(String[] args) {
		
		String clave="Hector";
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("contraseña incorrecta");
			}
			
			
	
		}
		
		System.out.println("contraseña correcta");

	}

}
