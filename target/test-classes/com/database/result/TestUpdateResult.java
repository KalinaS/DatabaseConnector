package com.database.result;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.database.connection.DBType;
import com.database.crud.OperationType;
import com.database.crud.SqlQuery;
import com.database.crud.UpdateOperation;

public class TestUpdateResult {

	UpdateResult result;
	UpdateOperation uo;
	Map<Integer, Object> parameters = new HashMap<Integer, Object>();
	
	@Before
	public void beforeTest() throws SQLException, IOException, ClassNotFoundException{
		
		uo = new UpdateOperation(OperationType.UPDATE, DBType.MYSQLDB);
		result = new UpdateResult();
		
		parameters.put(1, "new file");
		parameters.put(2, "10");
	}
	
	@Test
	public void testUOObject(){
		
		assertNotNull(uo);
		
	}
	
	@Test
	public void testResultObject(){
		
		assertNotNull(result);
	}
	
	@Test
	public void testDoOperation() throws ClassNotFoundException{
		
		result = (UpdateResult) uo.doOperation(SqlQuery.UPDATE, parameters);
		
		assertNotNull(result);
	}
	
/*	@Test
	public void testExecuteStatement() throws SQLException, ClassNotFoundException, IOException{
		
		result = uo.executeStatement(SqlQuery.UPDATE, parameters);
		assertNotNull(result);
	}*/
	

	@Test
	public void testNumOperations() throws ClassNotFoundException{
		
		int numOperations = 1;
		
		result = (UpdateResult) uo.doOperation(SqlQuery.UPDATE, parameters);
		assertEquals(numOperations, result.getNumberUpdates());
		
	}
	
	@Test
	public void testMessage() throws ClassNotFoundException{
		
		String msg = "Success";
		
		result = (UpdateResult) uo.doOperation(SqlQuery.UPDATE, parameters);
		assertEquals(msg, result.getMessage());
	}
}
