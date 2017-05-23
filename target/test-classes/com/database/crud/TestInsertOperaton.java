package com.database.crud;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.database.connection.DBType;

public class TestInsertOperaton {

	
	@Test
	public void callInsertOpearation()  throws SQLException, IOException, ClassNotFoundException {
		
		Calendar calendar = Calendar.getInstance();
		java.sql.Date date = new java.sql.Date(calendar.getTime().getTime());
		
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
	    parameters.put(1, "File");
		parameters.put(2, "pdf");
		parameters.put(3, date);
		parameters.put(4, "file/file");
		
	    Assert.assertNotNull(insrtOperation.doOperation(SqlQuery.INSERT, parameters));
	   
	}
}
