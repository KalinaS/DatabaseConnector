package com.database.connection;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Test;

public class ConnectionTest {

	@Test
	public void createConnectionTest() throws IOException, SQLException{
		
		CreateConnection create = ConnectionFactory.getConnection(DBType.MYSQLDB);
		assertNotNull(create);
		
	}
}
