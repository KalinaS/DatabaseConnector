package com.database.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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