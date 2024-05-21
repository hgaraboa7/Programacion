package conectaBBDD;

import java.sql.*;

public class Conecta_jardineria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//1. crear conexion
			
			String mysqlUrl="jdbc:mysql://127.0.0.1:3306/jardineria";
			
			String mysqlUser="root";
			
			String mysqlPass="abcd1234.";
			
			
			Connection miConexion=DriverManager.getConnection
					(mysqlUrl, mysqlUser, mysqlPass);
			
			System.out.println("conexion realizada con exito");
			
			
			
			//2. crear objeto statement
			
			Statement miStatement=miConexion.createStatement();
			
			// 3. Ejecutar query
			
			
			ResultSet miResultSet=miStatement.executeQuery
					("SELECT * FROM cliente;");
			
			
			// 4. Recorrer resulset
			
			while(miResultSet.next()) {
				
				System.out.println(miResultSet.getString
						("codigo_cliente")+" " + miResultSet.getString("nombre_cliente")
						+" "+ miResultSet.getString("telefono"));
				
				
				
			}
			
			
			
			
			
			
			
		}catch(Exception e) {
			
			System.out.println("Error en conexion");
			
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
