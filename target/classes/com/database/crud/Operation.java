package com.database.crud;

import java.sql.*;
import java.util.Map;

import org.apache.log4j.Logger;

import com.database.connection.DBConnection;

public abstract class Operation {
	
	static Logger log = Logger.getLogger(DBConnection.class);

	protected static Connection connect;
	protected static PreparedStatement updateParams;
	
	
	public static void doOperation(String sql, Map<String, Object> parameters) throws SQLException {

		int paramIndex = 1;

		try {

			updateParams = connect.prepareStatement(sql);

			for (Map.Entry<String, Object> p : parameters.entrySet()) {

				updateParams.setString(paramIndex, p.getKey());
				updateParams.setObject(paramIndex + 1, p.getValue());
				paramIndex++;

			}

		} catch (SQLException e) {
			
			log.error(e.getMessage());
		} finally {
			
			if(updateParams != null){
				updateParams.close();
			}
		}
	}
}
