package Examen_Practica_Clase;

import java.util.*;


public class Movil {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca su numero de telefono ");
		
		int a=sc.nextInt();
		
		System.out.println("Introduzca su saldo inicial ");
		
		float d=sc.nextFloat();
		
		MovilPrepago Movil1=new MovilPrepago(a, 0.2f, 0.1f, 0.5f, d);
				
		 int opcion;

	        do {
	            // Mostrar el menú
	            System.out.println("Menú:");
	            System.out.println("1. Efectuar llamada");
	            System.out.println("2. Navegar online");
	            System.out.println("3. Consultar saldo disponible");
	            System.out.println("4. Recargar saldo disponible");
	            System.out.println("5. Salir");

	            // Leer la opción 
	            System.out.print("Ingrese su opcion: ");
	            opcion = sc.nextInt();

	            // Utilizar switch
	            switch (opcion) {
	                case 1:
	                    System.out.println("Selecciono Efectuar llamada ");
	                    
	                    System.out.println("Indique la duracion de la llamada en segundos ");
	                    
	                    	int segundos=sc.nextInt();
	                    
	                    	Movil1.efectuarLlamada(segundos);
	                    
	                    break;
	                case 2:
	                    System.out.println("Selecciono Navegar online");
	                    
	                    System.out.println("Indique el consumo de MB (en su telefono movil puede verlo) "); //obviamente esto es irreal, debemos imaginar que podemos consultarlo en un telefono
	                    
                    		int MB=sc.nextInt();
                    
                    		Movil1.navegar(MB);
	                    
	                    
	                    break;
	                case 3:
	                    System.out.println("Selecciono Consultar saldo disponible");
	                    
	                    System.out.println(Movil1.consultarSaldo());
	                    
	                    break;
	                case 4:
	                	System.out.println("Selecciono Recargar saldo disponible");
	                	
	                	
	                	do {
	                        // Llamar al método recargar y pasar el scanner
	                    } while (!Movil1.recargar(sc));
	                	
	                	
	                	break;
	                case 5:
	                    System.out.println("Saliendo del menú... " + Movil1.numero() + " Gracias por usarnos.");
	                    
	                    
	                    
	                    break;
	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	                    
	                    
	                    break;
	            }

	        } while (opcion != 5);
		
		
		
		sc.close();
	}

}








class MovilPrepago {
	
	public MovilPrepago(int nM, float cEL, float cML, float cMB, float s ) { //Constructor
		
		numeroMovil=nM;
		
		costeEstablecLlamada = cEL;
		
		costeMinutoLlamada=cML;
		
		costeConsumoMB=cMB;
		
		saldo=s;
		
		
	}
	
	public float consultarSaldo() { //getter
		
		return saldo;
		
	}
	
	public void efectuarLlamada (int segundos) { //setter
	      saldo  -= Math.round((costeEstablecLlamada +
	                            costeMinutoLlamada /60f * segundos) * 100f)/100f; 
	      if (saldo < 0) saldo = 0;
	}
	
	public void navegar (int MB) { //setter
		saldo -= Math.round(costeConsumoMB* MB * 100f) / 100f;
	      if (saldo < 0) saldo = 0;
	}
	
	public boolean recargar(Scanner sc) { //setter
		System.out.println("Indique cuanto quiere recargar, tiene que ser multiplo de 5€");
    	
    	int importe=sc.nextInt();
			
		if (importe % 5 == 0) {
	         saldo += importe;
	         System.out.println("Recarga exitosa.");
	         return true;
	      } else
		System.out.println("La cantidad ingresada no es válida. Debe ser un múltiplo de 5€.");
	       return false;
	}
	
	public int numero() { //getter
		
		return numeroMovil;
	}
	
	
	
	
	
	private int numeroMovil;
	
	private float costeEstablecLlamada;
	
	private float costeMinutoLlamada;
	
	private float costeConsumoMB;
	
	private float saldo;
}