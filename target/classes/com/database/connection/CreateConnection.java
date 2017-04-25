package com.database.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface CreateConnection {

	public Connection getConnection() throws SQLException, IOException;


}
