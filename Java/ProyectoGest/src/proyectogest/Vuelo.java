package proyectogest;


import examen240314.VueloAbstract;

import java.time.LocalDateTime;


public class Vuelo extends VueloAbstract {


    public Vuelo(String codigo, String origen, String destino, LocalDateTime salida, LocalDateTime llegada) {
        super(codigo, origen, destino, salida, llegada);
    }




    @Override
    public String toString() {
        return "Vuelo con codigo: " + getCodigo()+
                " origen: " + getOrigen() +
                " destino: " + getDestino() +
                " salida: " + getSalida() +
                " llegada: " + getLlegada();
    }
}
