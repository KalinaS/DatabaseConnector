package com.database.crud;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.ConnectionFactory;
import com.database.connection.CreateConnection;
import com.database.connection.DBType;
import com.database.result.Result;
import com.database.result.SelectResult;

public abstract class Operation{
	
	
	protected Connection connection;
	
	protected DBType dbType;
	
	public Operation(DBType dbType) throws SQLException, IOException, ClassNotFoundException{
		this.dbType = dbType;
	}

	protected abstract Result executeStatement(String sql, Map<Integer, Object> parameters) throws SQLException, ClassNotFoundException, IOException ;
	
	public Result doOperation(String sql, Map<Integer, Object> parameters) throws ClassNotFoundException{
		
		Result result = null;
		
		try {
			
			openConnection(dbType);
			result = executeStatement(sql, parameters);
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeConnection(connection);
		}
		return result;
	}
	
	
	public void openConnection(DBType dbtype) throws SQLException, IOException {
		
		//FIXME check the connection creation
		CreateConnection creator = ConnectionFactory.getConnection(dbtype);
		connection =  creator.getConnection();
	}
	
	protected void closeConnection(Connection connection) {
		
			if (connection !=  null) {
				try {
					if (!connection.isClosed()) {
						connection.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}
}
