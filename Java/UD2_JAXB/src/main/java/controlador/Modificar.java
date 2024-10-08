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
public class Modificar {
    
    
    public static void modificar (Empleados listaEmpleados, JAXBContext contexto){
        
        int id = 999;
        
        try {
            for(Empleado e:listaEmpleados.getEmpleado()){
                
                //de momento solo lo he conseguido asi
                
                
                int comp=Integer.valueOf((e.getId()).toString());
                
            if(comp==id){
                
                e.setDep(BigInteger.valueOf(999));
                e.setNombre("Moncho");
                e.setSalario(BigDecimal.valueOf(666.66));
                
                
               
                
            
            Marshaller marshallerObj= contexto.createMarshaller();
            marshallerObj.marshal(listaEmpleados, new File("./src/main/resources/nuevosempleadosjaxb.xml")); 
            break;
            }
            
        }
            
            
        } catch (JAXBException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
}
    
}
