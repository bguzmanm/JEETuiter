package cl.praxis.models.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	
	private static Connection connect = null;
	
	private Db() {
		try {
			Class.forName("org.postgresql.Driver");
			connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tuiter", "root", "kupita");
			
			System.out.println(connect.isValid(50000) ? "Conección a BD - OK" : "Conección a la BD - NO ok");
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error al conectar con la BD: " + e.getMessage());
		}
	}
	
	public static Connection getConnect() {
		if (connect == null) {
			new Db();
		}
		
		return connect;
	}
	
	

}
