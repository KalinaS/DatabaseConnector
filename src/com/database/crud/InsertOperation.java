package com.database.crud;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.DBType;
import com.database.result.InsertResult;

public class InsertOperation extends Operation implements SqlQuery {
	
	
	public InsertOperation(OperationType operation, DBType dbType) throws ClassNotFoundException, SQLException, IOException {
		super(dbType);
		
	}
	
	/**
	 * @param sql sql query to be executed
	 * @param parameters the values which have to be inserted
	 * @return return the result of execution - number of operations and message
	 */
	@Override
	public InsertResult executeStatement(String sql, Map<Integer, Object> parameters) throws SQLException, ClassNotFoundException, IOException {

		PreparedStatement ps  = connection.prepareStatement(sql);
		InsertResult result = new InsertResult();
			
		for (Map.Entry<Integer, Object> p : parameters.entrySet()) {
				
				ps.setObject(p.getKey(), p.getValue());
		}
		//return ps.executeUpdate() == 1;
		
		int numOperation = ps.executeUpdate();
		
		result.setNumInsertOperations(numOperation);
		result.setFlag(numOperation == 1);
		if (numOperation == 1) {
			result.setMessage("Success");
		} else { 
			result.setMessage("Failed");
		}
		
		return result;
	}
	
	
}