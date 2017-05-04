package com.database.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.database.crud.InsertOperation;
import com.database.crud.MapValue;
import com.database.crud.Operation;
import com.database.crud.ReadOperation;
import com.database.crud.SqlQuery;

public class OperationTest implements SqlQuery{
	
	Map<String, Object> parameters;

	@Before
	public void beforeTest() throws SQLException {
		parameters = new HashMap();
		parameters.put(":name", "task");
		parameters.put(":parentId", 0);
		parameters.put(":path", "C:/Users/k.stoyanova/Desktop");
		parameters.put(":extension", null);
 	}
	
	@Test
	public void testIsParameterEmpty(){

		assertTrue(MapValue.isParametersEmpty());
	}
	
	@Test
	public void testDoOperation() throws SQLException, IOException{
		
		Operation.doOperation(INSERT, parameters);
		
	}
	
	@Test
	public void testInsertOperation() throws SQLException, IOException{
		
		InsertOperation.executeInsert();
	}
	
	@Test
	public void testReadOperation() throws SQLException{
		
		ReadOperation.doOperation(SELECT_BY_FILEID, parameters);
	}

}
