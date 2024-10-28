/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jdbc.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hector.garaboacasas
 */
public class Hilos {//esta forma es mediante una clase hijo que hereda deThread

    public static void main(String[] args) {
       
        MiThread hilo1=new MiThread();
        
        hilo1.start();
        
        
        try {
            //join es analogo a waitfor
            hilo1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         MiThread hilo2=new MiThread();
        
        hilo2.start();
        
        
        
         MiThread hilo3=new MiThread();
        
        hilo3.start();
        
        
        
    }
}



class MiThread extends Thread{

    @Override
    public void run() {
        
        System.out.println("hilo empezando");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MiThread.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println("hilo acabando");
     }
    
}