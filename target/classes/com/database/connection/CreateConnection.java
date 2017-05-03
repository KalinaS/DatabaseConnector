package com.database.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.*;

public interface CreateConnection {

	public Connection getConnection() throws SQLException, IOException;
	public Statement getStatement() throws SQLException, IOException;


}
