package com.database.crud;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.database.connection.DBType;

public class InsertOperatonTest {

	
	@Test
	public void callInsertOpearation()  throws SQLException, IOException {
		
	    Operation insrtOperation = null;
		try {
			insrtOperation = OperationFactory.create(OperationType.INSERT, DBType.MYSQLDB);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			Assert.fail();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			Assert.fail();
		}
	    Assert.assertNotNull(insrtOperation);
		
	    Map<Integer, Object> parameters = new HashMap<Integer, Object>();
	    parameters.put(1, 6);
		parameters.put(2, "file");
		parameters.put(3, "file/file");
		parameters.put(4, "ppt");
		
	    Assert.assertTrue(insrtOperation.doOperation(SqlQuery.INSERT, parameters));
	   
	}
}
