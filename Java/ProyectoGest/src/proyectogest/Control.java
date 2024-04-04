package proyectogest;

import examen240314.Datos;
import examen240314.Usuarios;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

import java.util.Iterator;
import java.util.Scanner;
import java.util.HashMap;

public class Control {
    private final ArrayList<Vuelo> listaVuelos;
    private final Usuarios usuarios;

    public Control() {
        this.listaVuelos = new ArrayList<>();
        this.usuarios = new Usuarios();
    }


    private boolean validarCredenciales(String usuario, String contrasena) {
        HashMap<String, String> credenciales = usuarios.getUsuarios();
        return credenciales.containsKey(usuario) && credenciales.get(usuario).equals(contrasena);
    }

    public void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        int intentosMaximos = 3;
        int intentos = 0;
        boolean loginExitoso = false;

        while (intentos < intentosMaximos) {
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();

            if (validarCredenciales(usuario, contrasena)) {
                System.out.println("Inicio de sesión exitoso.");
                loginExitoso = true;
                break;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Inténtelo de nuevo.");
                intentos++;
            }
        }

        if (!loginExitoso) {
            System.out.println("Has excedido el número máximo de intentos. El sistema se cerrará.");
            System.exit(0);
        }

        // Continuar con el resto del programa
        System.out.println("¡Bienvenido al sistema!");
        //scanner.close();
    }




    public ArrayList<Vuelo> combinarVuelos() {
        convertirAArrayList(Datos.getVuelos());
        convertirAArrayList(Datos.getVuelos2());
        return listaVuelos;
    }

    private void convertirAArrayList(String[][] datosVuelos) {
        for (String[] datos : datosVuelos) {
            String codigo = datos[0];
            String origen = datos[1];
            String destino = datos[2];
            LocalDateTime salida = LocalDateTime.parse(datos[3]);
            LocalDateTime llegada = LocalDateTime.parse(datos[4]);

            listaVuelos.add(new Vuelo(codigo, origen, destino, salida, llegada));
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n=== Menú ===");
        System.out.println("1. Mostrar Vuelos");
        System.out.println("2. Dar salida a un vuelo");
        System.out.println("3. Actualizar lista de vuelos");
        System.out.println("4. Modificar horarios de un vuelo");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

    public static void MostrarVuelos(ArrayList<Vuelo> listaVuelos) {


        listaVuelos.sort(new Comparator<Vuelo>() {
            @Override
            public int compare(Vuelo vuelo1, Vuelo vuelo2) {
                return vuelo1.getSalida().compareTo(vuelo2.getSalida());
            }
        });

        // Imprimir los datos de los vuelos en la listaVuelos usando un iterador
        System.out.println("Vuelos en la listaVuelos:");
        Iterator<Vuelo> iterador = listaVuelos.iterator();
        while (iterador.hasNext()) {
            Vuelo vuelo = iterador.next();
            System.out.println(vuelo);
        }
    }

    public void darSalidaAVuelo(Scanner scanner) {

        System.out.print("Ingrese el código del vuelo a dar salida: ");
        String codigoVuelo = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < listaVuelos.size(); i++) {
            Vuelo vuelo = listaVuelos.get(i);
            if (codigoVuelo.equals(vuelo.getCodigo())) {
                listaVuelos.remove(i);
                encontrado = true;
                System.out.println("Se ha dado salida al vuelo con código: " + codigoVuelo);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún vuelo con el código proporcionado.");
        }
    }

    public void actualizarVuelos() {
        LocalDateTime horaActual = LocalDateTime.now();
        Iterator<Vuelo> iterador = listaVuelos.iterator();
        while (iterador.hasNext()) {
            Vuelo vuelo = iterador.next();
            if (vuelo.getSalida().isBefore(horaActual)) {
                iterador.remove();
            }
        }
    }

    public void modificarHorarios(Scanner scanner) {
        System.out.println("Ingrese el código del vuelo:");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese la cantidad de minutos que se debe retrasar o adelantar la salida del vuelo:");
        int minutos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Iterator<Vuelo> iterator = listaVuelos.iterator();
        while (iterator.hasNext()) {
            Vuelo vuelo = iterator.next();
            if (vuelo.getCodigo().equals(codigo)) {
                LocalDateTime nuevaSalida = vuelo.getSalida().plusMinutes(minutos);
                LocalDateTime nuevaLlegada = vuelo.getLlegada().plusMinutes(minutos);
                // Verificar si la nueva salida o llegada es anterior a la hora actual
                if (nuevaSalida.isBefore(LocalDateTime.now()) || nuevaLlegada.isBefore(LocalDateTime.now())) {
                    System.out.println("La hora no puede ser anterior a la hora actual");
                    return;
                }

                vuelo.setSalida(nuevaSalida);
                vuelo.setLlegada(nuevaLlegada);
                System.out.println("Se ha modificado el horario del vuelo con código " + codigo);
                return;
            }
        }

        System.out.println("No se encontró ningún vuelo con el código proporcionado.");
    }

    public void salir(Instant startTime) {
        // Calcular tiempo transcurrido
        Instant endTime = Instant.now();
        Duration duration = Duration.between(startTime, endTime);

        // mostarr tiempo transcurrido
        System.out.println("Gracias por usar el programa.");
        System.out.println("Tiempo de ejecución: " + duration.getSeconds() + " segundos.");
    }

}
