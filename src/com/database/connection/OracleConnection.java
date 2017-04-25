package com.database.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.database.util.PropertyUtil;

public class OracleConnection implements CreateConnection{

	private String url;
	private String user;
	private String password;
	
	OracleConnection() throws IOException{
		this.url = PropertyUtil.getValue("oracleUrl");
		this.user = PropertyUtil.getValue("oracleUser");
		this.password = PropertyUtil.getValue("oraclePass");
	}
	
	public Connection getConnection() throws SQLException, IOException {
		
		return DriverManager.getConnection(url, user, password);
	}

}
