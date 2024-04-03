
package proyectogest;

import java.util.ArrayList;
public class ProyectoGest {


    public static void main(String[] args) {

        ArrayList<Vuelo> listaVuelos = Control.combinarVuelos();

        // Imprimir los datos de los vuelos en la listaVuelos
        System.out.println("Vuelos en la listaVuelos:");
        for (Vuelo vuelo : listaVuelos) {
            System.out.println(vuelo);


        }

    }

}
