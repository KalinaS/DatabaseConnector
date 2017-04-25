package com.database.connection;

import java.sql.*;

import org.apache.log4j.Logger;

public class DBConnection {

	Logger log = Logger.getLogger(DBConnection.class);

	protected Connection connection;
	protected Statement statement;
	protected ResultSet resSet;

	public DBConnection() throws SQLException {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			connection = (Connection) ConnectionFactory.getConnection(DBType.MYSQLDB);
			statement = connection.createStatement();
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (resSet != null) {
				resSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}

		}

	}

}