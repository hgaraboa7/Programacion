/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos2;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hector.garaboacasas
 */
public class Hilo100 {

    public static void main(String[] args) {

        List<Thread> miarray = new ArrayList();

        for (int i = 0; i < 10000; i++) {

            Thread hilo1 = new Thread(new MiRunnable100());

            hilo1.setName("HILO " + i);

            miarray.add(hilo1);

        }

        for (int i = 0; i < 10000; i++) {

            miarray.get(i).start();

        }

        for (int i = 0; i < 10000; i++) {

            try {
                miarray.get(i).join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo100.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}

class MiRunnable100 implements Runnable {

    @Override
    public void run() {
        Thread aux = Thread.currentThread();
        String nombre = aux.getName();
        System.out.println(nombre + " hilo empezando");
        try {
            Thread.sleep(7500);

            System.out.println(nombre + " acabando");

        } catch (InterruptedException ex) {
            Logger.getLogger(MiRunnable100.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
