package com.database.crud;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.DBType;

public class InsertResult extends Result{

	InsertOperation io = new InsertOperation(null, dbType);
	
	public InsertResult(DBType dbType) throws SQLException, IOException, ClassNotFoundException {
		super(dbType);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean executeStatement(String sql, Map<Integer, Object> parameters) throws SQLException {
		
		io.executeStatement(sql, parameters);
		
		return false;
	}
	
}
