/*Héctor_Garaboa_Casas*/
package gestatletismo;

import java.time.LocalDateTime;
import java.util.Scanner;

import atletismo.Atleta;
public class Carrera {

    private String nombre;
    private LocalDateTime fecha;
    private int numeroMaximo;
    private int edadMin;
    //private Atleta participante;


    public Carrera(String nombre, LocalDateTime fecha, int nMaximo, int edadMin /*, Atleta participante*/ ){
        this.nombre=nombre;
        this.fecha=fecha;
        this.numeroMaximo=nMaximo;
        this.edadMin=edadMin;
        //this.participante=participante;


    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getNumeroMaximo() {
        return numeroMaximo;
    }

    public void setNumeroMaximo(int numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

   /* public Atleta getParticipante() {
        return participante;
    }

    public void setParticipante(Atleta participante) {
        this.participante = participante;
    }*/

    @Override
    public String toString() {
        return " La Carrera{" +
                "con nombre= " + nombre  +
                ", con fecha=" + fecha +
                ", numero maximo de participantes=" + numeroMaximo +
                ", edad minima=" + edadMin +
                "} ha sido creada con exito";
    }
}