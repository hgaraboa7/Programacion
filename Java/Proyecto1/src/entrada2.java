import javax.swing.*;


public class entrada2 {

	public static void main(String[] args) {
		
		String Nombre_usuario=JOptionPane.showInputDialog
				("introduce tu nombre, por favor");
		
		String Edad=JOptionPane.showInputDialog
				("introduce tu edad, por favor");

		int edad_usuario=Integer.parseInt(Edad);
		
		edad_usuario++;
		
		
		System.out.println("Hola "+Nombre_usuario+ ", el año que viene tendras "
				+ edad_usuario + " años");
		
		
		
		
		
	}

}
