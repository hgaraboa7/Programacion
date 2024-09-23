/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servicios.servicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hector.garaboacasas
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String ruta="C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        ProcessBuilder pbChrome;
        Ejercicio3 ej=new Ejercicio3();
        String url=ej.leer();
        
        try{
            pbChrome=new ProcessBuilder(ruta,url);
            pbChrome.start();
            
        }catch(Exception e){
            e.printStackTrace();}
    }
    
    
     public String leer(){
        String direccion="error";
        String arch="./src/main/resources/datos/FicheroRuta.txt";
        
        try {
            BufferedReader br=new BufferedReader(new FileReader(arch));
            
            direccion=br.readLine();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        return direccion;
       
    }
}
