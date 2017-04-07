package com.database.connection;

import java.sql.*;

import com.database.resources.DBType;
import com.database.resources.DBUtilities;

public class DBConnection {

	private Connection connection;
	private Statement statement;
	private ResultSet resSet;
	
	public DBConnection() throws SQLException{
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DBUtilities.getConnection(DBType.MYSQLDB);
			statement = connection.createStatement();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			if(resSet != null){
				resSet.close();
			}
			
			if(statement != null){
				statement.close();
			}
			
			if(connection != null){
				connection.close();
			}
			
		}
		
		
	}
	
}