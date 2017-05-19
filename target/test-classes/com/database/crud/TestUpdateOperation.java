package com.database.crud;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.database.connection.DBType;

public class TestUpdateOperation {

	@Test
	public void callUpdatePperation() throws SQLException, ClassNotFoundException {

		Operation updateOperation = null;
		try {
			updateOperation = OperationFactory.create(OperationType.UPDATE, DBType.MYSQLDB);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			Assert.fail();

		} catch (IOException e) {

			e.printStackTrace();
			Assert.fail();
		}
		Assert.assertNotNull(updateOperation);

		Map<Integer, Object> parameters = new HashMap<Integer, Object>();
		parameters.put(1, "file");
		parameters.put(2, 7);

		Assert.assertNotNull(updateOperation.doOperation(SqlQuery.UPDATE, parameters));
	}
}