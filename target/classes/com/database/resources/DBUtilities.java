package com.database.resources;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtilities {

	private static String url;
	private static String user;
	private static String pass;


	static Properties prop = null;
	static InputStream input = null;

	public static Connection getConnection(DBType dbType) throws SQLException {

		switch (dbType) {

		case ORADB:
			
			try {
				input = new FileInputStream("settings.properties");
				prop.load(input);

				url = prop.getProperty("oracleUrl");
				user = prop.getProperty("oracleUser");
				pass = prop.getProperty("oraclePass");
				
				return DriverManager.getConnection(url, user, pass);

			} catch (Exception ex) {
				ex.getMessage();
			}

		case MYSQLDB:

			try {
				input = new FileInputStream("settings.properties");
				prop.load(input);

				url = prop.getProperty("mysqlUrl");
				user = prop.getProperty("mysqlUser");
				pass = prop.getProperty("mysqlPass");
				
				return DriverManager.getConnection(url, user, pass);

			} catch (Exception ex) {
				ex.getMessage();
			}

		default:
			return null;
		}

	}

}
