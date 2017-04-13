package com.database.resources;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtilities {


	public static Connection getConnection(DBType dbType) throws SQLException, IOException {

		switch (dbType) {

		case ORADB:
			
			return DriverManager.getConnection(PropertyUtil.getValue("oracleUrl"), PropertyUtil.getValue("oracleUser"), PropertyUtil.getValue("oraclePass"));
		
		case MYSQLDB:
			
			return DriverManager.getConnection(PropertyUtil.getValue("mysqlUrl"), PropertyUtil.getValue("mysqlUser"), PropertyUtil.getValue("mysqlPass"));

		default:
			return null;
		}

	}

}
