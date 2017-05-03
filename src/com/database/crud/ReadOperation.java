package com.database.crud;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

public class ReadOperation extends Operation implements SqlQuery{
	
	protected ReadOperation() throws ClassNotFoundException, SQLException, IOException{
	
	}

	public void executeSelect() throws SQLException, IOException{
		
		MapValue.selectByName();
		doOperation(SELECT_BY_FILEID, MapValue.parameters);
	}
	
}