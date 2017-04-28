package com.database.crud;

import java.sql.SQLException;
import java.util.Map;

public class ReadOperation extends Operation implements SqlQuery{

	public void executeSelectByName() throws SQLException{
		
		MapValue.selectByName();
		doOperation(SELECT_BY_FILEID, MapValue.parameters);
	}
	
	public void executeSelectByFileId() throws SQLException{
		
		MapValue.selectByFileId();
		doOperation(SELECT_BY_FILEID, MapValue.parameters);
		
	}
}
