package com.database.connection;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.database.crud.InsertOperation;
import com.database.crud.Operation;
import com.database.crud.OperationType;

public class TestConnection {

	@Test
	public void createConnectionTest() throws IOException, SQLException{
		
		CreateConnection create = ConnectionFactory.getConnection(DBType.MYSQLDB);
		assertNotNull(create);
		
	}
}
