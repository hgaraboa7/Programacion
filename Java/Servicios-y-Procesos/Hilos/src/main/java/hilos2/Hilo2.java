/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hector.garaboacasas
 */
public class Hilo2 {

    public static void main(String[] args) {

        Thread hilo1 = new Thread(new MiRunnable100());

        hilo1.start();

        hilo1.setName("HILO1");

        try {
            //join es analogo a waitfor
            hilo1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE, null, ex);
        }

        Thread hilo2 = new Thread(new MiRunnable100());

        hilo2.start();

        hilo2.setName("HILO2");

        Thread hilo3 = new Thread(new MiRunnable100());

        hilo3.start();
        hilo3.setName("HILO3");

    }

}

class MiRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("hilo empezando");
        try {
            Thread.sleep(2500);
            Thread aux= Thread.currentThread();
            String nombre= aux.getName();
            System.out.println( nombre+ " acabando");
                    
        } catch (InterruptedException ex) {
            Logger.getLogger(MiRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
