/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.servicios.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
