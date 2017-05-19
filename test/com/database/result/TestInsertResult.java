package com.database.result;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.database.connection.DBType;
import com.database.crud.InsertOperation;
import com.database.crud.OperationType;
import com.database.crud.SqlQuery;

import junit.framework.Assert;

public class TestInsertResult {

	InsertOperation io;	
	InsertResult result;
	Map<Integer, Object> parameters = new HashMap<Integer, Object>();
	
//	@Before
//	public void beforeTest() throws ClassNotFoundException, SQLException, IOException{
//		
//		
//		io = new InsertOperation(OperationType.INSERT, DBType.MYSQLDB);
//		result = new InsertResult();
//		io.doOperation(SqlQuery.INSERT, parameters);
//		result = io.executeStatement(SqlQuery.INSERT, parameters);
//	}
	
	Calendar calendar = Calendar.getInstance();
	java.sql.Date date = new java.sql.Date(calendar.getTime().getTime());
	@Before
	public void beforeTests() throws ClassNotFoundException, SQLException, IOException {
		io = new InsertOperation(OperationType.INSERT, DBType.MYSQLDB);
	    parameters.put(1, 6);
		parameters.put(2, "file");
		parameters.put(3, "file/file");
		parameters.put(4, "ppt");
		parameters.put(5, date);
		
		result = new InsertResult();
		io = new InsertOperation(OperationType.INSERT, DBType.MYSQLDB);
	}
	
	@Test
	public void testIOObject() {
		assertNotNull(io);
	}
	
	@Test
	public void testDoOperation() throws ClassNotFoundException{
		
		result = (InsertResult) io.doOperation(SqlQuery.INSERT, parameters);
		
		assertNotNull(result);
	}
	
	@Test
	public void testExecuteStatement() throws SQLException, ClassNotFoundException, IOException{
		
		result = io.executeStatement(SqlQuery.INSERT, parameters);
		assertNotNull(result);
		
	}

	@Test
	public void testNumOperations() throws SQLException, ClassNotFoundException, IOException{
		
		int numOperations = 1;
		result = (InsertResult) io.doOperation(SqlQuery.INSERT, parameters);
		
		assertEquals(numOperations, result.getNumInsertOperations());
		
	}
	
	@Test
	public void testMessage() throws ClassNotFoundException{
		
		String msg = "Success";
		result = (InsertResult) io.doOperation(SqlQuery.INSERT, parameters);
		
		assertEquals(msg, result.getMessage());
	}
	
}
