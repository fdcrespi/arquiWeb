package edu.isistan.db;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import interfacesDAO.PersonaDAO;
import mySqlDAO.MySQLPersonaDAO;

public class MySQLDAOFactory {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URI = "jdbc:mysql://localhost:3306/exampleDB";
	
	public static Connection createConnection() {
		try {
			Class.forName(DRIVER).getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		try {
			return DriverManager.getConnection(URI, "root", "mysql");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public PersonaDAO getPersonaDAO() {
		return new MySQLPersonaDAO();
	}
	
}
