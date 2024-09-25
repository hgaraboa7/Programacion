/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Persona;

/**
 *
 * @author hector.garaboacasas
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        File datos = new File("./src/main/resources/datos/datos.txt");
        File datos2 = new File("./src/main/resources/datos/datos.dat");
        Persona p1;
        Double totalSalarios = 0.0;

        if (!datos.exists()) {
            System.out.println("Fichero no existe");
        }
        try (FileReader fr = new FileReader(datos); BufferedReader br = new BufferedReader(fr); FileOutputStream fos = new FileOutputStream(datos2); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            String linea;
            String[] palabras;

            while ((linea = br.readLine()) != null) {

                palabras = linea.split(":");

                try {
                    int id = Integer.parseInt(palabras[0]);
                    String nombre = palabras[1];
                    double salario = Double.parseDouble(palabras[2]);

                    p1 = new Persona(id, nombre, salario);
                    oos.writeObject(p1);

                } catch (NumberFormatException e) {
                    System.out.println("Error de formato numérico en la línea: " + linea);
                    /* e.printStackTrace();  */
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio10.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (FileInputStream fis = new FileInputStream(datos2); ObjectInputStream ois = new ObjectInputStream(fis)) {

            Persona p2;

            while (true) {
                try {
                    p2 = (Persona) ois.readObject();
                    totalSalarios += p2.getSalario();
                } catch (EOFException eof) {
                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Ejercicio10.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            System.out.println("Total salarios: " + totalSalarios);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio10.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
