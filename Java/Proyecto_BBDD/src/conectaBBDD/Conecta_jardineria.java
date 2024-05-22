package conectaBBDD;

import java.sql.*;

public class Conecta_jardineria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection miConexion = null;
		
		try {
			//1. crear conexion
			
			String mysqlUrl="jdbc:mysql://127.0.0.1:3306/jardineria";
			
			String mysqlUser="root";
			
			String mysqlPass="abcd1234.";
			
			
			 miConexion=DriverManager.getConnection
					(mysqlUrl, mysqlUser, mysqlPass);
			
			System.out.println("conexion realizada con exito");
			
			
			
			//2. crear objeto statement
			
			Statement miStatement=miConexion.createStatement();
			
			// 3. Ejecutar query
			
			
			ResultSet miResultSet=miStatement.executeQuery
					("SELECT * FROM cliente;");
			
			
			// 4. Recorrer resulset, es una tabla virtual
			
			while(miResultSet.next()) {
				
				System.out.println(miResultSet.getInt
						("codigo_cliente")+" " + miResultSet.getString("nombre_cliente")
						+" "+ miResultSet.getString("telefono"));
				
				
				
			} 
			
			
			
			
			
			
			
		}catch(Exception e) {
			
			System.out.println("Error en conexion");
			
			e.printStackTrace();
			
		}finally {
			
			try {
				miConexion.close();
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
