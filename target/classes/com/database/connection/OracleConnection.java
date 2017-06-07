package com.database.connection;

import java.io.IOException;

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
