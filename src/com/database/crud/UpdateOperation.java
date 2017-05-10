package com.database.crud;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.DBType;
import com.database.crud.MapValue;

public class UpdateOperation extends Operation implements SqlQuery{

	public UpdateOperation(OperationType operation, DBType dbtype) throws SQLException, IOException, ClassNotFoundException {
		super(dbtype);
	}

	@Override
	protected boolean executeStatement(String sql, Map<Integer, Object> parameters) throws SQLException {

		PreparedStatement ps  = connection.prepareStatement(SqlQuery.UPDATE_NAME);
			
		for (Map.Entry<Integer, Object> p : parameters.entrySet()) {
				
				ps.setObject(p.getKey(), p.getValue());
		}
		return ps.executeUpdate() == 1;
	}
}
