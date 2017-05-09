package com.database.connection;

import java.io.IOException;
import java.sql.SQLException;

public class ConnectionFactory{


	public static CreateConnection getConnection(DBType dbType) throws SQLException, IOException {

		switch (dbType) {

		case ORADB:
			
			return new OracleConnection();
		
		case MYSQLDB:
			
			return new MysqlConnection();

		default:
			return null;
		}

	}


}
