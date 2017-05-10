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

	
//	@Before
//	public void beforeTest() throws SQLException {
//
//		try {
//
//			Class.forName("com.mysql.jdbc.Driver");
//
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/file_management", "root", "database");
//			stmt = conn.createStatement();
//
//		} catch (ClassNotFoundException cnf) {
//			log.error(cnf.getMessage());
//		} finally {
//
//		}
//
//	}
	
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
		
	    Map<String, Object> parameters = new HashMap<String, Object>();
	    parameters.put("parentId", 6);
		parameters.put("name", "file");
		parameters.put("directory", "file/file");
		parameters.put("extension", "ppt");
		parameters.put("addingDate", "curvalue()");
		
	    insrtOperation.doOperation(SqlQuery.INSERT, parameters);
	   
	}
}
