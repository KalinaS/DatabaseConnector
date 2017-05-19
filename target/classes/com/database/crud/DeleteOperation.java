package com.database.crud;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.DBType;
import com.database.result.DeleteResult;
import com.database.result.Result;

public class DeleteOperation extends Operation{

	public DeleteOperation(DBType dbType) throws SQLException, IOException, ClassNotFoundException {
		super(dbType);
	}

	@Override
	protected DeleteResult executeStatement(String sql, Map<Integer, Object> parameters) throws SQLException, ClassNotFoundException, IOException {
		
		
		
		return null;
	}

}
