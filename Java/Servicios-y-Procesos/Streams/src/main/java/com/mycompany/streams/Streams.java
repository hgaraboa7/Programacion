package com.mycompany.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Streams {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            
            while ((linea = reader.readLine()) != null) {
                System.out.println("Hijo recibió: " + linea.toUpperCase()); 
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
