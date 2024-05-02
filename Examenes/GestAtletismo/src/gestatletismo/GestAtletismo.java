/*Héctor_Garaboa_Casas*/
package gestatletismo;
import atletismo.Atleta;

import java.util.ArrayList;
import java.util.Scanner;


public class GestAtletismo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Atleta> ListaAtletas=new ArrayList<>();
        int opcion;
        do {
            Control.MostrarMenu();
            opcion=sc.nextInt();


            switch(opcion){

                case 1:
                    Control.CrearCarrera();


                    break;
                case 2:
                    Control.InsertarParticipantes();


                    break;
                case 3:
                    Control.SimularCarrera();

                    break;
                case 4:
                    Control.MostrarResultados();

                    //solo muestra los datos de los participantes
                    

                    break;
                case 5:
                    System.out.println("Muchas gracias por usarnos, buen dia");
                    System.out.println("Cerrando aplicacion");

                    break;
                default:
                    System.out.println("Opcion no valida, vuelva a introducir");

                    break;






            }





        }while(opcion!=5);




    }
}
