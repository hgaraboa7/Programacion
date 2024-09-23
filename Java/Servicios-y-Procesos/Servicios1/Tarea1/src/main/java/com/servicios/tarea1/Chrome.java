/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servicios.tarea1;

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
public class Chrome {

    public static void main(String[] args) {
        String ruta="C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        ProcessBuilder pbChrome;
        Chrome ej=new Chrome();
        String url=ej.leer();
        
        try{
            pbChrome=new ProcessBuilder(ruta,url);
            pbChrome.start();
            
        }catch(Exception e){
            e.printStackTrace();}
    }
    
    
     public String leer(){
        String direccion="";
        //el fichero creado en el notepad debe ser guardado en esta ruta y con este nombre
        String fiRuta="./src/main/resources/datos/FicheroRuta.txt";
        
        try(BufferedReader br=new BufferedReader(new FileReader(fiRuta))) {
            
            direccion=br.readLine();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Chrome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Chrome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        return direccion;
       
    }
}
