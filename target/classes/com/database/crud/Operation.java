package com.database.crud;

import java.io.IOException;
import java.sql.*;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import com.database.connection.DBConnection;

public abstract class Operation {
	
	static Logger log = Logger.getLogger(Operation.class);
	

	static DBConnection dbc = new DBConnection();
	private static Connection connection;
	protected static PreparedStatement updateParams;
	protected static ResultSet rs;
	
	public Operation() throws SQLException, IOException, ClassNotFoundException{
		BasicConfigurator.configure();
	}

	//method for executing queries
	public static void doOperation(String sql, Map<String, Object> parameters) throws SQLException{

		//int paramIndex = 1;

		try {
			Statement statement = null;

			connection = dbc.getConnection();
			statement = connection.createStatement();

			/*for (Map.Entry<String, Object> p : parameters.entrySet()) {

				updateParams.setString(paramIndex, p.getKey());
				updateParams.setObject(paramIndex + 1, p.getValue());
				paramIndex++;

			}*/
			rs = statement.executeQuery(sql);

		} catch (SQLException e) {
			
			log.error(e.getMessage());
		}
		finally {
			
			if(updateParams != null){
				updateParams.close();
			}
		}
	}
}
