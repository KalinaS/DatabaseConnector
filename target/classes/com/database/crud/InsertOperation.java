package com.database.crud;

import java.io.IOException;
import java.sql.*;
import java.util.Map;

public class InsertOperation extends Operation implements SqlQuery{
	
	protected InsertOperation() throws ClassNotFoundException, SQLException, IOException{
		
	}

	public static  void executeInsert() throws SQLException, IOException{

			doOperation(INSERT, MapValue.parameters);

	}
	
}
