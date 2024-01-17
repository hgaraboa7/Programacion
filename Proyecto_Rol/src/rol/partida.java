package rol;

import java.util.*;

public class partida {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//variables creacion personaje
		String confirmacion;
		String nombre;
		//variables creacion mazmorra
		int tamaño;
		tipoMazmorra tipo;
		dificultad dif;
		
		
		do {
		
		System.out.println("Bienvenido a tu aventura ");
		
		System.out.println("Diga su nombre ");
		
		nombre=sc.next();
		
		for (ClasePersonaje clase : ClasePersonaje.values()) {  //mostrar por pantalla las clases disponibles
            System.out.println(clase.ordinal() + 1 + ". " + clase.name());
        }
		
		int opcionClase;
	        do {
	            System.out.print("Ingrese el número de la clase: ");
	            opcionClase = sc.nextInt();
	        } while (opcionClase < 1 || opcionClase > ClasePersonaje.values().length);

	        // Crear el personaje con el nombre y la clase elegida
	    ClasePersonaje claseElegida = ClasePersonaje.values()[opcionClase - 1];
	    Personaje PJ1 = new Personaje(nombre, claseElegida);
		
	    System.out.println(PJ1);

	    System.out.println("Es correcto?");
	    
	    confirmacion=sc.next();
	    
	    
		}while (!confirmacion.equalsIgnoreCase("SI"));
		
		System.out.println("Personaje creado");
		
		System.out.println("Iniciando aventura...");
		
		
		
		 
	        tipo = tipoMazmorra.CEMENTERIO;  // Corrección aquí
	        dif = dificultad.FACIL;   // Asigna la dificultad adecuada

	        Mazmorra M1 = new Mazmorra(tipo, dif);
	        System.out.println(M1);

	        sc.close();
	}

}