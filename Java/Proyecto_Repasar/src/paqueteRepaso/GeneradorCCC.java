package paqueteRepaso;

import java.util.Random;

public class GeneradorCCC {
	
    private static int contadorCuentas = 0; // Contador para generar números de cuenta únicos

    // Método estático para generar un número de cuenta CCC único
    public static String generarNumeroCuenta() {
        contadorCuentas++; // Incrementamos el contador para garantizar un número de cuenta único
        Random rand = new Random();
        int sufijo = rand.nextInt(900000) + 100000; // Generamos un sufijo de 6 dígitos aleatorio
        return  String.format("%010d", contadorCuentas) + String.format("%06d", sufijo);
    }
}