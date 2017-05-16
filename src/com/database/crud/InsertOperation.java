package com.database.crud;

import java.io.IOException;
import java.sql.*;
import java.util.Map;

import com.database.connection.DBType;
import com.database.result.InsertResult;

public class InsertOperation extends Operation implements SqlQuery {
	
	public InsertOperation(OperationType operation, DBType dbType) throws ClassNotFoundException, SQLException, IOException {
		super(dbType);
	}
	

	@Override
	public InsertResult executeStatement(String sql, Map<Integer, Object> parameters) throws SQLException, ClassNotFoundException, IOException {

		PreparedStatement ps  = connection.prepareStatement(SqlQuery.INSERT);
		InsertResult result = new InsertResult();
			
		for (Map.Entry<Integer, Object> p : parameters.entrySet()) {
				
				ps.setObject(p.getKey(), p.getValue());
		}
		//return ps.executeUpdate() == 1;
		
		result.setNumInsertOperations(ps.executeUpdate());
		result.setFlag(ps.executeUpdate() == 1);
		if (ps.executeUpdate() == 1) {
			result.setMessage("Success");
		} else { 
			result.setMessage("Failed");
		}
		
		return result;
	}
	
}