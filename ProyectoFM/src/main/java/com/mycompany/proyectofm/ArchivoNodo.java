/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofm;

/**
 *
 * @author hector.garaboacasas
 */
public class ArchivoNodo {
    

    private String nombre;
    private String rutaAbsoluta;
    private boolean esDirectorio;
    
    public ArchivoNodo(String nombre, String rutaAbsoluta, boolean esDirectorio) {
        this.nombre = nombre;
        this.rutaAbsoluta = rutaAbsoluta;
        this.esDirectorio = esDirectorio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRutaAbsoluta() {
        return rutaAbsoluta;
    }

    public boolean isDirectorio() {
        return esDirectorio;
    }

    @Override
    public String toString() {
        return nombre; // Para que se muestre solo el nombre en el JTree
    }
}
