/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.servicios.tarea1;

import java.io.File;

/**
 *
 * @author hector.garaboacasas
 */
public class Note {

    public static void main(String[] args) {
        String note="notepad.exe";
        ProcessBuilder pbNote;
        
        try{
            pbNote=new ProcessBuilder(note);
          
            pbNote.redirectOutput(new File("./src/main/resources/datos"));
              pbNote.start();
            //el fichero creado en el notepad debe ser guardado en esta ruta  
            //"./src/main/resources/datos/";
            //y con este nombre
            //FicheroRuta.txt
            
        }catch(Exception e){
            e.printStackTrace();}
    }
}
