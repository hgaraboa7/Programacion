/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/*
*
*       AÑADE TÚ CODIGO
*
*/


/**
 *
 * @author 
 */
public class Ejercicio4 {

    static List<Actor> actores = new ArrayList<Actor>();
/*
*
*       AÑADE TÚ CODIGO
*
*/
    
	
	static String url="jdbc:mysql://127.0.0.1:3306/sakila";
	
	static String user="root";
	
	static String password="abcd1234.";
	
	static Connection cn=null;
	
	static PreparedStatement PS = null;

    public static void ejecutar() {

/*
*
*       AÑADE TÚ CODIGO
*
*/
    	 
       
        
        
        
        
    	
            cargarDatos();
            
            menu();
            actualizarDatos();
/*
*
*       AÑADE TÚ CODIGO
*
*/
    }

    private static void menu() {
        byte option;
        int id = 0;

        do {
            System.out.println("**************************");
            System.out.println("*** Ejercicio 4 - MENÚ ***");
            System.out.println("**************************");

            System.out.println("\t(1) Mostrar actores.");
            System.out.println("\t(2) Modificar un actor.");
            System.out.println("\t(3) Añadir nuevo actor.");
            System.out.println("\t(4) Elminar actor.");
            System.out.println("\t(0) Salir.");
            option = Herramientas.validarOpcion(0, 4);
            switch (option) {
                case 1:
                    mostrarActores();
                    break;
                case 2:
                    modificarActor();
                    break;
                case 3:
                    addActor();
                    break;
                case 4:
                    eliminarActor();
                    break;
            }
        } while (option != 0);

    }

    private static void mostrarActores() {
        Iterator it = actores.iterator();
        Actor act;
        System.out.println("*** Listado de actores ***");

        while (it.hasNext()) {
            act = (Actor) it.next();
            if (!act.isEliminado()) {
                System.out.println(act);
            }
        }

        System.out.println("");
    }

    private static void modificarActor() {
        Actor actor;
        boolean realizado = false;
        int id = Herramientas.leerInt("Introduce el id del actor: ");
        for (Actor act : actores) {
            if (act.getId() == id) {
                actor = act;
                System.out.println("Datos originales del actor: ");
                System.out.println(act);
                System.out.println("");
                actor.setNombre(Herramientas.leerString("Introduce el nombre: "));
                actor.setApellidos(Herramientas.leerString("Introduce los apellidos: "));
                actor.setFechaNacimiento(Herramientas.leerFecha("Introduce la fecha de nacimiento: "));
                realizado = true;
            }

        }
        if (!realizado) {
            System.out.println("El id = " + id + " no ha sido encontrado.");
        }
    }

    private static void addActor() {
        String nombre, apellidos;
        LocalDate fecha;
        nombre = Herramientas.leerString("Inroduce el nombre: ");
        apellidos = Herramientas.leerString("Inroduce los apellidos: ");
        fecha = LocalDate.parse(Herramientas.leerString("Inroduce la fecha de nacimiento: "));
        actores.add(new Actor(nombre, apellidos, fecha));
    }

    private static void eliminarActor() {
        boolean realizado = false;
        int id = Herramientas.leerInt("Introduce el id del actor: ");
        for (Actor act : actores) {
            if (act.getId() == id) {
                if(act.isNuevo()){
                    actores.remove(act);
                }else{
                    act.setEliminado(true);
                }
                realizado = true;
            }

        }
        if (!realizado) {
            System.out.println("El id = " + id + " no ha sido encontrado.");
        }
    }

    private static void cargarDatos() {
/*
*
*       AÑADE TÚ CODIGO
*
*/
    	//Se crea la conexion con el connection
        try {
			cn = DriverManager.getConnection(url, user, password);
			//Se crea un Statement de SQL mediante la conexion
            
			Statement stmt = cn.createStatement();
			//Se asigna a ResultSet el resultado del SELECT FROM actor
            
			ResultSet rs=stmt.executeQuery("SELECT actor_id, first_name, last_name, birth_date FROM actor");
			
			while(rs.next()) {
				
				 int id = rs.getInt(1);
                 String nombre = rs.getString(2);
                 String apellidos = rs.getString(3);
                 LocalDate fechaNacimiento = rs.getDate(4).toLocalDate();
                 
                 Actor actor = new Actor(id, nombre, apellidos, fechaNacimiento);
                 
                 actores.add(actor);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    private static void actualizarDatos() {

/*
*
*       AÑADE TÚ CODIGO
*
*/
    	 // Iterar sobre los actores y sincronizar con la base de datos
    	for(Actor actor: actores) {
    		
    		if(actor.isNuevo()) {
    			
    			try {
					cn=DriverManager.getConnection(url, user, password);
					
					//2.1 crear instruccion sql
					String query="INSERT INTO actor (first_name, last_name, birth_date)"
							+ "VALUES(?,?,?)";
					//2.2 crear PS con instruccionSQL		
					PS=cn.prepareStatement(query);
					
					
					
					PS.setString(1, actor.getNombre());
					PS.setString(2, actor.getApellidos());
					
					// si no no funciona al ser en la tabla date y aqui datetime
					PS.setDate(3, java.sql.Date.valueOf(actor.getFechaNacimiento()));
					
					 PS.executeUpdate();
			            System.out.println("Datos insertados correctamente");
	                  
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			
    			
    			
    		}else if (actor.isModificado()) {
    			
    			try {
					cn=DriverManager.getConnection(url, user, password);
					
					//2.1 crear instruccion sql
					String query="UPDATE actor SET first_name = ?, last_name = ?, birth_date = ?"
							+ "WHERE actor_id = ?";
					//2.2 crear PS con instruccionSQL		
					PS=cn.prepareStatement(query);
					
					
				
					PS.setString(1, actor.getNombre());
					PS.setString(2, actor.getApellidos());
					
					// si no no funciona al ser en la tabla date y aqui datetime
					PS.setDate(3, java.sql.Date.valueOf(actor.getFechaNacimiento()));
	                  
					
					PS.setInt(4, actor.getId());
					
					 PS.executeUpdate();
			            System.out.println("Datos modificados correctamente");
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			
    			
    			
    		}else if (actor.isEliminado()) {
    			
    			try {
					cn=DriverManager.getConnection(url, user, password);
					
					//2.1 crear instruccion sql
					String query="DELETE FROM actor WHERE actor_id = ?";
					//2.2 crear PS con instruccionSQL		
					PS=cn.prepareStatement(query);
					
					
					PS.setInt(1, actor.getId());
					
					 PS.executeUpdate();
			            System.out.println("Datos eliminados correctamente");
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		
    		
    		
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	}
    	
    	
    	
    }
}
