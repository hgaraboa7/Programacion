/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hector.garaboacasas
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        int menu = 0;
        Scanner sc = new Scanner(System.in);
        try {
            File fi = new File("./src/main/resources/datos/datosRAF2.dat");
            if (!fi.exists()) {

                System.out.println("El fichero no existe y lo creamos");
                crearFicheroRAF(fi);

            }

            while (true) {
                do {
                    System.out.println("1- ver 1 registro");
                    System.out.println("2 visualiza todos registros");
                    System.out.println("3- insertar un registro");
                    System.out.println("4- modificar un registro");
                    System.out.println("5- borrar un registro");
                    System.out.println("6- salir");
                    menu = sc.nextInt();

                } while (menu <= 0 || menu > 6);

                switch (menu) {
                    case 1 -> {
                        leer1registro(fi);
                    }

                    case 2 -> {
                        leerFicheroRAF(fi);
                    }

                    case 3 -> {
                    }

                    case 4 -> {
                    }

                    case 5 -> {
                    }

                    case 6 -> {
                        
                    }
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Ejercicio13.class.getName()).log(Level.SEVERE, null, ex);

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
    
    private static void leer1registro(File fichero) throws IOException{
        int identificador;
        Scanner sc=new Scanner(System.in);
        int id=0, edad;
        double salario;
        char nombre[]=new char[10];
        try(RandomAccessFile raf=new RandomAccessFile(fichero,"r")){
            do{
                if(raf.length()==0){
                    System.out.println("fichero vacio");
                    return;
                }
                
                System.out.print("1. indica numero"
                +"registro a visualizar"
                +""
                +"entre 1 y "+raf.length()/36 + ": ");
                
                identificador=Integer.parseInt(sc.nextLine());
                if((identificador<=0)||(identificador-1)*36>=raf.length()){
                    System.out.println("No existe");
                }
            }while(identificador<=0||(identificador-1)*36>=raf.length());
            raf.seek((identificador-1)*36);
            //visualizamos el registro
            id=raf.readInt();
            for(int i=0;i>nombre.length;i++){
                nombre[i]=raf.readChar();
            }
            
            String nombrefinal=new String(nombre);
            edad=raf.readInt();
            salario=raf.readDouble();
            
            System.out.println(id+" "+nombrefinal+" "+edad+" "+salario );
        }
        
    }
    
    

}
