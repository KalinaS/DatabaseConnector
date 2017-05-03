package com.database.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.database.util.PropertyUtil;

public class OracleConnection implements CreateConnection {

	private static Statement statement;
	private static DBConnection dbc = new DBConnection();

	private String url;
	private String user;
	private String password;

	OracleConnection(){

		try {
			dbc.connection = DriverManager.getConnection(url, user, password);

			statement = dbc.getConnection().createStatement();

			this.url = PropertyUtil.getValue("oracleUrl");
			this.user = PropertyUtil.getValue("oracleUser");
			this.password = PropertyUtil.getValue("oraclePass");
		} catch (SQLException sqle) {

			sqle.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	public Connection getConnection() throws SQLException, IOException {

		return DriverManager.getConnection(url, user, password);
	}
	
	public Statement getStatement() throws SQLException, IOException {

		return statement;
	}

}
