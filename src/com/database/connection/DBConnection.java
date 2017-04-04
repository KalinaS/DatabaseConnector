package com.database.connection;

import java.sql.*; 

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/world";
		String username = "root";
		String password = "database";
		
		Connection connection = null;
		
		try{
			// 1. Get a connection to database
			connection = DriverManager.getConnection(dbUrl, username, password);
			System.out.println("Connection established to MYSQL Database.");
			
		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			connection.close();
		}
		
	}
	
}
