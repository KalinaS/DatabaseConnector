package com.database.result;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.database.connection.DBType;
import com.database.crud.InsertOperation;
import com.database.crud.OperationType;
import com.database.crud.SqlQuery;

public class InsertResultTest {

	InsertOperation io;	
	Map<Integer, Object> parameters = new HashMap<Integer, Object>();
	
	@Before
	public void beforeTest() throws ClassNotFoundException, SQLException, IOException{
		
		io = new InsertOperation(OperationType.INSERT, DBType.MYSQLDB);
	    parameters.put(1, 6);
		parameters.put(2, "file");
		parameters.put(3, "file/file");
		parameters.put(4, "ppt");
	}
	
	@Test
	public void testInsertResult() throws SQLException, ClassNotFoundException, IOException{
		
		assertNotNull(io.executeStatement(SqlQuery.INSERT, parameters));
		
	}
	
}
