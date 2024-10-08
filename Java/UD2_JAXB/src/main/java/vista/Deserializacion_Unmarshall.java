/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Insertar;
import controlador.Modificar;
import controlador.gestionjaxb;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Empleado;
import modelo.Empleados;

/**
 *
 * @author hector.garaboacasas
 */
public class Deserializacion_Unmarshall {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion=0;
        
        try {
            File ficherojaxb=new File("./src/main/resources/empleadosjaxb.xml");
            JAXBContext contexto= JAXBContext.newInstance(Empleados.class);
            Unmarshaller u= contexto.createUnmarshaller();
            Empleados listaEmpleados=(Empleados) u.unmarshal(ficherojaxb);
            
           
            do{
                System.out.println("1:Insertarº\n2:borrar\n2:modificar\n2:visualizar\n2:salir");
                opcion=Integer.parseInt(sc.nextLine());
                
                switch(opcion){
                    case 1->{
                        //generamos el id del nuevo empleado
                        BigInteger valorgenerado=gestionjaxb.generarIDEmpleado();
                        Empleado eabuscar=gestionjaxb.buscar(valorgenerado, listaEmpleados);
                        if(eabuscar!=null){
                            System.out.println("ya existe");
                            
                        }else{
                            gestionjaxb.Insertar(new Empleado(valorgenerado,"nuevo",BigInteger.valueOf(100), BigDecimal.valueOf(456.56)), listaEmpleados);
                        }
                    }
                    case 2->{
                        BigInteger valorabuscar=BigInteger.valueOf(200);
                        Empleado eabuscar= gestionjaxb.buscar(valorabuscar, listaEmpleados);
                        if (eabuscar!=null){
                            gestionjaxb.Borrar(eabuscar, listaEmpleados);
                        }else{
                            System.out.println("no existe");
                        }
                    }
                    case 3->{
                         BigInteger valorabuscar=BigInteger.valueOf(200);
                        Empleado eabuscar= gestionjaxb.buscar(valorabuscar, listaEmpleados);
                        if (eabuscar!=null){
                            gestionjaxb.modificar(eabuscar);
                        }else{
                            System.out.println("no existe");
                        }
                    }
                    case 4->{
                        System.out.println(gestionjaxb.visualizar(listaEmpleados));
                        
                    }
                }while(opcion!=5);
                if(ficherojaxb.exists())
                    ficherojaxb.delete();
                
                contexto=JAXBContext.newInstance(Empleados.class);
                 Marshaller marshallerObj= contexto.createMarshaller();
                marshallerObj.marshal(listaEmpleados, new File("./src/main/resources/nuevosempleadosjaxb.xml")); 
                
            };
            
            
            
            
        } catch (JAXBException ex) {
            Logger.getLogger(Deserializacion_Unmarshall.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
    
}


