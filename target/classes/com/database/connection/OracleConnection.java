package com.database.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.database.util.PropertyUtil;

public class OracleConnection extends CreateConnection {


	@Override
	public void init() throws IOException  {
		
		url = PropertyUtil.getValue("oracleUrl");
		user = PropertyUtil.getValue("oracleUser");
        password = PropertyUtil.getValue("oraclePass");
	}
	
	public OracleConnection(){
		super();
	}

}
