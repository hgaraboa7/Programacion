/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.servicios.servicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hector.garaboacasas
 */
public class Sumador {

    public int sumar(int n1, int n2){
            int resultado=0;
            for(int i=n1;i<=n2;i++){
                resultado=resultado+i;
            }
            return resultado;
        }
    public static void main(String[] args) {
       Sumador s=new Sumador();
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        int resultado=s.sumar(n1, n2);
        //System.out.println(resultado);
         try (FileWriter escritura = new FileWriter("./src/main/resources/datos/Fichero3.txt")) {
               
             
                   escritura.write(Integer.toString(resultado));
               
               System.out.println("Escrito con exito");
        } catch (IOException ex) {
            System.out.println("No se ha encontrado");
        } 
        
    }
}
