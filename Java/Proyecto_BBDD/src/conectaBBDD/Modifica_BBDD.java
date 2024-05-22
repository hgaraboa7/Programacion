package conectaBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Modifica_BBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection miConexion = null;
		
		PreparedStatement miPS = null;
		
		int c_c=0;
		String n_c;
		String telefono;
		String ciudad;
		
		Scanner sc = null;
		
		
		try {
			 sc=new Scanner(System.in);
			
			//1. crear conexion
			
			String mysqlUrl="jdbc:mysql://127.0.0.1:3306/jardineria";
			
			String mysqlUser="root";
			
			String mysqlPass="abcd1234.";
			
			
			 miConexion=DriverManager.getConnection
					(mysqlUrl, mysqlUser, mysqlPass);
			
			System.out.println("conexion realizada con exito");
			
			
			
			//2. crear objeto statement
			
			Statement miStatement=miConexion.createStatement();
			
			
			//2.1 crear instruccion sql
			
			String instSql="INSERT INTO cliente(codigo_cliente, nombre_cliente, telefono, ciudad)"
					+ "VALUES(?,?,?,?)";
			
			//2.2 crear PS con instruccionSQL
			miPS = miConexion.prepareStatement(instSql);
			
			
			
			
			//3. Pedir por consola los valores
			
			
			//3.1 determinar el ultimo cliente
			  
	            ResultSet rs = miStatement.executeQuery("SELECT MAX(codigo_cliente) FROM cliente");
	           
	            if (rs.next()) {
	                c_c = rs.getInt(1) + 1; // El ultimo codigo de cliente + 1
	            }
			
			 	
			 	System.out.println("Dime su nombre:");
			 	n_c= sc.nextLine();
	            System.out.println("Dime el telefono");
	            telefono = sc.nextLine();
	            System.out.println("Dime la ciudad");
	            ciudad = sc.nextLine();
			
	            // 4. Establecer los valores en el PreparedStatement
	            miPS.setInt(1, c_c);
	            miPS.setString(2, n_c);
	            miPS.setString(3, telefono);
	            miPS.setString(4, ciudad);
			
			
			
	            // 5. Ejecutar la instruccion SQL
	            miPS.executeUpdate();
	            System.out.println("Datos insertados correctamente");
			 
			
			
			
			
		}catch(Exception e) {
			
			System.out.println("Error en conexion");
			
			e.printStackTrace();
			
		}finally {
			
			 try {
	                if (sc != null) {
	                    sc.close();
	                }
	                if (miPS != null) {
	                	miPS.close();
	                }
	                if (miConexion != null) {
	                    miConexion.close();
	                }
				System.out.println("----------------------------------------");
				System.out.println("Conexion cerrada");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error en cerrar la conexion");
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
