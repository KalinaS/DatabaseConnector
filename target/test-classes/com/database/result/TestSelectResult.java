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
import com.database.crud.SelectOperation;
import com.database.crud.SqlQuery;

public class TestSelectResult {
	
	SelectOperation so;
	SelectResult result;
	Map<Integer, Object> parameters = new HashMap<Integer, Object>();

	@Before
	public void beforeTest() throws ClassNotFoundException, SQLException, IOException{
		
		so = new SelectOperation(OperationType.SELECT, DBType.MYSQLDB);
		result = new SelectResult();
		
		parameters.put(1, "kalina");
		
	}
	
	@Test
	public void testSOObject(){
		
		assertNotNull(so);
	}
	
	@Test
	public void testDoOperation() throws ClassNotFoundException{
		
		result = (SelectResult) so.doOperation(SqlQuery.SELECT_BY_NAME, parameters);
		
		assertNotNull(result);
		
	}
	
	@Test
	public void testContent() throws ClassNotFoundException{
		
		result = (SelectResult) so.doOperation(SqlQuery.SELECT_BY_NAME, parameters);
		
		Object content = result.getContent();
		
		assertNotNull(content);
	}
	
}
