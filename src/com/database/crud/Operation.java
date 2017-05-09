package com.database.crud;

import java.io.IOException;
import java.sql.*;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import com.database.connection.ConnectionFactory;
import com.database.connection.CreateConnection;
import com.database.connection.DBConnection;
import com.database.connection.DBType;

public abstract class Operation {
	
	
	protected Connection connection;
	
	protected DBType dbType;
	
	public Operation(DBType dbType) throws SQLException, IOException, ClassNotFoundException{
		dbType = dbType;
		BasicConfigurator.configure();
	}

	protected abstract void executeStatement(String sql, Map<String, Object> parameters) ;
	
	public void doOperation(String sql, Map<String, Object> parameters) throws SQLException, IOException {
		
		openConnection(dbType);
		executeStatement(sql, parameters);
		closeConnection(connection);
	}
	
	
	protected void openConnection(DBType dbtype) throws SQLException, IOException {

		//FIXME check the connection creation
		CreateConnection creator = ConnectionFactory.getConnection(dbType);
		connection =  creator.getConnection();
	}
	
	protected void closeConnection(Connection connection) {
		
			if (connection !=  null) {
				try {
					if (!connection.isClosed()) {
						connection.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
//	//method for executing queries
//	public static void doOperation(String sql, Map<String, Object> parameters) throws SQLException{
//
//		//int paramIndex = 1;
//
//		try {
//			Statement statement = null;
//
//			connection = dbc.getConnection();
//			statement = connection.createStatement();
//
//			/*for (Map.Entry<String, Object> p : parameters.entrySet()) {
//
//				updateParams.setString(paramIndex, p.getKey());
//				updateParams.setObject(paramIndex + 1, p.getValue());
//				paramIndex++;
//
//			}*/
//			rs = statement.executeQuery(sql);
//
//		} catch (SQLException e) {
//			
//			log.error(e.getMessage());
//		}
//		finally {
//			
//			if(updateParams != null){
//				updateParams.close();
//			}
//		}
//	}
}
