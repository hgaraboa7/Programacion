
package proyectogest;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;
public class ProyectoGest {


    public static void main(String[] args) {
        Control control = new Control();
        ArrayList<Vuelo> listaVuelos = control.combinarVuelos();
        // Asigna el resultado de combinarVuelos() a listaVuelos

        Instant startTime=Instant.now(); //guardar el tiempo de inicio

        control.iniciarSesion();

        Scanner scanner = new Scanner(System.in);
        int opcion;


        do {
            Control.mostrarMenu();

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    Control.MostrarVuelos(listaVuelos);
                    break;
                case 2:
                    control.darSalidaAVuelo(scanner);

                    break;
                case 3:
                   control.actualizarVuelos();

                    break;
                case 4:
                    control.modificarHorarios(scanner);

                    break;
                case 5:

                    control.salir(startTime);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }



    }


