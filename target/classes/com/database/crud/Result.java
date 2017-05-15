package com.database.crud;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.database.connection.DBType;

public abstract class Result extends Operation{

	public Result(DBType dbType) throws SQLException, IOException, ClassNotFoundException {
		super(dbType);
		// TODO Auto-generated constructor stub
	}
	protected boolean flag;
	protected List<Object> result;
	protected String message;
	
	
}