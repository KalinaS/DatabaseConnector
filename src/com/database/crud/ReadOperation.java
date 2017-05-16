package com.database.crud;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.DBType;

public class ReadOperation extends Operation implements SqlQuery {

	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public ReadOperation(OperationType operation, DBType dbtype)
			throws ClassNotFoundException, SQLException, IOException {
		super(dbtype);
	}

	@Override
	protected SelectResult executeStatement(String sql, Map<Integer, Object> parameters) throws SQLException {

		ps = connection.prepareStatement(SqlQuery.SELECT);

		for (Map.Entry<Integer, Object> p : parameters.entrySet()) {

			ps.setObject(p.getKey(), p.getValue());
		}

		rs = ps.executeQuery();
		/*
		 * while (rs.next()){ String name = rs.getString("name");
		 * 
		 * System.out.println(name);
		 * 
		 * }
		 */

	}
}