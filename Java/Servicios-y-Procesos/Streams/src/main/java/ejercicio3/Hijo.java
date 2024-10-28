
package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hijo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            
                
                String messageFromParent = reader.readLine(); // el hijo se queda parado, y espera al envío del padre
              
                if(!"fin".equals(messageFromParent)){
                    
                    int randomInt = (int) (Math.random() * 20);
                    
                    
                    writer.write(randomInt+" ");
                    writer.flush();
                }else{
                    writer.write(1);
                    writer.flush();
                }
                
            

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid integer.");
        }
    }
}
