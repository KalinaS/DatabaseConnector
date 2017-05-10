package com.database.crud;

import java.io.IOException;
import java.sql.*;
import java.util.Map;

import com.database.connection.DBType;

public class InsertOperation extends Operation implements SqlQuery {

	public InsertOperation(OperationType operation, DBType dbType) throws ClassNotFoundException, SQLException, IOException {
		super(dbType);
	}

	// public static void executeInsert() throws SQLException, IOException{
	//
	// doOperation(INSERT, MapValue.parameters);
	//
	// }

	@Override
	public void executeStatement(String sql, Map<String, Object> parameters) {

		PreparedStatement ps = null;

		for (Map.Entry<String, Object> p : parameters.entrySet()) {

			sql = sql.replaceAll(p.getKey(), p.getValue().toString());

		}
		try {
			ps = connection.prepareStatement(INSERT);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
