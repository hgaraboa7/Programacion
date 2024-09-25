/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hector.garaboacasas
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        File f1 = new File("./src/main/resources/datos/datosRAF.dat");
        if (!f1.exists()) {

            System.out.println("el fichero no existe y lo creamos");

        }
        try {
            crearFicheroRAF(new File("./src/main/resources/datos/datosRAF.dat"));

        } catch (IOException ex) {
            Logger.getLogger(Ejercicio12.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            leerFicheroRAF(new File("./src/main/resources/datos/datosRAF.dat"));
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio12.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void crearFicheroRAF(File fichero) throws IOException {
        String[] apellido = {"fernandez", "perez", "lopez", "ramos", "sevilla", "casilla", "rey"};
        int[] dep = {10, 20, 10, 10, 30, 30, 20};
        Double[] salario = {1234.43, 1200.56, 9874.50, 1000.50, 9874.50, 1000.50, 666.66};

        StringBuffer buffer = null;

        try (RandomAccessFile raf = new RandomAccessFile(fichero, "rw")) {

            for (int i = 0; i < apellido.length; i++) {
                raf.writeInt(i + 1); //numemp

                buffer = new StringBuffer(apellido[i]);
                buffer.setLength(10);
                raf.writeChars(buffer.toString());
                raf.writeInt(dep[i]);
                raf.writeDouble(salario[i]);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void leerFicheroRAF(File nombre) throws IOException {

        int numemp, dep, posicion;
        Double salario;
        char apellido[] = new char[10], aux;

        try (RandomAccessFile raf = new RandomAccessFile(nombre, "r")) {

            raf.seek(0);
            while (raf.getFilePointer() != raf.length()) {

                numemp = raf.readInt();

                for (int i = 0; i < apellido.length; i++) {
                    aux = raf.readChar();
                    apellido[i] = aux;
                }
                //convertir string a array caracteres
                String ape = new String(apellido);

                dep = raf.readInt();
                salario = raf.readDouble();

                System.out.println("numemp:" + numemp + " apellido: " + ape + " departamento " + dep
                        + " salario " + salario);

            }

        }

    }

}
