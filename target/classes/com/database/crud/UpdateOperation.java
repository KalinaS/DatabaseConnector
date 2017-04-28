package com.database.crud;

import java.sql.SQLException;
import java.util.Map;

public class UpdateOperation extends Operation implements SqlQuery{

	public void executeUpdate(){
		doOperation(UPDATE_NAME, parameters);
	}
}
