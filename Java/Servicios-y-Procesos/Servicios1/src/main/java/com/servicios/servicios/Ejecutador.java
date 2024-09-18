/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servicios.servicios;

import java.io.IOException;

/**
 *
 * @author hector.garaboacasas
 */
public class Ejecutador {
    public static void main(String[] args) {
        int a=1;
        int b=7;
        String classPath="C:\\Users\\hector.garaboacasas\\Desktop\\curso_24_25\\Servicios1\\target\\classes";
        ProcessBuilder pb;
        pb=new ProcessBuilder("java", "-cp", classPath,"com.servicios.servicios.Sumador",""+a,""+b);
        try{
            pb.start();
           
        }catch(IOException ex){
            System.out.println("error");
        }
    
    }
    
    
}
