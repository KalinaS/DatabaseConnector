package com.database.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.database.util.PropertyUtil;

public class MysqlConnection extends CreateConnection {

	@Override
	protected void init() throws IOException  {
		url = PropertyUtil.getValue("mysqlUrl");
		user = PropertyUtil.getValue("mysqlUser");
		password = PropertyUtil.getValue("mysqlPass");
	}

	public MysqlConnection() {
		
		super();
	}

}	
