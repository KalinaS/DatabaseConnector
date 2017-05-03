package com.database.crud;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import com.database.crud.MapValue;

public class UpdateOperation extends Operation implements SqlQuery{

	public UpdateOperation() throws SQLException, IOException, ClassNotFoundException {
		super();
	}

	public void executeUpdate() throws SQLException{
		doOperation(UPDATE_NAME, MapValue.parameters);
	}
}
