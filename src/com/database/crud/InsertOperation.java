package com.database.crud;

import java.io.IOException;
import java.sql.*;
import java.util.Map;

import com.database.connection.DBType;

public class InsertOperation extends Operation implements SqlQuery {

	public InsertOperation(OperationType operation, DBType dbType) throws ClassNotFoundException, SQLException, IOException {
		super(dbType);
	}

	@Override
	protected boolean executeStatement(String sql, Map<Integer, Object> parameters) throws SQLException {

		PreparedStatement ps  = connection.prepareStatement(SqlQuery.INSERT);
			
		for (Map.Entry<Integer, Object> p : parameters.entrySet()) {
				
				ps.setObject(p.getKey(), p.getValue());
		}
		return ps.executeUpdate() == 1;
	}
}