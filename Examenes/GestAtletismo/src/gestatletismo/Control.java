/*Héctor_Garaboa_Casas*/
package gestatletismo;

import atletismo.Atleta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import atletismo.*;

public class Control {

    public static Datos datos=new Datos();

    public static  ArrayList<Atleta> ListaAtletas=new ArrayList<>();


    public static void MostrarMenu(){

        System.out.println("---Menú---");
        System.out.println("1. Crear una carrera." );
        System.out.println("2. Insertar participantes.");
        System.out.println("3. Simular la carrera.");
        System.out.println("4. Mostrar los resultados.");
        System.out.println("5. Salir");

    }


    public static void CrearCarrera(){
         String nombre;
         LocalDateTime fecha;
         int numeroMaximo;
         int edadMin;

         Scanner sc1=new Scanner(System.in);
         System.out.println("Introduzca el nombre de la carrera");
         nombre=sc1.nextLine();

         System.out.println("Introduzca la fecha de la carrera (año-mes-dia-hora");

         fecha=LocalDateTime.parse(sc1.nextLine());

         System.out.println("Introduzca el numero maximo de corredores");
         numeroMaximo=sc1.nextInt();

         System.out.println("Introduzca la edad minima");
         edadMin=sc1.nextInt();

        Carrera carrera1=new Carrera(nombre, fecha, numeroMaximo, edadMin);

        System.out.println(carrera1);

    }

    public static void InsertarParticipantes(){



        Scanner sc2=new Scanner(System.in);
        int opcion2;

        System.out.println("--Menu--");
        System.out.println("1. Introducir automaticamente participantes");
        System.out.println("2. introducir manualmente participantes");



                    System.out.print("introduzca el numero de participantes");
                    int cantidad = sc2.nextInt();


                    ArrayList<Atleta> ListaAtletas1=new ArrayList<>(datos.getRandomAtletas(cantidad));

                   System.out.println("Se añadiran " + cantidad +" participantes");


                    System.out.println("a continuacion tendra que crear un corredor");
                    sc2.nextLine();

                    String dni;
                    String nombre;
                    String apellido1;
                    String apellido2;
                    String fNacimiento;
                    LocalTime marca;

                    System.out.println("introduzca el dni del participante");
                    dni=sc2.nextLine();

                    System.out.println("introduzca el nombre");
                    nombre=sc2.nextLine();

                    System.out.println("introduzca el primer apellido");
                    apellido1=sc2.nextLine();

                    System.out.println("introduzca el segundo apellido");
                    apellido2=sc2.nextLine();

                    System.out.println("introduzca la fecha de nacimiento");

                    fNacimiento=sc2.nextLine();

                    System.out.println("introduzca el tiempo de su marca personal");

                    marca=LocalTime.parse(sc2.nextLine());

                    Atleta atleta1=new Atleta(dni, nombre, apellido1,apellido2, fNacimiento);

                    atleta1.setMarcaPersonal(marca);

                    ListaAtletas1.add(atleta1);

                    ListaAtletas=ListaAtletas1;






    }

    public static void SimularCarrera(){

        //Iterator<Atleta> iterador;

        /*for(iterador : ListaAtletas){


        }*/

        for(int i=0; i<ListaAtletas.size();i++){

            ListaAtletas.get(i);
            Herramientas.getTiempoCarrera();


        }





    }

    public static void MostrarResultados(){


        for(int i=0; i<ListaAtletas.size();i++) {

            System.out.println(ListaAtletas.get(i));




        }

    }








}