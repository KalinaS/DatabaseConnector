package com.database.crud;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.DBType;
import com.database.crud.MapValue;
import com.database.result.UpdateResult;

public class UpdateOperation extends Operation implements SqlQuery{

	public UpdateOperation(OperationType operation, DBType dbtype) throws SQLException, IOException, ClassNotFoundException {
		super(dbtype);
	}

	@Override
	protected UpdateResult executeStatement(String sql, Map<Integer, Object> parameters) throws SQLException, ClassNotFoundException, IOException {

		UpdateResult result = new UpdateResult();
		
		PreparedStatement ps  = connection.prepareStatement(SqlQuery.UPDATE);
			
		for (Map.Entry<Integer, Object> p : parameters.entrySet()) {
				
				ps.setObject(p.getKey(), p.getValue());
		}
		
		result.setNumberUpdates(ps.executeUpdate());
		result.setFlag(ps.executeUpdate() == 1);
		
		if(ps.executeUpdate() == 1){
			result.setMessage("Success");
		} else {
			result.setMessage("Failed");
		}
		
		return result;
	}
}