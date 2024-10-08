/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Empleado;
import modelo.Empleados;

/**
 *
 * @author hector.garaboacasas
 */
public class Insertar {


    public static void insertar (Empleados listaEmpleados, JAXBContext contexto){
        
        try {
            Empleado e1=new Empleado(BigInteger.valueOf(999),"pepi", BigInteger.valueOf(100), BigDecimal.valueOf(456.56));
            listaEmpleados.getEmpleado().add(e1);
            
            Marshaller marshallerObj= contexto.createMarshaller();
            marshallerObj.marshal(listaEmpleados, new File("./src/main/resources/nuevosempleadosjaxb.xml")); 
            
        } catch (JAXBException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
}


}
