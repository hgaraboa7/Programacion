package Examen_Practica_Clase;

import java.util.*;

public class Temperatura {

	 // Declarar el array como variable global
    static int[] temperaturaMeses = new int[12];

    public static void main(String[] args) {
        // Llenar el array con valores al azar
        llenarArrayConValoresAlAzar();

        // Mostrar el contenido del array
        System.out.println("Contenido del Array:");
        mostrarArray();

        // Mostrar el contenido del array en orden inverso
        System.out.println("\nContenido del Array en orden inverso:");
        mostrarArrayEnOrdenInverso();
    }

    // Función para llenar el array con valores al azar (entre 0 y 40)
    static void llenarArrayConValoresAlAzar() {
        Random random = new Random();
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = random.nextInt(41); // Números entre 0 y 40
        }
    }

    // Función para mostrar el contenido del array
    static void mostrarArray() {
        for (int temperatura : temperaturaMeses) {
            System.out.print(temperatura + " ");
        }
        System.out.println(); // Imprimir una nueva línea al final
    }

    // Función para mostrar el contenido del array en orden inverso
    static void mostrarArrayEnOrdenInverso() {
        for (int i = temperaturaMeses.length - 1; i >= 0; i--) {
            System.out.print(temperaturaMeses[i] + " ");
        }
        System.out.println(); // Imprimir una nueva línea al final
    }
}