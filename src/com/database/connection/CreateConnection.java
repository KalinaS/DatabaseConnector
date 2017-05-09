package com.database.connection;

import java.io.IOException;
import java.sql.*;

public abstract class CreateConnection {

	
	protected String url;
	
	protected String user;
	
	protected String password;
	
	protected abstract void init() throws IOException;
	
	public CreateConnection() {
		try {
			init();
		} catch (IOException e) {
			//FIXME 
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException, IOException {

		return DriverManager.getConnection(url, user, password);
	}

}
