/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.servicios.servicios;

/**
 *
 * @author hector.garaboacasas
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        String ruta="C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        ProcessBuilder pb;
        try{
            pb=new ProcessBuilder(ruta);
            pb.start();
        }catch(Exception e){
            e.printStackTrace();}
    }
}
