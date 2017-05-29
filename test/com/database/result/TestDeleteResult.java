package com.database.result;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.database.connection.DBType;
import com.database.crud.DeleteOperation;
import com.database.crud.SqlQuery;

public class TestDeleteResult {
	
	DeleteOperation delete;
	DeleteResult result;
	Map<Integer, Object> parameters = new HashMap<Integer, Object>();
	
	
	@Before
	public void beforeTest() throws SQLException, IOException, ClassNotFoundException{
		
		delete = new DeleteOperation(DBType.MYSQLDB);
		result = new DeleteResult();
		
		parameters.put(1, "new file");
		
	}
	
	@Test
	public void testDeleteObjects(){
		
		assertNotNull(delete);
		
	}
	
	@Test
	public void testDeleteResultObject(){
		
		assertNotNull(result);
	}
	
	@Test
	public void testDoOperation() throws ClassNotFoundException{
		
		result = (DeleteResult) delete.doOperation(SqlQuery.DELETE_ITEM, parameters);
		assertNotNull(result);
		
	}
	
}
