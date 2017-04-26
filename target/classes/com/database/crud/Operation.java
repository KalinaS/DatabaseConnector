package com.database.crud;

import java.sql.*;
import java.util.Map;

public abstract class Operation {

	protected Connection connect;
	protected PreparedStatement prepStmt;

	private String sql;
	private Map<String, Object> parameters;

	Operation(String sql) {
		this.sql = sql;
	}

	public void setParameters(Map<String, Object> params) {
		parameters = params;
	}

	{
		try

		{
			prepStmt = connect.prepareStatement(sql);
		} catch (SQLException e) {

			e.getMessage();

		} finally {

			if (prepStmt != null) {
				try {
					prepStmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
	}
	// public abstract void doOperation(String sql, Map<String, Object>
	// parameters) throws SQLException;
}
