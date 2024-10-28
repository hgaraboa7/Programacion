
package ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hijo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            while (true) {
                
                String messageFromParent = reader.readLine(); // el hijo se queda parado, y espera al envío del padre
                int number = Integer.parseInt(messageFromParent);
                int randomInt = (int) (Math.random() * 10);
                
                if (randomInt == number) {
                    writer.write("1\n");
                    writer.flush();
                    break; 
                } else {
                    writer.write("0\n");
                    writer.flush();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid integer.");
        }
    }
}
