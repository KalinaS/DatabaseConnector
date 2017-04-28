package com.database.resources;

import java.sql.SQLException;

import org.junit.Test;

import com.database.crud.MapValue;
import com.database.crud.Operation;
import com.database.crud.SqlQuery;

public class OperationTest implements SqlQuery{

	@Test
	public void testDoOperation() throws SQLException{
		
		
		assertNotNull(Operation.doOperation(INSERT, MapValue.parameters));
	}

	
}
