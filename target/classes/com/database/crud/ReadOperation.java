package com.database.crud;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.DBType;

public class ReadOperation extends Operation implements SqlQuery {

	public ReadOperation(OperationType operation, DBType dbtype)
			throws ClassNotFoundException, SQLException, IOException {
		super(dbtype);
	}

	@Override
	protected boolean executeStatement(String sql, Map<Integer, Object> parameters) throws SQLException {

		PreparedStatement ps  = connection.prepareStatement(SqlQuery.SELECT_BY_FILEID);
			
		for (Map.Entry<Integer, Object> p : parameters.entrySet()) {
				
				ps.setObject(p.getKey(), p.getValue());
		}
		return ps.executeUpdate() == 1;
	}

}