/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
import modelo.Empleado;
import modelo.Empleados;

/**
 *
 * @author hector.garaboacasas
 */
public class gestionjaxb {
    
    public static String visualizar(Empleados listaEmpleados){
        String cadena="";
        for(Empleado e:listaEmpleados.getEmpleado()){
            cadena+=e.toString()+"\n";
            
        }
        return cadena;
    }
    
    public static Empleado buscar(BigInteger valorgenerado, Empleados listaEmpleados){
     for(Empleado e:listaEmpleados.getEmpleado()){
         if(e.getId().intValue()==valorgenerado.intValue())
             return e;
     }   
        return null;
    }
    
    public static BigInteger generarIDEmpleado(){
        return BigInteger.probablePrime(8, new Random());
    }
    
    public static void Insertar(Empleado e, Empleados listaEmpleados){
        listaEmpleados.getEmpleado().add(e);
    }
    
    public static void Borrar(Empleado eabuscar, Empleados listaEmpleados){
       listaEmpleados.getEmpleado().remove(eabuscar);
    }
    
    public static void modificar(Empleado eabuscar){
        
        //modificar el salario
        eabuscar.setSalario(eabuscar.getSalario().add(BigDecimal.valueOf(100)));
    }
    
}
