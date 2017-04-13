package com.database.connection;

import java.sql.*;

import org.apache.log4j.Logger;

import com.database.resources.DBType;
import com.database.resources.DBUtilities;

public class DBConnection {
	
	Logger log = Logger.getLogger(DBConnection.class);

	private Connection connection;
	private Statement statement;
	private ResultSet resSet;
	
	public DBConnection() throws SQLException{
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DBUtilities.getConnection(DBType.MYSQLDB);
			statement = connection.createStatement();
			resSet = statement.executeQuery("Select * from actor");
			
			while(resSet.next()){
				log.info(resSet.getString("actor_id"));
				log.info(resSet.getString("first_name"));
				log.info(resSet.getString("last_name"));
				log.info(resSet.getString("last_update"));
			}
			
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