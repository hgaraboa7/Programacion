package paqueteRepaso;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AplicacionCuentaBancaria {
	
	private static final int MAX_CUENTAS = 100;
    private static CuentaBancaria[] cuentas = new CuentaBancaria[MAX_CUENTAS];
    private static int numCuentas = 0;

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            mostrarMenu();
	            opcion = scanner.nextInt();
	            scanner.nextLine(); // Consumir el salto de línea

	            switch (opcion) {
	                case 1:
	                    abrirNuevaCuenta(scanner);
	                    break;
	                case 2:
	                    verListadoCuentas();
	                    break;
	                case 3:
	                    realizarIngreso(scanner);
	                    break;
	                case 4:
	                    retirarEfectivo(scanner);
	                    break;
	                case 5:
	                    System.out.println("Saliendo de la aplicación...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Inténtalo de nuevo.");
	            }
	        } while (opcion != 5);

	        scanner.close();
	    }

	    private static void mostrarMenu() {
	        System.out.println("\n=== Menú ===");
	        System.out.println("1. Abrir nueva cuenta");
	        System.out.println("2. Ver listado de cuentas");
	        System.out.println("3. Realizar un ingreso");
	        System.out.println("4. Retirar efectivo");
	        System.out.println("5. Salir");
	        System.out.print("Elige una opción: ");
	    } 
	    private static void abrirNuevaCuenta(Scanner scanner) {
	        System.out.println("Introduce los datos del titular:");
	        System.out.print("Nombre: ");
	        String nombre = scanner.nextLine();
	        System.out.print("Apellidos: ");
	        String apellidos = scanner.nextLine();
	        System.out.print("Introduce la fecha de nacimiento (formato yyyy-MM-dd): ");
	        String fechaNacimientoStr = scanner.nextLine();

	        // Utilizamos un formateador para convertir la cadena en un objeto LocalDate
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);      
	        
	        Persona titular = new Persona(nombre, apellidos, fechaNacimiento);

	        System.out.println("Tipo de cuenta: ");
	        System.out.println("1. Cuenta de ahorro");
	        System.out.println("2. Cuenta corriente personal");
	        System.out.println("3. Cuenta corriente de empresa");
	        System.out.print("Elige una opción: ");
	        int opcionTipoCuenta = scanner.nextInt();
	        scanner.nextLine(); // Consumir el salto de línea

	        System.out.print("Saldo inicial: ");
	        double saldoInicial = scanner.nextDouble();
	        scanner.nextLine(); // Consumir el salto de línea

	        switch (opcionTipoCuenta) {
	            case 1:
	                System.out.print("Tipo de interés de remuneración: ");
	                double tipoInteres = scanner.nextDouble();
	                scanner.nextLine(); // Consumir el salto de línea
	                cuentas[numCuentas++] = new CuentaAhorro(titular, saldoInicial, tipoInteres);
	                break;
	            case 2:
	                System.out.print("Comisión de mantenimiento: ");
	                double comisionMantenimiento = scanner.nextDouble();
	                scanner.nextLine(); // Consumir el salto de línea
	                cuentas[numCuentas++] = new CuentaCorrientePersonal(titular, saldoInicial, comisionMantenimiento);
	                break;
	            case 3:
	                System.out.print("Máximo descubierto permitido: ");
	                double maxDescubierto = scanner.nextDouble();
	                scanner.nextLine(); // Consumir el salto de línea
	                System.out.print("Tipo de interés por descubierto: ");
	                double tipoInteresDescubierto = scanner.nextDouble();
	                scanner.nextLine(); // Consumir el salto de línea
	                System.out.print("Comisión fija por descubierto: ");
	                double comisionDescubierto = scanner.nextDouble();
	                scanner.nextLine(); // Consumir el salto de línea
	                cuentas[numCuentas++] = new CuentaCorrienteEmpresa(titular, saldoInicial, maxDescubierto, tipoInteresDescubierto, comisionDescubierto);
	                break;
	            default:
	                System.out.println("Opción no válida.");
	        }
	    }

	    private static void verListadoCuentas() {
	        System.out.println("Listado de cuentas:");
	        for (int i = 0; i < numCuentas; i++) {
	            System.out.println("Cuenta " + (i + 1) + ":");
	            System.out.println("Titular: " + cuentas[i].getTitular().getNombre() + " " + cuentas[i].getTitular().getApellidos());
	            System.out.println("Fecha de nacimiento: " + cuentas[i].getTitular().getFechaNacimiento());
	            System.out.println(cuentas[i]); // Implementa el método toString en cada clase de cuenta para mostrar la información adecuadamente
	        }
	    }


	    private static void realizarIngreso(Scanner scanner) {
	        System.out.println("Introduce el número de cuenta en el que deseas realizar el ingreso:");
	        String numCuenta = scanner.nextLine();

	        System.out.println("Introduce la cantidad a ingresar:");
	        double cantidad = scanner.nextDouble();
	        scanner.nextLine(); // Consumir el salto de línea

	        for (int i = 0; i < numCuentas; i++) {
	            if (cuentas[i].getCCC().equals(numCuenta)) {
	                cuentas[i].ingresar(cantidad);
	                System.out.println("Ingreso realizado con éxito.");
	                return;
	            }
	        }
	        System.out.println("No se encontró la cuenta con el número especificado.");
	    }


	    private static void retirarEfectivo(Scanner scanner) {
	        System.out.println("Introduce el número de cuenta desde el que deseas retirar efectivo:");
	        String numCuenta = scanner.nextLine();

	        System.out.println("Introduce la cantidad a retirar:");
	        double cantidad = scanner.nextDouble();
	        scanner.nextLine(); // Consumir el salto de línea

	        for (int i = 0; i < numCuentas; i++) {
	            if (cuentas[i].getCCC().equals(numCuenta)) {
	            	if (cuentas[i].retirar(cantidad)) {
	            	    System.out.println("Retiro realizado con éxito.");
	            	} else {
	            	    System.out.println("No hay suficientes fondos para realizar el retiro.");
	            	}
	            }
	        }
	        System.out.println("No se encontró la cuenta con el número especificado.");
	    }

	 
		 
		 
	 }
	
	

