package com.database.crud;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.database.connection.DBType;

public class SelectOperationTest {

	@Test
	public void SelectOperationTest() throws SQLException{
		
		Operation selectOperation = null;
		try {
			selectOperation = OperationFactory.create(OperationType.SELECT, DBType.MYSQLDB);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			Assert.fail();

		} catch (IOException e) {

			e.printStackTrace();
			Assert.fail();
		}
		Assert.assertNotNull(selectOperation);

		Map<Integer, Object> parameters = new HashMap<Integer, Object>();
		parameters.put(1, "file");

		Assert.assertTrue(selectOperation.doOperation(SqlQuery.SELECT, parameters));
		
	}
	
}
