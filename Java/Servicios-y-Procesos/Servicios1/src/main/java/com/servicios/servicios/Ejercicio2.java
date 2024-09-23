/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.servicios.servicios;

/**
 *
 * @author hector.garaboacasas
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String note="notepad.exe";
        ProcessBuilder pbNote;
        
        try{
            pbNote=new ProcessBuilder(note);
            pbNote.start();
            
        }catch(Exception e){
            e.printStackTrace();}
    }
}
