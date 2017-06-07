package com.database.crud;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.DBType;
import com.database.result.DeleteResult;

public class DeleteOperation extends Operation{

	public DeleteOperation(DBType dbType) throws SQLException, IOException, ClassNotFoundException {
		super(dbType);
	}

	@Override
	protected DeleteResult executeStatement(String sql, Map<Integer, Object> parameters) throws SQLException, ClassNotFoundException, IOException {
		
		PreparedStatement ps  = connection.prepareStatement(SqlQuery.DELETE_ITEM);
		
		DeleteResult result = new DeleteResult();
		
		for (Map.Entry<Integer, Object> p : parameters.entrySet()) {
			
			ps.setObject(p.getKey(), p.getValue());
	}
		int numOperation = ps.executeUpdate();
		
		result.setDeleteOperations(numOperation);
		result.setFlag(numOperation == 1);
		if (numOperation == 1) {
			result.setMessage("Success");
		} else { 
			result.setMessage("Failed");
		}
		
		return result;
	}
	
	

}
