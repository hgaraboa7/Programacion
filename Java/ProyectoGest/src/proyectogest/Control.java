package proyectogest;

import examen240314.Datos;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Control {
    public static ArrayList<Vuelo> combinarVuelos() {

        ArrayList<Vuelo> listaVuelos = new ArrayList<>();
        convertirAArrayList(listaVuelos, Datos.getVuelos());
        convertirAArrayList(listaVuelos, Datos.getVuelos2());
        return listaVuelos;
    }

    private static void convertirAArrayList(ArrayList<Vuelo> vuelos, String[][] datosVuelos) {
        for (String[] datos : datosVuelos) {
            String codigo = datos[0];
            String origen = datos[1];
            String destino = datos[2];
            LocalDateTime salida = LocalDateTime.parse(datos[3]);
            LocalDateTime llegada = LocalDateTime.parse(datos[4]);

            vuelos.add(new Vuelo(codigo, origen, destino, salida, llegada));
        }
    }
}
